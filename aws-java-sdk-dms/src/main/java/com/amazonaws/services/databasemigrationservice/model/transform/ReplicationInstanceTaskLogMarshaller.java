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
 * ReplicationInstanceTaskLogMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationInstanceTaskLogMarshaller {

    private static final MarshallingInfo<String> REPLICATIONTASKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskName").build();
    private static final MarshallingInfo<String> REPLICATIONTASKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationTaskArn").build();
    private static final MarshallingInfo<Long> REPLICATIONINSTANCETASKLOGSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceTaskLogSize").build();

    private static final ReplicationInstanceTaskLogMarshaller instance = new ReplicationInstanceTaskLogMarshaller();

    public static ReplicationInstanceTaskLogMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationInstanceTaskLog replicationInstanceTaskLog, ProtocolMarshaller protocolMarshaller) {

        if (replicationInstanceTaskLog == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationInstanceTaskLog.getReplicationTaskName(), REPLICATIONTASKNAME_BINDING);
            protocolMarshaller.marshall(replicationInstanceTaskLog.getReplicationTaskArn(), REPLICATIONTASKARN_BINDING);
            protocolMarshaller.marshall(replicationInstanceTaskLog.getReplicationInstanceTaskLogSize(), REPLICATIONINSTANCETASKLOGSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
