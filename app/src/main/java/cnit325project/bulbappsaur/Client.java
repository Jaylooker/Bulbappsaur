package cnit325project.bulbappsaur;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;

import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author jbartol
 */
//Handles connecting to a server
    //Is copied, will generalize and change since being inherited
    //TODO: make client extend service
public class Client implements IClient, Parcelable{
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
//IClient methods
public void connect(String url, int portnum)
{

}

    public void disconnect() {

    }

    public void send() {

    }

    public void recieve() {

    }

    //parcelable methods and constructors

    public Client(Parcel in)
    {
        this.url = in.readString();
        this.portnum = in.readInt();
    }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.portnum);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Client> CREATOR = new Creator<Client>() {
        @Override
        public Client createFromParcel(Parcel in) {
            return new Client(in);
        }

        @Override
        public Client[] newArray(int size) {
            return new Client[size];
        }
    };

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

    
