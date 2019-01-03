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
 * ReplicationSubnetGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplicationSubnetGroupMarshaller {

    private static final MarshallingInfo<String> REPLICATIONSUBNETGROUPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationSubnetGroupIdentifier").build();
    private static final MarshallingInfo<String> REPLICATIONSUBNETGROUPDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplicationSubnetGroupDescription").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> SUBNETGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupStatus").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subnets").build();

    private static final ReplicationSubnetGroupMarshaller instance = new ReplicationSubnetGroupMarshaller();

    public static ReplicationSubnetGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplicationSubnetGroup replicationSubnetGroup, ProtocolMarshaller protocolMarshaller) {

        if (replicationSubnetGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replicationSubnetGroup.getReplicationSubnetGroupIdentifier(), REPLICATIONSUBNETGROUPIDENTIFIER_BINDING);
            protocolMarshaller.marshall(replicationSubnetGroup.getReplicationSubnetGroupDescription(), REPLICATIONSUBNETGROUPDESCRIPTION_BINDING);
            protocolMarshaller.marshall(replicationSubnetGroup.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(replicationSubnetGroup.getSubnetGroupStatus(), SUBNETGROUPSTATUS_BINDING);
            protocolMarshaller.marshall(replicationSubnetGroup.getSubnets(), SUBNETS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
