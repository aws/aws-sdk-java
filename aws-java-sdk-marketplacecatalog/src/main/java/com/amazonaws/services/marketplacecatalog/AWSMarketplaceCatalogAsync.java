/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;

/**
 * Interface for accessing AWS Marketplace Catalog asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacecatalog.AbstractAWSMarketplaceCatalogAsync} instead.
 * </p>
 * <p>
 * <p>
 * Catalog API actions allow you to create, describe, list, and delete changes to your published entities. An entity is
 * a product or an offer on AWS Marketplace.
 * </p>
 * <p>
 * You can automate your entity update process by integrating the AWS Marketplace Catalog API with your AWS Marketplace
 * product build or deployment pipelines. You can also create your own applications on top of the Catalog API to manage
 * your products on AWS Marketplace.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMarketplaceCatalogAsync extends AWSMarketplaceCatalog {

    /**
     * <p>
     * Used to cancel an open change request. Must be sent before the status of the request changes to
     * <code>APPLYING</code>, the final stage of completing your change request. You can describe a change during the
     * 60-day request history retention period for API calls.
     * </p>
     * 
     * @param cancelChangeSetRequest
     * @return A Java Future containing the result of the CancelChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.CancelChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/CancelChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(CancelChangeSetRequest cancelChangeSetRequest);

    /**
     * <p>
     * Used to cancel an open change request. Must be sent before the status of the request changes to
     * <code>APPLYING</code>, the final stage of completing your change request. You can describe a change during the
     * 60-day request history retention period for API calls.
     * </p>
     * 
     * @param cancelChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.CancelChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/CancelChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelChangeSetResult> cancelChangeSetAsync(CancelChangeSetRequest cancelChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<CancelChangeSetRequest, CancelChangeSetResult> asyncHandler);

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @return A Java Future containing the result of the DescribeChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest describeChangeSetRequest);

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(DescribeChangeSetRequest describeChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns the metadata and content of the entity.
     * </p>
     * 
     * @param describeEntityRequest
     * @return A Java Future containing the result of the DescribeEntity operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.DescribeEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(DescribeEntityRequest describeEntityRequest);

    /**
     * <p>
     * Returns the metadata and content of the entity.
     * </p>
     * 
     * @param describeEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEntity operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.DescribeEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntityResult> describeEntityAsync(DescribeEntityRequest describeEntityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEntityRequest, DescribeEntityResult> asyncHandler);

    /**
     * <p>
     * Returns the list of change sets owned by the account being used to make the call. You can filter this list by
     * providing any combination of <code>entityId</code>, <code>ChangeSetName</code>, and status. If you provide more
     * than one filter, the API operation applies a logical AND between the filters.
     * </p>
     * <p>
     * You can describe a change during the 60-day request history retention period for API calls.
     * </p>
     * 
     * @param listChangeSetsRequest
     * @return A Java Future containing the result of the ListChangeSets operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest listChangeSetsRequest);

    /**
     * <p>
     * Returns the list of change sets owned by the account being used to make the call. You can filter this list by
     * providing any combination of <code>entityId</code>, <code>ChangeSetName</code>, and status. If you provide more
     * than one filter, the API operation applies a logical AND between the filters.
     * </p>
     * <p>
     * You can describe a change during the 60-day request history retention period for API calls.
     * </p>
     * 
     * @param listChangeSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangeSets operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(ListChangeSetsRequest listChangeSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler);

    /**
     * <p>
     * Provides the list of entities of a given type.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return A Java Future containing the result of the ListEntities operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest listEntitiesRequest);

    /**
     * <p>
     * Provides the list of entities of a given type.
     * </p>
     * 
     * @param listEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntities operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitiesResult> listEntitiesAsync(ListEntitiesRequest listEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesRequest, ListEntitiesResult> asyncHandler);

    /**
     * <p>
     * This operation allows you to request changes in your entities.
     * </p>
     * 
     * @param startChangeSetRequest
     * @return A Java Future containing the result of the StartChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsync.StartChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(StartChangeSetRequest startChangeSetRequest);

    /**
     * <p>
     * This operation allows you to request changes in your entities.
     * </p>
     * 
     * @param startChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChangeSet operation returned by the service.
     * @sample AWSMarketplaceCatalogAsyncHandler.StartChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartChangeSetResult> startChangeSetAsync(StartChangeSetRequest startChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<StartChangeSetRequest, StartChangeSetResult> asyncHandler);

}
