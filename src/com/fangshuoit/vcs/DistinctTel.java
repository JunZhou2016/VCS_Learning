package com.fangshuoit.vcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 去除手机号中的重复数字并进行有序排列;
 * 
 * @author xdsm
 *
 */
public class DistinctTel {

	public static final String PHONE_NUM = "1570sdf9abc610df942";

	public static void main(String[] args) {
		// 去重;
		Set<Character> numSet = new HashSet<Character>();
		char[] charArray = PHONE_NUM.toCharArray();
		
		for (char c : charArray) {
			numSet.add(c);
		}
		
		
		
		//201809191541
			
		//201809191519
		//201809191524
		//201809191530
		//201809191532

		//201809191556
		//201809191555
		
		//红先
		// 排序;
		
		//commit red to branch1
		
		//commit msg to branch1.000
		
		//测试冲突解决方案;
		// 注意基本数据类型不能使用Arrays.asList()方法将数组转化为list;
		List<Character> numList = new ArrayList<Character>(numSet);
		Collections.sort(numList);
		
		for (Character character : numList) {
			System.out.print(character);
		}

	}
}
