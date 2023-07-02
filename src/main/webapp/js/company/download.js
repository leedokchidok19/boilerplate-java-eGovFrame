
function anchorAddDownload(documentContent){
	const anchorEle = document.getElementById('downloadData');
	anchorEle.setAttribute('href', 'data:text/plain;charset=utf-8,'+encodeURIComponent(documentContent));
	anchorEle.setAttribute('download', '회사정보목록.txt');
}


function companyDataTxtDownload(){
	// 키로 부터 데이터 읽기
	const getCompanies = localStorage.getItem('companies');
	let downloadText;
	
	if(getCompanies !== null && getCompanies.length > 2){
		const itemCompanies = getCompanies ? JSON.parse(getCompanies) : [];
		downloadText = JSON.stringify(itemCompanies);
	}else{
		//초기 페이지 로드 시 실행
		fetch('/json/company/data.json')
		.then((res) => {
			let data = res.json();
			downloadText = JSON.stringify(data);
		})
	}
	
	anchorAddDownload(downloadText);

}

document.addEventListener('click', companyDataTxtDownload);