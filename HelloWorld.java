class HelloWorld{
    public static void main (String a[]) {
        int[][] a1 = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10}
        };
        for (int[] i : a1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        String z = "Hello";
        z = "World";
        System.out.println(z); 
    }
}


