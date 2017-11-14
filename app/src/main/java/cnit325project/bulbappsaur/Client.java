package cnit325project.bulbappsaur;

import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author jbartol
 */
//Handles connecting to a server
    //Is copied, will generalize and change since being inherited
public class Client implements IClient{
private String url;
private int portnum;

//set
public void seturl(String input) 
{
    this.url = input;
}
public void setportnum(int num) 
{
    this.portnum = num;
}
//get
public String geturl() 
{
    return url;
}

public int getportnum() 
{
    return portnum;
}
//other methods
public void connect(String url, int portnum)
{
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
            //String line = in.nextLine(); // get input from server
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

    public void disconnect() {

    }

    public void send() {

    }

    public void recieve() {

    }

    //constructors
public Client()
{
    
}

public Client(String url, int portnum) 
{
    this.url = url;
    this.portnum = portnum;
}
 
}  

    
