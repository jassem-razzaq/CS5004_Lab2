import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Point3D class.
 */
public class Point3DTest {
  private Point3D one;
  private Point3D one1;
  private Point3D two;
  private Point3D deef;
  private Point3D poser;

  /**
   * Setup to initialise a few points for testing.
   */
  @Before
  public void setup() {
    this.one = new Point3D(1, 2, 3);
    this.one1 = new Point3D(1, 2, 3);
    this.two = new Point3D(7, 8, 9);
    this.deef = new Point3D();
    this.poser = new Point3D(one);
  }

  /**
   * Test for getter methods and default constructor of Point3D class.
   */
  @Test
public void parameterEquals() {
    assertEquals(1, this.one.getX());
    assertEquals(2, this.one.getY());
    assertEquals(3, this.one.getZ());

    assertEquals(0, this.deef.getX());
    assertEquals(0, this.deef.getY());
    assertEquals(0, this.deef.getZ());
  }

  /**
   * Test for copy constructor of Point3D class.
   */
  @Test
  public void copyTest() {
    assertEquals(1, this.poser.getX());
    assertEquals(2, this.poser.getY());
    assertEquals(3, this.poser.getZ());
  }

  /**
   * Test for equality override of Point3D class.
   */
  @Test
  public void isEqual() {
    Assert.assertTrue(this.one.equals(this.one1));
    Assert.assertFalse(this.one.equals(this.two));
  }

  /**
   * Test for distance calculating method of Point3D class.
   */
  @Test
  public void distanceTest() {
    assertEquals(6.09359740010496E14, this.one.distanceTo(this.two), 0.01);
  }
}
