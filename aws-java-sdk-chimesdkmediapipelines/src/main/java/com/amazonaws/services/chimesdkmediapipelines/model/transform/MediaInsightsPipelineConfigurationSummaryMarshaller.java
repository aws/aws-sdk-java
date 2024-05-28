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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaInsightsPipelineConfigurationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaInsightsPipelineConfigurationSummaryMarshaller {

    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationName").build();
    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationId").build();
    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationArn").build();

    private static final MediaInsightsPipelineConfigurationSummaryMarshaller instance = new MediaInsightsPipelineConfigurationSummaryMarshaller();

    public static MediaInsightsPipelineConfigurationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaInsightsPipelineConfigurationSummary mediaInsightsPipelineConfigurationSummary, ProtocolMarshaller protocolMarshaller) {

        if (mediaInsightsPipelineConfigurationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationSummary.getMediaInsightsPipelineConfigurationName(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationSummary.getMediaInsightsPipelineConfigurationId(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationSummary.getMediaInsightsPipelineConfigurationArn(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
