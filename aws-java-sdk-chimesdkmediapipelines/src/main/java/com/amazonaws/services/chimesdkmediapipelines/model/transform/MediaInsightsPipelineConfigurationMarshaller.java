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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaInsightsPipelineConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaInsightsPipelineConfigurationMarshaller {

    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationName").build();
    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationArn").build();
    private static final MarshallingInfo<String> RESOURCEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceAccessRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> REALTIMEALERTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RealTimeAlertConfiguration").build();
    private static final MarshallingInfo<List> ELEMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Elements").build();
    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdatedTimestamp").timestampFormat("iso8601").build();

    private static final MediaInsightsPipelineConfigurationMarshaller instance = new MediaInsightsPipelineConfigurationMarshaller();

    public static MediaInsightsPipelineConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaInsightsPipelineConfiguration mediaInsightsPipelineConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (mediaInsightsPipelineConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getMediaInsightsPipelineConfigurationName(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getMediaInsightsPipelineConfigurationArn(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getResourceAccessRoleArn(), RESOURCEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getRealTimeAlertConfiguration(), REALTIMEALERTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getElements(), ELEMENTS_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getMediaInsightsPipelineConfigurationId(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfiguration.getUpdatedTimestamp(), UPDATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
