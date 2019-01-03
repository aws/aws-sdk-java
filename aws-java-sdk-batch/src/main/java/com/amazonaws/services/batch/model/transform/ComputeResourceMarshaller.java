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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputeResourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeResourceMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Integer> MINVCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minvCpus").build();
    private static final MarshallingInfo<Integer> MAXVCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxvCpus").build();
    private static final MarshallingInfo<Integer> DESIREDVCPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredvCpus").build();
    private static final MarshallingInfo<List> INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTypes").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageId").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("securityGroupIds").build();
    private static final MarshallingInfo<String> EC2KEYPAIR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2KeyPair").build();
    private static final MarshallingInfo<String> INSTANCEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceRole").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> PLACEMENTGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementGroup").build();
    private static final MarshallingInfo<Integer> BIDPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bidPercentage").build();
    private static final MarshallingInfo<String> SPOTIAMFLEETROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spotIamFleetRole").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchTemplate").build();

    private static final ComputeResourceMarshaller instance = new ComputeResourceMarshaller();

    public static ComputeResourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComputeResource computeResource, ProtocolMarshaller protocolMarshaller) {

        if (computeResource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computeResource.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(computeResource.getMinvCpus(), MINVCPUS_BINDING);
            protocolMarshaller.marshall(computeResource.getMaxvCpus(), MAXVCPUS_BINDING);
            protocolMarshaller.marshall(computeResource.getDesiredvCpus(), DESIREDVCPUS_BINDING);
            protocolMarshaller.marshall(computeResource.getInstanceTypes(), INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(computeResource.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(computeResource.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(computeResource.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(computeResource.getEc2KeyPair(), EC2KEYPAIR_BINDING);
            protocolMarshaller.marshall(computeResource.getInstanceRole(), INSTANCEROLE_BINDING);
            protocolMarshaller.marshall(computeResource.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(computeResource.getPlacementGroup(), PLACEMENTGROUP_BINDING);
            protocolMarshaller.marshall(computeResource.getBidPercentage(), BIDPERCENTAGE_BINDING);
            protocolMarshaller.marshall(computeResource.getSpotIamFleetRole(), SPOTIAMFLEETROLE_BINDING);
            protocolMarshaller.marshall(computeResource.getLaunchTemplate(), LAUNCHTEMPLATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
