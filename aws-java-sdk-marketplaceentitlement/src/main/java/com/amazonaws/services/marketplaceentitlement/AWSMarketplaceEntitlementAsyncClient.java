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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Marketplace Entitlement Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceEntitlementAsyncClient extends AWSMarketplaceEntitlementClient implements AWSMarketplaceEntitlementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMarketplaceEntitlementAsyncClientBuilder asyncBuilder() {
        return AWSMarketplaceEntitlementAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Marketplace Entitlement Service using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceEntitlementAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(GetEntitlementsRequest request) {

        return getEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEntitlementsResult> getEntitlementsAsync(final GetEntitlementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEntitlementsRequest, GetEntitlementsResult> asyncHandler) {
        final GetEntitlementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEntitlementsResult>() {
            @Override
            public GetEntitlementsResult call() throws Exception {
                GetEntitlementsResult result = null;

                try {
                    result = executeGetEntitlements(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
