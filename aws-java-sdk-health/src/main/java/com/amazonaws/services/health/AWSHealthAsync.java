/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health;

import javax.annotation.Generated;

import com.amazonaws.services.health.model.*;

/**
 * Interface for accessing AWSHealth asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.health.AbstractAWSHealthAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Health</fullname>
 * <p>
 * The AWS Health API provides programmatic access to the AWS Health information that is presented in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can get information about events
 * that affect your AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEvents</a>: Summary information about events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetails</a>: Detailed information about one or more events.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntities</a>: Information about AWS resources that are affected by one or more events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * In addition, these operations provide information about event types and summary counts of events or affected
 * entities:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventTypes</a>: Information about the kinds of events that AWS Health tracks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventAggregates</a>: A count of the number of events that meet specified criteria.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEntityAggregates</a>: A count of the number of affected entities that meet specified criteria.
 * </p>
 * </li>
 * </ul>
 * <p>
 * AWS Health integrates with AWS Organizations to provide a centralized view of AWS Health events across all accounts
 * in your organization.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEventsForOrganization</a>: Summary information about events across the organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedAccountsForOrganization</a>: List of accounts in your organization impacted by an event.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEventDetailsForOrganization</a>: Detailed information about events in your organization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAffectedEntitiesForOrganization</a>: Information about AWS resources in your organization that are
 * affected by events.
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use the following operations to enable or disable AWS Health from working with AWS Organizations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>EnableHealthServiceAccessForOrganization</a>: Enables AWS Health to work with AWS Organizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisableHealthServiceAccessForOrganization</a>: Disables AWS Health from working with AWS Organizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeHealthServiceStatusForOrganization</a>: Status information about enabling or disabling AWS Health from
 * working with AWS Organizations.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Health API requires a Business or Enterprise support plan from <a
 * href="http://aws.amazon.com/premiumsupport/">AWS Support</a>. Calling the Health API from an account that does not
 * have a Business or Enterprise support plan causes a <code>SubscriptionRequiredException</code>.
 * </p>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * See the <a href="https://docs.aws.amazon.com/health/latest/ug/what-is-aws-health.html">AWS Health User Guide</a> for
 * information about how to use the API.
 * </p>
 * <p>
 * <b>Service Endpoint</b>
 * </p>
 * <p>
 * The HTTP endpoint for the AWS Health API is:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://health.us-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSHealthAsync extends AWSHealth {

    /**
     * <p>
     * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeAffectedAccountsForOrganizationRequest
     * @return A Java Future containing the result of the DescribeAffectedAccountsForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsync.DescribeAffectedAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            DescribeAffectedAccountsForOrganizationRequest describeAffectedAccountsForOrganizationRequest);

    /**
     * <p>
     * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeAffectedAccountsForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAffectedAccountsForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsyncHandler.DescribeAffectedAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedAccountsForOrganizationResult> describeAffectedAccountsForOrganizationAsync(
            DescribeAffectedAccountsForOrganizationRequest describeAffectedAccountsForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedAccountsForOrganizationRequest, DescribeAffectedAccountsForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of entities that have been affected by the specified events, based on the specified filter
     * criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
     * construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
     * the extent of impact is unknown, include at least one entity indicating this.
     * </p>
     * <p>
     * At least one event ARN is required. Results are sorted by the <code>lastUpdatedTime</code> of the entity,
     * starting with the most recent.
     * </p>
     * 
     * @param describeAffectedEntitiesRequest
     * @return A Java Future containing the result of the DescribeAffectedEntities operation returned by the service.
     * @sample AWSHealthAsync.DescribeAffectedEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(DescribeAffectedEntitiesRequest describeAffectedEntitiesRequest);

    /**
     * <p>
     * Returns a list of entities that have been affected by the specified events, based on the specified filter
     * criteria. Entities can refer to individual customer resources, groups of customer resources, or any other
     * construct, depending on the AWS service. Events that have impact beyond that of the affected entities, or where
     * the extent of impact is unknown, include at least one entity indicating this.
     * </p>
     * <p>
     * At least one event ARN is required. Results are sorted by the <code>lastUpdatedTime</code> of the entity,
     * starting with the most recent.
     * </p>
     * 
     * @param describeAffectedEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAffectedEntities operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeAffectedEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedEntitiesResult> describeAffectedEntitiesAsync(DescribeAffectedEntitiesRequest describeAffectedEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesRequest, DescribeAffectedEntitiesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of entities that have been affected by one or more events for one or more accounts in your
     * organization in AWS Organizations, based on the filter criteria. Entities can refer to individual customer
     * resources, groups of customer resources, or any other construct, depending on the AWS service.
     * </p>
     * <p>
     * At least one event ARN and account ID are required. Results are sorted by the <code>lastUpdatedTime</code> of the
     * entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeAffectedEntitiesForOrganizationRequest
     * @return A Java Future containing the result of the DescribeAffectedEntitiesForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsync.DescribeAffectedEntitiesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntitiesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            DescribeAffectedEntitiesForOrganizationRequest describeAffectedEntitiesForOrganizationRequest);

    /**
     * <p>
     * Returns a list of entities that have been affected by one or more events for one or more accounts in your
     * organization in AWS Organizations, based on the filter criteria. Entities can refer to individual customer
     * resources, groups of customer resources, or any other construct, depending on the AWS service.
     * </p>
     * <p>
     * At least one event ARN and account ID are required. Results are sorted by the <code>lastUpdatedTime</code> of the
     * entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeAffectedEntitiesForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAffectedEntitiesForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsyncHandler.DescribeAffectedEntitiesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntitiesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAffectedEntitiesForOrganizationResult> describeAffectedEntitiesForOrganizationAsync(
            DescribeAffectedEntitiesForOrganizationRequest describeAffectedEntitiesForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAffectedEntitiesForOrganizationRequest, DescribeAffectedEntitiesForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Returns the number of entities that are affected by each of the specified events. If no events are specified, the
     * counts of all affected entities are returned.
     * </p>
     * 
     * @param describeEntityAggregatesRequest
     * @return A Java Future containing the result of the DescribeEntityAggregates operation returned by the service.
     * @sample AWSHealthAsync.DescribeEntityAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(DescribeEntityAggregatesRequest describeEntityAggregatesRequest);

    /**
     * <p>
     * Returns the number of entities that are affected by each of the specified events. If no events are specified, the
     * counts of all affected entities are returned.
     * </p>
     * 
     * @param describeEntityAggregatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEntityAggregates operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeEntityAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEntityAggregatesResult> describeEntityAggregatesAsync(DescribeEntityAggregatesRequest describeEntityAggregatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEntityAggregatesRequest, DescribeEntityAggregatesResult> asyncHandler);

    /**
     * <p>
     * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
     * is specified, the counts of all events in each category are returned.
     * </p>
     * 
     * @param describeEventAggregatesRequest
     * @return A Java Future containing the result of the DescribeEventAggregates operation returned by the service.
     * @sample AWSHealthAsync.DescribeEventAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(DescribeEventAggregatesRequest describeEventAggregatesRequest);

    /**
     * <p>
     * Returns the number of events of each event type (issue, scheduled change, and account notification). If no filter
     * is specified, the counts of all events in each category are returned.
     * </p>
     * 
     * @param describeEventAggregatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventAggregates operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeEventAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventAggregatesResult> describeEventAggregatesAsync(DescribeEventAggregatesRequest describeEventAggregatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventAggregatesRequest, DescribeEventAggregatesResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about one or more specified events. Information includes standard event data
     * (region, service, and so on, as returned by <a>DescribeEvents</a>), a detailed event description, and possible
     * additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
     * those, use the <a>DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event cannot be retrieved, an error message is returned for that event.
     * </p>
     * 
     * @param describeEventDetailsRequest
     * @return A Java Future containing the result of the DescribeEventDetails operation returned by the service.
     * @sample AWSHealthAsync.DescribeEventDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetails" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(DescribeEventDetailsRequest describeEventDetailsRequest);

    /**
     * <p>
     * Returns detailed information about one or more specified events. Information includes standard event data
     * (region, service, and so on, as returned by <a>DescribeEvents</a>), a detailed event description, and possible
     * additional metadata that depends upon the nature of the event. Affected entities are not included; to retrieve
     * those, use the <a>DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event cannot be retrieved, an error message is returned for that event.
     * </p>
     * 
     * @param describeEventDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventDetails operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeEventDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetails" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventDetailsResult> describeEventDetailsAsync(DescribeEventDetailsRequest describeEventDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsRequest, DescribeEventDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about one or more specified events for one or more accounts in your organization.
     * Information includes standard event data (Region, service, and so on, as returned by
     * <a>DescribeEventsForOrganization</a>, a detailed event description, and possible additional metadata that depends
     * upon the nature of the event. Affected entities are not included; to retrieve those, use the
     * <a>DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeEventDetailsForOrganizationRequest
     * @return A Java Future containing the result of the DescribeEventDetailsForOrganization operation returned by the
     *         service.
     * @sample AWSHealthAsync.DescribeEventDetailsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            DescribeEventDetailsForOrganizationRequest describeEventDetailsForOrganizationRequest);

    /**
     * <p>
     * Returns detailed information about one or more specified events for one or more accounts in your organization.
     * Information includes standard event data (Region, service, and so on, as returned by
     * <a>DescribeEventsForOrganization</a>, a detailed event description, and possible additional metadata that depends
     * upon the nature of the event. Affected entities are not included; to retrieve those, use the
     * <a>DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeEventDetailsForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventDetailsForOrganization operation returned by the
     *         service.
     * @sample AWSHealthAsyncHandler.DescribeEventDetailsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventDetailsForOrganizationResult> describeEventDetailsForOrganizationAsync(
            DescribeEventDetailsForOrganizationRequest describeEventDetailsForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventDetailsForOrganizationRequest, DescribeEventDetailsForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
     * types are returned, in no particular order.
     * </p>
     * 
     * @param describeEventTypesRequest
     * @return A Java Future containing the result of the DescribeEventTypes operation returned by the service.
     * @sample AWSHealthAsync.DescribeEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(DescribeEventTypesRequest describeEventTypesRequest);

    /**
     * <p>
     * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
     * types are returned, in no particular order.
     * </p>
     * 
     * @param describeEventTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventTypes operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTypesResult> describeEventTypesAsync(DescribeEventTypesRequest describeEventTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTypesRequest, DescribeEventTypesResult> asyncHandler);

    /**
     * <p>
     * Returns information about events that meet the specified filter criteria. Events are returned in a summary form
     * and do not include the detailed description, any additional metadata that depends on the event type, or any
     * affected resources. To retrieve that information, use the <a>DescribeEventDetails</a> and
     * <a>DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent.
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSHealthAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns information about events that meet the specified filter criteria. Events are returned in a summary form
     * and do not include the detailed description, any additional metadata that depends on the event type, or any
     * affected resources. To retrieve that information, use the <a>DescribeEventDetails</a> and
     * <a>DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent.
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSHealthAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns information about events across your organization in AWS Organizations, meeting the specified filter
     * criteria. Events are returned in a summary form and do not include the accounts impacted, detailed description,
     * any additional metadata that depends on the event type, or any affected resources. To retrieve that information,
     * use the <a>DescribeAffectedAccountsForOrganization</a>, <a>DescribeEventDetailsForOrganization</a>, and
     * <a>DescribeAffectedEntitiesForOrganization</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events across your organization are returned. Results are sorted by
     * <code>lastModifiedTime</code>, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable Health to work with AWS Organizations. To do this, call
     * the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeEventsForOrganizationRequest
     * @return A Java Future containing the result of the DescribeEventsForOrganization operation returned by the
     *         service.
     * @sample AWSHealthAsync.DescribeEventsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(
            DescribeEventsForOrganizationRequest describeEventsForOrganizationRequest);

    /**
     * <p>
     * Returns information about events across your organization in AWS Organizations, meeting the specified filter
     * criteria. Events are returned in a summary form and do not include the accounts impacted, detailed description,
     * any additional metadata that depends on the event type, or any affected resources. To retrieve that information,
     * use the <a>DescribeAffectedAccountsForOrganization</a>, <a>DescribeEventDetailsForOrganization</a>, and
     * <a>DescribeAffectedEntitiesForOrganization</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events across your organization are returned. Results are sorted by
     * <code>lastModifiedTime</code>, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable Health to work with AWS Organizations. To do this, call
     * the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
     * 
     * @param describeEventsForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventsForOrganization operation returned by the
     *         service.
     * @sample AWSHealthAsyncHandler.DescribeEventsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsForOrganizationResult> describeEventsForOrganizationAsync(
            DescribeEventsForOrganizationRequest describeEventsForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsForOrganizationRequest, DescribeEventsForOrganizationResult> asyncHandler);

    /**
     * <p>
     * This operation provides status information on enabling or disabling AWS Health to work with your organization. To
     * call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not
     * recommended) in the organization's master account.
     * </p>
     * 
     * @param describeHealthServiceStatusForOrganizationRequest
     * @return A Java Future containing the result of the DescribeHealthServiceStatusForOrganization operation returned
     *         by the service.
     * @sample AWSHealthAsync.DescribeHealthServiceStatusForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeHealthServiceStatusForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            DescribeHealthServiceStatusForOrganizationRequest describeHealthServiceStatusForOrganizationRequest);

    /**
     * <p>
     * This operation provides status information on enabling or disabling AWS Health to work with your organization. To
     * call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not
     * recommended) in the organization's master account.
     * </p>
     * 
     * @param describeHealthServiceStatusForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHealthServiceStatusForOrganization operation returned
     *         by the service.
     * @sample AWSHealthAsyncHandler.DescribeHealthServiceStatusForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeHealthServiceStatusForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHealthServiceStatusForOrganizationResult> describeHealthServiceStatusForOrganizationAsync(
            DescribeHealthServiceStatusForOrganizationRequest describeHealthServiceStatusForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHealthServiceStatusForOrganizationRequest, DescribeHealthServiceStatusForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Calling this operation disables Health from working with AWS Organizations. This does not remove the Service
     * Linked Role (SLR) from the the master account in your organization. Use the IAM console, API, or AWS CLI to
     * remove the SLR if desired. To call this operation, you must sign in as an IAM user, assume an IAM role, or sign
     * in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param disableHealthServiceAccessForOrganizationRequest
     * @return A Java Future containing the result of the DisableHealthServiceAccessForOrganization operation returned
     *         by the service.
     * @sample AWSHealthAsync.DisableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DisableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest);

    /**
     * <p>
     * Calling this operation disables Health from working with AWS Organizations. This does not remove the Service
     * Linked Role (SLR) from the the master account in your organization. Use the IAM console, API, or AWS CLI to
     * remove the SLR if desired. To call this operation, you must sign in as an IAM user, assume an IAM role, or sign
     * in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param disableHealthServiceAccessForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableHealthServiceAccessForOrganization operation returned
     *         by the service.
     * @sample AWSHealthAsyncHandler.DisableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DisableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableHealthServiceAccessForOrganizationResult> disableHealthServiceAccessForOrganizationAsync(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DisableHealthServiceAccessForOrganizationRequest, DisableHealthServiceAccessForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Calling this operation enables AWS Health to work with AWS Organizations. This applies a Service Linked Role
     * (SLR) to the master account in the organization. To learn more about the steps in this process, visit enabling
     * service access for AWS Health in AWS Organizations. To call this operation, you must sign in as an IAM user,
     * assume an IAM role, or sign in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param enableHealthServiceAccessForOrganizationRequest
     * @return A Java Future containing the result of the EnableHealthServiceAccessForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsync.EnableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EnableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest);

    /**
     * <p>
     * Calling this operation enables AWS Health to work with AWS Organizations. This applies a Service Linked Role
     * (SLR) to the master account in the organization. To learn more about the steps in this process, visit enabling
     * service access for AWS Health in AWS Organizations. To call this operation, you must sign in as an IAM user,
     * assume an IAM role, or sign in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param enableHealthServiceAccessForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableHealthServiceAccessForOrganization operation returned by
     *         the service.
     * @sample AWSHealthAsyncHandler.EnableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EnableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableHealthServiceAccessForOrganizationResult> enableHealthServiceAccessForOrganizationAsync(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<EnableHealthServiceAccessForOrganizationRequest, EnableHealthServiceAccessForOrganizationResult> asyncHandler);

}
