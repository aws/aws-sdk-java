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

import com.amazonaws.services.marketplaceentitlement.model.*;

/**
 * Interface for accessing AWS Marketplace Entitlement Service asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplaceentitlement.AbstractAWSMarketplaceEntitlementAsync} instead.
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
public interface AWSMarketplaceEntitlementAsync extends AWSMarketplaceEntitlement {

    /**
     * <p>
     * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
     * identifier or product dimensions.
     * </p>
     * 
     * @param getEntitlementsRequest
     *        The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
     * @return A Java Future containing the result of the GetEntitlements operation returned by the service.
     * @sample AWSMarketplaceEntitlementAsync.GetEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/GetEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(GetEntitlementsRequest getEntitlementsRequest);

    /**
     * <p>
     * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer
     * identifier or product dimensions.
     * </p>
     * 
     * @param getEntitlementsRequest
     *        The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEntitlements operation returned by the service.
     * @sample AWSMarketplaceEntitlementAsyncHandler.GetEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/GetEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(GetEntitlementsRequest getEntitlementsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEntitlementsRequest, GetEntitlementsResult> asyncHandler);

}
