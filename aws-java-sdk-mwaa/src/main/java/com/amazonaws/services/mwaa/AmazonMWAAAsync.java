/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mwaa;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;

/**
 * Interface for accessing AmazonMWAA asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mwaa.AbstractAmazonMWAAAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Amazon Managed Workflows for Apache Airflow</fullname>
 * <p>
 * This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation. For more
 * information, see <a href="https://docs.aws.amazon.com/mwaa/latest/userguide/what-is-mwaa.html">What Is Amazon
 * MWAA?</a>.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMWAAAsync extends AmazonMWAA {

    /**
     * <p>
     * Create a CLI token to use Airflow CLI.
     * </p>
     * 
     * @param createCliTokenRequest
     * @return A Java Future containing the result of the CreateCliToken operation returned by the service.
     * @sample AmazonMWAAAsync.CreateCliToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateCliToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCliTokenResult> createCliTokenAsync(CreateCliTokenRequest createCliTokenRequest);

    /**
     * <p>
     * Create a CLI token to use Airflow CLI.
     * </p>
     * 
     * @param createCliTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCliToken operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.CreateCliToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateCliToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCliTokenResult> createCliTokenAsync(CreateCliTokenRequest createCliTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCliTokenRequest, CreateCliTokenResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     *        This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation
     *        to create an environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/get-started.html">Get started with Amazon Managed
     *        Workflows for Apache Airflow</a>.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonMWAAAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     *        This section contains the Amazon Managed Workflows for Apache Airflow (MWAA) API reference documentation
     *        to create an environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/mwaa/latest/userguide/get-started.html">Get started with Amazon Managed
     *        Workflows for Apache Airflow</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Create a JWT token to be used to login to Airflow Web UI with claims based Authentication.
     * </p>
     * 
     * @param createWebLoginTokenRequest
     * @return A Java Future containing the result of the CreateWebLoginToken operation returned by the service.
     * @sample AmazonMWAAAsync.CreateWebLoginToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebLoginTokenResult> createWebLoginTokenAsync(CreateWebLoginTokenRequest createWebLoginTokenRequest);

    /**
     * <p>
     * Create a JWT token to be used to login to Airflow Web UI with claims based Authentication.
     * </p>
     * 
     * @param createWebLoginTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebLoginToken operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.CreateWebLoginToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebLoginTokenResult> createWebLoginTokenAsync(CreateWebLoginTokenRequest createWebLoginTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebLoginTokenRequest, CreateWebLoginTokenResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonMWAAAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonMWAAAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Retrieves the details of an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonMWAAAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMWAAAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * An operation for publishing metrics from the customers to the Ops plane.
     * </p>
     * 
     * @param publishMetricsRequest
     * @return A Java Future containing the result of the PublishMetrics operation returned by the service.
     * @sample AmazonMWAAAsync.PublishMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/PublishMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishMetricsResult> publishMetricsAsync(PublishMetricsRequest publishMetricsRequest);

    /**
     * <p>
     * An operation for publishing metrics from the customers to the Ops plane.
     * </p>
     * 
     * @param publishMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishMetrics operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.PublishMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/PublishMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishMetricsResult> publishMetricsAsync(PublishMetricsRequest publishMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<PublishMetricsRequest, PublishMetricsResult> asyncHandler);

    /**
     * <p>
     * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMWAAAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMWAAAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonMWAAAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonMWAAAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

}
