function loadArtContainer(pushWindowState) {


    $("#currentPage").text("home");
    loadMainContent("/Components/Art", "/", '#mainContainer', '#artContainer', pushWindowState);
}

function loadTutorialsContainer(pushWindowState) {


    $("#currentPage").text("tutorials");
    loadMainContent("/Components/Tutorials", "/Tutorials", '#mainContainer', '#tutorialsContainer', pushWindowState);
}

function loadIndividualTutorialContainer(tutorialId, pushWindowState) {

    $("#currentPage").text("tutorial/" + tutorialId);
    loadMainContent("/Components/Tutorials/" + tutorialId, "/Tutorials/" + tutorialId, '#mainContainer', '#' + tutorialId, pushWindowState);
}

function loadBioContainer(pushWindowState) {

    $("#currentPage").text("bio");
    loadMainContent("/Components/Bio", "/Bio", '#mainContainer', '#bioContainer', pushWindowState);
}

function loadContactContainer(pushWindowState) {

    $("#currentPage").text("contact");
    loadMainContent("/Components/Contact", "/Contact", '#mainContainer', '#contactContainer', pushWindowState);
}

function loadShoutoutsContainer(pushWindowState) {

    $("#currentPage").text("shoutouts");
    loadMainContent("/Components/Shoutouts", "/Shoutouts", '#mainContainer', '#shoutoutsContainer', pushWindowState);
}

function loadMainContent(contentUrl, browserUrl, containerDivId, childDivId, pushWindowState) {

    if (condenseLevel > 0) {
	$(".cross").fadeOut();
	$(".hamburger").fadeIn();
	$(".menu").slideUp();
    }

    if ($(containerDivId).find(".contentContainer").length !== 0) {
	var childElement = $("#mainContainer").find(".contentContainer").first();

	// If the child is not already inside the container
	if ("#" + $(childElement).attr("id") != childDivId) {

	    $(childElement).fadeOut(400, function () {

		$(containerDivId).empty();
		loadContainer(contentUrl, containerDivId, 250)
	    });
	}
    } else {
	loadContainer(contentUrl, containerDivId, 400);
    }

    // Update browser URL field
    if (pushWindowState) {
	history.pushState(null, null, browserUrl);
    }

}

function loadContainer(contentUrl, containerDivId, animationLength) {

    $.ajax({
	url: contentUrl,
	method: "GET",
	success: function (res) {
	    $(containerDivId).append(res);
	    $(containerDivId).children().fadeIn(animationLength);
	  
	    if (contentUrl == "/Components/Art") {

		$(".shopify-buy-frame").show(200);
//		loadProductScripts();

	    } else {
		$(".shopify-buy-frame").hide(200);
		addPrettyCode();
	    }
	    
	    addLazy();
	},
	fail: function (err) {
	    console.log(err);
	}
    });
}

//function loadProduct(abc, clothingContainer) {
//
//    $.ajax({
//	url: "/products/" + abc,
//	method: "GET",
//	success: function (res) {
//
//	    $(containerDivId).append(res);
//	},
//	fail: function (err) {
//	    console.log(err);
//	}
//    });
//}

