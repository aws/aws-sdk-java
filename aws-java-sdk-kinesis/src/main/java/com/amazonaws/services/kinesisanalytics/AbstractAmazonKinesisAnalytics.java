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
package com.amazonaws.services.kinesisanalytics;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonKinesisAnalytics}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKinesisAnalytics implements AmazonKinesisAnalytics {

    protected AbstractAmazonKinesisAnalytics() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddApplicationCloudWatchLoggingOptionResult addApplicationCloudWatchLoggingOption(AddApplicationCloudWatchLoggingOptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddApplicationInputResult addApplicationInput(AddApplicationInputRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddApplicationInputProcessingConfigurationResult addApplicationInputProcessingConfiguration(AddApplicationInputProcessingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddApplicationOutputResult addApplicationOutput(AddApplicationOutputRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddApplicationReferenceDataSourceResult addApplicationReferenceDataSource(AddApplicationReferenceDataSourceRequest request) {
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
    public DeleteApplicationCloudWatchLoggingOptionResult deleteApplicationCloudWatchLoggingOption(DeleteApplicationCloudWatchLoggingOptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationInputProcessingConfigurationResult deleteApplicationInputProcessingConfiguration(
            DeleteApplicationInputProcessingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationOutputResult deleteApplicationOutput(DeleteApplicationOutputRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(DeleteApplicationReferenceDataSourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeApplicationResult describeApplication(DescribeApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DiscoverInputSchemaResult discoverInputSchema(DiscoverInputSchemaRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartApplicationResult startApplication(StartApplicationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopApplicationResult stopApplication(StopApplicationRequest request) {
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
