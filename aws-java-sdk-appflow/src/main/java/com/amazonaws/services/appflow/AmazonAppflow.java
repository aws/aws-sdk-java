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
package com.amazonaws.services.appflow;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appflow.model.*;

/**
 * Interface for accessing Amazon Appflow.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appflow.AbstractAmazonAppflow} instead.
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
public interface AmazonAppflow {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appflow";

    /**
     * <p>
     * Creates a new connector profile associated with your AWS account. There is a soft quota of 100 connector profiles
     * per AWS account. If you need more connector profiles than this quota allows, you can submit a request to the
     * Amazon AppFlow team through the Amazon AppFlow support channel.
     * </p>
     * 
     * @param createConnectorProfileRequest
     * @return Result of the CreateConnectorProfile operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota (such as the number of flows) to be exceeded.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.CreateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConnectorProfileResult createConnectorProfile(CreateConnectorProfileRequest createConnectorProfileRequest);

    /**
     * <p>
     * Enables your application to create a new flow using Amazon AppFlow. You must create a connector profile before
     * calling this API. Please note that the Request Syntax below shows syntax for multiple destinations, however, you
     * can only transfer data to one item in this list at a time. Amazon AppFlow does not currently support flows to
     * multiple destinations at once.
     * </p>
     * 
     * @param createFlowRequest
     * @return Result of the CreateFlow operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota (such as the number of flows) to be exceeded.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws ConnectorServerException
     *         An error occurred when retrieving data from the connector endpoint.
     * @sample AmazonAppflow.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFlowResult createFlow(CreateFlowRequest createFlowRequest);

    /**
     * <p>
     * Enables you to delete an existing connector profile.
     * </p>
     * 
     * @param deleteConnectorProfileRequest
     * @return Result of the DeleteConnectorProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DeleteConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConnectorProfileResult deleteConnectorProfile(DeleteConnectorProfileRequest deleteConnectorProfileRequest);

    /**
     * <p>
     * Enables your application to delete an existing flow. Before deleting the flow, Amazon AppFlow validates the
     * request by checking the flow configuration and status. You can delete flows one at a time.
     * </p>
     * 
     * @param deleteFlowRequest
     * @return Result of the DeleteFlow operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFlowResult deleteFlow(DeleteFlowRequest deleteFlowRequest);

    /**
     * <p>
     * Provides details regarding the entity used with the connector, with a description of the data model for each
     * entity.
     * </p>
     * 
     * @param describeConnectorEntityRequest
     * @return Result of the DescribeConnectorEntity operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws ConnectorServerException
     *         An error occurred when retrieving data from the connector endpoint.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DescribeConnectorEntity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorEntity"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConnectorEntityResult describeConnectorEntity(DescribeConnectorEntityRequest describeConnectorEntityRequest);

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
     * @return Result of the DescribeConnectorProfiles operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DescribeConnectorProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConnectorProfilesResult describeConnectorProfiles(DescribeConnectorProfilesRequest describeConnectorProfilesRequest);

    /**
     * <p>
     * Describes the connectors vended by Amazon AppFlow for specified connector types. If you don't specify a connector
     * type, this operation describes all connectors vended by Amazon AppFlow. If there are more connectors than can be
     * returned in one page, the response contains a <code>nextToken</code> object, which can be be passed in to the
     * next call to the <code>DescribeConnectors</code> API operation to retrieve the next page.
     * </p>
     * 
     * @param describeConnectorsRequest
     * @return Result of the DescribeConnectors operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DescribeConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeConnectorsResult describeConnectors(DescribeConnectorsRequest describeConnectorsRequest);

    /**
     * <p>
     * Provides a description of the specified flow.
     * </p>
     * 
     * @param describeFlowRequest
     * @return Result of the DescribeFlow operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFlowResult describeFlow(DescribeFlowRequest describeFlowRequest);

    /**
     * <p>
     * Fetches the execution history of the flow.
     * </p>
     * 
     * @param describeFlowExecutionRecordsRequest
     * @return Result of the DescribeFlowExecutionRecords operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.DescribeFlowExecutionRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlowExecutionRecords"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFlowExecutionRecordsResult describeFlowExecutionRecords(DescribeFlowExecutionRecordsRequest describeFlowExecutionRecordsRequest);

    /**
     * <p>
     * Returns the list of available connector entities supported by Amazon AppFlow. For example, you can query
     * Salesforce for <i>Account</i> and <i>Opportunity</i> entities, or query ServiceNow for the <i>Incident</i>
     * entity.
     * </p>
     * 
     * @param listConnectorEntitiesRequest
     * @return Result of the ListConnectorEntities operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws ConnectorServerException
     *         An error occurred when retrieving data from the connector endpoint.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.ListConnectorEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListConnectorEntities" target="_top">AWS
     *      API Documentation</a>
     */
    ListConnectorEntitiesResult listConnectorEntities(ListConnectorEntitiesRequest listConnectorEntitiesRequest);

    /**
     * <p>
     * Lists all of the flows associated with your account.
     * </p>
     * 
     * @param listFlowsRequest
     * @return Result of the ListFlows operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    ListFlowsResult listFlows(ListFlowsRequest listFlowsRequest);

    /**
     * <p>
     * Retrieves the tags that are associated with a specified flow.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @sample AmazonAppflow.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Activates an existing flow. For on-demand flows, this operation runs the flow immediately. For schedule and
     * event-triggered flows, this operation activates the flow.
     * </p>
     * 
     * @param startFlowRequest
     * @return Result of the StartFlow operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota (such as the number of flows) to be exceeded.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @sample AmazonAppflow.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    StartFlowResult startFlow(StartFlowRequest startFlowRequest);

    /**
     * <p>
     * Deactivates the existing flow. For on-demand flows, this operation returns an
     * <code>unsupportedOperationException</code> error message. For schedule and event-triggered flows, this operation
     * deactivates the flow.
     * </p>
     * 
     * @param stopFlowRequest
     * @return Result of the StopFlow operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for the current flow.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    StopFlowResult stopFlow(StopFlowRequest stopFlowRequest);

    /**
     * <p>
     * Applies a tag to the specified flow.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @sample AmazonAppflow.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from the specified flow.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @sample AmazonAppflow.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a given connector profile associated with your account.
     * </p>
     * 
     * @param updateConnectorProfileRequest
     * @return Result of the UpdateConnectorProfile operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.UpdateConnectorProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateConnectorProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateConnectorProfileResult updateConnectorProfile(UpdateConnectorProfileRequest updateConnectorProfileRequest);

    /**
     * <p>
     * Updates an existing flow.
     * </p>
     * 
     * @param updateFlowRequest
     * @return Result of the UpdateFlow operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request (such as the source or destination connector profile) is not found.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota (such as the number of flows) to be exceeded.
     * @throws ConflictException
     *         There was a conflict when processing the request (for example, a flow with the given name already exists
     *         within the account. Check for conflicting resource names and try again.
     * @throws ConnectorAuthenticationException
     *         An error occurred when authenticating with the connector endpoint.
     * @throws ConnectorServerException
     *         An error occurred when retrieving data from the connector endpoint.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AmazonAppflow.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFlowResult updateFlow(UpdateFlowRequest updateFlowRequest);

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
