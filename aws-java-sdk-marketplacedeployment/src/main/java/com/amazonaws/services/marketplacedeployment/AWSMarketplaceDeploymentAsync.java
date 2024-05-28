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

import com.amazonaws.services.marketplacedeployment.model.*;

/**
 * Interface for accessing AWS Marketplace Deployment Service asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacedeployment.AbstractAWSMarketplaceDeploymentAsync} instead.
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
public interface AWSMarketplaceDeploymentAsync extends AWSMarketplaceDeployment {

    /**
     * <p>
     * Lists all tags that have been added to a deployment parameter resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags that have been added to a deployment parameter resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a deployment parameter and is targeted by <code>catalog</code> and <code>agreementId</code>.
     * </p>
     * 
     * @param putDeploymentParameterRequest
     * @return A Java Future containing the result of the PutDeploymentParameter operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsync.PutDeploymentParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/PutDeploymentParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDeploymentParameterResult> putDeploymentParameterAsync(PutDeploymentParameterRequest putDeploymentParameterRequest);

    /**
     * <p>
     * Creates or updates a deployment parameter and is targeted by <code>catalog</code> and <code>agreementId</code>.
     * </p>
     * 
     * @param putDeploymentParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDeploymentParameter operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsyncHandler.PutDeploymentParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/PutDeploymentParameter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDeploymentParameterResult> putDeploymentParameterAsync(PutDeploymentParameterRequest putDeploymentParameterRequest,
            com.amazonaws.handlers.AsyncHandler<PutDeploymentParameterRequest, PutDeploymentParameterResult> asyncHandler);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMarketplaceDeploymentAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-deployment-2023-01-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
