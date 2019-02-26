/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.internal;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for SdkInternalMap
 */
public class SdkInternalMapTest {

    @Test
    public void map_equals_returns_true_when_map_contents_are_same() {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("foo", "bar");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("foo", "bar");

        Assert.assertTrue(map1.equals(map2));

        SdkInternalMap<String, String> internalMap = new
                SdkInternalMap<String, String>(map2);
        Assert.assertTrue(internalMap.equals(map1));
        Assert.assertTrue(map1.equals(internalMap));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
        Assert.assertEquals(map1.hashCode(), internalMap.hashCode());
    }

    @Test
    public void internal_map_equals_returns_true_when_map_contents_are_same() {
        Map<String, String> map1 = new SdkInternalMap<String, String>();
        map1.put("foo", "bar");

        Map<String, String> map2 = new SdkInternalMap<String, String>();
        map2.put("foo", "bar");

        Assert.assertTrue(map1.equals(map2));
        Assert.assertTrue(map2.equals(map1));
        Assert.assertEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void internal_map_to_string_returns_value_instead_of_reference() {
        Map<String, String> map1 = new SdkInternalMap<String, String>();
        map1.put("foo", "bar");

        Assert.assertNotNull(map1.toString());
        Assert.assertThat(map1.toString(), Matchers.containsString("foo"));

    }
 }
