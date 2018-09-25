var clothing = 'Clothing';
var decor = 'Decor';
var other = 'Other';

var productDictionary = new Map();

// Aegean Friday
//decor
productDictionary.set(1523403849787, 'AegeanFriday-product-component-0e88e36e04c');
productDictionary.set(1523373441083, 'AegeanFriday-product-component-7fefe318481');
productDictionary.set(1523248300091, 'AegeanFriday-product-component-432b98937bf');
//    other
productDictionary.set(1524209254459, 'AegeanFriday-product-component-c231a2306e2');
productDictionary.set(1524359495739, 'AegeanFriday-product-component-fca6a488571');
productDictionary.set(1618857099323, 'AegeanFriday-product-component-c4160a03d6f');

// Mesa
// //decor
productDictionary.set(1603420651579, 'Mesa-product-component-76747c47bbd');
productDictionary.set(1603389227067, 'Mesa-product-component-b2f58506cc1');
productDictionary.set(1603398598715, 'Mesa-product-component-6ced2accf48');
//other
productDictionary.set(1603436216379, 'Mesa-product-component-5e27dfe8416');
productDictionary.set(1603471278139, 'Mesa-product-component-3a5ddc1261a');
productDictionary.set(1603824386107, 'Mesa-product-component-1867df84a11');

// emeralds
// decor
productDictionary.set(1604630642747, 'Emeralds-product-component-7dffe27f64f');
productDictionary.set(1604609376315, 'Emeralds-product-component-0caa6ba6a6a');
productDictionary.set(1604602789947, 'Emeralds-product-component-c3cd4d3a6a8');
//    
//    // cali sunday
//    //decor
productDictionary.set(1604257382459, 'CaliforniaSunday-product-component-d5c02bb61cf');
productDictionary.set(1604271079483, 'CaliforniaSunday-product-component-84d5623e2f2');

// Veni vidi vici
// //decor
productDictionary.set(1604667342907, 'VeniVidiVici-product-component-d94977d5233');
productDictionary.set(1604652138555, 'VeniVidiVici-product-component-224c1f506fe');
productDictionary.set(1604657512507, 'VeniVidiVici-product-component-2872cdfbcf5');
//other
productDictionary.set(1619084804155, 'VeniVidiVici-product-component-cd2902b2f22');
productDictionary.set(1619165380667, 'VeniVidiVici-product-component-1180a5fa105');
productDictionary.set(1619067338811, 'VeniVidiVici-product-component-f08756c2b0d');

// WKPHS
// //decor
productDictionary.set(1604230053947, 'WKPHS-product-component-00f31666ab9');
productDictionary.set(1604228743227, 'WKPHS-product-component-bdb23d55300');
productDictionary.set(1618931253307, 'WKPHS-product-component-52338cc5773');
//    // other
productDictionary.set(1604234313787, 'WKPHS-product-component-7cd22b7ebea');
productDictionary.set(1618960351291, 'WKPHS-product-component-e03e7d1fa1f');
//    
//    LEAP
//decor
productDictionary.set(1604641587259, 'LEAP-product-component-215e69b2baa');
productDictionary.set(1604635623483, 'LEAP-product-component-c59a7d2e481');
productDictionary.set(1604647452731, 'LEAP-product-component-cf71512f0da');

// Lucid living
//decor
productDictionary.set(1604306337851, 'LucidLiving-product-component-61ede623a05');
productDictionary.set(1604293984315, 'LucidLiving-product-component-d0192805f59');
productDictionary.set(1604285792315, 'LucidLiving-product-component-dcefc5711a3');
//    
//    // Cloud computing
//decor
productDictionary.set(1604590108731, 'CloudComputing-product-component-d3b6c95e8b4');
productDictionary.set(1604584439867, 'CloudComputing-product-component-3fc2debb5ea');
productDictionary.set(1604596727867, 'CloudComputing-product-component-70e4aea8748');

// drops in the ocean
// decor
productDictionary.set(1603861184571, 'DropsInTheOcean-product-component-f4290ab499e');
productDictionary.set(1603930914875, 'DropsInTheOcean-product-component-0999f67ab2d');
productDictionary.set(1603904012347, 'DropsInTheOcean-product-component-d2da0bb4ad2');
//    //other
productDictionary.set(1603964043323, 'DropsInTheOcean-product-component-2c091bee7b6');
productDictionary.set(1604294672443, 'DropsInTheOcean-product-component-b84cd095a74');
productDictionary.set(1619381911611, 'DropsInTheOcean-product-component-0b203d343a1');

// why hello there
// //decor
productDictionary.set(1603988684859, 'WhyHelloThere-product-component-ff4028879e7');
productDictionary.set(1604022730811, 'WhyHelloThere-product-component-ff943a30c7e');
productDictionary.set(1604295032891, 'WhyHelloThere-product-component-f953c95162e');
//    //other
productDictionary.set(1604037673019, 'WhyHelloThere-product-component-d5210ec99c0');
productDictionary.set(1604036460603, 'WhyHelloThere-product-component-e282a313bb2');
productDictionary.set(1619418906683, 'WhyHelloThere-product-component-9a10c9e10b0');


