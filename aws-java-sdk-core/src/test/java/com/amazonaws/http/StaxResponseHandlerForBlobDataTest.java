/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */


package com.amazonaws.http;


import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class StaxResponseHandlerForBlobDataTest {


    private Unmarshaller<InputStream, StaxUnmarshallerContext> unmarshaller;
    private StaxResponseHandler<InputStream> responseHandler;

    @Before
    public void setup() {
        unmarshaller = new Unmarshaller<InputStream, StaxUnmarshallerContext>() {
            @Override
            public InputStream unmarshall(StaxUnmarshallerContext context) throws Exception {
                context.getHttpResponse().getContent().reset();
                return new java.io.ByteArrayInputStream(java.nio.ByteBuffer.wrap(com.amazonaws
                        .util.IOUtils.toByteArray(context.getHttpResponse().getContent())).array());
            }
        };
        responseHandler = new StaxResponseHandler<InputStream>(unmarshaller);
    }

    /**
     * This throws a socket timeout exception immediately. When creating an XML event reader,
     * it may read ahead a few bytes so we have to handle the {@link javax.xml.stream.XMLStreamException} in
     * two places.
     */
    @Test(expected = IOException.class)
    public void socketTimeoutThrownFromInputStream_ThrowsIoException() throws Exception {
        HttpResponse response = new HttpResponse(null, null);
        response.setContent(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new SocketTimeoutException("socket timeout");
            }
        });
        responseHandler.handle(response);
    }

    /**
     * The handleResponse returns inputStream for httpResponse with InputStream.
     */
    @Test
    public void httpResponse_with_InputStream() throws Exception {
        HttpResponse response = new HttpResponse(null, null);
        String inputStringStream = "functionCode cf = event.Records[0].cf";
        InputStream stream = new ByteArrayInputStream(inputStringStream.getBytes(StandardCharsets.UTF_8));
        response.setContent(stream);
        AmazonWebServiceResponse<InputStream> handle = responseHandler.handle(response);
        Assert.assertEquals(inputStringStream, IOUtils.toString(handle.getResult()));
    }

}