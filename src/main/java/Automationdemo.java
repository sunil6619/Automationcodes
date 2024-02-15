import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Automationdemo {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.calculator.net/");// for hyperlinks, scroll
//        driver.get("https://www.opencart.com/");// for dropdown
//        driver.get("http://www.deadlinkcity.com/");// for dead hyperlinks
//        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");// for radio buttons
//        driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles"); //for image links
//        driver.get("https://demoqa.com/buttons");     // mouse operation practice
//        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//drag and drop action
//          driver.get("https://www.flipkart.com/");      //mousehover
//        driver.get("https://demoqa.com/upload-download");//upload file
//        driver.get("https://www.testingbaba.com/old/newdemo.html");// alerts,nested iframes
//        driver.get("https://demo.guru99.com/test/write-xpath-table.html");// webtable
//        driver.get("https://testautomationpractice.blogspot.com/"); //webtable practice,javascript
//          driver.get("https://www.rediff.com/"); // iframes,scroll
//        driver.get("https://the-internet.herokuapp.com/upload");//upload file autoit
//        driver.get("https://jqueryui.com/datepicker/");// date picker
//        driver.get("https://the-internet.herokuapp.com/basic_auth");


//        driver.get("https://www.facebook.com/"); //for tooltip

//        driver.findElement(By.xpath("//button[@data-target=\"#alerts\"]")).click();// alerts
//        Thread.sleep(2000);                                                    // alerts
//        driver.findElement(By.xpath("//a[contains(text(),'alerts')]")).click();// alerts
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(text(),'nested frames')]")).click();// alerts
//        driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();// for webtable
//        Thread.sleep(2000);                                                    // alerts
//        Thread.sleep(3000);

        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//div[@class=\"navbar-right hidden-xs\"]/child::a[contains(text(),'Register')]")).click();
        //count hyperlinks
//        List<WebElement> linkelements=driver.findElements(By.tagName("a"));
//        System.out.println("Total links on webpage:" +linkelements.size());
        //print all links using for each
//        for (WebElement s:linkelements){
//            System.out.println(s.getText());
//        }

        // using for loop
//         for (int i=0;i<linkelements.size();i++){
//             System.out.println(linkelements.get(i).getText());
//         }
        // Select dropdown handling
//WebElement element=driver.findElement(By.id("input-country"));
//        Select sel= new Select(element);
//        sel.selectByVisibleText("India");
        // handling broken links in webpage
//List<WebElement> links= driver.findElements(By.tagName("a"));//find hyperlinks
//        System.out.println("Total links on webpage:" +links.size());
//        int respcode=200;
//        int brokenlinkCnt=0;
// for (WebElement ele:links)
// {
//     String url= ele.getAttribute("href");
//     try
//     {
//         URL urllink=new URL(url);
//         HttpURLConnection huc=(HttpURLConnection)urllink.openConnection();
//         huc.setRequestMethod("HEAD");
//         huc.connect();
//         respcode= huc.getResponseCode();
//         if (respcode>=400){
//             System.out.println(url+ "broken link");
//             brokenlinkCnt++;
//         }
//     }
//catch (MalformedURLException e)
//{
// }
//     catch (Exception e) {
//
//     }
//    }
//        System.out.println("Total broken links: "+brokenlinkCnt);
//        // count of no. of radio buttons
//List<WebElement> radio= driver.findElements(By.xpath("//input[@type=\"radio\"]"));
//System.out.println("Total no  of radio buttons on webpage: "+radio.size());
        //click on image links
//        WebElement imagelink= driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
//                     imagelink.click();;
//                     if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
//                     {
//                         System.out.println("Test passed");
//                     }
//                     else {
//                         System.out.println("Test failed");

//    }

        //right click operation
//        WebElement button= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//        Actions act=new Actions(driver) ;
//        act.contextClick(button).perform();
        //double click
//            WebElement buttons= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//        Actions act2=new Actions(driver);
//        act2.doubleClick(buttons).perform();
        // drag and drop action
        //find source and target element
//       WebElement source= driver.findElement(By.xpath("//div[@id='box6']"))    ;
//       WebElement target= driver.findElement(By.xpath("//div[@id='box106']"));
//       Actions act= new Actions(driver);
//       act.dragAndDrop(source,target).perform();
        //mousehover opration
//        WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
//                           Actions act= new Actions(driver);
//                           act.moveToElement(element).perform();

        //upload files using send keys
//        driver.findElement(By.xpath("//input[@id=\"uploadFile\"]")).sendKeys("S:\\RugDownloads\\download.jpg");
//
//        upload files using Robot class
//       WebElement button= driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
        //to click element as normal click not working on above element
