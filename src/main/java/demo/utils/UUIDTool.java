package demo.utils;

import java.util.UUID;

/**
 * 此工具类用于生成uuid
 *@author zhuliyu 2017/4/18
 *
 */
public class UUIDTool {

	public UUIDTool() {
	}

	public static String getUUID() {

		return UUID.randomUUID().toString().replace("-", "");
	}

}
