package playwrightseesion;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Allamezonlinks {

	public static void main(String[] args) {
		

		Playwright playwright = Playwright.create();
	
	
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.amazon.in/");
/*List<String> amezonlinks =page.locator("a:has-text('amazon')").allInnerTexts();
	System.out.println(amezonlinks);
	amezonlinks.stream().forEach(e ->System.out.println(e));   */
		 
 Locator footerlink= page.locator("div.navAccessibility:has(a[href='http://www.amezon.jobs/']");
 footerlink.allInnerTexts().forEach(e->System.out.println(e));
 
	}

}
