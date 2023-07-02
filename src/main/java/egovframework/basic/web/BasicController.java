package egovframework.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/basic")
public class BasicController {

	private final String JSP_PATH = "basic/";

	/**
	 * index 페이지 이동한다.
	 * @return "index"
	 * @exception Exception
	 */
	@GetMapping(value = "/view.do")
	public String basicView() throws Exception {
		return JSP_PATH+"view";
	}
}
