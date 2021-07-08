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
package com.amazonaws.services.fms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceViolationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceViolationMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSVPCSECURITYGROUPVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsVPCSecurityGroupViolation").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2NETWORKINTERFACEVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2NetworkInterfaceViolation").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2INSTANCEVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2InstanceViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLMISSINGFIREWALLVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkFirewallMissingFirewallViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLMISSINGSUBNETVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkFirewallMissingSubnetViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLMISSINGEXPECTEDRTVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkFirewallMissingExpectedRTViolation")
            .build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLPOLICYMODIFIEDVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkFirewallPolicyModifiedViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLINTERNETTRAFFICNOTINSPECTEDVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallInternetTrafficNotInspectedViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLINVALIDROUTECONFIGURATIONVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallInvalidRouteConfigurationViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLBLACKHOLEROUTEDETECTEDVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallBlackHoleRouteDetectedViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLUNEXPECTEDFIREWALLROUTESVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallUnexpectedFirewallRoutesViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLUNEXPECTEDGATEWAYROUTESVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallUnexpectedGatewayRoutesViolation").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKFIREWALLMISSINGEXPECTEDROUTESVIOLATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NetworkFirewallMissingExpectedRoutesViolation").build();
    private static final MarshallingInfo<StructuredPojo> DNSRULEGROUPPRIORITYCONFLICTVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsRuleGroupPriorityConflictViolation").build();
    private static final MarshallingInfo<StructuredPojo> DNSDUPLICATERULEGROUPVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsDuplicateRuleGroupViolation").build();
    private static final MarshallingInfo<StructuredPojo> DNSRULEGROUPLIMITEXCEEDEDVIOLATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DnsRuleGroupLimitExceededViolation").build();
    private static final MarshallingInfo<StructuredPojo> POSSIBLEREMEDIATIONACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PossibleRemediationActions").build();

    private static final ResourceViolationMarshaller instance = new ResourceViolationMarshaller();

    public static ResourceViolationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceViolation resourceViolation, ProtocolMarshaller protocolMarshaller) {

        if (resourceViolation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceViolation.getAwsVPCSecurityGroupViolation(), AWSVPCSECURITYGROUPVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getAwsEc2NetworkInterfaceViolation(), AWSEC2NETWORKINTERFACEVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getAwsEc2InstanceViolation(), AWSEC2INSTANCEVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallMissingFirewallViolation(), NETWORKFIREWALLMISSINGFIREWALLVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallMissingSubnetViolation(), NETWORKFIREWALLMISSINGSUBNETVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallMissingExpectedRTViolation(), NETWORKFIREWALLMISSINGEXPECTEDRTVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallPolicyModifiedViolation(), NETWORKFIREWALLPOLICYMODIFIEDVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallInternetTrafficNotInspectedViolation(),
                    NETWORKFIREWALLINTERNETTRAFFICNOTINSPECTEDVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallInvalidRouteConfigurationViolation(),
                    NETWORKFIREWALLINVALIDROUTECONFIGURATIONVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallBlackHoleRouteDetectedViolation(),
                    NETWORKFIREWALLBLACKHOLEROUTEDETECTEDVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallUnexpectedFirewallRoutesViolation(),
                    NETWORKFIREWALLUNEXPECTEDFIREWALLROUTESVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallUnexpectedGatewayRoutesViolation(),
                    NETWORKFIREWALLUNEXPECTEDGATEWAYROUTESVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getNetworkFirewallMissingExpectedRoutesViolation(),
                    NETWORKFIREWALLMISSINGEXPECTEDROUTESVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getDnsRuleGroupPriorityConflictViolation(), DNSRULEGROUPPRIORITYCONFLICTVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getDnsDuplicateRuleGroupViolation(), DNSDUPLICATERULEGROUPVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getDnsRuleGroupLimitExceededViolation(), DNSRULEGROUPLIMITEXCEEDEDVIOLATION_BINDING);
            protocolMarshaller.marshall(resourceViolation.getPossibleRemediationActions(), POSSIBLEREMEDIATIONACTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
