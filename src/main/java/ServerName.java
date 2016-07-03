/**
 * Created by Niel on 7/2/16.
 */
public class ServerName {
    public String fqdn;
    public String shortName;
    public String domainName;

    public ServerName(String fqdn) {
        this.fqdn = fqdn;
        this.shortName = fqdn.split("\\.")[0];
        this.domainName = fqdn.substring(shortName.length() + 1);
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
        this.shortName = fqdn.split("\\.")[0];
        this.domainName = fqdn.substring(shortName.length() + 1);
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
        this.fqdn = shortName + "." + this.domainName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
        this.fqdn = this.shortName + "." + domainName;
    }
}
