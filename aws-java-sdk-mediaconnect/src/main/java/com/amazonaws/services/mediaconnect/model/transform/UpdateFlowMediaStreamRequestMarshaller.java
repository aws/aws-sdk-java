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
 * UpdateFlowMediaStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFlowMediaStreamRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attributes").build();
    private static final MarshallingInfo<Integer> CLOCKRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clockRate").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> FLOWARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("flowArn").build();
    private static final MarshallingInfo<String> MEDIASTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("mediaStreamName").build();
    private static final MarshallingInfo<String> MEDIASTREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaStreamType").build();
    private static final MarshallingInfo<String> VIDEOFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoFormat").build();

    private static final UpdateFlowMediaStreamRequestMarshaller instance = new UpdateFlowMediaStreamRequestMarshaller();

    public static UpdateFlowMediaStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFlowMediaStreamRequest updateFlowMediaStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFlowMediaStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getClockRate(), CLOCKRATE_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getFlowArn(), FLOWARN_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getMediaStreamName(), MEDIASTREAMNAME_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getMediaStreamType(), MEDIASTREAMTYPE_BINDING);
            protocolMarshaller.marshall(updateFlowMediaStreamRequest.getVideoFormat(), VIDEOFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
