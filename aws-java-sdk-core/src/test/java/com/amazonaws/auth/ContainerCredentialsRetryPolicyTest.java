/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.retry.internal.CredentialsEndpointRetryParameters;

public class ContainerCredentialsRetryPolicyTest {

    private static ContainerCredentialsRetryPolicy retryPolicy;

    @BeforeClass
    public static void setup() {
        retryPolicy = ContainerCredentialsRetryPolicy.getInstance();
    }

    @Test
    public void shouldRetry_ReturnsTrue_For5xxStatusCode() {
        assertTrue(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withStatusCode(501).build()));
    }

    @Test
    public void shouldRetry_ReturnsFalse_ForNon5xxStatusCode() {
        assertFalse(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withStatusCode(404).build()));
        assertFalse(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withStatusCode(300).build()));
        assertFalse(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withStatusCode(202).build()));
    }

    @Test
    public void shouldRetry_ReturnsTrue_ForIOException() {
        assertTrue(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withException(new IOException()).build()));
    }

    @Test
    public void shouldRetry_ReturnsFalse_ForNonIOException() {
        assertFalse(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withException(new RuntimeException()).build()));
        assertFalse(retryPolicy.shouldRetry(1, CredentialsEndpointRetryParameters.builder().withException(new Exception()).build()));
    }

    @Test
    public void shouldRetry_ReturnsFalse_WhenMaxRetriesExceeded() {
        assertFalse(retryPolicy.shouldRetry(5, CredentialsEndpointRetryParameters.builder().withStatusCode(501).build()));
    }
}
