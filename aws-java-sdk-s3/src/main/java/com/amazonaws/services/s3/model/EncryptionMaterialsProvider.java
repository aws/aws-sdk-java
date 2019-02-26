/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for providing encryption materials.
 * Implementations are free to use any strategy for providing encryption
 * materials, such as simply providing static material that doesn't change,
 * or more complicated implementations, such as integrating with existing
 * key management systems.
 */
public interface EncryptionMaterialsProvider extends
        EncryptionMaterialsAccessor, EncryptionMaterialsFactory {
    /**
     * Forces this encryption materials provider to refresh its encryption
     * material.  For many implementations of encryption materials provider,
     * this may simply be a no-op, such as any encryption materials provider
     * implementation that vends static/non-changing encryption material.
     * For other implementations that vend different encryption material
     * throughout their lifetime, this method should force the encryption
     * materials provider to refresh its encryption material.
     */
    public void refresh();
}
