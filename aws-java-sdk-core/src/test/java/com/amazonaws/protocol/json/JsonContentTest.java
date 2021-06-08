/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.protocol.json;

import static org.junit.Assert.assertTrue;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringInputStream;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class JsonContentTest {
    @Test
    public void parseEmptyString_ReturnsObjectNode() throws UnsupportedEncodingException {
        JsonNode node = JsonContent.createJsonContent(httpResponseWithoutHeaders(), new JsonFactory()).getJsonNode();
        assertTrue(node.isObject());
    }

    private static HttpResponse httpResponseWithoutHeaders() throws UnsupportedEncodingException {
        HttpResponse httpResponse = new HttpResponse(null, null);
        httpResponse.setContent(new StringInputStream(""));
        return httpResponse;
    }
}
