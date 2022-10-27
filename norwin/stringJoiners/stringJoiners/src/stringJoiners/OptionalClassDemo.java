package stringJoiners;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {
		String str[] = {"A","B","C","D","E","F","G","H","I","J"};
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		System.out.println("Value :"+checkNull.orElse("Not present"));
		System.out.println("Value :"+empty.orElse("Not present"));
		if (checkNull.isPresent()) {
			String lowercase = str[5].toLowerCase();
			System.out.println(lowercase);
			System.out.println("String present");
		} else {
			System.out.println("Not Present");
		}
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
	}
}
