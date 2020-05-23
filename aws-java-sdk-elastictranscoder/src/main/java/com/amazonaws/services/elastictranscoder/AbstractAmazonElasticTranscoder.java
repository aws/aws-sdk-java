/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.*;
import com.amazonaws.services.elastictranscoder.waiters.AmazonElasticTranscoderWaiters;

/**
 * Abstract implementation of {@code AmazonElasticTranscoder}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticTranscoder implements AmazonElasticTranscoder {

    protected AbstractAmazonElasticTranscoder() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreatePipelineResult createPipeline(CreatePipelineRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public CreatePresetResult createPreset(CreatePresetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeletePipelineResult deletePipeline(DeletePipelineRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DeletePresetResult deletePreset(DeletePresetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListJobsByPipelineResult listJobsByPipeline(ListJobsByPipelineRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListJobsByStatusResult listJobsByStatus(ListJobsByStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPipelinesResult listPipelines(ListPipelinesRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPipelinesResult listPipelines() {
        return listPipelines(new ListPipelinesRequest());
    }

    @Override
    public ListPresetsResult listPresets(ListPresetsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListPresetsResult listPresets() {
        return listPresets(new ListPresetsRequest());
    }

    @Override
    public ReadJobResult readJob(ReadJobRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ReadPipelineResult readPipeline(ReadPipelineRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ReadPresetResult readPreset(ReadPresetRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public TestRoleResult testRole(TestRoleRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdatePipelineResult updatePipeline(UpdatePipelineRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdatePipelineNotificationsResult updatePipelineNotifications(UpdatePipelineNotificationsRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UpdatePipelineStatusResult updatePipelineStatus(UpdatePipelineStatusRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AmazonElasticTranscoderWaiters waiters() {
        throw new UnsupportedOperationException();
    }

}
