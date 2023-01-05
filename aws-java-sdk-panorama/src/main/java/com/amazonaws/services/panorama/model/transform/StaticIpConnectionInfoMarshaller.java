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
package com.amazonaws.services.panorama.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StaticIpConnectionInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StaticIpConnectionInfoMarshaller {

    private static final MarshallingInfo<String> DEFAULTGATEWAY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultGateway").build();
    private static final MarshallingInfo<List> DNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dns").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<String> MASK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mask").build();

    private static final StaticIpConnectionInfoMarshaller instance = new StaticIpConnectionInfoMarshaller();

    public static StaticIpConnectionInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StaticIpConnectionInfo staticIpConnectionInfo, ProtocolMarshaller protocolMarshaller) {

        if (staticIpConnectionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(staticIpConnectionInfo.getDefaultGateway(), DEFAULTGATEWAY_BINDING);
            protocolMarshaller.marshall(staticIpConnectionInfo.getDns(), DNS_BINDING);
            protocolMarshaller.marshall(staticIpConnectionInfo.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(staticIpConnectionInfo.getMask(), MASK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
