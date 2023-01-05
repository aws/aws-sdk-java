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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller {

    private static final MarshallingInfo<String> EC2SECURITYGROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SecurityGroupId").build();
    private static final MarshallingInfo<String> EC2SECURITYGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SecurityGroupName").build();
    private static final MarshallingInfo<String> EC2SECURITYGROUPOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ec2SecurityGroupOwnerId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();

    private static final AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller instance = new AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller();

    public static AwsRdsDbSecurityGroupEc2SecurityGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbSecurityGroupEc2SecurityGroup awsRdsDbSecurityGroupEc2SecurityGroup, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbSecurityGroupEc2SecurityGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbSecurityGroupEc2SecurityGroup.getEc2SecurityGroupId(), EC2SECURITYGROUPID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupEc2SecurityGroup.getEc2SecurityGroupName(), EC2SECURITYGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupEc2SecurityGroup.getEc2SecurityGroupOwnerId(), EC2SECURITYGROUPOWNERID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSecurityGroupEc2SecurityGroup.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
