/*
 * Copyright 2011-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CredentialsProviderNameMappingTest {

    @Test
    public void when_providerIsNull_unknownValueIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom(null);
        assertEquals("unknown", mappedProviderName);
    }

    @Test
    public void when_providerIsEmpty_unknownValueIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom("");
        assertEquals("unknown", mappedProviderName);
    }

    @Test
    public void when_providerIsKnown_shortValueIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom("ProfileCredentialsProvider");
        assertEquals("prof", mappedProviderName);
    }

    @Test
    public void when_providerIsUnknown_stringIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom("MyHomebrewedCredentialsProvider");
        assertEquals("MyHomebrewedCredentialsProvider", mappedProviderName);
    }

    @Test
    public void when_providerIsIllegal_noValueIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom("My@#$%$CredentialsProvider");
        assertNull(mappedProviderName);
    }

    @Test
    public void when_providerIsTooLong_noValueIsReturned() {
        String mappedProviderName = CredentialsProviderNameMapping.mapFrom(
                "MyMegaGinormousBubbaBubbaBubbaBubbaBubbaBubbaCredentialsProvider");
        assertNull(mappedProviderName);
    }

}