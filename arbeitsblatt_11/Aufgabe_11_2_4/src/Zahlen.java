public class Zahlen {
    public static int zahlen(int x, int y) {
        int e;
        if(x > y) {
            e = x-y;
        } else
            e = y - x;
        if (e == 0)
            return 0;
        int z = 0;
        int i = 1;
        while(i <= e) {
            z = z + i;
            i++;
        }
        return z;
    }
}
