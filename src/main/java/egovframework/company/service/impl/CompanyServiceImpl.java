package egovframework.company.service.impl;

import java.util.List;

import egovframework.basic.service.DefaultSearchVO;
import egovframework.company.service.CompanyService;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("companyService")
public class CompanyServiceImpl extends EgovAbstractServiceImpl implements CompanyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CompanyServiceImpl.class);

	/**SampleMapper
	 * mybatis 사용
	 * */
	@Resource(name="companyMapper")
	private CompanyMapper companyMapper;

	/** ID Generation */
	@Resource(name = "egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;

	@Override
	public List<?> selectCompanyList(DefaultSearchVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectSampleListTotCnt(DefaultSearchVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
