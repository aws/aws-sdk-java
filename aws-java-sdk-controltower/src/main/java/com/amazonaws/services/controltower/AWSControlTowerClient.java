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
package com.amazonaws.services.controltower;

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

import com.amazonaws.services.controltower.AWSControlTowerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.controltower.model.*;
import com.amazonaws.services.controltower.model.transform.*;

/**
 * Client for accessing AWS Control Tower. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * These interfaces allow you to apply the AWS library of pre-defined <i>controls</i> to your organizational units,
 * programmatically. In this context, controls are the same as AWS Control Tower guardrails.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>ControlARN</code> for the control--that is, the guardrail--you are targeting,
 * </p>
 * </li>
 * <li>
 * <p>
 * and the ARN associated with the target organizational unit (OU).
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>ControlARN</code> for your AWS Control Tower guardrail:</b>
 * </p>
 * <p>
 * The <code>ControlARN</code> contains the control name which is specified in each guardrail. For a list of control
 * names for <i>Strongly recommended</i> and <i>Elective</i> guardrails, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and guardrails</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/automating-tasks.html">Automating tasks section</a>
 * of the AWS Control Tower User Guide. Remember that <i>Mandatory</i> guardrails cannot be added or removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the ARN for an OU:</b>
 * </p>
 * <p>
 * In the AWS Organizations console, you can find the ARN for the OU on the <b>Organizational unit details</b> page
 * associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of resource
 * identifiers for APIs and guardrails</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/guardrail-api-examples-short.html">Guardrail API
 * examples (CLI)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with AWS
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating AWS Control Tower resources with AWS CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Control Tower supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by CloudTrail, you can determine which requests the AWS
 * Control Tower service received, who made the request and when, and so on. For more about AWS Control Tower and its
 * support for CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging AWS Control
 * Tower Actions with AWS CloudTrail</a> in the AWS Control Tower User Guide. To learn more about CloudTrail, including
 * how to turn it on and find your log files, see the AWS CloudTrail User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSControlTowerClient extends AmazonWebServiceClient implements AWSControlTower {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSControlTower.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "controltower";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.controltower.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.controltower.model.AWSControlTowerException.class));

    public static AWSControlTowerClientBuilder builder() {
        return AWSControlTowerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Control Tower using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSControlTowerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Control Tower using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSControlTowerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("controltower.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/controltower/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/controltower/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the
     * specified organizational unit and the accounts it contains. The resources will vary according to the control that
     * you specify.
     * </p>
     * 
     * @param disableControlRequest
     * @return Result of the DisableControl operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisableControlResult disableControl(DisableControlRequest request) {
        request = beforeClientExecution(request);
        return executeDisableControl(request);
    }

    @SdkInternalApi
    final DisableControlResult executeDisableControl(DisableControlRequest disableControlRequest) {

        ExecutionContext executionContext = createExecutionContext(disableControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableControlRequest> request = null;
        Response<DisableControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates AWS resources on the
     * specified organizational unit and the accounts it contains. The resources created will vary according to the
     * control that you specify.
     * </p>
     * 
     * @param enableControlRequest
     * @return Result of the EnableControl operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableControlResult enableControl(EnableControlRequest request) {
        request = beforeClientExecution(request);
        return executeEnableControl(request);
    }

    @SdkInternalApi
    final EnableControlResult executeEnableControl(EnableControlRequest enableControlRequest) {

        ExecutionContext executionContext = createExecutionContext(enableControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableControlRequest> request = null;
        Response<EnableControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days.
     * </p>
     * 
     * @param getControlOperationRequest
     * @return Result of the GetControlOperation operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetControlOperationResult getControlOperation(GetControlOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetControlOperation(request);
    }

    @SdkInternalApi
    final GetControlOperationResult executeGetControlOperation(GetControlOperationRequest getControlOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getControlOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetControlOperationRequest> request = null;
        Response<GetControlOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetControlOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getControlOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetControlOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetControlOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetControlOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains.
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @return Result of the ListEnabledControls operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @sample AWSControlTower.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnabledControlsResult listEnabledControls(ListEnabledControlsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnabledControls(request);
    }

    @SdkInternalApi
    final ListEnabledControlsResult executeListEnabledControls(ListEnabledControlsRequest listEnabledControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnabledControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnabledControlsRequest> request = null;
        Response<ListEnabledControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnabledControlsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnabledControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ControlTower");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnabledControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnabledControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnabledControlsResultJsonUnmarshaller());
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
