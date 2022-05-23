
public class product{
String pcode;
String pname;
int price;
public product(String pcode_get,String pname_get,int price_get)
{
pcode=pcode_get;
pname=pname_get;
price=price_get;
}
public int get_price()
{
return price;
}
public static void main(String[] args)
{
product p1=new product("s001","i phone",56000);
product p2=new product("s002","samsang",25000);
product p3=new product("s003","redmi",21000);
if(p1.price<=p3.price&&p1.price<=p2.price)
System.out.println("Lowest product ID is:"+p1.pcode);
if(p3.price<=p1.price&&p3.price<=p2.price)
System.out.println("Lowest product ID is:"+p2.pcode);

if(p2.price<=p1.price&&p2.price<=p3.price)
System.out.println("Lowest product ID is:"+p3.pcode);
}
}


