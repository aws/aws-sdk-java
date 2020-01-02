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

import java.io.File;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implementation of {@link TlsKeyManagersProvider} that gets the information
 * about the KeyStore to load from the system properties.
 * <p>
 * This provider checks the standard {@code javax.net.ssl.keyStore},
 * {@code javax.net.ssl.keyStorePassword}, and
 * {@code javax.net.ssl.keyStoreType} properties defined by the
 * <a href="https://docs.oracle.com/javase/6/docs/technotes/guides/security/jsse/JSSERefGuide.html">JSSE</a>.
 */
public final class SystemPropertyTlsKeyManagersProvider extends AbstractFileTlsKeyManagersProvider {
    private static final Log log = LogFactory.getLog(SystemPropertyTlsKeyManagersProvider.class);

    private static final String KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String KEY_STORE_PASSWORD_PROPERTY = "javax.net.ssl.keyStorePassword";
    private static final String KEY_STORE_TYPE_PROPERTY = "javax.net.ssl.keyStoreType";

    @Override
    public KeyManager[] getKeyManagers() {
        String keyStorePath = getKeyStore();

        if (keyStorePath == null) {
            return null;
        }

        String type = getKeyStoreType();
        String password = getKeyStorePassword();
        char[] passwordChars = null;
        if (password != null) {
            passwordChars = password.toCharArray();
        }

        try {
            return createKeyManagers(new File(keyStorePath), type, passwordChars);
        } catch (Exception e) {
            log.warn("Unable to load KeyManager from system properties", e);
            return null;
        }
    }

    private static String getKeyStore() {
        return System.getProperty(KEY_STORE_PROPERTY);
    }

    private static String getKeyStoreType() {
        return System.getProperty(KEY_STORE_TYPE_PROPERTY, KeyStore.getDefaultType());
    }

    private static String getKeyStorePassword() {
        return System.getProperty(KEY_STORE_PASSWORD_PROPERTY);
    }
}
