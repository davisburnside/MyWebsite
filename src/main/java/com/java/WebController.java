package com.java;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@Controller
public class WebController implements ErrorController {

    @Autowired
    private ResourceLoader resourceLoader;
    
    @Autowired 
    private ContentBean contentBean;

    @GetMapping("/")
    public String homePage(Model model) {
	model.addAttribute("currentPage", "home");
	return "LandingPage";
    }
    @GetMapping("/Components/Art")
    public String artComponent(Model model) {
	ArrayList<HashMap<String, Object>> artworkArray = contentBean.getArtworkArray();
	model.addAttribute("artworkArray", artworkArray);
	return "ArtContainer";
    }

    // Tutorials page
    @GetMapping("/Tutorials")
    public String tutorialsPage(Model model) {
	model.addAttribute("currentPage", "tutorials");
	ArrayList<HashMap<String, String>> tutorialsArray = contentBean.getTutorialsArray();
	model.addAttribute("tutorialsArray", tutorialsArray);
	return "LandingPage";
    }
    @GetMapping("/Components/Tutorials")
    public String tutorialsComponent(Model model) {

	ArrayList<HashMap<String, String>> tutorialsArray = contentBean.getTutorialsArray();
	model.addAttribute("tutorialsArray", tutorialsArray);
	return "TutorialContainer";
    }

    // Individual Tutorial page
    @GetMapping("/Tutorials/{tutorialId}")
    public String individualTutorialPage(@PathVariable("tutorialId") String tutorialId, Model model) {
	model.addAttribute("currentPage", "tutorials/" + tutorialId);
	model.addAttribute("tutorialId", tutorialId);
	return "LandingPage";
    }
    @GetMapping("Components/Tutorials/{tutorialId}")
    public String individualTutorialComponent(@PathVariable("tutorialId") String tutorialId, Model model) {
	model.addAttribute("tutorialId", tutorialId);
	return "Tutorials/" + tutorialId;
    }

    // Shoutouts page
    @GetMapping("/Shoutouts")
    public String ShoutoutsPage(Model model) {
	model.addAttribute("currentPage", "shoutouts");
	return "LandingPage";
    }
    @GetMapping("/Components/Shoutouts")
    public String ShoutoutsComponent(Model model) {
	ArrayList<HashMap<String, String>> shoutoutsArray = contentBean.getShoutoutsArray();
	model.addAttribute("shoutoutArray", shoutoutsArray);
	return "ShoutoutsContainer";
    }

    // Contact page
    @GetMapping("/Contact")
    public String contactPage(Model model) {
	model.addAttribute("currentPage", "contact");
	return "LandingPage";
    }
    @GetMapping("/Components/Contact")
    public String contactComponent() {
	return "ContactContainer";
    }

    // Error mapping
    private static final String errorPath = "/error";
    @RequestMapping(value = errorPath)
    public String error(Model model) {
	model.addAttribute("currentPage", "home");
	model.addAttribute("message", "error");
	return "LandingPage";
    }
    @Override
    public String getErrorPath() {
	return errorPath;
    }

    // Download handling
    @RequestMapping(value = "downloadFile/{resourceName}", method = RequestMethod.GET)
    public StreamingResponseBody getStreamingFile(@PathVariable("resourceName") String resourceName, HttpServletResponse response) throws IOException {

	Resource res = resourceLoader.getResource("classpath:downloads/PhysSim1_imgs.zip");

	switch (resourceName) {
	    case "physSimPt1Images":

		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"PhysSim1_imgs.zip\"");
		res = resourceLoader.getResource("classpath:downloads/PhysSim1_imgs.zip");
		break;

	    case "physSimPt1All":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"PhysSim1_imgsAndCode.zip\"");
		res = resourceLoader.getResource("classpath:downloads/PhysSim1_imgsAndCode.zip");
		break;

	    case "physSimPt2Images":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"PhysSim2_imgs.zip\"");
		res = resourceLoader.getResource("classpath:downloads/PhysSim2_imgs.zip");
		break;

	    case "physSimPt2All":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"PhysSim2_imgsAndCode.zip\"");
		res = resourceLoader.getResource("classpath:downloads/PhysSim2_imgsAndCode.zip");
		break;

	    case "BeatBuilder_resources":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"BeatBuilder_resources.zip\"");
		res = resourceLoader.getResource("classpath:downloads/BeatBuilder_resources.zip");
		break;

	    case "BeatBuilder_ALL":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"BeatBuilder_ALL.zip\"");
		res = resourceLoader.getResource("classpath:downloads/BeatBuilder_ALL.zip");
		break;

	    case "SinWaveAudio_ALL":
		response.setContentType("application/zip");
		response.setHeader("Content-Disposition", "attachment; filename=\"SinWaveAudio_ALL.zip\"");
		res = resourceLoader.getResource("classpath:downloads/SinWaveAudio_ALL.zip");
		break;
	}

	InputStream is = res.getInputStream();
	return outputStream -> {
	    int nRead;
	    byte[] data = new byte[1024];
	    while ((nRead = is.read(data, 0, data.length)) != -1) {
		outputStream.write(data, 0, nRead);
	    }
	};
    }

}