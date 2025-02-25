package lab;

import org.junit.Assert;
import org.junit.Test;

public class Bai2Test {

    SinhVienService service = new SinhVienService();

    @Test
    public void test() {
        Assert.assertEquals("Cập nhật thành công", service.updateSV("SV01", "dsfdsf"));
    }
}
