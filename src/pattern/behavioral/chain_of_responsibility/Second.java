package pattern.behavioral.chain_of_responsibility;

public class Second implements ChainOfResponsibility {
    private ChainOfResponsibility chainOfResponsibility;

    public Second(ChainOfResponsibility chainOfResponsibility) {
        this.chainOfResponsibility = chainOfResponsibility;
    }

    @Override
    public boolean process(String text) {
        if (text.equals("C") || text.equals("D")) {
            System.out.println("Second 처리함 - " + text);
            return true;
        } else {
            return chainOfResponsibility.process(text);
        }
    }
}
