/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights
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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.LogCaptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Unit tests for the InstanceProfileCredentialsProvider.
 */
@RunWith(Parameterized.class)
public class InstanceProfileCredentialsProviderIntegrationTest extends LogCaptor.LogCaptorTestBase {

    private static final String RESPONSE = "{\n"
                                           + "  \"Code\" : \"Success\",\n"
                                           + "  \"LastUpdated\" : \"2012-05-02T22:55:54Z\",\n"
                                           + "  \"Type\" : \"AWS-HMAC\",\n"
                                           + "  \"AccessKeyId\" : \"ACCESS_KEY_ID\",\n"
                                           + "  \"SecretAccessKey\" : \"SECRET_ACCESS_KEY\",\n"
                                           + "  \"Token\" : \"TOKEN_TOKEN_TOKEN\",\n"
                                           + "  \"Expiration\" : \"%s\"\n"
                                           + "}";

    private EC2MetadataServiceMock mockServer;
    private boolean tokenEnabled;

    @Parameterized.Parameters()
    public static Iterable<Boolean[]> tokenEnabled() {
        Collection<Boolean[]> tokenEnabled = new ArrayList<Boolean[]>();
        tokenEnabled.add(new Boolean[] {true});
        tokenEnabled.add(new Boolean[] {false});
        return tokenEnabled;
    }

    public InstanceProfileCredentialsProviderIntegrationTest(boolean tokenEnabled) {
        this.tokenEnabled = tokenEnabled;
    }

    /** Starts up the mock EC2 Instance Metadata Service. */
    @Before
    public void setUp() throws Exception {
        mockServer = new EC2MetadataServiceMock(tokenEnabled);
        mockServer.start();
    }

    /** Shuts down the mock EC2 Instance Metadata Service. */
    @After
    public void tearDown() throws Exception {
        mockServer.stop();
        Thread.sleep(1000);
    }

    @Test
    public void getInstance_ReturnsSameInstance() {
        assertEquals(InstanceProfileCredentialsProvider.getInstance(),
                     InstanceProfileCredentialsProvider.getInstance());
    }

    /** Tests that we correctly handle the metadata service returning credentials. */
    @Test
    public void testSessionCredentials() throws Exception {
        mockServer.setResponseContent(nonExpiredResponse());
        mockServer.setAvailableSecurityCredentials("aws-dr-tools-test");

        InstanceProfileCredentialsProvider credentialsProvider = new InstanceProfileCredentialsProvider();
        AWSSessionCredentials credentials = (AWSSessionCredentials)credentialsProvider.getCredentials();

        assertEquals("ACCESS_KEY_ID",     credentials.getAWSAccessKeyId());
        assertEquals("SECRET_ACCESS_KEY", credentials.getAWSSecretKey());
        assertEquals("TOKEN_TOKEN_TOKEN", credentials.getSessionToken());
    }

    /**
     * Tests that we correctly handle the metadata service returning credentials
     * when multiple instance profiles are available.
     */
    @Test
    public void testSessionCredentials_MultipleInstanceProfiles() throws Exception {
        mockServer.setResponseContent(nonExpiredResponse());
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = new InstanceProfileCredentialsProvider();
        AWSSessionCredentials credentials = (AWSSessionCredentials)credentialsProvider.getCredentials();

        assertEquals("ACCESS_KEY_ID",     credentials.getAWSAccessKeyId());
        assertEquals("SECRET_ACCESS_KEY", credentials.getAWSSecretKey());
        assertEquals("TOKEN_TOKEN_TOKEN", credentials.getSessionToken());
    }

    /**
     * Tests that we correctly handle when no instance profiles are available
     * through the metadata service.
     */
    @Test
    public void testNoInstanceProfiles() throws Exception {
        mockServer.setResponseContent(nonExpiredResponse());
        mockServer.setAvailableSecurityCredentials("");

        InstanceProfileCredentialsProvider credentialsProvider = new InstanceProfileCredentialsProvider();

        try {
            credentialsProvider.getCredentials();
            fail("Expected an AmazonClientException, but wasn't thrown");
        } catch (AmazonClientException ace) {
            assertNotNull(ace.getMessage());
        }
    }

