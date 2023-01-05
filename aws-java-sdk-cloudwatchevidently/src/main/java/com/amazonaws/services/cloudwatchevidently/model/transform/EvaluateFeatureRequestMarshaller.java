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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevidently.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EvaluateFeatureRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EvaluateFeatureRequestMarshaller {

    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityId").build();
    private static final MarshallingInfo<String> EVALUATIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationContext").build();
    private static final MarshallingInfo<String> FEATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("feature").build();
    private static final MarshallingInfo<String> PROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("project").build();

    private static final EvaluateFeatureRequestMarshaller instance = new EvaluateFeatureRequestMarshaller();

    public static EvaluateFeatureRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EvaluateFeatureRequest evaluateFeatureRequest, ProtocolMarshaller protocolMarshaller) {

        if (evaluateFeatureRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(evaluateFeatureRequest.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(evaluateFeatureRequest.getEvaluationContext(), EVALUATIONCONTEXT_BINDING);
            protocolMarshaller.marshall(evaluateFeatureRequest.getFeature(), FEATURE_BINDING);
            protocolMarshaller.marshall(evaluateFeatureRequest.getProject(), PROJECT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
