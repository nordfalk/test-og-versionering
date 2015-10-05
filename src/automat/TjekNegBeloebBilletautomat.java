package automat;

public class TjekNegBeloebBilletautomat
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		automat.setBilletpris(1000); // burde blive ignoreret da vi ikke er logget ind

		int retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
			System.out.println("Automaten har fejl, ØV!!!");			
		} else {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		}
	}
}