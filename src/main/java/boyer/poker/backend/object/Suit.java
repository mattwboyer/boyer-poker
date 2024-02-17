package boyer.poker.backend.object;

public class Suit {
    
    private String name;

    public Suit(final String name) {
        this.name = name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
