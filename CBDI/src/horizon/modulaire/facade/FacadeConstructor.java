package horizon.modulaire.facade;
import horizon.modulaire.negotiation.BrokerConstructor;
import horizon.modulaire.negotiation.INegotiator;
import horizon.modulaire.negotiation.Negotiator;
import horizon.modulaire.negotiation.NegotiatorCheaper;

public class FacadeConstructor {
public static void main(String[] args) {
INegotiator negotiator = new Negotiator();
BrokerConstructor myBroker = new BrokerConstructor(negotiator, 1.05);
System.out.println("Price: " + myBroker.getShoppingPrice("pc1007"));
// Step 5: tie the broker to an instance of NegotiatorCheaper
INegotiator cheaperNegotiator = new NegotiatorCheaper();
myBroker = new BrokerConstructor(cheaperNegotiator, 1.05);
System.out.println("Price with cheaper negotiator: " + myBroker.getShoppingPrice("pc1007"));
}
}