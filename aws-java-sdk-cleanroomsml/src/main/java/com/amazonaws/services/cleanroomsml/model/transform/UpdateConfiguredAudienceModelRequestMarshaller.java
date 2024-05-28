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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConfiguredAudienceModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConfiguredAudienceModelRequestMarshaller {

    private static final MarshallingInfo<String> AUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceModelArn").build();
    private static final MarshallingInfo<StructuredPojo> AUDIENCESIZECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceSizeConfig").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> MINMATCHINGSEEDSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minMatchingSeedSize").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputConfig").build();
    private static final MarshallingInfo<List> SHAREDAUDIENCEMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sharedAudienceMetrics").build();

    private static final UpdateConfiguredAudienceModelRequestMarshaller instance = new UpdateConfiguredAudienceModelRequestMarshaller();

    public static UpdateConfiguredAudienceModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConfiguredAudienceModelRequest updateConfiguredAudienceModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateConfiguredAudienceModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getAudienceModelArn(), AUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getAudienceSizeConfig(), AUDIENCESIZECONFIG_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getMinMatchingSeedSize(), MINMATCHINGSEEDSIZE_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(updateConfiguredAudienceModelRequest.getSharedAudienceMetrics(), SHAREDAUDIENCEMETRICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
