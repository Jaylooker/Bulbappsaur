package cnit325project.bulbappsaur;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jackb on 11/13/2017.
 */

//Used to authenticate username and password (different type than JSON
public class UserClient extends Client {

    private String serverreply;

    //get
    public String getServerreply() {
        return serverreply;
    }

    @Override
    public void connect(String url, int portnum) {
        super.connect(url, portnum);
        //put try block in here
        try
        {
            Socket s = new Socket(url,portnum);
            try
            {
                //send() and receive() will be implemented in try to be overwritten in other classes
                InputStream inStream = s.getInputStream();
                OutputStream outStream = s.getOutputStream();
                PrintWriter out = new PrintWriter(outStream, true); //to server
                Scanner in = new Scanner(inStream); //from server
                Scanner userinput = new Scanner(System.in).useDelimiter("\\n"); //get input from user

                do //do once
                {
                    String inputline = userinput.nextLine(); //get client input
                    out.println(inputline); //send to server
                    String line = in.nextLine(); // get input from server
                    serverreply = line;
                    //System.out.println(line); //print server input
                    if (inputline.trim().equals("BYE"))
                    {
                        break;
                    }
                } while(userinput.hasNextLine());
            }
            finally
            {
                s.close();
            }
        }
        catch(IOException ioexc)
        {
            ioexc.printStackTrace();
        }
    }
}
