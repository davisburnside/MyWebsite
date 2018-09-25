package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContentBean {

    @Bean
    ArrayList<HashMap<String, Object>> getArtworkArray() {

	// Template for products
//	map.put("id", "");
//	map.put("idAlt", "''");
//	map.put("categoryButtonWidth", "col-sm-6");
//	productCategories = new HashMap<String, ArrayList<String>>();
//	clothingProducts = new ArrayList<String>();
//	clothingProducts.add("");
//	clothingProducts.add("");
//	clothingProducts.add("");
//	decorProducts = new ArrayList<String>();
//	decorProducts.add("");
//	decorProducts.add("");
//	decorProducts.add("");
//	otherProducts = new ArrayList<String>();
//	otherProducts.add("");
//	otherProducts.add("");
//	otherProducts.add("");
//	productCategories.put("clothing", clothingProducts);
//	productCategories.put("decor", decorProducts);
//	productCategories.put("other", otherProducts);
//	map.put("productCategories", productCategories);
//	artworkArray.add(map);
	ArrayList<HashMap<String, Object>> artworkArray = new ArrayList<>();

	HashMap<String, Object> map = new HashMap<>();

	map.put("filename", "AegeanFriday-min.JPG");
	map.put("name", "Aegean Friday");
	map.put("dimensions", "40x30\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "After the invention of the ship, Greek single-man vases quickly became obsolete. These "
		+ "ancient vessels now exist to let wealthy tourists cruise the sea in the fashion of their ancestors.");
	map.put("id", "AegeanFriday");
	map.put("idAlt", "'AegeanFriday'");
	map.put("categoryButtonWidth", "col-sm-6");
	HashMap<String, ArrayList<String>> productCategories = new HashMap<String, ArrayList<String>>();
	ArrayList<String> decorProducts = new ArrayList<String>();
	decorProducts.add("AegeanFriday-product-component-0e88e36e04c");
	decorProducts.add("AegeanFriday-product-component-7fefe318481");
	decorProducts.add("AegeanFriday-product-component-432b98937bf");
	ArrayList<String> otherProducts = new ArrayList<String>();
	otherProducts.add("AegeanFriday-product-component-c231a2306e2");
	otherProducts.add("AegeanFriday-product-component-fca6a488571");
	otherProducts.add("AegeanFriday-product-component-c4160a03d6f");
	productCategories.put("other", otherProducts);
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Mesa-min.JPG");
	map.put("name", "Mesa");
	map.put("dimensions", "40x30'");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Mesa College in San Diego was a great school to attend. I wanted something to remember it by.");
	map.put("id", "Mesa");
	map.put("idAlt", "'Mesa'");
	map.put("categoryButtonWidth", "col-sm-6");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("Mesa-product-component-76747c47bbd");
	decorProducts.add("Mesa-product-component-b2f58506cc1");
	decorProducts.add("Mesa-product-component-6ced2accf48");
	otherProducts = new ArrayList<String>();
	otherProducts.add("Mesa-product-component-5e27dfe8416");
	otherProducts.add("Mesa-product-component-3a5ddc1261a");
	otherProducts.add("Mesa-product-component-1867df84a11");
	productCategories.put("other", otherProducts);
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Emeralds-min.png");
	map.put("name", "Emeralds");
	map.put("dimensions", "36x24\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "While on a run through some hills, I discovered a worn-down classic car with flat tires, sitting dormant"
		+ " against the curb. The paint that wasn't overtaken by rust "
		+ "was a brilliant green. I had to restore it to its former glory- in a picture, at least.");
	map.put("id", "Emeralds");
	map.put("idAlt", "'Emeralds'");
	map.put("categoryButtonWidth", "col-sm-12");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("Emeralds-product-component-7dffe27f64f");
	decorProducts.add("Emeralds-product-component-0caa6ba6a6a");
	decorProducts.add("Emeralds-product-component-c3cd4d3a6a8");
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "CaliforniaSunday-min.JPG");
	map.put("name", "California Sunday");
	map.put("dimensions", "2x2'");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Sometimes the must mundane, forgettable scenes make the most interesting things to paint.");
	map.put("id", "CaliforniaSunday");
	map.put("idAlt", "'CaliforniaSunday'");
	map.put("categoryButtonWidth", "col-sm-12");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("CaliforniaSunday-product-component-d5c02bb61cf");
	decorProducts.add("CaliforniaSunday-product-component-84d5623e2f2");
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "VeniVidiVici-min.JPG");
	map.put("name", "Veni Vidi Vici");
	map.put("dimensions", "30x40\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Colonel Balloonaparte's battlefield prowess was the stuff of legends. By age 12 he popped his "
		+ "first foe, and by 14 had conquered the entire Eastern hemisphere. His life was tragically cut short at the age of 23, "
		+ "when he sat too close to a candle.");
	map.put("id", "VeniVidiVici");
	map.put("idAlt", "'VeniVidiVici'");
	map.put("categoryButtonWidth", "col-sm-6");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("VeniVidiVici-product-component-d94977d5233");
	decorProducts.add("VeniVidiVici-product-component-2872cdfbcf5");
	decorProducts.add("VeniVidiVici-product-component-224c1f506fe");	
	otherProducts = new ArrayList<String>();
	otherProducts.add("VeniVidiVici-product-component-cd2902b2f22");
	otherProducts.add("VeniVidiVici-product-component-1180a5fa105");
	otherProducts.add("VeniVidiVici-product-component-f08756c2b0d");
	productCategories.put("decor", decorProducts);
	productCategories.put("other", otherProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WKPHS-min.JPG");
	map.put("name", "Who Knew Pinecones Had Souls?");
	map.put("dimensions", "36x24\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "On the right are masculine thoughts- rigid, sturdy and serial. The thoughts on the left are feminine- flowing, flexible, and parallel. "
		+ "Below are the Earthly limits and pains placed on us, and above is the world we all aspire for but is beyond our comprehension."
		+ " In the middle, your referee silently watches the games that are played between all sides.");
	map.put("id", "WKPHS");
	map.put("idAlt", "'WKPHS'");
	map.put("categoryButtonWidth", "col-sm-6");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("WKPHS-product-component-bdb23d55300");
	decorProducts.add("WKPHS-product-component-00f31666ab9");
	decorProducts.add("WKPHS-product-component-52338cc5773");
	otherProducts = new ArrayList<String>();
	otherProducts.add("WKPHS-product-component-7cd22b7ebea");
	otherProducts.add("WKPHS-product-component-e03e7d1fa1f");
	productCategories.put("decor", decorProducts);
	productCategories.put("other", otherProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "LeftoverExpensiveAssPaint-min.JPG");
	map.put("name", "Leftover Expensive Ass Paint");
	map.put("dimensions", "20x16\"");
	map.put("medium", "Expensive ass paint on canvas");
	map.put("desc", "It is pretty rare that I mix exactly the amount of paint I need."
		+ "");
	map.put("id", "LEAP");
	map.put("idAlt", "'LEAP'");
	map.put("categoryButtonWidth", "col-sm-12");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("LEAP-product-component-cf71512f0da");
	decorProducts.add("LEAP-product-component-215e69b2baa");
	decorProducts.add("LEAP-product-component-c59a7d2e481");	
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "LucidLiving-min.JPG");
	map.put("name", "Lucid Living");
	map.put("dimensions", "16x20\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "This was the first painting I made for a long time. It is kinda my 'calibration'- where I relearned color mixing, blending, and textures.");
	map.put("id", "LucidLiving");
	map.put("idAlt", "'LucidLiving'");
	map.put("categoryButtonWidth", "col-sm-12");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("LucidLiving-product-component-61ede623a05");
	decorProducts.add("LucidLiving-product-component-d0192805f59");
	decorProducts.add("LucidLiving-product-component-dcefc5711a3");
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "CloudComputing-min.png");
	map.put("name", "Cloud Computing");
	map.put("dimensions", "40x30\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Another everyday scene that I felt compelled to paint. The radio tower stood like a giant above me. I imagined the endless stream of data"
		+ " it was listening for and spitting back out. The specks of information flow like a river through it, coursing through the clouds to make their way to"
		+ " my phone so I can ask google where to find chinese food.");
	map.put("id", "CloudComputing");
	map.put("idAlt", "'CloudComputing'");
	map.put("categoryButtonWidth", "col-sm-12");
	productCategories = new HashMap<String, ArrayList<String>>();
	decorProducts = new ArrayList<String>();
	decorProducts.add("CloudComputing-product-component-70e4aea8748");
	decorProducts.add("CloudComputing-product-component-d3b6c95e8b4");
	decorProducts.add("CloudComputing-product-component-3fc2debb5ea");			
	productCategories.put("decor", decorProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "DropsInTheOcean-min.JPG");
	map.put("name", "Drops in the Ocean");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pencil");
	    map.put("id", "DropsInTheOcean");
	map.put("idAlt", "'DropsInTheOcean'");
	map.put("categoryButtonWidth", "col-sm-6");
	productCategories = new HashMap<String, ArrayList<String>>();	
	decorProducts = new ArrayList<String>();
	decorProducts.add("DropsInTheOcean-product-component-f4290ab499e");
	decorProducts.add("DropsInTheOcean-product-component-0999f67ab2d"); 
	decorProducts.add("DropsInTheOcean-product-component-d2da0bb4ad2");
	otherProducts = new ArrayList<String>();
	otherProducts.add("DropsInTheOcean-product-component-2c091bee7b6");
	otherProducts.add("DropsInTheOcean-product-component-b84cd095a74");
	otherProducts.add("DropsInTheOcean-product-component-0b203d343a1");
