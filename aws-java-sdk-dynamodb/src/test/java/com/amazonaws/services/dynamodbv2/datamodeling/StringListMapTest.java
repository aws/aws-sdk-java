/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper.StringListMap;

import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * Unit tests for {@link StringListMap}.
 */
public class StringListMapTest {

    private StringListMap<Integer> map() {
        final StringListMap<Integer> map = new StringListMap<Integer>();
        for (int i = 1, its =  1; i <= its; i++) { map.add("A", Integer.valueOf(i)); }
        for (int i = 1, its = 25; i <= its; i++) { map.add("B", Integer.valueOf(i)); }
        for (int i = 1, its = 10; i <= its; i++) { map.add("C", Integer.valueOf(i)); }
        for (int i = 1, its =  5; i <= its; i++) { map.add("D", Integer.valueOf(i)); }
        for (int i = 1, its = 10; i <= its; i++) { map.add("E", Integer.valueOf(i)); }
        for (int i = 1, its = 25; i <= its; i++) { map.add("F", Integer.valueOf(i)); }
        for (int i = 1, its =  1; i <= its; i++) { map.add("G", Integer.valueOf(i)); }
        assertEquals(7, map.size());
        return map;
    }

    @Test
    public void testSubMaps20PerMap() {
        assertSizes(map().subMaps(20, true), new int[][]{ {1,19}, {6,10,4}, {1,10,9}, {16,1} });
    }

    @Test
    public void testSubMaps11PerMap() {
        assertSizes(map().subMaps(11, true), new int[][]{ {1,10}, {11}, {4,7}, {3,5,3}, {7,4}, {11}, {10,1} });
    }

    @Test
    public void testSubMapsInto4() {
        assertSizes(map().subMaps(4, false), new int[][]{ {1,6,2,2,2,6,1}, {7,2,1,3,6}, {6,3,1,3,6}, {6,3,1,2,7} });
    }

    private void assertSizes(List<StringListMap<Integer>> subMaps, int[][] sizes) {
        try {
            assertEquals(sizes.length, subMaps.size());

            for (int mapIndex = 0, keyIndex = 0; mapIndex < sizes.length; mapIndex++, keyIndex = 0) {
                final StringListMap<Integer> subMap = subMaps.get(mapIndex);
                assertEquals("subMaps[" + mapIndex + "]", sizes[mapIndex].length, subMap.size());

                for (final List<Integer> values : subMap.values()) {
                    assertEquals("subMaps[" + mapIndex + "][" + keyIndex + "]", sizes[mapIndex][keyIndex], values.size());
                    keyIndex++;
                }
            }
        } catch (final Error e) {
            System.out.println("subMaps=" + subMaps);
            throw e;
        }
    }

}
