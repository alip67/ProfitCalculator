package util;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DepositsConfig {

    DepositConfig depositconfig;

    @XmlElement(name = "deposit")

    public DepositConfig getDepositconfig() {
        return depositconfig;
    }

    public void setDepositconfig(DepositConfig depositconfig) {
        this.depositconfig = depositconfig;
    }
}
