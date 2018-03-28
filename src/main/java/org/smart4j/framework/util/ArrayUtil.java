package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

public final class ArrayUtil {
	public static boolean isEmpty(Object[] objs) {
		return ArrayUtils.isEmpty(objs);
	}

	public static boolean isNotEmpty(Object[] objs) {
		return !isEmpty(objs);
	}
}
