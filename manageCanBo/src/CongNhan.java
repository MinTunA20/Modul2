import java.util.Scanner;

public class CongNhan extends CanBo
{
    Scanner in = new Scanner(System.in);

    String bac;

    CongNhan()
    {
        super();
    }
    CongNhan(String hoTen)
    {
        super(hoTen);
    }
    CongNhan(String hoTen, String ngaySinh)
    {
        super(hoTen, ngaySinh);
    }
    CongNhan(String hoTen, String ngaySinh, String gioiTinh)
    {
        super(hoTen, ngaySinh, gioiTinh);
    }
    CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi)
    {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
    }
    CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac)
    {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public String getHoTen()
    {
        return hoTen;
    }
    public void setNgaySinh(String ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
    public String getNgaySinh()
    {
        return ngaySinh;
    }
    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public String getGioiTinh()
    {
        return gioiTinh;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public void setBac(String bac)
    {
        this.bac = bac;
    }
    public String getBac()
    {
        return bac;
    }

    public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap bac: ");
        bac = in.nextLine();
        System.out.print("\n");
    }
    public void Xuat()
    {
        super.Xuat();
        System.out.println("Bac: " +bac);
    }
}