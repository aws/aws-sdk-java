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
package com.amazonaws.services.pcaconnectorad;

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

import com.amazonaws.services.pcaconnectorad.AWSPcaConnectorAdClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.services.pcaconnectorad.model.transform.*;

/**
 * Client for accessing PcaConnectorAd. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Web Services Private CA Connector for Active Directory creates a connector between Amazon Web Services Private
 * CA and Active Directory (AD) that enables you to provision security certificates for AD signed by a private CA that
 * you own. For more information, see <a
 * href="https://docs.aws.amazon.com/privateca/latest/userguide/ad-connector.html">Amazon Web Services Private CA
 * Connector for Active Directory</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPcaConnectorAdClient extends AmazonWebServiceClient implements AWSPcaConnectorAd {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSPcaConnectorAd.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "pca-connector-ad";

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.pcaconnectorad.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.pcaconnectorad.model.AWSPcaConnectorAdException.class));

    public static AWSPcaConnectorAdClientBuilder builder() {
        return AWSPcaConnectorAdClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on PcaConnectorAd using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPcaConnectorAdClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on PcaConnectorAd using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSPcaConnectorAdClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("pca-connector-ad.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/pcaconnectorad/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/pcaconnectorad/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a connector between Amazon Web Services Private CA and an Active Directory. You must specify the private
     * CA, directory ID, and security groups.
     * </p>
     * 
     * @param createConnectorRequest
     * @return Result of the CreateConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectorResult createConnector(CreateConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnector(request);
    }

    @SdkInternalApi
    final CreateConnectorResult executeCreateConnector(CreateConnectorRequest createConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectorRequest> request = null;
        Response<CreateConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a directory registration that authorizes communication between Amazon Web Services Private CA and an
     * Active Directory
     * </p>
     * 
     * @param createDirectoryRegistrationRequest
     * @return Result of the CreateDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDirectoryRegistrationResult createDirectoryRegistration(CreateDirectoryRegistrationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectoryRegistration(request);
    }

    @SdkInternalApi
    final CreateDirectoryRegistrationResult executeCreateDirectoryRegistration(CreateDirectoryRegistrationRequest createDirectoryRegistrationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectoryRegistrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRegistrationRequest> request = null;
        Response<CreateDirectoryRegistrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRegistrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDirectoryRegistrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDirectoryRegistration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectoryRegistrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDirectoryRegistrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a service principal name (SPN) for the service account in Active Directory. Kerberos authentication uses
     * SPNs to associate a service instance with a service sign-in account.
     * </p>
     * 
     * @param createServicePrincipalNameRequest
     * @return Result of the CreateServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateServicePrincipalNameResult createServicePrincipalName(CreateServicePrincipalNameRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServicePrincipalName(request);
    }

    @SdkInternalApi
    final CreateServicePrincipalNameResult executeCreateServicePrincipalName(CreateServicePrincipalNameRequest createServicePrincipalNameRequest) {

        ExecutionContext executionContext = createExecutionContext(createServicePrincipalNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServicePrincipalNameRequest> request = null;
        Response<CreateServicePrincipalNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServicePrincipalNameRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createServicePrincipalNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServicePrincipalName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServicePrincipalNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateServicePrincipalNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Active Directory compatible certificate template. The connectors issues certificates using these
     * templates based on the requester’s Active Directory group membership.
     * </p>
     * 
     * @param createTemplateRequest
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTemplateResult createTemplate(CreateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplate(request);
    }

    @SdkInternalApi
    final CreateTemplateResult executeCreateTemplate(CreateTemplateRequest createTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateRequest> request = null;
        Response<CreateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a group access control entry. Allow or deny Active Directory groups from enrolling and/or autoenrolling
     * with the template based on the group security identifiers (SIDs).
     * </p>
     * 
     * @param createTemplateGroupAccessControlEntryRequest
     * @return Result of the CreateTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.CreateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTemplateGroupAccessControlEntryResult createTemplateGroupAccessControlEntry(CreateTemplateGroupAccessControlEntryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplateGroupAccessControlEntry(request);
    }

    @SdkInternalApi
    final CreateTemplateGroupAccessControlEntryResult executeCreateTemplateGroupAccessControlEntry(
            CreateTemplateGroupAccessControlEntryRequest createTemplateGroupAccessControlEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateGroupAccessControlEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateGroupAccessControlEntryRequest> request = null;
        Response<CreateTemplateGroupAccessControlEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateGroupAccessControlEntryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTemplateGroupAccessControlEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplateGroupAccessControlEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateGroupAccessControlEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateTemplateGroupAccessControlEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a connector for Active Directory. You must provide the Amazon Resource Name (ARN) of the connector that
     * you want to delete. You can find the ARN by calling the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_ListConnectors"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_ListConnectors</a> action. Deleting a
     * connector does not deregister your directory with Amazon Web Services Private CA. You can deregister your
     * directory by calling the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_DeleteDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_DeleteDirectoryRegistration</a> action.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteConnector"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectorResult deleteConnector(DeleteConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnector(request);
    }

    @SdkInternalApi
    final DeleteConnectorResult executeDeleteConnector(DeleteConnectorRequest deleteConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectorRequest> request = null;
        Response<DeleteConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a directory registration. Deleting a directory registration deauthorizes Amazon Web Services Private CA
     * with the directory.
     * </p>
     * 
     * @param deleteDirectoryRegistrationRequest
     * @return Result of the DeleteDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDirectoryRegistrationResult deleteDirectoryRegistration(DeleteDirectoryRegistrationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectoryRegistration(request);
    }

    @SdkInternalApi
    final DeleteDirectoryRegistrationResult executeDeleteDirectoryRegistration(DeleteDirectoryRegistrationRequest deleteDirectoryRegistrationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRegistrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRegistrationRequest> request = null;
        Response<DeleteDirectoryRegistrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRegistrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDirectoryRegistrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDirectoryRegistration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectoryRegistrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDirectoryRegistrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the service principal name (SPN) used by a connector to authenticate with your Active Directory.
     * </p>
     * 
     * @param deleteServicePrincipalNameRequest
     * @return Result of the DeleteServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteServicePrincipalNameResult deleteServicePrincipalName(DeleteServicePrincipalNameRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServicePrincipalName(request);
    }

    @SdkInternalApi
    final DeleteServicePrincipalNameResult executeDeleteServicePrincipalName(DeleteServicePrincipalNameRequest deleteServicePrincipalNameRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServicePrincipalNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServicePrincipalNameRequest> request = null;
        Response<DeleteServicePrincipalNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServicePrincipalNameRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteServicePrincipalNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServicePrincipalName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServicePrincipalNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteServicePrincipalNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a template. Certificates issued using the template are still valid until they are revoked or expired.
     * </p>
     * 
     * @param deleteTemplateRequest
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTemplateResult deleteTemplate(DeleteTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplate(request);
    }

    @SdkInternalApi
    final DeleteTemplateResult executeDeleteTemplate(DeleteTemplateRequest deleteTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateRequest> request = null;
        Response<DeleteTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a group access control entry.
     * </p>
     * 
     * @param deleteTemplateGroupAccessControlEntryRequest
     * @return Result of the DeleteTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.DeleteTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/DeleteTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTemplateGroupAccessControlEntryResult deleteTemplateGroupAccessControlEntry(DeleteTemplateGroupAccessControlEntryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplateGroupAccessControlEntry(request);
    }

    @SdkInternalApi
    final DeleteTemplateGroupAccessControlEntryResult executeDeleteTemplateGroupAccessControlEntry(
            DeleteTemplateGroupAccessControlEntryRequest deleteTemplateGroupAccessControlEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateGroupAccessControlEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateGroupAccessControlEntryRequest> request = null;
        Response<DeleteTemplateGroupAccessControlEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateGroupAccessControlEntryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteTemplateGroupAccessControlEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplateGroupAccessControlEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTemplateGroupAccessControlEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteTemplateGroupAccessControlEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about your connector. You specify the connector on input by its ARN (Amazon Resource Name).
     * </p>
     * 
     * @param getConnectorRequest
     * @return Result of the GetConnector operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetConnector" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConnectorResult getConnector(GetConnectorRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnector(request);
    }

    @SdkInternalApi
    final GetConnectorResult executeGetConnector(GetConnectorRequest getConnectorRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectorRequest> request = null;
        Response<GetConnectorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnector");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A structure that contains information about your directory registration.
     * </p>
     * 
     * @param getDirectoryRegistrationRequest
     * @return Result of the GetDirectoryRegistration operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetDirectoryRegistration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetDirectoryRegistration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDirectoryRegistrationResult getDirectoryRegistration(GetDirectoryRegistrationRequest request) {
        request = beforeClientExecution(request);
        return executeGetDirectoryRegistration(request);
    }

    @SdkInternalApi
    final GetDirectoryRegistrationResult executeGetDirectoryRegistration(GetDirectoryRegistrationRequest getDirectoryRegistrationRequest) {

        ExecutionContext executionContext = createExecutionContext(getDirectoryRegistrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryRegistrationRequest> request = null;
        Response<GetDirectoryRegistrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryRegistrationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDirectoryRegistrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDirectoryRegistration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDirectoryRegistrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDirectoryRegistrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the service principal name that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param getServicePrincipalNameRequest
     * @return Result of the GetServicePrincipalName operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetServicePrincipalName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetServicePrincipalName"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServicePrincipalNameResult getServicePrincipalName(GetServicePrincipalNameRequest request) {
        request = beforeClientExecution(request);
        return executeGetServicePrincipalName(request);
    }

    @SdkInternalApi
    final GetServicePrincipalNameResult executeGetServicePrincipalName(GetServicePrincipalNameRequest getServicePrincipalNameRequest) {

        ExecutionContext executionContext = createExecutionContext(getServicePrincipalNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServicePrincipalNameRequest> request = null;
        Response<GetServicePrincipalNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServicePrincipalNameRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getServicePrincipalNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServicePrincipalName");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServicePrincipalNameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetServicePrincipalNameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a certificate template that the connector uses to issue certificates from a private CA.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplate(request);
    }

    @SdkInternalApi
    final GetTemplateResult executeGetTemplate(GetTemplateRequest getTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the group access control entries for a template.
     * </p>
     * 
     * @param getTemplateGroupAccessControlEntryRequest
     * @return Result of the GetTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.GetTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GetTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTemplateGroupAccessControlEntryResult getTemplateGroupAccessControlEntry(GetTemplateGroupAccessControlEntryRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplateGroupAccessControlEntry(request);
    }

    @SdkInternalApi
    final GetTemplateGroupAccessControlEntryResult executeGetTemplateGroupAccessControlEntry(
            GetTemplateGroupAccessControlEntryRequest getTemplateGroupAccessControlEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateGroupAccessControlEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateGroupAccessControlEntryRequest> request = null;
        Response<GetTemplateGroupAccessControlEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateGroupAccessControlEntryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTemplateGroupAccessControlEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplateGroupAccessControlEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTemplateGroupAccessControlEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTemplateGroupAccessControlEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the connectors that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateConnector</a> action.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListConnectors"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConnectorsResult listConnectors(ListConnectorsRequest request) {
        request = beforeClientExecution(request);
        return executeListConnectors(request);
    }

    @SdkInternalApi
    final ListConnectorsResult executeListConnectors(ListConnectorsRequest listConnectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectorsRequest> request = null;
        Response<ListConnectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the directory registrations that you created by using the <a
     * href="https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration"
     * >https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateDirectoryRegistration</a> action.
     * </p>
     * 
     * @param listDirectoryRegistrationsRequest
     * @return Result of the ListDirectoryRegistrations operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListDirectoryRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListDirectoryRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDirectoryRegistrationsResult listDirectoryRegistrations(ListDirectoryRegistrationsRequest request) {
        request = beforeClientExecution(request);
        return executeListDirectoryRegistrations(request);
    }

    @SdkInternalApi
    final ListDirectoryRegistrationsResult executeListDirectoryRegistrations(ListDirectoryRegistrationsRequest listDirectoryRegistrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDirectoryRegistrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDirectoryRegistrationsRequest> request = null;
        Response<ListDirectoryRegistrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDirectoryRegistrationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDirectoryRegistrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDirectoryRegistrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDirectoryRegistrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDirectoryRegistrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the service principal names that the connector uses to authenticate with Active Directory.
     * </p>
     * 
     * @param listServicePrincipalNamesRequest
     * @return Result of the ListServicePrincipalNames operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListServicePrincipalNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListServicePrincipalNames"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListServicePrincipalNamesResult listServicePrincipalNames(ListServicePrincipalNamesRequest request) {
        request = beforeClientExecution(request);
        return executeListServicePrincipalNames(request);
    }

    @SdkInternalApi
    final ListServicePrincipalNamesResult executeListServicePrincipalNames(ListServicePrincipalNamesRequest listServicePrincipalNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(listServicePrincipalNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListServicePrincipalNamesRequest> request = null;
        Response<ListServicePrincipalNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListServicePrincipalNamesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listServicePrincipalNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListServicePrincipalNames");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListServicePrincipalNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListServicePrincipalNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags, if any, that are associated with your resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
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
     * Lists group access control entries you created.
     * </p>
     * 
     * @param listTemplateGroupAccessControlEntriesRequest
     * @return Result of the ListTemplateGroupAccessControlEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTemplateGroupAccessControlEntries
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplateGroupAccessControlEntries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplateGroupAccessControlEntriesResult listTemplateGroupAccessControlEntries(ListTemplateGroupAccessControlEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateGroupAccessControlEntries(request);
    }

    @SdkInternalApi
    final ListTemplateGroupAccessControlEntriesResult executeListTemplateGroupAccessControlEntries(
            ListTemplateGroupAccessControlEntriesRequest listTemplateGroupAccessControlEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateGroupAccessControlEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateGroupAccessControlEntriesRequest> request = null;
        Response<ListTemplateGroupAccessControlEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateGroupAccessControlEntriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listTemplateGroupAccessControlEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateGroupAccessControlEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateGroupAccessControlEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTemplateGroupAccessControlEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the templates, if any, that are associated with a connector.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ListTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTemplatesResult listTemplates(ListTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplates(request);
    }

    @SdkInternalApi
    final ListTemplatesResult executeListTemplates(ListTemplatesRequest listTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplatesRequest> request = null;
        Response<ListTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to your resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
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
     * Removes one or more tags from your resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @sample AWSPcaConnectorAd.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
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
     * Update template configuration to define the information included in certificates.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTemplateResult updateTemplate(UpdateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplate(request);
    }

    @SdkInternalApi
    final UpdateTemplateResult executeUpdateTemplate(UpdateTemplateRequest updateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateRequest> request = null;
        Response<UpdateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a group access control entry you created using <a href=
     * "https://docs.aws.amazon.com/pca-connector-ad/latest/APIReference/API_CreateTemplateGroupAccessControlEntry.html"
     * >CreateTemplateGroupAccessControlEntry</a>.
     * </p>
     * 
     * @param updateTemplateGroupAccessControlEntryRequest
     * @return Result of the UpdateTemplateGroupAccessControlEntry operation returned by the service.
     * @throws AccessDeniedException
     *         You can receive this error if you attempt to create a resource share when you don't have the required
     *         permissions. This can be caused by insufficient permissions in policies attached to your Amazon Web
     *         Services Identity and Access Management (IAM) principal. It can also happen because of restrictions in
     *         place from an Amazon Web Services Organizations service control policy (SCP) that affects your Amazon Web
     *         Services account.
     * @throws ValidationException
     *         An input validation error occurred. For example, invalid characters in a template name, or if a
     *         pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure with an internal
     *         server.
     * @throws ConflictException
     *         This request cannot be completed for one of the following reasons because the requested resource was
     *         being concurrently modified by another request.
     * @sample AWSPcaConnectorAd.UpdateTemplateGroupAccessControlEntry
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/UpdateTemplateGroupAccessControlEntry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTemplateGroupAccessControlEntryResult updateTemplateGroupAccessControlEntry(UpdateTemplateGroupAccessControlEntryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTemplateGroupAccessControlEntry(request);
    }

    @SdkInternalApi
    final UpdateTemplateGroupAccessControlEntryResult executeUpdateTemplateGroupAccessControlEntry(
            UpdateTemplateGroupAccessControlEntryRequest updateTemplateGroupAccessControlEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTemplateGroupAccessControlEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTemplateGroupAccessControlEntryRequest> request = null;
        Response<UpdateTemplateGroupAccessControlEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTemplateGroupAccessControlEntryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateTemplateGroupAccessControlEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Pca Connector Ad");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTemplateGroupAccessControlEntry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTemplateGroupAccessControlEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateTemplateGroupAccessControlEntryResultJsonUnmarshaller());
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
