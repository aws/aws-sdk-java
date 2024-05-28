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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateConfiguredAudienceModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateConfiguredAudienceModelRequestMarshaller {

    private static final MarshallingInfo<String> AUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceModelArn").build();
    private static final MarshallingInfo<StructuredPojo> AUDIENCESIZECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceSizeConfig").build();
    private static final MarshallingInfo<String> CHILDRESOURCETAGONCREATEPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("childResourceTagOnCreatePolicy").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> MINMATCHINGSEEDSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minMatchingSeedSize").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputConfig").build();
    private static final MarshallingInfo<List> SHAREDAUDIENCEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharedAudienceMetrics").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateConfiguredAudienceModelRequestMarshaller instance = new CreateConfiguredAudienceModelRequestMarshaller();

    public static CreateConfiguredAudienceModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateConfiguredAudienceModelRequest createConfiguredAudienceModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createConfiguredAudienceModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getAudienceModelArn(), AUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getAudienceSizeConfig(), AUDIENCESIZECONFIG_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getChildResourceTagOnCreatePolicy(), CHILDRESOURCETAGONCREATEPOLICY_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getMinMatchingSeedSize(), MINMATCHINGSEEDSIZE_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getSharedAudienceMetrics(), SHAREDAUDIENCEMETRICS_BINDING);
            protocolMarshaller.marshall(createConfiguredAudienceModelRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
