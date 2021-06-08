/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The AWS Health API provides programmatic access to the AWS Health information that appears in the <a
 * href="https://phd.aws.amazon.com/phd/home#/">AWS Personal Health Dashboard</a>. You can use the API operations to get
 * information about AWS Health events that affect your AWS services and resources.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
 * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
 * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can use the AWS Health endpoint health.us-east-1.amazonaws.com (HTTPS) to call the AWS Health API operations. AWS
 * Health supports a multi-Region application architecture and has two regional endpoints in an active-passive
 * configuration. You can use the high availability endpoint example to determine which AWS Region is active, so that
 * you can get the latest information from the API. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/health-api.html">Accessing the AWS Health API</a> in the <i>AWS
 * Health User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * For authentication of requests, AWS Health uses the <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * If your AWS account is part of AWS Organizations, you can use the AWS Health organizational view feature. This
 * feature provides a centralized view of AWS Health events across all accounts in your organization. You can aggregate
 * AWS Health events in real time to identify accounts in your organization that are affected by an operational event or
 * get notified of security vulnerabilities. Use the organizational view API operations to enable this feature and
 * return event information. For more information, see <a
 * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in the
 * <i>AWS Health User Guide</i>.
 * </p>
 * <note>
 * <p>
 * When you use the AWS Health API operations to return AWS Health events, see the following recommendations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <a
 * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html#AWSHealth-Type-Event-eventScopeCode"
 * >eventScopeCode</a> parameter to specify whether to return AWS Health events that are public or account-specific.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use pagination to view all events from the response. For example, if you call the
 * <code>DescribeEventsForOrganization</code> operation to get all events in your organization, you might receive
 * several page results. Specify the <code>nextToken</code> in the next request to return more results.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSHealthAsync extends AWSHealth {

    /**
     * <p>
     * Returns a list of accounts in the organization from AWS Organizations that are affected by the provided event.
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * At least one event Amazon Resource Name (ARN) and account ID are required. Results are sorted by the
     * <code>lastUpdatedTime</code> of the entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * At least one event Amazon Resource Name (ARN) and account ID are required. Results are sorted by the
     * <code>lastUpdatedTime</code> of the entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * <li>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * Returns detailed information about one or more specified events. Information includes standard event data (AWS
     * Region, service, and so on, as returned by <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEvents.html">DescribeEvents</a>), a
     * detailed event description, and possible additional metadata that depends upon the nature of the event. Affected
     * entities are not included. To retrieve the entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event can't be retrieved, an error message is returned for that event.
     * </p>
     * <note>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
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
     * Returns detailed information about one or more specified events. Information includes standard event data (AWS
     * Region, service, and so on, as returned by <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEvents.html">DescribeEvents</a>), a
     * detailed event description, and possible additional metadata that depends upon the nature of the event. Affected
     * entities are not included. To retrieve the entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operation.
     * </p>
     * <p>
     * If a specified event can't be retrieved, an error message is returned for that event.
     * </p>
     * <note>
     * <p>
     * This operation supports resource-level permissions. You can use this operation to allow or deny access to
     * specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
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
     * Returns detailed information about one or more specified events for one or more AWS accounts in your
     * organization. This information includes standard event data (such as the AWS Region and service), an event
     * description, and (depending on the event) possible metadata. This operation doesn't return affected entities,
     * such as the resources related to the event. To return affected entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html"
     * >DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <note>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * </note>
     * <p>
     * When you call the <code>DescribeEventDetailsForOrganization</code> operation, specify the
     * <code>organizationEventDetailFilters</code> object in the request. Depending on the AWS Health event type, note
     * the following differences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return event details for a public event, you must specify a null value for the <code>awsAccountId</code>
     * parameter. If you specify an account ID for a public event, AWS Health returns an error message because public
     * events aren't specific to an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return event details for an event that is specific to an account in your organization, you must specify the
     * <code>awsAccountId</code> parameter in the request. If you don't specify an account ID, AWS Health returns an
     * error message because the event is specific to an account in your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <note>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
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
     * Returns detailed information about one or more specified events for one or more AWS accounts in your
     * organization. This information includes standard event data (such as the AWS Region and service), an event
     * description, and (depending on the event) possible metadata. This operation doesn't return affected entities,
     * such as the resources related to the event. To return affected entities, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html"
     * >DescribeAffectedEntitiesForOrganization</a> operation.
     * </p>
     * <note>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * </note>
     * <p>
     * When you call the <code>DescribeEventDetailsForOrganization</code> operation, specify the
     * <code>organizationEventDetailFilters</code> object in the request. Depending on the AWS Health event type, note
     * the following differences:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To return event details for a public event, you must specify a null value for the <code>awsAccountId</code>
     * parameter. If you specify an account ID for a public event, AWS Health returns an error message because public
     * events aren't specific to an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * To return event details for an event that is specific to an account in your organization, you must specify the
     * <code>awsAccountId</code> parameter in the request. If you don't specify an account ID, AWS Health returns an
     * error message because the event is specific to an account in your organization.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <note>
     * <p>
     * This operation doesn't support resource-level permissions. You can't use this operation to allow or deny access
     * to specific AWS Health events. For more information, see <a href=
     * "https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html#resource-action-based-conditions"
     * >Resource- and action-based conditions</a> in the <i>AWS Health User Guide</i>.
     * </p>
     * </note>
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
     * Returns the event types that meet the specified filter criteria. You can use this API operation to find
     * information about the AWS Health event, such as the category, AWS service, and event code. The metadata for each
     * event appears in the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EventType.html">EventType</a> object.
     * </p>
     * <p>
     * If you don't specify a filter criteria, the API operation returns all event types, in no particular order.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * Returns the event types that meet the specified filter criteria. You can use this API operation to find
     * information about the AWS Health event, such as the category, AWS service, and event code. The metadata for each
     * event appears in the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EventType.html">EventType</a> object.
     * </p>
     * <p>
     * If you don't specify a filter criteria, the API operation returns all event types, in no particular order.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * affected resources. To retrieve that information, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetails.html"
     * >DescribeEventDetails</a> and <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent event.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When you call the <code>DescribeEvents</code> operation and specify an entity for the <code>entityValues</code>
     * parameter, AWS Health might return public events that aren't specific to that resource. For example, if you call
     * <code>DescribeEvents</code> and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, AWS
     * Health might return events that aren't specific to that resource or service. To get events that are specific to a
     * service, use the <code>services</code> parameter in the <code>filter</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * affected resources. To retrieve that information, use the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetails.html"
     * >DescribeEventDetails</a> and <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntities.html"
     * >DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent event.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * When you call the <code>DescribeEvents</code> operation and specify an entity for the <code>entityValues</code>
     * parameter, AWS Health might return public events that aren't specific to that resource. For example, if you call
     * <code>DescribeEvents</code> and specify an ID for an Amazon Elastic Compute Cloud (Amazon EC2) instance, AWS
     * Health might return events that aren't specific to that resource or service. To get events that are specific to a
     * service, use the <code>services</code> parameter in the <code>filter</code> object. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </li>
     * </ul>
     * </note>
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
     * Returns information about events across your organization in AWS Organizations. You can use the
     * <code>filters</code> parameter to specify the events that you want to return. Events are returned in a summary
     * form and don't include the affected accounts, detailed description, any additional metadata that depends on the
     * event type, or any affected resources. To retrieve that information, use the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedAccountsForOrganization.html">
     * DescribeAffectedAccountsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetailsForOrganization.html">
     * DescribeEventDetailsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html">
     * DescribeAffectedEntitiesForOrganization</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>filter</code>, the <code>DescribeEventsForOrganizations</code> returns all events
     * across your organization. Results are sorted by <code>lastModifiedTime</code>, starting with the most recent
     * event.
     * </p>
     * <p>
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * Returns information about events across your organization in AWS Organizations. You can use the
     * <code>filters</code> parameter to specify the events that you want to return. Events are returned in a summary
     * form and don't include the affected accounts, detailed description, any additional metadata that depends on the
     * event type, or any affected resources. To retrieve that information, use the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedAccountsForOrganization.html">
     * DescribeAffectedAccountsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeEventDetailsForOrganization.html">
     * DescribeEventDetailsForOrganization</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeAffectedEntitiesForOrganization.html">
     * DescribeAffectedEntitiesForOrganization</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a <code>filter</code>, the <code>DescribeEventsForOrganizations</code> returns all events
     * across your organization. Results are sorted by <code>lastModifiedTime</code>, starting with the most recent
     * event.
     * </p>
     * <p>
     * For more information about the different types of AWS Health events, see <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_Event.html">Event</a>.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a
     * href="https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     * >EnableHealthServiceAccessForOrganization</a> operation from your organization's management account.
     * </p>
     * <note>
     * <p>
     * This API operation uses pagination. Specify the <code>nextToken</code> parameter in the next request to return
     * more results.
     * </p>
     * </note>
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
     * recommended) in the organization's management account.
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
     * recommended) in the organization's management account.
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
     * Disables AWS Health from working with AWS Organizations. To call this operation, you must sign in as an AWS
     * Identity and Access Management (IAM) user, assume an IAM role, or sign in as the root user (not recommended) in
     * the organization's management account. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
     * </p>
     * <p>
     * This operation doesn't remove the service-linked role from the management account in your organization. You must
     * use the IAM console, API, or AWS Command Line Interface (AWS CLI) to remove the service-linked role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html#delete-service-linked-role"
     * >Deleting a Service-Linked Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can also disable the organizational feature by using the Organizations <a
     * href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_DisableAWSServiceAccess.html"
     * >DisableAWSServiceAccess</a> API operation. After you call this operation, AWS Health stops aggregating events
     * for all other AWS accounts in your organization. If you call the AWS Health API operations for organizational
     * view, AWS Health returns an error. AWS Health continues to aggregate health events for your AWS account.
     * </p>
     * </note>
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
     * Disables AWS Health from working with AWS Organizations. To call this operation, you must sign in as an AWS
     * Identity and Access Management (IAM) user, assume an IAM role, or sign in as the root user (not recommended) in
     * the organization's management account. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
     * </p>
     * <p>
     * This operation doesn't remove the service-linked role from the management account in your organization. You must
     * use the IAM console, API, or AWS Command Line Interface (AWS CLI) to remove the service-linked role. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html#delete-service-linked-role"
     * >Deleting a Service-Linked Role</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * You can also disable the organizational feature by using the Organizations <a
     * href="https://docs.aws.amazon.com/organizations/latest/APIReference/API_DisableAWSServiceAccess.html"
     * >DisableAWSServiceAccess</a> API operation. After you call this operation, AWS Health stops aggregating events
     * for all other AWS accounts in your organization. If you call the AWS Health API operations for organizational
     * view, AWS Health returns an error. AWS Health continues to aggregate health events for your AWS account.
     * </p>
     * </note>
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
     * Enables AWS Health to work with AWS Organizations. You can use the organizational view feature to aggregate
     * events from all AWS accounts in your organization in a centralized location.
     * </p>
     * <p>
     * This operation also creates a service-linked role for the management account in the organization.
     * </p>
     * <note>
     * <p>
     * To call this operation, you must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
     * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
     * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must have permission to call this operation from the organization's management account. For example IAM
     * policies, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html">AWS Health
     * identity-based policy examples</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * If you don't have the required support plan, you can instead use the AWS Health console to enable the
     * organizational view feature. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
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
     * Enables AWS Health to work with AWS Organizations. You can use the organizational view feature to aggregate
     * events from all AWS accounts in your organization in a centralized location.
     * </p>
     * <p>
     * This operation also creates a service-linked role for the management account in the organization.
     * </p>
     * <note>
     * <p>
     * To call this operation, you must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan from <a href="http://aws.amazon.com/premiumsupport/">AWS
     * Support</a> to use the AWS Health API. If you call the AWS Health API from an AWS account that doesn't have a
     * Business or Enterprise Support plan, you receive a <code>SubscriptionRequiredException</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must have permission to call this operation from the organization's management account. For example IAM
     * policies, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/security_iam_id-based-policy-examples.html">AWS Health
     * identity-based policy examples</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * If you don't have the required support plan, you can instead use the AWS Health console to enable the
     * organizational view feature. For more information, see <a
     * href="https://docs.aws.amazon.com/health/latest/ug/aggregate-events.html">Aggregating AWS Health events</a> in
     * the <i>AWS Health User Guide</i>.
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
