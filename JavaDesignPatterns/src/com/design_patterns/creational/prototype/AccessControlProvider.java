package com.design_patterns.creational.prototype;
import java.util.*;

public class AccessControlProvider {
	private static Map<String, AccessControl> map = new HashMap<>();
	static{
		map.put("USER", new AccessControl("USER", "Some Work"));
		map.put("ADMIN", new AccessControl("ADMIN", "Add/Remove Users"));
		map.put("MANAGER", new AccessControl("USER", "Generate/Read Reports"));
		map.put("VP", new AccessControl("VP", "Modify Reports"));
	}
	
	public static AccessControl getAccessControl(String controlLevel){
		if(!map.containsKey(controlLevel)){
			System.out.println("Invalid Control Level");
			return null;
		}
		AccessControl assessControl = null;
		assessControl = map.get(controlLevel);
		return assessControl.clone();
	}
}
