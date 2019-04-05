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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModifyReplicationInstanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModifyReplicationInstanceRequestMarshaller {

    private static final MarshallingInfo<String> REPLICATIONINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceArn").build();
    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<Boolean> APPLYIMMEDIATELY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplyImmediately").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceClass").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroupIds").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<Boolean> MULTIAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MultiAZ").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Boolean> ALLOWMAJORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowMajorVersionUpgrade").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceIdentifier").build();

    private static final ModifyReplicationInstanceRequestMarshaller instance = new ModifyReplicationInstanceRequestMarshaller();

    public static ModifyReplicationInstanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModifyReplicationInstanceRequest modifyReplicationInstanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (modifyReplicationInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getReplicationInstanceArn(), REPLICATIONINSTANCEARN_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getApplyImmediately(), APPLYIMMEDIATELY_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getReplicationInstanceClass(), REPLICATIONINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getVpcSecurityGroupIds(), VPCSECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getMultiAZ(), MULTIAZ_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getAllowMajorVersionUpgrade(), ALLOWMAJORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(modifyReplicationInstanceRequest.getReplicationInstanceIdentifier(), REPLICATIONINSTANCEIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
