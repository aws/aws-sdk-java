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
 * Interface for accessing Kafka Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kafkaconnect.AbstractAWSKafkaConnectAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSKafkaConnectAsync extends AWSKafkaConnect {

    /**
     * <p>
     * Creates a connector using the specified properties.
     * </p>
     * 
     * @param createConnectorRequest
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSKafkaConnectAsync.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates a connector using the specified properties.
     * </p>
     * 
     * @param createConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnector operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorResult> createConnectorAsync(CreateConnectorRequest createConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorRequest, CreateConnectorResult> asyncHandler);

    /**
     * <p>
     * Creates a custom plugin using the specified properties.
     * </p>
     * 
     * @param createCustomPluginRequest
     * @return A Java Future containing the result of the CreateCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsync.CreateCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(CreateCustomPluginRequest createCustomPluginRequest);

    /**
     * <p>
     * Creates a custom plugin using the specified properties.
     * </p>
     * 
     * @param createCustomPluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.CreateCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomPluginResult> createCustomPluginAsync(CreateCustomPluginRequest createCustomPluginRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomPluginRequest, CreateCustomPluginResult> asyncHandler);

    /**
     * <p>
     * Creates a worker configuration using the specified properties.
     * </p>
     * 
     * @param createWorkerConfigurationRequest
     * @return A Java Future containing the result of the CreateWorkerConfiguration operation returned by the service.
     * @sample AWSKafkaConnectAsync.CreateWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(
            CreateWorkerConfigurationRequest createWorkerConfigurationRequest);

    /**
     * <p>
     * Creates a worker configuration using the specified properties.
     * </p>
     * 
     * @param createWorkerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkerConfiguration operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.CreateWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkerConfigurationResult> createWorkerConfigurationAsync(
            CreateWorkerConfigurationRequest createWorkerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerConfigurationRequest, CreateWorkerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified connector.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSKafkaConnectAsync.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest);

    /**
     * <p>
     * Deletes the specified connector.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnector operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorResult> deleteConnectorAsync(DeleteConnectorRequest deleteConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorRequest, DeleteConnectorResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom plugin.
     * </p>
     * 
     * @param deleteCustomPluginRequest
     * @return A Java Future containing the result of the DeleteCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsync.DeleteCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(DeleteCustomPluginRequest deleteCustomPluginRequest);

    /**
     * <p>
     * Deletes a custom plugin.
     * </p>
     * 
     * @param deleteCustomPluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.DeleteCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomPluginResult> deleteCustomPluginAsync(DeleteCustomPluginRequest deleteCustomPluginRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomPluginRequest, DeleteCustomPluginResult> asyncHandler);

    /**
     * <p>
     * Returns summary information about the connector.
     * </p>
     * 
     * @param describeConnectorRequest
     * @return A Java Future containing the result of the DescribeConnector operation returned by the service.
     * @sample AWSKafkaConnectAsync.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest describeConnectorRequest);

    /**
     * <p>
     * Returns summary information about the connector.
     * </p>
     * 
     * @param describeConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnector operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorResult> describeConnectorAsync(DescribeConnectorRequest describeConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorRequest, DescribeConnectorResult> asyncHandler);

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param describeCustomPluginRequest
     * @return A Java Future containing the result of the DescribeCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsync.DescribeCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(DescribeCustomPluginRequest describeCustomPluginRequest);

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param describeCustomPluginRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomPlugin operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.DescribeCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomPluginResult> describeCustomPluginAsync(DescribeCustomPluginRequest describeCustomPluginRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomPluginRequest, DescribeCustomPluginResult> asyncHandler);

    /**
     * <p>
     * Returns information about a worker configuration.
     * </p>
     * 
     * @param describeWorkerConfigurationRequest
     * @return A Java Future containing the result of the DescribeWorkerConfiguration operation returned by the service.
     * @sample AWSKafkaConnectAsync.DescribeWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(
            DescribeWorkerConfigurationRequest describeWorkerConfigurationRequest);

    /**
     * <p>
     * Returns information about a worker configuration.
     * </p>
     * 
     * @param describeWorkerConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkerConfiguration operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.DescribeWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkerConfigurationResult> describeWorkerConfigurationAsync(
            DescribeWorkerConfigurationRequest describeWorkerConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkerConfigurationRequest, DescribeWorkerConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name
     * starts with the specified prefix. The response also includes a description of each of the listed connectors.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSKafkaConnectAsync.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListConnectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name
     * starts with the specified prefix. The response also includes a description of each of the listed connectors.
     * </p>
     * 
     * @param listConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnectors operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListConnectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorsResult> listConnectorsAsync(ListConnectorsRequest listConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectorsRequest, ListConnectorsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of the custom plugins in this account and Region.
     * </p>
     * 
     * @param listCustomPluginsRequest
     * @return A Java Future containing the result of the ListCustomPlugins operation returned by the service.
     * @sample AWSKafkaConnectAsync.ListCustomPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListCustomPlugins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(ListCustomPluginsRequest listCustomPluginsRequest);

    /**
     * <p>
     * Returns a list of all of the custom plugins in this account and Region.
     * </p>
     * 
     * @param listCustomPluginsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomPlugins operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.ListCustomPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListCustomPlugins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomPluginsResult> listCustomPluginsAsync(ListCustomPluginsRequest listCustomPluginsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomPluginsRequest, ListCustomPluginsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of the worker configurations in this account and Region.
     * </p>
     * 
     * @param listWorkerConfigurationsRequest
     * @return A Java Future containing the result of the ListWorkerConfigurations operation returned by the service.
     * @sample AWSKafkaConnectAsync.ListWorkerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListWorkerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(ListWorkerConfigurationsRequest listWorkerConfigurationsRequest);

    /**
     * <p>
     * Returns a list of all of the worker configurations in this account and Region.
     * </p>
     * 
     * @param listWorkerConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkerConfigurations operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.ListWorkerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListWorkerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkerConfigurationsResult> listWorkerConfigurationsAsync(ListWorkerConfigurationsRequest listWorkerConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkerConfigurationsRequest, ListWorkerConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Updates the specified connector.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return A Java Future containing the result of the UpdateConnector operation returned by the service.
     * @sample AWSKafkaConnectAsync.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/UpdateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest updateConnectorRequest);

    /**
     * <p>
     * Updates the specified connector.
     * </p>
     * 
     * @param updateConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnector operation returned by the service.
     * @sample AWSKafkaConnectAsyncHandler.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/UpdateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorResult> updateConnectorAsync(UpdateConnectorRequest updateConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectorRequest, UpdateConnectorResult> asyncHandler);

}
