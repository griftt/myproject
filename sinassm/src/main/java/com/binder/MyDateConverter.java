package com.binder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String s) {
		if(s==null){
			return null;
		}
		else if("".equals(s)){
			return null;
		}
		else{
			s=s.trim();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=null;
			try {
				date = df.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return date;
		}
		
		
		
	}

}
