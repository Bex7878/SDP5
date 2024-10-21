// Element interface
interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

// Concrete Element: Keyboard
class Keyboard implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

// Concrete Element: Monitor
class Monitor implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

// Concrete Element: Mouse
class Mouse implements ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

// Visitor interface
interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
}

// Concrete Visitor
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }
}

// Demo class to test Visitor pattern
public class VisitorDemo {
    public static void main(String[] args) {
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        ComputerPart mouse = new Mouse();

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();

        keyboard.accept(visitor);
        monitor.accept(visitor);
        mouse.accept(visitor);
    }
}
