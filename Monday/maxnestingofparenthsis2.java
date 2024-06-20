public class maxnestingofparenthsis2 {
    public static void main(String[] args) {
        String a="(1+(2*3)+((8)/4))+1";
        int k=findnestdepth(a);
        System.out.println("Max depth:"+k);
    }
    static int findnestdepth(String a)
    {
        int lc=0,rc=0;
        int depth=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='(')
            {
                lc++;
            }
            else if(ch==')')
            {
                rc++;
            }else{
                int k=lc-rc;
                depth=Math.max(depth,k);
            }
        }
        return depth;
    }
}
