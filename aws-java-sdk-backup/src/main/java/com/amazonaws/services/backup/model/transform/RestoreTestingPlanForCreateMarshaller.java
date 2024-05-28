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
 * RestoreTestingPlanForCreateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTestingPlanForCreateMarshaller {

    private static final MarshallingInfo<StructuredPojo> RECOVERYPOINTSELECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecoveryPointSelection").build();
    private static final MarshallingInfo<String> RESTORETESTINGPLANNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreTestingPlanName").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSIONTIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpressionTimezone").build();
    private static final MarshallingInfo<Integer> STARTWINDOWHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartWindowHours").build();

    private static final RestoreTestingPlanForCreateMarshaller instance = new RestoreTestingPlanForCreateMarshaller();

    public static RestoreTestingPlanForCreateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTestingPlanForCreate restoreTestingPlanForCreate, ProtocolMarshaller protocolMarshaller) {

        if (restoreTestingPlanForCreate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTestingPlanForCreate.getRecoveryPointSelection(), RECOVERYPOINTSELECTION_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForCreate.getRestoreTestingPlanName(), RESTORETESTINGPLANNAME_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForCreate.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForCreate.getScheduleExpressionTimezone(), SCHEDULEEXPRESSIONTIMEZONE_BINDING);
            protocolMarshaller.marshall(restoreTestingPlanForCreate.getStartWindowHours(), STARTWINDOWHOURS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
