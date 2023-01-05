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
 * AwsEc2VpnConnectionOptionsTunnelOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpnConnectionOptionsTunnelOptionsDetailsMarshaller {

    private static final MarshallingInfo<Integer> DPDTIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DpdTimeoutSeconds").build();
    private static final MarshallingInfo<List> IKEVERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IkeVersions").build();
    private static final MarshallingInfo<String> OUTSIDEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutsideIpAddress").build();
    private static final MarshallingInfo<List> PHASE1DHGROUPNUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase1DhGroupNumbers").build();
    private static final MarshallingInfo<List> PHASE1ENCRYPTIONALGORITHMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase1EncryptionAlgorithms").build();
    private static final MarshallingInfo<List> PHASE1INTEGRITYALGORITHMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase1IntegrityAlgorithms").build();
    private static final MarshallingInfo<Integer> PHASE1LIFETIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase1LifetimeSeconds").build();
    private static final MarshallingInfo<List> PHASE2DHGROUPNUMBERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase2DhGroupNumbers").build();
    private static final MarshallingInfo<List> PHASE2ENCRYPTIONALGORITHMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase2EncryptionAlgorithms").build();
    private static final MarshallingInfo<List> PHASE2INTEGRITYALGORITHMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase2IntegrityAlgorithms").build();
    private static final MarshallingInfo<Integer> PHASE2LIFETIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Phase2LifetimeSeconds").build();
    private static final MarshallingInfo<String> PRESHAREDKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreSharedKey").build();
    private static final MarshallingInfo<Integer> REKEYFUZZPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RekeyFuzzPercentage").build();
    private static final MarshallingInfo<Integer> REKEYMARGINTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RekeyMarginTimeSeconds").build();
    private static final MarshallingInfo<Integer> REPLAYWINDOWSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplayWindowSize").build();
    private static final MarshallingInfo<String> TUNNELINSIDECIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TunnelInsideCidr").build();

    private static final AwsEc2VpnConnectionOptionsTunnelOptionsDetailsMarshaller instance = new AwsEc2VpnConnectionOptionsTunnelOptionsDetailsMarshaller();

    public static AwsEc2VpnConnectionOptionsTunnelOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpnConnectionOptionsTunnelOptionsDetails awsEc2VpnConnectionOptionsTunnelOptionsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpnConnectionOptionsTunnelOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getDpdTimeoutSeconds(), DPDTIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getIkeVersions(), IKEVERSIONS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getOutsideIpAddress(), OUTSIDEIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase1DhGroupNumbers(), PHASE1DHGROUPNUMBERS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase1EncryptionAlgorithms(), PHASE1ENCRYPTIONALGORITHMS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase1IntegrityAlgorithms(), PHASE1INTEGRITYALGORITHMS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase1LifetimeSeconds(), PHASE1LIFETIMESECONDS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase2DhGroupNumbers(), PHASE2DHGROUPNUMBERS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase2EncryptionAlgorithms(), PHASE2ENCRYPTIONALGORITHMS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase2IntegrityAlgorithms(), PHASE2INTEGRITYALGORITHMS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPhase2LifetimeSeconds(), PHASE2LIFETIMESECONDS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getPreSharedKey(), PRESHAREDKEY_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getRekeyFuzzPercentage(), REKEYFUZZPERCENTAGE_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getRekeyMarginTimeSeconds(), REKEYMARGINTIMESECONDS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getReplayWindowSize(), REPLAYWINDOWSIZE_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsTunnelOptionsDetails.getTunnelInsideCidr(), TUNNELINSIDECIDR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
