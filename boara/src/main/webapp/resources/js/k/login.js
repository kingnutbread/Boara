$(document).ready(function(){
	// 로그인처리 
		$('#lbtn').click(function(){
		var sid = $('#id').val();
		var spw = $('#pw').val();
		if(!sid){
			$('#id').focus();
			return;
		}
		if(!spw){
			$('#pw').focus();
			return;
		}
		$('#frm').attr('action', '/boa/member/loginProc.boa');
		$('#frm').submit();
	});
	

	// 홈버튼 클릭이벤트
	$('#hbtn').click(function(){
		$(location).attr('href', '/boa/main.boa');
	});
	
	// 조인 버튼 클릭 이벤트
   $('#join').click(function(){
   		$(location).attr('href', '/boa/member/join.boa');
   });
	
	
	// id/pw 찾기 버튼 이벤트
	$('#check').click(function(){
		$('#frm').attr('action', '/boa/member/idpwSearch.boa');
    	$('#frm').submit();
	});
	
	
	
	
	
	

});
		