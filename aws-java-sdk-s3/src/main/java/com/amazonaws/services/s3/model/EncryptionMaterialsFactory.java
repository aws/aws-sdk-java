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

/**
 * Factory for providing the latest encryption materials.
 */
public interface EncryptionMaterialsFactory {
    /**
     * Returns EncryptionMaterials which the caller can use for encryption.
     * Each implementation of EncryptionMaterialsProvider can choose its own
     * strategy for loading encryption material.  For example, an
     * implementation might load encryption material from an existing key
     * management system, or load new encryption material when keys are
     * rotated.
     *
     * @return EncryptionMaterials which the caller can use to encrypt or
     * decrypt data.
     */
    public EncryptionMaterials getEncryptionMaterials();
}
