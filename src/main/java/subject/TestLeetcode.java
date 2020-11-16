package subject;

import java.util.Arrays;
import java.util.Comparator;

public class TestLeetcode {
    public static int[][] reconstructQueue(int[][] people) {

        //[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
        for (int i = 0; i < people.length; i++){
            for (int j = i + 1; j < people.length; j++){
                if (people[j][0] > people[i][0] ||
                        (people[j][0] == people[i][0] && people[j][1] < people[i][1])){
                    int temp1 = people[j][0];
                    int temp2 = people[j][1];
                    people[j][0] = people[i][0];
                    people[j][1] = people[i][1];
                    people[i][0] = temp1;
                    people[i][1] = temp2;
                }
            }
        }
//        System.out.println("sorted: ");
//        System.out.println(Arrays.deepToString(people));
//        System.out.println("     ");


        //[[7,0],[7,1], [6,1],[5,0], [5,2],[4,4],]
        //[[7,0],[6,1],[7,1], [5,0], [5,2],[4,4],]
        //[[5,0], [7,0],[6,1],[7,1], [5,2],[4,4],]
        //[[5,0], [7,0],[6,1],[5,2],[7,1], [4,4],]
        //[[5,0], [7,0],[6,1],[5,2],[4,4],[7,1], ]
        for (int i = 0; i < people.length; i++){
            int index = people[i][1];

            int temp1 = people[i][0];
            int temp2 = people[i][1];
            for (int j = i; j > index; j --){
                people[j][0] = people[j-1][0];
                people[j][1] = people[j-1][1];
                //System.out.println(Arrays.deepToString(people));
            }
            people[index][0] = temp1;
            people[index][1] = temp2;

//            System.out.println(Arrays.deepToString(people));
//            System.out.println("     ");

        }
        //[ [4,4],[5,0], [5,2],[6,1],[7,0],[7,1],]

        return people;
    }
}
