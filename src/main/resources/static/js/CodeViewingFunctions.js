
var codeStyleLight = false;

function hideOrShowCode(codeElementId, codeHeadElementId, buttonId) {

    var codeElement = $("#"+codeElementId);
    
    codeElement.slideToggle(200);
}

function collapseAllCode(){
    
    var preElements = $(".code");
    for (var loop = 0; loop < preElements.length; loop++) {
	
	$('#code'+loop).slideUp();
//	hideOrShowCode('code'+loop, 'code'+loop+'_h', 'code'+loop+'_b0');
    }

}

function changeCodeStyle() {

    var stylesheet_light = document.getElementById("codeStyle_light");
    var stylesheet_dark = document.getElementById("codeStyle_dark");

    codeStyleLight = !codeStyleLight;

    if (codeStyleLight) {

	stylesheet_dark.disabled = true;
	stylesheet_light.disabled = false;
    } else {

	stylesheet_dark.disabled = false;
	stylesheet_light.disabled = true;
    }
}

var currentScrollCheckpoint = 0; 
var checkpoints;

function getScrollCheckpoints(){
    
    
//    if ($(".scrollCheckpoint").length > 0){
//	checkpoints= $(".scrollCheckpoint");
//    }
//    
//    for (var index = 0; index < checkpoints.length; index++){
//	console.log($(checkpoints[index]).position().top);
//    }
}

//$(document).on('scroll', function() {
//    
//    if(checkpoints != null){
//	
//	var scroll = $(window).scrollTop();
//	var sticky = $('#stickyHeader');
//
//	if (scroll >= 200) {sticky.addClass('fixed');}
//	else{ sticky.removeClass('fixed');}
//		
//	for (var index = 0; index < checkpoints.length; index++){
//	    if (scroll >= $(checkpoints[index]).position().top && currentScrollCheckpoint <= index){
//		
//		scrollCheckpointHit(index+1);
//			    }
//	    else if(scroll < $(checkpoints[index]).position().top && currentScrollCheckpoint > index){
//		
//		scrollCheckpointHit(index);
//	    }
//	}
//    }
//});
//
//function scrollCheckpointHit(newScrollCheckpoint){
//    
//    currentScrollCheckpoint = newScrollCheckpoint;
//    console.log(currentScrollCheckpoint);
//}
