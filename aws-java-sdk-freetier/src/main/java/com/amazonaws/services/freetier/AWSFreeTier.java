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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.freetier.model.*;

/**
 * Interface for accessing AWS Free Tier.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.freetier.AbstractAWSFreeTier} instead.
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
public interface AWSFreeTier {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "freetier";

    /**
     * <p>
     * Returns a list of all Free Tier usage objects that match your filters.
     * </p>
     * 
     * @param getFreeTierUsageRequest
     * @return Result of the GetFreeTierUsage operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during the processing of your request.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSFreeTier.GetFreeTierUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/GetFreeTierUsage" target="_top">AWS API
     *      Documentation</a>
     */
    GetFreeTierUsageResult getFreeTierUsage(GetFreeTierUsageRequest getFreeTierUsageRequest);

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
