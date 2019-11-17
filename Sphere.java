//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Sphere.java
//Class Sphere supports objects representing a sphere.  Each sphere object knows
//its radius, surface area and volume.
public class Sphere
{
	private double radius;
  private double surfaceArea;
	private double volume;
  //Post:	Radius, surfaceArea, and volume initialized to 0.
	public Sphere()
	{
    radius = surfaceArea = volume = 0;
		calcVolumeAndSurfaceArea();
	}
	//Post:	Radius, surfaceArea, and volume initialized to 0.
	public Sphere(double radius)
	{
    this.radius = radius;
		calcVolumeAndSurfaceArea();
		getSurfaceArea();
		getVolume();

	}
  //Post: SurfaceArea and volume of this Sphere recalculated.
	public void calcVolumeAndSurfaceArea()
	{
    surfaceArea = (4 * Math.PI * (radius * radius));
    volume = (4 / 3) * Math.PI * (radius * radius * radius);
	}
	//Pre:  Radius must be positive.
	//Post: Radius of this Sphere initialized to radius.
	//      Volume and surface area of this sphere properly initialized.
	public void setRadius(double radius)
	{
		this.radius = radius;
		calcVolumeAndSurfaceArea();
	}
  //Return:The surface area of this sphere object
	public int getSurfaceArea()
	{
		return surfaceArea;
	}
  //Return:The volume of this sphere object
	public int getVolume()
	{
		return volume;
	}
  //Return:The author of the program.
	public String name()
	{
    return "Jacob Gaylord";
	}
  //Return:	The value of this sphere in the format "radius: surface area:
  //        volume:"
	public String toString()
	{
    return "radius: " + radius + " surface area: " + getSurfaceArea() + " volume: " + getVolume();
	}
}
