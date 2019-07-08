import java.util.AbstractList;

public class MyList extends AbstractList<String> {
    @Override
    public String get(final int index) {
        return null;
    }
    @Override
    public int size() {
        return 1;
    }

    public void newMethod() {
        System.out.println("new method");
    }

    public void masterMethod() {
        System.out.println("master");
    }

    public void newFix() {
        System.out.println("new fix");
    }
}
