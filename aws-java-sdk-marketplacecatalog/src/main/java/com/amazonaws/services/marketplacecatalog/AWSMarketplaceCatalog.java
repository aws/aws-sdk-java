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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplacecatalog.model.*;

/**
 * Interface for accessing AWS Marketplace Catalog.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacecatalog.AbstractAWSMarketplaceCatalog} instead.
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
public interface AWSMarketplaceCatalog {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "catalog.marketplace";

    /**
     * <p>
     * Used to cancel an open change request. Must be sent before the status of the request changes to
     * <code>APPLYING</code>, the final stage of completing your change request. You can describe a change during the
     * 60-day request history retention period for API calls.
     * </p>
     * 
     * @param cancelChangeSetRequest
     * @return Result of the CancelChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     * @sample AWSMarketplaceCatalog.CancelChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/CancelChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    CancelChangeSetResult cancelChangeSet(CancelChangeSetRequest cancelChangeSetRequest);

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @return Result of the DescribeChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ThrottlingException
     *         Too many requests.
     * @sample AWSMarketplaceCatalog.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest describeChangeSetRequest);

    /**
     * <p>
     * Returns the metadata and content of the entity.
     * </p>
     * 
     * @param describeEntityRequest
     * @return Result of the DescribeEntity operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ResourceNotSupportedException
     *         Currently, the specified resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ThrottlingException
     *         Too many requests.
     * @sample AWSMarketplaceCatalog.DescribeEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntityResult describeEntity(DescribeEntityRequest describeEntityRequest);

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
     * @return Result of the ListChangeSets operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ThrottlingException
     *         Too many requests.
     * @sample AWSMarketplaceCatalog.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListChangeSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListChangeSetsResult listChangeSets(ListChangeSetsRequest listChangeSetsRequest);

    /**
     * <p>
     * Provides the list of entities of a given type.
     * </p>
     * 
     * @param listEntitiesRequest
     * @return Result of the ListEntities operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ThrottlingException
     *         Too many requests.
     * @sample AWSMarketplaceCatalog.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities"
     *      target="_top">AWS API Documentation</a>
     */
    ListEntitiesResult listEntities(ListEntitiesRequest listEntitiesRequest);

    /**
     * <p>
     * This operation allows you to request changes in your entities.
     * </p>
     * 
     * @param startChangeSetRequest
     * @return Result of the StartChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.
     * @throws AccessDeniedException
     *         Access is denied.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     * @throws ServiceQuotaExceededException
     *         The maximum number of open requests per account has been exceeded.
     * @sample AWSMarketplaceCatalog.StartChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    StartChangeSetResult startChangeSet(StartChangeSetRequest startChangeSetRequest);

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
