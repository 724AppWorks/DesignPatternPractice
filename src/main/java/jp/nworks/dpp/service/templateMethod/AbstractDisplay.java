package jp.nworks.dpp.service.templateMethod;

public abstract class AbstractDisplay {
    public abstract String open();

    public abstract String print();

    public abstract String close();

    public final String display() {
        String result = "";
        result += open();
        for (int i = 0; i < 5; i++) {
            result += print();
        }
        result += close();
        return result;
    }
}
