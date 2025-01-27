/**
 * Physics class to perform calculations based on input points in 3D space.
 */
public class Physics {

  /**
   * Velocity calculation method that inputs two 3D points and time taken to traverse
   * the distance between them and returns the velocity at which distance was
   * travelled.
   * @param one Point3D object the first point
   * @param two Point3D object the second point
   * @param elapsedTime double the time take to travel distance between them
   * @return double velocity at which distance was travelled
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    if(elapsedTime < 0 || elapsedTime == 0) {
      throw new IllegalArgumentException("Velocity cannot be 0 or negative");
    }
    double distance = one.distanceTo(two);
    return distance / elapsedTime;
  }
}
