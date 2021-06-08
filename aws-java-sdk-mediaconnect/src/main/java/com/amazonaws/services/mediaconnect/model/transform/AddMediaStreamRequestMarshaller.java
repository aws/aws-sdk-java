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
 * AddMediaStreamRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddMediaStreamRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("attributes").build();
    private static final MarshallingInfo<Integer> CLOCKRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clockRate").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> MEDIASTREAMID_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaStreamId").build();
    private static final MarshallingInfo<String> MEDIASTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaStreamName").build();
    private static final MarshallingInfo<String> MEDIASTREAMTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaStreamType").build();
    private static final MarshallingInfo<String> VIDEOFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("videoFormat").build();

    private static final AddMediaStreamRequestMarshaller instance = new AddMediaStreamRequestMarshaller();

    public static AddMediaStreamRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddMediaStreamRequest addMediaStreamRequest, ProtocolMarshaller protocolMarshaller) {

        if (addMediaStreamRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addMediaStreamRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getClockRate(), CLOCKRATE_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getMediaStreamId(), MEDIASTREAMID_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getMediaStreamName(), MEDIASTREAMNAME_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getMediaStreamType(), MEDIASTREAMTYPE_BINDING);
            protocolMarshaller.marshall(addMediaStreamRequest.getVideoFormat(), VIDEOFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
