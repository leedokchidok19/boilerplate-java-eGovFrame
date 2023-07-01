package egovframework.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

	private final String JSP_PATH = "basic/";

	/**
	 * 글 등록 화면을 조회한다.
	 * @param searchVO - 목록 조회조건 정보가 담긴 VO
	 * @param model
	 * @return "egovSampleRegister"
	 * @exception Exception
	 */
	@GetMapping(value = "/index.do")
	public String addSampleView() throws Exception {
		return JSP_PATH+"index";
	}
}
