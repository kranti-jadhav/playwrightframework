package playwrightseesion;

import java.util.Iterator;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Playwright playwright = Playwright.create();
		
	
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//single element
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		Locator link = page.locator("text=Privacy Policy");
		for (int i = 0; i<link.count(); i++) {
			String linkname=link.nth(i).textContent();
			if (linkname.contains("Service privacy policy")) {
				link.nth(i).click();
				
			}
			System.out.println(linkname);
			
		}

	}

}
