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
package com.amazonaws.services.s3.internal.crypto;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.StringUtils;

/**
 * A convenient S3 object wrapper useful for crypto purposes.
 */
class S3ObjectWrapper implements Closeable {
    private final S3Object s3obj;
    private final S3ObjectId id;
    
    S3ObjectWrapper(S3Object s3obj, S3ObjectId id) {
        if (s3obj == null)
            throw new IllegalArgumentException();
        this.s3obj = s3obj;
        this.id = id;
    }

    public S3ObjectId getS3ObjectId() {
        return id;
    }

    ObjectMetadata getObjectMetadata() {
        return s3obj.getObjectMetadata();
    }

    void setObjectMetadata(ObjectMetadata metadata) {
        s3obj.setObjectMetadata(metadata);
    }

    S3ObjectInputStream getObjectContent() {
        return s3obj.getObjectContent();
    }

    void setObjectContent(S3ObjectInputStream objectContent) {
        s3obj.setObjectContent(objectContent);
    }
    
    void setObjectContent(InputStream objectContent) {
        s3obj.setObjectContent(objectContent);
    }

    String getBucketName() {
        return s3obj.getBucketName();
    }

    void setBucketName(String bucketName) {
        s3obj.setBucketName(bucketName);
    }

    String getKey() {
        return s3obj.getKey();
    }

    void setKey(String key) {
        s3obj.setKey(key);
    }
    
    String getRedirectLocation() {
        return s3obj.getRedirectLocation();
    }
    
    void setRedirectLocation(String redirectLocation) {
        s3obj.setRedirectLocation(redirectLocation);
    }

    @Override public String toString() {
        return s3obj.toString();
    }

    /**
     * Returns true if this S3 object has the encryption information stored
     * as user meta data; false otherwise.
     */
    final boolean hasEncryptionInfo() {
        ObjectMetadata metadata = s3obj.getObjectMetadata();
        Map<String, String> userMeta = metadata.getUserMetadata();
        return userMeta != null
            && userMeta.containsKey(Headers.CRYPTO_IV)
            && (userMeta.containsKey(Headers.CRYPTO_KEY_V2)
                || userMeta.containsKey(Headers.CRYPTO_KEY));
    }

    /**
     * Converts and return the underlying S3 object as a json string.
     * 
     * @throws SdkClientException if failed in JSON conversion.
     */
    String toJsonString() {
        try {
            return from(s3obj.getObjectContent());
        } catch (Exception e) {
            throw new SdkClientException("Error parsing JSON: " + e.getMessage());
        }
    }

    private static String from(InputStream is) throws IOException {
        if (is == null)
            return "";
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, StringUtils.UTF8));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } finally {
            is.close();
        }
        return sb.toString();
    }

    @Override
    public void close() throws IOException {
        s3obj.close();
    }

    S3Object getS3Object() { return s3obj; }

    /**
     * Returns the original crypto scheme used for encryption, which may
     * differ from the crypto scheme used for decryption during, for example,
     * a range-get operation. 
     * 
     * @param instructionFile
     *            the instruction file of the s3 object; or null if there is
     *            none.
     */
    ContentCryptoScheme encryptionSchemeOf(Map<String,String> instructionFile) {
        if (instructionFile != null) {
            String cekAlgo = instructionFile.get(Headers.CRYPTO_CEK_ALGORITHM);
            return ContentCryptoScheme.fromCEKAlgo(cekAlgo);
        }
        ObjectMetadata meta = s3obj.getObjectMetadata();
        Map<String, String> userMeta = meta.getUserMetadata();
        String cekAlgo = userMeta.get(Headers.CRYPTO_CEK_ALGORITHM);
        return ContentCryptoScheme.fromCEKAlgo(cekAlgo);
    }
}
