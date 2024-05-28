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
package com.amazonaws.services.wellarchitected;

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

import com.amazonaws.services.wellarchitected.AWSWellArchitectedClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.wellarchitected.model.*;

import com.amazonaws.services.wellarchitected.model.transform.*;

/**
 * Client for accessing Well-Architected. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Well-Architected Tool</fullname>
 * <p>
 * This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a
 * href="http://aws.amazon.com/well-architected-tool">Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">Amazon Web Services Management Console</a>. For information
 * about the Well-Architected Tool, see the <a
 * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">Well-Architected Tool User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWellArchitectedClient extends AmazonWebServiceClient implements AWSWellArchitected {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSWellArchitected.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "wellarchitected";

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
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.wellarchitected.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.wellarchitected.model.AWSWellArchitectedException.class));

    public static AWSWellArchitectedClientBuilder builder() {
        return AWSWellArchitectedClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Well-Architected using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSWellArchitectedClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Well-Architected using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSWellArchitectedClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("wellarchitected.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/wellarchitected/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/wellarchitected/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associate a lens to a workload.
     * </p>
     * <p>
     * Up to 10 lenses can be associated with a workload in a single API operation. A maximum of 20 lenses can be
     * associated with a workload.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By accessing and/or applying custom lenses created by another Amazon Web Services user or account, you
     * acknowledge that custom lenses created by other users and shared with you are Third Party Content as defined in
     * the Amazon Web Services Customer Agreement.
     * </p>
     * </note>
     * 
     * @param associateLensesRequest
     *        Input to associate lens reviews.
     * @return Result of the AssociateLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.AssociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateLensesResult associateLenses(AssociateLensesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLenses(request);
    }

    @SdkInternalApi
    final AssociateLensesResult executeAssociateLenses(AssociateLensesRequest associateLensesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLensesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLensesRequest> request = null;
        Response<AssociateLensesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLensesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateLensesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLenses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLensesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateLensesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associate a profile with a workload.
     * </p>
     * 
     * @param associateProfilesRequest
     * @return Result of the AssociateProfiles operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.AssociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateProfilesResult associateProfiles(AssociateProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateProfiles(request);
    }

    @SdkInternalApi
    final AssociateProfilesResult executeAssociateProfiles(AssociateProfilesRequest associateProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateProfilesRequest> request = null;
        Response<AssociateProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a lens share.
     * </p>
     * <p>
     * The owner of a lens can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region. Lenses provided by Amazon Web Services (Amazon
     * Web Services Official Content) cannot be shared.
     * </p>
     * <p>
     * Shared access to a lens is not removed until the lens invitation is deleted.
     * </p>
     * <p>
     * If you share a lens with an organization or OU, all accounts in the organization or OU are granted access to the
     * lens.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-sharing.html">Sharing a custom lens</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param createLensShareRequest
     * @return Result of the CreateLensShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLensShareResult createLensShare(CreateLensShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLensShare(request);
    }

    @SdkInternalApi
    final CreateLensShareResult executeCreateLensShare(CreateLensShareRequest createLensShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createLensShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLensShareRequest> request = null;
        Response<CreateLensShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLensShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLensShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLensShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLensShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLensShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new lens version.
     * </p>
     * <p>
     * A lens can have up to 100 versions.
     * </p>
     * <p>
     * Use this operation to publish a new lens version after you have imported a lens. The <code>LensAlias</code> is
     * used to identify the lens to be published. The owner of a lens can share the lens with other Amazon Web Services
     * accounts and users in the same Amazon Web Services Region. Only the owner of a lens can delete it.
     * </p>
     * 
     * @param createLensVersionRequest
     * @return Result of the CreateLensVersion operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateLensVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLensVersionResult createLensVersion(CreateLensVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLensVersion(request);
    }

    @SdkInternalApi
    final CreateLensVersionResult executeCreateLensVersion(CreateLensVersionRequest createLensVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createLensVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLensVersionRequest> request = null;
        Response<CreateLensVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLensVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLensVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLensVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLensVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLensVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a milestone for an existing workload.
     * </p>
     * 
     * @param createMilestoneRequest
     *        Input for milestone creation.
     * @return Result of the CreateMilestone operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateMilestone"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMilestoneResult createMilestone(CreateMilestoneRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMilestone(request);
    }

    @SdkInternalApi
    final CreateMilestoneResult executeCreateMilestone(CreateMilestoneRequest createMilestoneRequest) {

        ExecutionContext executionContext = createExecutionContext(createMilestoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMilestoneRequest> request = null;
        Response<CreateMilestoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMilestoneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMilestoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMilestone");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMilestoneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMilestoneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a profile.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfile" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Create a profile share.
     * </p>
     * 
     * @param createProfileShareRequest
     * @return Result of the CreateProfileShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProfileShareResult createProfileShare(CreateProfileShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfileShare(request);
    }

    @SdkInternalApi
    final CreateProfileShareResult executeCreateProfileShare(CreateProfileShareRequest createProfileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileShareRequest> request = null;
        Response<CreateProfileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your review templates. If your review template or those shared with you and used in your account do
     * include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with
     * applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param createReviewTemplateRequest
     * @return Result of the CreateReviewTemplate operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateReviewTemplateResult createReviewTemplate(CreateReviewTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateReviewTemplate(request);
    }

    @SdkInternalApi
    final CreateReviewTemplateResult executeCreateReviewTemplate(CreateReviewTemplateRequest createReviewTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createReviewTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReviewTemplateRequest> request = null;
        Response<CreateReviewTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReviewTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createReviewTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateReviewTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateReviewTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateReviewTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a review template share.
     * </p>
     * <p>
     * The owner of a review template can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region.
     * </p>
     * <p>
     * Shared access to a review template is not removed until the review template share invitation is deleted.
     * </p>
     * <p>
     * If you share a review template with an organization or OU, all accounts in the organization or OU are granted
     * access to the review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your review template with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your review template available to those other accounts.
     * </p>
     * </note>
     * 
     * @param createTemplateShareRequest
     * @return Result of the CreateTemplateShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTemplateShareResult createTemplateShare(CreateTemplateShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTemplateShare(request);
    }

    @SdkInternalApi
    final CreateTemplateShareResult executeCreateTemplateShare(CreateTemplateShareRequest createTemplateShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createTemplateShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTemplateShareRequest> request = null;
        Response<CreateTemplateShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTemplateShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTemplateShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTemplateShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTemplateShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTemplateShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new workload.
     * </p>
     * <p>
     * The owner of a workload can share the workload with other Amazon Web Services accounts, users, an organization,
     * and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload can delete
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/define-workload.html">Defining a Workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Either <code>AwsRegions</code>, <code>NonAwsRegions</code>, or both must be specified when creating a workload.
     * </p>
     * <p>
     * You also must specify <code>ReviewOwner</code>, even though the parameter is listed as not being required in the
     * following section.
     * </p>
     * </important>
     * <p>
     * When creating a workload using a review template, you must have the following IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateAnswer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:ListReviewTemplateAnswers</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateLensReview</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createWorkloadRequest
     *        Input for workload creation.
     * @return Result of the CreateWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWorkloadResult createWorkload(CreateWorkloadRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkload(request);
    }

    @SdkInternalApi
    final CreateWorkloadResult executeCreateWorkload(CreateWorkloadRequest createWorkloadRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkloadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkloadRequest> request = null;
        Response<CreateWorkloadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkloadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkloadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkloadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkloadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a workload share.
     * </p>
     * <p>
     * The owner of a workload can share it with other Amazon Web Services accounts and users in the same Amazon Web
     * Services Region. Shared access to a workload is not removed until the workload invitation is deleted.
     * </p>
     * <p>
     * If you share a workload with an organization or OU, all accounts in the organization or OU are granted access to
     * the workload.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/workloads-sharing.html">Sharing a workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * 
     * @param createWorkloadShareRequest
     *        Input for Create Workload Share
     * @return Result of the CreateWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkloadShareResult createWorkloadShare(CreateWorkloadShareRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkloadShare(request);
    }

    @SdkInternalApi
    final CreateWorkloadShareResult executeCreateWorkloadShare(CreateWorkloadShareRequest createWorkloadShareRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkloadShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkloadShareRequest> request = null;
        Response<CreateWorkloadShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkloadShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkloadShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkloadShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkloadShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkloadShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and users that
     * you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteLensRequest
     * @return Result of the DeleteLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLens" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLensResult deleteLens(DeleteLensRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLens(request);
    }

    @SdkInternalApi
    final DeleteLensResult executeDeleteLens(DeleteLensRequest deleteLensRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLensRequest> request = null;
        Response<DeleteLensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLensRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLensResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a lens share.
     * </p>
     * <p>
     * After the lens share is deleted, Amazon Web Services accounts, users, organizations, and organizational units
     * (OUs) that you shared the lens with can continue to use it, but they will no longer be able to apply it to new
     * workloads.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteLensShareRequest
     * @return Result of the DeleteLensShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLensShareResult deleteLensShare(DeleteLensShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLensShare(request);
    }

    @SdkInternalApi
    final DeleteLensShareResult executeDeleteLensShare(DeleteLensShareRequest deleteLensShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLensShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLensShareRequest> request = null;
        Response<DeleteLensShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLensShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLensShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLensShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLensShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLensShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a profile.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your profile with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will
     * make your profile available to those other accounts. Those other accounts may continue to access and use your
     * shared profile even if you delete the profile from your own Amazon Web Services account or terminate your Amazon
     * Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Delete a profile share.
     * </p>
     * 
     * @param deleteProfileShareRequest
     * @return Result of the DeleteProfileShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProfileShareResult deleteProfileShare(DeleteProfileShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfileShare(request);
    }

    @SdkInternalApi
    final DeleteProfileShareResult executeDeleteProfileShare(DeleteProfileShareRequest deleteProfileShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileShareRequest> request = null;
        Response<DeleteProfileShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfileShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a review template.
     * </p>
     * <p>
     * Only the owner of a review template can delete it.
     * </p>
     * <p>
     * After the review template is deleted, Amazon Web Services accounts, users, organizations, and organizational
     * units (OUs) that you shared the review template with will no longer be able to apply it to new workloads.
     * </p>
     * 
     * @param deleteReviewTemplateRequest
     * @return Result of the DeleteReviewTemplate operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteReviewTemplateResult deleteReviewTemplate(DeleteReviewTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteReviewTemplate(request);
    }

    @SdkInternalApi
    final DeleteReviewTemplateResult executeDeleteReviewTemplate(DeleteReviewTemplateRequest deleteReviewTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteReviewTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReviewTemplateRequest> request = null;
        Response<DeleteReviewTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReviewTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteReviewTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteReviewTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteReviewTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteReviewTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a review template share.
     * </p>
     * <p>
     * After the review template share is deleted, Amazon Web Services accounts, users, organizations, and
     * organizational units (OUs) that you shared the review template with will no longer be able to apply it to new
     * workloads.
     * </p>
     * 
     * @param deleteTemplateShareRequest
     * @return Result of the DeleteTemplateShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteTemplateShareResult deleteTemplateShare(DeleteTemplateShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTemplateShare(request);
    }

    @SdkInternalApi
    final DeleteTemplateShareResult executeDeleteTemplateShare(DeleteTemplateShareRequest deleteTemplateShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTemplateShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTemplateShareRequest> request = null;
        Response<DeleteTemplateShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTemplateShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTemplateShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTemplateShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTemplateShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTemplateShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an existing workload.
     * </p>
     * 
     * @param deleteWorkloadRequest
     *        Input for workload deletion.
     * @return Result of the DeleteWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWorkloadResult deleteWorkload(DeleteWorkloadRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkload(request);
    }

    @SdkInternalApi
    final DeleteWorkloadResult executeDeleteWorkload(DeleteWorkloadRequest deleteWorkloadRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkloadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkloadRequest> request = null;
        Response<DeleteWorkloadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkloadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkloadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkloadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkloadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a workload share.
     * </p>
     * 
     * @param deleteWorkloadShareRequest
     *        Input for Delete Workload Share
     * @return Result of the DeleteWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkloadShareResult deleteWorkloadShare(DeleteWorkloadShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkloadShare(request);
    }

    @SdkInternalApi
    final DeleteWorkloadShareResult executeDeleteWorkloadShare(DeleteWorkloadShareRequest deleteWorkloadShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkloadShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkloadShareRequest> request = null;
        Response<DeleteWorkloadShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkloadShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkloadShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkloadShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkloadShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkloadShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate a lens from a workload.
     * </p>
     * <p>
     * Up to 10 lenses can be disassociated from a workload in a single API operation.
     * </p>
     * <note>
     * <p>
     * The Amazon Web Services Well-Architected Framework lens (<code>wellarchitected</code>) cannot be removed from a
     * workload.
     * </p>
     * </note>
     * 
     * @param disassociateLensesRequest
     *        Input to disassociate lens reviews.
     * @return Result of the DisassociateLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DisassociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateLensesResult disassociateLenses(DisassociateLensesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLenses(request);
    }

    @SdkInternalApi
    final DisassociateLensesResult executeDisassociateLenses(DisassociateLensesRequest disassociateLensesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLensesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLensesRequest> request = null;
        Response<DisassociateLensesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLensesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateLensesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLenses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLensesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateLensesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate a profile from a workload.
     * </p>
     * 
     * @param disassociateProfilesRequest
     * @return Result of the DisassociateProfiles operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DisassociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateProfilesResult disassociateProfiles(DisassociateProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateProfiles(request);
    }

    @SdkInternalApi
    final DisassociateProfilesResult executeDisassociateProfiles(DisassociateProfilesRequest disassociateProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateProfilesRequest> request = null;
        Response<DisassociateProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Export an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can export it. Lenses provided by Amazon Web Services (Amazon Web Services Official
     * Content) cannot be exported.
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or
     * collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable
     * law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param exportLensRequest
     * @return Result of the ExportLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ExportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportLensResult exportLens(ExportLensRequest request) {
        request = beforeClientExecution(request);
        return executeExportLens(request);
    }

    @SdkInternalApi
    final ExportLensResult executeExportLens(ExportLensRequest exportLensRequest) {

        ExecutionContext executionContext = createExecutionContext(exportLensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportLensRequest> request = null;
        Response<ExportLensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportLensRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportLensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportLens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportLensResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportLensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the answer to a specific question in a workload review.
     * </p>
     * 
     * @param getAnswerRequest
     *        Input to get answer.
     * @return Result of the GetAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnswerResult getAnswer(GetAnswerRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnswer(request);
    }

    @SdkInternalApi
    final GetAnswerResult executeGetAnswer(GetAnswerRequest getAnswerRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnswerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnswerRequest> request = null;
        Response<GetAnswerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnswerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnswerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnswer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnswerResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnswerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a consolidated report of your workloads.
     * </p>
     * <p>
     * You can optionally choose to include workloads that have been shared with you.
     * </p>
     * 
     * @param getConsolidatedReportRequest
     * @return Result of the GetConsolidatedReport operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @sample AWSWellArchitected.GetConsolidatedReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetConsolidatedReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConsolidatedReportResult getConsolidatedReport(GetConsolidatedReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetConsolidatedReport(request);
    }

    @SdkInternalApi
    final GetConsolidatedReportResult executeGetConsolidatedReport(GetConsolidatedReportRequest getConsolidatedReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getConsolidatedReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConsolidatedReportRequest> request = null;
        Response<GetConsolidatedReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConsolidatedReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConsolidatedReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConsolidatedReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConsolidatedReportResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetConsolidatedReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Global settings for all workloads.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetGlobalSettings(request);
    }

    @SdkInternalApi
    final GetGlobalSettingsResult executeGetGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGlobalSettingsRequest> request = null;
        Response<GetGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get an existing lens.
     * </p>
     * 
     * @param getLensRequest
     * @return Result of the GetLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLens" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLensResult getLens(GetLensRequest request) {
        request = beforeClientExecution(request);
        return executeGetLens(request);
    }

    @SdkInternalApi
    final GetLensResult executeGetLens(GetLensRequest getLensRequest) {

        ExecutionContext executionContext = createExecutionContext(getLensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLensRequest> request = null;
        Response<GetLensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLensRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLensResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get lens review.
     * </p>
     * 
     * @param getLensReviewRequest
     *        Input to get lens review.
     * @return Result of the GetLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReview" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLensReviewResult getLensReview(GetLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeGetLensReview(request);
    }

    @SdkInternalApi
    final GetLensReviewResult executeGetLensReview(GetLensReviewRequest getLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(getLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLensReviewRequest> request = null;
        Response<GetLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLensReviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get lens review report.
     * </p>
     * 
     * @param getLensReviewReportRequest
     *        Input to get lens review report.
     * @return Result of the GetLensReviewReport operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensReviewReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReviewReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLensReviewReportResult getLensReviewReport(GetLensReviewReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetLensReviewReport(request);
    }

    @SdkInternalApi
    final GetLensReviewReportResult executeGetLensReviewReport(GetLensReviewReportRequest getLensReviewReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getLensReviewReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLensReviewReportRequest> request = null;
        Response<GetLensReviewReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLensReviewReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLensReviewReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLensReviewReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLensReviewReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLensReviewReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get lens version differences.
     * </p>
     * 
     * @param getLensVersionDifferenceRequest
     * @return Result of the GetLensVersionDifference operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensVersionDifference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLensVersionDifferenceResult getLensVersionDifference(GetLensVersionDifferenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetLensVersionDifference(request);
    }

    @SdkInternalApi
    final GetLensVersionDifferenceResult executeGetLensVersionDifference(GetLensVersionDifferenceRequest getLensVersionDifferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getLensVersionDifferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLensVersionDifferenceRequest> request = null;
        Response<GetLensVersionDifferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLensVersionDifferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLensVersionDifferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLensVersionDifference");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLensVersionDifferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLensVersionDifferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a milestone for an existing workload.
     * </p>
     * 
     * @param getMilestoneRequest
     *        Input to get a milestone.
     * @return Result of the GetMilestone operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetMilestone" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMilestoneResult getMilestone(GetMilestoneRequest request) {
        request = beforeClientExecution(request);
        return executeGetMilestone(request);
    }

    @SdkInternalApi
    final GetMilestoneResult executeGetMilestone(GetMilestoneRequest getMilestoneRequest) {

        ExecutionContext executionContext = createExecutionContext(getMilestoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMilestoneRequest> request = null;
        Response<GetMilestoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMilestoneRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMilestoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMilestone");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMilestoneResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMilestoneResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get profile information.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfile" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Get profile template.
     * </p>
     * 
     * @param getProfileTemplateRequest
     * @return Result of the GetProfileTemplate operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetProfileTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfileTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProfileTemplateResult getProfileTemplate(GetProfileTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfileTemplate(request);
    }

    @SdkInternalApi
    final GetProfileTemplateResult executeGetProfileTemplate(GetProfileTemplateRequest getProfileTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileTemplateRequest> request = null;
        Response<GetProfileTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfileTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get review template.
     * </p>
     * 
     * @param getReviewTemplateRequest
     * @return Result of the GetReviewTemplate operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReviewTemplateResult getReviewTemplate(GetReviewTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetReviewTemplate(request);
    }

    @SdkInternalApi
    final GetReviewTemplateResult executeGetReviewTemplate(GetReviewTemplateRequest getReviewTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getReviewTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReviewTemplateRequest> request = null;
        Response<GetReviewTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReviewTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getReviewTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReviewTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReviewTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetReviewTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get review template answer.
     * </p>
     * 
     * @param getReviewTemplateAnswerRequest
     * @return Result of the GetReviewTemplateAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReviewTemplateAnswerResult getReviewTemplateAnswer(GetReviewTemplateAnswerRequest request) {
        request = beforeClientExecution(request);
        return executeGetReviewTemplateAnswer(request);
    }

    @SdkInternalApi
    final GetReviewTemplateAnswerResult executeGetReviewTemplateAnswer(GetReviewTemplateAnswerRequest getReviewTemplateAnswerRequest) {

        ExecutionContext executionContext = createExecutionContext(getReviewTemplateAnswerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReviewTemplateAnswerRequest> request = null;
        Response<GetReviewTemplateAnswerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReviewTemplateAnswerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReviewTemplateAnswerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReviewTemplateAnswer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReviewTemplateAnswerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReviewTemplateAnswerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a lens review associated with a review template.
     * </p>
     * 
     * @param getReviewTemplateLensReviewRequest
     * @return Result of the GetReviewTemplateLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReviewTemplateLensReviewResult getReviewTemplateLensReview(GetReviewTemplateLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeGetReviewTemplateLensReview(request);
    }

    @SdkInternalApi
    final GetReviewTemplateLensReviewResult executeGetReviewTemplateLensReview(GetReviewTemplateLensReviewRequest getReviewTemplateLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(getReviewTemplateLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReviewTemplateLensReviewRequest> request = null;
        Response<GetReviewTemplateLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReviewTemplateLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getReviewTemplateLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReviewTemplateLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetReviewTemplateLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetReviewTemplateLensReviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get an existing workload.
     * </p>
     * 
     * @param getWorkloadRequest
     *        Input to get a workload.
     * @return Result of the GetWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetWorkload" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Import a new custom lens or update an existing custom lens.
     * </p>
     * <p>
     * To update an existing custom lens, specify its ARN as the <code>LensAlias</code>. If no ARN is specified, a new
     * custom lens is created.
     * </p>
     * <p>
     * The new or updated lens will have a status of <code>DRAFT</code>. The lens cannot be applied to workloads or
     * shared with other Amazon Web Services accounts until it's published with <a>CreateLensVersion</a>.
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <p>
     * A custom lens cannot exceed 500 KB in size.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or
     * collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable
     * law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param importLensRequest
     * @return Result of the ImportLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ImportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImportLens" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportLensResult importLens(ImportLensRequest request) {
        request = beforeClientExecution(request);
        return executeImportLens(request);
    }

    @SdkInternalApi
    final ImportLensResult executeImportLens(ImportLensRequest importLensRequest) {

        ExecutionContext executionContext = createExecutionContext(importLensRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportLensRequest> request = null;
        Response<ImportLensResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportLensRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importLensRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportLens");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportLensResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportLensResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List of answers for a particular workload and lens.
     * </p>
     * 
     * @param listAnswersRequest
     *        Input to list answers.
     * @return Result of the ListAnswers operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListAnswers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAnswersResult listAnswers(ListAnswersRequest request) {
        request = beforeClientExecution(request);
        return executeListAnswers(request);
    }

    @SdkInternalApi
    final ListAnswersResult executeListAnswers(ListAnswersRequest listAnswersRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnswersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnswersRequest> request = null;
        Response<ListAnswersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnswersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnswersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnswers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnswersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnswersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List of Trusted Advisor check details by account related to the workload.
     * </p>
     * 
     * @param listCheckDetailsRequest
     * @return Result of the ListCheckDetails operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListCheckDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCheckDetailsResult listCheckDetails(ListCheckDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeListCheckDetails(request);
    }

    @SdkInternalApi
    final ListCheckDetailsResult executeListCheckDetails(ListCheckDetailsRequest listCheckDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCheckDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCheckDetailsRequest> request = null;
        Response<ListCheckDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCheckDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCheckDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCheckDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCheckDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCheckDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List of Trusted Advisor checks summarized for all accounts related to the workload.
     * </p>
     * 
     * @param listCheckSummariesRequest
     * @return Result of the ListCheckSummaries operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCheckSummariesResult listCheckSummaries(ListCheckSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeListCheckSummaries(request);
    }

    @SdkInternalApi
    final ListCheckSummariesResult executeListCheckSummaries(ListCheckSummariesRequest listCheckSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCheckSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCheckSummariesRequest> request = null;
        Response<ListCheckSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCheckSummariesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCheckSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCheckSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCheckSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCheckSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the improvements of a particular lens review.
     * </p>
     * 
     * @param listLensReviewImprovementsRequest
     *        Input to list lens review improvements.
     * @return Result of the ListLensReviewImprovements operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensReviewImprovements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviewImprovements"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLensReviewImprovementsResult listLensReviewImprovements(ListLensReviewImprovementsRequest request) {
        request = beforeClientExecution(request);
        return executeListLensReviewImprovements(request);
    }

    @SdkInternalApi
    final ListLensReviewImprovementsResult executeListLensReviewImprovements(ListLensReviewImprovementsRequest listLensReviewImprovementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLensReviewImprovementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLensReviewImprovementsRequest> request = null;
        Response<ListLensReviewImprovementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLensReviewImprovementsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLensReviewImprovementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLensReviewImprovements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLensReviewImprovementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLensReviewImprovementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List lens reviews for a particular workload.
     * </p>
     * 
     * @param listLensReviewsRequest
     *        Input to list lens reviews.
     * @return Result of the ListLensReviews operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviews"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLensReviewsResult listLensReviews(ListLensReviewsRequest request) {
        request = beforeClientExecution(request);
        return executeListLensReviews(request);
    }

    @SdkInternalApi
    final ListLensReviewsResult executeListLensReviews(ListLensReviewsRequest listLensReviewsRequest) {

        ExecutionContext executionContext = createExecutionContext(listLensReviewsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLensReviewsRequest> request = null;
        Response<ListLensReviewsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLensReviewsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLensReviewsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLensReviews");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLensReviewsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLensReviewsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the lens shares associated with the lens.
     * </p>
     * 
     * @param listLensSharesRequest
     * @return Result of the ListLensShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListLensSharesResult listLensShares(ListLensSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListLensShares(request);
    }

    @SdkInternalApi
    final ListLensSharesResult executeListLensShares(ListLensSharesRequest listLensSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLensSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLensSharesRequest> request = null;
        Response<ListLensSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLensSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLensSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLensShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLensSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLensSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the available lenses.
     * </p>
     * 
     * @param listLensesRequest
     *        Input to list lenses.
     * @return Result of the ListLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLenses" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLensesResult listLenses(ListLensesRequest request) {
        request = beforeClientExecution(request);
        return executeListLenses(request);
    }

    @SdkInternalApi
    final ListLensesResult executeListLenses(ListLensesRequest listLensesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLensesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLensesRequest> request = null;
        Response<ListLensesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLensesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLensesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLenses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLensesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLensesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all milestones for an existing workload.
     * </p>
     * 
     * @param listMilestonesRequest
     *        Input to list all milestones for a workload.
     * @return Result of the ListMilestones operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListMilestones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListMilestones" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListMilestonesResult listMilestones(ListMilestonesRequest request) {
        request = beforeClientExecution(request);
        return executeListMilestones(request);
    }

    @SdkInternalApi
    final ListMilestonesResult executeListMilestones(ListMilestonesRequest listMilestonesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMilestonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMilestonesRequest> request = null;
        Response<ListMilestonesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMilestonesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMilestonesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMilestones");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMilestonesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMilestonesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List lens notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListNotificationsResult listNotifications(ListNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotifications(request);
    }

    @SdkInternalApi
    final ListNotificationsResult executeListNotifications(ListNotificationsRequest listNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationsRequest> request = null;
        Response<ListNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List profile notifications.
     * </p>
     * 
     * @param listProfileNotificationsRequest
     * @return Result of the ListProfileNotifications operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListProfileNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileNotificationsResult listProfileNotifications(ListProfileNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileNotifications(request);
    }

    @SdkInternalApi
    final ListProfileNotificationsResult executeListProfileNotifications(ListProfileNotificationsRequest listProfileNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileNotificationsRequest> request = null;
        Response<ListProfileNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProfileNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProfileNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List profile shares.
     * </p>
     * 
     * @param listProfileSharesRequest
     * @return Result of the ListProfileShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListProfileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProfileSharesResult listProfileShares(ListProfileSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListProfileShares(request);
    }

    @SdkInternalApi
    final ListProfileSharesResult executeListProfileShares(ListProfileSharesRequest listProfileSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProfileSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProfileSharesRequest> request = null;
        Response<ListProfileSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProfileSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProfileSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProfileShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProfileSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProfileSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List profiles.
     * </p>
     * 
     * @param listProfilesRequest
     * @return Result of the ListProfiles operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfiles" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * List the answers of a review template.
     * </p>
     * 
     * @param listReviewTemplateAnswersRequest
     * @return Result of the ListReviewTemplateAnswers operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListReviewTemplateAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplateAnswers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReviewTemplateAnswersResult listReviewTemplateAnswers(ListReviewTemplateAnswersRequest request) {
        request = beforeClientExecution(request);
        return executeListReviewTemplateAnswers(request);
    }

    @SdkInternalApi
    final ListReviewTemplateAnswersResult executeListReviewTemplateAnswers(ListReviewTemplateAnswersRequest listReviewTemplateAnswersRequest) {

        ExecutionContext executionContext = createExecutionContext(listReviewTemplateAnswersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReviewTemplateAnswersRequest> request = null;
        Response<ListReviewTemplateAnswersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReviewTemplateAnswersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listReviewTemplateAnswersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReviewTemplateAnswers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReviewTemplateAnswersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListReviewTemplateAnswersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List review templates.
     * </p>
     * 
     * @param listReviewTemplatesRequest
     * @return Result of the ListReviewTemplates operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListReviewTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReviewTemplatesResult listReviewTemplates(ListReviewTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListReviewTemplates(request);
    }

    @SdkInternalApi
    final ListReviewTemplatesResult executeListReviewTemplates(ListReviewTemplatesRequest listReviewTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listReviewTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReviewTemplatesRequest> request = null;
        Response<ListReviewTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReviewTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReviewTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReviewTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReviewTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReviewTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the share invitations.
     * </p>
     * <p>
     * <code>WorkloadNamePrefix</code>, <code>LensNamePrefix</code>, <code>ProfileNamePrefix</code>, and
     * <code>TemplateNamePrefix</code> are mutually exclusive. Use the parameter that matches your
     * <code>ShareResourceType</code>.
     * </p>
     * 
     * @param listShareInvitationsRequest
     *        Input for List Share Invitations
     * @return Result of the ListShareInvitations operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListShareInvitationsResult listShareInvitations(ListShareInvitationsRequest request) {
        request = beforeClientExecution(request);
        return executeListShareInvitations(request);
    }

    @SdkInternalApi
    final ListShareInvitationsResult executeListShareInvitations(ListShareInvitationsRequest listShareInvitationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listShareInvitationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListShareInvitationsRequest> request = null;
        Response<ListShareInvitationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListShareInvitationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listShareInvitationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListShareInvitations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListShareInvitationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListShareInvitationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags for a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * List review template shares.
     * </p>
     * 
     * @param listTemplateSharesRequest
     * @return Result of the ListTemplateShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListTemplateShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTemplateShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTemplateSharesResult listTemplateShares(ListTemplateSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListTemplateShares(request);
    }

    @SdkInternalApi
    final ListTemplateSharesResult executeListTemplateShares(ListTemplateSharesRequest listTemplateSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listTemplateSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTemplateSharesRequest> request = null;
        Response<ListTemplateSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTemplateSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTemplateSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTemplateShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTemplateSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTemplateSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the workload shares associated with the workload.
     * </p>
     * 
     * @param listWorkloadSharesRequest
     *        Input for List Workload Share
     * @return Result of the ListWorkloadShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListWorkloadShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloadShares"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkloadSharesResult listWorkloadShares(ListWorkloadSharesRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkloadShares(request);
    }

    @SdkInternalApi
    final ListWorkloadSharesResult executeListWorkloadShares(ListWorkloadSharesRequest listWorkloadSharesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkloadSharesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkloadSharesRequest> request = null;
        Response<ListWorkloadSharesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkloadSharesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkloadSharesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkloadShares");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkloadSharesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkloadSharesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Paginated list of workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     *        Input to list all workloads.
     * @return Result of the ListWorkloads operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Deletes specified tags from a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * <p>
     * To specify multiple tags, use separate <b>tagKeys</b> parameters, for example:
     * </p>
     * <p>
     * <code>DELETE /tags/WorkloadArn?tagKeys=key1&amp;tagKeys=key2</code>
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Update the answer to a specific question in a workload review.
     * </p>
     * 
     * @param updateAnswerRequest
     *        Input to update answer.
     * @return Result of the UpdateAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateAnswer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAnswerResult updateAnswer(UpdateAnswerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnswer(request);
    }

    @SdkInternalApi
    final UpdateAnswerResult executeUpdateAnswer(UpdateAnswerRequest updateAnswerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnswerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnswerRequest> request = null;
        Response<UpdateAnswerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnswerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnswerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnswer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnswerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAnswerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update whether the Amazon Web Services account is opted into organization sharing and discovery integration
     * features.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalSettings(request);
    }

    @SdkInternalApi
    final UpdateGlobalSettingsResult executeUpdateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalSettingsRequest> request = null;
        Response<UpdateGlobalSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update integration features.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @return Result of the UpdateIntegration operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateIntegrationResult updateIntegration(UpdateIntegrationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIntegration(request);
    }

    @SdkInternalApi
    final UpdateIntegrationResult executeUpdateIntegration(UpdateIntegrationRequest updateIntegrationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIntegrationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIntegrationRequest> request = null;
        Response<UpdateIntegrationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIntegrationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIntegrationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIntegration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIntegrationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIntegrationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update lens review for a particular workload.
     * </p>
     * 
     * @param updateLensReviewRequest
     *        Input for update lens review.
     * @return Result of the UpdateLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLensReviewResult updateLensReview(UpdateLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLensReview(request);
    }

    @SdkInternalApi
    final UpdateLensReviewResult executeUpdateLensReview(UpdateLensReviewRequest updateLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLensReviewRequest> request = null;
        Response<UpdateLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLensReviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a profile.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
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
     * Update a review template.
     * </p>
     * 
     * @param updateReviewTemplateRequest
     * @return Result of the UpdateReviewTemplate operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReviewTemplateResult updateReviewTemplate(UpdateReviewTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReviewTemplate(request);
    }

    @SdkInternalApi
    final UpdateReviewTemplateResult executeUpdateReviewTemplate(UpdateReviewTemplateRequest updateReviewTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReviewTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReviewTemplateRequest> request = null;
        Response<UpdateReviewTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReviewTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateReviewTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReviewTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReviewTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateReviewTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a review template answer.
     * </p>
     * 
     * @param updateReviewTemplateAnswerRequest
     * @return Result of the UpdateReviewTemplateAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReviewTemplateAnswerResult updateReviewTemplateAnswer(UpdateReviewTemplateAnswerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReviewTemplateAnswer(request);
    }

    @SdkInternalApi
    final UpdateReviewTemplateAnswerResult executeUpdateReviewTemplateAnswer(UpdateReviewTemplateAnswerRequest updateReviewTemplateAnswerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReviewTemplateAnswerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReviewTemplateAnswerRequest> request = null;
        Response<UpdateReviewTemplateAnswerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReviewTemplateAnswerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateReviewTemplateAnswerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReviewTemplateAnswer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReviewTemplateAnswerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateReviewTemplateAnswerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a lens review associated with a review template.
     * </p>
     * 
     * @param updateReviewTemplateLensReviewRequest
     * @return Result of the UpdateReviewTemplateLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateReviewTemplateLensReviewResult updateReviewTemplateLensReview(UpdateReviewTemplateLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateReviewTemplateLensReview(request);
    }

    @SdkInternalApi
    final UpdateReviewTemplateLensReviewResult executeUpdateReviewTemplateLensReview(UpdateReviewTemplateLensReviewRequest updateReviewTemplateLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(updateReviewTemplateLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateReviewTemplateLensReviewRequest> request = null;
        Response<UpdateReviewTemplateLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateReviewTemplateLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateReviewTemplateLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateReviewTemplateLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateReviewTemplateLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateReviewTemplateLensReviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a workload or custom lens share invitation.
     * </p>
     * <note>
     * <p>
     * This API operation can be called independently of any resource. Previous documentation implied that a workload
     * ARN must be specified.
     * </p>
     * </note>
     * 
     * @param updateShareInvitationRequest
     *        Input for Update Share Invitation
     * @return Result of the UpdateShareInvitation operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateShareInvitationResult updateShareInvitation(UpdateShareInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateShareInvitation(request);
    }

    @SdkInternalApi
    final UpdateShareInvitationResult executeUpdateShareInvitation(UpdateShareInvitationRequest updateShareInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateShareInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateShareInvitationRequest> request = null;
        Response<UpdateShareInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateShareInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateShareInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateShareInvitation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateShareInvitationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateShareInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an existing workload.
     * </p>
     * 
     * @param updateWorkloadRequest
     *        Input to update a workload.
     * @return Result of the UpdateWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateWorkloadResult updateWorkload(UpdateWorkloadRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkload(request);
    }

    @SdkInternalApi
    final UpdateWorkloadResult executeUpdateWorkload(UpdateWorkloadRequest updateWorkloadRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkloadRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkloadRequest> request = null;
        Response<UpdateWorkloadResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkloadRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkloadRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkload");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkloadResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkloadResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a workload share.
     * </p>
     * 
     * @param updateWorkloadShareRequest
     *        Input for Update Workload Share
     * @return Result of the UpdateWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateWorkloadShareResult updateWorkloadShare(UpdateWorkloadShareRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateWorkloadShare(request);
    }

    @SdkInternalApi
    final UpdateWorkloadShareResult executeUpdateWorkloadShare(UpdateWorkloadShareRequest updateWorkloadShareRequest) {

        ExecutionContext executionContext = createExecutionContext(updateWorkloadShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateWorkloadShareRequest> request = null;
        Response<UpdateWorkloadShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateWorkloadShareRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateWorkloadShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateWorkloadShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateWorkloadShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateWorkloadShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Upgrade lens review for a particular workload.
     * </p>
     * 
     * @param upgradeLensReviewRequest
     * @return Result of the UpgradeLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @sample AWSWellArchitected.UpgradeLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpgradeLensReviewResult upgradeLensReview(UpgradeLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeLensReview(request);
    }

    @SdkInternalApi
    final UpgradeLensReviewResult executeUpgradeLensReview(UpgradeLensReviewRequest upgradeLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeLensReviewRequest> request = null;
        Response<UpgradeLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradeLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpgradeLensReviewResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Upgrade a profile.
     * </p>
     * 
     * @param upgradeProfileVersionRequest
     * @return Result of the UpgradeProfileVersion operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @sample AWSWellArchitected.UpgradeProfileVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeProfileVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpgradeProfileVersionResult upgradeProfileVersion(UpgradeProfileVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeProfileVersion(request);
    }

    @SdkInternalApi
    final UpgradeProfileVersionResult executeUpgradeProfileVersion(UpgradeProfileVersionRequest upgradeProfileVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeProfileVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeProfileVersionRequest> request = null;
        Response<UpgradeProfileVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeProfileVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(upgradeProfileVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeProfileVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeProfileVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpgradeProfileVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Upgrade the lens review of a review template.
     * </p>
     * 
     * @param upgradeReviewTemplateLensReviewRequest
     * @return Result of the UpgradeReviewTemplateLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource has already been processed, was deleted, or is too large.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpgradeReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpgradeReviewTemplateLensReviewResult upgradeReviewTemplateLensReview(UpgradeReviewTemplateLensReviewRequest request) {
        request = beforeClientExecution(request);
        return executeUpgradeReviewTemplateLensReview(request);
    }

    @SdkInternalApi
    final UpgradeReviewTemplateLensReviewResult executeUpgradeReviewTemplateLensReview(
            UpgradeReviewTemplateLensReviewRequest upgradeReviewTemplateLensReviewRequest) {

        ExecutionContext executionContext = createExecutionContext(upgradeReviewTemplateLensReviewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpgradeReviewTemplateLensReviewRequest> request = null;
        Response<UpgradeReviewTemplateLensReviewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpgradeReviewTemplateLensReviewRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(upgradeReviewTemplateLensReviewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "WellArchitected");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpgradeReviewTemplateLensReview");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpgradeReviewTemplateLensReviewResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpgradeReviewTemplateLensReviewResultJsonUnmarshaller());
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
