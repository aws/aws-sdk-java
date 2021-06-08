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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLogLevelsByResourceTypesRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLogLevelsByResourceTypesRequestMarshaller {

    private static final MarshallingInfo<String> DEFAULTLOGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultLogLevel").build();
    private static final MarshallingInfo<List> WIRELESSDEVICELOGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessDeviceLogOptions").build();
    private static final MarshallingInfo<List> WIRELESSGATEWAYLOGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WirelessGatewayLogOptions").build();

    private static final UpdateLogLevelsByResourceTypesRequestMarshaller instance = new UpdateLogLevelsByResourceTypesRequestMarshaller();

    public static UpdateLogLevelsByResourceTypesRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLogLevelsByResourceTypesRequest updateLogLevelsByResourceTypesRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLogLevelsByResourceTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLogLevelsByResourceTypesRequest.getDefaultLogLevel(), DEFAULTLOGLEVEL_BINDING);
            protocolMarshaller.marshall(updateLogLevelsByResourceTypesRequest.getWirelessDeviceLogOptions(), WIRELESSDEVICELOGOPTIONS_BINDING);
            protocolMarshaller.marshall(updateLogLevelsByResourceTypesRequest.getWirelessGatewayLogOptions(), WIRELESSGATEWAYLOGOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
