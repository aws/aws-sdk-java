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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PhoneNumberCapabilitiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PhoneNumberCapabilitiesMarshaller {

    private static final MarshallingInfo<Boolean> INBOUNDCALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundCall").build();
    private static final MarshallingInfo<Boolean> OUTBOUNDCALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundCall").build();
    private static final MarshallingInfo<Boolean> INBOUNDSMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundSMS").build();
    private static final MarshallingInfo<Boolean> OUTBOUNDSMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundSMS").build();
    private static final MarshallingInfo<Boolean> INBOUNDMMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InboundMMS").build();
    private static final MarshallingInfo<Boolean> OUTBOUNDMMS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutboundMMS").build();

    private static final PhoneNumberCapabilitiesMarshaller instance = new PhoneNumberCapabilitiesMarshaller();

    public static PhoneNumberCapabilitiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PhoneNumberCapabilities phoneNumberCapabilities, ProtocolMarshaller protocolMarshaller) {

        if (phoneNumberCapabilities == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(phoneNumberCapabilities.getInboundCall(), INBOUNDCALL_BINDING);
            protocolMarshaller.marshall(phoneNumberCapabilities.getOutboundCall(), OUTBOUNDCALL_BINDING);
            protocolMarshaller.marshall(phoneNumberCapabilities.getInboundSMS(), INBOUNDSMS_BINDING);
            protocolMarshaller.marshall(phoneNumberCapabilities.getOutboundSMS(), OUTBOUNDSMS_BINDING);
            protocolMarshaller.marshall(phoneNumberCapabilities.getInboundMMS(), INBOUNDMMS_BINDING);
            protocolMarshaller.marshall(phoneNumberCapabilities.getOutboundMMS(), OUTBOUNDMMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
