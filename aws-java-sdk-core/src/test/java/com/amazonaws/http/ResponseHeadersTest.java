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

package com.amazonaws.http;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.any;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

public class ResponseHeadersTest {
    @Rule
    public WireMockRule wireMock = new WireMockRule(wireMockConfig().port(0));

    private AmazonHttpClient httpClient;

    @Before
    public void setup() {
        wireMock.stubFor(any(urlMatching(".*")).willReturn(aResponse().withStatus(200).withBody("{}")));
    }

    @After
    public void teardown() {
        if (httpClient != null) {
            httpClient.shutdown();
        }
        httpClient = null;
    }

    @Test
    public void responseReceived_multipleHeaderWithSameName_allReturnedInResponse() throws Exception {
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("foo", Arrays.asList("a", "b", "c"));

        ResponseDefinitionBuilder responseBuilder = aResponse().withStatus(200).withBody("{}");

        for (Map.Entry<String, List<String>> e : headers.entrySet()) {
            for (String v : e.getValue()) {
                responseBuilder.withHeader(e.getKey(), v);
            }
        }

        wireMock.stubFor(any(urlMatching(".*")).willReturn(responseBuilder));

        httpClient = new AmazonHttpClient(new ClientConfiguration().withTlsKeyManagersProvider(null));



        Response response = makeRequestWithClient(httpClient, headers);
        assertArrayEquals(response.getHttpResponse().getAllHeaders().get("foo").toArray(),
                          new String[] {"a", "b", "c"});
    }

    private Response makeRequestWithClient(AmazonHttpClient client, Map<String, List<String>> responseHeaders) throws Exception {

        DefaultRequest<Void> request = new DefaultRequest<Void>(null, "service");
        request.setEndpoint(URI.create("http://localhost:" + wireMock.port()));
        ExecutionContext executionContext = new ExecutionContext();

        HttpResponseHandler mockResponseHandler = mock(HttpResponseHandler.class);
        AmazonWebServiceResponse mockResponse = mock(AmazonWebServiceResponse.class);
        when(mockResponseHandler.handle(Mockito.any(HttpResponse.class))).thenReturn(mockResponse);

        HttpResponseHandler mockErrorResponseHandler = mock(HttpResponseHandler.class);

        return client.execute(request, mockResponseHandler, mockErrorResponseHandler, executionContext, null);
    }
}
