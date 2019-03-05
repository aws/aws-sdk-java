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
package com.amazonaws.services.storagegateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActivateGatewayRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActivateGatewayRequestMarshaller {

    private static final MarshallingInfo<String> ACTIVATIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActivationKey").build();
    private static final MarshallingInfo<String> GATEWAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayName").build();
    private static final MarshallingInfo<String> GATEWAYTIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayTimezone").build();
    private static final MarshallingInfo<String> GATEWAYREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayRegion").build();
    private static final MarshallingInfo<String> GATEWAYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GatewayType").build();
    private static final MarshallingInfo<String> TAPEDRIVETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeDriveType").build();
    private static final MarshallingInfo<String> MEDIUMCHANGERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediumChangerType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ActivateGatewayRequestMarshaller instance = new ActivateGatewayRequestMarshaller();

    public static ActivateGatewayRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActivateGatewayRequest activateGatewayRequest, ProtocolMarshaller protocolMarshaller) {

        if (activateGatewayRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(activateGatewayRequest.getActivationKey(), ACTIVATIONKEY_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getGatewayName(), GATEWAYNAME_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getGatewayTimezone(), GATEWAYTIMEZONE_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getGatewayRegion(), GATEWAYREGION_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getGatewayType(), GATEWAYTYPE_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getTapeDriveType(), TAPEDRIVETYPE_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getMediumChangerType(), MEDIUMCHANGERTYPE_BINDING);
            protocolMarshaller.marshall(activateGatewayRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