//	clothingProducts = new ArrayList<String>();
//	clothingProducts.add("product-component-252d3b435e0");
//	clothingProducts.add("");
//	clothingProducts.add("");
	productCategories.put("decor", decorProducts);
	productCategories.put("other", otherProducts);
//	productCategories.put("clothing", clothingProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WhyHelloThere-min.JPG");
	map.put("name", "Why Hello There");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pen");
	map.put("id", "WhyHelloThere");
	map.put("idAlt", "'WhyHelloThere'");
	map.put("categoryButtonWidth", "col-sm-6");
	productCategories = new HashMap<String, ArrayList<String>>();	
	decorProducts = new ArrayList<String>();
	decorProducts.add("WhyHelloThere-product-component-ff4028879e7");
	decorProducts.add("WhyHelloThere-product-component-ff943a30c7e");
	decorProducts.add("WhyHelloThere-product-component-f953c95162e");
	otherProducts = new ArrayList<String>();
	otherProducts.add("WhyHelloThere-product-component-d5210ec99c0");
	otherProducts.add("WhyHelloThere-product-component-e282a313bb2");
	otherProducts.add("WhyHelloThere-product-component-9a10c9e10b0");
	productCategories.put("decor", decorProducts);
	productCategories.put("other", otherProducts);
	map.put("productCategories", productCategories);
	artworkArray.add(map);
	
	map = new HashMap<>();
