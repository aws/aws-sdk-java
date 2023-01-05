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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFuotaTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFuotaTaskRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> LORAWAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoRaWAN").build();
    private static final MarshallingInfo<String> FIRMWAREUPDATEIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirmwareUpdateImage").build();
    private static final MarshallingInfo<String> FIRMWAREUPDATEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FirmwareUpdateRole").build();

    private static final UpdateFuotaTaskRequestMarshaller instance = new UpdateFuotaTaskRequestMarshaller();

    public static UpdateFuotaTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFuotaTaskRequest updateFuotaTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFuotaTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFuotaTaskRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(updateFuotaTaskRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFuotaTaskRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFuotaTaskRequest.getLoRaWAN(), LORAWAN_BINDING);
            protocolMarshaller.marshall(updateFuotaTaskRequest.getFirmwareUpdateImage(), FIRMWAREUPDATEIMAGE_BINDING);
            protocolMarshaller.marshall(updateFuotaTaskRequest.getFirmwareUpdateRole(), FIRMWAREUPDATEROLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
