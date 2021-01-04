/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.http.apache.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicStatusLine;
import org.junit.Test;

public class ApacheUtilsTest {
    @Test
    public void createResponse_copiesAllHeaders() throws IOException {
        HttpResponse mockHttpResponse = mock(HttpResponse.class);

        List<Header> headers = new ArrayList<Header>();

        headers.add(new BasicHeader("foo", "a"));
        headers.add(new BasicHeader("FOO", "b"));
        headers.add(new BasicHeader("fOO", "c"));

        when(mockHttpResponse.getStatusLine()).thenReturn(
                new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 200, "OK"));
        when(mockHttpResponse.getAllHeaders()).thenReturn(headers.toArray(new Header[0]));
        com.amazonaws.http.HttpResponse response = ApacheUtils.createResponse(null, null, mockHttpResponse, null);

        assertArrayEquals(response.getAllHeaders().get("foo").toArray(), new String[] {"a", "b", "c"});
    }
}
