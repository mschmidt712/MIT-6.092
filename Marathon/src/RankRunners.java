
public class RankRunners {
     public static void main(String args[]) {
         String[] names = {
             "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
             "Matt", "Alex", "Emma", "John", "James", "Jane",
             "Emily", "Daniel", "Neda", "Aaron", "Kate"
         };
         
         int[] times = {
             341, 273, 278, 329, 445, 402, 388, 275, 243,
             334, 412, 393, 299, 343, 317, 265
         };
         
         int firstPlaceIndex = firstPlace(times);
         System.out.println(names[firstPlaceIndex] + " came in first place with a time of " + times[firstPlaceIndex]);
         int secondPlaceIndex = secondPlace(times);
         System.out.println(names[secondPlaceIndex] + " came in second place with a time of " + times[secondPlaceIndex]);
     }
     
     public static int firstPlace(int[] times) {
         int firstPlaceIndex = 0;
         int firstPlaceTime = Integer.MAX_VALUE;
         
         for (int i=0; i < times.length; i++) {
             if (times[i] < firstPlaceTime) {
                 firstPlaceTime = times[i];
                 firstPlaceIndex = i;
             }
         }
         
         return firstPlaceIndex;
     }

    public static int secondPlace(int[] times) {
        int secondPlaceIndex = 0;
        int firstPlaceIndex = firstPlace(times);
        int secondPlaceTime = Integer.MAX_VALUE;
        
        for (int i=0; i < times.length; i++) {
            if (i == firstPlaceIndex) {
                continue;
            }
            if (times[i] < secondPlaceTime || secondPlaceIndex == -1) {
                secondPlaceTime = times[i];
                secondPlaceIndex = i;
            }
        }
        
        return secondPlaceIndex;
    }
}
