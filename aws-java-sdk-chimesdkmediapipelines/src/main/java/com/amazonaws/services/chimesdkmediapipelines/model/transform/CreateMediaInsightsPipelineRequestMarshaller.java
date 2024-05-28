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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMediaInsightsPipelineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMediaInsightsPipelineRequestMarshaller {

    private static final MarshallingInfo<String> MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MediaInsightsPipelineConfigurationArn").build();
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
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateMediaInsightsPipelineRequestMarshaller instance = new CreateMediaInsightsPipelineRequestMarshaller();

    public static CreateMediaInsightsPipelineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMediaInsightsPipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getMediaInsightsPipelineConfigurationArn(),
                    MEDIAINSIGHTSPIPELINECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getKinesisVideoStreamSourceRuntimeConfiguration(),
                    KINESISVIDEOSTREAMSOURCERUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getMediaInsightsRuntimeMetadata(), MEDIAINSIGHTSRUNTIMEMETADATA_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getKinesisVideoStreamRecordingSourceRuntimeConfiguration(),
                    KINESISVIDEOSTREAMRECORDINGSOURCERUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getS3RecordingSinkRuntimeConfiguration(),
                    S3RECORDINGSINKRUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createMediaInsightsPipelineRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
