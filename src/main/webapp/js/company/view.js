//
function loadData(){
	// 회사 정보 데이터(JSON 형식)
	fetch('/json/company/data.json')
	.then((res) => {
		return res.json()
	})
	.then((companies) => {
	//모든 회사 정보 표시
		displayCompanies(companies);
	})
}

// 회사 정보를 테이블에 표시하는 함수
function displayCompanies(data) {

	const tableBody = document.querySelector('#companyTable tbody');
	tableBody.innerHTML = '';

	for (let i = 0; i < data.length; i++) {
		const company = data[i];
		const row = document.createElement('tr');

		Object.keys(company).forEach(key => {
			const cell = document.createElement('td');
			cell.textContent = company[key];
			row.appendChild(cell);
		});

		tableBody.appendChild(row);
	}
}

// 회사 정보 검색 함수
function searchCompanies() {

	const searchInput = document.querySelector('#searchInput');

	if(searchInput === null || searchInput === undefined) return false;

	const searchText = searchInput.value.trim().toLowerCase();
	const filteredCompanies = companies.filter(company =>
		company["회사명"].toLowerCase().includes(searchText)
	);

	displayCompanies(filteredCompanies);
}

// 키로 부터 데이터 읽기
const getCompanies = localStorage.getItem('companies');

if(getCompanies !== null && getCompanies.length > 2){
	const itemCompanies = getCompanies ? JSON.parse(getCompanies) : [];
	displayCompanies(itemCompanies);
}else{
	//초기 페이지 로드 시 실행
	loadData();
}

function companyListClear(){
	localStorage.clear();
	location.reload();
}


const searchBtn = document.querySelector('#searchBtn');
searchBtn.addEventListener('click', searchCompanies);

const companyClear = document.querySelector('#companyClear');
companyClear.addEventListener('click', companyListClear);


