/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless;

import javax.annotation.Generated;

import com.amazonaws.services.emrserverless.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSEMRServerless}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSEMRServerless implements AWSEMRServerless {

    protected AbstractAWSEMRServerless() {
    }

    @Override
    public CancelJobRunResult cancelJobRun(CancelJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDashboardForJobRunResult getDashboardForJobRun(GetDashboardForJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetJobRunResult getJobRun(GetJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobRunsResult listJobRuns(ListJobRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartApplicationResult startApplication(StartApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopApplicationResult stopApplication(StopApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
