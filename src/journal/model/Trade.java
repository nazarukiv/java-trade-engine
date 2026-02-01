package journal.model;
import java.time.LocalDateTime;

public class Trade {
    private LocalDateTime date;
    private Session session;
    private String pair;
    private Direction direction;
    private Result result;
    private Double riskPercent;
    private Double riskRewardRatio;

    public Trade(String pair, Direction direction, Result result, Double riskPercent, Double riskRewardRatio, LocalDateTime date, Session session){
        this.pair = pair;
        this.direction = direction;
        this.result = result;
        this.riskPercent = riskPercent;
        this.riskRewardRatio = riskRewardRatio;
        this.date = date;
        this.session =session;
    }

    //getters
    public Double getRiskRewardRatio() {
        return riskRewardRatio;
    }

    public Double getRiskPercent() {
        return riskPercent;
    }

    public Result getResult() {
        return result;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getPair() {
        return pair;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Session getSession() {
        return session;
    }

}
