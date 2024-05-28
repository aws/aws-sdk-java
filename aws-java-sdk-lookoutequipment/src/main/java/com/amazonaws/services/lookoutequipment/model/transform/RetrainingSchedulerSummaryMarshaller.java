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
package com.amazonaws.services.lookoutequipment.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutequipment.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetrainingSchedulerSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetrainingSchedulerSummaryMarshaller {

    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<String> MODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<java.util.Date> RETRAININGSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrainingStartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RETRAININGFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrainingFrequency").build();
    private static final MarshallingInfo<String> LOOKBACKWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LookbackWindow").build();

    private static final RetrainingSchedulerSummaryMarshaller instance = new RetrainingSchedulerSummaryMarshaller();

    public static RetrainingSchedulerSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetrainingSchedulerSummary retrainingSchedulerSummary, ProtocolMarshaller protocolMarshaller) {

        if (retrainingSchedulerSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retrainingSchedulerSummary.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(retrainingSchedulerSummary.getModelArn(), MODELARN_BINDING);
            protocolMarshaller.marshall(retrainingSchedulerSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(retrainingSchedulerSummary.getRetrainingStartDate(), RETRAININGSTARTDATE_BINDING);
            protocolMarshaller.marshall(retrainingSchedulerSummary.getRetrainingFrequency(), RETRAININGFREQUENCY_BINDING);
            protocolMarshaller.marshall(retrainingSchedulerSummary.getLookbackWindow(), LOOKBACKWINDOW_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
