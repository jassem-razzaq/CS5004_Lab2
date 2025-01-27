import java.util.Objects;

/**
 * Point3D class to represent a point in 3D space.
 */
public class Point3D {
  private int x;
  private int y;
  private int z;

  /**
   * Default constructor, initialises a point at origin (0, 0, 0).
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  /**
   * Constructor for Point3D class.
   * @param x int the X coordinate of point
   * @param y int the Y coordinate of point
   * @param z int the Z coordinate of point
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Copy constructor for Point3D class.
   * @param other the Point3D object to be copied
   */
  public Point3D(Point3D other) {
    this.x = other.x;
    this.y = other.y;
    this.z = other.z;
  }

  /**
   * Getter method for returning the X coordinate.
   * @return int X coordinate
   */
  public int getX() {
    return this.x;
  }

  /**
   * Getter method for returning the Y coordinate.
   * @return int Y coordinate
   */
  public int getY() {
    return this.y;
  }

  /**
   * Getter method for returning the Z coordinate.
   * @return int Z coordinate
   */
  public int getZ() {
    return this.z;
  }

  /**
   * Method to calculate and return the distance between two points in 3D space.
   * @param other the point upto which distance should be calculated
   * @return double the distance between the two points
   */
  public double distanceTo(Point3D other) {
    return Math.pow(Math.pow((other.x - this.x), 2)
            + Math.pow((other.y - this.y), 2
            + Math.pow((other.z - this.z), 2)), 0.5);
  }

  /**
   * Override method for equality.
   * @return boolean True or False based on equality of X, Y and Z coordinates
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point3D point = (Point3D) o;
    return Double.compare(x, point.x) == 0
            && Double.compare(y, point.y) == 0
            && Double.compare(z, point.z) == 0;
  }

}
