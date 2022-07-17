package OOP.InnerNestedEnum.Inner.Enum;

public class AnonymousEnumExample {
    public static void main(String[] args) {
        Direction opposite = Direction.BACKWARD.opposite();
    }
}

enum Direction {
    FORWARD(1.0) {
        public Direction opposite() {
            return BACKWARD;
        }
    },
    BACKWARD(2.0) {
        public Direction opposite() {
            return FORWARD;
        }
    };
    private double ratio;

    public abstract Direction opposite();

    Direction(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static Direction byRatio(double ratio) {
        if(ratio == 1.0) return FORWARD;
        else if(ratio == 2.0) return BACKWARD;
        else throw new IllegalArgumentException();
    }
}
