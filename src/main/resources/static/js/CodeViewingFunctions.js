
var codeStyleLight = false;

function hideOrShowCode(codeElementId, codeHeadElementId, buttonId) {

    var codeElement = $("#"+codeElementId);    
    codeElement.slideToggle(200);
}

function collapseAllCode(){
    
    var preElements = $(".code");
    for (var loop = 0; loop < preElements.length; loop++) {
	
	$('#code'+loop).slideUp();
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
