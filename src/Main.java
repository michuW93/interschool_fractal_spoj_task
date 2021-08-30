import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    private static final String SPACE = " ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> studentsFromCity = new HashMap();
        for (int i = 0; i < 4; i++) {
            String inputCity = scanner.nextLine();
            Integer allStudentForCity = Integer.valueOf(inputCity.split(" ")[0]);
            Integer remoteStudentsForCity = Integer.valueOf(inputCity.split(" ")[1]);
            studentsFromCity.put(allStudentForCity, remoteStudentsForCity);
        }
        System.out.println(getOnSiteStudents.apply(studentsFromCity));
    }

    private static Function<Map<Integer, Integer>, Integer> getOnSiteStudents = studentForCities -> {
        int numberOfStationary = 0;
        for(var entry : studentForCities.entrySet()){
            numberOfStationary = numberOfStationary + (entry.getKey() - entry.getValue());
        }
        return numberOfStationary;
    };

}
