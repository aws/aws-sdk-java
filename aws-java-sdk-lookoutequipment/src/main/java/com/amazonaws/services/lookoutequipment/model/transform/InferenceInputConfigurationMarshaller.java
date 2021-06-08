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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferenceInputConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceInputConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> S3INPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3InputConfiguration").build();
    private static final MarshallingInfo<String> INPUTTIMEZONEOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputTimeZoneOffset").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCEINPUTNAMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceInputNameConfiguration").build();

    private static final InferenceInputConfigurationMarshaller instance = new InferenceInputConfigurationMarshaller();

    public static InferenceInputConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceInputConfiguration inferenceInputConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (inferenceInputConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceInputConfiguration.getS3InputConfiguration(), S3INPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(inferenceInputConfiguration.getInputTimeZoneOffset(), INPUTTIMEZONEOFFSET_BINDING);
            protocolMarshaller.marshall(inferenceInputConfiguration.getInferenceInputNameConfiguration(), INFERENCEINPUTNAMECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
