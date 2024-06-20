public class nextsmallestandLargest {
    public static void main(String[] args) {
        int arr[]={5,1,9,2,1,7};
        int res[]=new int[arr.length];
        findnextlar(arr,arr.length,res);
        findnextsmall(arr,arr.length,res);
        
    }
    static void findnextlar(int[] arr,int n,int[] res)
    {
        
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==n-2)
            {
                res[n-1]=-1;
            }
            for(int j=i+1;j<n;j++)
            {
                
                if(arr[j]>arr[i])
                {
                    res[i]=arr[j];
                    
                    break;
                }
                else{
                    res[i]=-1;
                }

            }
        }
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }
    static void findnextsmall(int[] arr,int n,int[] res)
    {
        for(int i=0;i<n-1;i++)
        {
            if(i==n-2)
            {
                res[i]=-1;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    res[i]=arr[j];
                    break;
                }
                else{
                    res[i]=-1;
                }
            }
        }
        for(int i:res)
        {
            System.out.print(i+" ");
        }
    }
}
