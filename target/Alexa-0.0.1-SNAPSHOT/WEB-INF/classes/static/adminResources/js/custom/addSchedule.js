function hideRound()
{
	
	document.getElementById('div1').style.display='none';
	document.getElementById('div2').style.display='none';
	document.getElementById('div3').style.display='none';
	
	
}
function showRound()
{
	

	document.getElementById('div1').style.display='block';
	document.getElementById('div2').style.display='block';
	document.getElementById('div3').style.display='block';
	
	
	
}

function roundTripToCity() 
{
	var OneWayToCity = document.getElementById("OneWayToCity");
	var RoundTripFromCity = document.getElementById("newCityId");
	
	var OneWayFromCity = document.getElementById("OneWayFromCity");
	var RoundTripToCity = document.getElementById("RoundTripToCity");
	
	RoundTripFromCity.value = OneWayToCity.value;
	RoundTripToCity.value = OneWayFromCity.value;
}










/*function getCity()
{
	
	var
	roundCityId = $('#cityId').val();
	var htp = new XMLHttpRequest();

	var data = '';

	var title;

	htp.onreadystatechange = function() {

		if (htp.readyState == 4) {

			var jsn = JSON.parse(htp.responseText);
			
			$('#NewCityId').val(jsn.NewCityId);
			console.log(roundCityId);
			
		}
	}

	htp.open("get", "getCity?id=" + roundCityId, true);
	htp.send();
*/
	











