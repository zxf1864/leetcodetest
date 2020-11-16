import org.junit.Test;
import subject.TestLeetcode;

import java.util.Arrays;

public class TestLeetcodeExample {

    @Test
    public void TestExample(){
        //int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] people = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};

        TestLeetcode.reconstructQueue(people);
        System.out.println(Arrays.deepToString(people));
    }
}
