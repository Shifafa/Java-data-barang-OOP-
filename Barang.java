class Barang {
	public String kode_barang;
	public String nama_barang;
	public String harga_barang;
	public String jumlah;
	public String suplier;



	public static void tambah() {
		System.out.print ("Masukan Kode Barang : ");
		kode_barang = input.nextLine ();
		System.out.print ("Masukan Nama Barang : ");
		nama_barang = input.nextLine ();
		System.out.print ("Masukan Harga Barang : ");
		harga_barang = input.nextLine ();
		System.out.print ("Masukan Jumlah Barang : ");
		jumlah = input.nextLine ();
		System.out.print ("Masukan Nama Suplier : ");
		suplier = input.nextLine ();

	}

	public void ubah() {
		System.out.print("masukan kode barang yang akan diubah : ");
			kode_barang = input.nextLine();

	}

	public void hapus() {
		System.out.print("masukan kode barang yang akan dihapus : ");
			kode_barang = input.nextLine();

	}

	public void retur() {
			System.out.print("masukan kode barang yang akan diretur : ");
			kode_barang = input.nextLine();

	}

	
}