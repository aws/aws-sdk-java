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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2ClientVpnEndpointDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2ClientVpnEndpointDetailsMarshaller {

    private static final MarshallingInfo<String> CLIENTVPNENDPOINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientVpnEndpointId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> CLIENTCIDRBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientCidrBlock").build();
    private static final MarshallingInfo<List> DNSSERVER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsServer").build();
    private static final MarshallingInfo<Boolean> SPLITTUNNEL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SplitTunnel").build();
    private static final MarshallingInfo<String> TRANSPORTPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransportProtocol").build();
    private static final MarshallingInfo<Integer> VPNPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpnPort").build();
    private static final MarshallingInfo<String> SERVERCERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerCertificateArn").build();
    private static final MarshallingInfo<List> AUTHENTICATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationOptions").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONLOGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionLogOptions").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIdSet").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> SELFSERVICEPORTALURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfServicePortalUrl").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTCONNECTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientConnectOptions").build();
    private static final MarshallingInfo<Integer> SESSIONTIMEOUTHOURS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionTimeoutHours").build();
    private static final MarshallingInfo<StructuredPojo> CLIENTLOGINBANNEROPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientLoginBannerOptions").build();

    private static final AwsEc2ClientVpnEndpointDetailsMarshaller instance = new AwsEc2ClientVpnEndpointDetailsMarshaller();

    public static AwsEc2ClientVpnEndpointDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2ClientVpnEndpointDetails awsEc2ClientVpnEndpointDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2ClientVpnEndpointDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getClientVpnEndpointId(), CLIENTVPNENDPOINTID_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getClientCidrBlock(), CLIENTCIDRBLOCK_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getDnsServer(), DNSSERVER_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getSplitTunnel(), SPLITTUNNEL_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getTransportProtocol(), TRANSPORTPROTOCOL_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getVpnPort(), VPNPORT_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getServerCertificateArn(), SERVERCERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getAuthenticationOptions(), AUTHENTICATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getConnectionLogOptions(), CONNECTIONLOGOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getSecurityGroupIdSet(), SECURITYGROUPIDSET_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getSelfServicePortalUrl(), SELFSERVICEPORTALURL_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getClientConnectOptions(), CLIENTCONNECTOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getSessionTimeoutHours(), SESSIONTIMEOUTHOURS_BINDING);
            protocolMarshaller.marshall(awsEc2ClientVpnEndpointDetails.getClientLoginBannerOptions(), CLIENTLOGINBANNEROPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
