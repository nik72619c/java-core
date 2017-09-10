import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class dateFormatDemo {

	public static void main(String[] args) {
		Locale locale1= new Locale("hi","IN");
		Locale locale2= new Locale("fr","FR");
		Date date= new Date(); 
		System.out.println(date);
		
	DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,locale2);
		
		String result= df.format(date);
		System.out.println(result);
		
		ResourceBundle rb= ResourceBundle.getBundle("messages",locale2);
		
		String resource= rb.getString("welcomemsg");
		System.out.println(resource);

		
	}

}
