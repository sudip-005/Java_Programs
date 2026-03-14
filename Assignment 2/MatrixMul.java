class MatrixMul {
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4}}, b={{2,0},{1,2}}, c=new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    c[i][j]+=a[i][k]*b[k][j];
        System.out.println(c[0][0]+" "+c[0][1]);
    }
}