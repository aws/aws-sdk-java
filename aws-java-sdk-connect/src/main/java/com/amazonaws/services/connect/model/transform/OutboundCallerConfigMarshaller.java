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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OutboundCallerConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutboundCallerConfigMarshaller {

    private static final MarshallingInfo<String> OUTBOUNDCALLERIDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCallerIdName").build();
    private static final MarshallingInfo<String> OUTBOUNDCALLERIDNUMBERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCallerIdNumberId").build();
    private static final MarshallingInfo<String> OUTBOUNDFLOWID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundFlowId").build();

    private static final OutboundCallerConfigMarshaller instance = new OutboundCallerConfigMarshaller();

    public static OutboundCallerConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutboundCallerConfig outboundCallerConfig, ProtocolMarshaller protocolMarshaller) {

        if (outboundCallerConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outboundCallerConfig.getOutboundCallerIdName(), OUTBOUNDCALLERIDNAME_BINDING);
            protocolMarshaller.marshall(outboundCallerConfig.getOutboundCallerIdNumberId(), OUTBOUNDCALLERIDNUMBERID_BINDING);
            protocolMarshaller.marshall(outboundCallerConfig.getOutboundFlowId(), OUTBOUNDFLOWID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
