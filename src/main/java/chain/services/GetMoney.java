package chain.services;

import chain.Processor;

public class GetMoney extends Processor{
    private static Integer money;

    public static Integer getMoney() {
        return money;
    }

    public GetMoney(Processor nextProcessor) {
        super(nextProcessor);
    }

    public static Integer setMoney(Integer money) {
        return GetMoney.money = money;
    }
}
