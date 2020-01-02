/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.internal.EC2ResourceFetcher;
import com.amazonaws.util.EC2MetadataUtils;
import com.amazonaws.util.IOUtils;
import java.io.IOException;
import java.net.URI;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InstanceMetadataServiceCredentialsFetcherTest {

    /** One minute (in milliseconds) */
    private static final long ONE_MINUTE = 1000L * 60;

    /** Environment variable name for the AWS ECS Container credentials path */
    private static final String CREDENTIALS_PATH = "/dummy/credentials/path";

    private static String successResponse;

    private static String successResponseWithInvalidBody;

    private static InstanceMetadataServiceCredentialsFetcher credentialsFetcher;

    @Mock
    private EC2ResourceFetcher ec2ResourceFetcher;

    @BeforeClass
    public static void setUp() throws IOException {
        successResponse = IOUtils.toString(ContainerCredentialsFetcherTest.class.getResourceAsStream("/resources/wiremock/successResponse.json"));
        successResponseWithInvalidBody = IOUtils.toString(ContainerCredentialsFetcherTest.class.getResourceAsStream("/resources/wiremock/successResponseWithInvalidBody.json"));
    }

    @Before
    public void setup() throws IOException {
        credentialsFetcher = new InstanceMetadataServiceCredentialsFetcher(ec2ResourceFetcher);
        System.setProperty(
            SDKGlobalConfiguration.EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY,
            "http://localhost");
    }

    @Test
    public void successfulResponse() {
        URI uri = URI.create("http://localhost" + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE);
        when(ec2ResourceFetcher.readResource(uri, credentialsFetcher)).thenReturn("MyProfileName");

        URI credentailUri = URI.create("http://localhost" + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE + "MyProfileName");
        when(ec2ResourceFetcher.readResource(credentailUri, credentialsFetcher)).thenReturn(successResponse);

        AWSCredentials credentials = credentialsFetcher.getCredentials();
        assertEquals("ACCESS_KEY_ID", credentials.getAWSAccessKeyId());
        assertEquals("SECRET_ACCESS_KEY", credentials.getAWSSecretKey());
    }

    @Test
    public void endpointFailed_shouldThrowException() {
        Throwable expectedException = new RuntimeException("boom");
        URI uri = URI.create("http://localhost" + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE);
        when(ec2ResourceFetcher.readResource(uri, credentialsFetcher)).thenThrow(expectedException);

        try {
            credentialsFetcher.getCredentials();
            fail("no exception");
        } catch (SdkClientException exception) {
            MatcherAssert.assertThat(exception.getCause(), equalTo(expectedException));
        }
    }

    @Test
    public void credentialFailed_shouldThrowException() {
        Throwable expectedException = new RuntimeException("boom");

        URI uri = URI.create("http://localhost" + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE);
        when(ec2ResourceFetcher.readResource(uri, credentialsFetcher)).thenReturn("MyProfileName");

        URI credentailUri = URI.create("http://localhost" + EC2MetadataUtils.SECURITY_CREDENTIALS_RESOURCE + "MyProfileName");
        when(ec2ResourceFetcher.readResource(credentailUri, credentialsFetcher)).thenThrow(expectedException);

        try {
            credentialsFetcher.getCredentials();
            fail("no exception");
        } catch (SdkClientException exception) {
            MatcherAssert.assertThat(exception.getCause(), equalTo(expectedException));
        }
    }
}