    @Test
    public void getCredentialsDisabled_shouldGetCredentialsAfterEnabled() throws Exception {
        InstanceProfileCredentialsProvider credentialsProvider = null;
        try {
            System.setProperty("com.amazonaws.sdk.disableEc2Metadata", "true");
            credentialsProvider = new InstanceProfileCredentialsProvider();
            credentialsProvider.getCredentials();
            fail("exception not thrown when ec2Metadata disabled");
        } catch (AmazonClientException ex) {
            //expected
        } finally {
            System.clearProperty("com.amazonaws.sdk.disableEc2Metadata");
        }
        mockServer.setResponseContent(nonExpiredResponse());
        mockServer.setAvailableSecurityCredentials("test-credentials");
        assertNotNull(credentialsProvider.getCredentials());
    }

    /**
     * Tests that we correctly handle when the metadata service credentials have
     * expired.
     */
    @Test
    public void testSessionCredentials_Expired() throws Exception {
        mockServer.setResponseContent(expiredResponse());
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = new InstanceProfileCredentialsProvider();
        try {
            credentialsProvider.getCredentials();
            fail("Expected an AmazonClientException, but wasn't thrown");
        } catch (AmazonClientException ace) {
            assertNotNull(ace.getMessage());
        }
    }

    /**
     * Tests by initiating a refresh thread in parallel which refreshes the
     * credentials. Next call to credentials provider will result in refreshing
     * and getting new credentials.
     */
    @Test
    public void testMultipleThreadsLoadingAndRefreshingCredentials()
            throws Exception {
        mockServer.setResponseContent(nonExpiredResponse());
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = new InstanceProfileCredentialsProvider();
        AWSSessionCredentials credentials = (AWSSessionCredentials) credentialsProvider
                .getCredentials();

        assertNotNull(credentials);

        new RefreshThread(credentialsProvider).join();

        AWSSessionCredentials newCredentials = (AWSSessionCredentials) credentialsProvider
                .getCredentials();

        assertNotNull(newCredentials);

        assertNotSame(credentials, newCredentials);
    }

    @Test(expected = AmazonClientException.class)
    public void canBeConfiguredToOnlyRefreshCredentialsAfterFirstCallToGetCredentials() throws InterruptedException {
        mockServer.setResponseContent(expiredResponse());
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = InstanceProfileCredentialsProvider.createAsyncRefreshingProvider(false);
        Thread.sleep(1000);

        //Hacky assert but we know that this mockServer will create an exception that will be logged, if there's no log entry
        //then there's no exception, which means that getCredentials didn't get called on the fetcher
        assertThat(loggedEvents(), is(empty()));

        credentialsProvider.getCredentials();
    }

    @Test
    public void refreshCredentialFailureUsesCachedCredentials() throws IOException {
        mockServer.setResponseContent(responseWithExpiration(DateTime.now().plusMinutes(5)));
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = InstanceProfileCredentialsProvider.createAsyncRefreshingProvider(false);
        AWSCredentials firstCredentials = credentialsProvider.getCredentials();

        mockServer.stop();

        AWSCredentials secondCredentials = credentialsProvider.getCredentials();

        assertSame(firstCredentials, secondCredentials);
    }

    @Test
    public void refreshWithAsyncCredentialFailureUsesCachedCredentials() throws IOException {
        mockServer.setResponseContent(responseWithExpiration(DateTime.now().plusMinutes(5)));
        mockServer.setAvailableSecurityCredentials("test-credentials");

        InstanceProfileCredentialsProvider credentialsProvider = InstanceProfileCredentialsProvider.createAsyncRefreshingProvider(true);
        AWSCredentials firstCredentials = credentialsProvider.getCredentials();

        mockServer.stop();

        AWSCredentials secondCredentials = credentialsProvider.getCredentials();

        assertSame(firstCredentials, secondCredentials);
    }

    private class RefreshThread extends Thread{

        private InstanceProfileCredentialsProvider provider;

        public RefreshThread(InstanceProfileCredentialsProvider provider){
            this.provider = provider;
            this.start();
        }

        @Override
        public void run() {
            this.provider.refresh();
        }
    }

    private String expiredResponse() {
        return responseWithExpiration(DateTime.now().minusMinutes(1));
    }

    private String nonExpiredResponse() {
        return responseWithExpiration(DateTime.now().plusDays(1));
    }

    private String responseWithExpiration(DateTime expiration) {
        return String.format(RESPONSE, expiration.toString());
    }

}
