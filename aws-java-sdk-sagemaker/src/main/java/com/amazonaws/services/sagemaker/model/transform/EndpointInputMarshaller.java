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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EndpointInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointInputMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> LOCALPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LocalPath").build();
    private static final MarshallingInfo<String> S3INPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3InputMode").build();
    private static final MarshallingInfo<String> S3DATADISTRIBUTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DataDistributionType").build();
    private static final MarshallingInfo<String> FEATURESATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FeaturesAttribute").build();
    private static final MarshallingInfo<String> INFERENCEATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceAttribute").build();
    private static final MarshallingInfo<String> PROBABILITYATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProbabilityAttribute").build();
    private static final MarshallingInfo<Double> PROBABILITYTHRESHOLDATTRIBUTE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProbabilityThresholdAttribute").build();
    private static final MarshallingInfo<String> STARTTIMEOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTimeOffset").build();
    private static final MarshallingInfo<String> ENDTIMEOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTimeOffset").build();

    private static final EndpointInputMarshaller instance = new EndpointInputMarshaller();

    public static EndpointInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EndpointInput endpointInput, ProtocolMarshaller protocolMarshaller) {

        if (endpointInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpointInput.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(endpointInput.getLocalPath(), LOCALPATH_BINDING);
            protocolMarshaller.marshall(endpointInput.getS3InputMode(), S3INPUTMODE_BINDING);
            protocolMarshaller.marshall(endpointInput.getS3DataDistributionType(), S3DATADISTRIBUTIONTYPE_BINDING);
            protocolMarshaller.marshall(endpointInput.getFeaturesAttribute(), FEATURESATTRIBUTE_BINDING);
            protocolMarshaller.marshall(endpointInput.getInferenceAttribute(), INFERENCEATTRIBUTE_BINDING);
            protocolMarshaller.marshall(endpointInput.getProbabilityAttribute(), PROBABILITYATTRIBUTE_BINDING);
            protocolMarshaller.marshall(endpointInput.getProbabilityThresholdAttribute(), PROBABILITYTHRESHOLDATTRIBUTE_BINDING);
            protocolMarshaller.marshall(endpointInput.getStartTimeOffset(), STARTTIMEOFFSET_BINDING);
            protocolMarshaller.marshall(endpointInput.getEndTimeOffset(), ENDTIMEOFFSET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
