<%@ page	language="java"	contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>회사 정보 입력</title>
	<link rel="stylesheet" href="/css/egovframework/company/style.css">
</head>
<body>

	<h1>회사 정보 입력</h1>

	<div class="move">
		<a href="view.html" class="link">회사 정보 조회</a>
	</div>

	<div class="form-container">

		<label for="companyName">회사명</label>
		<input type="text" id="companyName" placeholder="회사명" required>

		<label for="phoneNumber">전화번호</label>
		<input type="text" id="phoneNumber" placeholder="전화번호" required>

		<label for="representativeName">대표명</label>
		<input type="text" id="representativeName" placeholder="대표명" required>

		<label for="companyType">기업구분</label>
		<input type="text" id="companyType" placeholder="기업구분 (예: 중소기업)" required>

		<label for="employeeCount">근무자수</label>
		<input type="number" id="employeeCount" placeholder="근무자수" required>

		<label for="revenue">매출액</label>
		<input type="text" id="revenue" placeholder="매출액" required>

		<label for="faxNumber">팩스번호</label>
		<input type="text" id="faxNumber" placeholder="팩스번호" required>

		<label for="companyWebsite">회사 홈페이지</label>
		<input type="text" id="companyWebsite" placeholder="회사 홈페이지" required>

		<label for="history">업력</label>
		<input type="text" id="history" placeholder="업력" required>

		<label for="contactName">담당자</label>
		<input type="text" id="contactName" placeholder="담당자" required>

		<label for="contactNumber">담당자 번호</label>
		<input type="text" id="contactNumber" placeholder="담당자 번호" required>

		<input type="submit" id="companyForm" value="추가">
	</div>

	<div id="message"></div>

	<script src="/js/input.js"></script>
</body>
</html>