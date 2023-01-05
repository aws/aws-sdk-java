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
 * AwsEc2VpcPeeringConnectionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpcPeeringConnectionDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCEPTERVPCINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccepterVpcInfo").build();
    private static final MarshallingInfo<String> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpirationTime").build();
    private static final MarshallingInfo<StructuredPojo> REQUESTERVPCINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequesterVpcInfo").build();
    private static final MarshallingInfo<StructuredPojo> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Status").build();
    private static final MarshallingInfo<String> VPCPEERINGCONNECTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcPeeringConnectionId").build();

    private static final AwsEc2VpcPeeringConnectionDetailsMarshaller instance = new AwsEc2VpcPeeringConnectionDetailsMarshaller();

    public static AwsEc2VpcPeeringConnectionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpcPeeringConnectionDetails awsEc2VpcPeeringConnectionDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpcPeeringConnectionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpcPeeringConnectionDetails.getAccepterVpcInfo(), ACCEPTERVPCINFO_BINDING);
            protocolMarshaller.marshall(awsEc2VpcPeeringConnectionDetails.getExpirationTime(), EXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(awsEc2VpcPeeringConnectionDetails.getRequesterVpcInfo(), REQUESTERVPCINFO_BINDING);
            protocolMarshaller.marshall(awsEc2VpcPeeringConnectionDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsEc2VpcPeeringConnectionDetails.getVpcPeeringConnectionId(), VPCPEERINGCONNECTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
