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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateWirelessGatewayTaskCreateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateWirelessGatewayTaskCreateMarshaller {

    private static final MarshallingInfo<String> UPDATEDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateDataSource").build();
    private static final MarshallingInfo<String> UPDATEDATAROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateDataRole").build();
    private static final MarshallingInfo<StructuredPojo> LORAWAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoRaWAN").build();

    private static final UpdateWirelessGatewayTaskCreateMarshaller instance = new UpdateWirelessGatewayTaskCreateMarshaller();

    public static UpdateWirelessGatewayTaskCreateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateWirelessGatewayTaskCreate updateWirelessGatewayTaskCreate, ProtocolMarshaller protocolMarshaller) {

        if (updateWirelessGatewayTaskCreate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateWirelessGatewayTaskCreate.getUpdateDataSource(), UPDATEDATASOURCE_BINDING);
            protocolMarshaller.marshall(updateWirelessGatewayTaskCreate.getUpdateDataRole(), UPDATEDATAROLE_BINDING);
            protocolMarshaller.marshall(updateWirelessGatewayTaskCreate.getLoRaWAN(), LORAWAN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
