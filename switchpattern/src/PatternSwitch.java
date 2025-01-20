public class PatternSwitch {
    static interface Shape {
        abstract String getName();
    }
    record Circle(int radius) implements Shape {
        @Override
        public String getName() {
            return "Circle";
        }
    }
    record Rectangle(int width, int height) implements Shape {
        @Override
        public String getName() {
            return "Rectangle";
        }
    }

    // Compute area of a shape.
    // I know this is bad OO design (should be in the Shape interface),
    // it's just to show the syntax of simple Pattern Matching
    public static int computeArea(Shape s) {
        // Old way:
        // if (s instanceof Circle) {
        //    Circle c = (Circle)s;
        //    // work with c...
        // }
        // Pattern-matching way, combines test and cast
        if (s instanceof Circle ci) {
            return (int)(Math.PI * ci.radius());
        } else if (s instanceof Rectangle rec) {
            return rec.width * rec.height();
        } else {
            throw new IllegalArgumentException("Unknown shape " + s);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Rectangle(3,4),
        };
        for (Shape s : shapes) {
            System.out.printf("Shape(%s) area %d\n", s.getName(), computeArea(s));
        }
    }
}
