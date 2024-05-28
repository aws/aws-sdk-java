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
 * RestoreTableFromRecoveryPointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RestoreTableFromRecoveryPointRequestMarshaller {

    private static final MarshallingInfo<Boolean> ACTIVATECASESENSITIVEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activateCaseSensitiveIdentifier").build();
    private static final MarshallingInfo<String> NAMESPACENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("namespaceName").build();
    private static final MarshallingInfo<String> NEWTABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("newTableName").build();
    private static final MarshallingInfo<String> RECOVERYPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryPointId").build();
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

    private static final RestoreTableFromRecoveryPointRequestMarshaller instance = new RestoreTableFromRecoveryPointRequestMarshaller();

    public static RestoreTableFromRecoveryPointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RestoreTableFromRecoveryPointRequest restoreTableFromRecoveryPointRequest, ProtocolMarshaller protocolMarshaller) {

        if (restoreTableFromRecoveryPointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getActivateCaseSensitiveIdentifier(), ACTIVATECASESENSITIVEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getNamespaceName(), NAMESPACENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getNewTableName(), NEWTABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getRecoveryPointId(), RECOVERYPOINTID_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getSourceDatabaseName(), SOURCEDATABASENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getSourceSchemaName(), SOURCESCHEMANAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getSourceTableName(), SOURCETABLENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getTargetDatabaseName(), TARGETDATABASENAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getTargetSchemaName(), TARGETSCHEMANAME_BINDING);
            protocolMarshaller.marshall(restoreTableFromRecoveryPointRequest.getWorkgroupName(), WORKGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
