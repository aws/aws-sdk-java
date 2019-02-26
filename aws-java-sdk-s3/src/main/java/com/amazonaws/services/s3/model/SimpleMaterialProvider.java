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

import java.util.HashMap;
import java.util.Map;

public class SimpleMaterialProvider implements EncryptionMaterialsProvider,Serializable {
    private final Map<Map<String, String>, EncryptionMaterials> map =
        new HashMap<Map<String, String>, EncryptionMaterials>();
    private EncryptionMaterials latest;

    @Override
    public EncryptionMaterials getEncryptionMaterials(
            Map<String, String> md) {
        return map.get(md);
    }

    @Override
    public EncryptionMaterials getEncryptionMaterials() {
        return latest;
    }

    public SimpleMaterialProvider addMaterial(EncryptionMaterials m) {
        map.put(m.getMaterialsDescription(), m);
        return this;
    }
    
    public SimpleMaterialProvider withLatest(EncryptionMaterials m) {
        return addMaterial(this.latest = m);
    }

    public SimpleMaterialProvider removeMaterial(Map<String, String> md) {
        map.remove(md);
        return this;
    }
    
    public int size() {
        return map.size();
    }

    @Override
    public void refresh() {
    }

}
