var pageStatus = -1;
var condenseLevel = -1;
var currentPage = '';

var slideDuration = 300;

$(document).ready(function () {

    // The ready() function is also called after AJAX load() completions.
    if (pageStatus == -1) {

	currentPage = $("#currentPage").text();

	// collapse menu based on screen size and determine condenseLevel
	condenseToCorrectLevel();

	// setup hamburger menu
	$(".cross").hide();
	$(".menu").hide();
	$(".hamburger").hide();
	$(".hamburger").click(function () {
	    $(".hamburger").velocity("fadeOut", {duration: slideDuration});
	    $(".cross").velocity("fadeIn", {duration: slideDuration});
	    $(".menu").velocity("slideDown", {duration: slideDuration});
	});
	$(".cross").click(function () {
	    $(".cross").velocity("fadeOut", {duration: slideDuration});
	    $(".hamburger").velocity("fadeIn", {duration: slideDuration});
	    $(".menu").velocity("slideUp", {duration: slideDuration});
	});

	// AJAX load the rest of the screen content
	setTimeout(function () {
	    if (currentPage == "home") {
		loadArtContainer(false);
	    } else if (currentPage == "bio") {
		loadBioContainer(false);
	    } else if (currentPage == "tutorials") {
		loadTutorialsContainer(false);
	    } else if (currentPage.startsWith("tutorials/")) {
		var slashIndex = currentPage.indexOf('/');
		var tutorialId = currentPage.substring(slashIndex + 1);
		loadIndividualTutorialContainer(tutorialId, false);
	    } else if (currentPage == "shoutouts") {
		loadShoutoutsContainer(false);
	    } else if (currentPage == "contact") {
		loadContactContainer(false);
	    }

	    pageStatus = 1;

	}, 400);

	// Enable gradient change on main header text
	$('#mainHeaderText').hover(
		function () {
		    var highlightWidth = ($(document).width() < 500) ? 250 : 400;
		    var currentScreenWidth = $(document).width();
		    var percentage = ' ' + (highlightWidth * 100 / currentScreenWidth) + '% ';
		    var style = 'linear-gradient(45deg, #2FB576' + percentage + ', #BEC4C0' + percentage + ', #CFD2D3 100%)';
		    $(this).parent().css('background', style);
		},
		function () {
		    $(this).parent().css('background', 'linear-gradient(90deg, #B5BCB8, #CFD2D3)');
		}
	);

	//DOM loaded
	pageStatus = 0;
    }
});

$(window).resize(function () {

    condenseToCorrectLevel();
});


$(window).on('popstate', function () {

    var previousUrl = window.location.pathname;
    if (previousUrl.startsWith("/")) {
	previousUrl = previousUrl.substring(1, previousUrl.length);
    }

    if (previousUrl == "") {
	loadArtContainer(false);
    } else if (previousUrl == "Bio") {
	loadBioContainer(false);
    } else if (previousUrl == "Tutorials") {
	loadTutorialsContainer(false);
    } else if (previousUrl.startsWith("Tutorials/")) {
	var slashIndex = previousUrl.indexOf('/');
	var tutorialId = previousUrl.substring(slashIndex + 1);
	loadIndividualTutorialContainer(tutorialId, false);
    }
});

function addLazy() {

    $(".lazy").lazy({
	placeholder: "../../images/loading.gif",
	effect: "fadeIn",
	effectTime: 500,
	threshold: 400,
	beforeLoad: function (element) {
//	    var imageSrc = element.data('src');
//	    console.log('image "' + imageSrc + '" is about to be loaded');
	},
	afterLoad: function (element) {

	    if ($(element).hasClass("artworkObjectImage")) {

		// for artwork images, add shadow
		$(element).addClass("imageShadow");
	    }
	},
	onError: function (element) {
	    var imageSrc = element.data('src');
	    console.log('image "' + imageSrc + '" could not be loaded');
	},
	onFinishedAll: function () {
//	    console.log('finished loading all images');
	}
    });

}

function addPrettyCode() {

    prettyPrint();

    var stylesheet_light = document.getElementById("codeStyle_light");
    var stylesheet_dark = document.getElementById("codeStyle_dark");
    stylesheet_dark.disabled = false;
    stylesheet_light.disabled = true;
}

// instead of Media Queries, use JS to handle complex resize animations
function determineCondenseLevel() {

    if ($(window).width() >= 768) {
	return 0;
    } else if ($(window).width() < 768 && $(window).width() > 500) {
	return 1;
    } else if ($(window).width() <= 500) {
	return 2;
    }
}
function condenseToCorrectLevel() {

    if (determineCondenseLevel() == 0 && condenseLevel != 0) {

	if (condenseLevel == -1) {
	    $("#mainHeader").velocity({top: "0px"}, 300);
	}

	$("#cornerTriangle").velocity({top: "0px", left: "0px"}, 300);
	$("#headerBarButtonContainer").fadeIn(300);
	$(".cross").fadeOut();
	$(".hamburger").fadeOut();
	$(".menu").slideUp();
	condenseLevel = 0;

    } else if (determineCondenseLevel() == 1 && condenseLevel != 1) {

	if (condenseLevel == -1) {
	    $("#mainHeader").velocity({top: "0px"}, 300);
	    $("#headerBarButtonContainer").fadeOut(300);
	    $(".hamburger").fadeIn(300);
	} else if (condenseLevel == 0) {
	    $("#headerBarButtonContainer").fadeOut(300);
	    $(".hamburger").fadeIn(300);
	}
	$("#cornerTriangle").velocity({top: "0px", left: "0px"}, 300);
	$("#mainHeader").velocity({height: "80px"}, 300);
	$("#mainHeaderText").velocity({fontSize: "50px", marginTop: "0px", paddingLeft: '80px'}, 300);
	$(".hamburger").velocity({fontSize: "30px", top: "0px"}, 300);
	$(".cross").velocity({fontSize: "100px", top: "0px"}, 300);
	$(".menu").velocity({left: "80px", top: "80px"}, 300);
	$(".collapsedMenuButton img").velocity({width: "60px"}, 300);

	condenseLevel = 1;

    } else if (determineCondenseLevel() == 2 && condenseLevel != 2) {

	if (condenseLevel == -1) {
	    $("#mainHeader").animate({top: "0px", height: "40px"}, 300);
	    $("#headerBarButtonContainer").fadeOut(0);
	    $(".hamburger").fadeIn(0);
	} else if (condenseLevel == 0) {
	    $("#headerBarButtonContainer").fadeOut(300);
	    $(".hamburger").fadeIn(300);
	}

	$("#cornerTriangle").velocity({top: "-40px", left: "-40px"}, 300);
	$("#mainHeaderText").velocity({fontSize: "30px", marginTop: "0px", paddingLeft: '45px'}, 300);
	$("#mainHeader").velocity({height: "40px"}, 300);
	$(".hamburger").velocity({fontSize: "20px", top: "-18px"}, 300);
	$(".cross").velocity({fontSize: "65px", top: "-23px"}, 300);
	$(".menu").velocity({left: "40px", top: "40px"}, 300);
	$(".collapsedMenuButton img").velocity({width: "40px"}, 300);

	condenseLevel = 2;
    }
}
