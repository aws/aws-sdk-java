/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.util.Base64;

/**
 * A PEM utility that can be used to read keys from PEM. With this PEM utility,
 * private keys in either PKCS#1 or PKCS#8 PEM encoded format can be read
 * without the need to depend on the Bouncy Castle library.
 * <p>
 * Some background information:
 * <ul>
 * <li>Interestingly, the creation of a CloudFront Key Pair via the AWS console
 * would result in a private key in PKCS#1 PEM format.</li>
 * <li>Unfortunately, the JDK doesn't provide a means to load PEM key encoded in
 * PKCS#1 without adding the Bouncy Castle to the classpath. The JDK can only
 * load PEM key encoded in PKCS#8 encoding.</li>
 * <li>One the other hand, one can use openssl to convert a PEM file from PKCS#1
 * to PKCS#8. Example:
 * 
 * <pre>
 * openssl pkcs8 -topk8 -in pk-APKAJM22QV32R3I2XVIQ.pem -inform pem -out pk-APKAJM22QV32R3I2XVIQ_pk8.pem  -outform pem -nocrypt
 * </pre>
 * 
 * </li>
 * </ul>
 */
public enum PEM {
    ;
    private static final String BEGIN_MARKER = "-----BEGIN ";

    /**
     * Returns the first private key that is found from the input stream of a
     * PEM file.
     * 
     * @throws InvalidKeySpecException
     *             if failed to convert the DER bytes into a private key.
     * @throws IllegalArgumentException
     *             if no private key is found.
     */
    public static PrivateKey readPrivateKey(InputStream is)
            throws InvalidKeySpecException, IOException {
        List<PEMObject> objects = readPEMObjects(is);
        for (PEMObject object : objects) {
            switch (object.getPEMObjectType()) {
            case PRIVATE_KEY_PKCS1:
                return RSA.privateKeyFromPKCS1(object.getDerBytes());
            case PRIVATE_KEY_PKCS8:
                return RSA.privateKeyFromPKCS8(object.getDerBytes());
            default:
                break;
            }
        }
        throw new IllegalArgumentException("Found no private key");
    }

    /**
     * Returns the first public key that is found from the input stream of a PEM
     * file.
     * 
     * @throws InvalidKeySpecException
     *             if failed to convert the DER bytes into a public key.
     * @throws IllegalArgumentException
     *             if no public key is found.
     */
    public static PublicKey readPublicKey(InputStream is)
            throws InvalidKeySpecException, IOException {
        List<PEMObject> objects = readPEMObjects(is);
        for (PEMObject object : objects) {
            switch (object.getPEMObjectType()) {
            case PUBLIC_KEY_X509:
                return RSA.publicKeyFrom(object.getDerBytes());
            default:
                break;
            }
        }
        throw new IllegalArgumentException("Found no public key");
    }

    /**
     * A lower level API used to returns all PEM objects that can be read off
     * from the input stream of a PEM file.
     * <p>
     * This method can be useful if more than one PEM object of different types
     * are embedded in the same PEM file.
     */
    public static List<PEMObject> readPEMObjects(InputStream is)
            throws IOException {
        List<PEMObject> pemContents = new ArrayList<PEMObject>();
        /*
         * State of reading: set to true if reading content between a
         * begin-marker and end-marker; false otherwise.
         */
        boolean readingContent = false;
        String beginMarker = null;
        String endMarker = null;
        StringBuffer sb = null;
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            while ((line = reader.readLine()) != null) {
                if (readingContent) {
                    if (line.indexOf(endMarker) != -1) {
                        pemContents.add( // completed reading one PEM object
                                new PEMObject(beginMarker, Base64.decode(sb
                                        .toString())));
                        readingContent = false;
                    } else {
                        sb.append(line.trim());
                    }
                } else {
                    if (line.indexOf(BEGIN_MARKER) != -1) {
                        readingContent = true;
                        beginMarker = line.trim();
                        endMarker = beginMarker.replace("BEGIN", "END");
                        sb = new StringBuffer();
                    }
                }
            }
            return pemContents;
        } finally {
            try {
                reader.close();
            } catch (IOException ignore) {
            }
        }
    }
}
