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
 * AutoMLProblemTypeResolvedAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoMLProblemTypeResolvedAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> TABULARRESOLVEDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TabularResolvedAttributes").build();
    private static final MarshallingInfo<StructuredPojo> TEXTGENERATIONRESOLVEDATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextGenerationResolvedAttributes").build();

    private static final AutoMLProblemTypeResolvedAttributesMarshaller instance = new AutoMLProblemTypeResolvedAttributesMarshaller();

    public static AutoMLProblemTypeResolvedAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoMLProblemTypeResolvedAttributes autoMLProblemTypeResolvedAttributes, ProtocolMarshaller protocolMarshaller) {

        if (autoMLProblemTypeResolvedAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoMLProblemTypeResolvedAttributes.getTabularResolvedAttributes(), TABULARRESOLVEDATTRIBUTES_BINDING);
            protocolMarshaller.marshall(autoMLProblemTypeResolvedAttributes.getTextGenerationResolvedAttributes(), TEXTGENERATIONRESOLVEDATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
