/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.accessanalyzer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GeneratedPolicyPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeneratedPolicyPropertiesMarshaller {

    private static final MarshallingInfo<StructuredPojo> CLOUDTRAILPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cloudTrailProperties").build();
    private static final MarshallingInfo<Boolean> ISCOMPLETE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isComplete").build();
    private static final MarshallingInfo<String> PRINCIPALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("principalArn").build();

    private static final GeneratedPolicyPropertiesMarshaller instance = new GeneratedPolicyPropertiesMarshaller();

    public static GeneratedPolicyPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeneratedPolicyProperties generatedPolicyProperties, ProtocolMarshaller protocolMarshaller) {

        if (generatedPolicyProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generatedPolicyProperties.getCloudTrailProperties(), CLOUDTRAILPROPERTIES_BINDING);
            protocolMarshaller.marshall(generatedPolicyProperties.getIsComplete(), ISCOMPLETE_BINDING);
            protocolMarshaller.marshall(generatedPolicyProperties.getPrincipalArn(), PRINCIPALARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
