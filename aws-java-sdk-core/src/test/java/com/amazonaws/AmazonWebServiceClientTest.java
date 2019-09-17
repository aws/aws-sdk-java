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
package com.amazonaws;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.QueryStringSigner;
import com.amazonaws.http.IdleConnectionReaper;

public class AmazonWebServiceClientTest {

    @Test
    public void emptyClient() {
        AmazonWebServiceClient client =
            new AmazonWebServiceClient(new ClientConfiguration()) { };

        try {
            client.getServiceName();
        } catch (IllegalStateException exception) {
        }
    }

    @Test
    public void testDefaultSigner() {
        AmazonTestClient client = new AmazonTestClient();

        Assert.assertEquals("test", client.getServiceName());
        Assert.assertTrue(client.getSigner() instanceof AWS4Signer);
    }

    @Test
    public void testOverrideSigner() {
        ClientConfiguration config = new ClientConfiguration();
        config.setSignerOverride("QueryStringSignerType");

        AmazonTestClient client = new AmazonTestClient(config);

        Assert.assertTrue(client.getSigner() instanceof QueryStringSigner);
    }

    @Test
    public void setServiceNameIntern() {
        AmazonTestClient client = new AmazonTestClient();
        assertEquals(client.getServiceName(), client.getServiceNameIntern());
        String serviceNameOverride = "foo";
        assertFalse(serviceNameOverride.equals(client.getServiceName()));
        client.setServiceNameIntern(serviceNameOverride);
        assertEquals(serviceNameOverride, client.getServiceName());
    }

    @Test
    public void setEndpointPrefix() {
        AmazonTestClient client = new AmazonTestClient();
        Assert.assertEquals(client.getServiceName(), client.getEndpointPrefix());
        String endpointPrefixOverride = "foo";
        Assert.assertNotEquals(endpointPrefixOverride, client.getServiceName());
        client.setEndpointPrefix(endpointPrefixOverride);
        Assert.assertEquals(endpointPrefixOverride, client.getEndpointPrefix());
        Assert.assertNotEquals(client.getEndpointPrefix(), client.getServiceName());
    }

    @Test
    public void testDefaultMonitoringListener() {
        AmazonTestClient client = new AmazonTestClient();
        assertNotNull(client.getMonitoringListeners());
        assertEquals(0, client.getMonitoringListeners().size());
    }

    /**
     * A memory leak was introduced in 1.11 that prevented connection managers from being
     * deregistered with the IdleConnectionReaper. This test asserts that any clients registered
     * with the reaper are also deregistered on shutdown of the client.
     *
     * @see <a href="https://github.com/aws/aws-sdk-java/issues/722">Issue #722</a>
     */
    @Test
    public void connectionManagersAreUnregisteredFromIdleConnectionReaper() {
        // Clears out the IdleConnectionReaper. This is helpful when there are open registered connections from previous tests.
        IdleConnectionReaper.shutdown();
        for (int count = 0; count < 100; count++) {
            new AmazonWebServiceClient(new ClientConfiguration()) {
            }.shutdown();
        }
        assertEquals(0, IdleConnectionReaper.getRegisteredConnectionManagers().size());
    }

    private static class AmazonTestClient extends AmazonWebServiceClient {
        public AmazonTestClient() {
            this(new ClientConfiguration());
        }

        public AmazonTestClient(final ClientConfiguration config) {
            super(config);
            super.setEndpoint("test.us-west-2.amazonaws.com");
        }
    }
}
