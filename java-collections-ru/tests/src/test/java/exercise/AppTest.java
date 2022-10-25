package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> rightList1 = App.take(list, 4);
        assertThat(rightList1).isEqualTo(list);


        List<Integer> wrongList1 = new ArrayList<>();
        wrongList1.add(0);

        List<Integer> wrongTestList1 = App.take(wrongList1, 1);
        assertThat(wrongTestList1).isEqualTo(wrongList1);


        List<Integer> wrongList2 = new ArrayList<>();
        wrongList2.add(0);

        List<Integer> wrongTestList2 = App.take(wrongList2, 8);
//        wrongList2.add(100);
        assertThat(wrongTestList2).isEqualTo(wrongList2);


        List<Integer> wrongList3 = new ArrayList<>();
        wrongList3.add(0);

        List<Integer> wrongTestList3 = App.take(wrongList3, 2);
//        wrongList3.add(10);
        assertThat(wrongTestList3).isEqualTo(wrongList3);

        // END
    }
}