var options = {
    "product": {
	"order": [
	    'img',
	    'button',
	    'price',
	    'title',
	    'description',
	    'options'
	],
	"iframe": false,
	"variantId": "all",
//	"buttonDestination": 'cart',
	"contents": {
	    "imgWithCarousel": false,
	    "variantTitle": false,
	    "description": true,
	    "buttonWithQuantity": false,
	    "quantity": false
	},
    },
    "cart": {
	"contents": {
	    "button": true
	},
	"styles": {
	    "button": {
		"background-color": "#2fb576",
		":hover": {
		    "background-color": "#2aa36a"
		},
		":focus": {
		    "background-color": "#2aa36a"
		}
	    },
	    "footer": {
		"background-color": "#ffffff"
	    }
	}
    },
    "toggle": {
	"styles": {
	    "toggle": {
		"background-color": "#2fb576",
		":hover": {
		    "background-color": "#2aa36a"
		},
		":focus": {
		    "background-color": "#2aa36a"
		}
	    }
	}
    }
}

function getAllProductsWithPrefixId(prefix) {

    var associatedProducts = new Map();
    for (var shopifyId of productDictionary.keys()) {

	var elementId = productDictionary.get(shopifyId);
	
	if (elementId.startsWith(prefix)) {
	    associatedProducts.set(shopifyId, elementId);
	}
    }
    return associatedProducts;
}

function loadProductScripts(productMap) {

    var scriptURL = 'https://sdks.shopifycdn.com/buy-button/latest/buy-button-storefront.min.js';
    if (window.ShopifyBuy) {
	if (window.ShopifyBuy.UI) {
	    ShopifyBuyInit();
	} else {
	    loadScript();
	}
    } else {
	loadScript();
    }

    function loadScript() {
	var script = document.createElement('script');
	script.async = true;
	script.src = scriptURL;
	(document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);
	script.onload = ShopifyBuyInit;
    }

    function ShopifyBuyInit() {

	var client = ShopifyBuy.buildClient({
	    domain: 'burnside-art.myshopify.com',
	    storefrontAccessToken: '0a8cb41225ab0c4a6f599cda5ec1eeb9',
	});

	ShopifyBuy.UI.onReady(client).then(function (ui) {

//console.log(productMap);
	    for (var shopifyId of productMap.keys()) {

	    var elementId = productMap.get(shopifyId);


	    ui.createComponent('product', {
		id: shopifyId,
		node: document.getElementById(elementId),
		moneyFormat: '%24%7B%7Bamount%7D%7D',
		options: options
	    });
	}
	});
    }
}

function showProductInfo(id, category) {

//    console.log(category);

// remove all button highlights
    $childButtons = $("#productContainer" + id + " .productCategoryButton");
    $childButtons.removeClass("selected");

// get containers
    $clothingProductsContainer = $("#productDropdownContainer" + clothing + id);
    $decorProductsContainer = $("#productDropdownContainer" + decor + id);
    $otherProductsContainer = $("#productDropdownContainer" + other + id);

    // animate selectefd container, apply button highlight
    if (category == clothing) {
	if ($clothingProductsContainer != null) {
	    if ($clothingProductsContainer.css("display") == "none") {
		$categoryButton = $("#productContainer" + id + " .productCategoryButton.clothing");
		$categoryButton.addClass("selected");
		$clothingProductsContainer.velocity("slideDown", {duration: slideDuration});
	    } else {
		$clothingProductsContainer.velocity("slideUp", {duration: slideDuration});
	    }
	}
	if ($decorProductsContainer != null && $decorProductsContainer.css("display") != "none") {
	    $decorProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
	if ($otherProductsContainer != null && $otherProductsContainer.css("display") != "none") {
	    $otherProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
    } else if (category == decor) {
	if ($decorProductsContainer != null) {
	    if ($decorProductsContainer.css("display") == "none") {
		$categoryButton = $("#productContainer" + id + " .productCategoryButton.decor");
		$categoryButton.addClass("selected");
		$decorProductsContainer.velocity("slideDown", {duration: slideDuration});
	    } else {
		$decorProductsContainer.velocity("slideUp", {duration: slideDuration});
	    }
	}
	if ($clothingProductsContainer != null && $clothingProductsContainer.css("display") != "none") {
	    $clothingProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
	if ($otherProductsContainer != null && $otherProductsContainer.css("display") != "none") {
	    $otherProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
    } else if (category == other) {
	if ($otherProductsContainer != null) {
	    if ($otherProductsContainer.css("display") == "none") {
		$categoryButton = $("#productContainer" + id + " .productCategoryButton.other");
		$categoryButton.addClass("selected");
		$otherProductsContainer.velocity("slideDown", {duration: slideDuration});
	    } else {
		$otherProductsContainer.velocity("slideUp", {duration: slideDuration});
	    }
	}
	if ($clothingProductsContainer != null && $clothingProductsContainer.css("display") != "none") {
	    $clothingProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
	if ($decorProductsContainer != null && $decorProductsContainer.css("display") != "none") {
	    $decorProductsContainer.velocity("slideUp", {duration: slideDuration});
	}
    }

}		