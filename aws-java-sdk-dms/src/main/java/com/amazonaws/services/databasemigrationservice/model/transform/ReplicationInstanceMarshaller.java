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
 * ReplicationInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationInstanceMarshaller {

    private static final MarshallingInfo<String> REPLICATIONINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCECLASS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceClass").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceStatus").build();
    private static final MarshallingInfo<Integer> ALLOCATEDSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedStorage").build();
    private static final MarshallingInfo<java.util.Date> INSTANCECREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCreateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<StructuredPojo> REPLICATIONSUBNETGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationSubnetGroup").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreferredMaintenanceWindow").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGMODIFIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PendingModifiedValues").build();
    private static final MarshallingInfo<Boolean> MULTIAZ_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MultiAZ").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<Boolean> AUTOMINORVERSIONUPGRADE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoMinorVersionUpgrade").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstanceArn").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstancePublicIpAddress").build();
    private static final MarshallingInfo<String> REPLICATIONINSTANCEPRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstancePrivateIpAddress").build();
    private static final MarshallingInfo<List> REPLICATIONINSTANCEPUBLICIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstancePublicIpAddresses").build();
    private static final MarshallingInfo<List> REPLICATIONINSTANCEPRIVATEIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationInstancePrivateIpAddresses").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<String> SECONDARYAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryAvailabilityZone").build();
    private static final MarshallingInfo<java.util.Date> FREEUNTIL_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FreeUntil").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DNSNAMESERVERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsNameServers").build();

    private static final ReplicationInstanceMarshaller instance = new ReplicationInstanceMarshaller();

    public static ReplicationInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationInstance replicationInstance, ProtocolMarshaller protocolMarshaller) {

        if (replicationInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationInstance.getReplicationInstanceIdentifier(), REPLICATIONINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstanceClass(), REPLICATIONINSTANCECLASS_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstanceStatus(), REPLICATIONINSTANCESTATUS_BINDING);
            protocolMarshaller.marshall(replicationInstance.getAllocatedStorage(), ALLOCATEDSTORAGE_BINDING);
            protocolMarshaller.marshall(replicationInstance.getInstanceCreateTime(), INSTANCECREATETIME_BINDING);
            protocolMarshaller.marshall(replicationInstance.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(replicationInstance.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationSubnetGroup(), REPLICATIONSUBNETGROUP_BINDING);
            protocolMarshaller.marshall(replicationInstance.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(replicationInstance.getPendingModifiedValues(), PENDINGMODIFIEDVALUES_BINDING);
            protocolMarshaller.marshall(replicationInstance.getMultiAZ(), MULTIAZ_BINDING);
            protocolMarshaller.marshall(replicationInstance.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(replicationInstance.getAutoMinorVersionUpgrade(), AUTOMINORVERSIONUPGRADE_BINDING);
            protocolMarshaller.marshall(replicationInstance.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstanceArn(), REPLICATIONINSTANCEARN_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstancePublicIpAddress(), REPLICATIONINSTANCEPUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstancePrivateIpAddress(), REPLICATIONINSTANCEPRIVATEIPADDRESS_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstancePublicIpAddresses(), REPLICATIONINSTANCEPUBLICIPADDRESSES_BINDING);
            protocolMarshaller.marshall(replicationInstance.getReplicationInstancePrivateIpAddresses(), REPLICATIONINSTANCEPRIVATEIPADDRESSES_BINDING);
            protocolMarshaller.marshall(replicationInstance.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(replicationInstance.getSecondaryAvailabilityZone(), SECONDARYAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(replicationInstance.getFreeUntil(), FREEUNTIL_BINDING);
            protocolMarshaller.marshall(replicationInstance.getDnsNameServers(), DNSNAMESERVERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
