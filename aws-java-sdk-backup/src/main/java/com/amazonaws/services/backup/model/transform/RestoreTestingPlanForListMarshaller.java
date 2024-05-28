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
package com.amazonaws.services.backup.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTestingPlanForListMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTestingPlanForListMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTEXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastExecutionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> RESTORETESTINGPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreTestingPlanArn").build();
    private static final MarshallingInfo<String> RESTORETESTINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreTestingPlanName").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSIONTIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpressionTimezone").build();
    private static final MarshallingInfo<Integer> STARTWINDOWHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartWindowHours").build();

    private static final RestoreTestingPlanForListMarshaller instance = new RestoreTestingPlanForListMarshaller();

    public static RestoreTestingPlanForListMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTestingPlanForList restoreTestingPlanForList, ProtocolMarshaller protocolMarshaller) {

        if (restoreTestingPlanForList == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTestingPlanForList.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getLastExecutionTime(), LASTEXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getRestoreTestingPlanArn(), RESTORETESTINGPLANARN_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getRestoreTestingPlanName(), RESTORETESTINGPLANNAME_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getScheduleExpressionTimezone(), SCHEDULEEXPRESSIONTIMEZONE_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForList.getStartWindowHours(), STARTWINDOWHOURS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
