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
package com.amazonaws.http.apache.client.impl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.http.request.HttpRequestFactory;
import com.amazonaws.http.apache.request.impl.ApacheHttpRequestFactory;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.hamcrest.Matchers;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class ApacheDefaultHttpRequestFactoryTest {

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String USER_AGENT = "User-Agent";
    private static final HttpRequestFactory<HttpRequestBase> requestFactory =
            new ApacheHttpRequestFactory();
    private final String SERVICE_NAME = "fooService";
    private final String ENDPOINT = "https://aws.amazon.com";
    private final HttpClientSettings settings = HttpClientSettings.adapt(new ClientConfiguration());

    public static byte[] drainInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byte[] buffer = new byte[1024];
            long bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) > -1) {
                byteArrayOutputStream.write(buffer, 0, (int) bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(byteArrayOutputStream, null);
        }
    }

    @Test
    public void uri_resourcepath_escapes_double_slash() throws IOException, URISyntaxException {

        final Request<Object> request = newDefaultRequest(HttpMethodName.GET);
        request.setResourcePath("//foo");
        request.setEndpoint(new URI(ENDPOINT));
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        URI expectredUri = requestBase.getURI();
        Assert.assertEquals("/%2Ffoo", expectredUri.getRawPath());
    }

    @Test
    public void query_parameters_moved_to_payload_for_post_request_with_no_payload
            () throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.POST);
        request.withParameter("foo", "bar")
                .withParameter("alpha", "beta");
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        Assert.assertThat(requestBase, Matchers.instanceOf(HttpPost
                .class));
        HttpPost post = (HttpPost) requestBase;
        HttpEntity entity = post.getEntity();
        byte[] actualContents = drainInputStream(entity.getContent());
        Assert.assertTrue(actualContents.length > 0);
    }

    @Test
    public void query_parameters_in_uri_for_all_non_post_requests() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.GET);
        request.withParameter("foo", "bar");
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        Assert.assertEquals("foo=bar", requestBase.getURI().getQuery());
    }

    @Test
    public void query_params_in_uri_for_post_request_with_payload() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.POST);
        request.withParameter("foo", "bar");
        final String payload = "dummy string stream";
        request.setContent(new StringInputStream(payload));
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        Assert.assertThat(requestBase, Matchers.instanceOf(HttpPost
                .class));
        Assert.assertEquals("foo=bar", requestBase.getURI().getQuery());
        Assert.assertThat(requestBase, Matchers.instanceOf(HttpPost
                .class));
        Assert.assertEquals(payload, IOUtils.toString(((HttpPost)requestBase).getEntity().getContent()));
    }

    @Test
    public void get_request_returns_correct_apache_requests() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.GET);
        Assert.assertThat(requestFactory.create(request, settings), Matchers.instanceOf(HttpGet
                .class));
    }

    @Test
    public void patch_request_returns_correct_apache_requests() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.PATCH);
        Assert.assertThat(requestFactory.create(request, settings), Matchers.instanceOf(HttpPatch
                .class));
    }

    @Test
    public void delete_request_returns_correct_apache_requests() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.DELETE);
        Assert.assertThat(requestFactory.create(request, settings), Matchers.instanceOf(HttpDelete
                .class));
    }
    @Test
    public void head_request_returns_correct_apache_requests() throws IOException, URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.HEAD);
        Assert.assertThat(requestFactory.create(request, settings), Matchers.instanceOf(HttpHead
                .class));
    }

    @Test
    public void request_has_default_content_type_set_when_not_explicitly_set() throws IOException,
            URISyntaxException {
        final Request<Object> request = newDefaultRequest(HttpMethodName.POST);
        request.setContent(new StringInputStream("dummy string stream"));
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        assertContentTypeContains("application/x-www-form-urlencoded",
                requestBase.getHeaders(CONTENT_TYPE));
    }

    @Test
    public void apache_request_has_content_type_set_when_not_explicitly_set() throws IOException,
            URISyntaxException {

        final Request<Object> request = newDefaultRequest(HttpMethodName.POST);
        final String testContentype = "testContentType";
        request.addHeader(HttpHeaders.CONTENT_TYPE, testContentype);
        request.setContent(new StringInputStream("dummy string stream"));
        HttpRequestBase requestBase = requestFactory.create(request, settings);
        assertContentTypeContains(testContentype,
                requestBase.getHeaders(CONTENT_TYPE));

    }

    private void assertContentTypeContains(String expected, Header[]
            contentTypes) {
        Assert.assertTrue(contentTypes.length == 1);
        Header contentTypeHeader = contentTypes[0];
        Assert.assertThat(contentTypeHeader.getValue(), StringContains
                .containsString(expected));
    }

    private DefaultRequest<Object> newDefaultRequest(HttpMethodName httpMethod) throws
            URISyntaxException {

        final DefaultRequest<Object> request = new DefaultRequest<Object>
                (null, SERVICE_NAME);
        request.setEndpoint(new URI(ENDPOINT));
        request.setHttpMethod(httpMethod);
        return request;
    }
}
