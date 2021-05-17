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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FmtpMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FmtpMarshaller {

    private static final MarshallingInfo<String> CHANNELORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("channelOrder").build();
    private static final MarshallingInfo<String> COLORIMETRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("colorimetry").build();
    private static final MarshallingInfo<String> EXACTFRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exactFramerate").build();
    private static final MarshallingInfo<String> PAR_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("par").build();
    private static final MarshallingInfo<String> RANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("range").build();
    private static final MarshallingInfo<String> SCANMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanMode").build();
    private static final MarshallingInfo<String> TCS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tcs").build();

    private static final FmtpMarshaller instance = new FmtpMarshaller();

    public static FmtpMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Fmtp fmtp, ProtocolMarshaller protocolMarshaller) {

        if (fmtp == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fmtp.getChannelOrder(), CHANNELORDER_BINDING);
            protocolMarshaller.marshall(fmtp.getColorimetry(), COLORIMETRY_BINDING);
            protocolMarshaller.marshall(fmtp.getExactFramerate(), EXACTFRAMERATE_BINDING);
            protocolMarshaller.marshall(fmtp.getPar(), PAR_BINDING);
            protocolMarshaller.marshall(fmtp.getRange(), RANGE_BINDING);
            protocolMarshaller.marshall(fmtp.getScanMode(), SCANMODE_BINDING);
            protocolMarshaller.marshall(fmtp.getTcs(), TCS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
