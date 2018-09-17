var clothing = 'Clothing';
var decor = 'Decor';
var other = 'Other';

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

var productDictionary = new Map();
function loadProductScripts() {

    // Aegean Friday
    productDictionary.set(1524406124603, 'product-component-83d4308a58b');
    productDictionary.set(1524419919931, 'product-component-f47c125a5b7');
    productDictionary.set(1524431650875, 'product-component-cbaf86a411b');
    productDictionary.set(1523373441083, 'product-component-71cc3c0aac7');
    productDictionary.set(1523248300091, 'product-component-234bbd3a138');
    productDictionary.set(1523403849787, 'product-component-b695b96dba2');
    productDictionary.set(1524359495739, 'product-component-498f2c5530b');
    productDictionary.set(1524209254459, 'product-component-90fcb857ef1');
    productDictionary.set(1524360806459, 'product-component-32336f125b0');
    
    // veniVidiVici
    productDictionary.set(1526409265211, 'product-component-5b1094967a8');
    productDictionary.set(1527208968251, 'product-component-5ef2c2bcabb');
    productDictionary.set(1530037502011, 'product-component-6fd2e1a259f');
    productDictionary.set(1530021675067, 'product-component-87a1f6e4fc0');
    productDictionary.set(1530022297659, 'product-component-0a356cf1b95');
    productDictionary.set(1530022527035, 'product-component-b5d4546458f');
    productDictionary.set(1530021216315, 'product-component-a5ad3048e91');
    productDictionary.set(1530021609531, 'product-component-2f7a1b3c141');
    productDictionary.set(1530020921403, 'product-component-685560044f0');
    





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

	    for (var shopifyId of productDictionary.keys()) {

		var elementId = productDictionary.get(shopifyId);
		ui.createComponent('product', {
		    id: [shopifyId],
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
		