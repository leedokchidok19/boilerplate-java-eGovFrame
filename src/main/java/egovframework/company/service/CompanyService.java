package egovframework.company.service;

import java.util.List;

import egovframework.basic.service.DefaultSearchVO;

public interface CompanyService {

	List<?> selectCompanyList(DefaultSearchVO searchVO) throws Exception;

	int selectSampleListTotCnt(DefaultSearchVO searchVO) throws Exception;

}
