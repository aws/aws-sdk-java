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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TransferInputDeviceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TransferInputDeviceRequestMarshaller {

    private static final MarshallingInfo<String> INPUTDEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("inputDeviceId").build();
    private static final MarshallingInfo<String> TARGETCUSTOMERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetCustomerId").build();
    private static final MarshallingInfo<String> TARGETREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetRegion").build();
    private static final MarshallingInfo<String> TRANSFERMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transferMessage").build();

    private static final TransferInputDeviceRequestMarshaller instance = new TransferInputDeviceRequestMarshaller();

    public static TransferInputDeviceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TransferInputDeviceRequest transferInputDeviceRequest, ProtocolMarshaller protocolMarshaller) {

        if (transferInputDeviceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(transferInputDeviceRequest.getInputDeviceId(), INPUTDEVICEID_BINDING);
            protocolMarshaller.marshall(transferInputDeviceRequest.getTargetCustomerId(), TARGETCUSTOMERID_BINDING);
            protocolMarshaller.marshall(transferInputDeviceRequest.getTargetRegion(), TARGETREGION_BINDING);
            protocolMarshaller.marshall(transferInputDeviceRequest.getTransferMessage(), TRANSFERMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
