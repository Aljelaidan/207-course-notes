/**
 * Represents a 2D rectangle with a given width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a new Rectangle with the specified width and height.
   *
   * @param w the initial width of the Rectangle
   * @param h the initial height of the Rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates and returns the area of the Rectangle.
   *
   * @return the area of the Rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the scaling factor to apply to width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * compares the area of this Rectangle to another Rectangle.
   *
   * @param other the other Rectangle to compare with
   * @return true if this Rectangle has a larger area than the other, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
