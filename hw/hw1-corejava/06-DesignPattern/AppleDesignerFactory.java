import java.io.Serializable;

public class AppleDesignerFactory implements Serializable, Cloneable {
    private static AppleDesignerFactory instance;

    private AppleDesignerFactory() {
    }

    public static AppleDesignerFactory getInstance() {
        if (instance == null) {
            return new AppleDesignerFactory();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }
}