//	map.put("id", "2");
	map.put("filename", "J-min.JPG");
	map.put("name", "J");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Sparks-min.JPG");
	map.put("name", "Sparks");
	map.put("dimensions", "18x12\"");
	map.put("medium", "Pastel and Cardboard");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Pipes-min.png");
	map.put("name", "Pipes");
	map.put("dimensions", "18x12\"");
	map.put("medium", "Pastel");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Branches-min.png");
	map.put("name", "Branches");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Colored Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Corn-min.png");
	map.put("name", "Corn");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Charcoal");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "PickingTheLock-min.JPG");
	map.put("name", "Picking the Lock");
	map.put("dimensions", "11x8.5");
	map.put("medium", "Marker and Colored Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "EarlyForWork-min.JPG");
	map.put("name", "Early for Work");
	map.put("dimensions", "11x14");
	map.put("medium", "Colored Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WonderfulWorld-min.JPG");
	map.put("name", "The Wonderful World / 1950");
	map.put("dimensions", "10x16");
	map.put("medium", "Colored Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Melt-min.JPG");
	map.put("name", "Melt");
	map.put("dimensions", "11x8.5");
	map.put("medium", "Marker and Colored Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "GettingStarted-min.JPG");
	map.put("name", "Getting Started");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Charcoal");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WastedPaper-min.JPG");
	map.put("name", "Wasted Paper");
	map.put("dimensions", "10x8");
	map.put("medium", "Marker");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Smoke-min.png");
	map.put("name", "Smoke");
	map.put("dimensions", "10x14\"");
	map.put("medium", "Pencil");
	map.put("id", "");
	map.put("idAlt", "''");
	artworkArray.add(map);

	return artworkArray;
    }

    @Bean
    ArrayList<HashMap<String, String>> getTutorialsArray() {

	ArrayList<HashMap<String, String>> tutorialsArray = new ArrayList<>();

	HashMap<String, String> map = new HashMap<>();
	map.put("id", "ArtDemo1");
	map.put("title", "Painting a Dude in a Vase");
	map.put("desc", "A step-by-step explaination with photos about how I painted my latest picture, Aegean Friday");
	tutorialsArray.add(map);

	map = new HashMap<>();
	map.put("id", "ArduinoReflex");
	map.put("title", "3-Player Reflex Game");
	map.put("desc", "Using the Arduino Uno, LEDs, Buttons, and a Piezo vibration sensor, create a game to test the reflexes of 3 people.");
	tutorialsArray.add(map);

	map = new HashMap<>();
	map.put("id", "SinWaveAudio");
	map.put("title", "Java Jams: Sin Waves, Streams, and Byte Buffers");
	map.put("desc", "Create a sound from scratch and forward it directly to the audio output. Get your hands dirty with a little bit of math.");
	tutorialsArray.add(map);

	map = new HashMap<>();
	map.put("id", "BeatBuilder");
	map.put("title", "Java Jams: Building Beats");
	map.put("desc", "Create a program to mix beats in real-time. Become the most famous Java DJ in the world.");
	tutorialsArray.add(map);

	map = new HashMap<>();
	map.put("id", "PhysSimPt2");
	map.put("title", "Physics-based 2D game in Java, Pt 2");
	map.put("desc", "Restructure the game from part 1 to show the flexibility of Object Oriented Programming.");
	tutorialsArray.add(map);

	map = new HashMap<>();
	map.put("id", "PhysSimPt1");
	map.put("title", "Physics-based 2D game in Java, Pt 1");
	map.put("desc", "Create a rudimentary physics engine with collision detection and use it to power a tiny 2D game. No outside code libraries are needed.");
	tutorialsArray.add(map);

	return tutorialsArray;
    }

    @Bean
    ArrayList<HashMap<String, String>> getShoutoutsArray() {

	ArrayList<HashMap<String, String>> shoutoutsArray = new ArrayList<>();

	HashMap<String, String> map = new HashMap<>();
	map.put("mainLink", "http://www.williamosman.com/");
	map.put("photoName", "photo.jpg");
	map.put("name", "William Osman");
	map.put("desc", "He built a battlebot with pumpkin armor. He makes potato chips with an industrial "
		+ " laser. He built a wearable remote-controlled food stick to steer his dog."
		+ " He's obviously preparing to take over the world- but at least he is"
		+ " filming his progress for future generations to study.");
	map.put("favName1", "Laser Cut Vin Diesel Ham and Cheese Sandwich");
	map.put("favLink1", "https://youtu.be/pr1YRP6rWdc");
	map.put("favName2", "How I skinned my face");
	map.put("favLink2", "http://www.williamosman.com/2017/12/how-i-skinned-my-face.html");
	map.put("favName3", "Magic Monitor: Kinetic Gimbal Controller ");
	map.put("favLink3", "http://www.williamosman.com/2016/04/magic-monitor-camera-gimbal-remote.html");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "http://practical.engineering/");
	map.put("photoName", "photo2.jpg");
	map.put("name", "Practical Engineering");
	map.put("desc", "Grady Hillhouse is a civil engineer whose videos explore the unseen"
		+ " science behind our high-tech society. Not only does he give fantastic lessons"
		+ " on the nitty-gritty of our everyday infrastructure, he often builds small-scale"
		+ " models to illustrate his videos. Quality entertaining content, every time.");
	map.put("favName1", "Can a satellite do a yo-yo trick?");
	map.put("favLink1", "https://youtu.be/ZKAQtB5Pwq4");
	map.put("favName2", "How soil destroys buildings");
	map.put("favLink2", "https://youtu.be/SW-NoiM726U");
	map.put("favName3", "Arduino Garden Controller");
	map.put("favLink3", "https://youtu.be/O_Q1WKCtWiA");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "https://www.youtube.com/user/McBacon1337");
	map.put("photoName", "photo3.jpg");
	map.put("name", "Game Maker's Toolkit");
	map.put("desc", "Mark Brown's channel is a rare find on youtube- a channel dedicated to video games"
		+ " that isn't absolute garbage. He analyzes the infinite intricacies of Game Theory:"
		+ " The essence of <span class=\"italics\">motivation</span>"
		+ " and <span class=\"italics\">fun</span>, and how various titles (new and old) explore it with clever "
		+ " game mechanics.");
	map.put("favName1", "Boss Keys");
	map.put("favLink1", "https://youtu.be/6LO8Z1DkDqc");
	map.put("favName2", "How Snake Pass works");
	map.put("favLink2", "https://youtu.be/4NNPr2Ay4OM");
	map.put("favName3", "5 amazing levels from 2017");
	map.put("favLink3", "https://youtu.be/lamAqI8v7Y0");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "https://www.youtube.com/user/crashcourse");
	map.put("photoName", "photo6.jpg");
	map.put("name", "CrashCourse");
	map.put("desc", "If you have ever had a question about <span class=\"italics\">anything, ever</span>, chances are"
		+ " CrashCourse has answered it. They have comprehensive and easy-to-digest videos explaining"
		+ " topics of history, science, literature, and any other subject that your public school"
		+ " killed all prior interest in.");
	map.put("favName1", "Early computing");
	map.put("favLink1", "https://youtu.be/O5nskjZ_GoI");
	map.put("favName2", "Orbitals");
	map.put("favLink2", "https://youtu.be/cPDptc0wUYI");
	map.put("favName3", "Work, energy, and power");
	map.put("favLink3", "https://youtu.be/w4QFJb9a8vo");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "https://www.youtube.com/channel/UCxQbYGpbdrh-b2ND-AfIybg");
	map.put("photoName", "photo5.jpg");
	map.put("name", "Maker's Muse");
	map.put("desc", "When I was getting started in 3d Printing, and all my results looked"
		+ " like a hot plate of Jackson Pollock's spaghetti, Maker's Muse helped my turn my"
		+ " dreams into plastic reality. For printers of all experience levels, this is"
		+ " a good channel for advice");
	map.put("favName1", "5 3d printing mistakes");
	map.put("favLink1", "https://youtu.be/aWg1nG2AbA8");
	map.put("favName2", "Printing the Deathclaw");
	map.put("favLink2", "https://youtu.be/2KR2kQcHCho");
	map.put("favName3", "1mm nozzle");
	map.put("favLink3", "https://youtu.be/4Hwc-wbihUs");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "https://www.raywenderlich.com/");
	map.put("photoName", "photo4.png");
	map.put("name", "Ray Wenderlich");
	map.put("desc", "It's a name known by probably every iOS developer. In addition to providing a"
		+ " <span class=\"italics\">vast</span> array of iOS delevopment tutorials,"
		+ " Ray and his team cover Android, the Unity game engine, and programming for OSX");
	map.put("favName1", "iOS storyboards");
	map.put("favLink1", "https://www.raywenderlich.com/160521/storyboards-tutorial-ios-11-part-1");
	map.put("favName2", "iOS animations");
	map.put("favLink2", "https://www.raywenderlich.com/113686/ios-animation-tutorial-introduction-easy-animation");
	map.put("favName3", "Unity 2D game");
	map.put("favLink3", "https://www.raywenderlich.com/69392/make-game-like-jetpack-joyride-unity-2d-part-1");
	shoutoutsArray.add(map);

	map = new HashMap<>();
	map.put("mainLink", "https://www.tutorialspoint.com/index.htm");
	map.put("photoName", "photo7.png");
	map.put("name", "TutorialsPoint");
	map.put("desc", "For anyone of any skill level who is interested in learning more about"
		+ " the Arudino, this site is a godsend. In addition to electronics and programming lessons,"
		+ " they also teach just about every subject imaginable. ");
	map.put("favName1", "Arudino quick guide");
	map.put("favLink1", "https://www.tutorialspoint.com/arduino/arduino_quick_guide.htm");
	map.put("favName2", "Ultrasonic sensor");
	map.put("favLink2", "https://www.tutorialspoint.com/arduino/arduino_ultrasonic_sensor.htm");
	map.put("favName3", "Developer's best practices");
	map.put("favLink3", "https://www.tutorialspoint.com/developers_best_practices/index.htm");
	shoutoutsArray.add(map);

	return shoutoutsArray;
    }

}
