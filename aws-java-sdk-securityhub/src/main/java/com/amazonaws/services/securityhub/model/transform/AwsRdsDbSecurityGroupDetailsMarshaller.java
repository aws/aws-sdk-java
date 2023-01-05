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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRdsDbSecurityGroupDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbSecurityGroupDetailsMarshaller {

    private static final MarshallingInfo<String> DBSECURITYGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSecurityGroupArn").build();
    private static final MarshallingInfo<String> DBSECURITYGROUPDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSecurityGroupDescription").build();
    private static final MarshallingInfo<String> DBSECURITYGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSecurityGroupName").build();
    private static final MarshallingInfo<List> EC2SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SecurityGroups").build();
    private static final MarshallingInfo<List> IPRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpRanges").build();
    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();

    private static final AwsRdsDbSecurityGroupDetailsMarshaller instance = new AwsRdsDbSecurityGroupDetailsMarshaller();

    public static AwsRdsDbSecurityGroupDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbSecurityGroupDetails awsRdsDbSecurityGroupDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbSecurityGroupDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getDbSecurityGroupArn(), DBSECURITYGROUPARN_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getDbSecurityGroupDescription(), DBSECURITYGROUPDESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getDbSecurityGroupName(), DBSECURITYGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getEc2SecurityGroups(), EC2SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getIpRanges(), IPRANGES_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupDetails.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
