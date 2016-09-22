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
 * <i>MeterUsage</i>- Submits the metering record for a Marketplace product.
 * </p>
 * </li>
 * </ul>
 */
public interface AWSMarketplaceMeteringAsync extends AWSMarketplaceMetering {

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
     * record ID.
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

}
