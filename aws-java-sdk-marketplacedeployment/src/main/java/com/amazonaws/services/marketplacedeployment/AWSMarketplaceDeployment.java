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
package com.amazonaws.services.marketplacedeployment;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplacedeployment.model.*;

/**
 * Interface for accessing AWS Marketplace Deployment Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacedeployment.AbstractAWSMarketplaceDeployment} instead.
 * </p>
 * <p>
 * <p>
 * The AWS Marketplace Deployment Service supports the Quick Launch experience, which is a deployment option for
 * software as a service (SaaS) products. Quick Launch simplifies and reduces the time, resources, and steps required to
 * configure, deploy, and launch a products. The AWS Marketplace Deployment Service provides sellers with a secure
 * method for passing deployment parameters (for example, API keys and external IDs) to buyers during the Quick Launch
 * experience.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMarketplaceDeployment {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "deployment-marketplace";

    /**
     * <p>
     * Lists all tags that have been added to a deployment parameter resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         Too many requests.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws InternalServerException
     *         There was an internal service exception.
     * @sample AWSMarketplaceDeployment.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or updates a deployment parameter and is targeted by <code>catalog</code> and <code>agreementId</code>.
     * </p>
     * 
     * @param putDeploymentParameterRequest
     * @return Result of the PutDeploymentParameter operation returned by the service.
     * @throws ThrottlingException
     *         Too many requests.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ServiceQuotaExceededException
     *         The maximum number of requests per account has been exceeded.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws InternalServerException
     *         There was an internal service exception.
     * @sample AWSMarketplaceDeployment.PutDeploymentParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/PutDeploymentParameter"
     *      target="_top">AWS API Documentation</a>
     */
    PutDeploymentParameterResult putDeploymentParameter(PutDeploymentParameterRequest putDeploymentParameterRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         Too many requests.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws InternalServerException
     *         There was an internal service exception.
     * @sample AWSMarketplaceDeployment.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         Too many requests.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource wasn't found.
     * @throws ConflictException
     *         The request configuration has conflicts. For details, see the accompanying error message.
     * @throws ValidationException
     *         An error occurred during validation.
     * @throws InternalServerException
     *         There was an internal service exception.
     * @sample AWSMarketplaceDeployment.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/UntagResource"
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
