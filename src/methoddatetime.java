import java.text.SimpleDateFormat;
import java.util.Date;


public class methoddatetime {
	public String date()
	{
	// TODO Auto-generated method stub
	//DateTimeFormat dformat =new DateTimeFormat();
	Date date=new Date();
	//System.out.println("Default---"+date);
	SimpleDateFormat format1 =new SimpleDateFormat("d");
	String test=format1.format(date);
	//String test=format1.format(date.after(date));
//System.out.println("customize--"+test);
	/**
	 * @param args
	 */
	return test;
	
		
		
		}

	}


