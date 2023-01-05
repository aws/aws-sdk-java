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
package com.amazonaws.services.iot.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MqttHeadersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MqttHeadersMarshaller {

    private static final MarshallingInfo<String> PAYLOADFORMATINDICATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("payloadFormatIndicator").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contentType").build();
    private static final MarshallingInfo<String> RESPONSETOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("responseTopic").build();
    private static final MarshallingInfo<String> CORRELATIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("correlationData").build();
    private static final MarshallingInfo<String> MESSAGEEXPIRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("messageExpiry").build();
    private static final MarshallingInfo<List> USERPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userProperties").build();

    private static final MqttHeadersMarshaller instance = new MqttHeadersMarshaller();

    public static MqttHeadersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MqttHeaders mqttHeaders, ProtocolMarshaller protocolMarshaller) {

        if (mqttHeaders == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mqttHeaders.getPayloadFormatIndicator(), PAYLOADFORMATINDICATOR_BINDING);
            protocolMarshaller.marshall(mqttHeaders.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(mqttHeaders.getResponseTopic(), RESPONSETOPIC_BINDING);
            protocolMarshaller.marshall(mqttHeaders.getCorrelationData(), CORRELATIONDATA_BINDING);
            protocolMarshaller.marshall(mqttHeaders.getMessageExpiry(), MESSAGEEXPIRY_BINDING);
            protocolMarshaller.marshall(mqttHeaders.getUserProperties(), USERPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
