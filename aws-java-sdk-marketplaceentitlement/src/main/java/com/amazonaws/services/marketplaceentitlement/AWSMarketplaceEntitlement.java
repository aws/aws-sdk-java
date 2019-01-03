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
package com.amazonaws.services.marketplaceentitlement;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplaceentitlement.model.*;

/**
 * Interface for accessing AWS Marketplace Entitlement Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplaceentitlement.AbstractAWSMarketplaceEntitlement} instead.
 * </p>
 * <p>
 * <fullname>AWS Marketplace Entitlement Service</fullname>
 * <p>
 * This reference provides descriptions of the AWS Marketplace Entitlement Service API.
 * </p>
 * <p>
 * AWS Marketplace Entitlement Service is used to determine the entitlement of a customer to a given product. An
 * entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of
 * users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.
 * </p>
 * <p>
 * <b>Getting Entitlement Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>GetEntitlements</i>- Gets the entitlements for a Marketplace product.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMarketplaceEntitlement {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "entitlement.marketplace";

    /**
     * <p>
     * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
     * identifier or product dimensions.
     * </p>
     * 
     * @param getEntitlementsRequest
     *        The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
     * @return Result of the GetEntitlements operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in your request was invalid.
     * @throws ThrottlingException
     *         The calls to the GetEntitlements API are throttled.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @sample AWSMarketplaceEntitlement.GetEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/GetEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    GetEntitlementsResult getEntitlements(GetEntitlementsRequest getEntitlementsRequest);

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
