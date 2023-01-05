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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhuborchestrator.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MigrationWorkflowSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MigrationWorkflowSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TEMPLATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateId").build();
    private static final MarshallingInfo<String> ADSAPPLICATIONCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adsApplicationConfigurationName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<Integer> COMPLETEDSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completedSteps").build();
    private static final MarshallingInfo<Integer> TOTALSTEPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalSteps").build();

    private static final MigrationWorkflowSummaryMarshaller instance = new MigrationWorkflowSummaryMarshaller();

    public static MigrationWorkflowSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MigrationWorkflowSummary migrationWorkflowSummary, ProtocolMarshaller protocolMarshaller) {

        if (migrationWorkflowSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(migrationWorkflowSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getTemplateId(), TEMPLATEID_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getAdsApplicationConfigurationName(), ADSAPPLICATIONCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getCompletedSteps(), COMPLETEDSTEPS_BINDING);
            protocolMarshaller.marshall(migrationWorkflowSummary.getTotalSteps(), TOTALSTEPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
