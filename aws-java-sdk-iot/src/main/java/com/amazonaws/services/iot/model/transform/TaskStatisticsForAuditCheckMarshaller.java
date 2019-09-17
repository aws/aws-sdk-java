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
 * TaskStatisticsForAuditCheckMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskStatisticsForAuditCheckMarshaller {

    private static final MarshallingInfo<Long> TOTALFINDINGSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalFindingsCount").build();
    private static final MarshallingInfo<Long> FAILEDFINDINGSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failedFindingsCount").build();
    private static final MarshallingInfo<Long> SUCCEEDEDFINDINGSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("succeededFindingsCount").build();
    private static final MarshallingInfo<Long> SKIPPEDFINDINGSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("skippedFindingsCount").build();
    private static final MarshallingInfo<Long> CANCELEDFINDINGSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canceledFindingsCount").build();

    private static final TaskStatisticsForAuditCheckMarshaller instance = new TaskStatisticsForAuditCheckMarshaller();

    public static TaskStatisticsForAuditCheckMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskStatisticsForAuditCheck taskStatisticsForAuditCheck, ProtocolMarshaller protocolMarshaller) {

        if (taskStatisticsForAuditCheck == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskStatisticsForAuditCheck.getTotalFindingsCount(), TOTALFINDINGSCOUNT_BINDING);
            protocolMarshaller.marshall(taskStatisticsForAuditCheck.getFailedFindingsCount(), FAILEDFINDINGSCOUNT_BINDING);
            protocolMarshaller.marshall(taskStatisticsForAuditCheck.getSucceededFindingsCount(), SUCCEEDEDFINDINGSCOUNT_BINDING);
            protocolMarshaller.marshall(taskStatisticsForAuditCheck.getSkippedFindingsCount(), SKIPPEDFINDINGSCOUNT_BINDING);
            protocolMarshaller.marshall(taskStatisticsForAuditCheck.getCanceledFindingsCount(), CANCELEDFINDINGSCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
