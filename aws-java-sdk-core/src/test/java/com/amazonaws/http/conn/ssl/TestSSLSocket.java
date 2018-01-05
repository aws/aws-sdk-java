/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.conn.ssl;

import java.io.IOException;
import java.util.Arrays;

import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

class TestSSLSocket extends SSLSocket {

    @Override
    public void setEnabledProtocols(String[] protocols) {
        //The variable will be true if the method was called and the
        //protocols are correct.
        protocolsVerified = verifyEnabledProtocols(protocols);
    }

    private boolean protocolsVerified = false;

    /**
     * Tells whether the protocols enabled were verified and meet the assertion.
     */
    public boolean getProtocolsVerified() {
        return protocolsVerified;
    }

    /**
     * Evaluates if the given protocols meet certain assertion.
     */
    public boolean verifyEnabledProtocols(String[] protocols) {
        return Arrays.equals(getExpectedEnabledProtocols(), protocols);
    }

    /**
     * Gets the array with protocol names expected to be enabled by the socket
     * factory.
     */
    public String[] getExpectedEnabledProtocols() {
        return null;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return null;
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return null;
    }

    @Override
    public void setEnabledCipherSuites(String[] suites) {
    }

    @Override
    public String[] getSupportedProtocols() {
        return null;
    }

    @Override
    public String[] getEnabledProtocols() {
        return null;
    }

    @Override
    public SSLSession getSession() {
        return null;
    }

    @Override
    public void addHandshakeCompletedListener(
            HandshakeCompletedListener listener) {
    }

    @Override
    public void removeHandshakeCompletedListener(
            HandshakeCompletedListener listener) {
    }

    @Override
    public void startHandshake() throws IOException {
    }

    @Override
    public void setUseClientMode(boolean mode) {
    }

    @Override
    public boolean getUseClientMode() {
        return false;
    }

    @Override
    public void setNeedClientAuth(boolean need) {
    }

    @Override
    public boolean getNeedClientAuth() {
        return false;
    }

    @Override
    public void setWantClientAuth(boolean want) {
    }

    @Override
    public boolean getWantClientAuth() {
        return false;
    }

    @Override
    public void setEnableSessionCreation(boolean flag) {
    }

    @Override
    public boolean getEnableSessionCreation() {
        return false;
    }
}