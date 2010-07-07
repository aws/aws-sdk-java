/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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
package com.amazonaws.services.s3.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;

/**
 * General utility methods used throughout the AWS S3 Java client.
 */
public class ServiceUtils {
    private static final Log log = LogFactory.getLog(ServiceUtils.class);

    protected static final DateUtils dateUtils = new DateUtils();

    public static Date parseIso8601Date(String dateString) throws ParseException {
        return dateUtils.parseIso8601Date(dateString);
    }

    public static String formatIso8601Date(Date date) {
        return dateUtils.formatIso8601Date(date);
    }

    public static Date parseRfc822Date(String dateString) throws ParseException {
        return dateUtils.parseRfc822Date(dateString);
    }

    public static String formatRfc822Date(Date date) {
        return dateUtils.formatRfc822Date(date);
    }

    /**
     * Calculate the HMAC/SHA1 on a string.
     *
     * @param awsSecretKey
     *            AWS secret key.
     * @param canonicalString
     *            canonical string representing the request to sign.
     * @return Signature
     * @throws AmazonClientException
     */
    public static String signWithHmacSha1(String awsSecretKey, String canonicalString)
        throws AmazonClientException
    {
        if (awsSecretKey == null) {
        	if (log.isDebugEnabled()) {
        		log.debug("Canonical string will not be signed, as no AWS Secret Key was provided");
        	}
            return null;
        }

        // The following HMAC/SHA1 code for the signature is taken from the
        // AWS Platform's implementation of RFC2104 (amazon.webservices.common.Signature)
        //
        // Acquire an HMAC/SHA1 from the raw key bytes.
        SecretKeySpec signingKey = null;
        try {
            signingKey = new SecretKeySpec(awsSecretKey.getBytes(Constants.DEFAULT_ENCODING),
                Constants.HMAC_SHA1_ALGORITHM);
        } catch (UnsupportedEncodingException e) {
            throw new AmazonClientException("Unable to get bytes from secret string", e);
        }

        // Acquire the MAC instance and initialize with the signing key.
        Mac mac = null;
        try {
            mac = Mac.getInstance(Constants.HMAC_SHA1_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            // should not happen
            throw new RuntimeException("Could not find sha1 algorithm", e);
        }
        try {
            mac.init(signingKey);
        } catch (InvalidKeyException e) {
            // also should not happen
            throw new RuntimeException("Could not initialize the MAC algorithm", e);
        }

        // Compute the HMAC on the digest, and set it.
        try {
            byte[] b64 = Base64.encodeBase64(mac.doFinal(
                canonicalString.getBytes(Constants.DEFAULT_ENCODING)));
            return new String(b64);
        } catch (UnsupportedEncodingException e) {
            throw new AmazonClientException("Unable to get bytes from canonical string", e);
        }
    }

    /**
     * Converts byte data to a Hex-encoded string.
     *
     * @param data
     *            data to hex encode.
     * @return hex-encoded string.
     */
    public static String toHex(byte[] data) {
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (int i = 0; i < data.length; i++) {
            String hex = Integer.toHexString(data[i]);
            if (hex.length() == 1) {
                // Append leading zero.
                sb.append("0");
            } else if (hex.length() == 8) {
                // Remove ff prefix from negative numbers.
                hex = hex.substring(6);
            }
            sb.append(hex);
        }
        return sb.toString().toLowerCase(Locale.getDefault());
    }

    /**
     * Converts a Hex-encoded data string to the original byte data.
     *
     * @param hexData
     *            hex-encoded data to decode.
     * @return decoded data from the hex string.
     */
    public static byte[] fromHex(String hexData) {
        byte[] result = new byte[(hexData.length() + 1) / 2];
        String hexNumber = null;
        int stringOffset = 0;
        int byteOffset = 0;
        while (stringOffset < hexData.length()) {
            hexNumber = hexData.substring(stringOffset, stringOffset + 2);
            stringOffset += 2;
            result[byteOffset++] = (byte) Integer.parseInt(hexNumber, 16);
        }
        return result;
    }

    /**
     * Converts byte data to a Base64-encoded string.
     *
     * @param data
     *            data to Base64 encode.
     * @return encoded Base64 string.
     */
    public static String toBase64(byte[] data) {
        byte[] b64 = Base64.encodeBase64(data);
        return new String(b64);
    }

    /**
     * Converts a Base64-encoded string to the original byte data.
     *
     * @param b64Data
     *            a Base64-encoded string to decode.
     *
     * @return bytes decoded from a Base64 string.
     */
    public static byte[] fromBase64(String b64Data) {
        byte[] decoded;
        try {
            decoded = Base64.decodeBase64(b64Data.getBytes(Constants.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException uee) {
            // Shouldn't happen if the string is truly Base64 encoded.
            log.warn("Tried to Base64-decode a String with the wrong encoding: ", uee);
            decoded = Base64.decodeBase64(b64Data.getBytes());
        }
        return decoded;
    }

    /**
     * Safely converts a string to a byte array, first attempting to explicitly
     * use our preferred encoding (UTF-8), and then falling back to the
     * platform's default encoding if for some reason our preferred encoding
     * isn't supported.
     * 
     * @param s
     *            The string to convert to a byte array.
     * 
     * @return The byte array contents of the specified string.
     */
    public static byte[] toByteArray(String s) {
        try {
            return s.getBytes(Constants.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            log.warn("Encoding " + Constants.DEFAULT_ENCODING + " is not supported", e);
            return s.getBytes();
        }
    }

    /**
     * Computes the MD5 hash of the data in the given input stream and returns
     * it as a hex string.
     *
     * @param is
     * @return MD5 hash
     * @throws NoSuchAlgorithmException
     * @throws IOException
     */
    public static byte[] computeMD5Hash(InputStream is) throws NoSuchAlgorithmException, IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[16384];
            int bytesRead = -1;
            while ((bytesRead = bis.read(buffer, 0, buffer.length)) != -1) {
                messageDigest.update(buffer, 0, bytesRead);
            }
            return messageDigest.digest();
        } finally {
            try {
                bis.close();
            } catch (Exception e) {
                System.err.println("Unable to close input stream of hash candidate: " + e);
            }
        }
    }

    /**
     * Computes the MD5 hash of the given data and returns it as a hex string.
     *
     * @param data
     * @return MD5 hash.
     * @throws NoSuchAlgorithmException
     * @throws IOException
     */
    public static byte[] computeMD5Hash(byte[] data) throws NoSuchAlgorithmException, IOException {
        return computeMD5Hash(new ByteArrayInputStream(data));
    }

    /**
     * Removes any surrounding quotes from the specified string and returns a
     * new string.
     *
     * @param s
     *            The string to check for surrounding quotes.
     *
     * @return A new string created from the specified string, minus any
     *         surrounding quotes.
     */
    public static String removeQuotes(String s) {
        if (s == null) return null;

        s = s.trim();
        if (s.startsWith("\"")) s = s.substring(1);
        if (s.endsWith("\"")) s = s.substring(0, s.length() - 1);

        return s;
    }

    /**
     * URL encodes the specified string and returns it.  All keys specified by
     * users need to URL encoded.  The URL encoded key needs to be used in the
     * string to sign (canonical resource path).
     *
     * @param s
     *            The string to URL encode.
     *
     * @return The new, URL encoded, string.
     */
    public static String urlEncode(String s) {
        if (s == null) return null;

        try {
            String encodedString = URLEncoder.encode(s, Constants.DEFAULT_ENCODING);
            // Web browsers do not always handle '+' characters well, use the
            // well-supported '%20' instead.
            return encodedString.replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            throw new AmazonClientException("Unable to encode path: " + s, e);
        }
    }

    /**
     * Converts the specified request object into a URL, containing all the
     * specified parameters, the specified request endpoint, etc.
     *
     * @param request
     *            The request to convert into a URL.
     * @return A new URL representing the specified request.
     *
     * @throws AmazonClientException
     *             If the request cannot be converted to a well formed URL.
     */
    public static URL convertRequestToUrl(Request<Void> request) {
        String urlString =  request.getEndpoint()
            + "/" + request.getResourcePath();

        boolean firstParam = true;
        for (String param : request.getParameters().keySet()) {
            if (firstParam) {
                urlString += "?";
                firstParam = false;
            } else {
                urlString += "&";
            }

            String value = request.getParameters().get(param);
            urlString += param + "=" + ServiceUtils.urlEncode(value);
        }

        try {
            return new URL(urlString);
        } catch (MalformedURLException e) {
            throw new AmazonClientException(
                    "Unable to convert request to well formed URL: " + e.getMessage(), e);
        }
    }

    /**
     * Returns a new string created by joining each of the strings in the
     * specified list together, with a comma between them.
     *
     * @param strings
     *            The list of strings to join into a single, comma delimited
     *            string list.
     * @return A new string created by joining each of the strings in the
     *         specified list together, with a comma between strings.
     */
    public static String join(List<String> strings) {
        String result = "";

        boolean first = true;
        for (String s : strings) {
            if (!first) result += ", ";

            result += s;
            first = false;
        }

        return result;
    }

}
