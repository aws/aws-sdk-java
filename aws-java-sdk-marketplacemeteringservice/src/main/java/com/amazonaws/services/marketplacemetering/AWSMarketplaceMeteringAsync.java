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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/BatchMeterUsage"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/MeterUsage" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/MeterUsage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<MeterUsageResult> meterUsageAsync(MeterUsageRequest meterUsageRequest,
            com.amazonaws.handlers.AsyncHandler<MeterUsageRequest, MeterUsageResult> asyncHandler);

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
     * @return A Java Future containing the result of the RegisterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsync.RegisterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterUsageResult> registerUsageAsync(RegisterUsageRequest registerUsageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterUsage operation returned by the service.
     * @sample AWSMarketplaceMeteringAsyncHandler.RegisterUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/RegisterUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterUsageResult> registerUsageAsync(RegisterUsageRequest registerUsageRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterUsageRequest, RegisterUsageResult> asyncHandler);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/ResolveCustomer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResolveCustomerResult> resolveCustomerAsync(ResolveCustomerRequest resolveCustomerRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveCustomerRequest, ResolveCustomerResult> asyncHandler);

}
