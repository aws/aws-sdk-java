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
 * ResourceEvaluationFiltersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceEvaluationFiltersMarshaller {

    private static final MarshallingInfo<String> EVALUATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationMode").build();
    private static final MarshallingInfo<StructuredPojo> TIMEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeWindow").build();
    private static final MarshallingInfo<String> EVALUATIONCONTEXTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationContextIdentifier").build();

    private static final ResourceEvaluationFiltersMarshaller instance = new ResourceEvaluationFiltersMarshaller();

    public static ResourceEvaluationFiltersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceEvaluationFilters resourceEvaluationFilters, ProtocolMarshaller protocolMarshaller) {

        if (resourceEvaluationFilters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceEvaluationFilters.getEvaluationMode(), EVALUATIONMODE_BINDING);
            protocolMarshaller.marshall(resourceEvaluationFilters.getTimeWindow(), TIMEWINDOW_BINDING);
            protocolMarshaller.marshall(resourceEvaluationFilters.getEvaluationContextIdentifier(), EVALUATIONCONTEXTIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
