package com.flpitu88.fileSwitcher.utilitarios;

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class MyFormatter extends SimpleFormatter {

	public String format(LogRecord record) {
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		
		return format.format(now) + " ------ " + record.getMessage() + "\r\n";
	}
	
}
