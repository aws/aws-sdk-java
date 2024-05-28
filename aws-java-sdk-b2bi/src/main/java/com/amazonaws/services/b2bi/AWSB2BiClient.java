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
package com.amazonaws.services.b2bi;

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

import com.amazonaws.services.b2bi.AWSB2BiClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.b2bi.model.*;

import com.amazonaws.services.b2bi.model.transform.*;

/**
 * Client for accessing AWS B2BI. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * This is the <i>Amazon Web Services B2B Data Interchange API Reference</i>. It provides descriptions, API request
 * parameters, and the XML response for each of the B2BI API actions.
 * </p>
 * <p>
 * B2BI enables automated exchange of EDI (electronic data interchange) based business-critical transactions at cloud
 * scale, with elasticity and pay-as-you-go pricing. Businesses use EDI documents to exchange transactional data with
 * trading partners, such as suppliers and end customers, using standardized formats such as X12.
 * </p>
 * <note>
 * <p>
 * Rather than actually running a command, you can use the <code>--generate-cli-skeleton</code> parameter with any API
 * call to generate and display a parameter template. You can then use the generated template to customize and use as
 * input on a later command. For details, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-skeleton.html#cli-usage-skeleton-generate">Generate
 * and use a parameter skeleton file</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSB2BiClient extends AmazonWebServiceClient implements AWSB2Bi {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSB2Bi.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "b2bi";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.b2bi.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.b2bi.model.AWSB2BiException.class));

    public static AWSB2BiClientBuilder builder() {
        return AWSB2BiClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS B2BI using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSB2BiClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS B2BI using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSB2BiClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("b2bi.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/b2bi/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/b2bi/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Instantiates a capability based on the specified parameters. A trading capability contains the information
     * required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param createCapabilityRequest
     * @return Result of the CreateCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCapabilityResult createCapability(CreateCapabilityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCapability(request);
    }

    @SdkInternalApi
    final CreateCapabilityResult executeCreateCapability(CreateCapabilityRequest createCapabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(createCapabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCapabilityRequest> request = null;
        Response<CreateCapabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCapabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCapabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCapability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCapabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCapabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a partnership between a customer and a trading partner, based on the supplied parameters. A partnership
     * represents the connection between you and your trading partner. It ties together a profile and one or more
     * trading capabilities.
     * </p>
     * 
     * @param createPartnershipRequest
     * @return Result of the CreatePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePartnershipResult createPartnership(CreatePartnershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePartnership(request);
    }

    @SdkInternalApi
    final CreatePartnershipResult executeCreatePartnership(CreatePartnershipRequest createPartnershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createPartnershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePartnershipRequest> request = null;
        Response<CreatePartnershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePartnershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPartnershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePartnership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePartnershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePartnershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a customer profile. You can have up to five customer profiles, each representing a distinct private
     * network. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfile(request);
    }

    @SdkInternalApi
    final CreateProfileResult executeCreateProfile(CreateProfileRequest createProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a transformer. A transformer describes how to process the incoming EDI documents and extract the
     * necessary information to the output file.
     * </p>
     * 
     * @param createTransformerRequest
     * @return Result of the CreateTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.CreateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/CreateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTransformerResult createTransformer(CreateTransformerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTransformer(request);
    }

    @SdkInternalApi
    final CreateTransformerResult executeCreateTransformer(CreateTransformerRequest createTransformerRequest) {

        ExecutionContext executionContext = createExecutionContext(createTransformerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransformerRequest> request = null;
        Response<CreateTransformerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransformerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTransformerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTransformer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTransformerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTransformerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified capability. A trading capability contains the information required to transform incoming
     * EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param deleteCapabilityRequest
     * @return Result of the DeleteCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteCapability" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCapabilityResult deleteCapability(DeleteCapabilityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCapability(request);
    }

    @SdkInternalApi
    final DeleteCapabilityResult executeDeleteCapability(DeleteCapabilityRequest deleteCapabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCapabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCapabilityRequest> request = null;
        Response<DeleteCapabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCapabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCapabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCapability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCapabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCapabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified partnership. A partnership represents the connection between you and your trading partner.
     * It ties together a profile and one or more trading capabilities.
     * </p>
     * 
     * @param deletePartnershipRequest
     * @return Result of the DeletePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeletePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeletePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePartnershipResult deletePartnership(DeletePartnershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePartnership(request);
    }

    @SdkInternalApi
    final DeletePartnershipResult executeDeletePartnership(DeletePartnershipRequest deletePartnershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePartnershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePartnershipRequest> request = null;
        Response<DeletePartnershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePartnershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePartnershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePartnership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePartnershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePartnershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified profile. A profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfile(request);
    }

    @SdkInternalApi
    final DeleteProfileResult executeDeleteProfile(DeleteProfileRequest deleteProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified transformer. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param deleteTransformerRequest
     * @return Result of the DeleteTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.DeleteTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/DeleteTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTransformerResult deleteTransformer(DeleteTransformerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTransformer(request);
    }

    @SdkInternalApi
    final DeleteTransformerResult executeDeleteTransformer(DeleteTransformerRequest deleteTransformerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTransformerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTransformerRequest> request = null;
        Response<DeleteTransformerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTransformerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTransformerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTransformer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTransformerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTransformerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for the specified capability. A trading capability contains the information required to
     * transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param getCapabilityRequest
     * @return Result of the GetCapability operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetCapability" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCapabilityResult getCapability(GetCapabilityRequest request) {
        request = beforeClientExecution(request);
        return executeGetCapability(request);
    }

    @SdkInternalApi
    final GetCapabilityResult executeGetCapability(GetCapabilityRequest getCapabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(getCapabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCapabilityRequest> request = null;
        Response<GetCapabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCapabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCapabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCapability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCapabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCapabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for a partnership, based on the partner and profile IDs specified. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param getPartnershipRequest
     * @return Result of the GetPartnership operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetPartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetPartnership" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPartnershipResult getPartnership(GetPartnershipRequest request) {
        request = beforeClientExecution(request);
        return executeGetPartnership(request);
    }

    @SdkInternalApi
    final GetPartnershipResult executeGetPartnership(GetPartnershipRequest getPartnershipRequest) {

        ExecutionContext executionContext = createExecutionContext(getPartnershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPartnershipRequest> request = null;
        Response<GetPartnershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPartnershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPartnershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPartnership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPartnershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPartnershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for the profile specified by the profile ID. A profile is the mechanism used to create the
     * concept of a private network.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfile(request);
    }

    @SdkInternalApi
    final GetProfileResult executeGetProfile(GetProfileRequest getProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details for the transformer specified by the transformer ID. A transformer describes how to process
     * the incoming EDI documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param getTransformerRequest
     * @return Result of the GetTransformer operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTransformerResult getTransformer(GetTransformerRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransformer(request);
    }

    @SdkInternalApi
    final GetTransformerResult executeGetTransformer(GetTransformerRequest getTransformerRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransformerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransformerRequest> request = null;
        Response<GetTransformerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransformerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTransformerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransformer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransformerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTransformerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the details of the transformer run, based on the Transformer job ID.
     * </p>
     * 
     * @param getTransformerJobRequest
     * @return Result of the GetTransformerJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.GetTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/GetTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTransformerJobResult getTransformerJob(GetTransformerJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransformerJob(request);
    }

    @SdkInternalApi
    final GetTransformerJobResult executeGetTransformerJob(GetTransformerJobRequest getTransformerJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransformerJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransformerJobRequest> request = null;
        Response<GetTransformerJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransformerJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTransformerJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransformerJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransformerJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTransformerJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the capabilities associated with your Amazon Web Services account for your current or specified region. A
     * trading capability contains the information required to transform incoming EDI documents into JSON or XML
     * outputs.
     * </p>
     * 
     * @param listCapabilitiesRequest
     * @return Result of the ListCapabilities operation returned by the service.
     * @sample AWSB2Bi.ListCapabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListCapabilities" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCapabilitiesResult listCapabilities(ListCapabilitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListCapabilities(request);
    }

    @SdkInternalApi
    final ListCapabilitiesResult executeListCapabilities(ListCapabilitiesRequest listCapabilitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCapabilitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCapabilitiesRequest> request = null;
        Response<ListCapabilitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCapabilitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCapabilitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCapabilities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCapabilitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCapabilitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the partnerships associated with your Amazon Web Services account for your current or specified region. A
     * partnership represents the connection between you and your trading partner. It ties together a profile and one or
     * more trading capabilities.
     * </p>
     * 
     * @param listPartnershipsRequest
     * @return Result of the ListPartnerships operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.ListPartnerships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPartnershipsResult listPartnerships(ListPartnershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListPartnerships(request);
    }

    @SdkInternalApi
    final ListPartnershipsResult executeListPartnerships(ListPartnershipsRequest listPartnershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPartnershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPartnershipsRequest> request = null;
        Response<ListPartnershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPartnershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPartnershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPartnerships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPartnershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPartnershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the profiles associated with your Amazon Web Services account for your current or specified region. A
     * profile is the mechanism used to create the concept of a private network.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @sample AWSB2Bi.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProfilesResult listProfiles(ListProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfiles(request);
    }

    @SdkInternalApi
    final ListProfilesResult executeListProfiles(ListProfilesRequest listProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfilesRequest> request = null;
        Response<ListProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the tags associated with the Amazon Resource Name (ARN) that you specify. The resource can be a
     * capability, partnership, profile, or transformer.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTagsForResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
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
     * Lists the available transformers. A transformer describes how to process the incoming EDI documents and extract
     * the necessary information to the output file.
     * </p>
     * 
     * @param listTransformersRequest
     * @return Result of the ListTransformers operation returned by the service.
     * @sample AWSB2Bi.ListTransformers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListTransformers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTransformersResult listTransformers(ListTransformersRequest request) {
        request = beforeClientExecution(request);
        return executeListTransformers(request);
    }

    @SdkInternalApi
    final ListTransformersResult executeListTransformers(ListTransformersRequest listTransformersRequest) {

        ExecutionContext executionContext = createExecutionContext(listTransformersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTransformersRequest> request = null;
        Response<ListTransformersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTransformersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTransformersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTransformers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTransformersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTransformersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs a job, using a transformer, to parse input EDI (electronic data interchange) file into the output structures
     * used by Amazon Web Services B2BI Data Interchange.
     * </p>
     * <p>
     * If you only want to transform EDI (electronic data interchange) documents, you don't need to create profiles,
     * partnerships or capabilities. Just create and configure a transformer, and then run the
     * <code>StartTransformerJob</code> API to process your files.
     * </p>
     * 
     * @param startTransformerJobRequest
     * @return Result of the StartTransformerJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.StartTransformerJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartTransformerJobResult startTransformerJob(StartTransformerJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartTransformerJob(request);
    }

    @SdkInternalApi
    final StartTransformerJobResult executeStartTransformerJob(StartTransformerJobRequest startTransformerJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startTransformerJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartTransformerJobRequest> request = null;
        Response<StartTransformerJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartTransformerJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startTransformerJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartTransformerJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartTransformerJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartTransformerJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a key-value pair to a resource, as identified by its Amazon Resource Name (ARN). Resources are
     * capability, partnership, profile, transformers and other entities.
     * </p>
     * <p>
     * There is no response returned from this call.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
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
     * Maps the input file according to the provided template file. The API call downloads the file contents from the
     * Amazon S3 location, and passes the contents in as a string, to the <code>inputFileContent</code> parameter.
     * </p>
     * 
     * @param testMappingRequest
     * @return Result of the TestMapping operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TestMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestMappingResult testMapping(TestMappingRequest request) {
        request = beforeClientExecution(request);
        return executeTestMapping(request);
    }

    @SdkInternalApi
    final TestMappingResult executeTestMapping(TestMappingRequest testMappingRequest) {

        ExecutionContext executionContext = createExecutionContext(testMappingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestMappingRequest> request = null;
        Response<TestMappingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestMappingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testMappingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestMapping");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestMappingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestMappingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Parses the input EDI (electronic data interchange) file. The input file has a file size limit of 250 KB.
     * </p>
     * 
     * @param testParsingRequest
     * @return Result of the TestParsing operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.TestParsing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TestParsingResult testParsing(TestParsingRequest request) {
        request = beforeClientExecution(request);
        return executeTestParsing(request);
    }

    @SdkInternalApi
    final TestParsingResult executeTestParsing(TestParsingRequest testParsingRequest) {

        ExecutionContext executionContext = createExecutionContext(testParsingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestParsingRequest> request = null;
        Response<TestParsingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestParsingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(testParsingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TestParsing");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TestParsingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TestParsingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a key-value pair from the specified resource, as identified by its Amazon Resource Name (ARN). Resources
     * are capability, partnership, profile, transformers and other entities.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
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
     * Updates some of the parameters for a capability, based on the specified parameters. A trading capability contains
     * the information required to transform incoming EDI documents into JSON or XML outputs.
     * </p>
     * 
     * @param updateCapabilityRequest
     * @return Result of the UpdateCapability operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateCapability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateCapability" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCapabilityResult updateCapability(UpdateCapabilityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCapability(request);
    }

    @SdkInternalApi
    final UpdateCapabilityResult executeUpdateCapability(UpdateCapabilityRequest updateCapabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCapabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCapabilityRequest> request = null;
        Response<UpdateCapabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCapabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCapabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCapability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCapabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCapabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates some of the parameters for a partnership between a customer and trading partner. A partnership represents
     * the connection between you and your trading partner. It ties together a profile and one or more trading
     * capabilities.
     * </p>
     * 
     * @param updatePartnershipRequest
     * @return Result of the UpdatePartnership operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdatePartnership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePartnershipResult updatePartnership(UpdatePartnershipRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePartnership(request);
    }

    @SdkInternalApi
    final UpdatePartnershipResult executeUpdatePartnership(UpdatePartnershipRequest updatePartnershipRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePartnershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePartnershipRequest> request = null;
        Response<UpdatePartnershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePartnershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePartnershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePartnership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePartnershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePartnershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified parameters for a profile. A profile is the mechanism used to create the concept of a
     * private network.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProfileResult updateProfile(UpdateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfile(request);
    }

    @SdkInternalApi
    final UpdateProfileResult executeUpdateProfile(UpdateProfileRequest updateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified parameters for a transformer. A transformer describes how to process the incoming EDI
     * documents and extract the necessary information to the output file.
     * </p>
     * 
     * @param updateTransformerRequest
     * @return Result of the UpdateTransformer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception is thrown when you attempt to delete a resource (such as a profile or a capability)
     *         that is being used by other resources.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         Occurs when a B2BI object cannot be validated against a request from another object.
     * @throws ThrottlingException
     *         The request was denied due to throttling: the data speed and rendering may be limited depending on
     *         various parameters and conditions.
     * @throws ResourceNotFoundException
     *         Occurs when the requested resource does not exist, or cannot be found. In some cases, the resource exists
     *         in a region other than the region specified in the API call.
     * @throws ServiceQuotaExceededException
     *         Occurs when the calling command attempts to exceed one of the service quotas, for example trying to
     *         create a capability when you already have the maximum number of capabilities allowed.
     * @throws InternalServerException
     *         This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
     * @sample AWSB2Bi.UpdateTransformer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdateTransformer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateTransformerResult updateTransformer(UpdateTransformerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTransformer(request);
    }

    @SdkInternalApi
    final UpdateTransformerResult executeUpdateTransformer(UpdateTransformerRequest updateTransformerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTransformerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTransformerRequest> request = null;
        Response<UpdateTransformerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTransformerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTransformerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "b2bi");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTransformer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTransformerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTransformerResultJsonUnmarshaller());
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
