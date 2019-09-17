/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;

/**
 * <p>
 * This class is an extension of {@link PutObjectRequest} to allow additional
 * encryption material description to be specified on a per-request basis.In
 * particular, {@link EncryptedPutObjectRequest} is only recognized by
 * {@link AmazonS3EncryptionClient}.
 * </p>
 * <p>
 * If {@link EncryptedPutObjectRequest} is used against the non-encrypting
 * {@link AmazonS3Client}, the additional attributes will be ignored.
 * </p>
 */
public class EncryptedPutObjectRequest extends PutObjectRequest implements
        MaterialsDescriptionProvider, Serializable {
    /**
     * description of encryption materials to be used with this request.
     */
    private Map<String, String> materialsDescription;

    public EncryptedPutObjectRequest(String bucketName, String key, File file) {
        super(bucketName, key, file);
    }

    public EncryptedPutObjectRequest(String bucketName, String key, String redirectLocation) {
        super(bucketName, key, redirectLocation);
    }

    public EncryptedPutObjectRequest(String bucketName, String key, InputStream input, ObjectMetadata metadata) {
        super(bucketName, key, input, metadata);
    }

    @Override
    public Map<String, String> getMaterialsDescription() {
        return materialsDescription;
    }

    /**
     * sets the materials description for the encryption materials to be used with the current PutObjectRequest.
     * @param materialsDescription the materialsDescription to set
     */
    public void setMaterialsDescription(Map<String, String> materialsDescription) {
        this.materialsDescription = materialsDescription == null
                ? null
                : Collections.unmodifiableMap(new HashMap<String,String>(materialsDescription))
                ;
    }

    /**
     * sets the materials description for the encryption materials to be used with the current PutObjectRequest.
     * @param materialsDescription the materialsDescription to set
     */
    public EncryptedPutObjectRequest withMaterialsDescription(Map<String, String> materialsDescription) {
        setMaterialsDescription(materialsDescription);
        return this;
    }

    /**
     * Returns a clone (as deep as possible) of this request object.
     */
    @Override
    public EncryptedPutObjectRequest clone() {
        EncryptedPutObjectRequest cloned = (EncryptedPutObjectRequest) super.clone();
        final Map<String, String> materialsDescription = getMaterialsDescription();
        cloned.withMaterialsDescription(materialsDescription == null
            ? null
            : new HashMap<String, String>(materialsDescription))
            ;
        return cloned;
    }
}
