/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanroomsml.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAudienceModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAudienceModelRequestMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<java.util.Date> TRAININGDATAENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataEndTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> TRAININGDATASTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TRAININGDATASETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDatasetArn").build();

    private static final CreateAudienceModelRequestMarshaller instance = new CreateAudienceModelRequestMarshaller();

    public static CreateAudienceModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAudienceModelRequest createAudienceModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAudienceModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAudienceModelRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getTrainingDataEndTime(), TRAININGDATAENDTIME_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getTrainingDataStartTime(), TRAININGDATASTARTTIME_BINDING);
            protocolMarshaller.marshall(createAudienceModelRequest.getTrainingDatasetArn(), TRAININGDATASETARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
