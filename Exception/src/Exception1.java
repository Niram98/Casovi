
public class Exception1 {

	public static void main(String[] args) {
		try {
			int x = 1;
			int y = 10/x;
			System.out.println("x = " + x + "; y = " + y);
			if(x == 1) {
				throw new MojaGreska("Nasa greska");
			}
		
			try {
				if(x == 2) {
					int[] z = {1};
					System.out.println(z[10]);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Ne postoji element u nizu!");
				throw e;
			}	
		}  catch (MojaGreska e) {
			e.printStackTrace();
		}  catch (ArithmeticException e) {
			System.err.println("Deljenje nulom nije dozvoljeno!");
		} finally {
			System.out.println("Ovo se uvek izvrsava!");
		}
	}

}
