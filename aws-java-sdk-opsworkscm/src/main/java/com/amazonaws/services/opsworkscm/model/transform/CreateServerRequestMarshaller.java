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
package com.amazonaws.services.opsworkscm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworkscm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateServerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateServerRequestMarshaller {

    private static final MarshallingInfo<Boolean> ASSOCIATEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatePublicIpAddress").build();
    private static final MarshallingInfo<Boolean> DISABLEAUTOMATEDBACKUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableAutomatedBackup").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> ENGINEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineModel").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<List> ENGINEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineAttributes").build();
    private static final MarshallingInfo<Integer> BACKUPRETENTIONCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BackupRetentionCount").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> INSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileArn").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> KEYPAIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyPair").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<String> PREFERREDBACKUPWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredBackupWindow").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceRoleArn").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<String> BACKUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BackupId").build();

    private static final CreateServerRequestMarshaller instance = new CreateServerRequestMarshaller();

    public static CreateServerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateServerRequest createServerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createServerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createServerRequest.getAssociatePublicIpAddress(), ASSOCIATEPUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(createServerRequest.getDisableAutomatedBackup(), DISABLEAUTOMATEDBACKUP_BINDING);
            protocolMarshaller.marshall(createServerRequest.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(createServerRequest.getEngineModel(), ENGINEMODEL_BINDING);
            protocolMarshaller.marshall(createServerRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(createServerRequest.getEngineAttributes(), ENGINEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createServerRequest.getBackupRetentionCount(), BACKUPRETENTIONCOUNT_BINDING);
            protocolMarshaller.marshall(createServerRequest.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(createServerRequest.getInstanceProfileArn(), INSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(createServerRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(createServerRequest.getKeyPair(), KEYPAIR_BINDING);
            protocolMarshaller.marshall(createServerRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(createServerRequest.getPreferredBackupWindow(), PREFERREDBACKUPWINDOW_BINDING);
            protocolMarshaller.marshall(createServerRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(createServerRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(createServerRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(createServerRequest.getBackupId(), BACKUPID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
