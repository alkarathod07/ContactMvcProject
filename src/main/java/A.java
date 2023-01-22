import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		List<String>list=List.of("A","B","C","D","E","F","G","H","I");
		List<String> collect = list.stream().sorted(Comparator.reverseOrder()).limit(6).skip(5).collect(Collectors.toList());
	System.out.println(collect);
		
	}/*Input = {"A","B","C","D","E","F","G","H","I"}
Output =E
santosh bikkad2:28 PM
Alka Alka Rathod
santosh bikkad2:49 PM
Loop -15 , Hashmap- 10,  Java 8 =10.*/

}
