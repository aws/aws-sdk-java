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

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3EncryptionClient;

/**
 * This class is an extension of {@link InitiateMultipartUploadRequest} to allow
 * additional crypto related attributes to be specified.
 * <p>
 * In particular, this includes the options to
 * <ul>
 * <li>specify encryption material description on a per-request basis;</li>
 * <li>specify whether a new set of encryption material is to be created for the
 * upload or not;</li>
 * </ul>
 * In particular, {@link EncryptedInitiateMultipartUploadRequest} is only
 * recognized by {@link AmazonS3EncryptionClient}.
 * </p>
 * <p>
 * If {@link EncryptedInitiateMultipartUploadRequest} is used against the
 * non-encrypting {@link AmazonS3Client}, these additional attributes will be
 * ignored.
 */
public class EncryptedInitiateMultipartUploadRequest extends
        InitiateMultipartUploadRequest implements MaterialsDescriptionProvider, Serializable {
    /**
     * description of encryption materials to be used with this request.
     */
    private Map<String, String> materialsDescription;
    /**
     * True if a new set of encryption material is to be created; false
     * otherwise. Default is true.
     */
    private boolean createEncryptionMaterial = true;

    public EncryptedInitiateMultipartUploadRequest(String bucketName, String key) {
        super(bucketName, key);
    }

    public EncryptedInitiateMultipartUploadRequest(String bucketName, String key, ObjectMetadata objectMetadata) {
        super(bucketName, key, objectMetadata);
    }

    @Override
    public Map<String, String> getMaterialsDescription() {
        return materialsDescription;
    }

    /**
     * sets the materials description for the encryption materials to be used with the current Multi Part Upload Request.
     * @param materialsDescription the materialsDescription to set
     */
    public void setMaterialsDescription(Map<String, String> materialsDescription) {
        this.materialsDescription = materialsDescription == null
                ? null
                : Collections.unmodifiableMap(new HashMap<String,String>(materialsDescription))
                ;
    }

    /**
     * sets the materials description for the encryption materials to be used with the current Multi Part Upload Request.
     * @param materialsDescription the materialsDescription to set
     */
    public EncryptedInitiateMultipartUploadRequest withMaterialsDescription(Map<String, String> materialsDescription) {
        setMaterialsDescription(materialsDescription);
        return this;
    }

    /**
     * Returns true if a new set of encryption material is to be created; false
     * otherwise.  Default is true.
     */
    public boolean isCreateEncryptionMaterial() {
        return createEncryptionMaterial;
    }

    /**
     * @param createEncryptionMaterial
     *            true if a new set of encryption material is to be created;
     *            false otherwise.
     */
    public void setCreateEncryptionMaterial(boolean createEncryptionMaterial) {
        this.createEncryptionMaterial = createEncryptionMaterial;
    }

    /**
     * @param createEncryptionMaterial
     *            true if a new set of encryption material is to be created;
     *            false otherwise.
     */
    public EncryptedInitiateMultipartUploadRequest withCreateEncryptionMaterial(
            boolean createEncryptionMaterial) {
        this.createEncryptionMaterial = createEncryptionMaterial;
        return this;
    }
}
