package cnit325project.bulbappsaur;

/**
 * Created by jackb on 11/13/2017.
 */

public interface IClient {
    public void connect(String url, int portnum);
    public void disconnect();
    public void send();
    public void recieve();
}
