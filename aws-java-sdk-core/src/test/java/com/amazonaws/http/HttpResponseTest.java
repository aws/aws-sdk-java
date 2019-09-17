/*
 * Copyright 2017-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;
import org.junit.Assert;
import org.junit.Test;

public class HttpResponseTest {

    private static final String FOO_HEADER_LOWER_CASE = "foo";
    private static final String FOO_HEADER_UPPER_CASE = "FOO";
    private static final String FOO_HEADER_MIXED_CASE = "FoO";

    /*
     * Test the header value returned correctly with various formats of header name.
     */
    @Test
    public void testGetHeader_variousGet() {
        String content = "content";
        HttpResponse response = new HttpResponse(null, null);
        response.addHeader(FOO_HEADER_LOWER_CASE, content);
        Assert.assertEquals(response.getHeader(FOO_HEADER_LOWER_CASE), content);
        Assert.assertEquals(response.getHeader(FOO_HEADER_UPPER_CASE), content);
        Assert.assertEquals(response.getHeader(FOO_HEADER_MIXED_CASE), content);
    }

    /*
     * Test the header value updated with various formats of header name.
     */
    @Test
    public void testPutHeader_replacePreviousValue() {
        HttpResponse response = new HttpResponse(null, null);
        String lowerContent = "content";
        String upperContent = "CONTENT";
        String mixedContent = "ConTenT";
        response.addHeader(FOO_HEADER_LOWER_CASE, lowerContent);
        Assert.assertEquals(response.getHeader(FOO_HEADER_LOWER_CASE), lowerContent);
        response.addHeader(FOO_HEADER_UPPER_CASE, upperContent);
        Assert.assertEquals(response.getHeader(FOO_HEADER_LOWER_CASE), upperContent);
        response.addHeader(FOO_HEADER_MIXED_CASE, mixedContent);
        Assert.assertEquals(response.getHeader(FOO_HEADER_LOWER_CASE), mixedContent);
    }
}
