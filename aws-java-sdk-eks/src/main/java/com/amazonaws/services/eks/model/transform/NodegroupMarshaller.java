/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NodegroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodegroupMarshaller {

    private static final MarshallingInfo<String> NODEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodegroupName").build();
    private static final MarshallingInfo<String> NODEGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodegroupArn").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> RELEASEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseVersion").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifiedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingConfig").build();
    private static final MarshallingInfo<List> INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTypes").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteAccess").build();
    private static final MarshallingInfo<String> AMITYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amiType").build();
    private static final MarshallingInfo<String> NODEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeRole").build();
    private static final MarshallingInfo<Map> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("labels").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resources").build();
    private static final MarshallingInfo<Integer> DISKSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskSize").build();
    private static final MarshallingInfo<StructuredPojo> HEALTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("health").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final NodegroupMarshaller instance = new NodegroupMarshaller();

    public static NodegroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Nodegroup nodegroup, ProtocolMarshaller protocolMarshaller) {

        if (nodegroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nodegroup.getNodegroupName(), NODEGROUPNAME_BINDING);
            protocolMarshaller.marshall(nodegroup.getNodegroupArn(), NODEGROUPARN_BINDING);
            protocolMarshaller.marshall(nodegroup.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(nodegroup.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(nodegroup.getReleaseVersion(), RELEASEVERSION_BINDING);
            protocolMarshaller.marshall(nodegroup.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(nodegroup.getModifiedAt(), MODIFIEDAT_BINDING);
            protocolMarshaller.marshall(nodegroup.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(nodegroup.getScalingConfig(), SCALINGCONFIG_BINDING);
            protocolMarshaller.marshall(nodegroup.getInstanceTypes(), INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(nodegroup.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(nodegroup.getRemoteAccess(), REMOTEACCESS_BINDING);
            protocolMarshaller.marshall(nodegroup.getAmiType(), AMITYPE_BINDING);
            protocolMarshaller.marshall(nodegroup.getNodeRole(), NODEROLE_BINDING);
            protocolMarshaller.marshall(nodegroup.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(nodegroup.getResources(), RESOURCES_BINDING);
            protocolMarshaller.marshall(nodegroup.getDiskSize(), DISKSIZE_BINDING);
            protocolMarshaller.marshall(nodegroup.getHealth(), HEALTH_BINDING);
            protocolMarshaller.marshall(nodegroup.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
