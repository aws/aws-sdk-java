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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartReplicationTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartReplicationTaskRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<String> STARTREPLICATIONTASKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartReplicationTaskType").build();
    private static final MarshallingInfo<java.util.Date> CDCSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CDCSTARTPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStartPosition").build();
    private static final MarshallingInfo<String> CDCSTOPPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcStopPosition").build();

    private static final StartReplicationTaskRequestMarshaller instance = new StartReplicationTaskRequestMarshaller();

    public static StartReplicationTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartReplicationTaskRequest startReplicationTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startReplicationTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startReplicationTaskRequest.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(startReplicationTaskRequest.getStartReplicationTaskType(), STARTREPLICATIONTASKTYPE_BINDING);
            protocolMarshaller.marshall(startReplicationTaskRequest.getCdcStartTime(), CDCSTARTTIME_BINDING);
            protocolMarshaller.marshall(startReplicationTaskRequest.getCdcStartPosition(), CDCSTARTPOSITION_BINDING);
            protocolMarshaller.marshall(startReplicationTaskRequest.getCdcStopPosition(), CDCSTOPPOSITION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
