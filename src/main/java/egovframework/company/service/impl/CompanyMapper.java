package egovframework.company.service.impl;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;


@Mapper("companyMapper")
public interface CompanyMapper {

	List<?> selectCompanyList(SampleDefaultVO searchVO) throws Exception;

	int selectSampleListTotCnt(SampleDefaultVO searchVO);

}
