/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controlcatalog;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.controlcatalog.model.*;

/**
 * Interface for accessing AWS Control Catalog.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.controlcatalog.AbstractAWSControlCatalog} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the Amazon Web Services Control Catalog API reference. This guide is for developers who need detailed
 * information about how to programmatically identify and filter the common controls and related metadata that are
 * available to Amazon Web Services customers. This API reference provides descriptions, syntax, and usage examples for
 * each of the actions and data types that are supported by Amazon Web Services Control Catalog.
 * </p>
 * <p>
 * Use the following links to get started with the Amazon Web Services Control Catalog API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_Operations.html">Actions</a>: An
 * alphabetical list of all Control Catalog API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/API_Types.html">Data types</a>: An
 * alphabetical list of all Control Catalog data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/CommonParameters.html">Common parameters</a>:
 * Parameters that all operations can use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controlcatalog/latest/APIReference/CommonErrors.html">Common errors</a>: Client
 * and server errors that all operations can return.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSControlCatalog {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "controlcatalog";

    /**
     * <p>
     * Returns a paginated list of common controls from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * You can apply an optional filter to see common controls that have a specific objective. If you don’t provide a
     * filter, the operation returns all common controls.
     * </p>
     * 
     * @param listCommonControlsRequest
     * @return Result of the ListCommonControls operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlCatalog.ListCommonControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListCommonControls"
     *      target="_top">AWS API Documentation</a>
     */
    ListCommonControlsResult listCommonControls(ListCommonControlsRequest listCommonControlsRequest);

    /**
     * <p>
     * Returns a paginated list of domains from the Amazon Web Services Control Catalog.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlCatalog.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns a paginated list of objectives from the Amazon Web Services Control Catalog.
     * </p>
     * <p>
     * You can apply an optional filter to see the objectives that belong to a specific domain. If you don’t provide a
     * filter, the operation returns all objectives.
     * </p>
     * 
     * @param listObjectivesRequest
     * @return Result of the ListObjectives operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlCatalog.ListObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListObjectives" target="_top">AWS
     *      API Documentation</a>
     */
    ListObjectivesResult listObjectives(ListObjectivesRequest listObjectivesRequest);

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
