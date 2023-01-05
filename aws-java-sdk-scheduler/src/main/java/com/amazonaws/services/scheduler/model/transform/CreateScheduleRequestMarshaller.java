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
package com.amazonaws.services.scheduler.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.scheduler.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateScheduleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateScheduleRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> ENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> FLEXIBLETIMEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FlexibleTimeWindow").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpression").build();
    private static final MarshallingInfo<String> SCHEDULEEXPRESSIONTIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleExpressionTimezone").build();
    private static final MarshallingInfo<java.util.Date> STARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<StructuredPojo> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Target").build();

    private static final CreateScheduleRequestMarshaller instance = new CreateScheduleRequestMarshaller();

    public static CreateScheduleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateScheduleRequest createScheduleRequest, ProtocolMarshaller protocolMarshaller) {

        if (createScheduleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createScheduleRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getEndDate(), ENDDATE_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getFlexibleTimeWindow(), FLEXIBLETIMEWINDOW_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getScheduleExpression(), SCHEDULEEXPRESSION_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getScheduleExpressionTimezone(), SCHEDULEEXPRESSIONTIMEZONE_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getStartDate(), STARTDATE_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getState(), STATE_BINDING);
            protocolMarshaller.marshall(createScheduleRequest.getTarget(), TARGET_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
