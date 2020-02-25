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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2SecurityGroupUserIdGroupPairMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2SecurityGroupUserIdGroupPairMarshaller {

    private static final MarshallingInfo<String> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupId").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<String> PEERINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PeeringStatus").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> VPCPEERINGCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcPeeringConnectionId").build();

    private static final AwsEc2SecurityGroupUserIdGroupPairMarshaller instance = new AwsEc2SecurityGroupUserIdGroupPairMarshaller();

    public static AwsEc2SecurityGroupUserIdGroupPairMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2SecurityGroupUserIdGroupPair awsEc2SecurityGroupUserIdGroupPair, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2SecurityGroupUserIdGroupPair == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getPeeringStatus(), PEERINGSTATUS_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupUserIdGroupPair.getVpcPeeringConnectionId(), VPCPEERINGCONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
