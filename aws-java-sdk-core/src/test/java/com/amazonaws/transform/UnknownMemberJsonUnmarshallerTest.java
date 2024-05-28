/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.transform;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UnknownMemberJsonUnmarshallerTest {
    private static final String TEST_JSON = "{\n" +
            "  \"Field1\": \"value1\",\n" +
            "  \"Field2\": {\n" +
            "    \"Field3\": [\n" +
            "      {\n" +
            "        \"Field5\": 1.0\n" +
            "      },\n" +
            "      {\n" +
            "        \"Field6\": [\n" +
            "          [\n" +
            "            {\n" +
            "              \"Field7\": 2.0\n" +
            "            }\n" +
            "          ]\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    @Test
    public void unmarshall_consumesFullDocument() throws Exception {
        JsonUnmarshallerContext ctx = createContext(TEST_JSON);
        UnknownMemberJsonUnmarshaller marshaller = new UnknownMemberJsonUnmarshaller();
        marshaller.unmarshall(ctx);
        // Note: the unmarshaller will always leave the last token unconsumed, because the generated marshaller is the
        // one that consumes it. We consume it below and verify that there are no tokens left.
        assertEquals(ctx.getCurrentToken(), JsonToken.END_OBJECT);
        assertNull(ctx.nextToken());
    }

    @Test
    public void unmarshall_null() throws Exception {
        JsonUnmarshallerContext ctx = createContext("null");
        UnknownMemberJsonUnmarshaller marshaller = new UnknownMemberJsonUnmarshaller();
        marshaller.unmarshall(ctx);
        // Note: the unmarshaller will always leave the last token unconsumed, because the generated marshaller is the
        // one that consumes it. We consume it below and verify that there are no tokens left.
        assertEquals(ctx.getCurrentToken(), JsonToken.VALUE_NULL);
        assertNull(ctx.nextToken());
    }

    private static JsonUnmarshallerContext createContext(String json) throws IOException {
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser parser = jsonFactory.createParser(json);
        return new JsonUnmarshallerContextImpl(parser, null, null);
    }
}
