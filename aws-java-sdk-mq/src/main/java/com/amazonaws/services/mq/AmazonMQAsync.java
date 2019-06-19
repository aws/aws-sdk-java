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
package com.amazonaws.services.mq;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;

/**
 * Interface for accessing AmazonMQ asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mq.AbstractAmazonMQAsync} instead.
 * </p>
 * <p>
 * Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
 * brokers in the cloud. A message broker allows software applications and components to communicate using various
 * programming languages, operating systems, and formal messaging protocols.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMQAsync extends AmazonMQ {

    /**
     * Creates a broker. Note: This API is asynchronous.
     * 
     * @param createBrokerRequest
     *        Creates a broker using the specified properties.
     * @return A Java Future containing the result of the CreateBroker operation returned by the service.
     * @sample AmazonMQAsync.CreateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBrokerResult> createBrokerAsync(CreateBrokerRequest createBrokerRequest);

    /**
     * Creates a broker. Note: This API is asynchronous.
     * 
     * @param createBrokerRequest
     *        Creates a broker using the specified properties.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBroker operation returned by the service.
     * @sample AmazonMQAsyncHandler.CreateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBrokerResult> createBrokerAsync(CreateBrokerRequest createBrokerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBrokerRequest, CreateBrokerResult> asyncHandler);

    /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
     * engine type and version).
     * 
     * @param createConfigurationRequest
     *        Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration
     *        (the engine type and version).
     * @return A Java Future containing the result of the CreateConfiguration operation returned by the service.
     * @sample AmazonMQAsync.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest createConfigurationRequest);

    /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
     * engine type and version).
     * 
     * @param createConfigurationRequest
     *        Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration
     *        (the engine type and version).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguration operation returned by the service.
     * @sample AmazonMQAsyncHandler.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest createConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationRequest, CreateConfigurationResult> asyncHandler);

    /**
     * Add a tag to a resource.
     * 
     * @param createTagsRequest
     *        A map of the key-value pairs for the resource tag.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonMQAsync.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest);

    /**
     * Add a tag to a resource.
     * 
     * @param createTagsRequest
     *        A map of the key-value pairs for the resource tag.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTags operation returned by the service.
     * @sample AmazonMQAsyncHandler.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest createTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler);

    /**
     * Creates an ActiveMQ user.
     * 
     * @param createUserRequest
     *        Creates a new ActiveMQ user.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonMQAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * Creates an ActiveMQ user.
     * 
     * @param createUserRequest
     *        Creates a new ActiveMQ user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonMQAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * Deletes a broker. Note: This API is asynchronous.
     * 
     * @param deleteBrokerRequest
     * @return A Java Future containing the result of the DeleteBroker operation returned by the service.
     * @sample AmazonMQAsync.DeleteBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBrokerResult> deleteBrokerAsync(DeleteBrokerRequest deleteBrokerRequest);

    /**
     * Deletes a broker. Note: This API is asynchronous.
     * 
     * @param deleteBrokerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBroker operation returned by the service.
     * @sample AmazonMQAsyncHandler.DeleteBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBrokerResult> deleteBrokerAsync(DeleteBrokerRequest deleteBrokerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBrokerRequest, DeleteBrokerResult> asyncHandler);

    /**
     * Removes a tag from a resource.
     * 
     * @param deleteTagsRequest
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonMQAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * Removes a tag from a resource.
     * 
     * @param deleteTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonMQAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * Deletes an ActiveMQ user.
     * 
     * @param deleteUserRequest
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonMQAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * Deletes an ActiveMQ user.
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AmazonMQAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * Returns information about the specified broker.
     * 
     * @param describeBrokerRequest
     * @return A Java Future containing the result of the DescribeBroker operation returned by the service.
     * @sample AmazonMQAsync.DescribeBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerResult> describeBrokerAsync(DescribeBrokerRequest describeBrokerRequest);

    /**
     * Returns information about the specified broker.
     * 
     * @param describeBrokerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBroker operation returned by the service.
     * @sample AmazonMQAsyncHandler.DescribeBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerResult> describeBrokerAsync(DescribeBrokerRequest describeBrokerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerRequest, DescribeBrokerResult> asyncHandler);

    /**
     * Describe available engine types and versions.
     * 
     * @param describeBrokerEngineTypesRequest
     * @return A Java Future containing the result of the DescribeBrokerEngineTypes operation returned by the service.
     * @sample AmazonMQAsync.DescribeBrokerEngineTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerEngineTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerEngineTypesResult> describeBrokerEngineTypesAsync(
            DescribeBrokerEngineTypesRequest describeBrokerEngineTypesRequest);

    /**
     * Describe available engine types and versions.
     * 
     * @param describeBrokerEngineTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBrokerEngineTypes operation returned by the service.
     * @sample AmazonMQAsyncHandler.DescribeBrokerEngineTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerEngineTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerEngineTypesResult> describeBrokerEngineTypesAsync(
            DescribeBrokerEngineTypesRequest describeBrokerEngineTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerEngineTypesRequest, DescribeBrokerEngineTypesResult> asyncHandler);

    /**
     * Describe available broker instance options.
     * 
     * @param describeBrokerInstanceOptionsRequest
     * @return A Java Future containing the result of the DescribeBrokerInstanceOptions operation returned by the
     *         service.
     * @sample AmazonMQAsync.DescribeBrokerInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerInstanceOptionsResult> describeBrokerInstanceOptionsAsync(
            DescribeBrokerInstanceOptionsRequest describeBrokerInstanceOptionsRequest);

    /**
     * Describe available broker instance options.
     * 
     * @param describeBrokerInstanceOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBrokerInstanceOptions operation returned by the
     *         service.
     * @sample AmazonMQAsyncHandler.DescribeBrokerInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBrokerInstanceOptionsResult> describeBrokerInstanceOptionsAsync(
            DescribeBrokerInstanceOptionsRequest describeBrokerInstanceOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerInstanceOptionsRequest, DescribeBrokerInstanceOptionsResult> asyncHandler);

    /**
     * Returns information about the specified configuration.
     * 
     * @param describeConfigurationRequest
     * @return A Java Future containing the result of the DescribeConfiguration operation returned by the service.
     * @sample AmazonMQAsync.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest describeConfigurationRequest);

    /**
     * Returns information about the specified configuration.
     * 
     * @param describeConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfiguration operation returned by the service.
     * @sample AmazonMQAsyncHandler.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest describeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRequest, DescribeConfigurationResult> asyncHandler);

    /**
     * Returns the specified configuration revision for the specified configuration.
     * 
     * @param describeConfigurationRevisionRequest
     * @return A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
     *         service.
     * @sample AmazonMQAsync.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest);

    /**
     * Returns the specified configuration revision for the specified configuration.
     * 
     * @param describeConfigurationRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationRevision operation returned by the
     *         service.
     * @sample AmazonMQAsyncHandler.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(
            DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRevisionRequest, DescribeConfigurationRevisionResult> asyncHandler);

    /**
     * Returns information about an ActiveMQ user.
     * 
     * @param describeUserRequest
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonMQAsync.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest);

    /**
     * Returns information about an ActiveMQ user.
     * 
     * @param describeUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUser operation returned by the service.
     * @sample AmazonMQAsyncHandler.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest describeUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler);

    /**
     * Returns a list of all brokers.
     * 
     * @param listBrokersRequest
     * @return A Java Future containing the result of the ListBrokers operation returned by the service.
     * @sample AmazonMQAsync.ListBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBrokersResult> listBrokersAsync(ListBrokersRequest listBrokersRequest);

    /**
     * Returns a list of all brokers.
     * 
     * @param listBrokersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBrokers operation returned by the service.
     * @sample AmazonMQAsyncHandler.ListBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBrokersResult> listBrokersAsync(ListBrokersRequest listBrokersRequest,
            com.amazonaws.handlers.AsyncHandler<ListBrokersRequest, ListBrokersResult> asyncHandler);

    /**
     * Returns a list of all revisions for the specified configuration.
     * 
     * @param listConfigurationRevisionsRequest
     * @return A Java Future containing the result of the ListConfigurationRevisions operation returned by the service.
     * @sample AmazonMQAsync.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest);

    /**
     * Returns a list of all revisions for the specified configuration.
     * 
     * @param listConfigurationRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationRevisions operation returned by the service.
     * @sample AmazonMQAsyncHandler.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(
            ListConfigurationRevisionsRequest listConfigurationRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationRevisionsRequest, ListConfigurationRevisionsResult> asyncHandler);

    /**
     * Returns a list of all configurations.
     * 
     * @param listConfigurationsRequest
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AmazonMQAsync.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * Returns a list of all configurations.
     * 
     * @param listConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurations operation returned by the service.
     * @sample AmazonMQAsyncHandler.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest listConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler);

    /**
     * Lists tags for a resource.
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonMQAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * Lists tags for a resource.
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonMQAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * Returns a list of all ActiveMQ users.
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonMQAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * Returns a list of all ActiveMQ users.
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonMQAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * Reboots a broker. Note: This API is asynchronous.
     * 
     * @param rebootBrokerRequest
     * @return A Java Future containing the result of the RebootBroker operation returned by the service.
     * @sample AmazonMQAsync.RebootBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/RebootBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest rebootBrokerRequest);

    /**
     * Reboots a broker. Note: This API is asynchronous.
     * 
     * @param rebootBrokerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootBroker operation returned by the service.
     * @sample AmazonMQAsyncHandler.RebootBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/RebootBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest rebootBrokerRequest,
            com.amazonaws.handlers.AsyncHandler<RebootBrokerRequest, RebootBrokerResult> asyncHandler);

    /**
     * Adds a pending configuration change to a broker.
     * 
     * @param updateBrokerRequest
     *        Updates the broker using the specified properties.
     * @return A Java Future containing the result of the UpdateBroker operation returned by the service.
     * @sample AmazonMQAsync.UpdateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerResult> updateBrokerAsync(UpdateBrokerRequest updateBrokerRequest);

    /**
     * Adds a pending configuration change to a broker.
     * 
     * @param updateBrokerRequest
     *        Updates the broker using the specified properties.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBroker operation returned by the service.
     * @sample AmazonMQAsyncHandler.UpdateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBrokerResult> updateBrokerAsync(UpdateBrokerRequest updateBrokerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerRequest, UpdateBrokerResult> asyncHandler);

    /**
     * Updates the specified configuration.
     * 
     * @param updateConfigurationRequest
     *        Updates the specified configuration.
     * @return A Java Future containing the result of the UpdateConfiguration operation returned by the service.
     * @sample AmazonMQAsync.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest updateConfigurationRequest);

    /**
     * Updates the specified configuration.
     * 
     * @param updateConfigurationRequest
     *        Updates the specified configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguration operation returned by the service.
     * @sample AmazonMQAsyncHandler.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest updateConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler);

    /**
     * Updates the information for an ActiveMQ user.
     * 
     * @param updateUserRequest
     *        Updates the information for an ActiveMQ user.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonMQAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * Updates the information for an ActiveMQ user.
     * 
     * @param updateUserRequest
     *        Updates the information for an ActiveMQ user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonMQAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

}
