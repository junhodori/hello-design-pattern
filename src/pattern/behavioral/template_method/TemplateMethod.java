package pattern.behavioral.template_method;

public abstract class TemplateMethod {
    protected abstract void a();
    protected abstract void b();

    public void templateMethod() {
        a();
        b();
    }
}
