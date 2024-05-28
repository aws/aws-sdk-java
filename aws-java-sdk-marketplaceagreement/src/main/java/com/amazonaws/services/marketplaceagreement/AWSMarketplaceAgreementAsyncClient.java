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
package com.amazonaws.services.marketplaceagreement;

import javax.annotation.Generated;

import com.amazonaws.services.marketplaceagreement.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Agreement Service asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Marketplace is a curated digital catalog that customers can use to find, buy, deploy, and manage third-party
 * software, data, and services to build solutions and run their businesses. The AWS Marketplace Agreement Service
 * provides an API interface that helps AWS Marketplace sellers manage their product-related agreements, including
 * listing, searching, and filtering agreements.
 * </p>
 * <p>
 * To manage agreements in AWS Marketplace, you must ensure that your AWS Identity and Access Management (IAM) policies
 * and roles are set up. The user must have the required policies/permissions that allow them to carry out the actions
 * in AWS:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>DescribeAgreement</code> – Grants permission to users to obtain detailed meta data about any of their
 * agreements.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetAgreementTerms</code> – Grants permission to users to obtain details about the terms of an agreement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SearchAgreements</code> – Grants permission to users to search through all their agreements.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMarketplaceAgreementAsyncClient extends AWSMarketplaceAgreementClient implements AWSMarketplaceAgreementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMarketplaceAgreementAsyncClientBuilder asyncBuilder() {
        return AWSMarketplaceAgreementAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Agreement Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMarketplaceAgreementAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Agreement Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMarketplaceAgreementAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(DescribeAgreementRequest request) {

        return describeAgreementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgreementResult> describeAgreementAsync(final DescribeAgreementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgreementRequest, DescribeAgreementResult> asyncHandler) {
        final DescribeAgreementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgreementResult>() {
            @Override
            public DescribeAgreementResult call() throws Exception {
                DescribeAgreementResult result = null;

                try {
                    result = executeDescribeAgreement(finalRequest);
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

    @Override
    public java.util.concurrent.Future<GetAgreementTermsResult> getAgreementTermsAsync(GetAgreementTermsRequest request) {

        return getAgreementTermsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAgreementTermsResult> getAgreementTermsAsync(final GetAgreementTermsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAgreementTermsRequest, GetAgreementTermsResult> asyncHandler) {
        final GetAgreementTermsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAgreementTermsResult>() {
            @Override
            public GetAgreementTermsResult call() throws Exception {
                GetAgreementTermsResult result = null;

                try {
                    result = executeGetAgreementTerms(finalRequest);
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

    @Override
    public java.util.concurrent.Future<SearchAgreementsResult> searchAgreementsAsync(SearchAgreementsRequest request) {

        return searchAgreementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAgreementsResult> searchAgreementsAsync(final SearchAgreementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAgreementsRequest, SearchAgreementsResult> asyncHandler) {
        final SearchAgreementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAgreementsResult>() {
            @Override
            public SearchAgreementsResult call() throws Exception {
                SearchAgreementsResult result = null;

                try {
                    result = executeSearchAgreements(finalRequest);
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
