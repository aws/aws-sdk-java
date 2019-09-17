/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is
 * distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either
 * express or implied. See the License for the specific language
 * governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth;

import static org.junit.Assert.assertEquals;

import com.amazonaws.SdkClientException;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;

import com.amazonaws.internal.StaticCredentialsProvider;
import org.junit.rules.ExpectedException;

public class AWSCredentialsProviderChainTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Tests that, by default, the chain remembers which provider was able to
     * provide credentials, and only calls that provider for any additional
     * calls to getCredentials.
     */
    @Test
    public void testReusingLastProvider() throws Exception {
        MockCredentialsProvider provider1 = new MockCredentialsProvider();
        provider1.throwException = true;
        MockCredentialsProvider provider2 = new MockCredentialsProvider();
        AWSCredentialsProviderChain chain = new AWSCredentialsProviderChain(provider1, provider2);

        assertEquals(0, provider1.getCredentialsCallCount);
        assertEquals(0, provider2.getCredentialsCallCount);

        chain.getCredentials();
        assertEquals(1, provider1.getCredentialsCallCount);
        assertEquals(1, provider2.getCredentialsCallCount);

        chain.getCredentials();
        assertEquals(1, provider1.getCredentialsCallCount);
        assertEquals(2, provider2.getCredentialsCallCount);

        chain.getCredentials();
        assertEquals(1, provider1.getCredentialsCallCount);
        assertEquals(3, provider2.getCredentialsCallCount);
    }

    /**
     * Tests that, when provider caching is disabled, the chain will always try
     * all providers in the chain, starting with the first, until it finds a
     * provider that can return credentials.
     */
    @Test
    public void testDisableReusingLastProvider() throws Exception {
        MockCredentialsProvider provider1 = new MockCredentialsProvider();
        provider1.throwException = true;
        MockCredentialsProvider provider2 = new MockCredentialsProvider();
        AWSCredentialsProviderChain chain = new AWSCredentialsProviderChain(Arrays.asList(provider1, provider2));
        chain.setReuseLastProvider(false);

        assertEquals(0, provider1.getCredentialsCallCount);
        assertEquals(0, provider2.getCredentialsCallCount);

        chain.getCredentials();
        assertEquals(1, provider1.getCredentialsCallCount);
        assertEquals(1, provider2.getCredentialsCallCount);

        chain.getCredentials();
        assertEquals(2, provider1.getCredentialsCallCount);
        assertEquals(2, provider2.getCredentialsCallCount);
    }

    /**
     * Tests that getCredentials throws an thrown if all providers in the
     * chain fail to provide credentials.
     */
    @Test
    public void testGetCredentialsException() {
        MockCredentialsProvider provider1 = new MockCredentialsProvider("Failed!");
        MockCredentialsProvider provider2 = new MockCredentialsProvider("Bad!");
        AWSCredentialsProviderChain chain = new AWSCredentialsProviderChain(provider1, provider2);

        thrown.expect(SdkClientException.class);
        thrown.expectMessage(provider1.exceptionMessage);
        thrown.expectMessage(provider2.exceptionMessage);

        chain.getCredentials();
    }

    private static final class MockCredentialsProvider extends StaticCredentialsProvider {
        public int getCredentialsCallCount = 0;
        public boolean throwException = false;
        public String exceptionMessage = "No credentials";

        public MockCredentialsProvider() {
            super(new BasicAWSCredentials("accessKey", "secretKey"));
        }

        public MockCredentialsProvider(String exceptionMessage) {
            this();
            this.exceptionMessage = exceptionMessage;
            this.throwException = true;
        }

        @Override
        public AWSCredentials getCredentials() {
            getCredentialsCallCount++;

            if (throwException) {
                throw new RuntimeException(exceptionMessage);
            }
            else return super.getCredentials();
        }
    }
}
