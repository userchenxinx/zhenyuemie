$(function(){
	//?б?????б???????????
	$('#products .thumb').mouseover(function(){
		$(this).css('border-color','#ED145B');
	});
	$('#products .thumb').mouseout(function(){
		$(this).css('border-color','#EBEBEB');
	});
   
	//?????????????
	$('.hidden dd.row1').click(function(){
		if($(this).parent().height()<70){
				$width=$(this).parent().find('.row8').height();
				$(this).parent().css('height',$width);
				$(this).html('<a class="showmore" href="#"> ????<i class="ui-icon ui-icon-triangle-1-n icon"></i></a>');
				
		}else{
			    $(this).parent().css('height',64);
			    $(this).html('<a class="showmore" href="#"> ???<i class="ui-icon ui-icon-triangle-1-s icon"></i></a>');
		}
		
	});

    
	
	
	
	
});