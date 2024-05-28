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

import com.amazonaws.services.controlcatalog.model.*;

/**
 * Interface for accessing AWS Control Catalog asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.controlcatalog.AbstractAWSControlCatalogAsync} instead.
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
public interface AWSControlCatalogAsync extends AWSControlCatalog {

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
     * @return A Java Future containing the result of the ListCommonControls operation returned by the service.
     * @sample AWSControlCatalogAsync.ListCommonControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListCommonControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCommonControlsResult> listCommonControlsAsync(ListCommonControlsRequest listCommonControlsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCommonControls operation returned by the service.
     * @sample AWSControlCatalogAsyncHandler.ListCommonControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListCommonControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCommonControlsResult> listCommonControlsAsync(ListCommonControlsRequest listCommonControlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCommonControlsRequest, ListCommonControlsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of domains from the Amazon Web Services Control Catalog.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AWSControlCatalogAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns a paginated list of domains from the Amazon Web Services Control Catalog.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AWSControlCatalogAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListObjectives operation returned by the service.
     * @sample AWSControlCatalogAsync.ListObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListObjectives" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectivesResult> listObjectivesAsync(ListObjectivesRequest listObjectivesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectives operation returned by the service.
     * @sample AWSControlCatalogAsyncHandler.ListObjectives
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controlcatalog-2018-05-10/ListObjectives" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectivesResult> listObjectivesAsync(ListObjectivesRequest listObjectivesRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectivesRequest, ListObjectivesResult> asyncHandler);

}
