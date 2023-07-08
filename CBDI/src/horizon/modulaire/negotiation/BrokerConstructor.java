package horizon.modulaire.negotiation;
public class BrokerConstructor {
private INegotiator neg;
private double margin;
public BrokerConstructor(INegotiator negotiator, double value) {
    neg = negotiator;
    margin = value;
}

public double getShoppingPrice(String ref) {
    return margin * neg.getStorePrice(ref);
}
}