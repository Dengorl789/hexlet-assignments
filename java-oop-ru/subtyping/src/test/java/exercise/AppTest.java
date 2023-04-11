package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;


class AppTest {
    @Test
    void testSwapKV() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value"));
        storage.set("key2", "value2");
        Map<String, String> map = App.swapKeyValue(storage);

        assertThat(map.getOrDefault("key3", "default")).isEqualTo("default");
        assertThat(map.getOrDefault("value", "")).isEqualTo("key");
        assertThat(map.getOrDefault("value2", "")).isEqualTo("key2");
    }

    @Test
    void testSwapKV2() {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        Map<String, String> map = App.swapKeyValue(storage);
        Map<String, String> expected = Map.of("bar", "foo", "zoo", "bar");
        assertThat(map).isEqualTo(expected);
    }
}
