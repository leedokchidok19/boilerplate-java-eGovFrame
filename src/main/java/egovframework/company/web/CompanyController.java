package egovframework.company.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {

	private final String JSP_PATH = "company/";

	/**
	 * index 페이지 이동한다.
	 * @return "index"
	 * @exception Exception
	 */
	@GetMapping(value = "/view.do")
	public String companyView() throws Exception {
		return JSP_PATH+"view";
	}
}
