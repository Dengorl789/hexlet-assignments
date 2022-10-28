package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> list = List.of(0, 1, 2, 3, 4);

        assertEquals(List.of(0, 1, 2), App.take(list, 3));
        assertEquals(List.of(), App.take(List.of(),3));
        assertEquals(List.of(0, 1, 2, 3, 4), App.take(list,10));

//        List<Integer> appList2 = App.take(zeroList, 4);
//        List<Integer> impList2 = Implementations.wrong1(list, 1);
//        assertThat(appList2).isEqualTo(impList2);
//
//        List<Integer> appList3 = App.take(list, 10);
//        List<Integer> impList3 = Implementations.wrong2(list, 10);
//        assertThat(appList3).isEqualTo(impList3);
//
//        List<Integer> appList4 = App.take(list, 4);
//        List<Integer> impList4 = Implementations.wrong3(list, 4);
//        assertThat(appList4).isEqualTo(impList4);
        // END
    }
}
