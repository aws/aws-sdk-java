/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class StaxResponseHandlerTest {

    @Mock
    private Unmarshaller<Void, StaxUnmarshallerContext> unmarshaller;

    private StaxResponseHandler<Void> responseHandler;

    @Before
    public void setup() {
        responseHandler = new StaxResponseHandler<Void>(unmarshaller);
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
     * The XML reader throws an {@link javax.xml.stream.XMLStreamException} which wraps the IO Exception. The handler
     * must unwrap it so that it's handled by retry policies correctly.
     */
    @Test(expected = IOException.class)
    public void socketTimeoutThrownAfternInitialContent_ThrowsIoException() throws Exception {
        HttpResponse response = new HttpResponse(null, null);
        response.setContent(new InputStream() {
            String content = "<OperationNameResponse><OperationNameResult><Str>myname</Str><FooNum>123</FooNum><FalseBool>false</FalseBool><TrueBool>true</TrueBool><Float>1.2</Float><Double>1.3</Double><Long>200</Long><Char>a</Char><Timestamp>2015-01-25T08:00:00Z</Timestamp></OperationNameResult><ResponseMetadata><RequestId>request-id</RequestId></ResponseMetadata></OperationNameResponse>";
            int read = 0;

            @Override
            public int read() throws IOException {
                // Let it read some content first to get past creating an event reader.
                if (read > 50) {
                    throw new SocketTimeoutException("socket timeout");
                }
                return content.charAt(read++);
            }
        });
        responseHandler.handle(response);
    }

}