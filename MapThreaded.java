import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
public final class MapThreaded {
private static Map<String, BigDecimal> map = new HashMap<>();
public static void main(String[] args) {
Thread a = new Thread("t1") {
@Override
public void run() {
map.put("a", BigDecimal.valueOf(7l));
System.out.println("a" + "Hello t1!");
System.out.println(map.get("a"));
//System.out.println(map.get("b"));
}
};
Thread b = new Thread("t2") {
@Override
public void run() {
map.put("a", BigDecimal.valueOf(8l));
System.out.println("Hello t2!");
System.out.println("a" + map.get("a"));
//System.out.println(map.get("b"));
}
};
a.start();
b.start();
System.out.println("Hello Android!");
System.out.println("a" + map.get("a"));
///System.out.println(map.get("b"));
}

