/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateReplicationConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateReplicationConfigurationRequestMarshaller {

    private static final MarshallingInfo<Boolean> ASSOCIATEDEFAULTSECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associateDefaultSecurityGroup").build();
    private static final MarshallingInfo<Long> BANDWIDTHTHROTTLING_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bandwidthThrottling").build();
    private static final MarshallingInfo<Boolean> CREATEPUBLICIP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createPublicIP").build();
    private static final MarshallingInfo<String> DATAPLANEROUTING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataPlaneRouting").build();
    private static final MarshallingInfo<String> DEFAULTLARGESTAGINGDISKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultLargeStagingDiskType").build();
    private static final MarshallingInfo<String> EBSENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebsEncryption").build();
    private static final MarshallingInfo<String> EBSENCRYPTIONKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ebsEncryptionKeyArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<List> REPLICATEDDISKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicatedDisks").build();
    private static final MarshallingInfo<String> REPLICATIONSERVERINSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationServerInstanceType").build();
    private static final MarshallingInfo<List> REPLICATIONSERVERSSECURITYGROUPSIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationServersSecurityGroupsIDs").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<String> STAGINGAREASUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stagingAreaSubnetId").build();
    private static final MarshallingInfo<Map> STAGINGAREATAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stagingAreaTags").build();
    private static final MarshallingInfo<Boolean> USEDEDICATEDREPLICATIONSERVER_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useDedicatedReplicationServer").build();

    private static final UpdateReplicationConfigurationRequestMarshaller instance = new UpdateReplicationConfigurationRequestMarshaller();

    public static UpdateReplicationConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateReplicationConfigurationRequest updateReplicationConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateReplicationConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getAssociateDefaultSecurityGroup(), ASSOCIATEDEFAULTSECURITYGROUP_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getBandwidthThrottling(), BANDWIDTHTHROTTLING_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getCreatePublicIP(), CREATEPUBLICIP_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getDataPlaneRouting(), DATAPLANEROUTING_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getDefaultLargeStagingDiskType(), DEFAULTLARGESTAGINGDISKTYPE_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getEbsEncryption(), EBSENCRYPTION_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getEbsEncryptionKeyArn(), EBSENCRYPTIONKEYARN_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getReplicatedDisks(), REPLICATEDDISKS_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getReplicationServerInstanceType(), REPLICATIONSERVERINSTANCETYPE_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getReplicationServersSecurityGroupsIDs(),
                    REPLICATIONSERVERSSECURITYGROUPSIDS_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getStagingAreaSubnetId(), STAGINGAREASUBNETID_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getStagingAreaTags(), STAGINGAREATAGS_BINDING);
            protocolMarshaller.marshall(updateReplicationConfigurationRequest.getUseDedicatedReplicationServer(), USEDEDICATEDREPLICATIONSERVER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
