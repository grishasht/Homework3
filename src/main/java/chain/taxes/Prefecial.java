package chain.taxes;

public class Prefecial implements Taxes {
    public static Integer getPercent() {
        return percent;
    }

    private static final Integer percent = 5;

    @Override
    public Integer putMoney(Integer amount) {
        return amount;
    }
}
