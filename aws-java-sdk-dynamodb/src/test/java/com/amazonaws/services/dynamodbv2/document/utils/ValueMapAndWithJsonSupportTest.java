/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.dynamodbv2.document.utils;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import org.junit.Test;

public class ValueMapAndWithJsonSupportTest {

    private static final String NO_JSON_STRING = "nojson";
    private static final String KEY = "somekey";

    @Test(expected = AmazonClientException.class)
    public void valueMapCreationShouldFailIfNoJsonStringIsUsedAsValue() {
        new ValueMap().withJSON("a", NO_JSON_STRING);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void valueMapShouldReturnAProperDeserializedJsonMap()  {
        String json = "{ \"fruit\" : \"pear\" , \"color\" : \"green\" }";
        ValueMap valueMap = new ValueMap().withJSON(KEY, json);

        Map<String,Object> actual = (Map<String,Object>)valueMap.get(KEY);
        assertThat(actual.size(), is(2));
        assertThat((String)actual.get("fruit"), is("pear"));
        assertThat((String)actual.get("color"), is("green"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void valueMapShouldReturnAProperDeserializedJsonList()  {
        String json = "[\"red\",\"green\",\"blue\"]";
        ValueMap valueMap = new ValueMap().withJSON(KEY, json);

        List<String> actual = (List<String>)valueMap.get(KEY);
        assertThat(actual.size(), is(3));
        assertThat(actual, hasItems("red", "green", "blue"));
    }

}
