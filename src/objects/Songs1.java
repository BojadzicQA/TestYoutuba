package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Songs1 {
public static final String URL ="https://www.youtube.com/results?search_query=+Rick+Astley";
 private static final String SONG_XPATH ="//*[@id=\"video-title\"]/yt-formatted-string";
 
 public static void playSong(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SONG_XPATH));
		we.click();
		
		
	}

}
