public class nextlLarnextSmall {
    public static void main(String[] args) {
        int arr[]={5,1,9,2,1,7};
        int res[]=new int[arr.length];
        int larindexes[]=new int[arr.length];
        findnextlar(arr,arr.length,res,larindexes);
        findnextsmall(arr,arr.length,res,larindexes);
    }
    static void findnextlar(int[] arr,int n,int[] res,int[] larindexes)
    {
        
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==n-2)
            {
                res[n-1]=-1;
                larindexes[n-1]=-1;
            }
            for(int j=i+1;j<n;j++)
            {
                
                if(arr[j]>arr[i])
                {
                    larindexes[i]=j;
                    res[i]=arr[j];
                    
                    break;
                }
                else{
                    larindexes[i]=-1;
                    res[i]=-1;
                }

            }
        }
        for(int i:res)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:larindexes)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
    }

    static void findnextsmall(int[] arr,int n,int[] res,int[] larindexes)
    {
        for (int i = 0; i < n; i++) {
            res[i] = -1; 
            int nextLargerIndex = larindexes[i];
            if (nextLargerIndex != -1) {
                for (int j = nextLargerIndex + 1; j < n; j++) {
                    if (arr[j] < arr[nextLargerIndex]) {
                        res[i] = arr[j];
                        break;
                    }
                }
            }
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
    

