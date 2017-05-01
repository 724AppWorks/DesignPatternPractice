package jp.nworks.dpp.service.templateMethod;

public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public String open() {
        return printLine();
    }

    @Override
    public String print() {
        return "|" + string + "|";
    }

    @Override
    public String close() {
        return printLine();
    }

    private String printLine() {
        String line = "+";
        for (int i = 0; i < width; i++) {
            line += "-";
        }
        line += "+";
        return line;
    }
}
