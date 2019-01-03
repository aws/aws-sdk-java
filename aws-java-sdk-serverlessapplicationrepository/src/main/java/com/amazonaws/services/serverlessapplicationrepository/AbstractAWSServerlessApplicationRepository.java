/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSServerlessApplicationRepository}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSServerlessApplicationRepository implements AWSServerlessApplicationRepository {

    protected AbstractAWSServerlessApplicationRepository() {
    }

    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCloudFormationChangeSetResult createCloudFormationChangeSet(CreateCloudFormationChangeSetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCloudFormationTemplateResult createCloudFormationTemplate(CreateCloudFormationTemplateRequest request) {
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
    public GetApplicationPolicyResult getApplicationPolicy(GetApplicationPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCloudFormationTemplateResult getCloudFormationTemplate(GetCloudFormationTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationDependenciesResult listApplicationDependencies(ListApplicationDependenciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutApplicationPolicyResult putApplicationPolicy(PutApplicationPolicyRequest request) {
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
