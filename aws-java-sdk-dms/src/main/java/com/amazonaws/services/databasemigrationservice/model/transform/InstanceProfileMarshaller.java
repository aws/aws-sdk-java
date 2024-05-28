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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InstanceProfileMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InstanceProfileMarshaller {

    private static final MarshallingInfo<String> INSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileArn").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyArn").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PubliclyAccessible").build();
    private static final MarshallingInfo<String> NETWORKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkType").build();
    private static final MarshallingInfo<String> INSTANCEPROFILENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<java.util.Date> INSTANCEPROFILECREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceProfileCreationTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> SUBNETGROUPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupIdentifier").build();
    private static final MarshallingInfo<List> VPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSecurityGroups").build();

    private static final InstanceProfileMarshaller instance = new InstanceProfileMarshaller();

    public static InstanceProfileMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InstanceProfile instanceProfile, ProtocolMarshaller protocolMarshaller) {

        if (instanceProfile == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(instanceProfile.getInstanceProfileArn(), INSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(instanceProfile.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(instanceProfile.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(instanceProfile.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(instanceProfile.getNetworkType(), NETWORKTYPE_BINDING);
            protocolMarshaller.marshall(instanceProfile.getInstanceProfileName(), INSTANCEPROFILENAME_BINDING);
            protocolMarshaller.marshall(instanceProfile.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(instanceProfile.getInstanceProfileCreationTime(), INSTANCEPROFILECREATIONTIME_BINDING);
            protocolMarshaller.marshall(instanceProfile.getSubnetGroupIdentifier(), SUBNETGROUPIDENTIFIER_BINDING);
            protocolMarshaller.marshall(instanceProfile.getVpcSecurityGroups(), VPCSECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
