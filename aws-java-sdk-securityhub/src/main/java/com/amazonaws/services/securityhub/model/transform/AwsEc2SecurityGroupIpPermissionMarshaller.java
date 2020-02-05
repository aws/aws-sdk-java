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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2SecurityGroupIpPermissionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2SecurityGroupIpPermissionMarshaller {

    private static final MarshallingInfo<String> IPPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IpProtocol").build();
    private static final MarshallingInfo<Integer> FROMPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FromPort").build();
    private static final MarshallingInfo<Integer> TOPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ToPort").build();
    private static final MarshallingInfo<List> USERIDGROUPPAIRS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserIdGroupPairs").build();
    private static final MarshallingInfo<List> IPRANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpRanges").build();
    private static final MarshallingInfo<List> IPV6RANGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ipv6Ranges").build();
    private static final MarshallingInfo<List> PREFIXLISTIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PrefixListIds").build();

    private static final AwsEc2SecurityGroupIpPermissionMarshaller instance = new AwsEc2SecurityGroupIpPermissionMarshaller();

    public static AwsEc2SecurityGroupIpPermissionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2SecurityGroupIpPermission awsEc2SecurityGroupIpPermission, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2SecurityGroupIpPermission == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getIpProtocol(), IPPROTOCOL_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getFromPort(), FROMPORT_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getToPort(), TOPORT_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getUserIdGroupPairs(), USERIDGROUPPAIRS_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getIpRanges(), IPRANGES_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getIpv6Ranges(), IPV6RANGES_BINDING);
            protocolMarshaller.marshall(awsEc2SecurityGroupIpPermission.getPrefixListIds(), PREFIXLISTIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
