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
package com.amazonaws.services.budgets;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.budgets.model.*;

/**
 * Interface for accessing AWSBudgets.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.budgets.AbstractAWSBudgets} instead.
 * </p>
 * <p>
 * All public APIs for AWS Budgets
 */
public interface AWSBudgets {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "budgets";

    /**
     * Overrides the default endpoint for this client ("budgets.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "budgets.amazonaws.com") or a full URL, including the protocol (ex:
     * "budgets.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "budgets.amazonaws.com") or a full URL, including the protocol (ex:
     *        "budgets.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSBudgets#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * Create a new budget
     * 
     * @param createBudgetRequest
     *        Request of CreateBudget
     * @return Result of the CreateBudget operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateBudget
     */
    CreateBudgetResult createBudget(CreateBudgetRequest createBudgetRequest);

    /**
     * Create a new Notification with subscribers for a budget
     * 
     * @param createNotificationRequest
     *        Request of CreateNotification
     * @return Result of the CreateNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateNotification
     */
    CreateNotificationResult createNotification(CreateNotificationRequest createNotificationRequest);

    /**
     * Create a new Subscriber for a notification
     * 
     * @param createSubscriberRequest
     *        Request of CreateSubscriber
     * @return Result of the CreateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws CreationLimitExceededException
     *         The exception is thrown when customer tries to create a record (e.g. budget), but the number this record
     *         already exceeds the limitation.
     * @throws DuplicateRecordException
     *         The exception is thrown when customer tries to create a record (e.g. budget) that already exists.
     * @sample AWSBudgets.CreateSubscriber
     */
    CreateSubscriberResult createSubscriber(CreateSubscriberRequest createSubscriberRequest);

    /**
     * Delete a budget and related notifications
     * 
     * @param deleteBudgetRequest
     *        Request of DeleteBudget
     * @return Result of the DeleteBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteBudget
     */
    DeleteBudgetResult deleteBudget(DeleteBudgetRequest deleteBudgetRequest);

    /**
     * Delete a notification and related subscribers
     * 
     * @param deleteNotificationRequest
     *        Request of DeleteNotification
     * @return Result of the DeleteNotification operation returned by the service.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteNotification
     */
    DeleteNotificationResult deleteNotification(DeleteNotificationRequest deleteNotificationRequest);

    /**
     * Delete a Subscriber for a notification
     * 
     * @param deleteSubscriberRequest
     *        Request of DeleteSubscriber
     * @return Result of the DeleteSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DeleteSubscriber
     */
    DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest);

    /**
     * Get a single budget
     * 
     * @param describeBudgetRequest
     *        Request of DescribeBudget
     * @return Result of the DescribeBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.DescribeBudget
     */
    DescribeBudgetResult describeBudget(DescribeBudgetRequest describeBudgetRequest);

    /**
     * Get all budgets for an account
     * 
     * @param describeBudgetsRequest
     *        Request of DescribeBudgets
     * @return Result of the DescribeBudgets operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeBudgets
     */
    DescribeBudgetsResult describeBudgets(DescribeBudgetsRequest describeBudgetsRequest);

    /**
     * Get notifications of a budget
     * 
     * @param describeNotificationsForBudgetRequest
     *        Request of DescribeNotificationsForBudget
     * @return Result of the DescribeNotificationsForBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeNotificationsForBudget
     */
    DescribeNotificationsForBudgetResult describeNotificationsForBudget(DescribeNotificationsForBudgetRequest describeNotificationsForBudgetRequest);

    /**
     * Get subscribers of a notification
     * 
     * @param describeSubscribersForNotificationRequest
     *        Request of DescribeSubscribersForNotification
     * @return Result of the DescribeSubscribersForNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws InvalidNextTokenException
     *         This exception is thrown if paging token signature didn't match the token, or the paging token isn't for
     *         this request
     * @throws ExpiredNextTokenException
     *         This exception is thrown if the paging token is expired - past its TTL
     * @sample AWSBudgets.DescribeSubscribersForNotification
     */
    DescribeSubscribersForNotificationResult describeSubscribersForNotification(
            DescribeSubscribersForNotificationRequest describeSubscribersForNotificationRequest);

    /**
     * Update the information of a budget already created
     * 
     * @param updateBudgetRequest
     *        Request of UpdateBudget
     * @return Result of the UpdateBudget operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateBudget
     */
    UpdateBudgetResult updateBudget(UpdateBudgetRequest updateBudgetRequest);

    /**
     * Update the information about a notification already created
     * 
     * @param updateNotificationRequest
     *        Request of UpdateNotification
     * @return Result of the UpdateNotification operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateNotification
     */
    UpdateNotificationResult updateNotification(UpdateNotificationRequest updateNotificationRequest);

    /**
     * Update a subscriber
     * 
     * @param updateSubscriberRequest
     *        Request of UpdateSubscriber
     * @return Result of the UpdateSubscriber operation returned by the service.
     * @throws InternalErrorException
     *         This exception is thrown on an unknown internal failure.
     * @throws InvalidParameterException
     *         This exception is thrown if any request is given an invalid parameter. E.g., if a required Date field is
     *         null.
     * @throws NotFoundException
     *         This exception is thrown if a requested entity is not found. E.g., if a budget id doesn't exist for an
     *         account ID.
     * @sample AWSBudgets.UpdateSubscriber
     */
    UpdateSubscriberResult updateSubscriber(UpdateSubscriberRequest updateSubscriberRequest);

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
