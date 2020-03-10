
import org.telegram.telegrambots.ApiContextInitializer;

public class App
{
	    public static void main(String[] args) {
	        ApiContextInitializer.init();
	        Bot dmemesBot = new Bot("dmemesBot", "840627187:AAFdFcesoqgwFQJAysVudOnlG-sxMYNk3LM");
	        dmemesBot.botConnect();
	    }
}
