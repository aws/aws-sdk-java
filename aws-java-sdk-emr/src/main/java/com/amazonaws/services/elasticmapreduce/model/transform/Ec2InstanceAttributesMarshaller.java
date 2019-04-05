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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Ec2InstanceAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Ec2InstanceAttributesMarshaller {

    private static final MarshallingInfo<String> EC2KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2KeyName").build();
    private static final MarshallingInfo<String> EC2SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SubnetId").build();
    private static final MarshallingInfo<List> REQUESTEDEC2SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedEc2SubnetIds").build();
    private static final MarshallingInfo<String> EC2AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2AvailabilityZone").build();
    private static final MarshallingInfo<List> REQUESTEDEC2AVAILABILITYZONES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedEc2AvailabilityZones").build();
    private static final MarshallingInfo<String> IAMINSTANCEPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamInstanceProfile").build();
    private static final MarshallingInfo<String> EMRMANAGEDMASTERSECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmrManagedMasterSecurityGroup").build();
    private static final MarshallingInfo<String> EMRMANAGEDSLAVESECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmrManagedSlaveSecurityGroup").build();
    private static final MarshallingInfo<String> SERVICEACCESSSECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessSecurityGroup").build();
    private static final MarshallingInfo<List> ADDITIONALMASTERSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalMasterSecurityGroups").build();
    private static final MarshallingInfo<List> ADDITIONALSLAVESECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalSlaveSecurityGroups").build();

    private static final Ec2InstanceAttributesMarshaller instance = new Ec2InstanceAttributesMarshaller();

    public static Ec2InstanceAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ec2InstanceAttributes ec2InstanceAttributes, ProtocolMarshaller protocolMarshaller) {

        if (ec2InstanceAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ec2InstanceAttributes.getEc2KeyName(), EC2KEYNAME_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getEc2SubnetId(), EC2SUBNETID_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getRequestedEc2SubnetIds(), REQUESTEDEC2SUBNETIDS_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getEc2AvailabilityZone(), EC2AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getRequestedEc2AvailabilityZones(), REQUESTEDEC2AVAILABILITYZONES_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getIamInstanceProfile(), IAMINSTANCEPROFILE_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getEmrManagedMasterSecurityGroup(), EMRMANAGEDMASTERSECURITYGROUP_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getEmrManagedSlaveSecurityGroup(), EMRMANAGEDSLAVESECURITYGROUP_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getServiceAccessSecurityGroup(), SERVICEACCESSSECURITYGROUP_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getAdditionalMasterSecurityGroups(), ADDITIONALMASTERSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(ec2InstanceAttributes.getAdditionalSlaveSecurityGroups(), ADDITIONALSLAVESECURITYGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
