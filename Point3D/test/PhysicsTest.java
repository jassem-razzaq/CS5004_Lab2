import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Physics class.
 */
public class PhysicsTest {
  private Point3D one;
  private Point3D two;

  double vel1;

  /**
   * Setup class for initialising points and velocity for testing.
   */
  @Before
  public void setup() {
    this.one = new Point3D();
    this.two = new Point3D(1, 1, 1);
    this.vel1 = Physics.velocity(one, two, 5);
  }

  /**
   * Test for velocity method of Physics class.
   */
  @Test
  public void velTest() {
    assertEquals(0.282842712474619, this.vel1, 0.01);
  }

  /**
   * Test for IllegalArgumentException if input elapsed time is negative or 0.
   */
  @Test(expected = IllegalArgumentException.class)
  public void negativeTest() {
    Physics.velocity(one, two, -1);
    Physics.velocity(two, one, 0);
  }

}
