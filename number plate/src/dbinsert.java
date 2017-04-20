import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbinsert {
	public static Connection getconn()
	{
		Connection cn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","hr");
			System.out.println("conn");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
    public int funcb(String a,int b,String c,String q)
    {
    	Connection cp=getconn();
    	int v=0;
    	try {
			PreparedStatement ps=cp.prepareStatement("insert into detail values(?,?,?,?)");
			ps.setString(1,a);
			ps.setInt(2,b);
			ps.setString(3,c);
			ps.setString(4,q);
			v=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
    }
    public String number()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select numpl.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public String number1()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select num1.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public String number2()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select num2.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public String number3()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select num3.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public String number4()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select num4.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public String number5()
    {
    Connection bb=getconn();
    int z = 0;
    String b="";
    try {
		PreparedStatement pr=bb.prepareStatement("select num5.nextval from dual");
		ResultSet rs=pr.executeQuery();
		rs.next();
		z=Integer.parseInt(rs.getString(1));
		b=z+"";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String t=new String();
    System.out.println("len"+b.length()+" "+b);
    if(b.length()<=4)
    {
    	if(b.length()==1)
    		t="000"+b;
    	else if(b.length()==2)
    		t="00"+b;
    	else if(b.length()==3)
    		t="0"+b;
    	else if(t.length()==4)
    		t=b;
    }
    return t;
    }
    public int numb(int n,int k)
    {
    	int y=0;
    	Connection d=getconn();
    	if(n==37)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into t7 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	else if(n==38)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into t8 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		        }
        }
    	else if(n==39)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into t9 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		        }
        }else if(n==40)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into f0 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		        }
        }else if(n==41)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into f1 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		        }
        }else if(n==42)
    	{
    		try {
				PreparedStatement po=d.prepareStatement("insert into f2 values(?)");
				po.setInt(1,k);
				y=po.executeUpdate();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		        }
        }
    	return y;
    }
}
