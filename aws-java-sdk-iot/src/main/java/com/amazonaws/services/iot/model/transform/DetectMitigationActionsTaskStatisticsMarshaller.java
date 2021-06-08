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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DetectMitigationActionsTaskStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DetectMitigationActionsTaskStatisticsMarshaller {

    private static final MarshallingInfo<Long> ACTIONSEXECUTED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionsExecuted").build();
    private static final MarshallingInfo<Long> ACTIONSSKIPPED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionsSkipped").build();
    private static final MarshallingInfo<Long> ACTIONSFAILED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actionsFailed").build();

    private static final DetectMitigationActionsTaskStatisticsMarshaller instance = new DetectMitigationActionsTaskStatisticsMarshaller();

    public static DetectMitigationActionsTaskStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DetectMitigationActionsTaskStatistics detectMitigationActionsTaskStatistics, ProtocolMarshaller protocolMarshaller) {

        if (detectMitigationActionsTaskStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(detectMitigationActionsTaskStatistics.getActionsExecuted(), ACTIONSEXECUTED_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskStatistics.getActionsSkipped(), ACTIONSSKIPPED_BINDING);
            protocolMarshaller.marshall(detectMitigationActionsTaskStatistics.getActionsFailed(), ACTIONSFAILED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
