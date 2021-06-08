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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.appflow.AmazonAppflowClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.services.appflow.model.transform.*;

/**
 * Client for accessing Amazon Appflow. All service calls made using this client are blocking, and will not return until
 * the service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppflowClient extends AmazonWebServiceClient implements AmazonAppflow {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAppflow.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appflow";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConnectorServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ConnectorServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConnectorAuthenticationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.appflow.model.transform.ConnectorAuthenticationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appflow.model.AmazonAppflowException.class));

    public static AmazonAppflowClientBuilder builder() {
        return AmazonAppflowClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Appflow using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAppflowClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Appflow using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAppflowClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appflow.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appflow/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appflow/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public CreateConnectorProfileResult createConnectorProfile(CreateConnectorProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnectorProfile(request);
    }

    @SdkInternalApi
    final CreateConnectorProfileResult executeCreateConnectorProfile(CreateConnectorProfileRequest createConnectorProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectorProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectorProfileRequest> request = null;
        Response<CreateConnectorProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectorProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectorProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnectorProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectorProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConnectorProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateFlowResult createFlow(CreateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFlow(request);
    }

    @SdkInternalApi
    final CreateFlowResult executeCreateFlow(CreateFlowRequest createFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(createFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFlowRequest> request = null;
        Response<CreateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteConnectorProfileResult deleteConnectorProfile(DeleteConnectorProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnectorProfile(request);
    }

    @SdkInternalApi
    final DeleteConnectorProfileResult executeDeleteConnectorProfile(DeleteConnectorProfileRequest deleteConnectorProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectorProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectorProfileRequest> request = null;
        Response<DeleteConnectorProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectorProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectorProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnectorProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectorProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConnectorProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteFlowResult deleteFlow(DeleteFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFlow(request);
    }

    @SdkInternalApi
    final DeleteFlowResult executeDeleteFlow(DeleteFlowRequest deleteFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFlowRequest> request = null;
        Response<DeleteFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeConnectorEntityResult describeConnectorEntity(DescribeConnectorEntityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectorEntity(request);
    }

    @SdkInternalApi
    final DescribeConnectorEntityResult executeDescribeConnectorEntity(DescribeConnectorEntityRequest describeConnectorEntityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectorEntityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectorEntityRequest> request = null;
        Response<DescribeConnectorEntityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectorEntityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConnectorEntityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectorEntity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectorEntityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConnectorEntityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeConnectorProfilesResult describeConnectorProfiles(DescribeConnectorProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectorProfiles(request);
    }

    @SdkInternalApi
    final DescribeConnectorProfilesResult executeDescribeConnectorProfiles(DescribeConnectorProfilesRequest describeConnectorProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectorProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectorProfilesRequest> request = null;
        Response<DescribeConnectorProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectorProfilesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConnectorProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectorProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectorProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConnectorProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeConnectorsResult describeConnectors(DescribeConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectors(request);
    }

    @SdkInternalApi
    final DescribeConnectorsResult executeDescribeConnectors(DescribeConnectorsRequest describeConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectorsRequest> request = null;
        Response<DescribeConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeFlowResult describeFlow(DescribeFlowRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFlow(request);
    }

    @SdkInternalApi
    final DescribeFlowResult executeDescribeFlow(DescribeFlowRequest describeFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowRequest> request = null;
        Response<DescribeFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFlowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeFlowExecutionRecordsResult describeFlowExecutionRecords(DescribeFlowExecutionRecordsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFlowExecutionRecords(request);
    }

    @SdkInternalApi
    final DescribeFlowExecutionRecordsResult executeDescribeFlowExecutionRecords(DescribeFlowExecutionRecordsRequest describeFlowExecutionRecordsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFlowExecutionRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFlowExecutionRecordsRequest> request = null;
        Response<DescribeFlowExecutionRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFlowExecutionRecordsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFlowExecutionRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFlowExecutionRecords");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFlowExecutionRecordsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFlowExecutionRecordsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListConnectorEntitiesResult listConnectorEntities(ListConnectorEntitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListConnectorEntities(request);
    }

    @SdkInternalApi
    final ListConnectorEntitiesResult executeListConnectorEntities(ListConnectorEntitiesRequest listConnectorEntitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectorEntitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectorEntitiesRequest> request = null;
        Response<ListConnectorEntitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectorEntitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectorEntitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnectorEntities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectorEntitiesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListConnectorEntitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListFlowsResult listFlows(ListFlowsRequest request) {
        request = beforeClientExecution(request);
        return executeListFlows(request);
    }

    @SdkInternalApi
    final ListFlowsResult executeListFlows(ListFlowsRequest listFlowsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFlowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFlowsRequest> request = null;
        Response<ListFlowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFlowsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFlowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFlows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFlowsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFlowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartFlowResult startFlow(StartFlowRequest request) {
        request = beforeClientExecution(request);
        return executeStartFlow(request);
    }

    @SdkInternalApi
    final StartFlowResult executeStartFlow(StartFlowRequest startFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(startFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartFlowRequest> request = null;
        Response<StartFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StopFlowResult stopFlow(StopFlowRequest request) {
        request = beforeClientExecution(request);
        return executeStopFlow(request);
    }

    @SdkInternalApi
    final StopFlowResult executeStopFlow(StopFlowRequest stopFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(stopFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopFlowRequest> request = null;
        Response<StopFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateConnectorProfileResult updateConnectorProfile(UpdateConnectorProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnectorProfile(request);
    }

    @SdkInternalApi
    final UpdateConnectorProfileResult executeUpdateConnectorProfile(UpdateConnectorProfileRequest updateConnectorProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectorProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectorProfileRequest> request = null;
        Response<UpdateConnectorProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectorProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConnectorProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConnectorProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectorProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConnectorProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateFlowResult updateFlow(UpdateFlowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFlow(request);
    }

    @SdkInternalApi
    final UpdateFlowResult executeUpdateFlow(UpdateFlowRequest updateFlowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFlowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFlowRequest> request = null;
        Response<UpdateFlowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFlowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFlowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Appflow");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFlow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFlowResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFlowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
