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
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.chimesdkmediapipelines.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteMediaPipelineKinesisVideoStreamPoolRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller implements
        Marshaller<Request<DeleteMediaPipelineKinesisVideoStreamPoolRequest>, DeleteMediaPipelineKinesisVideoStreamPoolRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.REST_JSON)
            .requestUri("/media-pipeline-kinesis-video-stream-pools/{identifier}").httpMethodName(HttpMethodName.DELETE).hasExplicitPayloadMember(false)
            .hasPayloadMembers(false).serviceName("AmazonChimeSDKMediaPipelines").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public DeleteMediaPipelineKinesisVideoStreamPoolRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteMediaPipelineKinesisVideoStreamPoolRequest> marshall(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest deleteMediaPipelineKinesisVideoStreamPoolRequest) {

        if (deleteMediaPipelineKinesisVideoStreamPoolRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<DeleteMediaPipelineKinesisVideoStreamPoolRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, deleteMediaPipelineKinesisVideoStreamPoolRequest);

            protocolMarshaller.startMarshalling();
            DeleteMediaPipelineKinesisVideoStreamPoolRequestMarshaller.getInstance().marshall(deleteMediaPipelineKinesisVideoStreamPoolRequest,
                    protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
