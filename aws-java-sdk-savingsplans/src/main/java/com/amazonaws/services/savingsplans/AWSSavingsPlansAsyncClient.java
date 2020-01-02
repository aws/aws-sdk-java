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
package com.amazonaws.services.savingsplans;

import javax.annotation.Generated;

import com.amazonaws.services.savingsplans.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSSavingsPlans asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Savings Plans are a pricing model that offer significant savings on AWS usage (for example, on Amazon EC2 instances).
 * You commit to a consistent amount of usage, in USD per hour, for a term of 1 or 3 years, and receive a lower price
 * for that usage. For more information, see the <a
 * href="https://docs.aws.amazon.com/savingsplans/latest/userguide/">AWS Savings Plans User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSavingsPlansAsyncClient extends AWSSavingsPlansClient implements AWSSavingsPlansAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSavingsPlansAsyncClientBuilder asyncBuilder() {
        return AWSSavingsPlansAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSSavingsPlans using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSavingsPlansAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(CreateSavingsPlanRequest request) {

        return createSavingsPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(final CreateSavingsPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSavingsPlanRequest, CreateSavingsPlanResult> asyncHandler) {
        final CreateSavingsPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSavingsPlanResult>() {
            @Override
            public CreateSavingsPlanResult call() throws Exception {
                CreateSavingsPlanResult result = null;

                try {
                    result = executeCreateSavingsPlan(finalRequest);
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
    public java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(DescribeSavingsPlanRatesRequest request) {

        return describeSavingsPlanRatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(final DescribeSavingsPlanRatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlanRatesRequest, DescribeSavingsPlanRatesResult> asyncHandler) {
        final DescribeSavingsPlanRatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSavingsPlanRatesResult>() {
            @Override
            public DescribeSavingsPlanRatesResult call() throws Exception {
                DescribeSavingsPlanRatesResult result = null;

                try {
                    result = executeDescribeSavingsPlanRates(finalRequest);
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
    public java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(DescribeSavingsPlansRequest request) {

        return describeSavingsPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(final DescribeSavingsPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansRequest, DescribeSavingsPlansResult> asyncHandler) {
        final DescribeSavingsPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSavingsPlansResult>() {
            @Override
            public DescribeSavingsPlansResult call() throws Exception {
                DescribeSavingsPlansResult result = null;

                try {
                    result = executeDescribeSavingsPlans(finalRequest);
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
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            DescribeSavingsPlansOfferingRatesRequest request) {

        return describeSavingsPlansOfferingRatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            final DescribeSavingsPlansOfferingRatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingRatesRequest, DescribeSavingsPlansOfferingRatesResult> asyncHandler) {
        final DescribeSavingsPlansOfferingRatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSavingsPlansOfferingRatesResult>() {
            @Override
            public DescribeSavingsPlansOfferingRatesResult call() throws Exception {
                DescribeSavingsPlansOfferingRatesResult result = null;

                try {
                    result = executeDescribeSavingsPlansOfferingRates(finalRequest);
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
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(DescribeSavingsPlansOfferingsRequest request) {

        return describeSavingsPlansOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(
            final DescribeSavingsPlansOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingsRequest, DescribeSavingsPlansOfferingsResult> asyncHandler) {
        final DescribeSavingsPlansOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSavingsPlansOfferingsResult>() {
            @Override
            public DescribeSavingsPlansOfferingsResult call() throws Exception {
                DescribeSavingsPlansOfferingsResult result = null;

                try {
                    result = executeDescribeSavingsPlansOfferings(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
