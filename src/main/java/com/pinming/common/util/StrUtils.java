package com.pinming.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StrUtils {

	public static String createOrderCode(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return sdf.format(new Date());
	}
}
