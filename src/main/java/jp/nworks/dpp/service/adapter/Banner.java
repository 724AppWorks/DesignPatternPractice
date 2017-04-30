package jp.nworks.dpp.service.adapter;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public String showWithParen(){
        return "(" + string + ")";
    }

    public String showWithAster(){
        return "*" + string + "*";
    }
}
