/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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
package com.amazonaws.unmarshaller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.amazonaws.protocol.json.SdkStructuredPlainJsonFactory;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import org.junit.Test;

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonUnmarshallerContextImpl;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.MapUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;


public class JsonUnmarshallerTest {
    public static final String SIMPLE_MAP = "{\"key1\" : \"value1\", \"key2\" : \"value2\"}";
    public static final String MAP_TO_LIST = "{\"key1\" : [ null, \"value1\"], \"key2\" : [\"value2\"]}";
    private static JsonFactory jsonFactory = new JsonFactory();

    @Test
    public void testSimpleMap() throws Exception {
        JsonUnmarshallerContext unmarshallerContext = setupUnmarshaller(SIMPLE_MAP);
        MapUnmarshaller<String, String> unmarshaller = new MapUnmarshaller<String, String>(
                SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance(),
                SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance());
        Map<String, String> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testMapToList() throws Exception {
        JsonUnmarshallerContext unmarshallerContext = setupUnmarshaller(MAP_TO_LIST);
        MapUnmarshaller<String, List<String>> unmarshaller = new MapUnmarshaller<String, List<String>>(
                SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance(),
                new ListUnmarshaller<String>(
                        SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()));
        Map<String, List<String>> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals(Arrays.asList(null, "value1"), map.get("key1"));
        assertEquals(Arrays.asList("value2"), map.get("key2"));
    }

    private JsonUnmarshallerContext setupUnmarshaller(String snippet) throws Exception {
        JsonParser jsonParser = jsonFactory
                .createJsonParser(new ByteArrayInputStream(snippet.getBytes()));
        JsonUnmarshallerContext unmarshallerContext = new JsonUnmarshallerContextImpl(jsonParser,
                                                                                      SdkStructuredPlainJsonFactory.JSON_SCALAR_UNMARSHALLERS,
                                                                                      null);
        return unmarshallerContext;
    }
}
