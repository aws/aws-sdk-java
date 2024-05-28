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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaInsightsPipelineMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaInsightsPipelineMarshaller {

    private static final MarshallingInfo<String> MEDIAPIPELINEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaPipelineId").build();
    private static final MarshallingInfo<String> MEDIAPIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaPipelineArn").build();
    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationArn").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<StructuredPojo> KINESISVIDEOSTREAMSOURCERUNTIMECONFIGURATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KinesisVideoStreamSourceRuntimeConfiguration").build();
    private static final MarshallingInfo<Map> MEDIAINSIGHTSRUNTIMEMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsRuntimeMetadata").build();
    private static final MarshallingInfo<StructuredPojo> KINESISVIDEOSTREAMRECORDINGSOURCERUNTIMECONFIGURATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KinesisVideoStreamRecordingSourceRuntimeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3RECORDINGSINKRUNTIMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3RecordingSinkRuntimeConfiguration").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("iso8601").build();
    private static final MarshallingInfo<List> ELEMENTSTATUSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElementStatuses").build();

    private static final MediaInsightsPipelineMarshaller instance = new MediaInsightsPipelineMarshaller();

    public static MediaInsightsPipelineMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaInsightsPipeline mediaInsightsPipeline, ProtocolMarshaller protocolMarshaller) {

        if (mediaInsightsPipeline == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaInsightsPipeline.getMediaPipelineId(), MEDIAPIPELINEID_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getMediaPipelineArn(), MEDIAPIPELINEARN_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getMediaInsightsPipelineConfigurationArn(), MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getKinesisVideoStreamSourceRuntimeConfiguration(),
                    KINESISVIDEOSTREAMSOURCERUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getMediaInsightsRuntimeMetadata(), MEDIAINSIGHTSRUNTIMEMETADATA_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getKinesisVideoStreamRecordingSourceRuntimeConfiguration(),
                    KINESISVIDEOSTREAMRECORDINGSOURCERUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getS3RecordingSinkRuntimeConfiguration(), S3RECORDINGSINKRUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipeline.getElementStatuses(), ELEMENTSTATUSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
