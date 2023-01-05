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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2InstanceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2InstanceDetailsMarshaller {

    private static final MarshallingInfo<String> IAMINSTANCEPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iamInstanceProfileArn").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageId").build();
    private static final MarshallingInfo<List> IPV4ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipV4Addresses").build();
    private static final MarshallingInfo<List> IPV6ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipV6Addresses").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyName").build();
    private static final MarshallingInfo<java.util.Date> LAUNCHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnetId").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("vpcId").build();

    private static final AwsEc2InstanceDetailsMarshaller instance = new AwsEc2InstanceDetailsMarshaller();

    public static AwsEc2InstanceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2InstanceDetails awsEc2InstanceDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2InstanceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIamInstanceProfileArn(), IAMINSTANCEPROFILEARN_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIpV4Addresses(), IPV4ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getIpV6Addresses(), IPV6ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getLaunchedAt(), LAUNCHEDAT_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(awsEc2InstanceDetails.getVpcId(), VPCID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
