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
package com.amazonaws.services.docdbelastic.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.docdbelastic.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateClusterRequestMarshaller {

    private static final MarshallingInfo<String> ADMINUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUserPassword").build();
    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authType").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredMaintenanceWindow").build();
    private static final MarshallingInfo<Integer> SHARDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shardCapacity").build();
    private static final MarshallingInfo<Integer> SHARDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shardCount").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcSecurityGroupIds").build();

    private static final UpdateClusterRequestMarshaller instance = new UpdateClusterRequestMarshaller();

    public static UpdateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateClusterRequest updateClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateClusterRequest.getAdminUserPassword(), ADMINUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getShardCapacity(), SHARDCAPACITY_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getShardCount(), SHARDCOUNT_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(updateClusterRequest.getVpcSecurityGroupIds(), VPCSECURITYGROUPIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
