package com.fangshuoit.vcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ȥ���ֻ����е��ظ����ֲ�������������;
 * 
 * @author xdsm
 *
 */
public class DistinctTel {

	public static final String PHONE_NUM = "1570sdf9abc610df942";

	public static void main(String[] args) {
		// ȥ��;
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
		
		//����
		// ����;
		
		//commit red to branch1
		
		//commit msg to branch1.000
		
		//���Գ�ͻ�������;
		// ע������������Ͳ���ʹ��Arrays.asList()����������ת��Ϊlist;
		List<Character> numList = new ArrayList<Character>(numSet);
		Collections.sort(numList);
		
		for (Character character : numList) {
			System.out.print(character);
		}

	}
}
