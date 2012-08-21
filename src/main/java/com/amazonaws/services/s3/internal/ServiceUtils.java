/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.Md5Utils;

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
     * Returns true if the specified ETag was from a multipart upload.
     *
     * @param eTag
     *            The ETag to test.
     *
     * @return True if the specified ETag was from a multipart upload, otherwise
     *         false it if belongs to an object that was uploaded in a single
     *         part.
     */
    public static boolean isMultipartUploadETag(String eTag) {
        return eTag.contains("-");
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
    public static URL convertRequestToUrl(Request<?> request) {
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

    /**
     * Downloads an S3Object, as returned from
     * {@link AmazonS3Client#getObject(com.amazonaws.services.s3.model.GetObjectRequest)},
     * to the specified file.
     *
     * @param s3Object
     *            The S3Object containing a reference to an InputStream
     *            containing the object's data.
     * @param destinationFile
     *            The file to store the object's data in.
     * @param performIntegrityCheck
     *            Boolean valuable to indicate whether do the integrity check or not          
     *            
     */
    public static void downloadObjectToFile(S3Object s3Object, File destinationFile,boolean performIntegrityCheck) {

        // attempt to create the parent if it doesn't exist
        File parentDirectory = destinationFile.getParentFile();
        if ( parentDirectory != null && !parentDirectory.exists() ) {
            parentDirectory.mkdirs();
        }

        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
            byte[] buffer = new byte[1024*10];
            int bytesRead;
            while ((bytesRead = s3Object.getObjectContent().read(buffer)) > -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            try {
                s3Object.getObjectContent().abort();
            } catch ( IOException abortException ) {
                log.warn("Couldn't abort stream", e);
            }
            throw new AmazonClientException(
                    "Unable to store object contents to disk: " + e.getMessage(), e);
        } finally {
            try {outputStream.close();} catch (Exception e) {}
            try {s3Object.getObjectContent().close();} catch (Exception e) {}
        }

        byte[] clientSideHash = null;
        byte[] serverSideHash = null;
        try {
            // Multipart Uploads don't have an MD5 calculated on the service side
            if (ServiceUtils.isMultipartUploadETag(s3Object.getObjectMetadata().getETag()) == false) {
                clientSideHash = Md5Utils.computeMD5Hash(new FileInputStream(destinationFile));
                serverSideHash = BinaryUtils.fromHex(s3Object.getObjectMetadata().getETag());
            }
        } catch (Exception e) {
            log.warn("Unable to calculate MD5 hash to validate download: " + e.getMessage(), e);
        }

        if (performIntegrityCheck && clientSideHash != null && serverSideHash != null && !Arrays.equals(clientSideHash, serverSideHash)) {
            throw new AmazonClientException("Unable to verify integrity of data download.  " +
                    "Client calculated content hash didn't match hash calculated by Amazon S3.  " +
                    "The data stored in '" + destinationFile.getAbsolutePath() + "' may be corrupt.");
        }
    }
}
