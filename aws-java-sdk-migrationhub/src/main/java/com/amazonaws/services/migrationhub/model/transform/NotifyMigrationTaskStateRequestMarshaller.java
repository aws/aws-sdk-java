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
package com.amazonaws.services.migrationhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NotifyMigrationTaskStateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NotifyMigrationTaskStateRequestMarshaller {

    private static final MarshallingInfo<String> PROGRESSUPDATESTREAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgressUpdateStream").build();
    private static final MarshallingInfo<String> MIGRATIONTASKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MigrationTaskName").build();
    private static final MarshallingInfo<StructuredPojo> TASK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Task").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> NEXTUPDATESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NextUpdateSeconds").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();

    private static final NotifyMigrationTaskStateRequestMarshaller instance = new NotifyMigrationTaskStateRequestMarshaller();

    public static NotifyMigrationTaskStateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest, ProtocolMarshaller protocolMarshaller) {

        if (notifyMigrationTaskStateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getProgressUpdateStream(), PROGRESSUPDATESTREAM_BINDING);
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getMigrationTaskName(), MIGRATIONTASKNAME_BINDING);
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getTask(), TASK_BINDING);
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getUpdateDateTime(), UPDATEDATETIME_BINDING);
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getNextUpdateSeconds(), NEXTUPDATESECONDS_BINDING);
            protocolMarshaller.marshall(notifyMigrationTaskStateRequest.getDryRun(), DRYRUN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
