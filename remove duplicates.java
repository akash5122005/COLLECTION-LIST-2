import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] strArray = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for(String str : strArray){
            numbers.add(Integer.parseInt(str));
        }
        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        for(Integer num : uniqueNumbers){
            System.out.print(num + " ");
        }
    }
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        Set<Integer> seen = new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();

        for(Integer num : numbers){
            if (seen.add(num)){
                result.add(num);
            }
        }
        return result;
    }

}
