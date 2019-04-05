/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

/**
 * Retrieves encryption materials from some source.
 */
public interface EncryptionMaterialsAccessor {

    /**
     * Retrieves encryption materials matching the specified description from some source.
     *  
     * @param materialsDescription
     *      A Map<String, String> whose key-value pairs describe an encryption materials object
     * @return
     *      The encryption materials that match the description, or null if no matching encryption materials found.
     */
    public EncryptionMaterials getEncryptionMaterials(Map<String, String> materialsDescription);
}
