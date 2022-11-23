package xyz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {
		List<Integer> intStream = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
		int partitionSize = 10;
		System.out.println(intStream.size());
		List<List<Integer>> partition = new ArrayList<>();
		for (int i = 0; i < intStream.size(); i += partitionSize) {
			partition.add(intStream.subList(i, Math.min(i + partitionSize, intStream.size())));

		}
		System.out.println(partition);
	
	}

}
