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
 * AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ASSOCIATECARRIERIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociateCarrierIpAddress").build();
    private static final MarshallingInfo<Boolean> ASSOCIATEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatePublicIpAddress").build();
    private static final MarshallingInfo<Boolean> DELETEONTERMINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteOnTermination").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Integer> DEVICEINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceIndex").build();
    private static final MarshallingInfo<List> GROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Groups").build();
    private static final MarshallingInfo<String> INTERFACETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InterfaceType").build();
    private static final MarshallingInfo<Integer> IPV4PREFIXCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv4PrefixCount").build();
    private static final MarshallingInfo<List> IPV4PREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ipv4Prefixes").build();
    private static final MarshallingInfo<Integer> IPV6ADDRESSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv6AddressCount").build();
    private static final MarshallingInfo<List> IPV6ADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ipv6Addresses").build();
    private static final MarshallingInfo<Integer> IPV6PREFIXCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ipv6PrefixCount").build();
    private static final MarshallingInfo<List> IPV6PREFIXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Ipv6Prefixes").build();
    private static final MarshallingInfo<Integer> NETWORKCARDINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkCardIndex").build();
    private static final MarshallingInfo<String> NETWORKINTERFACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceId").build();
    private static final MarshallingInfo<String> PRIVATEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateIpAddress").build();
    private static final MarshallingInfo<List> PRIVATEIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateIpAddresses").build();
    private static final MarshallingInfo<Integer> SECONDARYPRIVATEIPADDRESSCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecondaryPrivateIpAddressCount").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();

    private static final AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsMarshaller instance = new AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataNetworkInterfaceSetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails awsEc2LaunchTemplateDataNetworkInterfaceSetDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataNetworkInterfaceSetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getAssociateCarrierIpAddress(), ASSOCIATECARRIERIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getAssociatePublicIpAddress(), ASSOCIATEPUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getDeleteOnTermination(), DELETEONTERMINATION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getDeviceIndex(), DEVICEINDEX_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getGroups(), GROUPS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getInterfaceType(), INTERFACETYPE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv4PrefixCount(), IPV4PREFIXCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv4Prefixes(), IPV4PREFIXES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv6AddressCount(), IPV6ADDRESSCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv6Addresses(), IPV6ADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv6PrefixCount(), IPV6PREFIXCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getIpv6Prefixes(), IPV6PREFIXES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getNetworkCardIndex(), NETWORKCARDINDEX_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getNetworkInterfaceId(), NETWORKINTERFACEID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getPrivateIpAddress(), PRIVATEIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getPrivateIpAddresses(), PRIVATEIPADDRESSES_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getSecondaryPrivateIpAddressCount(),
                    SECONDARYPRIVATEIPADDRESSCOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataNetworkInterfaceSetDetails.getSubnetId(), SUBNETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
