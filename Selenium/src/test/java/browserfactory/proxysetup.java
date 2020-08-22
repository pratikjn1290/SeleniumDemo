package browserfactory;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class proxysetup {

	public void proxysetuptest() {
		Proxy p = new Proxy();
		DesiredCapabilities cap = new DesiredCapabilities();
		p.setHttpProxy("localhost:7777");
		cap.setCapability(CapabilityType.PROXY, p);

		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("http://google.com");
	}

}
