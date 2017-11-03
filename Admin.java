class Admin {
	public String kode_adm;
	public String nama_adm;
	public String password;
	public String level_akses;
	
	

Scanner input = new Scanner(System.in);
	public void tambah(){
				
			System.Out.print("Masukan Kode : ");
			kode_adm = input.nextLine();
			System.Out.print("Masukan Nama : ");
			nama_adm = input.nextLine();
			System.Out.print("Masukan Password : ");
			password = input.nextLine();
			System.Out.print("Jenis Akses : ");
			level_akses = input.nextLine();
	}

	public void update() {
			System.out.print("masukan kode admin yang akan diupdate : ");
			kode_adm = input.nextLine();

	}


	public void hapus(){
			System.out.print("masukan kode admin yang akan dihapus : ");
			kode_adm = input.nextLine();
	}

		
}