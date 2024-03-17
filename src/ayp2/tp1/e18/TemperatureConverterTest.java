package ayp2.tp1.e18;

public class TemperatureConverterTest {

	public static void main(String[] args) {
		float fahr = 77.5f;
		float cent = TemperatureConverter.fahrToCent(fahr);
		System.out.printf("%.2f grados fahrenheit son %.2f centígrados", fahr, cent);
	}
}
