package egovframework.company.web;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.basic.service.DefaultSearchVO;
import egovframework.company.service.CompanyService;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {

	private final String JSP_PATH = "company/";

	/** CompanyService */
	@Resource(name = "companyService")
	private CompanyService companyService;

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/**
	 * index 페이지 이동한다.
	 * @return "index"
	 * @exception Exception
	 */
	@GetMapping(value = "/view.do")
	public String companyView(@ModelAttribute("searchVO") DefaultSearchVO searchVO, ModelMap model) throws Exception {

		/** EgovPropertyService.sample */
		searchVO.setPageUnit(propertiesService.getInt("pageUnit"));
		searchVO.setPageSize(propertiesService.getInt("pageSize"));

		/** pageing setting */
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
		paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
		paginationInfo.setPageSize(searchVO.getPageSize());

		searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
		searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
		searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());

		List<?> companyList = companyService.selectCompanyList(searchVO);
		model.addAttribute("companyList", companyList);

		int totCnt = companyService.selectCompanyListTotCnt(searchVO);
		paginationInfo.setTotalRecordCount(totCnt);
		model.addAttribute("paginationInfo", paginationInfo);
		return JSP_PATH+"view";
	}

}//CompanyController