//        Actions act= new Actions(driver);
//        act.moveToElement(button).click().perform();
//        Robot rob= new Robot();
//        rob.delay(2000);
//   copy file to clipboard
//        StringSelection ss= new StringSelection("S:\\RugDownloads\\download.jpg");
//        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
////     // perform control+V action to paste file
//        rob.keyPress(KeyEvent.VK_CONTROL);
//        rob.keyPress(KeyEvent.VK_V);
//        rob.keyRelease(KeyEvent.VK_CONTROL);
//        rob.keyRelease(KeyEvent.VK_V);
//        rob.keyPress(KeyEvent.VK_ENTER);
//        rob.keyRelease(KeyEvent.VK_ENTER);
        // handling alerts
//       driver.findElement(By.xpath("//button[@onclick=\"myalert()\"]")).click();
//       simple alert-switch to alert and accept alert
//          driver.switchTo().alert().accept();
//        confirm alert-switch to alert and accept alert
//        driver.findElement(By.xpath("//button[@onclick=\"myconfirm()\"]")).click();
//        driver.switchTo().alert().accept();
//        driver.switchTo().alert().dismiss();
        //  prompt alert-
//        driver.findElement(By.xpath("//button[@onclick=\"myprompt()\"]")).click();
//        Thread.sleep(2000);
//        driver.switchTo().alert().sendKeys("Sahil");
//        driver.switchTo().alert().accept();
        // handling webtable- finding second cell in webtable and print second cell data
//        String text=driver.findElement((By.xpath("//table[@border=\"l\"]/tbody/tr[1]/td[2]"))).getText();
//       System.out.println(text);
//  find no of rows in webtable
//       List<WebElement>rowlist= driver.findElements(By.xpath("//table[@border=\"l\"]/tbody/tr"));
//      System.out.println("Total no of rows: "+rowlist.size());
//  find no of columns  in webtable
//        List<WebElement>columnlist=driver.findElements(By.xpath("//table[@border=\"l\"]/tbody/tr[1]/td"));
//        System.out.println("Total no of Columns: "+columnlist.size());
        // reading all cells of table
//       for (int r=1;r<=rowlist.size();r++)
//        {
//            for (int c=1;c<= columnlist.size();c++)
//            {
//                String data=driver.findElement(By.xpath("//table[@border=\"l\"]/tbody/tr[" + r + "]/td["+ c +"]")).getText();
//                System.out.println(data);
//
//            }

//            // total no of rows  for automation practive url
//            List<WebElement>rowlist= driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr"));
//           System.out.println("Total no of rows: "+rowlist.size());
//// total no of columns
//        List<WebElement>colmnlist= driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[1]/th"));
//        System.out.println("Total no of Columns : "+colmnlist.size());
//// print all table data
//         for (int r=2;r<=rowlist.size();r++)
//         {
//             for (int c=1;c<=colmnlist.size();c++)
//             {
//                 String data= driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr["+ r +"]/td["+ c +"]")).getText();
//                 System.out.println(data);
//             }
//         }

        // handling tooltip
//        WebElement signup=driver.findElement((By.xpath("//ul[@class=\"uiList pageFooterLinkList _509- _4ki _703 _6-i\"]/descendant::a[contains(text(),'Sign Up')]")));
//        String tooltip=signup.getAttribute("title");
//        System.out.println(tooltip);

        //  capturing full page screenshot code
        //step 1-convert webdriver object into TakeScreenshot interface
//        TakesScreenshot screenshot=((TakesScreenshot) driver);
//
//       step 2-call getScreenshotAs method to create image file
//        File src= screenshot.getScreenshotAs(OutputType.FILE);
//       File dest=new File("S:\\Eclipse\\Automation22\\Screenshot\\fullPage.png");
//
//       ste 3- copy image file to destination (add commons-io dependency)
//        FileUtils.copyFile(src,dest);

        // capturing section of web page screenshot code
//        TakesScreenshot screenshot=((TakesScreenshot) driver);
//       WebElement section= driver.findElement(By.xpath("//div[@class=\"widget Wikipedia\"]"));

        //step 2-call getScreenshotAs method to create image file
//        File src= section.getScreenshotAs(OutputType.FILE);
//        File dest=new File("S:\\Eclipse\\Automation22\\Screenshot\\section.png");

        // ste 3- copy image file to destination (add commons-io dependency)
//        FileUtils.copyFile(src,dest);
//  how to open new tab or window (only applies in selenium 4)

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.facebook.com/");// for opening new url in tab

//   use of Javascript Executor
//        JavascriptExecutor js= (JavascriptExecutor)driver;
        //enter text in search box
//        js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Sunil';");
        // click on find button
