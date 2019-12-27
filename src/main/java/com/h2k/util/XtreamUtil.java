package com.h2k.util;

import com.h2k.dto.Blog;
import com.h2k.dto.EmployeeTO;
import com.h2k.dto.Entry;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class XtreamUtil {
	
	XStream xstream = null;
	
	public XtreamUtil() {
	     xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);;
		 xstream.processAnnotations(EmployeeTO.class);
		 xstream.processAnnotations(Blog.class);
		 xstream.processAnnotations(Entry.class);
	}

	public static void main(String[] args) {
		
		XtreamUtil util = new XtreamUtil();
		
		EmployeeTO emp = new EmployeeTO();
		emp.setEmpNumber(100);
		emp.setFirstName("Neil");
		emp.setLastName("Armstrong");
		emp.setAddress("2010 Cumberland PWKY");
		emp.setDesgination("Manager");
		
		String xml = util.toXML(emp);
		System.out.println(xml);
		
		EmployeeTO emp2 = (EmployeeTO) util.toObject(xml);
		System.out.println("Received from XML :: "  +  emp2.getEmpNumber());
	}
	
	
	public String toXML(Object obj) {
		String xml = xstream.toXML(obj);
		return xml;
	}
	
	
	public Object toObject(String xml) {
		Object obj = xstream.fromXML(xml);
		return obj;
	}

}
