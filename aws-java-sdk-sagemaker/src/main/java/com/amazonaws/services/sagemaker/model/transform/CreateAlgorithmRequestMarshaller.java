/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateAlgorithmRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAlgorithmRequestMarshaller {

    private static final MarshallingInfo<String> ALGORITHMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmName").build();
    private static final MarshallingInfo<String> ALGORITHMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlgorithmDescription").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrainingSpecification").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSpecification").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATIONSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationSpecification").build();
    private static final MarshallingInfo<Boolean> CERTIFYFORMARKETPLACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertifyForMarketplace").build();

    private static final CreateAlgorithmRequestMarshaller instance = new CreateAlgorithmRequestMarshaller();

    public static CreateAlgorithmRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAlgorithmRequest createAlgorithmRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAlgorithmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAlgorithmRequest.getAlgorithmName(), ALGORITHMNAME_BINDING);
            protocolMarshaller.marshall(createAlgorithmRequest.getAlgorithmDescription(), ALGORITHMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAlgorithmRequest.getTrainingSpecification(), TRAININGSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createAlgorithmRequest.getInferenceSpecification(), INFERENCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(createAlgorithmRequest.getValidationSpecification(), VALIDATIONSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createAlgorithmRequest.getCertifyForMarketplace(), CERTIFYFORMARKETPLACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
