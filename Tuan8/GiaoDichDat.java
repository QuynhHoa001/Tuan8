package Tuan8;
import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public GiaoDichDat() {

	}
	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiDat(loaiDat);
	}
	public void setLoaiDat(String loaiDat) {
		if (loaiDat == null
				|| !(loaiDat.equalsIgnoreCase("A") || loaiDat.equalsIgnoreCase("B") || loaiDat.equalsIgnoreCase("C"))) {
			throw new IllegalArgumentException("Loai dat chi duoc la A, B, C");
		}
		this.loaiDat = loaiDat.toUpperCase();
	}
	public String getLoaiDat() {
		return loaiDat;
	}

	@Override
	public double thanhTien() {
		if ("A".equalsIgnoreCase(loaiDat)) {
			return getDienTich() * getDonGia() * 1.5;
		}
		return getDienTich() * donGia;
	}

	@Override
	public String toString() {
		return "[Dat] " + super.toString() + "| Loai Dat: " +  loaiDat ;
	}
	
}