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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mwaa.model.*;

/**
 * Interface for accessing AmazonMWAA.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mwaa.AbstractAmazonMWAA} instead.
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
public interface AmazonMWAA {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "airflow";

    /**
     * <p>
     * Create a CLI token to use Airflow CLI.
     * </p>
     * 
     * @param createCliTokenRequest
     * @return Result of the CreateCliToken operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @sample AmazonMWAA.CreateCliToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateCliToken" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCliTokenResult createCliToken(CreateCliTokenRequest createCliTokenRequest);

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
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Create a JWT token to be used to login to Airflow Web UI with claims based Authentication.
     * </p>
     * 
     * @param createWebLoginTokenRequest
     * @return Result of the CreateWebLoginToken operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the Airflow Web UI or CLI has been Denied. Please follow the MWAA user guide to setup
     *         permissions to access the Web UI and CLI functionality.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.CreateWebLoginToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/CreateWebLoginToken" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWebLoginTokenResult createWebLoginToken(CreateWebLoginTokenRequest createWebLoginTokenRequest);

    /**
     * <p>
     * Deletes an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Retrieves the details of an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Lists the Amazon Managed Workflows for Apache Airflow (MWAA) environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists the key-value tag pairs associated to the Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * An operation for publishing metrics from the customers to the Ops plane.
     * </p>
     * 
     * @param publishMetricsRequest
     * @return Result of the PublishMetrics operation returned by the service.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.PublishMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/PublishMetrics" target="_top">AWS API
     *      Documentation</a>
     */
    PublishMetricsResult publishMetrics(PublishMetricsRequest publishMetricsRequest);

    /**
     * <p>
     * Associates key-value tag pairs to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes key-value tag pairs associated to your Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * For example, <code>"Environment": "Staging"</code>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Amazon Managed Workflows for Apache Airflow (MWAA) environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         ResourceNotFoundException: The resource is not available.
     * @throws ValidationException
     *         ValidationException: The provided input is not valid.
     * @throws InternalServerException
     *         InternalServerException: An internal error has occurred.
     * @sample AmazonMWAA.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
