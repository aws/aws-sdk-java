/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;

import com.amazonaws.util.ImmutableMapParameter;

/**
 * Unit tests for the ImmutableMapParameterTest class.
 */
public class ImmutableMapParameterTest {

	@Test
	public void testMapBuilder() {
		Map<Integer, String> builtMap = new ImmutableMapParameter.Builder<Integer, String>()
												.put(1, "one")
												.put(2, "two")
												.put(3, "three")
												.build();
		assertEquals(3, builtMap.size());
		assertEquals("one", builtMap.get(1));
		assertEquals("two", builtMap.get(2));
		assertEquals("three", builtMap.get(3));
	}
	
	@Test
	public void testOfBuilder() {
		Map<Integer, String> builtMap = ImmutableMapParameter.of(1, "one");
		assertEquals(1, builtMap.size());
		assertEquals("one", builtMap.get(1));
		builtMap = ImmutableMapParameter.of(1, "one", 2, "two");
		assertEquals(2, builtMap.size());
		assertEquals("one", builtMap.get(1));
		assertEquals("two", builtMap.get(2));
		builtMap = ImmutableMapParameter.of(1, "one", 2, "two", 3, "three");
		assertEquals(3, builtMap.size());
		assertEquals("one", builtMap.get(1));
		assertEquals("two", builtMap.get(2));
		assertEquals("three", builtMap.get(3));
		builtMap = ImmutableMapParameter.of(1, "one", 2, "two", 3, "three", 4, "four");
		assertEquals(4, builtMap.size());
		assertEquals("one", builtMap.get(1));
		assertEquals("two", builtMap.get(2));
		assertEquals("three", builtMap.get(3));
		assertEquals("four", builtMap.get(4));
		builtMap = ImmutableMapParameter.of(1, "one", 2, "two", 3, "three", 4, "four", 5, "five");
		assertEquals(5, builtMap.size());
		assertEquals("one", builtMap.get(1));
		assertEquals("two", builtMap.get(2));
		assertEquals("three", builtMap.get(3));
		assertEquals("four", builtMap.get(4));
		assertEquals("five", builtMap.get(5));
	}
	
	@Test
	public void testErrorOnDuplicateKeys() {
		try {
			Map<Integer, String> builtMap = new ImmutableMapParameter.Builder<Integer, String>()
					.put(1, "one")
					.put(1, "two")
					.build();
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException iae) {
		} catch (Exception e) {
			fail("IllegalArgumentException expected.");
		}
	}
	
	@Test
	public void testMapOperations() {
		Map<Integer, String> builtMap = new ImmutableMapParameter.Builder<Integer, String>()
											.put(1, "one")
											.put(2, "two")
											.put(3, "three")
											.build();
		assertTrue(builtMap.containsKey(1));
		assertTrue(builtMap.containsValue("one"));
		assertTrue(builtMap.values().contains("one"));
		assertEquals("one", builtMap.get(1));
		assertEquals(3, builtMap.entrySet().size());
		assertEquals(3, builtMap.values().size());

		assertEquals(3, builtMap.size());
		
		/** Unsupported methods **/
		try {
			builtMap.clear();
			fail("UnsupportedOperationException expected.");
		}  catch (UnsupportedOperationException iae) { 
		}  catch (Exception e) {
			fail("UnsupportedOperationException expected.");
		}
		try {
			builtMap.put(4, "four");
			fail("UnsupportedOperationException expected.");
		}  catch (UnsupportedOperationException iae) { 
		}  catch (Exception e) {
			fail("UnsupportedOperationException expected.");
		}
		try {
			builtMap.putAll(Collections.singletonMap(4, "four"));
			fail("UnsupportedOperationException expected.");
		}  catch (UnsupportedOperationException iae) { 
		}  catch (Exception e) {
			fail("UnsupportedOperationException expected.");
		}
		try {
			builtMap.remove(1);
			fail("UnsupportedOperationException expected.");
		}  catch (UnsupportedOperationException iae) { 
		}  catch (Exception e) {
			fail("UnsupportedOperationException expected.");
		}
	}
}
