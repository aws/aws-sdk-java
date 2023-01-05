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
package com.amazonaws.services.redshiftserverless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.redshiftserverless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RestoreTableFromSnapshotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTableFromSnapshotRequestMarshaller {

    private static final MarshallingInfo<Boolean> ACTIVATECASESENSITIVEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activateCaseSensitiveIdentifier").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> NEWTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newTableName").build();
    private static final MarshallingInfo<String> SNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotName").build();
    private static final MarshallingInfo<String> SOURCEDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceDatabaseName").build();
    private static final MarshallingInfo<String> SOURCESCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceSchemaName").build();
    private static final MarshallingInfo<String> SOURCETABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceTableName").build();
    private static final MarshallingInfo<String> TARGETDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetDatabaseName").build();
    private static final MarshallingInfo<String> TARGETSCHEMANAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetSchemaName").build();
    private static final MarshallingInfo<String> WORKGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workgroupName").build();

    private static final RestoreTableFromSnapshotRequestMarshaller instance = new RestoreTableFromSnapshotRequestMarshaller();

    public static RestoreTableFromSnapshotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTableFromSnapshotRequest restoreTableFromSnapshotRequest, ProtocolMarshaller protocolMarshaller) {

        if (restoreTableFromSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getActivateCaseSensitiveIdentifier(), ACTIVATECASESENSITIVEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getNewTableName(), NEWTABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getSnapshotName(), SNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getSourceDatabaseName(), SOURCEDATABASENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getSourceSchemaName(), SOURCESCHEMANAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getSourceTableName(), SOURCETABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getTargetDatabaseName(), TARGETDATABASENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getTargetSchemaName(), TARGETSCHEMANAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromSnapshotRequest.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
