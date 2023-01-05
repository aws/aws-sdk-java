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
package com.amazonaws.services.transfer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProtocolDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProtocolDetailsMarshaller {

    private static final MarshallingInfo<String> PASSIVEIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PassiveIp").build();
    private static final MarshallingInfo<String> TLSSESSIONRESUMPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TlsSessionResumptionMode").build();
    private static final MarshallingInfo<String> SETSTATOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SetStatOption").build();
    private static final MarshallingInfo<List> AS2TRANSPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("As2Transports").build();

    private static final ProtocolDetailsMarshaller instance = new ProtocolDetailsMarshaller();

    public static ProtocolDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProtocolDetails protocolDetails, ProtocolMarshaller protocolMarshaller) {

        if (protocolDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(protocolDetails.getPassiveIp(), PASSIVEIP_BINDING);
            protocolMarshaller.marshall(protocolDetails.getTlsSessionResumptionMode(), TLSSESSIONRESUMPTIONMODE_BINDING);
            protocolMarshaller.marshall(protocolDetails.getSetStatOption(), SETSTATOPTION_BINDING);
            protocolMarshaller.marshall(protocolDetails.getAs2Transports(), AS2TRANSPORTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
