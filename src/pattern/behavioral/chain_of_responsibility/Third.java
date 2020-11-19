package pattern.behavioral.chain_of_responsibility;

public class Third implements ChainOfResponsibility {
    @Override
    public boolean process(String text) {
        if (text.equals("E")) {
            System.out.println("Third 처리함 - " + text);
            return true;
        } else {
            return false;
        }
    }
}
