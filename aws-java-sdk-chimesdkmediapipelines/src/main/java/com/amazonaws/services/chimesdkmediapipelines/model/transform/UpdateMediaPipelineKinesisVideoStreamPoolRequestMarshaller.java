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
 * UpdateMediaPipelineKinesisVideoStreamPoolRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateMediaPipelineKinesisVideoStreamPoolRequestMarshaller {

    private static final MarshallingInfo<String> IDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("identifier").build();
    private static final MarshallingInfo<StructuredPojo> STREAMCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamConfiguration").build();

    private static final UpdateMediaPipelineKinesisVideoStreamPoolRequestMarshaller instance = new UpdateMediaPipelineKinesisVideoStreamPoolRequestMarshaller();

    public static UpdateMediaPipelineKinesisVideoStreamPoolRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateMediaPipelineKinesisVideoStreamPoolRequest updateMediaPipelineKinesisVideoStreamPoolRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (updateMediaPipelineKinesisVideoStreamPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateMediaPipelineKinesisVideoStreamPoolRequest.getIdentifier(), IDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateMediaPipelineKinesisVideoStreamPoolRequest.getStreamConfiguration(), STREAMCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
