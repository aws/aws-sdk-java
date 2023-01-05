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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePrefetchScheduleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePrefetchScheduleRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONSUMPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Consumption").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> PLAYBACKCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("PlaybackConfigurationName").build();
    private static final MarshallingInfo<StructuredPojo> RETRIEVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Retrieval").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StreamId").build();

    private static final CreatePrefetchScheduleRequestMarshaller instance = new CreatePrefetchScheduleRequestMarshaller();

    public static CreatePrefetchScheduleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePrefetchScheduleRequest createPrefetchScheduleRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPrefetchScheduleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPrefetchScheduleRequest.getConsumption(), CONSUMPTION_BINDING);
            protocolMarshaller.marshall(createPrefetchScheduleRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createPrefetchScheduleRequest.getPlaybackConfigurationName(), PLAYBACKCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(createPrefetchScheduleRequest.getRetrieval(), RETRIEVAL_BINDING);
            protocolMarshaller.marshall(createPrefetchScheduleRequest.getStreamId(), STREAMID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
