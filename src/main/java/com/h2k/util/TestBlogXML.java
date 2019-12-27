package com.h2k.util;

import java.util.ArrayList;
import java.util.List;

import com.h2k.dto.Blog;
import com.h2k.dto.Entry;

public class TestBlogXML {
	
	public static void main(String[] args) {
		Entry entryOne = new Entry();
		entryOne.setTitle("first");
		entryOne.setDescription("My first blog entry.");
		Entry entryTwo = new Entry();
		entryTwo.setTitle("tutorial");
		entryTwo.setDescription("Today we have developed a nice alias tutorial. Tell your friends! NOW!");
		
		List<Entry> entries = new ArrayList<Entry>();
		entries.add(entryOne);
		entries.add(entryTwo);
		
		Blog blog = new Blog();
		blog.setAuthor("Guilherme Silveira");
		blog.setEntries(entries);
		
		XtreamUtil util = new XtreamUtil();
		String xml = util.toXML(blog);
		System.out.println(xml);
		
		
	}

}
