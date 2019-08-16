package com.learn.test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zack.zhang
 * @projectName learn_cloud_eureka
 * @title LearnTest
 * @package com.learn.test
 * @description
 * @date 2019-08-14 13:57
 */
public class LearnTest {
	public static void main(String[] args) {
		Personal personal = new Personal();
		personal.setName("张三");
		Personal personal2 = setProperties(personal);
		System.out.println(personal);
		System.out.println(personal2);
		
	}
	private static Personal setProperties(Personal personal) {
		try {
			personal.setName("李四");
			return personal;
		} catch (Exception e) {
			personal.setName("王五");
			e.printStackTrace();
			return personal;
		} finally {
			personal.setName("赵六");
		}
		
	}
	private static void groupMax() {
		List<HashMap<String, Integer>> list = new ArrayList<>();
		List<Integer> abc = Arrays.asList(1, 2, 3);
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 10; i++) {
				HashMap<String, Integer> map = new HashMap<>();
				map.put("key", abc.get(j));
				map.put("value",i);
				list.add(map);
			}
		}
		
		Map<Integer, Optional<HashMap<String, Integer>>> collect = list.stream()
				.collect(Collectors.groupingBy(m -> m.get("key"),
				Collectors.maxBy(Comparator.comparingInt(m2 -> m2.get("value")))));
		System.out.println(collect);
	}
	
	
	
}
