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
 * ListMediaPipelineKinesisVideoStreamPoolsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListMediaPipelineKinesisVideoStreamPoolsRequestProtocolMarshaller implements
        Marshaller<Request<ListMediaPipelineKinesisVideoStreamPoolsRequest>, ListMediaPipelineKinesisVideoStreamPoolsRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.REST_JSON)
            .requestUri("/media-pipeline-kinesis-video-stream-pools").httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(false)
            .hasPayloadMembers(false).serviceName("AmazonChimeSDKMediaPipelines").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public ListMediaPipelineKinesisVideoStreamPoolsRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListMediaPipelineKinesisVideoStreamPoolsRequest> marshall(
            ListMediaPipelineKinesisVideoStreamPoolsRequest listMediaPipelineKinesisVideoStreamPoolsRequest) {

        if (listMediaPipelineKinesisVideoStreamPoolsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<ListMediaPipelineKinesisVideoStreamPoolsRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, listMediaPipelineKinesisVideoStreamPoolsRequest);

            protocolMarshaller.startMarshalling();
            ListMediaPipelineKinesisVideoStreamPoolsRequestMarshaller.getInstance().marshall(listMediaPipelineKinesisVideoStreamPoolsRequest,
                    protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
