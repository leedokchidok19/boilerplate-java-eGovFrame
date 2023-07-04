function convertToJSON(dataString) {
	const jsonData = [];

	// 데이터 문자열을 JSON 배열로 변환합니다.
	const companies = dataString.split('},');
	for (let company of companies) {
		const companyData = {};

		// 특수 문자를 제거합니다.
		company = company.replace(/[\[\]{}]/g, '');

		// 쉼표를 기준으로 데이터 문자열을 분리하여 키-값 쌍을 추출합니다.
		const pairs = company.split(',');

		// 각 쌍을 등호로 분리하여 키와 값을 추출합니다.
		for (let pair of pairs) {
			const [key, value] = pair.split('=');

			// 키와 값 양쪽에 있는 공백을 제거합니다.
			const trimmedKey = key.trim();
			const trimmedValue = value.trim();

			// JSON 데이터 객체에 키-값 쌍을 저장합니다.
			companyData[trimmedKey] = trimmedValue;
		}

		// JSON 데이터를 배열에 추가합니다.
		jsonData.push(companyData);
	}

	return jsonData;
}

function displayCompanies(dataString) {
	let data;

	if (typeof dataString === 'string') {
		data = convertToJSON(dataString);
	}

	const tableBody = document.querySelector('#companyTable tbody');
	tableBody.innerHTML = '';

	for (let i = 0; i < data.length; i++) {
		const company = data[i];
		const row = document.createElement('tr');

		Object.values(company).forEach(value => {
			const cell = document.createElement('td');
			cell.textContent = value;
			row.appendChild(cell);
		});

		tableBody.appendChild(row);
	}
}

