import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by Niel on 7/2/16.
 */
public class ServerNameTest {
    @Test
    public void constructorTest() throws IOException {
        ServerName testServer = new ServerName("foo.bar.com");
        assertTrue(testServer.getDomainName().contains("bar.com"));
        assertTrue(testServer.getShortName().contains("foo"));
        assertTrue(testServer.getFqdn().contains("foo.bar.com"));
    }
    @Test
    public void setterTest() throws IOException{
        ServerName testServer = new ServerName("foo.bar.com");

        testServer.setDomainName("blah.org");
        assertTrue(testServer.getDomainName().contains("blah.org"));
        assertTrue(testServer.getFqdn().contains("foo.blah.org"));

        testServer.setShortName("junk");
        assertTrue(testServer.getShortName().contains("junk"));
        assertTrue(testServer.getFqdn().contains("junk.blah.org"));

        testServer.setFqdn("org.blah.junk");
        assertTrue(testServer.getDomainName().contains("blah.junk"));
        assertTrue(testServer.getShortName().contains("org"));
        assertTrue(testServer.getFqdn().contains("org.blah.junk"));
    }
}
