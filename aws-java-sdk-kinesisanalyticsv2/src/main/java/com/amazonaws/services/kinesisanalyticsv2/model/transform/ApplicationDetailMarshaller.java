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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationDetailMarshaller {

    private static final MarshallingInfo<String> APPLICATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationARN").build();
    private static final MarshallingInfo<String> APPLICATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationDescription").build();
    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationName").build();
    private static final MarshallingInfo<String> RUNTIMEENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeEnvironment").build();
    private static final MarshallingInfo<String> SERVICEEXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceExecutionRole").build();
    private static final MarshallingInfo<String> APPLICATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationStatus").build();
    private static final MarshallingInfo<Long> APPLICATIONVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationVersionId").build();
    private static final MarshallingInfo<java.util.Date> CREATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> APPLICATIONCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationConfigurationDescription").build();
    private static final MarshallingInfo<List> CLOUDWATCHLOGGINGOPTIONDESCRIPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptionDescriptions").build();

    private static final ApplicationDetailMarshaller instance = new ApplicationDetailMarshaller();

    public static ApplicationDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationDetail applicationDetail, ProtocolMarshaller protocolMarshaller) {

        if (applicationDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationDetail.getApplicationARN(), APPLICATIONARN_BINDING);
            protocolMarshaller.marshall(applicationDetail.getApplicationDescription(), APPLICATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationDetail.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(applicationDetail.getRuntimeEnvironment(), RUNTIMEENVIRONMENT_BINDING);
            protocolMarshaller.marshall(applicationDetail.getServiceExecutionRole(), SERVICEEXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(applicationDetail.getApplicationStatus(), APPLICATIONSTATUS_BINDING);
            protocolMarshaller.marshall(applicationDetail.getApplicationVersionId(), APPLICATIONVERSIONID_BINDING);
            protocolMarshaller.marshall(applicationDetail.getCreateTimestamp(), CREATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(applicationDetail.getLastUpdateTimestamp(), LASTUPDATETIMESTAMP_BINDING);
            protocolMarshaller.marshall(applicationDetail.getApplicationConfigurationDescription(), APPLICATIONCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationDetail.getCloudWatchLoggingOptionDescriptions(), CLOUDWATCHLOGGINGOPTIONDESCRIPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
