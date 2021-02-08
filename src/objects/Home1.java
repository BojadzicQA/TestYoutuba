package objects;
/*Po uzoru na zadatak sa casa

Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite

3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video

Testirati sve napisane metode

Domaci okaciti na drajv na standardan nacin i na git*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home1 {
	public static final String URL = "https://www.youtube.com/";
	private static final String SEARCH1_XPATH = "//*[@id=\"search\"]";
	private static final String BTN1_XPATH = "//*[@id=\"search-icon-legacy\"]";

	public static void typeSong(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath("//*[@id=\"search\"]"));
		we.clear();
		 we.click();
		we.sendKeys("Rick Astley Never Gonna Give You Up");
	}

	public static void pressSearch(WebDriver driver) {
		driver.findElement(By.xpath(BTN1_XPATH)).click();
	}
}
