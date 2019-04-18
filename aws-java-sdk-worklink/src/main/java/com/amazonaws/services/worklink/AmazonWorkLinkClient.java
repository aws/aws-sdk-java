/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.worklink;

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

import com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.worklink.model.*;
import com.amazonaws.services.worklink.model.transform.*;

/**
 * Client for accessing WorkLink. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
 * phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
 * any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
 * Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
 * rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
 * devices.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonWorkLinkClient extends AmazonWebServiceClient implements AmazonWorkLink {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkLink.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "worklink";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.worklink.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.worklink.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.worklink.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.worklink.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.worklink.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.worklink.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.worklink.model.AmazonWorkLinkException.class));

    public static AmazonWorkLinkClientBuilder builder() {
        return AmazonWorkLinkClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on WorkLink using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkLinkClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on WorkLink using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonWorkLinkClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("worklink.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/worklink/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/worklink/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Specifies a domain to be associated to Amazon WorkLink.
     * </p>
     * 
     * @param associateDomainRequest
     * @return Result of the AssociateDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.AssociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateDomainResult associateDomain(AssociateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDomain(request);
    }

    @SdkInternalApi
    final AssociateDomainResult executeAssociateDomain(AssociateDomainRequest associateDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDomainRequest> request = null;
        Response<AssociateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
     * websites within the company network.
     * </p>
     * 
     * @param associateWebsiteCertificateAuthorityRequest
     * @return Result of the AssociateWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.AssociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/AssociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateWebsiteCertificateAuthorityResult associateWebsiteCertificateAuthority(AssociateWebsiteCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateWebsiteCertificateAuthority(request);
    }

    @SdkInternalApi
    final AssociateWebsiteCertificateAuthorityResult executeAssociateWebsiteCertificateAuthority(
            AssociateWebsiteCertificateAuthorityRequest associateWebsiteCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(associateWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateWebsiteCertificateAuthorityRequest> request = null;
        Response<AssociateWebsiteCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateWebsiteCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateWebsiteCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateWebsiteCertificateAuthority");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateWebsiteCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateWebsiteCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
     * authorized users who download and set up the Amazon WorkLink app.
     * </p>
     * 
     * @param createFleetRequest
     * @return Result of the CreateFleet operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFleetResult createFleet(CreateFleetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFleet(request);
    }

    @SdkInternalApi
    final CreateFleetResult executeCreateFleet(CreateFleetRequest createFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(createFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFleetRequest> request = null;
        Response<CreateFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a fleet. Prevents users from accessing previously associated websites.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFleetResult deleteFleet(DeleteFleetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFleet(request);
    }

    @SdkInternalApi
    final DeleteFleetResult executeDeleteFleet(DeleteFleetRequest deleteFleetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFleetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFleetRequest> request = null;
        Response<DeleteFleetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFleetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFleetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFleet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFleetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFleetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the configuration for delivering audit streams to the customer account.
     * </p>
     * 
     * @param describeAuditStreamConfigurationRequest
     * @return Result of the DescribeAuditStreamConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAuditStreamConfigurationResult describeAuditStreamConfiguration(DescribeAuditStreamConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAuditStreamConfiguration(request);
    }

    @SdkInternalApi
    final DescribeAuditStreamConfigurationResult executeDescribeAuditStreamConfiguration(
            DescribeAuditStreamConfigurationRequest describeAuditStreamConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAuditStreamConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAuditStreamConfigurationRequest> request = null;
        Response<DescribeAuditStreamConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAuditStreamConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAuditStreamConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAuditStreamConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAuditStreamConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAuditStreamConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the networking configuration to access the internal websites associated with the specified fleet.
     * </p>
     * 
     * @param describeCompanyNetworkConfigurationRequest
     * @return Result of the DescribeCompanyNetworkConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCompanyNetworkConfigurationResult describeCompanyNetworkConfiguration(DescribeCompanyNetworkConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCompanyNetworkConfiguration(request);
    }

    @SdkInternalApi
    final DescribeCompanyNetworkConfigurationResult executeDescribeCompanyNetworkConfiguration(
            DescribeCompanyNetworkConfigurationRequest describeCompanyNetworkConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCompanyNetworkConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCompanyNetworkConfigurationRequest> request = null;
        Response<DescribeCompanyNetworkConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCompanyNetworkConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCompanyNetworkConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCompanyNetworkConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCompanyNetworkConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCompanyNetworkConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about a user's device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDeviceResult describeDevice(DescribeDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDevice(request);
    }

    @SdkInternalApi
    final DescribeDeviceResult executeDescribeDevice(DescribeDeviceRequest describeDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDeviceRequest> request = null;
        Response<DescribeDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the device policy configuration for the specified fleet.
     * </p>
     * 
     * @param describeDevicePolicyConfigurationRequest
     * @return Result of the DescribeDevicePolicyConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDevicePolicyConfigurationResult describeDevicePolicyConfiguration(DescribeDevicePolicyConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDevicePolicyConfiguration(request);
    }

    @SdkInternalApi
    final DescribeDevicePolicyConfigurationResult executeDescribeDevicePolicyConfiguration(
            DescribeDevicePolicyConfigurationRequest describeDevicePolicyConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDevicePolicyConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDevicePolicyConfigurationRequest> request = null;
        Response<DescribeDevicePolicyConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDevicePolicyConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDevicePolicyConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDevicePolicyConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDevicePolicyConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDevicePolicyConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDomainResult describeDomain(DescribeDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDomain(request);
    }

    @SdkInternalApi
    final DescribeDomainResult executeDescribeDomain(DescribeDomainRequest describeDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainRequest> request = null;
        Response<DescribeDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides basic information for the specified fleet, excluding identity provider, networking, and device
     * configuration details.
     * </p>
     * 
     * @param describeFleetMetadataRequest
     * @return Result of the DescribeFleetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFleetMetadataResult describeFleetMetadata(DescribeFleetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFleetMetadata(request);
    }

    @SdkInternalApi
    final DescribeFleetMetadataResult executeDescribeFleetMetadata(DescribeFleetMetadataRequest describeFleetMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFleetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFleetMetadataRequest> request = null;
        Response<DescribeFleetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFleetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFleetMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFleetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFleetMetadataResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeFleetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the identity provider configuration of the specified fleet.
     * </p>
     * 
     * @param describeIdentityProviderConfigurationRequest
     * @return Result of the DescribeIdentityProviderConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeIdentityProviderConfigurationResult describeIdentityProviderConfiguration(DescribeIdentityProviderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeIdentityProviderConfiguration(request);
    }

    @SdkInternalApi
    final DescribeIdentityProviderConfigurationResult executeDescribeIdentityProviderConfiguration(
            DescribeIdentityProviderConfigurationRequest describeIdentityProviderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeIdentityProviderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIdentityProviderConfigurationRequest> request = null;
        Response<DescribeIdentityProviderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIdentityProviderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeIdentityProviderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeIdentityProviderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeIdentityProviderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeIdentityProviderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides information about the certificate authority.
     * </p>
     * 
     * @param describeWebsiteCertificateAuthorityRequest
     * @return Result of the DescribeWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DescribeWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWebsiteCertificateAuthorityResult describeWebsiteCertificateAuthority(DescribeWebsiteCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWebsiteCertificateAuthority(request);
    }

    @SdkInternalApi
    final DescribeWebsiteCertificateAuthorityResult executeDescribeWebsiteCertificateAuthority(
            DescribeWebsiteCertificateAuthorityRequest describeWebsiteCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWebsiteCertificateAuthorityRequest> request = null;
        Response<DescribeWebsiteCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWebsiteCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWebsiteCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWebsiteCertificateAuthority");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWebsiteCertificateAuthorityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWebsiteCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
     * WorkLink.
     * </p>
     * 
     * @param disassociateDomainRequest
     * @return Result of the DisassociateDomain operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DisassociateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateDomain" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateDomainResult disassociateDomain(DisassociateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDomain(request);
    }

    @SdkInternalApi
    final DisassociateDomainResult executeDisassociateDomain(DisassociateDomainRequest disassociateDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDomainRequest> request = null;
        Response<DisassociateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a certificate authority (CA).
     * </p>
     * 
     * @param disassociateWebsiteCertificateAuthorityRequest
     * @return Result of the DisassociateWebsiteCertificateAuthority operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.DisassociateWebsiteCertificateAuthority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DisassociateWebsiteCertificateAuthority"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateWebsiteCertificateAuthorityResult disassociateWebsiteCertificateAuthority(DisassociateWebsiteCertificateAuthorityRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateWebsiteCertificateAuthority(request);
    }

    @SdkInternalApi
    final DisassociateWebsiteCertificateAuthorityResult executeDisassociateWebsiteCertificateAuthority(
            DisassociateWebsiteCertificateAuthorityRequest disassociateWebsiteCertificateAuthorityRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateWebsiteCertificateAuthorityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateWebsiteCertificateAuthorityRequest> request = null;
        Response<DisassociateWebsiteCertificateAuthorityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateWebsiteCertificateAuthorityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateWebsiteCertificateAuthorityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateWebsiteCertificateAuthority");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateWebsiteCertificateAuthorityResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateWebsiteCertificateAuthorityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of devices registered with the specified fleet.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDevicesResult listDevices(ListDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeListDevices(request);
    }

    @SdkInternalApi
    final ListDevicesResult executeListDevices(ListDevicesRequest listDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDevicesRequest> request = null;
        Response<ListDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of domains associated to a specified fleet.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeListDomains(request);
    }

    @SdkInternalApi
    final ListDomainsResult executeListDomains(ListDomainsRequest listDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDomains");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDomainsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of fleets for the current account and Region.
     * </p>
     * 
     * @param listFleetsRequest
     * @return Result of the ListFleets operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFleetsResult listFleets(ListFleetsRequest request) {
        request = beforeClientExecution(request);
        return executeListFleets(request);
    }

    @SdkInternalApi
    final ListFleetsResult executeListFleets(ListFleetsRequest listFleetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFleetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFleetsRequest> request = null;
        Response<ListFleetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFleetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFleetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFleets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFleetsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFleetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of certificate authorities added for the current account and Region.
     * </p>
     * 
     * @param listWebsiteCertificateAuthoritiesRequest
     * @return Result of the ListWebsiteCertificateAuthorities operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.ListWebsiteCertificateAuthorities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/ListWebsiteCertificateAuthorities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWebsiteCertificateAuthoritiesResult listWebsiteCertificateAuthorities(ListWebsiteCertificateAuthoritiesRequest request) {
        request = beforeClientExecution(request);
        return executeListWebsiteCertificateAuthorities(request);
    }

    @SdkInternalApi
    final ListWebsiteCertificateAuthoritiesResult executeListWebsiteCertificateAuthorities(
            ListWebsiteCertificateAuthoritiesRequest listWebsiteCertificateAuthoritiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWebsiteCertificateAuthoritiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWebsiteCertificateAuthoritiesRequest> request = null;
        Response<ListWebsiteCertificateAuthoritiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWebsiteCertificateAuthoritiesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWebsiteCertificateAuthoritiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWebsiteCertificateAuthorities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWebsiteCertificateAuthoritiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWebsiteCertificateAuthoritiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves a domain to ACTIVE status if it was in the INACTIVE status.
     * </p>
     * 
     * @param restoreDomainAccessRequest
     * @return Result of the RestoreDomainAccess operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.RestoreDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RestoreDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RestoreDomainAccessResult restoreDomainAccess(RestoreDomainAccessRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreDomainAccess(request);
    }

    @SdkInternalApi
    final RestoreDomainAccessResult executeRestoreDomainAccess(RestoreDomainAccessRequest restoreDomainAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreDomainAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDomainAccessRequest> request = null;
        Response<RestoreDomainAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDomainAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreDomainAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDomainAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreDomainAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreDomainAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves a domain to INACTIVE status if it was in the ACTIVE status.
     * </p>
     * 
     * @param revokeDomainAccessRequest
     * @return Result of the RevokeDomainAccess operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.RevokeDomainAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/RevokeDomainAccess" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RevokeDomainAccessResult revokeDomainAccess(RevokeDomainAccessRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeDomainAccess(request);
    }

    @SdkInternalApi
    final RevokeDomainAccessResult executeRevokeDomainAccess(RevokeDomainAccessRequest revokeDomainAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeDomainAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeDomainAccessRequest> request = null;
        Response<RevokeDomainAccessResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeDomainAccessRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeDomainAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeDomainAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeDomainAccessResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeDomainAccessResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Signs the user out from all of their devices. The user can sign in again if they have valid credentials.
     * </p>
     * 
     * @param signOutUserRequest
     * @return Result of the SignOutUser operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.SignOutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/SignOutUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SignOutUserResult signOutUser(SignOutUserRequest request) {
        request = beforeClientExecution(request);
        return executeSignOutUser(request);
    }

    @SdkInternalApi
    final SignOutUserResult executeSignOutUser(SignOutUserRequest signOutUserRequest) {

        ExecutionContext executionContext = createExecutionContext(signOutUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignOutUserRequest> request = null;
        Response<SignOutUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignOutUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(signOutUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SignOutUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SignOutUserResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SignOutUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the audit stream configuration for the fleet.
     * </p>
     * 
     * @param updateAuditStreamConfigurationRequest
     * @return Result of the UpdateAuditStreamConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateAuditStreamConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateAuditStreamConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAuditStreamConfigurationResult updateAuditStreamConfiguration(UpdateAuditStreamConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAuditStreamConfiguration(request);
    }

    @SdkInternalApi
    final UpdateAuditStreamConfigurationResult executeUpdateAuditStreamConfiguration(UpdateAuditStreamConfigurationRequest updateAuditStreamConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAuditStreamConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAuditStreamConfigurationRequest> request = null;
        Response<UpdateAuditStreamConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAuditStreamConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAuditStreamConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAuditStreamConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAuditStreamConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAuditStreamConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the company network configuration for the fleet.
     * </p>
     * 
     * @param updateCompanyNetworkConfigurationRequest
     * @return Result of the UpdateCompanyNetworkConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateCompanyNetworkConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateCompanyNetworkConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCompanyNetworkConfigurationResult updateCompanyNetworkConfiguration(UpdateCompanyNetworkConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCompanyNetworkConfiguration(request);
    }

    @SdkInternalApi
    final UpdateCompanyNetworkConfigurationResult executeUpdateCompanyNetworkConfiguration(
            UpdateCompanyNetworkConfigurationRequest updateCompanyNetworkConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCompanyNetworkConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCompanyNetworkConfigurationRequest> request = null;
        Response<UpdateCompanyNetworkConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCompanyNetworkConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCompanyNetworkConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCompanyNetworkConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCompanyNetworkConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCompanyNetworkConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the device policy configuration for the fleet.
     * </p>
     * 
     * @param updateDevicePolicyConfigurationRequest
     * @return Result of the UpdateDevicePolicyConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateDevicePolicyConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDevicePolicyConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDevicePolicyConfigurationResult updateDevicePolicyConfiguration(UpdateDevicePolicyConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevicePolicyConfiguration(request);
    }

    @SdkInternalApi
    final UpdateDevicePolicyConfigurationResult executeUpdateDevicePolicyConfiguration(
            UpdateDevicePolicyConfigurationRequest updateDevicePolicyConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDevicePolicyConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDevicePolicyConfigurationRequest> request = null;
        Response<UpdateDevicePolicyConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDevicePolicyConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDevicePolicyConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevicePolicyConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDevicePolicyConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDevicePolicyConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates domain metadata, such as DisplayName.
     * </p>
     * 
     * @param updateDomainMetadataRequest
     * @return Result of the UpdateDomainMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateDomainMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateDomainMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDomainMetadataResult updateDomainMetadata(UpdateDomainMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainMetadata(request);
    }

    @SdkInternalApi
    final UpdateDomainMetadataResult executeUpdateDomainMetadata(UpdateDomainMetadataRequest updateDomainMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainMetadataRequest> request = null;
        Response<UpdateDomainMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDomainMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates fleet metadata, such as DisplayName.
     * </p>
     * 
     * @param updateFleetMetadataRequest
     * @return Result of the UpdateFleetMetadata operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateFleetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateFleetMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFleetMetadataResult updateFleetMetadata(UpdateFleetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFleetMetadata(request);
    }

    @SdkInternalApi
    final UpdateFleetMetadataResult executeUpdateFleetMetadata(UpdateFleetMetadataRequest updateFleetMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFleetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFleetMetadataRequest> request = null;
        Response<UpdateFleetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFleetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFleetMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFleetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFleetMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFleetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the identity provider configuration for the fleet.
     * </p>
     * 
     * @param updateIdentityProviderConfigurationRequest
     * @return Result of the UpdateIdentityProviderConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         You are not authorized to perform this action.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit.
     * @sample AmazonWorkLink.UpdateIdentityProviderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateIdentityProviderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIdentityProviderConfigurationResult updateIdentityProviderConfiguration(UpdateIdentityProviderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentityProviderConfiguration(request);
    }

    @SdkInternalApi
    final UpdateIdentityProviderConfigurationResult executeUpdateIdentityProviderConfiguration(
            UpdateIdentityProviderConfigurationRequest updateIdentityProviderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentityProviderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentityProviderConfigurationRequest> request = null;
        Response<UpdateIdentityProviderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentityProviderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateIdentityProviderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WorkLink");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentityProviderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentityProviderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateIdentityProviderConfigurationResultJsonUnmarshaller());
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

}
