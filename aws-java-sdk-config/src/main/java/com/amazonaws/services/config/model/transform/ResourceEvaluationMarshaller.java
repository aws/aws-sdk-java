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
 * ResourceEvaluationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceEvaluationMarshaller {

    private static final MarshallingInfo<String> RESOURCEEVALUATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceEvaluationId").build();
    private static final MarshallingInfo<String> EVALUATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationMode").build();
    private static final MarshallingInfo<java.util.Date> EVALUATIONSTARTTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationStartTimestamp").timestampFormat("unixTimestamp").build();

    private static final ResourceEvaluationMarshaller instance = new ResourceEvaluationMarshaller();

    public static ResourceEvaluationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceEvaluation resourceEvaluation, ProtocolMarshaller protocolMarshaller) {

        if (resourceEvaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceEvaluation.getResourceEvaluationId(), RESOURCEEVALUATIONID_BINDING);
            protocolMarshaller.marshall(resourceEvaluation.getEvaluationMode(), EVALUATIONMODE_BINDING);
            protocolMarshaller.marshall(resourceEvaluation.getEvaluationStartTimestamp(), EVALUATIONSTARTTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
