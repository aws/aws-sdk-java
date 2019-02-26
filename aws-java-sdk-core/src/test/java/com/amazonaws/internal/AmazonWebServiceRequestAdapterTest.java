/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import utils.model.EmptyAmazonWebServiceRequest;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class AmazonWebServiceRequestAdapterTest {

    @Test
    public void timeoutsSetInBaseRequest_AreAdaptedToNonNullIntegers() {
        AmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.setSdkRequestTimeout(1000);
        request.setSdkClientExecutionTimeout(4000);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        assertEquals(Integer.valueOf(1000), adapter.getRequestTimeout());
        assertEquals(Integer.valueOf(4000), adapter.getClientExecutionTimeout());
    }

    @Test
    public void timeoutsNotSetInBaseRequest_AreNullWhenAdapted() {
        AmazonWebServiceRequestAdapter adapter = adaptEmpty();
        assertNull(adapter.getRequestTimeout());
        assertNull(adapter.getClientExecutionTimeout());
    }

    @Test
    public void customHeadersSetInBaseRequest_AreAdaptedToMap() {
        AmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.putCustomRequestHeader("FooHeader", "FooValue");
        request.putCustomRequestHeader("BarHeader", "BarValue");
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        assertThat(adapter.getCustomRequestHeaders(), hasEntry("FooHeader", "FooValue"));
        assertThat(adapter.getCustomRequestHeaders(), hasEntry("BarHeader", "BarValue"));
    }

    @Test
    public void noHeadersSetInBaseRequest_AreAdaptedToEmptyMap() {
        AmazonWebServiceRequestAdapter adapter = adaptEmpty();
        assertThat(adapter.getCustomRequestHeaders().entrySet(), empty());
    }

    @Test
    public void customQueryParamsSetInBaseRequest_AreAdaptedToMap() {
        AmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.putCustomQueryParameter("FooParam", "FooValue");
        request.putCustomQueryParameter("BarParam", "BarValue");
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        final Map<String, List<String>> params = adapter.getCustomQueryParameters();
        assertThat(params, hasEntry("FooParam", Arrays.asList("FooValue")));
        assertThat(params, hasEntry("BarParam", Arrays.asList("BarValue")));
    }

    @Test
    public void multipleValuesForSameQueryParamSet_IsAdaptedToMap() {
        AmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.putCustomQueryParameter("FooParam", "valOne");
        request.putCustomQueryParameter("FooParam", "valTwo");
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);
        final Map<String, List<String>> params = adapter.getCustomQueryParameters();
        assertThat(params, hasEntry("FooParam", Arrays.asList("valOne", "valTwo")));
    }

    @Test
    public void noParamsSetInBaseRequest_AreAdaptedToEmptyMap() {
        AmazonWebServiceRequestAdapter adapter = adaptEmpty();
        assertThat(adapter.getCustomQueryParameters().entrySet(), empty());
    }

    @Test
    public void originalRequestObject_IsSetOnAdapter() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);
        assertEquals(request, adapter.getOriginalRequest());
    }

    @Test
    public void requestType_IsAdaptedToRequestClassSimpleName() {
        AmazonWebServiceRequestAdapter adapter = adaptEmpty();
        assertEquals("EmptyAmazonWebServiceRequest", adapter.getRequestType());
    }

    @Test
    public void customProgressListenerSetInBaseRequest_IsSetOnAdapter() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        ProgressListener listener = mock(ProgressListener.class);
        request.setGeneralProgressListener(listener);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        assertEquals(listener, adapter.getProgressListener());
    }

    @Test
    public void customMetricsCollectorSetInBaseRequest_IsSetOnAdapter() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        RequestMetricCollector metricCollector = mock(RequestMetricCollector.class);
        request.setRequestMetricCollector(metricCollector);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        assertEquals(metricCollector, adapter.getRequestMetricsCollector());
    }

    @Test
    public void customCredentialsProviderSetInBaseRequest_IsSetOnAdapter() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        AWSCredentialsProvider credentialsProvider = mock(AWSCredentialsProvider.class);
        request.setRequestCredentialsProvider(credentialsProvider);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        assertEquals(credentialsProvider, adapter.getCredentialsProvider());
    }

    @Test
    public void customCredentialsSetInBaseRequest_IsSetOnAdapter() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        AWSCredentials credentials = new BasicAWSCredentials("akid", "skid");
        request.setRequestCredentials(credentials);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);

        AWSCredentials adaptedCredentials = adapter.getCredentialsProvider().getCredentials();
        assertEquals("akid", adaptedCredentials.getAWSAccessKeyId());
        assertEquals("skid", adaptedCredentials.getAWSSecretKey());
    }

    @Test
    public void readLimitMutatedOnClientOptions_IsReflectedInAdaptedClientOptions() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.getRequestClientOptions().setReadLimit(9001);
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);
        assertEquals(9001, adapter.getRequestClientOptions().getReadLimit());
    }

    @Test
    public void userAgentAppendedToClientOptions_IsReflectedInAdaptedClientOptions() {
        EmptyAmazonWebServiceRequest request = new EmptyAmazonWebServiceRequest();
        request.getRequestClientOptions().appendUserAgent("foo-agent");
        AmazonWebServiceRequestAdapter adapter = new AmazonWebServiceRequestAdapter(request);
        assertThat(adapter.getRequestClientOptions().getClientMarker(
                RequestClientOptions.Marker.USER_AGENT), containsString("foo-agent"));
    }

    private AmazonWebServiceRequestAdapter adaptEmpty() {
        return new AmazonWebServiceRequestAdapter(
                new EmptyAmazonWebServiceRequest());
    }

}