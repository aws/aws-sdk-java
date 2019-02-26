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

import java.util.Map;

/**
 * Interface for providing MaterialsDescription.
 */
public interface MaterialsDescriptionProvider {
    
    /**
     * Returns an unmodifiable view of the MaterialsDescription which the caller 
     * can use to load EncryptionMaterials from any {@link EncryptionMaterialsAccessor}
     * @return materials description.
     */
    public Map<String, String> getMaterialsDescription();
}
