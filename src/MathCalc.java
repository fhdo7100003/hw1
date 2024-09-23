public class MathCalc {
  static double sphereVolume(double diameter) {
    return 4. * Math.PI * Math.pow(diameter / 2., 3.) / 3.;
  }

  public static void main(String[] args) {
    double volSun = sphereVolume(865_000);
    double volEarth = sphereVolume(7600);
    System.out.printf(
        "Volume of earth: %.0f cubic miles, volume of sun: %.0f cubic miles, volume ratio of sun to earth: %f%%\n",
        volEarth,
        volSun,
        volSun / volEarth * 100.0);
  }
}
