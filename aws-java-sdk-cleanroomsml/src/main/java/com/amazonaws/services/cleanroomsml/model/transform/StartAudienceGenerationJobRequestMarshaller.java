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
 * StartAudienceGenerationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartAudienceGenerationJobRequestMarshaller {

    private static final MarshallingInfo<String> COLLABORATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("collaborationId").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> INCLUDESEEDINOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeSeedInOutput").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> SEEDAUDIENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("seedAudience").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final StartAudienceGenerationJobRequestMarshaller instance = new StartAudienceGenerationJobRequestMarshaller();

    public static StartAudienceGenerationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartAudienceGenerationJobRequest startAudienceGenerationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startAudienceGenerationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getCollaborationId(), COLLABORATIONID_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getIncludeSeedInOutput(), INCLUDESEEDINOUTPUT_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getSeedAudience(), SEEDAUDIENCE_BINDING);
            protocolMarshaller.marshall(startAudienceGenerationJobRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
