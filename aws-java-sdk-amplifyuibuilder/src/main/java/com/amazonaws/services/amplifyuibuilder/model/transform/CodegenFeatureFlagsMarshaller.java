/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplifyuibuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifyuibuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodegenFeatureFlagsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodegenFeatureFlagsMarshaller {

    private static final MarshallingInfo<Boolean> ISRELATIONSHIPSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRelationshipSupported").build();
    private static final MarshallingInfo<Boolean> ISNONMODELSUPPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isNonModelSupported").build();

    private static final CodegenFeatureFlagsMarshaller instance = new CodegenFeatureFlagsMarshaller();

    public static CodegenFeatureFlagsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodegenFeatureFlags codegenFeatureFlags, ProtocolMarshaller protocolMarshaller) {

        if (codegenFeatureFlags == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codegenFeatureFlags.getIsRelationshipSupported(), ISRELATIONSHIPSUPPORTED_BINDING);
            protocolMarshaller.marshall(codegenFeatureFlags.getIsNonModelSupported(), ISNONMODELSUPPORTED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
