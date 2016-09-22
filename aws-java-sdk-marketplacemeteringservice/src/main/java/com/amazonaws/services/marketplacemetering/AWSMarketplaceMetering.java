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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplacemetering.model.*;

/**
 * Interface for accessing AWSMarketplace Metering.
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
public interface AWSMarketplaceMetering {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "metering.marketplace";

    /**
     * Overrides the default endpoint for this client ("https://metering.marketplace.us-east-1.amazonaws.com"). Callers
     * can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "metering.marketplace.us-east-1.amazonaws.com") or a full URL,
     * including the protocol (ex: "https://metering.marketplace.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's {@link ClientConfiguration} will be used, which by
     * default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "metering.marketplace.us-east-1.amazonaws.com") or a full URL, including the protocol
     *        (ex: "https://metering.marketplace.us-east-1.amazonaws.com") of the region specific AWS endpoint this
     *        client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSMarketplaceMetering#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering
     * record ID.
     * </p>
     * 
     * @param meterUsageRequest
     * @return Result of the MeterUsage operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidUsageDimensionException
     *         The usage dimension does not match one of the UsageDimensions associated with products.
     * @throws InvalidEndpointRegionException
     *         The endpoint being called is in a region different from your EC2 instance. The region of the Metering
     *         service endpoint and the region of the EC2 instance must match.
     * @throws TimestampOutOfBoundsException
     *         The timestamp value passed in the meterUsage() is out of allowed range.
     * @throws DuplicateRequestException
     *         A metering record has already been emitted by the same EC2 instance for the given {usageDimension,
     *         timestamp} with a different usageQuantity.
     * @throws ThrottlingException
     *         The calls to the MeterUsage API are throttled.
     * @sample AWSMarketplaceMetering.MeterUsage
     */
    MeterUsageResult meterUsage(MeterUsageRequest meterUsageRequest);

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