//       WebElement submit= driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
//        js.executeScript("arguments[0].click();",submit);
        // refresh browser
//        js.executeScript("history.go(0)");
        //get domain name
//        String domain=js.executeScript("return document.domain;").toString();
//        System.out.println(domain);
        // get title of the webpage
//        String title= js.executeScript("return document.title;").toString();
//        System.out.println(title);

        // get title of the webpage

//        String url= js.executeScript("return document.URL;").toString();
//        System.out.println(url);
        // draw border around webelement
//               WebElement submit= driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
//            js.executeScript("arguments[0].style.border='3px solid red';",submit);

        // to zoom page
//        js.executeScript("document.body.style.zoom='50%'");

        // to get height and width of webpage
//       String height= js.executeScript("return window.innerHeight;").toString();
//       System.out.println(height);
//        String width=  js.executeScript("return window.innerWidth;").toString();
//        System.out.println(width);
        // scroll vertically till the end
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        // scroll vertically page up
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        // generate Alert pop up window
//        js.executeScript("alert('This is alert message')");

        // navigate to different page using javascript
//        js.executeScript("window.location='https://www.google.co.in/'");

        // to flash webelement
//        WebElement submit= driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]"));
//
//        String bgcolor=submit.getCssValue("backgroundColor");
//        for (int i=0;i<50;i++){
//            js.executeScript("arguments[0].style.backgroundColor='#000000'",submit);// black color
//            try{
//                Thread.sleep(20);
//            } catch (InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
//                js.executeScript("arguments[0].style.bakgroundColor='" + bgcolor + "'",submit);
//
//                 try{
//                     Thread.sleep(20);
//
//                 }catch (InterruptedException e)
//                 {
//                     e.printStackTrace();
//                 }
//        }
    // iframe
//        WebElement iframe=driver.findElement(By.xpath("//iframe[@id=\"moneyiframe\"]"));
//        driver.switchTo().frame("moneyiframe");// by id
//        driver.switchTo().frame("moneyiframe");// by name
//        driver.switchTo().frame(0);// by index if webpage have multiple iframes
//        driver.switchTo().frame(iframe);// by webelement
//        String nseindex= driver.findElement(By.id("nseindex")).getText();
//        System.out.println(nseindex);
//        // cannot switch from 1 frame to another frame- need to switch to main page
//        driver.switchTo().defaultContent();
       // find and print total iframes on webpage
//        List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
//        System.out.println("Total no of iframes on webpage :"+iframes.size());
        // nested iframes
//        driver.switchTo().frame(4);
//       WebElement iframe1= driver.findElement(By.xpath("//iframe[@src=\"text.html\"]"));
//        driver.switchTo().frame(iframe1);
//        WebElement iframe2= driver.findElement(By.xpath("//iframe[@src=\"example.html\"]"));
//        driver.switchTo().frame(iframe2);
//        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
//        // switching to parent frame
//        driver.switchTo().parentFrame();

        // scroll by pixels
//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");

        // scroll till visibility of element
//        WebElement element=driver.findElement(By.linkText("BMI Calculator"));
//        Thread.sleep(3000);
//        js.executeScript("arguments[0].scrollIntoView();",element);

        // scroll till bottom of webpage
//         js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//      scroll till visibility of element horizontally
//        js.executeScript("arguments[0].scrollIntoView();",element);

        // file upload via autoit
//        WebElement element= driver.findElement(By.id("file-upload"));
//        Actions act= new Actions(driver);
//        act.moveToElement(element).click().perform();
//
//        Runtime.getRuntime().exec("S://dis//Fileupload.exe" + " " + "S:\\RugDownloads\\download.jpg");
        // date picker
        //02-May 2024

//        String expectedDay="2";
//        String expectedMonth="May";
//        String expectedyear="2024";
//
//        driver.switchTo().frame(0);
//        driver.findElement(By.id("datepicker")).click();
//      while(true){
//         String calendermonth= driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
//          String calenderyear= driver.findElement((By.xpath("//span[@class=\"ui-datepicker-year\"]"))).getText();
//       if(calendermonth.equals(expectedMonth) && calenderyear.equals(expectedyear))
//       {
//        List<WebElement> dayslist= driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
//          for (WebElement e:dayslist)
//          {
//              String calenderDay=e.getText();
//              if(calenderDay.equals(expectedDay))
//              {
//                  e.click();
//                  break;
//              }
//          }
//          break;
//       }
//       else {
//           driver.findElement((By.xpath(" //span[@class=\"ui-icon ui-icon-circle-triangle-e\"]"))).click();
//       }
//      }
//

     //handle window Authentication pop up
     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


//       driver.close();
    }
    }

