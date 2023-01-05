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
 * AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller {

    private static final MarshallingInfo<Integer> ACCEPTEDROUTECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptedRouteCount").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> LASTSTATUSCHANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStatusChange").build();
    private static final MarshallingInfo<String> OUTSIDEIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutsideIpAddress").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();

    private static final AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller instance = new AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller();

    public static AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpnConnectionVgwTelemetryDetails awsEc2VpnConnectionVgwTelemetryDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpnConnectionVgwTelemetryDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getAcceptedRouteCount(), ACCEPTEDROUTECOUNT_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getLastStatusChange(), LASTSTATUSCHANGE_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getOutsideIpAddress(), OUTSIDEIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionVgwTelemetryDetails.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
