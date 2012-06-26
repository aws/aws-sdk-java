/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Simple implementation of EncryptionMaterialsProvider that just wraps static
 * EncryptionMaterials.
 */
public class StaticEncryptionMaterialsProvider implements EncryptionMaterialsProvider {
    
    private final EncryptionMaterials materials;

    public StaticEncryptionMaterialsProvider(EncryptionMaterials materials) {
        this.materials = materials;
    }

    public EncryptionMaterials getEncryptionMaterials() {
        return materials;
    }

    public void refresh() {}

    public EncryptionMaterials getEncryptionMaterials(Map<String, String> materialsDescription) {
        if (materialsDescription.equals(materials.getMaterialsDescription())) {
            return materials;
        }
        else {
            EncryptionMaterialsAccessor accessor = materials.getAccessor();
            if (accessor == null) {
                return null;
            }
            return accessor.getEncryptionMaterials(materialsDescription);
        }
    }
}
