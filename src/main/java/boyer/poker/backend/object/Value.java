package boyer.poker.backend.object;

public class Value {
    
    private String name;
    private int value;

    public Value(final String name, final int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}
