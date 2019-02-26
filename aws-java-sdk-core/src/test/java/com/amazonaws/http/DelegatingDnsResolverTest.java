/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class DelegatingDnsResolverTest {

    private AmazonHttpClient testedClient;
    private AtomicInteger dnsResolutionCounter;
    private Set<String> requestedHosts;

    @Before
    public void resetClientConfiguration() {
        dnsResolutionCounter = new AtomicInteger(0);
        requestedHosts = new CopyOnWriteArraySet<String>();

        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.withMaxErrorRetry(0);
        clientConfiguration.withDnsResolver(new DnsResolver() {
            DnsResolver system = new SystemDefaultDnsResolver();
            @Override
            public InetAddress[] resolve(String host) throws UnknownHostException {
                dnsResolutionCounter.incrementAndGet();
                requestedHosts.add(host);
                return system.resolve(host);
            }
        });

        testedClient = new AmazonHttpClient(clientConfiguration);
    }

    @After
    public void tearDown() {
        try {
            testedClient.shutdown();
        } catch (Exception e) {}
    }

    @Test
    public void testDelegateIsCalledWhenRequestIsMade() {
        // The ExecutionContext should collect the expected RequestCount
        ExecutionContext context = new ExecutionContext(true);
        String randomHost = UUID.randomUUID().toString();
        final Request<String> request = new DefaultRequest<String>("bob") {};
        request.setEndpoint(URI.create("http://" + randomHost+"/"));
        request.setHttpMethod(HttpMethodName.GET);

        try {
            testedClient.requestExecutionBuilder().request(request).executionContext(context).execute();
            Assert.fail("AmazonClientException is expected.");
        } catch (AmazonClientException ace) {
        }

        assertTrue("dnsResolver should have been called at least once",
                dnsResolutionCounter.get() > 0);

        assertTrue("An attempt to resolve host " + randomHost + " should have been made",
                requestedHosts.contains(randomHost));
    }

    @Test
    public void testDelegatingDnsResolverCallsResolveOnDelegate() throws Exception {
        final AtomicInteger timesCalled = new AtomicInteger();

        DnsResolver delegate = new DnsResolver() {
            @Override
            public InetAddress[] resolve(String host) throws UnknownHostException {
                timesCalled.incrementAndGet();
                return new InetAddress[0];
            }
        };

        org.apache.http.conn.DnsResolver resolver = new DelegatingDnsResolver(delegate);

        resolver.resolve("localhost");

        assertEquals("Delegate Resolver should have been executed", 1, timesCalled.get());

    }
}
