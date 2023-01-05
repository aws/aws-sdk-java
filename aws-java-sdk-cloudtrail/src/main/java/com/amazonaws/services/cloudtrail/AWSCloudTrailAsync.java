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
package com.amazonaws.services.cloudtrail;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing CloudTrail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudtrail.AbstractAWSCloudTrailAsync} instead.
 * </p>
 * <p>
 * <fullname>CloudTrail</fullname>
 * <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common
 * errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records Amazon Web Services API calls for your Amazon Web Services account and
 * delivers log files to an Amazon S3 bucket. The recorded information includes the identity of the user, the start time
 * of the Amazon Web Services API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <note>
 * <p>
 * As an alternative to the API, you can use one of the Amazon Web Services SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide
 * programmatic access to CloudTrail. For example, the SDKs handle cryptographically signing requests, managing errors,
 * and retrying requests automatically. For more information about the Amazon Web Services SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * See the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html">CloudTrail
 * User Guide</a> for information about the data that is included with each Amazon Web Services API call listed in the
 * log files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudTrailAsync extends AWSCloudTrail {

    /**
     * <p>
     * Adds one or more tags to a trail or event data store, up to a limit of 50. Overwrites an existing tag's value
     * when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have
     * two keys with the same name but different values. If you specify a key without a value, the tag will be created
     * with the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon
     * Web Services Regions only from the Region in which the trail or event data store was created (also known as its
     * home region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail or event data store.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AWSCloudTrailAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds one or more tags to a trail or event data store, up to a limit of 50. Overwrites an existing tag's value
     * when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have
     * two keys with the same name but different values. If you specify a key without a value, the tag will be created
     * with the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon
     * Web Services Regions only from the Region in which the trail or event data store was created (also known as its
     * home region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail or event data store.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Cancels a query if the query is not in a terminated state, such as <code>CANCELLED</code>, <code>FAILED</code>,
     * <code>TIMED_OUT</code>, or <code>FINISHED</code>. You must specify an ARN value for <code>EventDataStore</code>.
     * The ID of the query that you want to cancel is also required. When you run <code>CancelQuery</code>, the query
     * status might show as <code>CANCELLED</code> even if the operation is not yet finished.
     * </p>
     * 
     * @param cancelQueryRequest
     * @return A Java Future containing the result of the CancelQuery operation returned by the service.
     * @sample AWSCloudTrailAsync.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CancelQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest cancelQueryRequest);

    /**
     * <p>
     * Cancels a query if the query is not in a terminated state, such as <code>CANCELLED</code>, <code>FAILED</code>,
     * <code>TIMED_OUT</code>, or <code>FINISHED</code>. You must specify an ARN value for <code>EventDataStore</code>.
     * The ID of the query that you want to cancel is also required. When you run <code>CancelQuery</code>, the query
     * status might show as <code>CANCELLED</code> even if the operation is not yet finished.
     * </p>
     * 
     * @param cancelQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelQuery operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CancelQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest cancelQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler);

    /**
     * <p>
     * Creates a new event data store.
     * </p>
     * 
     * @param createEventDataStoreRequest
     * @return A Java Future containing the result of the CreateEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsync.CreateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(CreateEventDataStoreRequest createEventDataStoreRequest);

    /**
     * <p>
     * Creates a new event data store.
     * </p>
     * 
     * @param createEventDataStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.CreateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(CreateEventDataStoreRequest createEventDataStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventDataStoreRequest, CreateEventDataStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @return A Java Future containing the result of the CreateTrail operation returned by the service.
     * @sample AWSCloudTrailAsync.CreateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrailResult> createTrailAsync(CreateTrailRequest createTrailRequest);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrail operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.CreateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTrailResult> createTrailAsync(CreateTrailRequest createTrailRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler);

    /**
     * <p>
     * Disables the event data store specified by <code>EventDataStore</code>, which accepts an event data store ARN.
     * After you run <code>DeleteEventDataStore</code>, the event data store enters a <code>PENDING_DELETION</code>
     * state, and is automatically deleted after a wait period of seven days. <code>TerminationProtectionEnabled</code>
     * must be set to <code>False</code> on the event data store; this operation cannot work if
     * <code>TerminationProtectionEnabled</code> is <code>True</code>.
     * </p>
     * <p>
     * After you run <code>DeleteEventDataStore</code> on an event data store, you cannot run <code>ListQueries</code>,
     * <code>DescribeQuery</code>, or <code>GetQueryResults</code> on queries that are using an event data store in a
     * <code>PENDING_DELETION</code> state. An event data store in the <code>PENDING_DELETION</code> state does not
     * incur costs.
     * </p>
     * 
     * @param deleteEventDataStoreRequest
     * @return A Java Future containing the result of the DeleteEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsync.DeleteEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(DeleteEventDataStoreRequest deleteEventDataStoreRequest);

    /**
     * <p>
     * Disables the event data store specified by <code>EventDataStore</code>, which accepts an event data store ARN.
     * After you run <code>DeleteEventDataStore</code>, the event data store enters a <code>PENDING_DELETION</code>
     * state, and is automatically deleted after a wait period of seven days. <code>TerminationProtectionEnabled</code>
     * must be set to <code>False</code> on the event data store; this operation cannot work if
     * <code>TerminationProtectionEnabled</code> is <code>True</code>.
     * </p>
     * <p>
     * After you run <code>DeleteEventDataStore</code> on an event data store, you cannot run <code>ListQueries</code>,
     * <code>DescribeQuery</code>, or <code>GetQueryResults</code> on queries that are using an event data store in a
     * <code>PENDING_DELETION</code> state. An event data store in the <code>PENDING_DELETION</code> state does not
     * incur costs.
     * </p>
     * 
     * @param deleteEventDataStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DeleteEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(DeleteEventDataStoreRequest deleteEventDataStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventDataStoreRequest, DeleteEventDataStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in which the trail was created.
     * <code>DeleteTrail</code> cannot be called on the shadow trails (replicated trails in other regions) of a trail
     * that is enabled in all regions.
     * </p>
     * 
     * @param deleteTrailRequest
     *        The request that specifies the name of a trail to delete.
     * @return A Java Future containing the result of the DeleteTrail operation returned by the service.
     * @sample AWSCloudTrailAsync.DeleteTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest deleteTrailRequest);

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in which the trail was created.
     * <code>DeleteTrail</code> cannot be called on the shadow trails (replicated trails in other regions) of a trail
     * that is enabled in all regions.
     * </p>
     * 
     * @param deleteTrailRequest
     *        The request that specifies the name of a trail to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrail operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DeleteTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest deleteTrailRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler);

    /**
     * <p>
     * Removes CloudTrail delegated administrator permissions from a member account in an organization.
     * </p>
     * 
     * @param deregisterOrganizationDelegatedAdminRequest
     *        Removes CloudTrail delegated administrator permissions from a specified member account in an organization
     *        that is currently designated as a delegated administrator.
     * @return A Java Future containing the result of the DeregisterOrganizationDelegatedAdmin operation returned by the
     *         service.
     * @sample AWSCloudTrailAsync.DeregisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeregisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterOrganizationDelegatedAdminResult> deregisterOrganizationDelegatedAdminAsync(
            DeregisterOrganizationDelegatedAdminRequest deregisterOrganizationDelegatedAdminRequest);

    /**
     * <p>
     * Removes CloudTrail delegated administrator permissions from a member account in an organization.
     * </p>
     * 
     * @param deregisterOrganizationDelegatedAdminRequest
     *        Removes CloudTrail delegated administrator permissions from a specified member account in an organization
     *        that is currently designated as a delegated administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterOrganizationDelegatedAdmin operation returned by the
     *         service.
     * @sample AWSCloudTrailAsyncHandler.DeregisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeregisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterOrganizationDelegatedAdminResult> deregisterOrganizationDelegatedAdminAsync(
            DeregisterOrganizationDelegatedAdminRequest deregisterOrganizationDelegatedAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterOrganizationDelegatedAdminRequest, DeregisterOrganizationDelegatedAdminResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched,
     * and query status. You must specify an ARN for <code>EventDataStore</code>, and a value for <code>QueryID</code>.
     * </p>
     * 
     * @param describeQueryRequest
     * @return A Java Future containing the result of the DescribeQuery operation returned by the service.
     * @sample AWSCloudTrailAsync.DescribeQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(DescribeQueryRequest describeQueryRequest);

    /**
     * <p>
     * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched,
     * and query status. You must specify an ARN for <code>EventDataStore</code>, and a value for <code>QueryID</code>.
     * </p>
     * 
     * @param describeQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeQuery operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DescribeQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(DescribeQueryRequest describeQueryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeQueryRequest, DescribeQueryResult> asyncHandler);

    /**
     * <p>
     * Retrieves settings for one or more trails associated with the current region for your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @return A Java Future containing the result of the DescribeTrails operation returned by the service.
     * @sample AWSCloudTrailAsync.DescribeTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeTrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest describeTrailsRequest);

    /**
     * <p>
     * Retrieves settings for one or more trails associated with the current region for your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrails operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DescribeTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeTrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest describeTrailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest)
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync();

    /**
     * Simplified method form for invoking the DescribeTrails operation with an AsyncHandler.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific channel. Amazon Web Services services create service-linked channels to get
     * information about CloudTrail events on your behalf. For more information about service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AWSCloudTrailAsync.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Returns information about a specific channel. Amazon Web Services services create service-linked channels to get
     * information about CloudTrail events on your behalf. For more information about service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler);

    /**
     * <p>
     * Returns information about an event data store specified as either an ARN or the ID portion of the ARN.
     * </p>
     * 
     * @param getEventDataStoreRequest
     * @return A Java Future containing the result of the GetEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsync.GetEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventDataStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(GetEventDataStoreRequest getEventDataStoreRequest);

    /**
     * <p>
     * Returns information about an event data store specified as either an ARN or the ID portion of the ARN.
     * </p>
     * 
     * @param getEventDataStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventDataStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(GetEventDataStoreRequest getEventDataStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventDataStoreRequest, GetEventDataStoreResult> asyncHandler);

    /**
     * <p>
     * Describes the settings for the event selectors that you configured for your trail. The information returned for
     * your event selectors includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your event selector includes read-only events, write-only events, or all events. This applies to both
     * management events and data events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes management events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes data events, the resources on which you are logging data events.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about logging management and data events, see the following topics in the <i>CloudTrail User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events for trails </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">
     * Logging data events for trails </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEventSelectorsRequest
     * @return A Java Future containing the result of the GetEventSelectors operation returned by the service.
     * @sample AWSCloudTrailAsync.GetEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(GetEventSelectorsRequest getEventSelectorsRequest);

    /**
     * <p>
     * Describes the settings for the event selectors that you configured for your trail. The information returned for
     * your event selectors includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your event selector includes read-only events, write-only events, or all events. This applies to both
     * management events and data events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes management events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes data events, the resources on which you are logging data events.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about logging management and data events, see the following topics in the <i>CloudTrail User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events for trails </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">
     * Logging data events for trails </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEventSelectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventSelectors operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(GetEventSelectorsRequest getEventSelectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventSelectorsRequest, GetEventSelectorsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific import.
     * </p>
     * 
     * @param getImportRequest
     * @return A Java Future containing the result of the GetImport operation returned by the service.
     * @sample AWSCloudTrailAsync.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest getImportRequest);

    /**
     * <p>
     * Returns information about a specific import.
     * </p>
     * 
     * @param getImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImport operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest getImportRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportRequest, GetImportResult> asyncHandler);

    /**
     * <p>
     * Describes the settings for the Insights event selectors that you configured for your trail.
     * <code>GetInsightSelectors</code> shows if CloudTrail Insights event logging is enabled on the trail, and if it
     * is, which insight types are enabled. If you run <code>GetInsightSelectors</code> on a trail that does not have
     * Insights events enabled, the operation throws the exception <code>InsightNotEnabledException</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging CloudTrail Insights Events for Trails </a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param getInsightSelectorsRequest
     * @return A Java Future containing the result of the GetInsightSelectors operation returned by the service.
     * @sample AWSCloudTrailAsync.GetInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(GetInsightSelectorsRequest getInsightSelectorsRequest);

    /**
     * <p>
     * Describes the settings for the Insights event selectors that you configured for your trail.
     * <code>GetInsightSelectors</code> shows if CloudTrail Insights event logging is enabled on the trail, and if it
     * is, which insight types are enabled. If you run <code>GetInsightSelectors</code> on a trail that does not have
     * Insights events enabled, the operation throws the exception <code>InsightNotEnabledException</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging CloudTrail Insights Events for Trails </a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param getInsightSelectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightSelectors operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(GetInsightSelectorsRequest getInsightSelectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightSelectorsRequest, GetInsightSelectorsResult> asyncHandler);

    /**
     * <p>
     * Gets event data results of a query. You must specify the <code>QueryID</code> value returned by the
     * <code>StartQuery</code> operation, and an ARN for <code>EventDataStore</code>.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AWSCloudTrailAsync.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Gets event data results of a query. You must specify the <code>QueryID</code> value returned by the
     * <code>StartQuery</code> operation, and an ARN for <code>EventDataStore</code>.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler);

    /**
     * <p>
     * Returns settings information for a specified trail.
     * </p>
     * 
     * @param getTrailRequest
     * @return A Java Future containing the result of the GetTrail operation returned by the service.
     * @sample AWSCloudTrailAsync.GetTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrailResult> getTrailAsync(GetTrailRequest getTrailRequest);

    /**
     * <p>
     * Returns settings information for a specified trail.
     * </p>
     * 
     * @param getTrailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrail operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrailResult> getTrailAsync(GetTrailRequest getTrailRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrailRequest, GetTrailResult> asyncHandler);

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
     * errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
     * trail status from a single region. To return trail status from all regions, you must call the operation on each
     * region.
     * </p>
     * 
     * @param getTrailStatusRequest
     *        The name of a trail about which you want the current status.
     * @return A Java Future containing the result of the GetTrailStatus operation returned by the service.
     * @sample AWSCloudTrailAsync.GetTrailStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrailStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest getTrailStatusRequest);

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
     * errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
     * trail status from a single region. To return trail status from all regions, you must call the operation on each
     * region.
     * </p>
     * 
     * @param getTrailStatusRequest
     *        The name of a trail about which you want the current status.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrailStatus operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetTrailStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrailStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest getTrailStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the channels in the current account, and their source names. Amazon Web Services services create
     * service-linked channels get information about CloudTrail events on your behalf. For more information about
     * service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSCloudTrailAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Lists the channels in the current account, and their source names. Amazon Web Services services create
     * service-linked channels get information about CloudTrail events on your behalf. For more information about
     * service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Returns information about all event data stores in the account, in the current region.
     * </p>
     * 
     * @param listEventDataStoresRequest
     * @return A Java Future containing the result of the ListEventDataStores operation returned by the service.
     * @sample AWSCloudTrailAsync.ListEventDataStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListEventDataStores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(ListEventDataStoresRequest listEventDataStoresRequest);

    /**
     * <p>
     * Returns information about all event data stores in the account, in the current region.
     * </p>
     * 
     * @param listEventDataStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventDataStores operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListEventDataStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListEventDataStores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(ListEventDataStoresRequest listEventDataStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventDataStoresRequest, ListEventDataStoresResult> asyncHandler);

    /**
     * <p>
     * Returns a list of failures for the specified import.
     * </p>
     * 
     * @param listImportFailuresRequest
     * @return A Java Future containing the result of the ListImportFailures operation returned by the service.
     * @sample AWSCloudTrailAsync.ListImportFailures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(ListImportFailuresRequest listImportFailuresRequest);

    /**
     * <p>
     * Returns a list of failures for the specified import.
     * </p>
     * 
     * @param listImportFailuresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImportFailures operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListImportFailures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(ListImportFailuresRequest listImportFailuresRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportFailuresRequest, ListImportFailuresResult> asyncHandler);

    /**
     * <p>
     * Returns information on all imports, or a select set of imports by <code>ImportStatus</code> or
     * <code>Destination</code>.
     * </p>
     * 
     * @param listImportsRequest
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AWSCloudTrailAsync.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest);

    /**
     * <p>
     * Returns information on all imports, or a select set of imports by <code>ImportStatus</code> or
     * <code>Destination</code>.
     * </p>
     * 
     * @param listImportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler);

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest files within the specified time range.
     * The public key is needed to validate digest files that were signed with its corresponding private key.
     * </p>
     * <note>
     * <p>
     * CloudTrail uses different private and public key pairs per region. Each digest file is signed with a private key
     * unique to its region. When you validate a digest file from a specific region, you must look in the same region
     * for its corresponding public key.
     * </p>
     * </note>
     * 
     * @param listPublicKeysRequest
     *        Requests the public keys for a specified time range.
     * @return A Java Future containing the result of the ListPublicKeys operation returned by the service.
     * @sample AWSCloudTrailAsync.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest);

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest files within the specified time range.
     * The public key is needed to validate digest files that were signed with its corresponding private key.
     * </p>
     * <note>
     * <p>
     * CloudTrail uses different private and public key pairs per region. Each digest file is signed with a private key
     * unique to its region. When you validate a digest file from a specific region, you must look in the same region
     * for its corresponding public key.
     * </p>
     * </note>
     * 
     * @param listPublicKeysRequest
     *        Requests the public keys for a specified time range.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublicKeys operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest listPublicKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest)
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync();

    /**
     * Simplified method form for invoking the ListPublicKeys operation with an AsyncHandler.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler);

    /**
     * <p>
     * Returns a list of queries and query statuses for the past seven days. You must specify an ARN value for
     * <code>EventDataStore</code>. Optionally, to shorten the list of results, you can specify a time range, formatted
     * as timestamps, by adding <code>StartTime</code> and <code>EndTime</code> parameters, and a
     * <code>QueryStatus</code> value. Valid values for <code>QueryStatus</code> include <code>QUEUED</code>,
     * <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param listQueriesRequest
     * @return A Java Future containing the result of the ListQueries operation returned by the service.
     * @sample AWSCloudTrailAsync.ListQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(ListQueriesRequest listQueriesRequest);

    /**
     * <p>
     * Returns a list of queries and query statuses for the past seven days. You must specify an ARN value for
     * <code>EventDataStore</code>. Optionally, to shorten the list of results, you can specify a time range, formatted
     * as timestamps, by adding <code>StartTime</code> and <code>EndTime</code> parameters, and a
     * <code>QueryStatus</code> value. Valid values for <code>QueryStatus</code> include <code>QUEUED</code>,
     * <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param listQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueries operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(ListQueriesRequest listQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueriesRequest, ListQueriesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the trail or event data store in the current region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of tags to return.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudTrailAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists the tags for the trail or event data store in the current region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of tags to return.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Lists trails that are in the current account.
     * </p>
     * 
     * @param listTrailsRequest
     * @return A Java Future containing the result of the ListTrails operation returned by the service.
     * @sample AWSCloudTrailAsync.ListTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(ListTrailsRequest listTrailsRequest);

    /**
     * <p>
     * Lists trails that are in the current account.
     * </p>
     * 
     * @param listTrailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrails operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTrails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(ListTrailsRequest listTrailsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrailsRequest, ListTrailsResult> asyncHandler);

    /**
     * <p>
     * Looks up <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events"
     * >management events</a> or <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-insights-events"
     * >CloudTrail Insights events</a> that are captured by CloudTrail. You can look up events that occurred in a region
     * within the last 90 days. Lookup supports the following attributes for management events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services access key
     * </p>
     * </li>
     * <li>
     * <p>
     * Event ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Event name
     * </p>
     * </li>
     * <li>
     * <p>
     * Event source
     * </p>
     * </li>
     * <li>
     * <p>
     * Read only
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource name
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource type
     * </p>
     * </li>
     * <li>
     * <p>
     * User name
     * </p>
     * </li>
     * </ul>
     * <p>
     * Lookup supports the following attributes for Insights events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Event name
     * </p>
     * </li>
     * <li>
     * <p>
     * Event source
     * </p>
     * </li>
     * </ul>
     * <p>
     * All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The
     * response includes a token that you can use to get the next page of results.
     * </p>
     * <important>
     * <p>
     * The rate of lookup requests is limited to two per second, per account, per region. If this limit is exceeded, a
     * throttling error occurs.
     * </p>
     * </important>
     * 
     * @param lookupEventsRequest
     *        Contains a request for LookupEvents.
     * @return A Java Future containing the result of the LookupEvents operation returned by the service.
     * @sample AWSCloudTrailAsync.LookupEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest lookupEventsRequest);

    /**
     * <p>
     * Looks up <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events"
     * >management events</a> or <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-insights-events"
     * >CloudTrail Insights events</a> that are captured by CloudTrail. You can look up events that occurred in a region
     * within the last 90 days. Lookup supports the following attributes for management events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services access key
     * </p>
     * </li>
     * <li>
     * <p>
     * Event ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Event name
     * </p>
     * </li>
     * <li>
     * <p>
     * Event source
     * </p>
     * </li>
     * <li>
     * <p>
     * Read only
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource name
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource type
     * </p>
     * </li>
     * <li>
     * <p>
     * User name
     * </p>
     * </li>
     * </ul>
     * <p>
     * Lookup supports the following attributes for Insights events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Event ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Event name
     * </p>
     * </li>
     * <li>
     * <p>
     * Event source
     * </p>
     * </li>
     * </ul>
     * <p>
     * All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The
     * response includes a token that you can use to get the next page of results.
     * </p>
     * <important>
     * <p>
     * The rate of lookup requests is limited to two per second, per account, per region. If this limit is exceeded, a
     * throttling error occurs.
     * </p>
     * </important>
     * 
     * @param lookupEventsRequest
     *        Contains a request for LookupEvents.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LookupEvents operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.LookupEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest lookupEventsRequest,
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEventsAsync(LookupEventsRequest)
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync();

    /**
     * Simplified method form for invoking the LookupEvents operation with an AsyncHandler.
     *
     * @see #lookupEventsAsync(LookupEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler);

    /**
     * <p>
     * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event
     * selectors to specify management and data event settings for your trail. By default, trails created without
     * specific event selectors are configured to log all read and write management events, and no data events.
     * </p>
     * <p>
     * When an event occurs in your account, CloudTrail evaluates the event selectors or advanced event selectors in all
     * trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the
     * event doesn't match any event selector, the trail doesn't log the event.
     * </p>
     * <p>
     * Example
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create an event selector for a trail and specify that you want write-only events.
     * </p>
     * </li>
     * <li>
     * <p>
     * The EC2 <code>GetConsoleOutput</code> and <code>RunInstances</code> API operations occur in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudTrail evaluates whether the events match your event selectors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RunInstances</code> is a write-only event and it matches your event selector. The trail logs the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GetConsoleOutput</code> is a read-only event that doesn't match your event selector. The trail doesn't
     * log the event.
     * </p>
     * </li>
     * </ol>
     * <p>
     * The <code>PutEventSelectors</code> operation must be called from the region in which the trail was created;
     * otherwise, an <code>InvalidHomeRegionException</code> exception is thrown.
     * </p>
     * <p>
     * You can configure up to five event selectors for each trail. For more information, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events for trails </a>, <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html"
     * >Logging data events for trails </a>, and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Quotas in
     * CloudTrail</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * <p>
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500
     * values for all conditions and selectors on a trail. You can use either <code>AdvancedEventSelectors</code> or
     * <code>EventSelectors</code>, but not both. If you apply <code>AdvancedEventSelectors</code> to a trail, any
     * existing <code>EventSelectors</code> are overwritten. For more information about advanced event selectors, see <a
     * href
     * ="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">Logging
     * data events for trails</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param putEventSelectorsRequest
     * @return A Java Future containing the result of the PutEventSelectors operation returned by the service.
     * @sample AWSCloudTrailAsync.PutEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(PutEventSelectorsRequest putEventSelectorsRequest);

    /**
     * <p>
     * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event
     * selectors to specify management and data event settings for your trail. By default, trails created without
     * specific event selectors are configured to log all read and write management events, and no data events.
     * </p>
     * <p>
     * When an event occurs in your account, CloudTrail evaluates the event selectors or advanced event selectors in all
     * trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the
     * event doesn't match any event selector, the trail doesn't log the event.
     * </p>
     * <p>
     * Example
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create an event selector for a trail and specify that you want write-only events.
     * </p>
     * </li>
     * <li>
     * <p>
     * The EC2 <code>GetConsoleOutput</code> and <code>RunInstances</code> API operations occur in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudTrail evaluates whether the events match your event selectors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RunInstances</code> is a write-only event and it matches your event selector. The trail logs the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GetConsoleOutput</code> is a read-only event that doesn't match your event selector. The trail doesn't
     * log the event.
     * </p>
     * </li>
     * </ol>
     * <p>
     * The <code>PutEventSelectors</code> operation must be called from the region in which the trail was created;
     * otherwise, an <code>InvalidHomeRegionException</code> exception is thrown.
     * </p>
     * <p>
     * You can configure up to five event selectors for each trail. For more information, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events for trails </a>, <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html"
     * >Logging data events for trails </a>, and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Quotas in
     * CloudTrail</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * <p>
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500
     * values for all conditions and selectors on a trail. You can use either <code>AdvancedEventSelectors</code> or
     * <code>EventSelectors</code>, but not both. If you apply <code>AdvancedEventSelectors</code> to a trail, any
     * existing <code>EventSelectors</code> are overwritten. For more information about advanced event selectors, see <a
     * href
     * ="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">Logging
     * data events for trails</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param putEventSelectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventSelectors operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.PutEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(PutEventSelectorsRequest putEventSelectorsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventSelectorsRequest, PutEventSelectorsResult> asyncHandler);

    /**
     * <p>
     * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an
     * existing trail. You also use <code>PutInsightSelectors</code> to turn off Insights event logging, by passing an
     * empty list of insight types. The valid Insights event types in this release are <code>ApiErrorRateInsight</code>
     * and <code>ApiCallRateInsight</code>.
     * </p>
     * 
     * @param putInsightSelectorsRequest
     * @return A Java Future containing the result of the PutInsightSelectors operation returned by the service.
     * @sample AWSCloudTrailAsync.PutInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(PutInsightSelectorsRequest putInsightSelectorsRequest);

    /**
     * <p>
     * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an
     * existing trail. You also use <code>PutInsightSelectors</code> to turn off Insights event logging, by passing an
     * empty list of insight types. The valid Insights event types in this release are <code>ApiErrorRateInsight</code>
     * and <code>ApiCallRateInsight</code>.
     * </p>
     * 
     * @param putInsightSelectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInsightSelectors operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.PutInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(PutInsightSelectorsRequest putInsightSelectorsRequest,
            com.amazonaws.handlers.AsyncHandler<PutInsightSelectorsRequest, PutInsightSelectorsResult> asyncHandler);

    /**
     * <p>
     * Registers an organization’s member account as the CloudTrail delegated administrator.
     * </p>
     * 
     * @param registerOrganizationDelegatedAdminRequest
     *        Specifies an organization member account ID as a CloudTrail delegated administrator.
     * @return A Java Future containing the result of the RegisterOrganizationDelegatedAdmin operation returned by the
     *         service.
     * @sample AWSCloudTrailAsync.RegisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RegisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterOrganizationDelegatedAdminResult> registerOrganizationDelegatedAdminAsync(
            RegisterOrganizationDelegatedAdminRequest registerOrganizationDelegatedAdminRequest);

    /**
     * <p>
     * Registers an organization’s member account as the CloudTrail delegated administrator.
     * </p>
     * 
     * @param registerOrganizationDelegatedAdminRequest
     *        Specifies an organization member account ID as a CloudTrail delegated administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterOrganizationDelegatedAdmin operation returned by the
     *         service.
     * @sample AWSCloudTrailAsyncHandler.RegisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RegisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterOrganizationDelegatedAdminResult> registerOrganizationDelegatedAdminAsync(
            RegisterOrganizationDelegatedAdminRequest registerOrganizationDelegatedAdminRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterOrganizationDelegatedAdminRequest, RegisterOrganizationDelegatedAdminResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from a trail or event data store.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail or event data store.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AWSCloudTrailAsync.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified tags from a trail or event data store.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail or event data store.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

    /**
     * <p>
     * Restores a deleted event data store specified by <code>EventDataStore</code>, which accepts an event data store
     * ARN. You can only restore a deleted event data store within the seven-day wait period after deletion. Restoring
     * an event data store can take several minutes, depending on the size of the event data store.
     * </p>
     * 
     * @param restoreEventDataStoreRequest
     * @return A Java Future containing the result of the RestoreEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsync.RestoreEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RestoreEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(RestoreEventDataStoreRequest restoreEventDataStoreRequest);

    /**
     * <p>
     * Restores a deleted event data store specified by <code>EventDataStore</code>, which accepts an event data store
     * ARN. You can only restore a deleted event data store within the seven-day wait period after deletion. Restoring
     * an event data store can take several minutes, depending on the size of the event data store.
     * </p>
     * 
     * @param restoreEventDataStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.RestoreEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RestoreEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(RestoreEventDataStoreRequest restoreEventDataStoreRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreEventDataStoreRequest, RestoreEventDataStoreResult> asyncHandler);

    /**
     * <p>
     * Starts an import of logged trail events from a source S3 bucket to a destination event data store. By default,
     * CloudTrail only imports events contained in the S3 bucket's <code>CloudTrail</code> prefix and the prefixes
     * inside the <code>CloudTrail</code> prefix, and does not check prefixes for other Amazon Web Services services. If
     * you want to import CloudTrail events contained in another prefix, you must include the prefix in the
     * <code>S3LocationUri</code>. For more considerations about importing trail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-copy-trail-to-lake.html#cloudtrail-trail-copy-considerations"
     * >Considerations</a>.
     * </p>
     * <p>
     * When you start a new import, the <code>Destinations</code> and <code>ImportSource</code> parameters are required.
     * Before starting a new import, disable any access control lists (ACLs) attached to the source S3 bucket. For more
     * information about disabling ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling ownership of
     * objects and disabling ACLs for your bucket</a>.
     * </p>
     * <p>
     * When you retry an import, the <code>ImportID</code> parameter is required.
     * </p>
     * 
     * @param startImportRequest
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AWSCloudTrailAsync.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest);

    /**
     * <p>
     * Starts an import of logged trail events from a source S3 bucket to a destination event data store. By default,
     * CloudTrail only imports events contained in the S3 bucket's <code>CloudTrail</code> prefix and the prefixes
     * inside the <code>CloudTrail</code> prefix, and does not check prefixes for other Amazon Web Services services. If
     * you want to import CloudTrail events contained in another prefix, you must include the prefix in the
     * <code>S3LocationUri</code>. For more considerations about importing trail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-copy-trail-to-lake.html#cloudtrail-trail-copy-considerations"
     * >Considerations</a>.
     * </p>
     * <p>
     * When you start a new import, the <code>Destinations</code> and <code>ImportSource</code> parameters are required.
     * Before starting a new import, disable any access control lists (ACLs) attached to the source S3 bucket. For more
     * information about disabling ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling ownership of
     * objects and disabling ACLs for your bucket</a>.
     * </p>
     * <p>
     * When you retry an import, the <code>ImportID</code> parameter is required.
     * </p>
     * 
     * @param startImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler);

    /**
     * <p>
     * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is
     * enabled in all regions, this operation must be called from the region in which the trail was created. This
     * operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled
     * in all regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging Amazon Web Services API calls for an account.
     * @return A Java Future containing the result of the StartLogging operation returned by the service.
     * @sample AWSCloudTrailAsync.StartLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest startLoggingRequest);

    /**
     * <p>
     * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is
     * enabled in all regions, this operation must be called from the region in which the trail was created. This
     * operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled
     * in all regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging Amazon Web Services API calls for an account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLogging operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StartLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest startLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler);

    /**
     * <p>
     * Starts a CloudTrail Lake query. The required <code>QueryStatement</code> parameter provides your SQL query,
     * enclosed in single quotation marks. Use the optional <code>DeliveryS3Uri</code> parameter to deliver the query
     * results to an S3 bucket.
     * </p>
     * 
     * @param startQueryRequest
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AWSCloudTrailAsync.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Starts a CloudTrail Lake query. The required <code>QueryStatement</code> parameter provides your SQL query,
     * enclosed in single quotation marks. Use the optional <code>DeliveryS3Uri</code> parameter to deliver the query
     * results to an S3 bucket.
     * </p>
     * 
     * @param startQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler);

    /**
     * <p>
     * Stops a specified import.
     * </p>
     * 
     * @param stopImportRequest
     * @return A Java Future containing the result of the StopImport operation returned by the service.
     * @sample AWSCloudTrailAsync.StopImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopImportResult> stopImportAsync(StopImportRequest stopImportRequest);

    /**
     * <p>
     * Stops a specified import.
     * </p>
     * 
     * @param stopImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopImport operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StopImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopImportResult> stopImportAsync(StopImportRequest stopImportRequest,
            com.amazonaws.handlers.AsyncHandler<StopImportRequest, StopImportResult> asyncHandler);

    /**
     * <p>
     * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most
     * circumstances, there is no need to use this action. You can update a trail without stopping it first. This action
     * is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the
     * region in which the trail was created, or an <code>InvalidHomeRegionException</code> will occur. This operation
     * cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
     * </p>
     * 
     * @param stopLoggingRequest
     *        Passes the request to CloudTrail to stop logging Amazon Web Services API calls for the specified account.
     * @return A Java Future containing the result of the StopLogging operation returned by the service.
     * @sample AWSCloudTrailAsync.StopLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest stopLoggingRequest);

    /**
     * <p>
     * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most
     * circumstances, there is no need to use this action. You can update a trail without stopping it first. This action
     * is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the
     * region in which the trail was created, or an <code>InvalidHomeRegionException</code> will occur. This operation
     * cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
     * </p>
     * 
     * @param stopLoggingRequest
     *        Passes the request to CloudTrail to stop logging Amazon Web Services API calls for the specified account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopLogging operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StopLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopLogging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest stopLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler);

    /**
     * <p>
     * Updates an event data store. The required <code>EventDataStore</code> value is an ARN or the ID portion of the
     * ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws
     * an error. <code>RetentionPeriod</code> is in days, and valid values are integers between 90 and 2557. By default,
     * <code>TerminationProtection</code> is enabled. <code>AdvancedEventSelectors</code> includes or excludes
     * management and data events in your event data store; for more information about
     * <code>AdvancedEventSelectors</code>, see <a>PutEventSelectorsRequest$AdvancedEventSelectors</a>.
     * </p>
     * 
     * @param updateEventDataStoreRequest
     * @return A Java Future containing the result of the UpdateEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsync.UpdateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(UpdateEventDataStoreRequest updateEventDataStoreRequest);

    /**
     * <p>
     * Updates an event data store. The required <code>EventDataStore</code> value is an ARN or the ID portion of the
     * ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws
     * an error. <code>RetentionPeriod</code> is in days, and valid values are integers between 90 and 2557. By default,
     * <code>TerminationProtection</code> is enabled. <code>AdvancedEventSelectors</code> includes or excludes
     * management and data events in your event data store; for more information about
     * <code>AdvancedEventSelectors</code>, see <a>PutEventSelectorsRequest$AdvancedEventSelectors</a>.
     * </p>
     * 
     * @param updateEventDataStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventDataStore operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.UpdateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(UpdateEventDataStoreRequest updateEventDataStoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventDataStoreRequest, UpdateEventDataStoreResult> asyncHandler);

    /**
     * <p>
     * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail
     * do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery.
     * If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the
     * bucket. <code>UpdateTrail</code> must be called from the region in which the trail was created; otherwise, an
     * <code>InvalidHomeRegionException</code> is thrown.
     * </p>
     * 
     * @param updateTrailRequest
     *        Specifies settings to update for the trail.
     * @return A Java Future containing the result of the UpdateTrail operation returned by the service.
     * @sample AWSCloudTrailAsync.UpdateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest updateTrailRequest);

    /**
     * <p>
     * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail
     * do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery.
     * If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the
     * bucket. <code>UpdateTrail</code> must be called from the region in which the trail was created; otherwise, an
     * <code>InvalidHomeRegionException</code> is thrown.
     * </p>
     * 
     * @param updateTrailRequest
     *        Specifies settings to update for the trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrail operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.UpdateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest updateTrailRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler);

}
