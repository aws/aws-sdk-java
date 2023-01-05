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
 * AwsEc2VpnConnectionOptionsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2VpnConnectionOptionsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> STATICROUTESONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StaticRoutesOnly").build();
    private static final MarshallingInfo<List> TUNNELOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TunnelOptions").build();

    private static final AwsEc2VpnConnectionOptionsDetailsMarshaller instance = new AwsEc2VpnConnectionOptionsDetailsMarshaller();

    public static AwsEc2VpnConnectionOptionsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2VpnConnectionOptionsDetails awsEc2VpnConnectionOptionsDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2VpnConnectionOptionsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsDetails.getStaticRoutesOnly(), STATICROUTESONLY_BINDING);
            protocolMarshaller.marshall(awsEc2VpnConnectionOptionsDetails.getTunnelOptions(), TUNNELOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
