package com.gl051.dateformat;

import com.gl051.ISample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample implements ISample {

	@Override
	public String getDescription() {
		return "Date formatting";
	}

	@Override
	public void run() {
		// Initialize to current UTC Date/Time
				Date myDate = new Date(); 
				String sDate;
				String dateFormat = "yyyy/MM/dd";
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
				SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);
				// We want the parse method to throw and exception if string does not match format
				dateFormatter.setLenient(false);
				
				System.out.println("------------------------------------------");
				System.out.println("Test parsing date:");
				System.out.println("Enter a date [" + dateFormat +"]:");
				
				try {
					sDate = br.readLine();
					myDate = dateFormatter.parse(sDate);
					System.out.println("The date stored in memory is: " + myDate.toString());
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				} catch (ParseException e) {
					System.out.println("The program couldn't parse the date with the current format");
				} catch (Exception e3) {
				    System.out.println(e3.getMessage());
		        }
					    
				System.out.println("------------------------------------------");
				System.out.println("Test formatting date:");
				myDate = new Date();
				dateFormat = "yyyy/MM/dd HH:MM:ss";
				dateFormatter.applyPattern(dateFormat);
				sDate = dateFormatter.format(myDate);
				System.out.println("Current date: " + sDate);
						
				while (true){
					try {
						System.out.println("Enter a date format (write 'stop' to terminate):");
						dateFormat = br.readLine();
							
						if ("stop".equals(dateFormat))
							break; 
							
						dateFormatter.applyPattern(dateFormat);
						sDate = dateFormatter.format(myDate);
						System.out.println(sDate);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e){
						System.err.println("Found an  Illegal Argument Exception");
					}
				}
				
				System.out.println("Tour Stopped. Good bye!");
	}

}
