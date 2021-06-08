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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.health.model.*;

/**
 * Interface for accessing AWSHealth.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.health.AbstractAWSHealth} instead.
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
public interface AWSHealth {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "health";

    /**
     * Overrides the default endpoint for this client ("health.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "health.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "health.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "health.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "health.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSHealth#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the DescribeAffectedAccountsForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @sample AWSHealth.DescribeAffectedAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAffectedAccountsForOrganizationResult describeAffectedAccountsForOrganization(
            DescribeAffectedAccountsForOrganizationRequest describeAffectedAccountsForOrganizationRequest);

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
     * @return Result of the DescribeAffectedEntities operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeAffectedEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntities"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAffectedEntitiesResult describeAffectedEntities(DescribeAffectedEntitiesRequest describeAffectedEntitiesRequest);

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
     * @return Result of the DescribeAffectedEntitiesForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeAffectedEntitiesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeAffectedEntitiesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAffectedEntitiesForOrganizationResult describeAffectedEntitiesForOrganization(
            DescribeAffectedEntitiesForOrganizationRequest describeAffectedEntitiesForOrganizationRequest);

    /**
     * <p>
     * Returns the number of entities that are affected by each of the specified events. If no events are specified, the
     * counts of all affected entities are returned.
     * </p>
     * 
     * @param describeEntityAggregatesRequest
     * @return Result of the DescribeEntityAggregates operation returned by the service.
     * @sample AWSHealth.DescribeEntityAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntityAggregatesResult describeEntityAggregates(DescribeEntityAggregatesRequest describeEntityAggregatesRequest);

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
     * @return Result of the DescribeEventAggregates operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @sample AWSHealth.DescribeEventAggregates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventAggregatesResult describeEventAggregates(DescribeEventAggregatesRequest describeEventAggregatesRequest);

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
     * @return Result of the DescribeEventDetails operation returned by the service.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetails" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventDetailsResult describeEventDetails(DescribeEventDetailsRequest describeEventDetailsRequest);

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
     * @return Result of the DescribeEventDetailsForOrganization operation returned by the service.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventDetailsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventDetailsForOrganizationResult describeEventDetailsForOrganization(
            DescribeEventDetailsForOrganizationRequest describeEventDetailsForOrganizationRequest);

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
     * @return Result of the DescribeEventTypes operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventTypes" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventTypesResult describeEventTypes(DescribeEventTypesRequest describeEventTypesRequest);

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
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

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
     * @return Result of the DescribeEventsForOrganization operation returned by the service.
     * @throws InvalidPaginationTokenException
     *         The specified pagination token (<code>nextToken</code>) is not valid.
     * @throws UnsupportedLocaleException
     *         The specified locale is not supported.
     * @sample AWSHealth.DescribeEventsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventsForOrganizationResult describeEventsForOrganization(DescribeEventsForOrganizationRequest describeEventsForOrganizationRequest);

    /**
     * <p>
     * This operation provides status information on enabling or disabling AWS Health to work with your organization. To
     * call this operation, you must sign in as an IAM user, assume an IAM role, or sign in as the root user (not
     * recommended) in the organization's management account.
     * </p>
     * 
     * @param describeHealthServiceStatusForOrganizationRequest
     * @return Result of the DescribeHealthServiceStatusForOrganization operation returned by the service.
     * @sample AWSHealth.DescribeHealthServiceStatusForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeHealthServiceStatusForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHealthServiceStatusForOrganizationResult describeHealthServiceStatusForOrganization(
            DescribeHealthServiceStatusForOrganizationRequest describeHealthServiceStatusForOrganizationRequest);

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
     * @return Result of the DisableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     *         >EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeHealthServiceStatusForOrganization.html"
     *         >DescribeHealthServiceStatusForOrganization</a> operation.
     * @sample AWSHealth.DisableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DisableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DisableHealthServiceAccessForOrganizationResult disableHealthServiceAccessForOrganization(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest);

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
     * @return Result of the EnableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_EnableHealthServiceAccessForOrganization.html"
     *         >EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a href=
     *         "https://docs.aws.amazon.com/health/latest/APIReference/API_DescribeHealthServiceStatusForOrganization.html"
     *         >DescribeHealthServiceStatusForOrganization</a> operation.
     * @sample AWSHealth.EnableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EnableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    EnableHealthServiceAccessForOrganizationResult enableHealthServiceAccessForOrganization(
            EnableHealthServiceAccessForOrganizationRequest enableHealthServiceAccessForOrganizationRequest);

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
