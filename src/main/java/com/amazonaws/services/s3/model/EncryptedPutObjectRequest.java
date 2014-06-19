/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is an extension of {@link PutObjectRequest} to allow additional encryption material description
 * to be specified on a per-request basis.In particular, {@link EncryptedPutObjectRequest} is only recognized 
 * by {@link AmazonS3EncryptionJavaClient}.
 * </p>
 * <p>
 * If {@link EncryptedPutObjectRequest} is used against the non-encrypting {@link AmazonS3JavaClient}, the additional 
 * attributes will be ignored.
 * </p>
 */
public class EncryptedPutObjectRequest extends PutObjectRequest implements MaterialsDescriptionProvider {
    
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
    
}
