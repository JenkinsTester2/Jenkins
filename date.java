import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class date
{
  public static void main(String[] args)
  {
    DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);	
		String Date = dateformat.format(cal.getTime());
		dateformat = new SimpleDateFormat("hh:mm a");
		cal.add(Calendar.HOUR_OF_DAY, 0);	
		cal.add(Calendar.MINUTE, 0);
		String time = dateformat.format(cal.getTime());
		String result = Date+" "+time;
		System.out.println("Result : "+result);
  }
}