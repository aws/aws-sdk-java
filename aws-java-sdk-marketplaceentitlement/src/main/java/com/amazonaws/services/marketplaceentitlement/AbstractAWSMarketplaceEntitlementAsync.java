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
 * Abstract implementation of {@code AWSMarketplaceEntitlementAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMarketplaceEntitlementAsync extends AbstractAWSMarketplaceEntitlement implements AWSMarketplaceEntitlementAsync {

    protected AbstractAWSMarketplaceEntitlementAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(GetEntitlementsRequest request) {

        return getEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(GetEntitlementsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEntitlementsRequest, GetEntitlementsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
