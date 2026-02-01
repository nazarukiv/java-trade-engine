package journal.service;

import journal.model.Trade;

import java.util.ArrayList;
import java.util.List;

public class TradeService {
    private List<Trade> tradesList = new ArrayList<>();


    public void addTrade(Trade trade){
        if (trade!=null){
            if (trade.getRiskPercent()>0 && trade.getRiskRewardRatio()>=1){
                tradesList.add(trade);
            }
        }
    }

    public List<Trade> getAllTrades(){
        return new ArrayList<>(tradesList);
    }

    public void clearTrades(){
        tradesList.clear();
    }
}
