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
package com.amazonaws.services.proton;

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

import com.amazonaws.services.proton.AWSProtonClientBuilder;
import com.amazonaws.services.proton.waiters.AWSProtonWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.services.proton.model.transform.*;

/**
 * Client for accessing AWS Proton. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This is the AWS Proton Service API Reference. It provides descriptions, syntax and usage examples for each of the <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Operations.html">actions</a> and <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Types.html">data types</a> for the AWS Proton
 * service.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response.
 * </p>
 * <p>
 * Alternatively, you can use the AWS CLI to access an API. For more information, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS Command Line Interface User
 * Guide</a>.
 * </p>
 * <p>
 * The AWS Proton service is a two-pronged automation framework. Administrators create service templates to provide
 * standardized infrastructure and deployment tooling for serverless and container based applications. Developers, in
 * turn, select from the available service templates to automate their application or service deployments.
 * </p>
 * <p>
 * Because administrators define the infrastructure and tooling that AWS Proton deploys and manages, they need
 * permissions to use all of the listed API operations.
 * </p>
 * <p>
 * When developers select a specific infrastructure and tooling set, AWS Proton deploys their applications. To monitor
 * their applications that are running on AWS Proton, developers need permissions to the service <i>create</i>,
 * <i>list</i>, <i>update</i> and <i>delete</i> API operations and the service instance <i>list</i> and <i>update</i>
 * API operations.
 * </p>
 * <p>
 * To learn more about AWS Proton administration, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/adminguide/Welcome.html">AWS Proton Administration Guide</a>.
 * </p>
 * <p>
 * To learn more about deploying serverless and containerized applications on AWS Proton, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/userguide/Welcome.html">AWS Proton User Guide</a>.
 * </p>
 * <p>
 * <b>Ensuring Idempotency</b>
 * </p>
 * <p>
 * When you make a mutating API request, the request typically returns a result before the asynchronous workflows of the
 * operation are complete. Operations might also time out or encounter other server issues before they're complete, even
 * if the request already returned a result. This might make it difficult to determine whether the request succeeded.
 * Moreover, you might need to retry the request multiple times to ensure that the operation completes successfully.
 * However, if the original request and the subsequent retries are successful, the operation occurs multiple times. This
 * means that you might create more resources than you intended.
 * </p>
 * <p>
 * <i>Idempotency</i> ensures that an API request action completes no more than one time. With an idempotent request, if
 * the original request action completes successfully, any subsequent retries complete successfully without performing
 * any further actions. However, the result might contain updated information, such as the current creation status.
 * </p>
 * <p>
 * The following lists of APIs are grouped according to methods that ensure idempotency.
 * </p>
 * <p>
 * <b>Idempotent create APIs with a client token</b>
 * </p>
 * <p>
 * The API actions in this list support idempotency with the use of a <i>client token</i>. The corresponding AWS CLI
 * commands also support idempotency using a client token. A client token is a unique, case-sensitive string of up to 64
 * ASCII characters. To make an idempotent API request using one of these actions, specify a client token in the
 * request. We recommend that you <i>don't</i> reuse the same client token for other API requests. If you don’t provide
 * a client token for these APIs, a default client token is automatically provided by SDKs.
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request using the same client token and the same parameters, the retry succeeds without performing
 * any further actions other than returning the original resource detail data in the response.
 * </p>
 * <p>
 * If you retry the request using the same client token, but one or more of the parameters are different, the retry
 * throws a <code>ValidationException</code> with an <code>IdempotentParameterMismatch</code> error.
 * </p>
 * <p>
 * Client tokens expire eight hours after a request is made. If you retry the request with the expired token, a new
 * resource is created.
 * </p>
 * <p>
 * If the original resource is deleted and you retry the request, a new resource is created.
 * </p>
 * <p>
 * Idempotent create APIs with a client token:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateEnvironmentTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateServiceTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateEnvironmentAccountConnection
 * </p>
 * </li>
 * </ul>
 * 
 * <pre>
 * <code> &lt;p&gt; &lt;b&gt;Idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;When you retry the request with an API from this group and the resource was deleted, its metadata is returned in the response.&lt;/p&gt; &lt;p&gt;If you retry and the resource doesn't exist, the response is empty.&lt;/p&gt; &lt;p&gt;In both cases, the retry succeeds.&lt;/p&gt; &lt;p&gt;Idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentAccountConnection&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Asynchronous idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;If you retry the request with an API from this group, if the original request delete operation status is &lt;code&gt;DELETE_IN_PROGRESS&lt;/code&gt;, the retry returns the resource detail data in the response without performing any further actions.&lt;/p&gt; &lt;p&gt;If the original request delete operation is complete, a retry returns an empty response.&lt;/p&gt; &lt;p&gt;Asynchronous idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironment&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteService&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSProtonClient extends AmazonWebServiceClient implements AWSProton {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSProton.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "proton";

    private volatile AWSProtonWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.proton.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.proton.model.AWSProtonException.class));

    public static AWSProtonClientBuilder builder() {
        return AWSProtonClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Proton using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSProtonClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Proton using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSProtonClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("proton.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/proton/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/proton/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * In a management account, an environment account connection request is accepted. When the environment account
     * connection request is accepted, AWS Proton can use the associated IAM role to provision environment
     * infrastructure resources in the associated environment account.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param acceptEnvironmentAccountConnectionRequest
     * @return Result of the AcceptEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.AcceptEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/AcceptEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptEnvironmentAccountConnectionResult acceptEnvironmentAccountConnection(AcceptEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final AcceptEnvironmentAccountConnectionResult executeAcceptEnvironmentAccountConnection(
            AcceptEnvironmentAccountConnectionRequest acceptEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptEnvironmentAccountConnectionRequest> request = null;
        Response<AcceptEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to cancel an environment deployment on an <a>UpdateEnvironment</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-update.html">Update an environment</a> in the
     * <i>AWS Proton Administration guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateEnvironment</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelEnvironmentDeploymentRequest
     * @return Result of the CancelEnvironmentDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelEnvironmentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelEnvironmentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelEnvironmentDeploymentResult cancelEnvironmentDeployment(CancelEnvironmentDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCancelEnvironmentDeployment(request);
    }

    @SdkInternalApi
    final CancelEnvironmentDeploymentResult executeCancelEnvironmentDeployment(CancelEnvironmentDeploymentRequest cancelEnvironmentDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelEnvironmentDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelEnvironmentDeploymentRequest> request = null;
        Response<CancelEnvironmentDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelEnvironmentDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelEnvironmentDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelEnvironmentDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelEnvironmentDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelEnvironmentDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to cancel a service instance deployment on an <a>UpdateServiceInstance</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <i>Update a service instance</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-instance-update.html">AWS Proton Administration
     * guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-instance-update.html">AWS
     * Proton User guide</a>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServiceInstance</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServiceInstanceDeploymentRequest
     * @return Result of the CancelServiceInstanceDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelServiceInstanceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServiceInstanceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelServiceInstanceDeploymentResult cancelServiceInstanceDeployment(CancelServiceInstanceDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCancelServiceInstanceDeployment(request);
    }

    @SdkInternalApi
    final CancelServiceInstanceDeploymentResult executeCancelServiceInstanceDeployment(
            CancelServiceInstanceDeploymentRequest cancelServiceInstanceDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelServiceInstanceDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelServiceInstanceDeploymentRequest> request = null;
        Response<CancelServiceInstanceDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelServiceInstanceDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelServiceInstanceDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelServiceInstanceDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelServiceInstanceDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelServiceInstanceDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to cancel a service pipeline deployment on an <a>UpdateServicePipeline</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <i>Update a service pipeline</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-svc-pipeline-update.html">AWS Proton Administration
     * guide</a> or the <a href="https://docs.aws.amazon.com/proton/latest/userguide/ug-svc-pipeline-update.html">AWS
     * Proton User guide</a>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServicePipeline</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServicePipelineDeploymentRequest
     * @return Result of the CancelServicePipelineDeployment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CancelServicePipelineDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServicePipelineDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelServicePipelineDeploymentResult cancelServicePipelineDeployment(CancelServicePipelineDeploymentRequest request) {
        request = beforeClientExecution(request);
        return executeCancelServicePipelineDeployment(request);
    }

    @SdkInternalApi
    final CancelServicePipelineDeploymentResult executeCancelServicePipelineDeployment(
            CancelServicePipelineDeploymentRequest cancelServicePipelineDeploymentRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelServicePipelineDeploymentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelServicePipelineDeploymentRequest> request = null;
        Response<CancelServicePipelineDeploymentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelServicePipelineDeploymentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelServicePipelineDeploymentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelServicePipelineDeployment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelServicePipelineDeploymentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelServicePipelineDeploymentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deploy a new environment. An AWS Proton environment is created from an environment template that defines
     * infrastructure and resources that can be shared across services. For more information, see the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-environments.html">Environments</a> in the <i>AWS
     * Proton Administration Guide.</i>
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironment(request);
    }

    @SdkInternalApi
    final CreateEnvironmentResult executeCreateEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an environment account connection in an environment account so that environment infrastructure resources
     * can be provisioned in the environment account from the management account.
     * </p>
     * <p>
     * An environment account connection is a secure bi-directional connection between a <i>management account</i> and
     * an <i>environment account</i> that maintains authorization and permissions. For more information, see <a
     * href="proton/latest/adminguide/ag-env-account-connections.html">Environment account connections</a> in the <i>AWS
     * Proton Administration guide</i>.
     * </p>
     * 
     * @param createEnvironmentAccountConnectionRequest
     * @return Result of the CreateEnvironmentAccountConnection operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentAccountConnectionResult createEnvironmentAccountConnection(CreateEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final CreateEnvironmentAccountConnectionResult executeCreateEnvironmentAccountConnection(
            CreateEnvironmentAccountConnectionRequest createEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentAccountConnectionRequest> request = null;
        Response<CreateEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an environment template for AWS Proton. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-env-templates.html">Environment Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * <p>
     * You can create an environment template in one of the two following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Register and publish a <i>standard</i> environment template that instructs AWS Proton to deploy and manage
     * environment infrastructure.
     * </p>
     * </li>
     * <li>
     * <p>
     * Register and publish a <i>customer managed</i> environment template that connects AWS Proton to your existing
     * provisioned infrastructure that you manage. AWS Proton <i>doesn't</i> manage your existing provisioned
     * infrastructure. To create an environment template for customer provisioned and managed infrastructure, include
     * the <code>provisioning</code> parameter and set the value to <code>CUSTOMER_MANAGED</code>. For more information,
     * see <a href="https://docs.aws.amazon.com/proton/latest/adminguide/env-template-v1.html">Register and publish an
     * environment template</a> in the <i>AWS Proton Administration Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEnvironmentTemplateRequest
     * @return Result of the CreateEnvironmentTemplate operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentTemplateResult createEnvironmentTemplate(CreateEnvironmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentTemplate(request);
    }

    @SdkInternalApi
    final CreateEnvironmentTemplateResult executeCreateEnvironmentTemplate(CreateEnvironmentTemplateRequest createEnvironmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentTemplateRequest> request = null;
        Response<CreateEnvironmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEnvironmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEnvironmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new major or minor version of an environment template. A major version of an environment template is a
     * version that <i>isn't</i> backwards compatible. A minor version of an environment template is a version that's
     * backwards compatible within its major version.
     * </p>
     * 
     * @param createEnvironmentTemplateVersionRequest
     * @return Result of the CreateEnvironmentTemplateVersion operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentTemplateVersionResult createEnvironmentTemplateVersion(CreateEnvironmentTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentTemplateVersion(request);
    }

    @SdkInternalApi
    final CreateEnvironmentTemplateVersionResult executeCreateEnvironmentTemplateVersion(
            CreateEnvironmentTemplateVersionRequest createEnvironmentTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentTemplateVersionRequest> request = null;
        Response<CreateEnvironmentTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEnvironmentTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEnvironmentTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an AWS Proton service. An AWS Proton service is an instantiation of a service template and often includes
     * several service instances and pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-services.html">Services</a> in the <i>AWS Proton
     * Administration Guide</i> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ug-service.html">Services</a> in the <i>AWS Proton User
     * Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return Result of the CreateService operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateService(request);
    }

    @SdkInternalApi
    final CreateServiceResult executeCreateService(CreateServiceRequest createServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceRequest> request = null;
        Response<CreateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a service template. The administrator creates a service template to define standardized infrastructure and
     * an optional CICD service pipeline. Developers, in turn, select the service template from AWS Proton. If the
     * selected service template includes a service pipeline definition, they provide a link to their source code
     * repository. AWS Proton then deploys and manages the infrastructure defined by the selected service template. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/managing-svc-templates.html">Service Templates</a> in
     * the <i>AWS Proton Administration Guide</i>.
     * </p>
     * 
     * @param createServiceTemplateRequest
     * @return Result of the CreateServiceTemplate operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateServiceTemplateResult createServiceTemplate(CreateServiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceTemplate(request);
    }

    @SdkInternalApi
    final CreateServiceTemplateResult executeCreateServiceTemplate(CreateServiceTemplateRequest createServiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceTemplateRequest> request = null;
        Response<CreateServiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateServiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new major or minor version of a service template. A major version of a service template is a version
     * that <i>isn't</i> backwards compatible. A minor version of a service template is a version that's backwards
     * compatible within its major version.
     * </p>
     * 
     * @param createServiceTemplateVersionRequest
     * @return Result of the CreateServiceTemplateVersion operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.CreateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServiceTemplateVersionResult createServiceTemplateVersion(CreateServiceTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServiceTemplateVersion(request);
    }

    @SdkInternalApi
    final CreateServiceTemplateVersionResult executeCreateServiceTemplateVersion(CreateServiceTemplateVersionRequest createServiceTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createServiceTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServiceTemplateVersionRequest> request = null;
        Response<CreateServiceTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServiceTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createServiceTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServiceTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServiceTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateServiceTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironment(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentResult executeDeleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentRequest> request = null;
        Response<DeleteEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * In an environment account, delete an environment account connection.
     * </p>
     * <p>
     * After you delete an environment account connection that’s in use by an AWS Proton environment, AWS Proton
     * <i>can’t</i> manage the environment infrastructure resources until a new environment account connection is
     * accepted for the environment account and associated environment. You're responsible for cleaning up provisioned
     * resources that remain without an environment connection.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param deleteEnvironmentAccountConnectionRequest
     * @return Result of the DeleteEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentAccountConnectionResult deleteEnvironmentAccountConnection(DeleteEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentAccountConnectionResult executeDeleteEnvironmentAccountConnection(
            DeleteEnvironmentAccountConnectionRequest deleteEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentAccountConnectionRequest> request = null;
        Response<DeleteEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If no other major or minor versions of an environment template exist, delete the environment template.
     * </p>
     * 
     * @param deleteEnvironmentTemplateRequest
     * @return Result of the DeleteEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentTemplateResult deleteEnvironmentTemplate(DeleteEnvironmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentTemplate(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentTemplateResult executeDeleteEnvironmentTemplate(DeleteEnvironmentTemplateRequest deleteEnvironmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentTemplateRequest> request = null;
        Response<DeleteEnvironmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEnvironmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If no other minor versions of an environment template exist, delete a major version of the environment template
     * if it's not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the environment
     * template if no other major versions or minor versions of the environment template exist. A major version of an
     * environment template is a version that's not backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of an environment template if it <i>isn't</i> the <code>Recommended</code> version. Delete
     * a <code>Recommended</code> minor version of the environment template if no other minor versions of the
     * environment template exist. A minor version of an environment template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteEnvironmentTemplateVersionRequest
     * @return Result of the DeleteEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentTemplateVersionResult deleteEnvironmentTemplateVersion(DeleteEnvironmentTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentTemplateVersion(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentTemplateVersionResult executeDeleteEnvironmentTemplateVersion(
            DeleteEnvironmentTemplateVersionRequest deleteEnvironmentTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentTemplateVersionRequest> request = null;
        Response<DeleteEnvironmentTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEnvironmentTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a service.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteService(request);
    }

    @SdkInternalApi
    final DeleteServiceResult executeDeleteService(DeleteServiceRequest deleteServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceRequest> request = null;
        Response<DeleteServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If no other major or minor versions of the service template exist, delete the service template.
     * </p>
     * 
     * @param deleteServiceTemplateRequest
     * @return Result of the DeleteServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteServiceTemplateResult deleteServiceTemplate(DeleteServiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceTemplate(request);
    }

    @SdkInternalApi
    final DeleteServiceTemplateResult executeDeleteServiceTemplate(DeleteServiceTemplateRequest deleteServiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceTemplateRequest> request = null;
        Response<DeleteServiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteServiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * If no other minor versions of a service template exist, delete a major version of the service template if it's
     * not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the service template if
     * no other major versions or minor versions of the service template exist. A major version of a service template is
     * a version that <i>isn't</i> backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of a service template if it's not the <code>Recommended</code> version. Delete a
     * <code>Recommended</code> minor version of the service template if no other minor versions of the service template
     * exist. A minor version of a service template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteServiceTemplateVersionRequest
     * @return Result of the DeleteServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.DeleteServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServiceTemplateVersionResult deleteServiceTemplateVersion(DeleteServiceTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServiceTemplateVersion(request);
    }

    @SdkInternalApi
    final DeleteServiceTemplateVersionResult executeDeleteServiceTemplateVersion(DeleteServiceTemplateVersionRequest deleteServiceTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServiceTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServiceTemplateVersionRequest> request = null;
        Response<DeleteServiceTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServiceTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServiceTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServiceTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServiceTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteServiceTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for the AWS Proton pipeline service role.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountSettings(request);
    }

    @SdkInternalApi
    final GetAccountSettingsResult executeGetAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountSettingsRequest> request = null;
        Response<GetAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEnvironmentResult getEnvironment(GetEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironment(request);
    }

    @SdkInternalApi
    final GetEnvironmentResult executeGetEnvironment(GetEnvironmentRequest getEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentRequest> request = null;
        Response<GetEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * In an environment account, view the detail data for an environment account connection.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param getEnvironmentAccountConnectionRequest
     * @return Result of the GetEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnvironmentAccountConnectionResult getEnvironmentAccountConnection(GetEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final GetEnvironmentAccountConnectionResult executeGetEnvironmentAccountConnection(
            GetEnvironmentAccountConnectionRequest getEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentAccountConnectionRequest> request = null;
        Response<GetEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateRequest
     * @return Result of the GetEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEnvironmentTemplateResult getEnvironmentTemplate(GetEnvironmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentTemplate(request);
    }

    @SdkInternalApi
    final GetEnvironmentTemplateResult executeGetEnvironmentTemplate(GetEnvironmentTemplateRequest getEnvironmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentTemplateRequest> request = null;
        Response<GetEnvironmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEnvironmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEnvironmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * View detail data for a major or minor version of an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateVersionRequest
     * @return Result of the GetEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEnvironmentTemplateVersionResult getEnvironmentTemplateVersion(GetEnvironmentTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetEnvironmentTemplateVersion(request);
    }

    @SdkInternalApi
    final GetEnvironmentTemplateVersionResult executeGetEnvironmentTemplateVersion(GetEnvironmentTemplateVersionRequest getEnvironmentTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getEnvironmentTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEnvironmentTemplateVersionRequest> request = null;
        Response<GetEnvironmentTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEnvironmentTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEnvironmentTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEnvironmentTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEnvironmentTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEnvironmentTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for a service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceResult getService(GetServiceRequest request) {
        request = beforeClientExecution(request);
        return executeGetService(request);
    }

    @SdkInternalApi
    final GetServiceResult executeGetService(GetServiceRequest getServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceRequest> request = null;
        Response<GetServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for a service instance. A service instance is an instantiation of service template, which is
     * running in a specific environment.
     * </p>
     * 
     * @param getServiceInstanceRequest
     * @return Result of the GetServiceInstance operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceInstanceResult getServiceInstance(GetServiceInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceInstance(request);
    }

    @SdkInternalApi
    final GetServiceInstanceResult executeGetServiceInstance(GetServiceInstanceRequest getServiceInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceInstanceRequest> request = null;
        Response<GetServiceInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detail data for a service template.
     * </p>
     * 
     * @param getServiceTemplateRequest
     * @return Result of the GetServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceTemplateResult getServiceTemplate(GetServiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceTemplate(request);
    }

    @SdkInternalApi
    final GetServiceTemplateResult executeGetServiceTemplate(GetServiceTemplateRequest getServiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceTemplateRequest> request = null;
        Response<GetServiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * View detail data for a major or minor version of a service template.
     * </p>
     * 
     * @param getServiceTemplateVersionRequest
     * @return Result of the GetServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.GetServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServiceTemplateVersionResult getServiceTemplateVersion(GetServiceTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceTemplateVersion(request);
    }

    @SdkInternalApi
    final GetServiceTemplateVersionResult executeGetServiceTemplateVersion(GetServiceTemplateVersionRequest getServiceTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceTemplateVersionRequest> request = null;
        Response<GetServiceTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServiceTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetServiceTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * View a list of environment account connections.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param listEnvironmentAccountConnectionsRequest
     * @return Result of the ListEnvironmentAccountConnections operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentAccountConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentAccountConnectionsResult listEnvironmentAccountConnections(ListEnvironmentAccountConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentAccountConnections(request);
    }

    @SdkInternalApi
    final ListEnvironmentAccountConnectionsResult executeListEnvironmentAccountConnections(
            ListEnvironmentAccountConnectionsRequest listEnvironmentAccountConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentAccountConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentAccountConnectionsRequest> request = null;
        Response<ListEnvironmentAccountConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentAccountConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentAccountConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentAccountConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentAccountConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnvironmentAccountConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List major or minor versions of an environment template with detail data.
     * </p>
     * 
     * @param listEnvironmentTemplateVersionsRequest
     * @return Result of the ListEnvironmentTemplateVersions operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentTemplateVersionsResult listEnvironmentTemplateVersions(ListEnvironmentTemplateVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentTemplateVersions(request);
    }

    @SdkInternalApi
    final ListEnvironmentTemplateVersionsResult executeListEnvironmentTemplateVersions(
            ListEnvironmentTemplateVersionsRequest listEnvironmentTemplateVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentTemplateVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentTemplateVersionsRequest> request = null;
        Response<ListEnvironmentTemplateVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentTemplateVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentTemplateVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentTemplateVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentTemplateVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnvironmentTemplateVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List environment templates.
     * </p>
     * 
     * @param listEnvironmentTemplatesRequest
     * @return Result of the ListEnvironmentTemplates operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEnvironmentTemplatesResult listEnvironmentTemplates(ListEnvironmentTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironmentTemplates(request);
    }

    @SdkInternalApi
    final ListEnvironmentTemplatesResult executeListEnvironmentTemplates(ListEnvironmentTemplatesRequest listEnvironmentTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentTemplatesRequest> request = null;
        Response<ListEnvironmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEnvironmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironmentTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEnvironmentTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List environments with detail data summaries.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironments(request);
    }

    @SdkInternalApi
    final ListEnvironmentsResult executeListEnvironments(ListEnvironmentsRequest listEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentsRequest> request = null;
        Response<ListEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List service instances with summaries of detail data.
     * </p>
     * 
     * @param listServiceInstancesRequest
     * @return Result of the ListServiceInstances operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListServiceInstancesResult listServiceInstances(ListServiceInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceInstances(request);
    }

    @SdkInternalApi
    final ListServiceInstancesResult executeListServiceInstances(ListServiceInstancesRequest listServiceInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceInstancesRequest> request = null;
        Response<ListServiceInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param listServiceTemplateVersionsRequest
     * @return Result of the ListServiceTemplateVersions operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServiceTemplateVersionsResult listServiceTemplateVersions(ListServiceTemplateVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceTemplateVersions(request);
    }

    @SdkInternalApi
    final ListServiceTemplateVersionsResult executeListServiceTemplateVersions(ListServiceTemplateVersionsRequest listServiceTemplateVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceTemplateVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceTemplateVersionsRequest> request = null;
        Response<ListServiceTemplateVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceTemplateVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServiceTemplateVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceTemplateVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceTemplateVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServiceTemplateVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List service templates with detail data.
     * </p>
     * 
     * @param listServiceTemplatesRequest
     * @return Result of the ListServiceTemplates operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServiceTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListServiceTemplatesResult listServiceTemplates(ListServiceTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListServiceTemplates(request);
    }

    @SdkInternalApi
    final ListServiceTemplatesResult executeListServiceTemplates(ListServiceTemplatesRequest listServiceTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServiceTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServiceTemplatesRequest> request = null;
        Response<ListServiceTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServiceTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServiceTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServiceTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServiceTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServiceTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List services with summaries of detail data.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListServices(request);
    }

    @SdkInternalApi
    final ListServicesResult executeListServices(ListServicesRequest listServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicesRequest> request = null;
        Response<ListServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags for a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
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
     * In a management account, reject an environment account connection from another environment account.
     * </p>
     * <p>
     * After you reject an environment account connection request, you <i>won’t</i> be able to accept or use the
     * rejected environment account connection.
     * </p>
     * <p>
     * You <i>can’t</i> reject an environment account connection that is connected to an environment.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param rejectEnvironmentAccountConnectionRequest
     * @return Result of the RejectEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.RejectEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RejectEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectEnvironmentAccountConnectionResult rejectEnvironmentAccountConnection(RejectEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeRejectEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final RejectEnvironmentAccountConnectionResult executeRejectEnvironmentAccountConnection(
            RejectEnvironmentAccountConnectionRequest rejectEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectEnvironmentAccountConnectionRequest> request = null;
        Response<RejectEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tag a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
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
     * Remove a tag from a resource. For more information, see <i>AWS Proton resources and tagging</i> in the <a
     * href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration Guide</a> or
     * <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
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
     * Update the AWS Proton pipeline service account settings.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountSettings(request);
    }

    @SdkInternalApi
    final UpdateAccountSettingsResult executeUpdateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountSettingsRequest> request = null;
        Response<UpdateAccountSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAccountSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountSettingsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateAccountSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an environment.
     * </p>
     * <p>
     * If the environment is associated with an environment account connection, <i>don't</i> update or include the
     * <code>protonServiceRoleArn</code> parameter to update or connect to an environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     * <p>
     * If the environment <i>isn't</i> associated with an environment account connection, <i>don't</i> update or include
     * the <code>environmentAccountConnectionId</code> parameter to update or connect to an environment account
     * connection.
     * </p>
     * <p>
     * You can update either the <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code>
     * parameter and value. You can’t update both.
     * </p>
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that's higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * In an environment account, update an environment account connection to use a new IAM role.
     * </p>
     * <p>
     * For more information, see <a href="proton/latest/adminguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>AWS Proton Administration guide</i>.
     * </p>
     * 
     * @param updateEnvironmentAccountConnectionRequest
     * @return Result of the UpdateEnvironmentAccountConnection operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentAccountConnectionResult updateEnvironmentAccountConnection(UpdateEnvironmentAccountConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironmentAccountConnection(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentAccountConnectionResult executeUpdateEnvironmentAccountConnection(
            UpdateEnvironmentAccountConnectionRequest updateEnvironmentAccountConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentAccountConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentAccountConnectionRequest> request = null;
        Response<UpdateEnvironmentAccountConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentAccountConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEnvironmentAccountConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironmentAccountConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentAccountConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnvironmentAccountConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateRequest
     * @return Result of the UpdateEnvironmentTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentTemplateResult updateEnvironmentTemplate(UpdateEnvironmentTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironmentTemplate(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentTemplateResult executeUpdateEnvironmentTemplate(UpdateEnvironmentTemplateRequest updateEnvironmentTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentTemplateRequest> request = null;
        Response<UpdateEnvironmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEnvironmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironmentTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnvironmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a major or minor version of an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateVersionRequest
     * @return Result of the UpdateEnvironmentTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentTemplateVersionResult updateEnvironmentTemplateVersion(UpdateEnvironmentTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironmentTemplateVersion(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentTemplateVersionResult executeUpdateEnvironmentTemplateVersion(
            UpdateEnvironmentTemplateVersionRequest updateEnvironmentTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentTemplateVersionRequest> request = null;
        Response<UpdateEnvironmentTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEnvironmentTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironmentTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnvironmentTemplateVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Edit a service description or use a spec to add and delete service instances.
     * </p>
     * <note>
     * <p>
     * Existing service instances and the service pipeline <i>can't</i> be edited using this API. They can only be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Use the <code>description</code> parameter to modify the description.
     * </p>
     * <p>
     * Edit the <code>spec</code> parameter to add or delete instances.
     * </p>
     * 
     * @param updateServiceRequest
     * @return Result of the UpdateService operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         A quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/proton/latest/adminguide/ag-limits.html">AWS Proton Quotas</a> in the
     *         <i>AWS Proton Administration Guide</i>.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateService(request);
    }

    @SdkInternalApi
    final UpdateServiceResult executeUpdateService(UpdateServiceRequest updateServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceRequest> request = null;
        Response<UpdateServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a service instance.
     * </p>
     * <p>
     * There are four modes for updating a service instance as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service instance is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template, by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServiceInstanceRequest
     * @return Result of the UpdateServiceInstance operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateServiceInstanceResult updateServiceInstance(UpdateServiceInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceInstance(request);
    }

    @SdkInternalApi
    final UpdateServiceInstanceResult executeUpdateServiceInstance(UpdateServiceInstanceRequest updateServiceInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceInstanceRequest> request = null;
        Response<UpdateServiceInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceInstanceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateServiceInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the service pipeline.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline as described in the following. The
     * <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can also specify a different minor version of the current
     * major version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template by default. You can also specify a different major version that is higher
     * than the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServicePipelineRequest
     * @return Result of the UpdateServicePipeline operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServicePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServicePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateServicePipelineResult updateServicePipeline(UpdateServicePipelineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServicePipeline(request);
    }

    @SdkInternalApi
    final UpdateServicePipelineResult executeUpdateServicePipeline(UpdateServicePipelineRequest updateServicePipelineRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServicePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServicePipelineRequest> request = null;
        Response<UpdateServicePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServicePipelineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServicePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServicePipeline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServicePipelineResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateServicePipelineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a service template.
     * </p>
     * 
     * @param updateServiceTemplateRequest
     * @return Result of the UpdateServiceTemplate operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateServiceTemplateResult updateServiceTemplate(UpdateServiceTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceTemplate(request);
    }

    @SdkInternalApi
    final UpdateServiceTemplateResult executeUpdateServiceTemplate(UpdateServiceTemplateRequest updateServiceTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceTemplateRequest> request = null;
        Response<UpdateServiceTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceTemplateResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateServiceTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a major or minor version of a service template.
     * </p>
     * 
     * @param updateServiceTemplateVersionRequest
     * @return Result of the UpdateServiceTemplateVersion operation returned by the service.
     * @throws ValidationException
     *         The input is invalid or an out-of-range value was supplied for the input parameter.
     * @throws AccessDeniedException
     *         There <i>isn't</i> sufficient access for performing this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The request <i>couldn't</i> be made due to a conflicting operation or resource.
     * @throws ResourceNotFoundException
     *         The requested resource <i>wasn't</i> found.
     * @throws InternalServerException
     *         The request failed to register with the service.
     * @sample AWSProton.UpdateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServiceTemplateVersionResult updateServiceTemplateVersion(UpdateServiceTemplateVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceTemplateVersion(request);
    }

    @SdkInternalApi
    final UpdateServiceTemplateVersionResult executeUpdateServiceTemplateVersion(UpdateServiceTemplateVersionRequest updateServiceTemplateVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceTemplateVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceTemplateVersionRequest> request = null;
        Response<UpdateServiceTemplateVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceTemplateVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServiceTemplateVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Proton");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceTemplateVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceTemplateVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServiceTemplateVersionResultJsonUnmarshaller());
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
    public AWSProtonWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSProtonWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
