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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanroomsml.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfiguredAudienceModelSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfiguredAudienceModelSummaryMarshaller {

    private static final MarshallingInfo<String> AUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audienceModelArn").build();
    private static final MarshallingInfo<String> CONFIGUREDAUDIENCEMODELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredAudienceModelArn").build();
    private static final MarshallingInfo<java.util.Date> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputConfig").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> UPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateTime").timestampFormat("iso8601").build();

    private static final ConfiguredAudienceModelSummaryMarshaller instance = new ConfiguredAudienceModelSummaryMarshaller();

    public static ConfiguredAudienceModelSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfiguredAudienceModelSummary configuredAudienceModelSummary, ProtocolMarshaller protocolMarshaller) {

        if (configuredAudienceModelSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configuredAudienceModelSummary.getAudienceModelArn(), AUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getConfiguredAudienceModelArn(), CONFIGUREDAUDIENCEMODELARN_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getOutputConfig(), OUTPUTCONFIG_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(configuredAudienceModelSummary.getUpdateTime(), UPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
