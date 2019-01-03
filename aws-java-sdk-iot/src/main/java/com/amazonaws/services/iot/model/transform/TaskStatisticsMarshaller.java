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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskStatisticsMarshaller {

    private static final MarshallingInfo<Integer> TOTALCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalChecks").build();
    private static final MarshallingInfo<Integer> INPROGRESSCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inProgressChecks").build();
    private static final MarshallingInfo<Integer> WAITINGFORDATACOLLECTIONCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("waitingForDataCollectionChecks").build();
    private static final MarshallingInfo<Integer> COMPLIANTCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("compliantChecks").build();
    private static final MarshallingInfo<Integer> NONCOMPLIANTCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nonCompliantChecks").build();
    private static final MarshallingInfo<Integer> FAILEDCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedChecks").build();
    private static final MarshallingInfo<Integer> CANCELEDCHECKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canceledChecks").build();

    private static final TaskStatisticsMarshaller instance = new TaskStatisticsMarshaller();

    public static TaskStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskStatistics taskStatistics, ProtocolMarshaller protocolMarshaller) {

        if (taskStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskStatistics.getTotalChecks(), TOTALCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getInProgressChecks(), INPROGRESSCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getWaitingForDataCollectionChecks(), WAITINGFORDATACOLLECTIONCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getCompliantChecks(), COMPLIANTCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getNonCompliantChecks(), NONCOMPLIANTCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getFailedChecks(), FAILEDCHECKS_BINDING);
            protocolMarshaller.marshall(taskStatistics.getCanceledChecks(), CANCELEDCHECKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
