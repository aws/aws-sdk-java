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

/**
 * Abstract implementation of {@code AWSKafkaConnectAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSKafkaConnectAsync extends AbstractAWSKafkaConnect implements AWSKafkaConnectAsync {

    protected AbstractAWSKafkaConnectAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest request) {

        return createConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(CreateCustomPluginRequest request) {

        return createCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(CreateCustomPluginRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomPluginRequest, CreateCustomPluginResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(CreateWorkerConfigurationRequest request) {

        return createWorkerConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(CreateWorkerConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerConfigurationRequest, CreateWorkerConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest request) {

        return deleteConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(DeleteCustomPluginRequest request) {

        return deleteCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(DeleteCustomPluginRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomPluginRequest, DeleteCustomPluginResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest request) {

        return describeConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorRequest, DescribeConnectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(DescribeCustomPluginRequest request) {

        return describeCustomPluginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(DescribeCustomPluginRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomPluginRequest, DescribeCustomPluginResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(DescribeWorkerConfigurationRequest request) {

        return describeWorkerConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(DescribeWorkerConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkerConfigurationRequest, DescribeWorkerConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest request) {

        return listConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(ListCustomPluginsRequest request) {

        return listCustomPluginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(ListCustomPluginsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCustomPluginsRequest, ListCustomPluginsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(ListWorkerConfigurationsRequest request) {

        return listWorkerConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(ListWorkerConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkerConfigurationsRequest, ListWorkerConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest request) {

        return updateConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectorRequest, UpdateConnectorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
