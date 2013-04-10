/*
 ===========================================================================
 Copyright (c) 2013 3Pillar Global

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 ===========================================================================

 */
package com.amazonaws.services.simpledb.parser.select;

import com.amazonaws.services.simpledb.parser.ParseException;
import com.amazonaws.services.simpledb.parser.SimpleDBParser;
import org.junit.Test;

/**
 * Test cases for the SimpleDBParser focusing on the particular aspects
 * of the <i>sort</i> clause in a select query.
 */
public class SortClauseTest {

	@Test
	public void should_validate_sort_without_specified_order() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select * from `test` where attr is not null order by attr");
		parser.selectQuery();
	}

	@Test
	public void should_validate_sort_asc_order() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser(
				"select * from `test` where attr is not null order by attr asc");
		parser.selectQuery();
	}

	@Test
	public void should_validate_sort_desc_order() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser(
				"select * from `test` where attr is not null order by attr desc");
		parser.selectQuery();
	}

	@Test
	public void should_validate_sort_with_itemName() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser(
				"select * from `test` where itemName() is not null order by itemName() desc");
		parser.selectQuery();
	}

	@Test
	public void should_validate_sort_with_nested_attr() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser(
				"select * from `test` where `attr.nested` is not null order by `attr.nested` desc");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_malformed_sort() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser(
				"select * from `test` where itemName() is not null orderby itemName() desc");
		parser.selectQuery();
	}
}
