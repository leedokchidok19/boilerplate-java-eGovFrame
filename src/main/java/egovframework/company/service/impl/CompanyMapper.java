package egovframework.company.service.impl;

import java.util.List;

import egovframework.basic.service.DefaultSearchVO;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;


@Mapper("companyMapper")
public interface CompanyMapper {

	List<?> selectCompanyList(DefaultSearchVO searchVO) throws Exception;

	int selectCompanyListTotCnt(DefaultSearchVO searchVO) throws Exception;

	int updateCompany(DefaultSearchVO vo) throws Exception;

	int updateContact(DefaultSearchVO vo) throws Exception;

	int deleteCompany(DefaultSearchVO vo) throws Exception;

	int deleteContact(DefaultSearchVO vo) throws Exception;
}
