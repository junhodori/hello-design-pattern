package pattern.behavioral.template_method;

public class TemplateMethodTest {
    public static void main(String[] args) {
        /**
         * TemplateMethod 알고리즘 구조를 정의하는 뼈대
         * ConcreateClass 실제 알고리즘을 재정의한 클래스
         * 변경이 자주 일어나지 않는 것은 상위 클래스에 정의하고 변경이 자주 일어나는 것은 하위 클래스에 재정의한다.
         */
        TemplateMethod templateMethod = new ConcreateClass();
        templateMethod.templateMethod();
    }
}
