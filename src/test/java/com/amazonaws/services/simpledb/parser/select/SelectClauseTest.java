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
 * of the <i>select</i> clause in a select query.
 */
public class SelectClauseTest {

	@Test
	public void should_validate_select_all() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select * from `test`");
		parser.selectQuery();
	}

	@Test
	public void should_validate_select_item() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select itemName() from `test`");
		parser.selectQuery();
	}

	@Test
	public void should_validate_select_count() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select count(*) from `test`");
		parser.selectQuery();
	}

	@Test
	public void should_validate_select_list_off_attributes() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select attr1,attr2, attr3 from `test`");
		parser.selectQuery();
	}

	@Test
	public void should_validate_select_list_off_attributes_with_backticks() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select `attr1.asfz`,attr2, attr3 from `test`");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_select_list_off_nested_attributes_without_backticks() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select attr1.asfz,attr2, attr3 from `test`");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_malformed_select_list_off_attributes() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select *,attr1,attr2, attr3 from `test`");
		parser.selectQuery();
	}

}
