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
package com.amazonaws.services.redshiftserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateScheduledActionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateScheduledActionRequestMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schedule").build();
    private static final MarshallingInfo<String> SCHEDULEDACTIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledActionDescription").build();
    private static final MarshallingInfo<String> SCHEDULEDACTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scheduledActionName").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> TARGETACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetAction").build();

    private static final CreateScheduledActionRequestMarshaller instance = new CreateScheduledActionRequestMarshaller();

    public static CreateScheduledActionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateScheduledActionRequest createScheduledActionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createScheduledActionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createScheduledActionRequest.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getScheduledActionDescription(), SCHEDULEDACTIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getScheduledActionName(), SCHEDULEDACTIONNAME_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(createScheduledActionRequest.getTargetAction(), TARGETACTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
