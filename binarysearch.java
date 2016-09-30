package com.jiangxvhua.algorithmic;

import com.jiangxvhua.util.interfaceTest;

/**
 * 二分搜索法
 * @author jiangxvhua
 * @date 创建时间  2016年9月23日 下午3:31:18
 * @version 
 *
 */
public class binarySearch {
	//摘取自java.lang.Arrays包
	public int binarysearch(char[] a, int fromIndex, int toIndex,	char key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			char midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}
	public static void main(String[] args) {		

		char [] a={'1','2','e','f','b','a','b','m','W','m','P'};
		binarySearch binarySearch=new binarySearch();
		int position = binarySearch.binarysearch(a, 1, 3, '1');
		System.out.println(position);
	}

}
