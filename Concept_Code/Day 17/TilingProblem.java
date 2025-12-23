class TilingProblem
{
    public static int tilingproblem(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return tilingproblem(n-1)+tilingproblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(4));
        System.out.println(tilingproblem(3));
        
    }
}