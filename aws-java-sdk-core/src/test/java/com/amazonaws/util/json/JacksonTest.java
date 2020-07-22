/*
 * Copyright (c) 2020. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util.json;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import java.util.Map;

import com.amazonaws.SdkClientException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JacksonTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void stringMapFromJsonString_stringMap_handlesSimpleJson() {
        String json = "{\"key-1\":\"value-1\",\"key-2\":\"value-2\"}";
        Map<String, String> result = Jackson.stringMapFromJsonString(json);

        assertThat(result.size(), is(2));
        assertThat(result, hasEntry("key-1", "value-1"));
        assertThat(result, hasEntry("key-2", "value-2"));
    }

    @Test
    public void stringMapFromJsonString_stringMap_handlesIntegers() {
        String json = "{\"key-1\":\"value-1\",\"key-2\":2}";
        Map<String, String> result = Jackson.stringMapFromJsonString(json);

        assertThat(result.size(), is(2));
        assertThat(result, hasEntry("key-1", "value-1"));
        assertThat(result, hasEntry("key-2", "2"));
    }

    @Test
    public void stringMapFromJsonString_stringMap_handlesInvalidJson() {
        String json = "{invalid-json}";

        exception.expect(SdkClientException.class);
        exception.expectMessage("Unable to parse Json");
        Jackson.stringMapFromJsonString(json);
    }

    @Test
    public void stringMapFromJsonString_stringMap_handlesNullJson() {
        assertThat(Jackson.stringMapFromJsonString(null), is(nullValue()));
    }
}