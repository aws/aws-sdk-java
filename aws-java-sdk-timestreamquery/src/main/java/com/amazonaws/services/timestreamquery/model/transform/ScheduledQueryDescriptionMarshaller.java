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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduledQueryDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduledQueryDescriptionMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> QUERYSTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryString").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> PREVIOUSINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreviousInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> NEXTINVOCATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextInvocationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduleConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NOTIFICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NotificationConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> TARGETCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetConfiguration").build();
    private static final MarshallingInfo<String> SCHEDULEDQUERYEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScheduledQueryExecutionRoleArn").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<StructuredPojo> ERRORREPORTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorReportConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LASTRUNSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRunSummary").build();
    private static final MarshallingInfo<List> RECENTLYFAILEDRUNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecentlyFailedRuns").build();

    private static final ScheduledQueryDescriptionMarshaller instance = new ScheduledQueryDescriptionMarshaller();

    public static ScheduledQueryDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduledQueryDescription scheduledQueryDescription, ProtocolMarshaller protocolMarshaller) {

        if (scheduledQueryDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduledQueryDescription.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getQueryString(), QUERYSTRING_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getState(), STATE_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getPreviousInvocationTime(), PREVIOUSINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getNextInvocationTime(), NEXTINVOCATIONTIME_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getScheduleConfiguration(), SCHEDULECONFIGURATION_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getNotificationConfiguration(), NOTIFICATIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getTargetConfiguration(), TARGETCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getScheduledQueryExecutionRoleArn(), SCHEDULEDQUERYEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getErrorReportConfiguration(), ERRORREPORTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getLastRunSummary(), LASTRUNSUMMARY_BINDING);
            protocolMarshaller.marshall(scheduledQueryDescription.getRecentlyFailedRuns(), RECENTLYFAILEDRUNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
