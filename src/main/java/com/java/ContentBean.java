
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
	HashMap<String, ArrayList<String>> productCategories = new HashMap<String, ArrayList<String>>();
	ArrayList<String> clothingProducts = new ArrayList<String>();
	clothingProducts.add("product-component-83d4308a58b");
	clothingProducts.add("product-component-f47c125a5b7");
	clothingProducts.add("product-component-cbaf86a411b");
	ArrayList<String> decorProducts = new ArrayList<String>();
	decorProducts.add("product-component-71cc3c0aac7");
	decorProducts.add("product-component-234bbd3a138");
	decorProducts.add("product-component-b695b96dba2");
	ArrayList<String> otherProducts = new ArrayList<String>();
	otherProducts.add("product-component-498f2c5530b");
	otherProducts.add("product-component-90fcb857ef1");
	otherProducts.add("product-component-32336f125b0");
	productCategories.put("other", otherProducts);
	productCategories.put("clothing", clothingProducts);
	productCategories.put("decor", decorProducts);
//	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Mesa-min.JPG");
	map.put("name", "Mesa");
	map.put("dimensions", "40x30'");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Mesa College in San Diego was a great school to attend. I wanted something to remember it by.");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Emeralds-min.png");
	map.put("name", "Emeralds");
	map.put("dimensions", "36x24\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "While on a run through some hills, I discovered a worn-down classic car with flat tires, sitting dormant"
		+ " against the curb. The paint that wasn't overtaken by rust "
		+ "was a brilliant green. I had to restore it to its former glory- in a picture, at least.");

	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "CaliforniaSunday-min.JPG");
	map.put("name", "California Sunday");
	map.put("dimensions", "2x2'");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Sometimes the must mundane, forgettable scenes make the most interesting things to paint.");
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
	productCategories = new HashMap<String, ArrayList<String>>();
	clothingProducts = new ArrayList<String>();
	clothingProducts.add("product-component-6fd2e1a259f");
	clothingProducts.add("product-component-5ef2c2bcabb");
	clothingProducts.add("product-component-5b1094967a8");
	decorProducts = new ArrayList<String>();
	decorProducts.add("product-component-87a1f6e4fc0");
	decorProducts.add("product-component-0a356cf1b95");
	decorProducts.add("product-component-b5d4546458f");
	otherProducts = new ArrayList<String>();
	otherProducts.add("product-component-a5ad3048e91");
	otherProducts.add("product-component-2f7a1b3c141");
	otherProducts.add("product-component-685560044f0");
	productCategories.put("clothing", clothingProducts);
	productCategories.put("decor", decorProducts);
	productCategories.put("other", otherProducts);
//	map.put("productCategories", productCategories);
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WKPHS-min.JPG");
	map.put("name", "Who Knew Pinecones Had Souls?");
	map.put("dimensions", "36x24\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "On the right are masculine thoughts- rigid, sturdy and serial. The thoughts on the left are feminine- flowing, flexible, and parallel. "
		+ "Below are the Earthly limits and pains placed on us, and above is the world we all aspire for but is beyond our comprehension."
		+ " In the middle, your referee silently watches the games that are played between all sides.");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "LeftoverExpensiveAssPaint-min.JPG");
	map.put("name", "Leftover Expensive Ass Paint");
	map.put("dimensions", "20x16\"");
	map.put("medium", "Expensive ass paint on canvas");
	map.put("desc", "It is pretty rare that I mix exactly the amount of paint I need."
		+ "");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "LucidLiving-min.JPG");
	map.put("name", "Lucid Living");
	map.put("dimensions", "16x20\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "This was the first painting I made for a long time. It is kinda my 'calibration'- where I relearned color mixing, blending, and textures.");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "CloudComputing-min.png");
	map.put("name", "Cloud Computing");
	map.put("dimensions", "40x30\"");
	map.put("medium", "Oil on canvas");
	map.put("desc", "Another everyday scene that I felt compelled to paint. The radio tower stood like a giant above me. I imagined the endless stream of data"
		+ " it was listening for and spitting back out. The specks of information flow like a river through it, coursing through the clouds to make their way to"
		+ " my phone so I can ask google where to find chinese food.");
	artworkArray.add(map);


	map = new HashMap<>();
//	map.put("id", "2");
	map.put("filename", "J-min.JPG");
	map.put("name", "J");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pencil");
	artworkArray.add(map);


	map = new HashMap<>();
	map.put("filename", "DropsInTheOcean-min.JPG");
	map.put("name", "Drops in the Ocean");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WhyHelloThere-min.JPG");
	map.put("name", "Why Hello There");
	map.put("dimensions", "27x20\"");
	map.put("medium", "Pen");
	map.put("infoBreak", " ");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Sparks-min.JPG");
	map.put("name", "Sparks");
	map.put("dimensions", "18x12\"");
	map.put("medium", "Pastel and Cardboard");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Pipes-min.png");
	map.put("name", "Pipes");
	map.put("dimensions", "18x12\"");
	map.put("medium", "Pastel");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Branches-min.png");
	map.put("name", "Branches");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Colored Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Corn-min.png");
	map.put("name", "Corn");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Charcoal");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "PickingTheLock-min.JPG");
	map.put("name", "Picking the Lock");
	map.put("dimensions", "11x8.5");
	map.put("medium", "Marker and Colored Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "EarlyForWork-min.JPG");
	map.put("name", "Early for Work");
	map.put("dimensions", "11x14");
	map.put("medium", "Colored Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WonderfulWorld-min.JPG");
	map.put("name", "The Wonderful World / 1950");
	map.put("dimensions", "10x16");
	map.put("medium", "Colored Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Melt-min.JPG");
	map.put("name", "Melt");
	map.put("dimensions", "11x8.5");
	map.put("medium", "Marker and Colored Pencil");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "GettingStarted-min.JPG");
	map.put("name", "Getting Started");
	map.put("dimensions", "27x18\"");
	map.put("medium", "Charcoal");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "WastedPaper-min.JPG");
	map.put("name", "Wasted Paper");
	map.put("dimensions", "10x8");
	map.put("medium", "Marker");
	artworkArray.add(map);

	map = new HashMap<>();
	map.put("filename", "Smoke-min.png");
	map.put("name", "Smoke");
	map.put("dimensions", "10x14\"");
	map.put("medium", "Pencil");
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
