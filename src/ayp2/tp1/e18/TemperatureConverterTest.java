package ayp2.tp1.e18;

public class TemperatureConverterTest {

	public static void main(String[] args) {
		
		float fahr = 32.0f;
		float cent = 0.0f;
	
		System.out.printf("%.1f grados fahrenheit son %.1f centígrados\n", fahr, TemperatureConverter.fahrToCent(fahr));
		System.out.printf("%.1f grados centígrados son %.1f fahrenheit\n", cent, TemperatureConverter.centToFahr(cent));
	
	}
}
