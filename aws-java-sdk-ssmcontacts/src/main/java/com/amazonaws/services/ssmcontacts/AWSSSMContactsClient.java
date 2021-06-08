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
package com.amazonaws.services.ssmcontacts;

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

import com.amazonaws.services.ssmcontacts.AWSSSMContactsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ssmcontacts.model.*;
import com.amazonaws.services.ssmcontacts.model.transform.*;

/**
 * Client for accessing SSM Contacts. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSMContactsClient extends AmazonWebServiceClient implements AWSSSMContacts {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSSMContacts.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ssm-contacts";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataEncryptionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.DataEncryptionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ssmcontacts.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ssmcontacts.model.AWSSSMContactsException.class));

    public static AWSSSMContactsClientBuilder builder() {
        return AWSSSMContactsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on SSM Contacts using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSMContactsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on SSM Contacts using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSSMContactsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ssm-contacts.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ssmcontacts/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ssmcontacts/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Used to acknowledge an engagement to a contact channel during an incident.
     * </p>
     * 
     * @param acceptPageRequest
     * @return Result of the AcceptPage operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.AcceptPage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/AcceptPage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptPageResult acceptPage(AcceptPageRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptPage(request);
    }

    @SdkInternalApi
    final AcceptPageResult executeAcceptPage(AcceptPageRequest acceptPageRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptPageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptPageRequest> request = null;
        Response<AcceptPageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptPageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptPageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptPage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptPageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptPageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates a contact's contact channel. Incident Manager can't engage a contact until the contact channel has been
     * activated.
     * </p>
     * 
     * @param activateContactChannelRequest
     * @return Result of the ActivateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ActivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ActivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ActivateContactChannelResult activateContactChannel(ActivateContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeActivateContactChannel(request);
    }

    @SdkInternalApi
    final ActivateContactChannelResult executeActivateContactChannel(ActivateContactChannelRequest activateContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(activateContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivateContactChannelRequest> request = null;
        Response<ActivateContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivateContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(activateContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ActivateContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ActivateContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ActivateContactChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Contacts are either the contacts that Incident Manager engages during an incident or the escalation plans that
     * Incident Manager uses to engage contacts in phases during an incident.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateContactResult createContact(CreateContactRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContact(request);
    }

    @SdkInternalApi
    final CreateContactResult executeCreateContact(CreateContactRequest createContactRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactRequest> request = null;
        Response<CreateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A contact channel is the method that Incident Manager uses to engage your contact.
     * </p>
     * 
     * @param createContactChannelRequest
     * @return Result of the CreateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.CreateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateContactChannelResult createContactChannel(CreateContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContactChannel(request);
    }

    @SdkInternalApi
    final CreateContactChannelResult executeCreateContactChannel(CreateContactChannelRequest createContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactChannelRequest> request = null;
        Response<CreateContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To no longer receive Incident Manager engagements to a contact channel, you can deactivate the channel.
     * </p>
     * 
     * @param deactivateContactChannelRequest
     * @return Result of the DeactivateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeactivateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeactivateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeactivateContactChannelResult deactivateContactChannel(DeactivateContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeactivateContactChannel(request);
    }

    @SdkInternalApi
    final DeactivateContactChannelResult executeDeactivateContactChannel(DeactivateContactChannelRequest deactivateContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deactivateContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivateContactChannelRequest> request = null;
        Response<DeactivateContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivateContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deactivateContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeactivateContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeactivateContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeactivateContactChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To remove a contact from Incident Manager, you can delete the contact. Deleting a contact removes them from all
     * escalation plans and related response plans. Deleting an escalation plan removes it from all related response
     * plans. You will have to recreate the contact and its contact channels before you can use it again.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteContactResult deleteContact(DeleteContactRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContact(request);
    }

    @SdkInternalApi
    final DeleteContactResult executeDeleteContact(DeleteContactRequest deleteContactRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactRequest> request = null;
        Response<DeleteContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To no longer receive engagements on a contact channel, you can delete the channel from a contact. Deleting the
     * contact channel removes it from the contact's engagement plan. If you delete the only contact channel for a
     * contact, you won't be able to engage that contact during an incident.
     * </p>
     * 
     * @param deleteContactChannelRequest
     * @return Result of the DeleteContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DeleteContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DeleteContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteContactChannelResult deleteContactChannel(DeleteContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContactChannel(request);
    }

    @SdkInternalApi
    final DeleteContactChannelResult executeDeleteContactChannel(DeleteContactChannelRequest deleteContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactChannelRequest> request = null;
        Response<DeleteContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Incident Manager uses engagements to engage contacts and escalation plans during an incident. Use this command to
     * describe the engagement that occurred during an incident.
     * </p>
     * 
     * @param describeEngagementRequest
     * @return Result of the DescribeEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DescribeEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEngagementResult describeEngagement(DescribeEngagementRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngagement(request);
    }

    @SdkInternalApi
    final DescribeEngagementResult executeDescribeEngagement(DescribeEngagementRequest describeEngagementRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngagementRequest> request = null;
        Response<DescribeEngagementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngagementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEngagementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngagement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEngagementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEngagementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists details of the engagement to a contact channel.
     * </p>
     * 
     * @param describePageRequest
     * @return Result of the DescribePage operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.DescribePage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribePage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePageResult describePage(DescribePageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePage(request);
    }

    @SdkInternalApi
    final DescribePageResult executeDescribePage(DescribePageRequest describePageRequest) {

        ExecutionContext executionContext = createExecutionContext(describePageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePageRequest> request = null;
        Response<DescribePageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetContactResult getContact(GetContactRequest request) {
        request = beforeClientExecution(request);
        return executeGetContact(request);
    }

    @SdkInternalApi
    final GetContactResult executeGetContact(GetContactRequest getContactRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactRequest> request = null;
        Response<GetContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List details about a specific contact channel.
     * </p>
     * 
     * @param getContactChannelRequest
     * @return Result of the GetContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.GetContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactChannelResult getContactChannel(GetContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactChannel(request);
    }

    @SdkInternalApi
    final GetContactChannelResult executeGetContactChannel(GetContactChannelRequest getContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactChannelRequest> request = null;
        Response<GetContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the resource policies attached to the specified contact or escalation plan.
     * </p>
     * 
     * @param getContactPolicyRequest
     * @return Result of the GetContactPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.GetContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactPolicyResult getContactPolicy(GetContactPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetContactPolicy(request);
    }

    @SdkInternalApi
    final GetContactPolicyResult executeGetContactPolicy(GetContactPolicyRequest getContactPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactPolicyRequest> request = null;
        Response<GetContactPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContactPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetContactPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all contact channels for the specified contact.
     * </p>
     * 
     * @param listContactChannelsRequest
     * @return Result of the ListContactChannels operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListContactChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContactChannels"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListContactChannelsResult listContactChannels(ListContactChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListContactChannels(request);
    }

    @SdkInternalApi
    final ListContactChannelsResult executeListContactChannels(ListContactChannelsRequest listContactChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactChannelsRequest> request = null;
        Response<ListContactChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContactChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContactChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all contacts and escalation plans in Incident Manager.
     * </p>
     * 
     * @param listContactsRequest
     * @return Result of the ListContacts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListContactsResult listContacts(ListContactsRequest request) {
        request = beforeClientExecution(request);
        return executeListContacts(request);
    }

    @SdkInternalApi
    final ListContactsResult executeListContacts(ListContactsRequest listContactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListContactsRequest> request = null;
        Response<ListContactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListContactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listContactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListContacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListContactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListContactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all engagements that have happened in an incident.
     * </p>
     * 
     * @param listEngagementsRequest
     * @return Result of the ListEngagements operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListEngagements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListEngagements" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEngagementsResult listEngagements(ListEngagementsRequest request) {
        request = beforeClientExecution(request);
        return executeListEngagements(request);
    }

    @SdkInternalApi
    final ListEngagementsResult executeListEngagements(ListEngagementsRequest listEngagementsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEngagementsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEngagementsRequest> request = null;
        Response<ListEngagementsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEngagementsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEngagementsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEngagements");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEngagementsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEngagementsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the engagements to contact channels that have been acknowledged.
     * </p>
     * 
     * @param listPageReceiptsRequest
     * @return Result of the ListPageReceipts operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPageReceipts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPageReceipts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPageReceiptsResult listPageReceipts(ListPageReceiptsRequest request) {
        request = beforeClientExecution(request);
        return executeListPageReceipts(request);
    }

    @SdkInternalApi
    final ListPageReceiptsResult executeListPageReceipts(ListPageReceiptsRequest listPageReceiptsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPageReceiptsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPageReceiptsRequest> request = null;
        Response<ListPageReceiptsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPageReceiptsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPageReceiptsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPageReceipts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPageReceiptsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPageReceiptsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the engagements to a contact's contact channels.
     * </p>
     * 
     * @param listPagesByContactRequest
     * @return Result of the ListPagesByContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPagesByContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByContact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPagesByContactResult listPagesByContact(ListPagesByContactRequest request) {
        request = beforeClientExecution(request);
        return executeListPagesByContact(request);
    }

    @SdkInternalApi
    final ListPagesByContactResult executeListPagesByContact(ListPagesByContactRequest listPagesByContactRequest) {

        ExecutionContext executionContext = createExecutionContext(listPagesByContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPagesByContactRequest> request = null;
        Response<ListPagesByContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPagesByContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPagesByContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPagesByContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPagesByContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPagesByContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the engagements to contact channels that occurred by engaging a contact.
     * </p>
     * 
     * @param listPagesByEngagementRequest
     * @return Result of the ListPagesByEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.ListPagesByEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListPagesByEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPagesByEngagementResult listPagesByEngagement(ListPagesByEngagementRequest request) {
        request = beforeClientExecution(request);
        return executeListPagesByEngagement(request);
    }

    @SdkInternalApi
    final ListPagesByEngagementResult executeListPagesByEngagement(ListPagesByEngagementRequest listPagesByEngagementRequest) {

        ExecutionContext executionContext = createExecutionContext(listPagesByEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPagesByEngagementRequest> request = null;
        Response<ListPagesByEngagementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPagesByEngagementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPagesByEngagementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPagesByEngagement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPagesByEngagementResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListPagesByEngagementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags of an escalation plan or contact.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
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
     * Adds a resource to the specified contact or escalation plan.
     * </p>
     * 
     * @param putContactPolicyRequest
     * @return Result of the PutContactPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.PutContactPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PutContactPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutContactPolicyResult putContactPolicy(PutContactPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutContactPolicy(request);
    }

    @SdkInternalApi
    final PutContactPolicyResult executePutContactPolicy(PutContactPolicyRequest putContactPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putContactPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutContactPolicyRequest> request = null;
        Response<PutContactPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutContactPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putContactPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutContactPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutContactPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutContactPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an activation code to a contact channel. The contact can use this code to activate the contact channel in
     * the console or with the <code>ActivateChannel</code> action. Incident Manager can't engage a contact channel
     * until it has been activated.
     * </p>
     * 
     * @param sendActivationCodeRequest
     * @return Result of the SendActivationCode operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.SendActivationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/SendActivationCode"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendActivationCodeResult sendActivationCode(SendActivationCodeRequest request) {
        request = beforeClientExecution(request);
        return executeSendActivationCode(request);
    }

    @SdkInternalApi
    final SendActivationCodeResult executeSendActivationCode(SendActivationCodeRequest sendActivationCodeRequest) {

        ExecutionContext executionContext = createExecutionContext(sendActivationCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendActivationCodeRequest> request = null;
        Response<SendActivationCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendActivationCodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendActivationCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendActivationCode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendActivationCodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendActivationCodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an engagement to a contact or escalation plan. The engagement engages each contact specified in the
     * incident.
     * </p>
     * 
     * @param startEngagementRequest
     * @return Result of the StartEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.StartEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartEngagementResult startEngagement(StartEngagementRequest request) {
        request = beforeClientExecution(request);
        return executeStartEngagement(request);
    }

    @SdkInternalApi
    final StartEngagementResult executeStartEngagement(StartEngagementRequest startEngagementRequest) {

        ExecutionContext executionContext = createExecutionContext(startEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartEngagementRequest> request = null;
        Response<StartEngagementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartEngagementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startEngagementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartEngagement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartEngagementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartEngagementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an engagement before it finishes the final stage of the escalation plan or engagement plan. Further
     * contacts aren't engaged.
     * </p>
     * 
     * @param stopEngagementRequest
     * @return Result of the StopEngagement operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.StopEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StopEngagement" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopEngagementResult stopEngagement(StopEngagementRequest request) {
        request = beforeClientExecution(request);
        return executeStopEngagement(request);
    }

    @SdkInternalApi
    final StopEngagementResult executeStopEngagement(StopEngagementRequest stopEngagementRequest) {

        ExecutionContext executionContext = createExecutionContext(stopEngagementRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopEngagementRequest> request = null;
        Response<StopEngagementResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopEngagementRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopEngagementRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopEngagement");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopEngagementResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopEngagementResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a contact or escalation plan. You can tag only contacts and escalation plans in the first region of your
     * replication set.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
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
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @sample AWSSSMContacts.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
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
     * Updates the contact or escalation plan specified.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ServiceQuotaExceededException
     *         Request would cause a service quota to be exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @sample AWSSSMContacts.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContact" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateContactResult updateContact(UpdateContactRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContact(request);
    }

    @SdkInternalApi
    final UpdateContactResult executeUpdateContact(UpdateContactRequest updateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactRequest> request = null;
        Response<UpdateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a contact's contact channel.
     * </p>
     * 
     * @param updateContactChannelRequest
     * @return Result of the UpdateContactChannel operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ConflictException
     *         Updating or deleting a resource causes an inconsistent state.
     * @throws DataEncryptionException
     *         The action failed to due an encryption key error.
     * @throws InternalServerException
     *         Unexpected error occurred while processing the request.
     * @throws ResourceNotFoundException
     *         Request references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AWSSSMContacts.UpdateContactChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/UpdateContactChannel"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateContactChannelResult updateContactChannel(UpdateContactChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContactChannel(request);
    }

    @SdkInternalApi
    final UpdateContactChannelResult executeUpdateContactChannel(UpdateContactChannelRequest updateContactChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactChannelRequest> request = null;
        Response<UpdateContactChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM Contacts");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContactChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContactChannelResultJsonUnmarshaller());
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
