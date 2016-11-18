/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacemetering;

import com.amazonaws.services.marketplacemetering.model.*;

/**
 * Interface for accessing AWSMarketplace Metering asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacemetering.AbstractAWSMarketplaceMeteringAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Marketplace Metering Service</fullname>
 * <p>
 * This reference provides descriptions of the low-level AWS Marketplace Metering Service API.
 * </p>
 * <p>
 * AWS Marketplace sellers can use this API to submit usage data for custom usage dimensions.
 * </p>
 * <p>
 * <b>Submitting Metering Records</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product. MeterUsage is called from an EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchMeterUsage</i>- Submits the metering record for a set of customers. BatchMeterUsage is called from a
 * software-as-a-service (SaaS) application.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Accepting New Customers</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ResolveCustomer</i>- Called by a SaaS application during the registration process. When a buyer visits your
 * website during the registration process, the buyer submits a Registration Token through the browser. The Registration
 * Token is resolved through this API to obtain a CustomerIdentifier and Product Code.
 * </p>
 * </li>
 * </ul>
 */
public interface AWSMarketplaceMeteringAsync extends AWSMarketplaceMetering {

    /**
     * <p>
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a
     * set of customers.
     * </p>
     * <p>
     * For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the
     * input records.
     * </p>
     * <p>
     * Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must
     * make multiple calls to BatchMeterUsage.
     * </p>
     * <p>
     * BatchMeterUsage can process up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param batchMeterUsageRequest
     *        A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your
     *        application.
     * @return A Java Future containing the result of the BatchMeterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsync.BatchMeterUsage
     */
    java.util.concurrent.Future<BatchMeterUsageResult> batchMeterUsageAsync(BatchMeterUsageRequest batchMeterUsageRequest);

    /**
     * <p>
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a
     * set of customers.
     * </p>
     * <p>
     * For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the
     * input records.
     * </p>
     * <p>
     * Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must
     * make multiple calls to BatchMeterUsage.
     * </p>
     * <p>
     * BatchMeterUsage can process up to 25 UsageRecords at a time.
     * </p>
     * 
     * @param batchMeterUsageRequest
     *        A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your
     *        application.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchMeterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsyncHandler.BatchMeterUsage
     */
    java.util.concurrent.Future<BatchMeterUsageResult> batchMeterUsageAsync(BatchMeterUsageRequest batchMeterUsageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchMeterUsageRequest, BatchMeterUsageResult> asyncHandler);

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
     * record ID.
     * </p>
     * <p>
     * MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS
     * Marketplace.
     * </p>
     * 
     * @param meterUsageRequest
     * @return A Java Future containing the result of the MeterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsync.MeterUsage
     */
    java.util.concurrent.Future<MeterUsageResult> meterUsageAsync(MeterUsageRequest meterUsageRequest);

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
     * record ID.
     * </p>
     * <p>
     * MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS
     * Marketplace.
     * </p>
     * 
     * @param meterUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MeterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsyncHandler.MeterUsage
     */
    java.util.concurrent.Future<MeterUsageResult> meterUsageAsync(MeterUsageRequest meterUsageRequest,
            com.amazonaws.handlers.AsyncHandler<MeterUsageRequest, MeterUsageResult> asyncHandler);

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
     * during the registration process, the buyer submits a registration token through their browser. The registration
     * token is resolved through this API to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest
     *        Contains input to the ResolveCustomer operation.
     * @return A Java Future containing the result of the ResolveCustomer operation returned by the service.
     * @sample AWSMarketplaceMeteringAsync.ResolveCustomer
     */
    java.util.concurrent.Future<ResolveCustomerResult> resolveCustomerAsync(ResolveCustomerRequest resolveCustomerRequest);

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
     * during the registration process, the buyer submits a registration token through their browser. The registration
     * token is resolved through this API to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest
     *        Contains input to the ResolveCustomer operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveCustomer operation returned by the service.
     * @sample AWSMarketplaceMeteringAsyncHandler.ResolveCustomer
     */
    java.util.concurrent.Future<ResolveCustomerResult> resolveCustomerAsync(ResolveCustomerRequest resolveCustomerRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveCustomerRequest, ResolveCustomerResult> asyncHandler);

}
