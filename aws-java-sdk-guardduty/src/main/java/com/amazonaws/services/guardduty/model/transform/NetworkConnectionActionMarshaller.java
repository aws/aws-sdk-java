/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.guardduty.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkConnectionActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkConnectionActionMarshaller {

    private static final MarshallingInfo<Boolean> BLOCKED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("blocked").build();
    private static final MarshallingInfo<String> CONNECTIONDIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectionDirection").build();
    private static final MarshallingInfo<StructuredPojo> LOCALPORTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("localPortDetails").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEIPDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteIpDetails").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEPORTDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remotePortDetails").build();

    private static final NetworkConnectionActionMarshaller instance = new NetworkConnectionActionMarshaller();

    public static NetworkConnectionActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkConnectionAction networkConnectionAction, ProtocolMarshaller protocolMarshaller) {

        if (networkConnectionAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkConnectionAction.getBlocked(), BLOCKED_BINDING);
            protocolMarshaller.marshall(networkConnectionAction.getConnectionDirection(), CONNECTIONDIRECTION_BINDING);
            protocolMarshaller.marshall(networkConnectionAction.getLocalPortDetails(), LOCALPORTDETAILS_BINDING);
            protocolMarshaller.marshall(networkConnectionAction.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(networkConnectionAction.getRemoteIpDetails(), REMOTEIPDETAILS_BINDING);
            protocolMarshaller.marshall(networkConnectionAction.getRemotePortDetails(), REMOTEPORTDETAILS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
