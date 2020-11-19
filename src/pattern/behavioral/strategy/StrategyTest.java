package pattern.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 7, 9, 1);

        // 컨텍스트1 에는 전략A 의 오름차순 정렬 적용
        Context context1 = new Context(new StrategyA());
        context1.setList(list);
        context1.sort();
        System.out.println(context1.getList());

        // 컨텍스트2 에는 전략B 의 내림차순 정렬 적용
        Context context2 = new Context(new StrategyB());
        context2.setList(list);
        context2.sort();
        System.out.println(context2.getList());
    }
}
