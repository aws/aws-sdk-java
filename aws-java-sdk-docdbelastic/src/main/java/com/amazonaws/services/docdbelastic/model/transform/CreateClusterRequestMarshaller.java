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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.docdbelastic.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateClusterRequestMarshaller {

    private static final MarshallingInfo<String> ADMINUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUserName").build();
    private static final MarshallingInfo<String> ADMINUSERPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminUserPassword").build();
    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authType").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredMaintenanceWindow").build();
    private static final MarshallingInfo<Integer> SHARDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shardCapacity").build();
    private static final MarshallingInfo<Integer> SHARDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("shardCount").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetIds").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcSecurityGroupIds").build();

    private static final CreateClusterRequestMarshaller instance = new CreateClusterRequestMarshaller();

    public static CreateClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateClusterRequest createClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (createClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createClusterRequest.getAdminUserName(), ADMINUSERNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getAdminUserPassword(), ADMINUSERPASSWORD_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getShardCapacity(), SHARDCAPACITY_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getShardCount(), SHARDCOUNT_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createClusterRequest.getVpcSecurityGroupIds(), VPCSECURITYGROUPIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
