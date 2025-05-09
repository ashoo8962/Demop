public class Largest {
    public static void main(String[] args) {
        int []arr ={3,5,0,8};

        int lar=arr[0];
        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
                lar=arr[i];

        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<small)
                small=arr[j];

        }
        System.out.println(lar);
        System.out.println(small);
    }
}
