package jp.nworks.dpp.service.adapter;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public String printWeek() {
        return banner.showWithParen();
    }

    @Override
    public String pringString() {
        return banner.showWithAster();
    }
}
