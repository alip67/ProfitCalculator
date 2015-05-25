package util;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Deposits {
    List<Deposit> deposit;

    public Deposits() {
    }
    public Deposits(List<Deposit> deposit){
        this.deposit = deposit;
    }
    @XmlElement(name = "deposit")
    public List<Deposit> getDeposit() {
        return deposit;
    }

    public void setDeposit(List<Deposit> deposit) {
        this.deposit = deposit;
    }
}
