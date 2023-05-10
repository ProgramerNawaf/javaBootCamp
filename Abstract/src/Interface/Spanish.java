package Interface;

public class Spanish implements Language{
    @Override
    public String getName() {
        return "Spanish";
    }

    @Override
    public int numOfContries() {
        return 20;
    }
}
