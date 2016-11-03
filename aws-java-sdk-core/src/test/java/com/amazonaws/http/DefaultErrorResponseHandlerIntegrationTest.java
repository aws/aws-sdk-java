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

package com.amazonaws.http;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.LogCaptor;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import utils.http.WireMockTestBase;

import java.util.ArrayList;
import java.util.List;

import static com.amazonaws.http.HttpResponseHandler.X_AMZN_REQUEST_ID_HEADER;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;

public class DefaultErrorResponseHandlerIntegrationTest extends WireMockTestBase {

    private static final String RESOURCE = "/some-path";
    private LogCaptor logCaptor = new LogCaptor.DefaultLogCaptor(Level.INFO);
    private final AmazonHttpClient client = new AmazonHttpClient(new ClientConfiguration());
    private final DefaultErrorResponseHandler sut = new DefaultErrorResponseHandler(new ArrayList<Unmarshaller<AmazonServiceException, Node>>());

    @Before
    public void setUp() {
        logCaptor.clear();
    }

    @Test
    public void invocationIdIsCapturedInTheLog() throws Exception {
        stubFor(get(urlPathEqualTo(RESOURCE)).willReturn(aResponse().withStatus(418)));

        executeRequest();

        assertThat(infoEvents(), hasEventWithContent("Invocation Id"));
    }

    @Test
    public void invalidXmlLogsXmlContentToInfo() throws Exception {
        String content = RandomStringUtils.randomAlphanumeric(10);
        stubFor(get(urlPathEqualTo(RESOURCE)).willReturn(aResponse().withStatus(418).withBody(content)));

        executeRequest();

        assertThat(infoEvents(), hasEventWithContent(content));
    }

    @Test
    public void requestIdIsLoggedWithInfoIfInTheHeader() throws Exception {
        String requestId = RandomStringUtils.randomAlphanumeric(10);

        stubFor(get(urlPathEqualTo(RESOURCE)).willReturn(aResponse().withStatus(418).withHeader(X_AMZN_REQUEST_ID_HEADER, requestId)));

        executeRequest();

        assertThat(infoEvents(), hasEventWithContent(requestId));
    }

    private void executeRequest() {
        expectException(new Runnable() {
            @Override
            public void run() {
                client.requestExecutionBuilder().errorResponseHandler(sut).request(newGetRequest(RESOURCE)).execute();
            }
        });
    }

    @SuppressWarnings("EmptyCatchBlock")
    private void expectException(Runnable r) {
        try {
            r.run();
            throw new RuntimeException("Expected exception, got none");
        } catch (Exception e) {
        }
    }

    private List<LoggingEvent> infoEvents() {
        List<LoggingEvent> info = new ArrayList<LoggingEvent>();
        for (LoggingEvent le : logCaptor.loggedEvents()) {
            if (le.getLevel().equals(Level.INFO)) {
                info.add(le);
            }
        }
        return info;
    }

    private org.hamcrest.Matcher<Iterable<? extends LoggingEvent>> hasEventWithContent(String content) {
        return contains(hasProperty("message", containsString(content)));
    }
}
