package input.components.segment;
import input.components.point.PointNode;
/**
 * A utility class only for representing ONE segment
 */
public class SegmentNode
{
	protected PointNode _point1;
	protected PointNode _point2;
	
	public PointNode getPoint1() { return _point1; }
	public PointNode getPoint2() { return _point2; }
	
	public SegmentNode(PointNode pt1, PointNode pt2)
	{
		_point1 = pt1;
		_point2 = pt2;
	}
	/**
	 * compares segments to check if they are equal
	 */
	@Override
	public boolean equals(Object obj)
	{
		//check that obj is not null
		if (obj == null) return false;
		//check that obj is in the same class
		if (this.getClass() != obj.getClass()) return false;
		
		//Create segment for object
		SegmentNode S = (SegmentNode) obj;
		
		//check that node 1 of segment 1 is the same as node 1 or node 2 of segment 2
		if (this.getPoint1().equals(S._point1) || this.getPoint1().equals(S._point2))
		//if they are equal do nothing
		{}
		//if the are different return false
		else return false;
		//check that node 2 of segment 1 is the same as node 1 or node 2 of segment 2
		if (this.getPoint2().equals(S._point1) || this.getPoint2().equals(S._point2))
		//if they are equal return true as both are true
		{
			return true;
		}
		//if they are not equal return false
		else return false;
	}
	
	/**
	 * Convert segment to string
	 */
	@Override
	public String toString()
	{
		//turn node to string of the form (node1),(node2)
		return (this.getPoint1().toString() + "," + this.getPoint2().toString());
	}
}