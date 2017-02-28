package com.asiainfo.integration.o2p.cfg.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class CommonUtil {
	private CommonUtil(){}
	
	public static ByteArrayOutputStream getCopyOutputStream(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  
		byte[] buffer = new byte[1024];  
		int len;  
		while ((len = is.read(buffer)) > -1 ) {  
		    baos.write(buffer, 0, len);  
		}  
		baos.flush();
		return baos;
	}
}
