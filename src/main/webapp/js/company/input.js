//입력, 메시지 element
const companyForm = document.querySelector('#companyForm');
const messageDiv = document.querySelector('#message');

function subminJson(){

	const companyName = document.querySelector('#companyName').value;
	const phoneNumber = document.querySelector('#phoneNumber').value;
	const representativeName = document.querySelector('#representativeName').value;
	const companyType = document.querySelector('#companyType').value;
	const employeeCount = document.querySelector('#employeeCount').value;
	const revenue = document.querySelector('#revenue').value;
	const faxNumber = document.querySelector('#faxNumber').value;
	const companyWebsite = document.querySelector('#companyWebsite').value;
	const history = document.querySelector('#history').value;
	const contactName = document.querySelector('#contactName').value;
	const contactNumber = document.querySelector('#contactNumber').value;

	const companyData = {
		"번호": 0,
		"회사명": companyName,
		"전화번호": phoneNumber,
		"대표명": representativeName,
		"기업구분": companyType,
		"근무자수": employeeCount,
		"매출액": revenue,
		"팩스번호": faxNumber,
		"회사 홈페이지": companyWebsite,
		"업력": history,
		"담당자":contactName,
		"담당자 번호":contactNumber,
	};
	
	fetch('/json/company/data.json')
	.then(response => response.json())
	.then(data => {
	// JSON 파일 데이터를 읽어온 후에 처리할 작업을 수행합니다.
	// 예시: 데이터를 콘솔에 출력합니다.
		const getCompanies = localStorage.getItem('companies');

		if(getCompanies !== null && getCompanies.length > 2){
			const itemCompanies = getCompanies ? JSON.parse(getCompanies) : [];

			companyData.번호 = itemCompanies.length + 1;
			
			itemCompanies.push(companyData);
			// 수정된 데이터를 로컬 스토리지에 저장
			localStorage.setItem('companies', JSON.stringify(itemCompanies));
		}else{
			companyData.번호 = data.length +1;
			data.push(companyData);
			// 수정된 데이터를 로컬 스토리지에 저장
			localStorage.setItem('companies', JSON.stringify(data));
		}

/*
return fetch('./companies.json', {
method: 'POST',
headers: {
'Content-Type': 'application/json'
},
body: JSON.stringify(data)
});
*/
	})
	.then(() => {
		//console.log('JSON 파일 수정이 완료되었습니다.');
		console.log('JSON 데이터 수정이 완료되었습니다.');
		location.href = 'view.html';
	})
	.catch(error => {
		console.error('JSON 파일을 읽거나 수정하는 동안 오류가 발생했습니다.', error);
		alert('JSON 파일을 읽거나 수정하는 동안 오류가 발생했습니다.', error);
	});

}

companyForm.addEventListener('click', subminJson);