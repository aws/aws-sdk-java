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
 * of the <i>where</i> clause in a select query.
 */
public class WhereClauseTest {

	private SimpleDBParser parser;

	@Test
	public void should_pass_for_eq() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x = '1'");
		parser.selectQuery();

		parser = new SimpleDBParser("select * from `testDB.simpleUser` where `user.company` = 'tpg'");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_malformed_eq() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x = 1");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_gt() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x > '1'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_gteq() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x >= '123.3'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_lt() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x < '123.3'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_lteq() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where x <= '123.3'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_like() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where stringField like '%asd%'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_notlike() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where stringField not like 'asd%'");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_wrong_like_expression() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where stringField like 'asd'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_between() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField between '1' and '4'");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_between_with_only_one_parameter() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField between '1'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_in() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField in ('1', '2', '3')");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_in_without_range() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField in '1'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_is_null() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField is null");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_is_not_null() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField is not null");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_is_null_with_extra_parameters() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where intField is null '1'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_every() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where every(intField) between '1' and '4'");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_every_without_operator() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where every(intField)");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_every_without_parameter() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleUser` where every() between '1' and '4'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_complex_where() throws ParseException {
		parser = new SimpleDBParser(
				"select * from `testDB.simpleUser` where not \t (attr5 in ('1','2') or (attr10 <= '1.3' and attr10 > '0')) intersection attr1  > '2.3' and (attr2 like 'asd%' or every(attr3) between '1' and '4')");
		parser.selectQuery();
	}

	@Test(expected = ParseException.class)
	public void should_fail_for_malformed_complex_where() throws ParseException {
		parser = new SimpleDBParser(
				"select * from `testDB.simpleUser` where attr1  > '2.3' and attr2 like or every(attr3) between '1' and '4'");
		parser.selectQuery();
	}

	@Test
	public void should_pass_for_where_in_parantheses() throws ParseException {
		parser = new SimpleDBParser("select * from `testDB.simpleDbUser` where (itemName()='Item_0')");
		parser.selectQuery();
	}
}
