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
package com.amazonaws.util;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBContext;

import com.amazonaws.log.InternalLogApi;
import com.amazonaws.log.InternalLogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * A Base 64 codec API.
 *
 * See http://www.ietf.org/rfc/rfc4648.txt
 *
 * @author Hanson Char
 */
public enum Base64 {
    ;
    private static final InternalLogApi LOG = InternalLogFactory.getLog(Base64.class);
    private static final Base64Codec codec = new Base64Codec();
    private static final boolean isJaxbAvailable;

    static {
        boolean available;
        try {
            Class.forName("javax.xml.bind.DatatypeConverter");
            available = true;
        } catch (Exception e) {
            available = false;
        }
        isJaxbAvailable = available;
        if (isJaxbAvailable) {
            Map<String, String> inconsistentJaxbImpls = new HashMap<String, String>();
            inconsistentJaxbImpls.put("org.apache.ws.jaxme.impl.JAXBContextImpl", "Apache JaxMe");

            try {
                String className = JAXBContext.newInstance().getClass().getName();
                if (inconsistentJaxbImpls.containsKey(className)) {
                    LOG.warn("A JAXB implementation known to produce base64 encodings that are " +
                             "inconsistent with the reference implementation has been detected. The " +
                             "results of the encodeAsString() method may be incorrect. Implementation: " +
                             inconsistentJaxbImpls.get(className));
                }
            } catch (Exception ignored) {
                // ignore
            } catch (NoClassDefFoundError error){
                // ignore
            }
        } else {
            LOG.warn("JAXB is unavailable. Will fallback to SDK implementation which may be less performant");
        }
    }

    /**
     * Returns a base 64 encoded string of the given bytes.
     */
    public static String encodeAsString(byte... bytes) {
        if (bytes == null) {
            return null;
        }
        if (isJaxbAvailable) {
            try {
                return DatatypeConverter.printBase64Binary(bytes);
            } catch (NullPointerException ex) {
                // https://netbeans.org/bugzilla/show_bug.cgi?id=224923
                // https://issues.apache.org/jira/browse/CAMEL-4893

                // Note the converter should eventually be initialized and printBase64Binary should start working again
                LOG.debug("Recovering from JAXB bug: https://netbeans.org/bugzilla/show_bug.cgi?id=224923", ex);
            }
        }

        return bytes.length == 0 ? "" : CodecUtils.toStringDirect(codec.encode(bytes));
    }

    /**
     * Returns a 64 encoded byte array of the given bytes.
     */
    public static byte[] encode(byte[] bytes) {
        return bytes == null || bytes.length == 0 ? bytes : codec.encode(bytes);
    }

    /**
     * Decodes the given base 64 encoded string,
     * skipping carriage returns, line feeds and spaces as needed.
     */
    public static byte[] decode(String b64) {
        if (b64 == null) {
            return null;
        }
        if (b64.length() == 0) {
            return new byte[0];
        }
        byte[] buf = new byte[b64.length()];
        int len = CodecUtils.sanitize(b64, buf);
        return codec.decode(buf, len);
    }

    /**
     * Decodes the given base 64 encoded bytes.
     */
    public static byte[] decode(byte[] b64) {
        return b64 == null || b64.length == 0 ? b64 : codec.decode(b64, b64.length);
    }
}

