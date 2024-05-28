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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoMLResolvedAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLResolvedAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> AUTOMLJOBOBJECTIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLJobObjective").build();
    private static final MarshallingInfo<StructuredPojo> COMPLETIONCRITERIA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletionCriteria").build();
    private static final MarshallingInfo<StructuredPojo> AUTOMLPROBLEMTYPERESOLVEDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMLProblemTypeResolvedAttributes").build();

    private static final AutoMLResolvedAttributesMarshaller instance = new AutoMLResolvedAttributesMarshaller();

    public static AutoMLResolvedAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLResolvedAttributes autoMLResolvedAttributes, ProtocolMarshaller protocolMarshaller) {

        if (autoMLResolvedAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLResolvedAttributes.getAutoMLJobObjective(), AUTOMLJOBOBJECTIVE_BINDING);
            protocolMarshaller.marshall(autoMLResolvedAttributes.getCompletionCriteria(), COMPLETIONCRITERIA_BINDING);
            protocolMarshaller.marshall(autoMLResolvedAttributes.getAutoMLProblemTypeResolvedAttributes(), AUTOMLPROBLEMTYPERESOLVEDATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
