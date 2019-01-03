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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WorkspaceConnectionStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspaceConnectionStatusMarshaller {

    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkspaceId").build();
    private static final MarshallingInfo<String> CONNECTIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionState").build();
    private static final MarshallingInfo<java.util.Date> CONNECTIONSTATECHECKTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionStateCheckTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTKNOWNUSERCONNECTIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastKnownUserConnectionTimestamp").timestampFormat("unixTimestamp").build();

    private static final WorkspaceConnectionStatusMarshaller instance = new WorkspaceConnectionStatusMarshaller();

    public static WorkspaceConnectionStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceConnectionStatus workspaceConnectionStatus, ProtocolMarshaller protocolMarshaller) {

        if (workspaceConnectionStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceConnectionStatus.getWorkspaceId(), WORKSPACEID_BINDING);
            protocolMarshaller.marshall(workspaceConnectionStatus.getConnectionState(), CONNECTIONSTATE_BINDING);
            protocolMarshaller.marshall(workspaceConnectionStatus.getConnectionStateCheckTimestamp(), CONNECTIONSTATECHECKTIMESTAMP_BINDING);
            protocolMarshaller.marshall(workspaceConnectionStatus.getLastKnownUserConnectionTimestamp(), LASTKNOWNUSERCONNECTIONTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
