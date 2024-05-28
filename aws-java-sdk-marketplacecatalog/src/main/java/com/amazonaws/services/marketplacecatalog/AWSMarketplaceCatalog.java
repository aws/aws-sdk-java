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
 * Catalog API actions allow you to manage your entities through list, describe, and update capabilities. An entity can
 * be a product or an offer on AWS Marketplace.
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
     * Returns metadata and content for multiple entities. This is the Batch version of the <code>DescribeEntity</code>
     * API and uses the same IAM permission action as <code>DescribeEntity</code> API.
     * </p>
     * 
     * @param batchDescribeEntitiesRequest
     * @return Result of the BatchDescribeEntities operation returned by the service.
     * @throws AccessDeniedException
     *         Access is denied.</p>
     *         <p>
     *         HTTP status code: 403
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @sample AWSMarketplaceCatalog.BatchDescribeEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/BatchDescribeEntities"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDescribeEntitiesResult batchDescribeEntities(BatchDescribeEntitiesRequest batchDescribeEntitiesRequest);

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
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.CancelChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/CancelChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    CancelChangeSetResult cancelChangeSet(CancelChangeSetRequest cancelChangeSetRequest);

    /**
     * <p>
     * Deletes a resource-based policy on an entity that is identified by its resource ARN.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Provides information about a given change set.
     * </p>
     * 
     * @param describeChangeSetRequest
     * @return Result of the DescribeChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
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
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotSupportedException
     *         Currently, the specified resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.DescribeEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntityResult describeEntity(DescribeEntityRequest describeEntityRequest);

    /**
     * <p>
     * Gets a resource-based policy of an entity that is identified by its resource ARN.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

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
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
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
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.ListEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListEntities"
     *      target="_top">AWS API Documentation</a>
     */
    ListEntitiesResult listEntities(ListEntitiesRequest listEntitiesRequest);

    /**
     * <p>
     * Lists all tags that have been added to a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Attaches a resource-based policy to an entity. Examples of an entity include: <code>AmiProduct</code> and
     * <code>ContainerProduct</code>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Allows you to request changes for your entities. Within a single <code>ChangeSet</code>, you can't start the same
     * change type against the same entity multiple times. Additionally, when a <code>ChangeSet</code> is running, all
     * the entities targeted by the different changes are locked until the change set has completed (either succeeded,
     * cancelled, or failed). If you try to start a change set containing a change against an entity that is already
     * locked, you will receive a <code>ResourceInUseException</code> error.
     * </p>
     * <p>
     * For example, you can't start the <code>ChangeSet</code> described in the <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/API_StartChangeSet.html#API_StartChangeSet_Examples"
     * >example</a> later in this topic because it contains two changes to run the same change type (
     * <code>AddRevisions</code>) against the same entity (<code>entity-id@1</code>).
     * </p>
     * <p>
     * For more information about working with change sets, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets">
     * Working with change sets</a>. For information about change types for single-AMI products, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/ami-products.html#working-with-single-AMI-products"
     * >Working with single-AMI products</a>. Also, for more information about change types available for
     * container-based products, see <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/container-products.html#working-with-container-products"
     * >Working with container products</a>.
     * </p>
     * 
     * @param startChangeSetRequest
     * @return Result of the StartChangeSet operation returned by the service.
     * @throws InternalServiceException
     *         There was an internal service exception.</p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     *         </p>
     *         <p>
     *         HTTP status code: 404
     * @throws ResourceInUseException
     *         The resource is currently in use.
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @throws ServiceQuotaExceededException
     *         The maximum number of open requests per account has been exceeded.
     * @sample AWSMarketplaceCatalog.StartChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/StartChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    StartChangeSetResult startChangeSet(StartChangeSetRequest startChangeSetRequest);

    /**
     * <p>
     * Tags a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or list of tags from a resource (either an <a
     * href="https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#catalog-api-entities"
     * >entity</a> or <a href=
     * "https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html#working-with-change-sets"
     * >change set</a>).
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.</p>
     *         <p>
     *         HTTP status code: 404
     * @throws InternalServiceException
     *         There was an internal service exception.
     *         </p>
     *         <p>
     *         HTTP status code: 500
     * @throws AccessDeniedException
     *         Access is denied.
     *         </p>
     *         <p>
     *         HTTP status code: 403
     * @throws ValidationException
     *         An error occurred during validation.
     *         </p>
     *         <p>
     *         HTTP status code: 422
     * @throws ThrottlingException
     *         Too many requests.
     *         </p>
     *         <p>
     *         HTTP status code: 429
     * @sample AWSMarketplaceCatalog.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
