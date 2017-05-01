package jp.nworks.dpp.service.factory;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String use() {
        return owner + " card use.";
    }
}
