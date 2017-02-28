package com.asiainfo.integration.o2p.cfg.util;

import java.util.List;

public final class ListUtil {
	
	private ListUtil(){}

	public static String getString(List<?> list) {
		if (list == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : list) {
			sb.append(o.toString() + " ");
		}
		return sb.toString().trim();
	}

}
