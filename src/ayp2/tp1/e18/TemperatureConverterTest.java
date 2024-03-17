package ayp2.tp1.e18;

public class TemperatureConverterTest {

	public static void main(String[] args) {
		
		float fahr = 77.50f;
		float cent = 12.00f;
	
		System.out.printf("%.2f grados fahrenheit son %.2f centígrados\n", fahr, TemperatureConverter.fahrToCent(fahr));
		System.out.printf("%.2f grados centígrados son %.2f fahrenheit\n", cent, TemperatureConverter.centToFahr(cent));
	
	}
}
