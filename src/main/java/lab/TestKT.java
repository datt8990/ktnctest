package lab;

import org.junit.Assert;
import org.junit.Test;

public class TestKT {

    int tt(int... a) {
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        return tong;
    }

    @Test
    public void test() {
        Assert.assertEquals(10, tt(2,3,4));
    }
    @Test
    public void test1() {
        Assert.assertEquals(9, tt(2,3,4));
    }
    @Test
    public void test2() {
        Assert.assertEquals(12, tt(2,6,4));
    }
    @Test
    public void test3() {
        Assert.assertEquals(13, tt(2,3,4));
    }
    @Test
    public void test5() {
        Assert.assertEquals(10, tt(3,3,4));
    }


}
