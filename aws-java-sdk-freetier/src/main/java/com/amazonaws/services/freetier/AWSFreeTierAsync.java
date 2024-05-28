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
package com.amazonaws.services.freetier;

import javax.annotation.Generated;

import com.amazonaws.services.freetier.model.*;

/**
 * Interface for accessing AWS Free Tier asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.freetier.AbstractAWSFreeTierAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Amazon Web Services Free Tier API to query programmatically your Free Tier usage data.
 * </p>
 * <p>
 * Free Tier tracks your monthly usage data for all free tier offers that are associated with your Amazon Web Services
 * account. You can use the Free Tier API to filter and show only the data that you want.
 * </p>
 * <p>
 * Service endpoint
 * </p>
 * <p>
 * The Free Tier API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://freetier.us-east-1.api.aws
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-free-tier.html">Using the Amazon Web
 * Services Free Tier</a> in the <i>Billing User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFreeTierAsync extends AWSFreeTier {

    /**
     * <p>
     * Returns a list of all Free Tier usage objects that match your filters.
     * </p>
     * 
     * @param getFreeTierUsageRequest
     * @return A Java Future containing the result of the GetFreeTierUsage operation returned by the service.
     * @sample AWSFreeTierAsync.GetFreeTierUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/GetFreeTierUsage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFreeTierUsageResult> getFreeTierUsageAsync(GetFreeTierUsageRequest getFreeTierUsageRequest);

    /**
     * <p>
     * Returns a list of all Free Tier usage objects that match your filters.
     * </p>
     * 
     * @param getFreeTierUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFreeTierUsage operation returned by the service.
     * @sample AWSFreeTierAsyncHandler.GetFreeTierUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/GetFreeTierUsage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFreeTierUsageResult> getFreeTierUsageAsync(GetFreeTierUsageRequest getFreeTierUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetFreeTierUsageRequest, GetFreeTierUsageResult> asyncHandler);

}
