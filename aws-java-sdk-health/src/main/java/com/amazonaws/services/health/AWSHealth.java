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
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
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
     * At least one event ARN and account ID are required. Results are sorted by the <code>lastUpdatedTime</code> of the
     * entity, starting with the most recent.
     * </p>
     * <p>
     * Before you can call this operation, you must first enable AWS Health to work with AWS Organizations. To do this,
     * call the <a>EnableHealthServiceAccessForOrganization</a> operation from your organization's master account.
     * </p>
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
     * Returns the event types that meet the specified filter criteria. If no filter criteria are specified, all event
     * types are returned, in no particular order.
     * </p>
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
     * affected resources. To retrieve that information, use the <a>DescribeEventDetails</a> and
     * <a>DescribeAffectedEntities</a> operations.
     * </p>
     * <p>
     * If no filter criteria are specified, all events are returned. Results are sorted by <code>lastModifiedTime</code>
     * , starting with the most recent.
     * </p>
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
     * recommended) in the organization's master account.
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
     * Calling this operation disables Health from working with AWS Organizations. This does not remove the Service
     * Linked Role (SLR) from the the master account in your organization. Use the IAM console, API, or AWS CLI to
     * remove the SLR if desired. To call this operation, you must sign in as an IAM user, assume an IAM role, or sign
     * in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param disableHealthServiceAccessForOrganizationRequest
     * @return Result of the DisableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a>EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a>DescribeHealthServiceStatusForOrganization</a>
     *         operation.
     * @sample AWSHealth.DisableHealthServiceAccessForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DisableHealthServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    DisableHealthServiceAccessForOrganizationResult disableHealthServiceAccessForOrganization(
            DisableHealthServiceAccessForOrganizationRequest disableHealthServiceAccessForOrganizationRequest);

    /**
     * <p>
     * Calling this operation enables AWS Health to work with AWS Organizations. This applies a Service Linked Role
     * (SLR) to the master account in the organization. To learn more about the steps in this process, visit enabling
     * service access for AWS Health in AWS Organizations. To call this operation, you must sign in as an IAM user,
     * assume an IAM role, or sign in as the root user (not recommended) in the organization's master account.
     * </p>
     * 
     * @param enableHealthServiceAccessForOrganizationRequest
     * @return Result of the EnableHealthServiceAccessForOrganization operation returned by the service.
     * @throws ConcurrentModificationException
     *         <a>EnableHealthServiceAccessForOrganization</a> is already in progress. Wait for the action to complete
     *         before trying again. To get the current status, use the <a>DescribeHealthServiceStatusForOrganization</a>
     *         operation.
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
