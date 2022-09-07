package input.components.point;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import input.components.segment.PointNode;

public class PointNodeDatabase {
	
	
	protected Set<PointNode> _points;
	
	
	
	public PointNodeDatabase() {
		
		
		
		
	}

	public PointNodeDatabase(List<PointNode> list) {
		
	}
	
	
	
	
	public void put(PointNode node) {
		
		//check if the node is not already in the set
		if(!_points.contains(node)) {
		//add the point
		_points.add(node);
		}
		
		
	}
	
	public boolean contains(double x , double y) {
		
		//check if the set is empty
		if(_points.isEmpty()) {
			//if it is empty then return false
			return false;
		}
	
		return false;
	}
	
	public boolean contains(PointNode node) {
		
		//if the set if empty return false
		if(_points.isEmpty()) {
			return false;
		}
		
		//if the set contains the node
		if(_points.contains(node)) {
			//return true
			return true;
		}
		
		return false;
	}
	
	public String getName(PointNode node) {
		
		
		//return (SOMETHING.tostring());
	}
	
	
	public String getName(double x , double y) {
		
	}
	
	public PointNode getPoint(PointNode node) {
		
		//check if the node is in the set of points
		if(_points.contains(node)) {
			
		}
		
		//if it isn't in the set then return null
		return null;
	}
	
	public PointNode getPoint(double x , double y) {
		
	}
	
	
}




