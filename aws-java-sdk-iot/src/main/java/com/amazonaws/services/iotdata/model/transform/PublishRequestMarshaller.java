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
package com.amazonaws.services.iotdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PublishRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PublishRequestMarshaller {

    private static final MarshallingInfo<String> TOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("topic").build();
    private static final MarshallingInfo<Integer> QOS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("qos").build();
    private static final MarshallingInfo<Boolean> RETAIN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("retain").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> PAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<String> USERPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.JSON_VALUE)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-mqtt5-user-properties").build();
    private static final MarshallingInfo<String> PAYLOADFORMATINDICATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-mqtt5-payload-format-indicator").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("contentType").build();
    private static final MarshallingInfo<String> RESPONSETOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("responseTopic").build();
    private static final MarshallingInfo<String> CORRELATIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-mqtt5-correlation-data").build();
    private static final MarshallingInfo<Long> MESSAGEEXPIRY_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("messageExpiry").build();

    private static final PublishRequestMarshaller instance = new PublishRequestMarshaller();

    public static PublishRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PublishRequest publishRequest, ProtocolMarshaller protocolMarshaller) {

        if (publishRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(publishRequest.getTopic(), TOPIC_BINDING);
            protocolMarshaller.marshall(publishRequest.getQos(), QOS_BINDING);
            protocolMarshaller.marshall(publishRequest.getRetain(), RETAIN_BINDING);
            protocolMarshaller.marshall(publishRequest.getPayload(), PAYLOAD_BINDING);
            protocolMarshaller.marshall(publishRequest.getUserProperties(), USERPROPERTIES_BINDING);
            protocolMarshaller.marshall(publishRequest.getPayloadFormatIndicator(), PAYLOADFORMATINDICATOR_BINDING);
            protocolMarshaller.marshall(publishRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(publishRequest.getResponseTopic(), RESPONSETOPIC_BINDING);
            protocolMarshaller.marshall(publishRequest.getCorrelationData(), CORRELATIONDATA_BINDING);
            protocolMarshaller.marshall(publishRequest.getMessageExpiry(), MESSAGEEXPIRY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
