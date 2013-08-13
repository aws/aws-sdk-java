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
 * of the <i>limit</i> clause in a select query.
 */
public class LimitClauseTest {

	@Test
	public void should_validate_limit() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select * from `test` limit 12");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_limit_without_number() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select * from `test` limit");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_limit_with_quoted_number() throws ParseException {
		final SimpleDBParser parser = new SimpleDBParser("select * from `test` limit '12'");
		parser.selectQuery();
	}
}
