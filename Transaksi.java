class Transaksi {
	public String no_trans;
	public String tgl_trans;
	



	public void membuat() {
System.out.print("masukan nomor transaksi : ");
no_trans = input.nextLine();
System.out.print("masukan tanggal transaksi : ");
tgl_trans = input.nextLine();
	}
public void ubah(){
	System.out.print("silahkan masukan nomor transaksi yang akan diubah : ");
	no_trans = input.nextLine();
}
	public boolean apakahHabis() {
System.out.print("silahkan masukan nomor transaksi yang akan dihapus : ");
no_trans = input.nextLine();

	}
}