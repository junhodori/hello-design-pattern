package pattern.behavioral.chain_of_responsibility;

public class First implements ChainOfResponsibility {
    private ChainOfResponsibility chainOfResponsibility;

    public First(ChainOfResponsibility chainOfResponsibility) {
        this.chainOfResponsibility = chainOfResponsibility;
    }

    @Override
    public boolean process(String text) {
        if (text.equals("A") || text.equals("B")) {
            System.out.println("First 처리함 - " + text);
            return true;
        } else {
            return chainOfResponsibility.process(text);
        }
    }
}
