import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        List<Integer> list1 = new ArrayList<>();
        for (String str : input1.split(" ")){
            list1.add(Integer.parseInt(str));
        }
        String input2 = scanner.nextLine();
        List<Integer> list2 = new ArrayList<>();
        for(String str : input2.split(" ")){
            list2.add(Integer.parseInt(str));
        }
        List<Integer> commonElements = findCommonElements(list1, list2);

        System.out.print("Common elements: ");
        for(Integer num : commonElements){
            System.out.print(num + " ");
        }
    }
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2){
        List<Integer> common = new ArrayList<>();
        Set<Integer> seen = new HashSet<>(list2);

        for(Integer num : list1){
            if (seen.contains(num) && !common.contains(num)){
                common.add(num);
            }
        }
        return common;
    }
}
