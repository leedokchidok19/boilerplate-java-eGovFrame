package egovframework.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

	private final String JSP_PATH = "basic/";

	/**
	 * index 페이지 이동한다.
	 * @return "index"
	 * @exception Exception
	 */
	@GetMapping(value = "/index.do")
	public String indexView() throws Exception {
		return JSP_PATH+"index";
	}
}
