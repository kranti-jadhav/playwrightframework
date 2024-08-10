package playwrightseesion;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasic {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
	
		LaunchOptions launchoption = new LaunchOptions();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://playwright.dev/java/docs/browsers");
	
		String title = page.title();
		System.out.println("the title is :" + title);
		String url = page.url();
		System.out.println("the url is :" + url);
		//page.pause();
		
		BrowserContext context1 = browser.newContext();
		Page page2 = context1.newPage();
		page2.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		page2.fill("#Form_getForm_Name", "kranti");
		System.out.println(page.title());
	

		BrowserContext context3 = browser.newContext();
		Page page3 = context3.newPage();
		page3.navigate("http://www.google.com");
		System.out.println(page3.title());
		
        page.close();
        page2.close();
        page3.close();
	
	
	
	
	
	
	}
	

}
