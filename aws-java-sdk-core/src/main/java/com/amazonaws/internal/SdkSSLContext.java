/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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
package com.amazonaws.internal;

import javax.net.ssl.KeyManager;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.SSLInitializationException;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SdkSSLContext {
    public static final SSLContext getPreferredSSLContext(final SecureRandom secureRandom) {
        return getPreferredSSLContext(null, secureRandom);
    }

    /**
     * @see SSLContexts#createDefault()
     */
    public static final SSLContext getPreferredSSLContext(KeyManager[] keyManagers, final SecureRandom secureRandom) {
        try {
            final SSLContext sslcontext = SSLContext.getInstance("TLS");
            // http://download.java.net/jdk9/docs/technotes/guides/security/jsse/JSSERefGuide.html
            sslcontext.init(keyManagers, null, secureRandom);
            return sslcontext;
        } catch (final NoSuchAlgorithmException ex) {
            throw new SSLInitializationException(ex.getMessage(), ex);
        } catch (final KeyManagementException ex) {
            throw new SSLInitializationException(ex.getMessage(), ex);
        }
    }
}
