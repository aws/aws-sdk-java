/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMediaCapturePipelineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMediaCapturePipelineRequestMarshaller {

    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceType").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<String> SINKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SinkType").build();
    private static final MarshallingInfo<String> SINKARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SinkArn").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateMediaCapturePipelineRequestMarshaller instance = new CreateMediaCapturePipelineRequestMarshaller();

    public static CreateMediaCapturePipelineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMediaCapturePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMediaCapturePipelineRequest.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(createMediaCapturePipelineRequest.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(createMediaCapturePipelineRequest.getSinkType(), SINKTYPE_BINDING);
            protocolMarshaller.marshall(createMediaCapturePipelineRequest.getSinkArn(), SINKARN_BINDING);
            protocolMarshaller.marshall(createMediaCapturePipelineRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
