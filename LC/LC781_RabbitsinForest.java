package LC;
import java.util.*;
public class LC781_RabbitsinForest {
        public static int numRabbits(int[] answers) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int answer : answers) {
                frequencyMap.put(answer, frequencyMap.getOrDefault(answer, 0) + 1);
            }
            int totalRabbits = 0;
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int answer = entry.getKey();
                int count = entry.getValue();
                int groupSize = answer + 1;
                int numGroups = (count + groupSize - 1) / groupSize;
                totalRabbits += numGroups * groupSize;
            }

            return totalRabbits;
        }
        public static void main(String[] args){
            int[] answers = {1,1,2};
            int result = numRabbits(answers);
            System.out.println(result);
        }
    }


