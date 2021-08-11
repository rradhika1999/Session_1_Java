class ZerosToLeft
{
    static void pushZerosToBeginning(int arr[], int n)
    {
        int temp = n-1;
        for (int i = n-1; i >= 0; i--)
        {
            if (arr[i] != 0)
            {
                arr[temp] = arr[i];
                temp--;
            }
        }
        for(int i=0;i<=temp; i++)
        {
            arr[i] = 0;
        }
    }
    public static void Display(int arr[],int n)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main (String[] args)
    {
        int c;
        int arr[] = {1, 3, 4, 0, 10, 0, 8, 0, 7, 0};
        int n = arr.length;
        System.out.println("Before Processing:");
        Display(arr,n);
        pushZerosToBeginning(arr, n);
        System.out.println("After Processing:");
        Display(arr,n);
    }
}