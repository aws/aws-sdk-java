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
package com.amazonaws.services.pricing;

import javax.annotation.Generated;

import com.amazonaws.services.pricing.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Pricing asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Price List Service API (AWS Price List Service) is a centralized and convenient way to programmatically query
 * Amazon Web Services for services, products, and pricing information. The AWS Price List Service uses standardized
 * product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and
 * provides prices at the SKU level. You can use the AWS Price List Service to build cost control and scenario planning
 * tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that
 * compare your internal workloads with AWS.
 * </p>
 * <p>
 * Use <code>GetServices</code> without a service code to retrieve the service codes for all AWS services, then
 * <code>GetServices</code> with a service code to retreive the attribute names for that service. After you have the
 * service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an
 * attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find
 * specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a
 * <code>Provisioned IOPS</code> <code>volumeType</code>.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * AWS Price List Service API provides the following two endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://api.pricing.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * https://api.pricing.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPricingAsyncClient extends AWSPricingClient implements AWSPricingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPricingAsyncClientBuilder asyncBuilder() {
        return AWSPricingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Pricing using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPricingAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(final DescribeServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {
        final DescribeServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeServicesResult>() {
            @Override
            public DescribeServicesResult call() throws Exception {
                DescribeServicesResult result = null;

                try {
                    result = executeDescribeServices(finalRequest);
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
    public java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(GetAttributeValuesRequest request) {

        return getAttributeValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(final GetAttributeValuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttributeValuesRequest, GetAttributeValuesResult> asyncHandler) {
        final GetAttributeValuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAttributeValuesResult>() {
            @Override
            public GetAttributeValuesResult call() throws Exception {
                GetAttributeValuesResult result = null;

                try {
                    result = executeGetAttributeValues(finalRequest);
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
    public java.util.concurrent.Future<GetProductsResult> getProductsAsync(GetProductsRequest request) {

        return getProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProductsResult> getProductsAsync(final GetProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProductsRequest, GetProductsResult> asyncHandler) {
        final GetProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProductsResult>() {
            @Override
            public GetProductsResult call() throws Exception {
                GetProductsResult result = null;

                try {
                    result = executeGetProducts(finalRequest);
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
