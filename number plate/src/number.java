

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class number
 */
public class number extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //static TreeSet tr=new TreeSet();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public number() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	if(request.getParameter("sub").equals("login"))
	{
		Map mp=new HashMap<String,String>();
		mp.put("praveenkumarece20@gmail.com","ppk171195");
		try{
		if(mp.get(request.getParameter("user")).equals(request.getParameter("pass")))
			response.sendRedirect("location.html");
		else
			response.sendRedirect("log.html");
		}
		catch(Exception e){
		   response.sendRedirect("log.html");}
	}
	else if(request.getParameter("sub").equals("ok"))
	{
	String a=request.getParameter("user");
	int d=Integer.parseInt(request.getParameter("mob"));
	String h=request.getParameter("cit");
	System.out.println(a+" "+d+" "+h);
     System.out.println();
    String f=number(h);
    System.out.println(f);
    int x=functiona(a,d,h,f);
    if(x==1)
    {
    	request.setAttribute("nump",f);
    	RequestDispatcher rt=request.getRequestDispatcher("Numberdisplay.jsp");
        rt.forward(request, response);
    }
	}
	}
    public int functiona(String a, int d, String h,String g) {
    	dbinsert dg=new dbinsert();
    	int x=dg.funcb(a,d,h,g);
    	return x;
	}
    public String number(String h)
    {
    	System.out.println("gg"+h);
    	dbinsert ty=new dbinsert();
    	String n="";
    	System.out.println(n);
    	switch(h)
    	{
    	case "37":n=ty.number();
    	          break;
    	case "38":n=ty.number1();
    	          break;
    	case "39":n=ty.number2();
                  break;
    	case "40":n=ty.number3();
                  break;
    	case "41":n=ty.number4();
        		  break;
    	case "42":n=ty.number5();
        		  break;
    	}
        int d=Integer.parseInt(n);
    	ArrayList al=new ArrayList();
        char a='A',b='A',c='A';
        for(int i=0;i<26;i++)
       	 al.add(a++);
        for(int j=0;j<26;j++)
        {
       	 for(int k=0;k<26;k++)
       	 al.add(b+""+c++);
       	 c='A';
       	 b++;
        }
        int k=0;
        if(d==9999)
        	k++;
        Object g=al.get(k);
        int p=0;
        dbinsert rt=new dbinsert();
        String m="";
        if(h.equals("37"))
        {
        	p=rt.numb(37,d);
        	if(p==1)
        	m="TN "+h+" "+g+" "+n;
        }
        else if(h.equals("38"))
        {
        	p=rt.numb(38,d);
        	if(p==1)
        		m="TN "+h+" "+g+" "+n;
        }
        else if(h.equals("39"))
        {
        	p=rt.numb(39,d);
        	if(p==1)
        		m="TN "+h+" "+g+" "+n;
        }
        else if(h.equals("40"))
        {
        	p=rt.numb(40,d);
        	if(p==1)
        		m="TN "+h+" "+g+" "+n;
        }
        else if(h.equals("41"))
        {
        	p=rt.numb(41,d);
        	if(p==1)
        		m="TN "+h+" "+g+" "+n;
        }
        else if(h.equals("42"))
        {
        	p=rt.numb(42,d);
        	if(p==1)
        		m="TN "+h+" "+g+" "+n;
        }
        return m;
    }
}
