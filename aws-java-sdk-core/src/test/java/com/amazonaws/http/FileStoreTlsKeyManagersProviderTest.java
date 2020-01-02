/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import java.io.File;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileStoreTlsKeyManagersProviderTest extends ClientTlsAuthTestBase {
    @BeforeClass
    public static void setUp() throws IOException {
        ClientTlsAuthTestBase.setUp();
    }

    @AfterClass
    public static void teardown() throws IOException {
        ClientTlsAuthTestBase.teardown();
    }

    @Test(expected = IllegalArgumentException.class)
    public void storePathNull_throwsValidationException() {
        new FileStoreTlsKeyManagersProvider(null, CLIENT_STORE_TYPE, STORE_PASSWORD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void storeTypeNull_throwsValidationException() {
        new FileStoreTlsKeyManagersProvider(clientKeyStore, null, STORE_PASSWORD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void storeTypeEmpty_throwsValidationException() {
        new FileStoreTlsKeyManagersProvider(clientKeyStore, "", STORE_PASSWORD);
    }

    @Test
    public void passwordNotGiven_doesNotThrowValidationException() {
        new FileStoreTlsKeyManagersProvider(clientKeyStore, CLIENT_STORE_TYPE, null);
    }

    @Test
    public void paramsValid_createsKeyManager() {
        FileStoreTlsKeyManagersProvider provider = new FileStoreTlsKeyManagersProvider(clientKeyStore, CLIENT_STORE_TYPE, STORE_PASSWORD);
        assertThat(provider.getKeyManagers().length, equalTo(1));
    }

    @Test
    public void storeDoesNotExist_returnsNull() {
        FileStoreTlsKeyManagersProvider provider = new FileStoreTlsKeyManagersProvider(new File("does-not-exist"), CLIENT_STORE_TYPE, STORE_PASSWORD);
        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void invalidStoreType_returnsNull() {
        FileStoreTlsKeyManagersProvider provider = new FileStoreTlsKeyManagersProvider(clientKeyStore, "invalid", STORE_PASSWORD);
        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void passwordIncorrect_returnsNull() {
        FileStoreTlsKeyManagersProvider provider = new FileStoreTlsKeyManagersProvider(clientKeyStore, CLIENT_STORE_TYPE, "not correct password");
        assertThat(provider.getKeyManagers(), nullValue());
    }
}
