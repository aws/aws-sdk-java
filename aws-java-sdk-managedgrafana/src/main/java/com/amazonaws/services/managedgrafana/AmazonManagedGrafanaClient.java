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
package com.amazonaws.services.managedgrafana;

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

import com.amazonaws.services.managedgrafana.AmazonManagedGrafanaClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.services.managedgrafana.model.transform.*;

/**
 * Client for accessing Amazon Managed Grafana. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon Managed Grafana is a fully managed and secure data visualization service that you can use to instantly query,
 * correlate, and visualize operational metrics, logs, and traces from multiple sources. Amazon Managed Grafana makes it
 * easy to deploy, operate, and scale Grafana, a widely deployed data visualization tool that is popular for its
 * extensible data support.
 * </p>
 * <p>
 * With Amazon Managed Grafana, you create logically isolated Grafana servers called <i>workspaces</i>. In a workspace,
 * you can create Grafana dashboards and visualizations to analyze your metrics, logs, and traces without having to
 * build, package, or deploy any hardware to run Grafana servers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonManagedGrafanaClient extends AmazonWebServiceClient implements AmazonManagedGrafana {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonManagedGrafana.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "grafana";

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
                                    com.amazonaws.services.managedgrafana.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.managedgrafana.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.managedgrafana.model.AmazonManagedGrafanaException.class));

    public static AmazonManagedGrafanaClientBuilder builder() {
        return AmazonManagedGrafanaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Managed Grafana using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedGrafanaClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Managed Grafana using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonManagedGrafanaClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("grafana.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/managedgrafana/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/managedgrafana/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Assigns a Grafana Enterprise license to a workspace. To upgrade, you must use <code>ENTERPRISE</code> for the
     * <code>licenseType</code>, and pass in a valid Grafana Labs token for the <code>grafanaToken</code>. Upgrading to
     * Grafana Enterprise incurs additional fees. For more information, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/upgrade-to-Grafana-Enterprise.html">Upgrade a
     * workspace to Grafana Enterprise</a>.
     * </p>
     * 
     * @param associateLicenseRequest
     * @return Result of the AssociateLicense operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.AssociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/AssociateLicense" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateLicenseResult associateLicense(AssociateLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLicense(request);
    }

    @SdkInternalApi
    final AssociateLicenseResult executeAssociateLicense(AssociateLicenseRequest associateLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLicenseRequest> request = null;
        Response<AssociateLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a <i>workspace</i>. In a workspace, you can create Grafana dashboards and visualizations to analyze your
     * metrics, logs, and traces. You don't have to build, package, or deploy any hardware to run the Grafana server.
     * </p>
     * <p>
     * Don't use <code>CreateWorkspace</code> to modify an existing workspace. Instead, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspace.html">UpdateWorkspace</a>.
     * </p>
     * 
     * @param createWorkspaceRequest
     * @return Result of the CreateWorkspace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspace(request);
    }

    @SdkInternalApi
    final CreateWorkspaceResult executeCreateWorkspace(CreateWorkspaceRequest createWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceRequest> request = null;
        Response<CreateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Grafana API key for the workspace. This key can be used to authenticate requests sent to the
     * workspace's HTTP API. See <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">https
     * ://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html</a> for available APIs and example
     * requests.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param createWorkspaceApiKeyRequest
     * @return Result of the CreateWorkspaceApiKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkspaceApiKeyResult createWorkspaceApiKey(CreateWorkspaceApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaceApiKey(request);
    }

    @SdkInternalApi
    final CreateWorkspaceApiKeyResult executeCreateWorkspaceApiKey(CreateWorkspaceApiKeyRequest createWorkspaceApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceApiKeyRequest> request = null;
        Response<CreateWorkspaceApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkspaceApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspaceApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceApiKeyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateWorkspaceApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service account for the workspace. A service account can be used to call Grafana HTTP APIs, and run
     * automated workloads. After creating the service account with the correct <code>GrafanaRole</code> for your use
     * case, use <code>CreateWorkspaceServiceAccountToken</code> to create a token that can be used to authenticate and
     * authorize Grafana HTTP API calls.
     * </p>
     * <p>
     * You can only create service accounts for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * <note>
     * <p>
     * For more information about service accounts, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">Service accounts</a> in the
     * <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * <p>
     * For more information about the Grafana HTTP APIs, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/Using-Grafana-APIs.html">Using Grafana HTTP APIs</a>
     * in the <i>Amazon Managed Grafana User Guide</i>.
     * </p>
     * </note>
     * 
     * @param createWorkspaceServiceAccountRequest
     * @return Result of the CreateWorkspaceServiceAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkspaceServiceAccountResult createWorkspaceServiceAccount(CreateWorkspaceServiceAccountRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaceServiceAccount(request);
    }

    @SdkInternalApi
    final CreateWorkspaceServiceAccountResult executeCreateWorkspaceServiceAccount(CreateWorkspaceServiceAccountRequest createWorkspaceServiceAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceServiceAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceServiceAccountRequest> request = null;
        Response<CreateWorkspaceServiceAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceServiceAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWorkspaceServiceAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspaceServiceAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceServiceAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWorkspaceServiceAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a token that can be used to authenticate and authorize Grafana HTTP API operations for the given <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html">workspace service account</a>.
     * The service account acts as a user for the API operations, and defines the permissions that are used by the API.
     * </p>
     * <important>
     * <p>
     * When you create the service account token, you will receive a key that is used when calling Grafana APIs. Do not
     * lose this key, as it will not be retrievable again.
     * </p>
     * <p>
     * If you do lose the key, you can delete the token and recreate it to receive a new key. This will disable the
     * initial key.
     * </p>
     * </important>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param createWorkspaceServiceAccountTokenRequest
     * @return Result of the CreateWorkspaceServiceAccountToken operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AmazonManagedGrafana.CreateWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/CreateWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkspaceServiceAccountTokenResult createWorkspaceServiceAccountToken(CreateWorkspaceServiceAccountTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkspaceServiceAccountToken(request);
    }

    @SdkInternalApi
    final CreateWorkspaceServiceAccountTokenResult executeCreateWorkspaceServiceAccountToken(
            CreateWorkspaceServiceAccountTokenRequest createWorkspaceServiceAccountTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkspaceServiceAccountTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspaceServiceAccountTokenRequest> request = null;
        Response<CreateWorkspaceServiceAccountTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspaceServiceAccountTokenRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWorkspaceServiceAccountTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkspaceServiceAccountToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkspaceServiceAccountTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWorkspaceServiceAccountTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param deleteWorkspaceRequest
     * @return Result of the DeleteWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspace(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceResult executeDeleteWorkspace(DeleteWorkspaceRequest deleteWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceRequest> request = null;
        Response<DeleteWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Grafana API key for the workspace.
     * </p>
     * <note>
     * <p>
     * In workspaces compatible with Grafana version 9 or above, use workspace service accounts instead of API keys. API
     * keys will be removed in a future release.
     * </p>
     * </note>
     * 
     * @param deleteWorkspaceApiKeyRequest
     * @return Result of the DeleteWorkspaceApiKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspaceApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceApiKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWorkspaceApiKeyResult deleteWorkspaceApiKey(DeleteWorkspaceApiKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspaceApiKey(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceApiKeyResult executeDeleteWorkspaceApiKey(DeleteWorkspaceApiKeyRequest deleteWorkspaceApiKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceApiKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceApiKeyRequest> request = null;
        Response<DeleteWorkspaceApiKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceApiKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkspaceApiKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspaceApiKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceApiKeyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteWorkspaceApiKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a workspace service account from the workspace.
     * </p>
     * <p>
     * This will delete any tokens created for the service account, as well. If the tokens are currently in use, the
     * will fail to authenticate / authorize after they are deleted.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountRequest
     * @return Result of the DeleteWorkspaceServiceAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspaceServiceAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkspaceServiceAccountResult deleteWorkspaceServiceAccount(DeleteWorkspaceServiceAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspaceServiceAccount(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceServiceAccountResult executeDeleteWorkspaceServiceAccount(DeleteWorkspaceServiceAccountRequest deleteWorkspaceServiceAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceServiceAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceServiceAccountRequest> request = null;
        Response<DeleteWorkspaceServiceAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceServiceAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWorkspaceServiceAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspaceServiceAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceServiceAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWorkspaceServiceAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a token for the workspace service account.
     * </p>
     * <p>
     * This will disable the key associated with the token. If any automation is currently using the key, it will no
     * longer be authenticated or authorized to perform actions with the Grafana HTTP APIs.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param deleteWorkspaceServiceAccountTokenRequest
     * @return Result of the DeleteWorkspaceServiceAccountToken operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DeleteWorkspaceServiceAccountToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DeleteWorkspaceServiceAccountToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkspaceServiceAccountTokenResult deleteWorkspaceServiceAccountToken(DeleteWorkspaceServiceAccountTokenRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkspaceServiceAccountToken(request);
    }

    @SdkInternalApi
    final DeleteWorkspaceServiceAccountTokenResult executeDeleteWorkspaceServiceAccountToken(
            DeleteWorkspaceServiceAccountTokenRequest deleteWorkspaceServiceAccountTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkspaceServiceAccountTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkspaceServiceAccountTokenRequest> request = null;
        Response<DeleteWorkspaceServiceAccountTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkspaceServiceAccountTokenRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWorkspaceServiceAccountTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkspaceServiceAccountToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkspaceServiceAccountTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWorkspaceServiceAccountTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays information about one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceRequest
     * @return Result of the DescribeWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspace(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceResult executeDescribeWorkspace(DescribeWorkspaceRequest describeWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceRequest> request = null;
        Response<DescribeWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays information about the authentication methods used in one Amazon Managed Grafana workspace.
     * </p>
     * 
     * @param describeWorkspaceAuthenticationRequest
     * @return Result of the DescribeWorkspaceAuthentication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceAuthenticationResult describeWorkspaceAuthentication(DescribeWorkspaceAuthenticationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceAuthentication(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceAuthenticationResult executeDescribeWorkspaceAuthentication(
            DescribeWorkspaceAuthenticationRequest describeWorkspaceAuthenticationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceAuthenticationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceAuthenticationRequest> request = null;
        Response<DescribeWorkspaceAuthenticationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceAuthenticationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceAuthenticationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceAuthentication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceAuthenticationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceAuthenticationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the current configuration string for the given workspace.
     * </p>
     * 
     * @param describeWorkspaceConfigurationRequest
     * @return Result of the DescribeWorkspaceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DescribeWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWorkspaceConfigurationResult describeWorkspaceConfiguration(DescribeWorkspaceConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWorkspaceConfiguration(request);
    }

    @SdkInternalApi
    final DescribeWorkspaceConfigurationResult executeDescribeWorkspaceConfiguration(DescribeWorkspaceConfigurationRequest describeWorkspaceConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWorkspaceConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceConfigurationRequest> request = null;
        Response<DescribeWorkspaceConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWorkspaceConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWorkspaceConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWorkspaceConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWorkspaceConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the Grafana Enterprise license from a workspace.
     * </p>
     * 
     * @param disassociateLicenseRequest
     * @return Result of the DisassociateLicense operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.DisassociateLicense
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DisassociateLicense" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateLicenseResult disassociateLicense(DisassociateLicenseRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLicense(request);
    }

    @SdkInternalApi
    final DisassociateLicenseResult executeDisassociateLicense(DisassociateLicenseRequest disassociateLicenseRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLicenseRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLicenseRequest> request = null;
        Response<DisassociateLicenseResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLicenseRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateLicenseRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLicense");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLicenseResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateLicenseResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the users and groups who have the Grafana <code>Admin</code> and <code>Editor</code> roles in this
     * workspace. If you use this operation without specifying <code>userId</code> or <code>groupId</code>, the
     * operation returns the roles of all users and groups. If you specify a <code>userId</code> or a
     * <code>groupId</code>, only the roles for that user or group are returned. If you do this, you can specify only
     * one <code>userId</code> or one <code>groupId</code>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return Result of the ListPermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListPermissions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPermissionsResult listPermissions(ListPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPermissions(request);
    }

    @SdkInternalApi
    final ListPermissionsResult executeListPermissions(ListPermissionsRequest listPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPermissionsRequest> request = null;
        Response<ListPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListTagsForResource</code> operation returns the tags that are associated with the Amazon Managed
     * Service for Grafana resource specified by the <code>resourceArn</code>. Currently, the only resource that can be
     * tagged is a workspace.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
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
     * Lists available versions of Grafana. These are available when calling <code>CreateWorkspace</code>. Optionally,
     * include a workspace to list the versions to which it can be upgraded.
     * </p>
     * 
     * @param listVersionsRequest
     * @return Result of the ListVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVersionsResult listVersions(ListVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListVersions(request);
    }

    @SdkInternalApi
    final ListVersionsResult executeListVersions(ListVersionsRequest listVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVersionsRequest> request = null;
        Response<ListVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tokens for a workspace service account.
     * </p>
     * <note>
     * <p>
     * This does not return the key for each token. You cannot access keys after they are created. To create a new key,
     * delete the token and recreate it.
     * </p>
     * </note>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountTokensRequest
     * @return Result of the ListWorkspaceServiceAccountTokens operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListWorkspaceServiceAccountTokens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccountTokens"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkspaceServiceAccountTokensResult listWorkspaceServiceAccountTokens(ListWorkspaceServiceAccountTokensRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaceServiceAccountTokens(request);
    }

    @SdkInternalApi
    final ListWorkspaceServiceAccountTokensResult executeListWorkspaceServiceAccountTokens(
            ListWorkspaceServiceAccountTokensRequest listWorkspaceServiceAccountTokensRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspaceServiceAccountTokensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspaceServiceAccountTokensRequest> request = null;
        Response<ListWorkspaceServiceAccountTokensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspaceServiceAccountTokensRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorkspaceServiceAccountTokensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaceServiceAccountTokens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspaceServiceAccountTokensResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkspaceServiceAccountTokensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of service accounts for a workspace.
     * </p>
     * <p>
     * Service accounts are only available for workspaces that are compatible with Grafana version 9 and above.
     * </p>
     * 
     * @param listWorkspaceServiceAccountsRequest
     * @return Result of the ListWorkspaceServiceAccounts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListWorkspaceServiceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaceServiceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkspaceServiceAccountsResult listWorkspaceServiceAccounts(ListWorkspaceServiceAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaceServiceAccounts(request);
    }

    @SdkInternalApi
    final ListWorkspaceServiceAccountsResult executeListWorkspaceServiceAccounts(ListWorkspaceServiceAccountsRequest listWorkspaceServiceAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspaceServiceAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspaceServiceAccountsRequest> request = null;
        Response<ListWorkspaceServiceAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspaceServiceAccountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorkspaceServiceAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaceServiceAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspaceServiceAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkspaceServiceAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Amazon Managed Grafana workspaces in the account, with some information about each workspace.
     * For more complete information about one workspace, use <a
     * href="https://docs.aws.amazon.com/AAMG/latest/APIReference/API_DescribeWorkspace.html">DescribeWorkspace</a>.
     * </p>
     * 
     * @param listWorkspacesRequest
     * @return Result of the ListWorkspaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.ListWorkspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ListWorkspaces" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListWorkspacesResult listWorkspaces(ListWorkspacesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkspaces(request);
    }

    @SdkInternalApi
    final ListWorkspacesResult executeListWorkspaces(ListWorkspacesRequest listWorkspacesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkspacesRequest> request = null;
        Response<ListWorkspacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkspacesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkspaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkspacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkspacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>TagResource</code> operation associates tags with an Amazon Managed Grafana resource. Currently, the
     * only resource that can be tagged is workspaces.
     * </p>
     * <p>
     * If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the
     * resource. If you specify a tag key that is already associated with the resource, the new tag value that you
     * specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
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
     * The <code>UntagResource</code> operation removes the association of the tag with the Amazon Managed Grafana
     * resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
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
     * Updates which users in a workspace have the Grafana <code>Admin</code> or <code>Editor</code> roles.
     * </p>
     * 
     * @param updatePermissionsRequest
     * @return Result of the UpdatePermissions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdatePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePermissionsResult updatePermissions(UpdatePermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePermissions(request);
    }

    @SdkInternalApi
    final UpdatePermissionsResult executeUpdatePermissions(UpdatePermissionsRequest updatePermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePermissionsRequest> request = null;
        Response<UpdatePermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing Amazon Managed Grafana workspace. If you use this operation and omit any optional
     * parameters, the existing values of those parameters are not changed.
     * </p>
     * <p>
     * To modify the user authentication methods that the workspace uses, such as SAML or IAM Identity Center, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateWorkspaceAuthentication.html">
     * UpdateWorkspaceAuthentication</a>.
     * </p>
     * <p>
     * To modify which users in the workspace have the <code>Admin</code> and <code>Editor</code> Grafana roles, use <a
     * href="https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html">UpdatePermissions</a>.
     * </p>
     * 
     * @param updateWorkspaceRequest
     * @return Result of the UpdateWorkspace operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspace" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateWorkspaceResult updateWorkspace(UpdateWorkspaceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspace(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceResult executeUpdateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceRequest> request = null;
        Response<UpdateWorkspaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkspaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspace");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkspaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to define the identity provider (IdP) that this workspace authenticates users from, using
     * SAML. You can also map SAML assertion attributes to workspace user information and define which groups in the
     * assertion attribute are to have the <code>Admin</code> and <code>Editor</code> roles in the workspace.
     * </p>
     * <note>
     * <p>
     * Changes to the authentication method for a workspace may take a few minutes to take effect.
     * </p>
     * </note>
     * 
     * @param updateWorkspaceAuthenticationRequest
     * @return Result of the UpdateWorkspaceAuthentication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspaceAuthentication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceAuthentication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkspaceAuthenticationResult updateWorkspaceAuthentication(UpdateWorkspaceAuthenticationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceAuthentication(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceAuthenticationResult executeUpdateWorkspaceAuthentication(UpdateWorkspaceAuthenticationRequest updateWorkspaceAuthenticationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceAuthenticationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceAuthenticationRequest> request = null;
        Response<UpdateWorkspaceAuthenticationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceAuthenticationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateWorkspaceAuthenticationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceAuthentication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceAuthenticationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateWorkspaceAuthenticationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration string for the given workspace
     * </p>
     * 
     * @param updateWorkspaceConfigurationRequest
     * @return Result of the UpdateWorkspaceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @throws ThrottlingException
     *         The request was denied because of request throttling. Retry the request.
     * @throws ConflictException
     *         A resource was in an inconsistent state during an update or a deletion.
     * @throws ValidationException
     *         The value of a parameter in the request caused an error.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         Unexpected error while processing the request. Retry the request.
     * @sample AmazonManagedGrafana.UpdateWorkspaceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdateWorkspaceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkspaceConfigurationResult updateWorkspaceConfiguration(UpdateWorkspaceConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkspaceConfiguration(request);
    }

    @SdkInternalApi
    final UpdateWorkspaceConfigurationResult executeUpdateWorkspaceConfiguration(UpdateWorkspaceConfigurationRequest updateWorkspaceConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkspaceConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkspaceConfigurationRequest> request = null;
        Response<UpdateWorkspaceConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkspaceConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateWorkspaceConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "grafana");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkspaceConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkspaceConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateWorkspaceConfigurationResultJsonUnmarshaller());
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
