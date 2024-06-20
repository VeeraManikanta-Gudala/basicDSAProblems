class DBconn{
    private static DBconn conn = null;
    public static DBconn getInstance(){
        if(conn == null){
            conn = new DBconn();
        }
        return conn;
    }
}
public class SingleTonCls
{
    public static void main(String[] args) {
        DBconn newConn = DBconn.getInstance();
        DBconn oldCOnn = DBconn.getInstance();
        if(newConn == oldCOnn){
            System.out.println("Equal");
        }else {
            System.out.println("notEqual");
        }
    }
}
