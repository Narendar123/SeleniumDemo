package Strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate {

	public static void main(String[] args) {
         
		
		Date d=new Date();
		SimpleDateFormat formeter=new SimpleDateFormat("dd MMM YYYY");
		System.out.println(formeter.format(d));
		
	}

}
