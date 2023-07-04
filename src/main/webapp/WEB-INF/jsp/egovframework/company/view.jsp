<%@ page	language="java"	contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"	%>
<%@ taglib	prefix="c"		uri="http://java.sun.com/jsp/jstl/core"							%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회사 정보</title>
	<link rel="stylesheet" href="/css/egovframework/company/style.css">
</head>
<body>

	<h1>회사 정보 조회</h1>
	<h4>
		<a id="downloadData" class="btn">회사 정보 목록 다운로드</a>
		<a href="#" id="companyClear" class="btn">목록 초기화</a>
	</h4>
	<div>
		<input type="text" id="searchInput" placeholder="회사명으로 검색">
		<button id="searchBtn">검색</button>
	</div>

	<table id="companyTable">
		<thead>
			<tr>
				<th>번호</th>
				<th>회사명</th>
				<th>전화번호</th>
				<th>대표명</th>
				<th>기업구분</th>
				<th>근무자수</th>
				<th>매출액</th>
				<th>팩스번호</th>
				<th>회사 홈페이지</th>
				<th>업력</th>
				<th>담당자</th>
				<th>담당자 번호</th>
			</tr>
		</thead>
	<tbody>
	<!-- JavaScript로 동적으로 테이블 채움 -->
	</tbody>
	</table>

	<div class="move">
		<a href="input.html" class="link">회사 정보 입력</a>
	</div>

	<script src="/js/company/view.js"></script>
<!-- 		<script src="/js/company/download.js"></script> -->
	<script type="text/javascript">
		var companyList = '${companyList}';
		displayCompanies(companyList);
	</script>
</body>
</html>