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
package com.amazonaws.http;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit tests for {@link SystemPropertyTlsKeyManagersProvider}.
 */
public class SystemPropertyTlsKeyManagersProviderTest extends ClientTlsAuthTestBase {
    private static final String BAD_CERT = "/resources/client-tls-auth/bad-cert.p12";

    private static final String KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String KEY_STORE_PASSWORD_PROPERTY = "javax.net.ssl.keyStorePassword";
    private static final String KEY_STORE_TYPE_PROPERTY = "javax.net.ssl.keyStoreType";

    private static File badCertPath;

    private final SystemPropertyTlsKeyManagersProvider provider = new SystemPropertyTlsKeyManagersProvider();

    @BeforeClass
    public static void setUp() throws IOException {
        ClientTlsAuthTestBase.setUp();
        badCertPath = copyToTmpDir(SystemPropertyTlsKeyManagersProviderTest.class.getResourceAsStream(BAD_CERT), "bad-cert");
    }

    @After
    public void methodTeardown() {
        System.clearProperty(KEY_STORE_PROPERTY);
        System.clearProperty(KEY_STORE_PASSWORD_PROPERTY);
        System.clearProperty(KEY_STORE_TYPE_PROPERTY);
    }

    @Test
    public void validProperties_loadsKeyManager() {
        System.setProperty(KEY_STORE_PROPERTY, clientKeyStore.getAbsolutePath());
        System.setProperty(KEY_STORE_TYPE_PROPERTY, "pkcs12");
        System.setProperty(KEY_STORE_PASSWORD_PROPERTY, "password");

        assertThat(provider.getKeyManagers().length, equalTo(1));
    }

    @Test
    public void invalidKeyStoreType_returnsNull() {
        System.setProperty(KEY_STORE_PROPERTY, clientKeyStore.getAbsolutePath());
        System.setProperty(KEY_STORE_TYPE_PROPERTY, "some-unknown-type");
        System.setProperty(KEY_STORE_PASSWORD_PROPERTY, "password");

        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void certInvalid_returnsNull() {
        System.setProperty(KEY_STORE_PROPERTY, badCertPath.getAbsolutePath());

        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void passwordIncorrect_returnsNull() {
        System.setProperty(KEY_STORE_PROPERTY, clientKeyStore.getAbsolutePath());
        System.setProperty(KEY_STORE_TYPE_PROPERTY, "pkcs12");
        System.setProperty(KEY_STORE_PASSWORD_PROPERTY, "foo");

        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void systemPropertiesNotSet_returnsNull() {
        assertThat(provider.getKeyManagers(), nullValue());
    }

    @Test
    public void storeDoesNotExist_returnsNull() {
        System.setProperty(KEY_STORE_PROPERTY, "/does/not/exist");

        assertThat(provider.getKeyManagers(), nullValue());
    }
}
