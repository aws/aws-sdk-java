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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEvaluationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEvaluationRequestMarshaller {

    private static final MarshallingInfo<String> EVALUATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationId").build();
    private static final MarshallingInfo<String> EVALUATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationName").build();
    private static final MarshallingInfo<String> MLMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MLModelId").build();
    private static final MarshallingInfo<String> EVALUATIONDATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationDataSourceId").build();

    private static final CreateEvaluationRequestMarshaller instance = new CreateEvaluationRequestMarshaller();

    public static CreateEvaluationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEvaluationRequest createEvaluationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEvaluationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEvaluationRequest.getEvaluationId(), EVALUATIONID_BINDING);
            protocolMarshaller.marshall(createEvaluationRequest.getEvaluationName(), EVALUATIONNAME_BINDING);
            protocolMarshaller.marshall(createEvaluationRequest.getMLModelId(), MLMODELID_BINDING);
            protocolMarshaller.marshall(createEvaluationRequest.getEvaluationDataSourceId(), EVALUATIONDATASOURCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
