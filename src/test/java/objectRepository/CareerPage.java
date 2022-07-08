package objectRepository;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CareerPage {
    public WebDriver driver=null;
    public CareerPage(WebDriver driver){
        this.driver=driver;
    }
    By opening1 = By.xpath("//span[text()='Technology and Engineering']");
    By opening2= By.xpath("//span[text()='User Experience Design']");
    By opening3= By.xpath("//span[text()='Apply for Positions Not Listed']");
    By avb_Openings = By.xpath("//div[@class='openings_headingTitle__3OuCt']");
    By apply = By.xpath("//div[@class='bannerComponent_applyButton__3Tc88']");
    By firstName = By.xpath("//input[@id='First_Name']");
    By lastName =By.xpath("//input[@id='Last_Name']");
    By totalExp = By.xpath("//input[@id='Total_Experience']");
    By clickNext = By.xpath("//button[text()='NEXT']");
    By email = By.xpath("//input[@id='Email']");
    By mobNo = By.xpath("//input[@id='Mobile']");
    By city =By.xpath("//input[@id='City']");
    By skillSet = By.xpath("//input[@id='Skill_Set']");
    By currentEmp = By.xpath("//input[@name='Current_Employer']");
    By currentJob = By.xpath("//input[@id='Current_Job_Title']");
    By currentSal = By.xpath("//input[@name='Current_Salary']");
    By noticePeriod = By.xpath("//select[@id='Notice_Period']");
    By lastDay = By.xpath("//input[@id='Last_Working_Day']");
    By uploadFile = By.xpath("//label[@class=' Home_cursorToHandPointer__32o32']");
    By submit = By.xpath("//button[@class='JobApplicationForm_submitButton__191Ew']");

    public void view_Opening1() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(opening1).click();
    }
    public void view_Opening2() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(opening2).click();
    }
    public void view_Opening3() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(opening3).click();
    }

    public void available_openings1() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> openings= driver.findElements(avb_Openings);
        WebElement nodeJSJob=null;
        Thread.sleep(3000);
        for (WebElement aa:openings)
        {
            System.out.println(aa.getText());
            if(aa.getText().equals("Nodejs Developer"))
            {
                nodeJSJob=aa;
            }
        }
        javascriptClick(driver,nodeJSJob);
    }
    public void available_openings2() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> openings= driver.findElements(avb_Openings);
        WebElement UXJob=null;
        Thread.sleep(3000);
        for (WebElement aa:openings)
        {
            System.out.println(aa.getText());
            if(aa.getText().contains("UX"))
            {
                UXJob=aa;
            }
        }
        javascriptClick(driver,UXJob);
    }

    public void apply_For_Job() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(apply).click();
    }
    public void fill_PersonalDetails() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(firstName).sendKeys("Automation");
        driver.findElement(lastName).sendKeys("Testing");
        driver.findElement(totalExp).sendKeys("3");
        driver.findElement(clickNext).click();
    }
    public void fill_ContactDetails() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(email).sendKeys("test@auto.com");
        driver.findElement(mobNo).sendKeys("0000000000");
        driver.findElement(city).sendKeys("Pune");
        driver.findElement(skillSet).sendKeys("Testing");
        driver.findElement(clickNext).click();
    }

    public void previous_Exp() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(currentEmp).sendKeys("Test");
        driver.findElement(currentJob).sendKeys("Test");
        driver.findElement(currentSal).sendKeys("00000");
        Select sal = new Select(driver.findElement(noticePeriod));
        sal.selectByVisibleText("15");
        driver.findElement(lastDay).sendKeys("01/07/2022");
    }

    public void upload_File() throws InterruptedException, IOException {
        Thread.sleep(2000);
        WebElement upload_file = driver.findElement(uploadFile);
        upload_file.click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\Coditas\\Desktop\\uploadfile.exe");
    }
    public void submit_Form() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(submit).click();
        Thread.sleep(2000);
    }
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    public  void takeScreenshot(String path) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        String filePath = System.getProperty("user.dir")+"//screenshot//"+path+".png";
        FileUtils.copyFile(src,new File(filePath));
    }





    public static void javascriptClick(WebDriver driver, WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }



}
