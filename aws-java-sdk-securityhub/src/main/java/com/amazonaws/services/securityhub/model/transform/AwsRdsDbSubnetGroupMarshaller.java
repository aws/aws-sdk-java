/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsRdsDbSubnetGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRdsDbSubnetGroupMarshaller {

    private static final MarshallingInfo<String> DBSUBNETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroupName").build();
    private static final MarshallingInfo<String> DBSUBNETGROUPDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroupDescription").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> SUBNETGROUPSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubnetGroupStatus").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Subnets").build();
    private static final MarshallingInfo<String> DBSUBNETGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbSubnetGroupArn").build();

    private static final AwsRdsDbSubnetGroupMarshaller instance = new AwsRdsDbSubnetGroupMarshaller();

    public static AwsRdsDbSubnetGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRdsDbSubnetGroup awsRdsDbSubnetGroup, ProtocolMarshaller protocolMarshaller) {

        if (awsRdsDbSubnetGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getDbSubnetGroupName(), DBSUBNETGROUPNAME_BINDING);
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getDbSubnetGroupDescription(), DBSUBNETGROUPDESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getSubnetGroupStatus(), SUBNETGROUPSTATUS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(awsRdsDbSubnetGroup.getDbSubnetGroupArn(), DBSUBNETGROUPARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
