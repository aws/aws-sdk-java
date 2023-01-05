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
package com.amazonaws.services.kafkaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.kafkaconnect.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSKafkaConnect}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKafkaConnect implements AWSKafkaConnect {

    protected AbstractAWSKafkaConnect() {
    }

    @Override
    public CreateConnectorResult createConnector(CreateConnectorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateCustomPluginResult createCustomPlugin(CreateCustomPluginRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWorkerConfigurationResult createWorkerConfiguration(CreateWorkerConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteConnectorResult deleteConnector(DeleteConnectorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCustomPluginResult deleteCustomPlugin(DeleteCustomPluginRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectorResult describeConnector(DescribeConnectorRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCustomPluginResult describeCustomPlugin(DescribeCustomPluginRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkerConfigurationResult describeWorkerConfiguration(DescribeWorkerConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListConnectorsResult listConnectors(ListConnectorsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCustomPluginsResult listCustomPlugins(ListCustomPluginsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListWorkerConfigurationsResult listWorkerConfigurations(ListWorkerConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateConnectorResult updateConnector(UpdateConnectorRequest request) {
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
