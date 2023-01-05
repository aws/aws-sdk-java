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
package com.amazonaws.services.timestreamquery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduledQueryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduledQueryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> PREVIOUSINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NEXTINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> ERRORREPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorReportConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> TARGETDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDestination").build();
    private static final MarshallingInfo<String> LASTRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRunStatus").build();

    private static final ScheduledQueryMarshaller instance = new ScheduledQueryMarshaller();

    public static ScheduledQueryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduledQuery scheduledQuery, ProtocolMarshaller protocolMarshaller) {

        if (scheduledQuery == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduledQuery.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getName(), NAME_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getState(), STATE_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getPreviousInvocationTime(), PREVIOUSINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getNextInvocationTime(), NEXTINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getErrorReportConfiguration(), ERRORREPORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getTargetDestination(), TARGETDESTINATION_BINDING);
            protocolMarshaller.marshall(scheduledQuery.getLastRunStatus(), LASTRUNSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
