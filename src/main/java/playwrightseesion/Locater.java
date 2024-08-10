package playwrightseesion;

import java.lang.reflect.AccessFlag.Location;
import java.util.List;
import java.util.function.Consumer;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Locater {
	public static void main(String[] args)
	{
		Playwright playwright = Playwright.create();
		
		LaunchOptions launchoption = new LaunchOptions();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//single element
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		//Locator contactsales = page.locator("text=Contact Sales");
		//contactsales.hover();
		//contactsales.first().click();
		//multiple element
		Locator countryoption=page.locator("select#Form_getForm_Country option");
		System.out.println(countryoption.count());
		for (int i = 0; i < countryoption.count(); i++) {
			String countryname= countryoption.nth(i).textContent();
		System.out.println(countryname);
		}
		
		
		//List<String> optiontextlist=countryoption.allTextContents();
		//for (String element : optiontextlist) {
		//System.out.println(element);
			
		}
	 

		
		
		
	}
	
	
	
	


