package pattern.behavioral.template_method;

public class ConcreateClass extends TemplateMethod {
    @Override
    protected void a() {
        System.out.println("a");
    }

    @Override
    protected void b() {
        System.out.println("b");
    }
}
