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
package com.amazonaws.services.logs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.logs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAnomalyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAnomalyRequestMarshaller {

    private static final MarshallingInfo<String> ANOMALYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("anomalyId").build();
    private static final MarshallingInfo<String> PATTERNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("patternId").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("anomalyDetectorArn").build();
    private static final MarshallingInfo<String> SUPPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressionType").build();
    private static final MarshallingInfo<StructuredPojo> SUPPRESSIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suppressionPeriod").build();

    private static final UpdateAnomalyRequestMarshaller instance = new UpdateAnomalyRequestMarshaller();

    public static UpdateAnomalyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAnomalyRequest updateAnomalyRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAnomalyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAnomalyRequest.getAnomalyId(), ANOMALYID_BINDING);
            protocolMarshaller.marshall(updateAnomalyRequest.getPatternId(), PATTERNID_BINDING);
            protocolMarshaller.marshall(updateAnomalyRequest.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(updateAnomalyRequest.getSuppressionType(), SUPPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(updateAnomalyRequest.getSuppressionPeriod(), SUPPRESSIONPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
