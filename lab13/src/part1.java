public class part1 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + ("\nSymbol: " + stock1.getSymbol1()));
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());

    }
}
class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol1, String name1) {
        symbol = symbol1;
        name = name1;
    }

    public String getSymbol1() {
        return symbol;
    }

    public void setSymbol1(String symbol1) {
        symbol = symbol1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice1) {
        previousClosingPrice = currentPrice;
        currentPrice = currentPrice1;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice1(double previousClosingPrice1) {
        previousClosingPrice = previousClosingPrice1;
    }

    public double getChangePercent() {
        return ((previousClosingPrice-currentPrice) / previousClosingPrice)*100;
    }
}
