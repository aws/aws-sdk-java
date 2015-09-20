/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.util;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Scanner;

import org.junit.Test;

public class SnsSignatureCheckerTest {

    private static final String MESSAGE_RESOURCE = "message.json";
    private static final String CERT_RESOURCE = "SimpleNotificationService-bb750dd426d95ee9390147a5624348ee.pem";

    @Test
    public void validateMessageTest() throws URISyntaxException, IOException, CertificateException {
        String jsonMessage = getResource(MESSAGE_RESOURCE);
        SignatureChecker checker = new SignatureChecker();
        assertTrue(checker.verifyMessageSignature(jsonMessage, getPublicKey()));
    }

    private String getResource(String resource) throws URISyntaxException, IOException {
        URI uri = this.getClass().getClassLoader().getResource(resource).toURI();
        URL url = uri.toURL();
        Scanner s = new Scanner(url.openStream()).useDelimiter("\\A");
        String string = s.hasNext() ? s.next() : "";
        s.close();
        return string;
    }

    private PublicKey getPublicKey() throws URISyntaxException, IOException, CertificateException {
        InputStream inStream = new ByteArrayInputStream(
                Charset.forName("UTF-8").encode(getResource(CERT_RESOURCE)).array());
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(inStream);
        return cert.getPublicKey();
    }
}
