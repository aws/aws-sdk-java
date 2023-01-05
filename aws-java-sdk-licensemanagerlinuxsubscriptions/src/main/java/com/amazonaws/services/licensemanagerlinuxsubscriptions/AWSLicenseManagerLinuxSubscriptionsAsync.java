/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanagerlinuxsubscriptions;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerlinuxsubscriptions.model.*;

/**
 * Interface for accessing AWS License Manager Linux Subscriptions asynchronously. Each asynchronous method will return
 * a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.licensemanagerlinuxsubscriptions.AbstractAWSLicenseManagerLinuxSubscriptionsAsync}
 * instead.
 * </p>
 * <p>
 * <p>
 * With License Manager, you can discover and track your commercial Linux subscriptions on running Amazon EC2 instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLicenseManagerLinuxSubscriptionsAsync extends AWSLicenseManagerLinuxSubscriptions {

    /**
     * <p>
     * Lists the Linux subscriptions service settings.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsync.GetServiceSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest);

    /**
     * <p>
     * Lists the Linux subscriptions service settings.
     * </p>
     * 
     * @param getServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsyncHandler.GetServiceSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/GetServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceSettingsResult> getServiceSettingsAsync(GetServiceSettingsRequest getServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceSettingsRequest, GetServiceSettingsResult> asyncHandler);

    /**
     * <p>
     * Lists the running Amazon EC2 instances that were discovered with commercial Linux subscriptions.
     * </p>
     * 
     * @param listLinuxSubscriptionInstancesRequest
     *        NextToken length limit is half of ddb accepted limit. Increase this limit if parameters in request
     *        increases.
     * @return A Java Future containing the result of the ListLinuxSubscriptionInstances operation returned by the
     *         service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsync.ListLinuxSubscriptionInstances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/ListLinuxSubscriptionInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLinuxSubscriptionInstancesResult> listLinuxSubscriptionInstancesAsync(
            ListLinuxSubscriptionInstancesRequest listLinuxSubscriptionInstancesRequest);

    /**
     * <p>
     * Lists the running Amazon EC2 instances that were discovered with commercial Linux subscriptions.
     * </p>
     * 
     * @param listLinuxSubscriptionInstancesRequest
     *        NextToken length limit is half of ddb accepted limit. Increase this limit if parameters in request
     *        increases.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLinuxSubscriptionInstances operation returned by the
     *         service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsyncHandler.ListLinuxSubscriptionInstances
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/ListLinuxSubscriptionInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLinuxSubscriptionInstancesResult> listLinuxSubscriptionInstancesAsync(
            ListLinuxSubscriptionInstancesRequest listLinuxSubscriptionInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLinuxSubscriptionInstancesRequest, ListLinuxSubscriptionInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the Linux subscriptions that have been discovered. If you have linked your organization, the returned
     * results will include data aggregated across your accounts in Organizations.
     * </p>
     * 
     * @param listLinuxSubscriptionsRequest
     *        NextToken length limit is half of ddb accepted limit. Increase this limit if parameters in request
     *        increases.
     * @return A Java Future containing the result of the ListLinuxSubscriptions operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsync.ListLinuxSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/ListLinuxSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLinuxSubscriptionsResult> listLinuxSubscriptionsAsync(ListLinuxSubscriptionsRequest listLinuxSubscriptionsRequest);

    /**
     * <p>
     * Lists the Linux subscriptions that have been discovered. If you have linked your organization, the returned
     * results will include data aggregated across your accounts in Organizations.
     * </p>
     * 
     * @param listLinuxSubscriptionsRequest
     *        NextToken length limit is half of ddb accepted limit. Increase this limit if parameters in request
     *        increases.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLinuxSubscriptions operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsyncHandler.ListLinuxSubscriptions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/ListLinuxSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLinuxSubscriptionsResult> listLinuxSubscriptionsAsync(ListLinuxSubscriptionsRequest listLinuxSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLinuxSubscriptionsRequest, ListLinuxSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Updates the service settings for Linux subscriptions.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsync.UpdateServiceSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest);

    /**
     * <p>
     * Updates the service settings for Linux subscriptions.
     * </p>
     * 
     * @param updateServiceSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceSettings operation returned by the service.
     * @sample AWSLicenseManagerLinuxSubscriptionsAsyncHandler.UpdateServiceSettings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/UpdateServiceSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceSettingsResult> updateServiceSettingsAsync(UpdateServiceSettingsRequest updateServiceSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceSettingsRequest, UpdateServiceSettingsResult> asyncHandler);

}
