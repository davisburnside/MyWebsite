# MyWebsite

 I made this site as an exercise in Web Design, & as a place to host my art and tutorials. Here are the main components I had in mind when first planning it:

## Single-Page Application

When loading any URL path, only **LandingPage.html** is returned. This page holds the main navigation bar and the **mainContainer** div, which the contents of each page is loaded from **DivLoaderFunctions.js**.

  Even though the main content of each page is loaded via AJAX after the page is received by the browser, pages can still be dynamic (parsed by the Thymeleaf engine) by treating them as web pages and not API calls. 
  
  For example, if I navigate to *davisburnside.com/tutorials*, I receive the same LandingPage.html as *davisburnside.com/*, with an flag set by thymeleaf to later load the content for */tutorials*. After the DOM is rendered & the navigation bar begins its animation, an AJAX call to */components/tutorials* is made. The server treats this like any other page load & returns a parsed thymeleaf html file, which the **loadContainer** function in DivLoaderFunctions appends as html to the main container.

## Dynamic pages

the Home Page, Tutorial page, and Shoutouts page have lists of content that follow a similar format. To save time & keystrokes, these formats are defined in Thymeleaf and repeated dynamically with a simple **th:each** statement, which reads an Arrays of HashMaps attached to the **Model** of each page in **WebController.java**. These Arrays are defined in **ContentBean.java**, and allow me to quickly add or remove content

## Bandwidth optimization:

Because this site is image-heavy, I needed a way to reduce AWS bandwidth charges while still keeping image quality high. I converted the artwork images to JPG and found the optimal compression level for each one, reducing the average file size by 70%. I also used the **jquery.lazy** library for lazy loading.

## HTTP -> HTTPS conversion:

By using AWS Elastic Beanstalk to host the server, I am allocated an NGINX proxy server. I can configure this proxy to redirect HTTP traffic to HTTPS, which not only adds security but also helps my search engine optimization. 

After building the application to a .JAR file, I copy the .ebextensions folder found in /resources to the same directory as the .JAR file, navigate to the same directory in terminal, and enter the command:
**jar -uf [Jar Name].jar .ebextensions**
This adds the .ebextensions folder to the root of the JAR file and allows Elastic Beanstalk to configure the proxy server upon startup.



## Next steps: 
### Cleanup of tutorials:
The html for the control-bar of code sections for tutorials is clunky and repetitive. It should be defined in a thymeleaf fragment instead.
### Shopify / Printify integration:
Though the presentation code is completed & polished, I need to fix issues with print quality on Printify before I offer prints of my artworks.
