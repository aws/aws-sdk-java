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
package com.amazonaws.services.appflow;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;

/**
 * Interface for accessing Amazon Appflow asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appflow.AbstractAmazonAppflowAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the Amazon AppFlow API reference. This guide is for developers who need detailed information about the
 * Amazon AppFlow API operations, data types, and errors.
 * </p>
 * <p>
 * Amazon AppFlow is a fully managed integration service that enables you to securely transfer data between software as
 * a service (SaaS) applications like Salesforce, Marketo, Slack, and ServiceNow, and AWS services like Amazon S3 and
 * Amazon Redshift.
 * </p>
 * <p>
 * Use the following links to get started on the Amazon AppFlow API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/API_Operations.html">Actions</a>: An alphabetical list
 * of all Amazon AppFlow API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/API_Types.html">Data types</a>: An alphabetical list of
 * all Amazon AppFlow data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/CommonParameters.html">Common parameters</a>:
 * Parameters that all Query operations can use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/appflow/1.0/APIReference/CommonErrors.html">Common errors</a>: Client and server
 * errors that all operations can return.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you're new to Amazon AppFlow, we recommend that you review the <a
 * href="https://docs.aws.amazon.com/appflow/latest/userguide/what-is-appflow.html">Amazon AppFlow User Guide</a>.
 * </p>
 * <p>
 * Amazon AppFlow API users can use vendor-specific mechanisms for OAuth, and include applicable OAuth attributes (such
 * as <code>auth-code</code> and <code>redirecturi</code>) with the connector-specific
 * <code>ConnectorProfileProperties</code> when creating a new connector profile using Amazon AppFlow API operations.
 * For example, Salesforce users can refer to the <a
 * href="https://help.salesforce.com/articleView?id=remoteaccess_authenticate.htm"> <i>Authorize Apps with OAuth</i>
 * </a> documentation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppflowAsync extends AmazonAppflow {

    /**
     * <p>
     * Creates a new connector profile associated with your AWS account. There is a soft quota of 100 connector profiles
     * per AWS account. If you need more connector profiles than this quota allows, you can submit a request to the
     * Amazon AppFlow team through the Amazon AppFlow support channel.
     * </p>
     * 
     * @param createConnectorProfileRequest
     * @return A Java Future containing the result of the CreateConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsync.CreateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(CreateConnectorProfileRequest createConnectorProfileRequest);

    /**
     * <p>
     * Creates a new connector profile associated with your AWS account. There is a soft quota of 100 connector profiles
     * per AWS account. If you need more connector profiles than this quota allows, you can submit a request to the
     * Amazon AppFlow team through the Amazon AppFlow support channel.
     * </p>
     * 
     * @param createConnectorProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.CreateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectorProfileResult> createConnectorProfileAsync(CreateConnectorProfileRequest createConnectorProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectorProfileRequest, CreateConnectorProfileResult> asyncHandler);

    /**
     * <p>
     * Enables your application to create a new flow using Amazon AppFlow. You must create a connector profile before
     * calling this API. Please note that the Request Syntax below shows syntax for multiple destinations, however, you
     * can only transfer data to one item in this list at a time. Amazon AppFlow does not currently support flows to
     * multiple destinations at once.
     * </p>
     * 
     * @param createFlowRequest
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AmazonAppflowAsync.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest);

    /**
     * <p>
     * Enables your application to create a new flow using Amazon AppFlow. You must create a connector profile before
     * calling this API. Please note that the Request Syntax below shows syntax for multiple destinations, however, you
     * can only transfer data to one item in this list at a time. Amazon AppFlow does not currently support flows to
     * multiple destinations at once.
     * </p>
     * 
     * @param createFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler);

    /**
     * <p>
     * Enables you to delete an existing connector profile.
     * </p>
     * 
     * @param deleteConnectorProfileRequest
     * @return A Java Future containing the result of the DeleteConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsync.DeleteConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(DeleteConnectorProfileRequest deleteConnectorProfileRequest);

    /**
     * <p>
     * Enables you to delete an existing connector profile.
     * </p>
     * 
     * @param deleteConnectorProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DeleteConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectorProfileResult> deleteConnectorProfileAsync(DeleteConnectorProfileRequest deleteConnectorProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectorProfileRequest, DeleteConnectorProfileResult> asyncHandler);

    /**
     * <p>
     * Enables your application to delete an existing flow. Before deleting the flow, Amazon AppFlow validates the
     * request by checking the flow configuration and status. You can delete flows one at a time.
     * </p>
     * 
     * @param deleteFlowRequest
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AmazonAppflowAsync.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest);

    /**
     * <p>
     * Enables your application to delete an existing flow. Before deleting the flow, Amazon AppFlow validates the
     * request by checking the flow configuration and status. You can delete flows one at a time.
     * </p>
     * 
     * @param deleteFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler);

    /**
     * <p>
     * Provides details regarding the entity used with the connector, with a description of the data model for each
     * entity.
     * </p>
     * 
     * @param describeConnectorEntityRequest
     * @return A Java Future containing the result of the DescribeConnectorEntity operation returned by the service.
     * @sample AmazonAppflowAsync.DescribeConnectorEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorEntity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(DescribeConnectorEntityRequest describeConnectorEntityRequest);

    /**
     * <p>
     * Provides details regarding the entity used with the connector, with a description of the data model for each
     * entity.
     * </p>
     * 
     * @param describeConnectorEntityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectorEntity operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DescribeConnectorEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorEntity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorEntityResult> describeConnectorEntityAsync(DescribeConnectorEntityRequest describeConnectorEntityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorEntityRequest, DescribeConnectorEntityResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>connector-profile</code> details matching the provided <code>connector-profile</code>
     * names and <code>connector-types</code>. Both input lists are optional, and you can use them to filter the result.
     * </p>
     * <p>
     * If no names or <code>connector-types</code> are provided, returns all connector profiles in a paginated form. If
     * there is no match, this operation returns an empty list.
     * </p>
     * 
     * @param describeConnectorProfilesRequest
     * @return A Java Future containing the result of the DescribeConnectorProfiles operation returned by the service.
     * @sample AmazonAppflowAsync.DescribeConnectorProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(
            DescribeConnectorProfilesRequest describeConnectorProfilesRequest);

    /**
     * <p>
     * Returns a list of <code>connector-profile</code> details matching the provided <code>connector-profile</code>
     * names and <code>connector-types</code>. Both input lists are optional, and you can use them to filter the result.
     * </p>
     * <p>
     * If no names or <code>connector-types</code> are provided, returns all connector profiles in a paginated form. If
     * there is no match, this operation returns an empty list.
     * </p>
     * 
     * @param describeConnectorProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectorProfiles operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DescribeConnectorProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorProfilesResult> describeConnectorProfilesAsync(
            DescribeConnectorProfilesRequest describeConnectorProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorProfilesRequest, DescribeConnectorProfilesResult> asyncHandler);

    /**
     * <p>
     * Describes the connectors vended by Amazon AppFlow for specified connector types. If you don't specify a connector
     * type, this operation describes all connectors vended by Amazon AppFlow. If there are more connectors than can be
     * returned in one page, the response contains a <code>nextToken</code> object, which can be be passed in to the
     * next call to the <code>DescribeConnectors</code> API operation to retrieve the next page.
     * </p>
     * 
     * @param describeConnectorsRequest
     * @return A Java Future containing the result of the DescribeConnectors operation returned by the service.
     * @sample AmazonAppflowAsync.DescribeConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(DescribeConnectorsRequest describeConnectorsRequest);

    /**
     * <p>
     * Describes the connectors vended by Amazon AppFlow for specified connector types. If you don't specify a connector
     * type, this operation describes all connectors vended by Amazon AppFlow. If there are more connectors than can be
     * returned in one page, the response contains a <code>nextToken</code> object, which can be be passed in to the
     * next call to the <code>DescribeConnectors</code> API operation to retrieve the next page.
     * </p>
     * 
     * @param describeConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnectors operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DescribeConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectorsResult> describeConnectorsAsync(DescribeConnectorsRequest describeConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectorsRequest, DescribeConnectorsResult> asyncHandler);

    /**
     * <p>
     * Provides a description of the specified flow.
     * </p>
     * 
     * @param describeFlowRequest
     * @return A Java Future containing the result of the DescribeFlow operation returned by the service.
     * @sample AmazonAppflowAsync.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest describeFlowRequest);

    /**
     * <p>
     * Provides a description of the specified flow.
     * </p>
     * 
     * @param describeFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest describeFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler);

    /**
     * <p>
     * Fetches the execution history of the flow.
     * </p>
     * 
     * @param describeFlowExecutionRecordsRequest
     * @return A Java Future containing the result of the DescribeFlowExecutionRecords operation returned by the
     *         service.
     * @sample AmazonAppflowAsync.DescribeFlowExecutionRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlowExecutionRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(
            DescribeFlowExecutionRecordsRequest describeFlowExecutionRecordsRequest);

    /**
     * <p>
     * Fetches the execution history of the flow.
     * </p>
     * 
     * @param describeFlowExecutionRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFlowExecutionRecords operation returned by the
     *         service.
     * @sample AmazonAppflowAsyncHandler.DescribeFlowExecutionRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlowExecutionRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowExecutionRecordsResult> describeFlowExecutionRecordsAsync(
            DescribeFlowExecutionRecordsRequest describeFlowExecutionRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowExecutionRecordsRequest, DescribeFlowExecutionRecordsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of available connector entities supported by Amazon AppFlow. For example, you can query
     * Salesforce for <i>Account</i> and <i>Opportunity</i> entities, or query ServiceNow for the <i>Incident</i>
     * entity.
     * </p>
     * 
     * @param listConnectorEntitiesRequest
     * @return A Java Future containing the result of the ListConnectorEntities operation returned by the service.
     * @sample AmazonAppflowAsync.ListConnectorEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListConnectorEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(ListConnectorEntitiesRequest listConnectorEntitiesRequest);

    /**
     * <p>
     * Returns the list of available connector entities supported by Amazon AppFlow. For example, you can query
     * Salesforce for <i>Account</i> and <i>Opportunity</i> entities, or query ServiceNow for the <i>Incident</i>
     * entity.
     * </p>
     * 
     * @param listConnectorEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnectorEntities operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.ListConnectorEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListConnectorEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectorEntitiesResult> listConnectorEntitiesAsync(ListConnectorEntitiesRequest listConnectorEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectorEntitiesRequest, ListConnectorEntitiesResult> asyncHandler);

    /**
     * <p>
     * Lists all of the flows associated with your account.
     * </p>
     * 
     * @param listFlowsRequest
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AmazonAppflowAsync.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest);

    /**
     * <p>
     * Lists all of the flows associated with your account.
     * </p>
     * 
     * @param listFlowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the tags that are associated with a specified flow.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppflowAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the tags that are associated with a specified flow.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Activates an existing flow. For on-demand flows, this operation runs the flow immediately. For schedule and
     * event-triggered flows, this operation activates the flow.
     * </p>
     * 
     * @param startFlowRequest
     * @return A Java Future containing the result of the StartFlow operation returned by the service.
     * @sample AmazonAppflowAsync.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest startFlowRequest);

    /**
     * <p>
     * Activates an existing flow. For on-demand flows, this operation runs the flow immediately. For schedule and
     * event-triggered flows, this operation activates the flow.
     * </p>
     * 
     * @param startFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest startFlowRequest,
            com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler);

    /**
     * <p>
     * Deactivates the existing flow. For on-demand flows, this operation returns an
     * <code>unsupportedOperationException</code> error message. For schedule and event-triggered flows, this operation
     * deactivates the flow.
     * </p>
     * 
     * @param stopFlowRequest
     * @return A Java Future containing the result of the StopFlow operation returned by the service.
     * @sample AmazonAppflowAsync.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest stopFlowRequest);

    /**
     * <p>
     * Deactivates the existing flow. For on-demand flows, this operation returns an
     * <code>unsupportedOperationException</code> error message. For schedule and event-triggered flows, this operation
     * deactivates the flow.
     * </p>
     * 
     * @param stopFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest stopFlowRequest,
            com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler);

    /**
     * <p>
     * Applies a tag to the specified flow.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppflowAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies a tag to the specified flow.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from the specified flow.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppflowAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from the specified flow.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a given connector profile associated with your account.
     * </p>
     * 
     * @param updateConnectorProfileRequest
     * @return A Java Future containing the result of the UpdateConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsync.UpdateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(UpdateConnectorProfileRequest updateConnectorProfileRequest);

    /**
     * <p>
     * Updates a given connector profile associated with your account.
     * </p>
     * 
     * @param updateConnectorProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnectorProfile operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.UpdateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectorProfileResult> updateConnectorProfileAsync(UpdateConnectorProfileRequest updateConnectorProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectorProfileRequest, UpdateConnectorProfileResult> asyncHandler);

    /**
     * <p>
     * Updates an existing flow.
     * </p>
     * 
     * @param updateFlowRequest
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AmazonAppflowAsync.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest);

    /**
     * <p>
     * Updates an existing flow.
     * </p>
     * 
     * @param updateFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AmazonAppflowAsyncHandler.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler);

}
