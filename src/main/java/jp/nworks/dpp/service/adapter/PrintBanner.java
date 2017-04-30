package jp.nworks.dpp.service.adapter;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public String printWeek() {
        return showWithParen();
    }

    @Override
    public String pringString() {
        return showWithAster();
    }
}
