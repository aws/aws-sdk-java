/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.launchwizard;

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

import com.amazonaws.services.launchwizard.AWSLaunchWizardClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.launchwizard.model.*;

import com.amazonaws.services.launchwizard.model.transform.*;

/**
 * Client for accessing AWS Launch Wizard. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Launch Wizard offers a guided way of sizing, configuring, and deploying Amazon Web Services resources for third party
 * applications, such as Microsoft SQL Server Always On and HANA based SAP systems, without the need to manually
 * identify and provision individual Amazon Web Services resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLaunchWizardClient extends AmazonWebServiceClient implements AWSLaunchWizard {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSLaunchWizard.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "launchwizard";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.launchwizard.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.launchwizard.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.launchwizard.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitException").withExceptionUnmarshaller(
                                    com.amazonaws.services.launchwizard.model.transform.ResourceLimitExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.launchwizard.model.AWSLaunchWizardException.class));

    public static AWSLaunchWizardClientBuilder builder() {
        return AWSLaunchWizardClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Launch Wizard using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLaunchWizardClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Launch Wizard using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSLaunchWizardClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("launchwizard.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/launchwizard/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/launchwizard/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a deployment for the given workload. Deployments created by this operation are not available in the
     * Launch Wizard console to use the <code>Clone deployment</code> action on.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ResourceLimitException
     *         You have exceeded an Launch Wizard resource limit. For example, you might have too many deployments in
     *         progress.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDeployment(request);
    }

    @SdkInternalApi
    final CreateDeploymentResult executeCreateDeployment(CreateDeploymentRequest createDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeploymentRequest> request = null;
        Response<CreateDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.DeleteDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeleteDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeploymentResult deleteDeployment(DeleteDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDeployment(request);
    }

    @SdkInternalApi
    final DeleteDeploymentResult executeDeleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeploymentRequest> request = null;
        Response<DeleteDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployment(request);
    }

    @SdkInternalApi
    final GetDeploymentResult executeGetDeployment(GetDeploymentRequest getDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeploymentRequest> request = null;
        Response<GetDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a workload.
     * </p>
     * 
     * @param getWorkloadRequest
     * @return Result of the GetWorkload operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetWorkload" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetWorkloadResult getWorkload(GetWorkloadRequest request) {
        request = beforeClientExecution(request);
        return executeGetWorkload(request);
    }

    @SdkInternalApi
    final GetWorkloadResult executeGetWorkload(GetWorkloadRequest getWorkloadRequest) {

        ExecutionContext executionContext = createExecutionContext(getWorkloadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetWorkloadRequest> request = null;
        Response<GetWorkloadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetWorkloadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getWorkloadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetWorkload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetWorkloadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetWorkloadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the events of a deployment.
     * </p>
     * 
     * @param listDeploymentEventsRequest
     * @return Result of the ListDeploymentEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.ListDeploymentEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeploymentEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeploymentEventsResult listDeploymentEvents(ListDeploymentEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeploymentEvents(request);
    }

    @SdkInternalApi
    final ListDeploymentEventsResult executeListDeploymentEvents(ListDeploymentEventsRequest listDeploymentEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentEventsRequest> request = null;
        Response<ListDeploymentEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeploymentEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the deployments that have been created.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSLaunchWizard.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDeploymentsResult listDeployments(ListDeploymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeployments(request);
    }

    @SdkInternalApi
    final ListDeploymentsResult executeListDeployments(ListDeploymentsRequest listDeploymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeploymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeploymentsRequest> request = null;
        Response<ListDeploymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeploymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeploymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeployments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDeploymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeploymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the workload deployment patterns.
     * </p>
     * 
     * @param listWorkloadDeploymentPatternsRequest
     * @return Result of the ListWorkloadDeploymentPatterns operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.ListWorkloadDeploymentPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloadDeploymentPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkloadDeploymentPatternsResult listWorkloadDeploymentPatterns(ListWorkloadDeploymentPatternsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkloadDeploymentPatterns(request);
    }

    @SdkInternalApi
    final ListWorkloadDeploymentPatternsResult executeListWorkloadDeploymentPatterns(ListWorkloadDeploymentPatternsRequest listWorkloadDeploymentPatternsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkloadDeploymentPatternsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkloadDeploymentPatternsRequest> request = null;
        Response<ListWorkloadDeploymentPatternsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkloadDeploymentPatternsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorkloadDeploymentPatternsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkloadDeploymentPatterns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkloadDeploymentPatternsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkloadDeploymentPatternsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     * @return Result of the ListWorkloads operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSLaunchWizard.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWorkloadsResult listWorkloads(ListWorkloadsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkloads(request);
    }

    @SdkInternalApi
    final ListWorkloadsResult executeListWorkloads(ListWorkloadsRequest listWorkloadsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkloadsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkloadsRequest> request = null;
        Response<ListWorkloadsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkloadsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkloadsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Launch Wizard");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkloads");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkloadsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkloadsResultJsonUnmarshaller());
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
