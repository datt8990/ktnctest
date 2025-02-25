package lab;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    List<SinhVien> sinhVienList = new ArrayList<>();

    public SinhVienService() {
        sinhVienList.add(new SinhVien("SV01", "Nguyen Van A", 20, 8.5f, 1, "Hanoi"));
        sinhVienList.add(new SinhVien("SV02", "Le Thi B", 22, 7.2f, 2, "HCM"));
    }

    public String updateSV(String maSV, String tenMoi) {
        if (maSV.isEmpty() || tenMoi.isEmpty()) {
            return "Invalid Input";
        }
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV().equals(maSV)) {
                sv.setTen(tenMoi);
                return "Cập nhật thành công";
            }
        }
        return "Không tìm thấy sinh viên";
    }
}
