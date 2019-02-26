/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.conn.ssl.privileged;

import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.PrivilegedAction;

import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.http.conn.ssl.MasterSecretValidators.MasterSecretValidator;

/**
 * Implementation of {@link MasterSecretValidator} that verifies the master secret is non null
 * through use of Sun internal APIs. This validation is done only for JVMs affected by the SKIP-TLS
 * bug. It is best effort and any exception encountered while trying to validate the master secret
 * (including {@link SecurityException}) will be ignored
 */
public class PrivilegedMasterSecretValidator implements MasterSecretValidator {

    private static final Log LOG = LogFactory.getLog(PrivilegedMasterSecretValidator.class);

    /**
     * Double check the master secret of an SSL session is not null
     * 
     * @param socket
     *            connected socket
     * @return True if master secret is valid (i.e. non-null) or master secret cannot be validated,
     *         false otherwise
     */
    public boolean isMasterSecretValid(final Socket socket) {
        return AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            @Override
            public Boolean run() {
                return privilegedIsMasterSecretValid(socket);
            }
        });
    }

    /**
     * Checks the validity of an SSLSession's master secret. Should be run within a doPrivileged
     * block
     */
    private boolean privilegedIsMasterSecretValid(final Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSession session = getSslSession(socket);
            if (session != null) {
                String className = session.getClass().getName();
                if ("sun.security.ssl.SSLSessionImpl".equals(className)) {
                    try {
                        Object masterSecret = getMasterSecret(session, className);
                        if (masterSecret == null) {
                            session.invalidate();
                            if (LOG.isDebugEnabled()) {
                                LOG.debug("Invalidated session " + session);
                            }
                            return false;
                        }
                    } catch (Exception e) {
                        failedToVerifyMasterSecret(e);
                    }
                }
            }
        }
        return true;

    }

    /**
     * @return The active {@link SSLSession} for the Socket or null if there is none
     */
    private SSLSession getSslSession(final Socket socket) {
        return ((SSLSocket) socket).getSession();
    }

    private Object getMasterSecret(SSLSession session, String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Method method = clazz.getDeclaredMethod("getMasterSecret");
        method.setAccessible(true);
        return method.invoke(session);
    }

    private void failedToVerifyMasterSecret(Throwable t) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Failed to verify the SSL master secret", t);
        }
    }
}