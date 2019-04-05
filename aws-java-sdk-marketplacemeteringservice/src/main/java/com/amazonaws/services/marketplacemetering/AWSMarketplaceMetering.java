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
package com.amazonaws.services.marketplacemetering;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.marketplacemetering.model.*;

/**
 * Interface for accessing AWSMarketplace Metering.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.marketplacemetering.AbstractAWSMarketplaceMetering} instead.
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
 * <p>
 * <b>Entitlement and Metering for Paid Container Products</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
 * Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
 * containers running outside of Amazon Elastic Container Service (Amazon ECR) isn't supported. Free and BYOL products
 * for ECS aren't required to call RegisterUsage, but you can do so if you want to receive usage data in your seller
 * reports. For more information on using the RegisterUsage operation, see <a
 * href="https://docs.aws.amazon.com/marketplace/latest/userguide/container-based-products.html">Container-Based
 * Products</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * BatchMeterUsage API calls are captured by AWS CloudTrail. You can use Cloudtrail to verify that the SaaS metering
 * records that you sent are accurate by searching for records with the eventName of BatchMeterUsage. You can also use
 * CloudTrail to audit records over time. For more information, see the <i> <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html">AWS CloudTrail User
 * Guide</a> </i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "metering.marketplace.us-east-1.amazonaws.com") or a full URL, including the protocol
     *        (ex: "https://metering.marketplace.us-east-1.amazonaws.com") of the region specific AWS endpoint this
     *        client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the BatchMeterUsage operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidUsageDimensionException
     *         The usage dimension does not match one of the UsageDimensions associated with products.
     * @throws InvalidCustomerIdentifierException
     *         You have metered usage for a CustomerIdentifier that does not exist.
     * @throws TimestampOutOfBoundsException
     *         The timestamp value passed in the meterUsage() is out of allowed range.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.BatchMeterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    BatchMeterUsageResult batchMeterUsage(BatchMeterUsageRequest batchMeterUsageRequest);

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
     * @return Result of the MeterUsage operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidUsageDimensionException
     *         The usage dimension does not match one of the UsageDimensions associated with products.
     * @throws InvalidEndpointRegionException
     *         The endpoint being called is in a Region different from your EC2 instance. The Region of the Metering
     *         Service endpoint and the Region of the EC2 instance must match.
     * @throws TimestampOutOfBoundsException
     *         The timestamp value passed in the meterUsage() is out of allowed range.
     * @throws DuplicateRequestException
     *         A metering record has already been emitted by the same EC2 instance for the given {usageDimension,
     *         timestamp} with a different usageQuantity.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @sample AWSMarketplaceMetering.MeterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/MeterUsage" target="_top">AWS
     *      API Documentation</a>
     */
    MeterUsageResult meterUsage(MeterUsageRequest meterUsageRequest);

    /**
     * <p>
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering
     * Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from
     * containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to
     * call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports.
     * The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering
     * and entitlement.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Entitlement</i>: RegisterUsage allows you to verify that the customer running your paid software is subscribed
     * to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that
     * integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a
     * CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to
     * RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a
     * CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Metering</i>: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A
     * minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS
     * cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster
     * nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by
     * the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific
     * actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace
     * Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers
     * subscription state, removing the need for your software to perform entitlement checks at runtime.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerUsageRequest
     * @return Result of the RegisterUsage operation returned by the service.
     * @throws InvalidProductCodeException
     *         The product code passed does not match the product code used for publishing the product.
     * @throws InvalidRegionException
     *         RegisterUsage must be called in the same AWS Region the ECS task was launched in. This prevents a
     *         container from hardcoding a Region (e.g. withRegion(“us-east-1”) when calling RegisterUsage.
     * @throws InvalidPublicKeyVersionException
     *         Public Key version is invalid.
     * @throws PlatformNotSupportedException
     *         AWS Marketplace does not support metering usage from the underlying platform. Currently, only Amazon ECS
     *         is supported.
     * @throws CustomerNotEntitledException
     *         Exception thrown when the customer does not have a valid subscription for the product.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.RegisterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterUsageResult registerUsage(RegisterUsageRequest registerUsageRequest);

    /**
     * <p>
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website
     * during the registration process, the buyer submits a registration token through their browser. The registration
     * token is resolved through this API to obtain a CustomerIdentifier and product code.
     * </p>
     * 
     * @param resolveCustomerRequest
     *        Contains input to the ResolveCustomer operation.
     * @return Result of the ResolveCustomer operation returned by the service.
     * @throws InvalidTokenException
     *         Registration token is invalid.
     * @throws ExpiredTokenException
     *         The submitted registration token has expired. This can happen if the buyer's browser takes too long to
     *         redirect to your page, the buyer has resubmitted the registration token, or your application has held on
     *         to the registration token for too long. Your SaaS registration website should redeem this token as soon
     *         as it is submitted by the buyer's browser.
     * @throws ThrottlingException
     *         The calls to the API are throttled.
     * @throws InternalServiceErrorException
     *         An internal error has occurred. Retry your request. If the problem persists, post a message with details
     *         on the AWS forums.
     * @throws DisabledApiException
     *         The API is disabled in the Region.
     * @sample AWSMarketplaceMetering.ResolveCustomer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
     *      target="_top">AWS API Documentation</a>
     */
    ResolveCustomerResult resolveCustomer(ResolveCustomerRequest resolveCustomerRequest);

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
