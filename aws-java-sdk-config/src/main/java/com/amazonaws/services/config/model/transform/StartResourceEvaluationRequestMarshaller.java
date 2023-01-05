/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartResourceEvaluationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartResourceEvaluationRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> RESOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDetails").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationContext").build();
    private static final MarshallingInfo<String> EVALUATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationMode").build();
    private static final MarshallingInfo<Integer> EVALUATIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationTimeout").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();

    private static final StartResourceEvaluationRequestMarshaller instance = new StartResourceEvaluationRequestMarshaller();

    public static StartResourceEvaluationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartResourceEvaluationRequest startResourceEvaluationRequest, ProtocolMarshaller protocolMarshaller) {

        if (startResourceEvaluationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startResourceEvaluationRequest.getResourceDetails(), RESOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(startResourceEvaluationRequest.getEvaluationContext(), EVALUATIONCONTEXT_BINDING);
            protocolMarshaller.marshall(startResourceEvaluationRequest.getEvaluationMode(), EVALUATIONMODE_BINDING);
            protocolMarshaller.marshall(startResourceEvaluationRequest.getEvaluationTimeout(), EVALUATIONTIMEOUT_BINDING);
            protocolMarshaller.marshall(startResourceEvaluationRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
