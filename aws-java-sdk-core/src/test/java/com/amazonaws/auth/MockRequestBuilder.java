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

package com.amazonaws.auth;

import com.amazonaws.SignableRequest;
import com.amazonaws.http.HttpMethodName;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockRequestBuilder {
    private final SignableRequest<?> request;
    private final Map<String, String> headers = new HashMap<String, String>();
    private final Map<String, List<String>> parameters = new HashMap<String, List<String>>();

    private MockRequestBuilder() {
        this.request = mock(SignableRequest.class);
        when(request.getHeaders()).thenReturn(headers);

        doAnswer(new KeyValuePairHandler() {
            @Override
            void apply(String name, String value) {
                headers.put(name, value);
            }
        }).when(request).addHeader(anyString(), anyString());

        when(request.getParameters()).thenReturn(parameters);
        doAnswer(new KeyValuePairHandler() {
            @Override
            void apply(String name, String value) {
                addParameter(name, value);
            }
        }).when(request).addParameter(anyString(), anyString());

        when(request.getHttpMethod()).thenReturn(HttpMethodName.POST);
        when(request.getTimeOffset()).thenReturn(0);
    }

    public static MockRequestBuilder create() {
        return new MockRequestBuilder();
    }

    MockRequestBuilder withTarget(String target) {
        headers.put("X-Amz-Target", target);
        return this;
    }

    MockRequestBuilder withContent(InputStream content) {
        when(request.getContentUnwrapped()).thenReturn(content);
        when(request.getContent()).thenReturn(content);
        return this;
    }

    MockRequestBuilder withPath(String path) {
        when(request.getResourcePath()).thenReturn(path);
        return this;
    }

    MockRequestBuilder withEndpoint(String endpoint) {
        when(request.getEndpoint()).thenReturn(URI.create(endpoint));
        return this;
    }

    SignableRequest<?> build() {
        return request;
    }

    MockRequestBuilder withHeader(String name, String value) {
        headers.put(name, value);
        return this;
    }

    MockRequestBuilder withParameter(String name, String value) {
        addParameter(name, value);
        return this;
    }

    private void addParameter(String name, String value) {
        List<String> lst = parameters.containsKey(name) ? parameters.get(name) : new ArrayList<String>();
        lst.add(value);
        parameters.put(name, lst);
    }

    private abstract class KeyValuePairHandler implements Answer<Void> {

        @Override
        public Void answer(InvocationOnMock invocation) throws Throwable {
            String name = invocation.getArgumentAt(0, String.class);
            String value = invocation.getArgumentAt(1, String.class);
            apply(name, value);
            return null;
        }

        abstract void apply(String name, String value);
    }
}
