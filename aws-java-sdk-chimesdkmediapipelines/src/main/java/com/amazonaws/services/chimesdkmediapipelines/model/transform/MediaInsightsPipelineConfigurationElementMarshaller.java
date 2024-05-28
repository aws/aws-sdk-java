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
 * MediaInsightsPipelineConfigurationElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaInsightsPipelineConfigurationElementMarshaller {

    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> AMAZONTRANSCRIBECALLANALYTICSPROCESSORCONFIGURATION_BINDING = MarshallingInfo
            .builder(MarshallingType.STRUCTURED).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AmazonTranscribeCallAnalyticsProcessorConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> AMAZONTRANSCRIBEPROCESSORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmazonTranscribeProcessorConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> KINESISDATASTREAMSINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisDataStreamSinkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> S3RECORDINGSINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3RecordingSinkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VOICEANALYTICSPROCESSORCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceAnalyticsProcessorConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTIONSINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaFunctionSinkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SQSQUEUESINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SqsQueueSinkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SNSTOPICSINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnsTopicSinkConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> VOICEENHANCEMENTSINKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceEnhancementSinkConfiguration").build();

    private static final MediaInsightsPipelineConfigurationElementMarshaller instance = new MediaInsightsPipelineConfigurationElementMarshaller();

    public static MediaInsightsPipelineConfigurationElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaInsightsPipelineConfigurationElement mediaInsightsPipelineConfigurationElement, ProtocolMarshaller protocolMarshaller) {

        if (mediaInsightsPipelineConfigurationElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getAmazonTranscribeCallAnalyticsProcessorConfiguration(),
                    AMAZONTRANSCRIBECALLANALYTICSPROCESSORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getAmazonTranscribeProcessorConfiguration(),
                    AMAZONTRANSCRIBEPROCESSORCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getKinesisDataStreamSinkConfiguration(),
                    KINESISDATASTREAMSINKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getS3RecordingSinkConfiguration(), S3RECORDINGSINKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getVoiceAnalyticsProcessorConfiguration(),
                    VOICEANALYTICSPROCESSORCONFIGURATION_BINDING);
            protocolMarshaller
                    .marshall(mediaInsightsPipelineConfigurationElement.getLambdaFunctionSinkConfiguration(), LAMBDAFUNCTIONSINKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getSqsQueueSinkConfiguration(), SQSQUEUESINKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getSnsTopicSinkConfiguration(), SNSTOPICSINKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(mediaInsightsPipelineConfigurationElement.getVoiceEnhancementSinkConfiguration(),
                    VOICEENHANCEMENTSINKCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
