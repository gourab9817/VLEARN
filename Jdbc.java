package LoginSystem;
import java.sql.*;

class Jdbc
{
    Connection c;
    Statement s;
    
    public Jdbc()
    {
        try
        {
         
          c=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","");
          s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

