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
package com.amazonaws.services.mturk;

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

import com.amazonaws.services.mturk.AmazonMTurkClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.services.mturk.model.transform.*;

/**
 * Client for accessing Amazon MTurk. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Amazon Mechanical Turk API Reference</fullname>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMTurkClient extends AmazonWebServiceClient implements AmazonMTurk {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMTurk.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mturk-requester";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceFault").withModeledClass(
                                    com.amazonaws.services.mturk.model.ServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestError").withModeledClass(
                                    com.amazonaws.services.mturk.model.RequestErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mturk.model.AmazonMTurkException.class));

    public static AmazonMTurkClientBuilder builder() {
        return AmazonMTurkClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon MTurk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMTurkClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon MTurk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMTurkClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mturk-requester.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mturk/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mturk/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * The <code>AcceptQualificationRequest</code> operation approves a Worker's request for a Qualification.
     * </p>
     * <p>
     * Only the owner of the Qualification type can grant a Qualification request for that type.
     * </p>
     * <p>
     * A successful request for the <code>AcceptQualificationRequest</code> operation returns with no errors and an
     * empty body.
     * </p>
     * 
     * @param acceptQualificationRequestRequest
     * @return Result of the AcceptQualificationRequest operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.AcceptQualificationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AcceptQualificationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptQualificationRequestResult acceptQualificationRequest(AcceptQualificationRequestRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptQualificationRequest(request);
    }

    @SdkInternalApi
    final AcceptQualificationRequestResult executeAcceptQualificationRequest(AcceptQualificationRequestRequest acceptQualificationRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptQualificationRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptQualificationRequestRequest> request = null;
        Response<AcceptQualificationRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptQualificationRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptQualificationRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptQualificationRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptQualificationRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AcceptQualificationRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ApproveAssignment</code> operation approves the results of a completed assignment.
     * </p>
     * <p>
     * Approving an assignment initiates two payments from the Requester's Amazon.com account
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Worker who submitted the results is paid the reward specified in the HIT.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Mechanical Turk fees are debited.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the Requester's account does not have adequate funds for these payments, the call to ApproveAssignment returns
     * an exception, and the approval is not processed. You can include an optional feedback message with the approval,
     * which the Worker can see in the Status section of the web site.
     * </p>
     * <p>
     * You can also call this operation for assignments that were previous rejected and approve them by explicitly
     * overriding the previous rejection. This only works on rejected assignments that were submitted within the
     * previous 30 days and only if the assignment's related HIT has not been deleted.
     * </p>
     * 
     * @param approveAssignmentRequest
     * @return Result of the ApproveAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ApproveAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ApproveAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ApproveAssignmentResult approveAssignment(ApproveAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeApproveAssignment(request);
    }

    @SdkInternalApi
    final ApproveAssignmentResult executeApproveAssignment(ApproveAssignmentRequest approveAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(approveAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApproveAssignmentRequest> request = null;
        Response<ApproveAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApproveAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(approveAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApproveAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ApproveAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ApproveAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>AssociateQualificationWithWorker</code> operation gives a Worker a Qualification.
     * <code>AssociateQualificationWithWorker</code> does not require that the Worker submit a Qualification request. It
     * gives the Qualification directly to the Worker.
     * </p>
     * <p>
     * You can only assign a Qualification of a Qualification type that you created (using the
     * <code>CreateQualificationType</code> operation).
     * </p>
     * <note>
     * <p>
     * Note: <code>AssociateQualificationWithWorker</code> does not affect any pending Qualification requests for the
     * Qualification by the Worker. If you assign a Qualification to a Worker, then later grant a Qualification request
     * made by the Worker, the granting of the request may modify the Qualification score. To resolve a pending
     * Qualification request without affecting the Qualification the Worker already has, reject the request with the
     * <code>RejectQualificationRequest</code> operation.
     * </p>
     * </note>
     * 
     * @param associateQualificationWithWorkerRequest
     * @return Result of the AssociateQualificationWithWorker operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.AssociateQualificationWithWorker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AssociateQualificationWithWorker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateQualificationWithWorkerResult associateQualificationWithWorker(AssociateQualificationWithWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateQualificationWithWorker(request);
    }

    @SdkInternalApi
    final AssociateQualificationWithWorkerResult executeAssociateQualificationWithWorker(
            AssociateQualificationWithWorkerRequest associateQualificationWithWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(associateQualificationWithWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateQualificationWithWorkerRequest> request = null;
        Response<AssociateQualificationWithWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateQualificationWithWorkerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateQualificationWithWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateQualificationWithWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateQualificationWithWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateQualificationWithWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateAdditionalAssignmentsForHIT</code> operation increases the maximum number of assignments of an
     * existing HIT.
     * </p>
     * <p>
     * To extend the maximum number of assignments, specify the number of additional assignments.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * HITs created with fewer than 10 assignments cannot be extended to have 10 or more assignments. Attempting to add
     * assignments in a way that brings the total number of assignments for a HIT from fewer than 10 assignments to 10
     * or more assignments will result in an <code>AWS.MechanicalTurk.InvalidMaximumAssignmentsIncrease</code>
     * exception.
     * </p>
     * </li>
     * <li>
     * <p>
     * HITs that were created before July 22, 2015 cannot be extended. Attempting to extend HITs that were created
     * before July 22, 2015 will result in an <code>AWS.MechanicalTurk.HITTooOldForExtension</code> exception.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createAdditionalAssignmentsForHITRequest
     * @return Result of the CreateAdditionalAssignmentsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateAdditionalAssignmentsForHIT
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateAdditionalAssignmentsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAdditionalAssignmentsForHITResult createAdditionalAssignmentsForHIT(CreateAdditionalAssignmentsForHITRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAdditionalAssignmentsForHIT(request);
    }

    @SdkInternalApi
    final CreateAdditionalAssignmentsForHITResult executeCreateAdditionalAssignmentsForHIT(
            CreateAdditionalAssignmentsForHITRequest createAdditionalAssignmentsForHITRequest) {

        ExecutionContext executionContext = createExecutionContext(createAdditionalAssignmentsForHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAdditionalAssignmentsForHITRequest> request = null;
        Response<CreateAdditionalAssignmentsForHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAdditionalAssignmentsForHITRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAdditionalAssignmentsForHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAdditionalAssignmentsForHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAdditionalAssignmentsForHITResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAdditionalAssignmentsForHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateHIT</code> operation creates a new Human Intelligence Task (HIT). The new HIT is made available
     * for Workers to find and accept on the Amazon Mechanical Turk website.
     * </p>
     * <p>
     * This operation allows you to specify a new HIT by passing in values for the properties of the HIT, such as its
     * title, reward amount and number of assignments. When you pass these values to <code>CreateHIT</code>, a new HIT
     * is created for you, with a new <code>HITTypeID</code>. The HITTypeID can be used to create additional HITs in the
     * future without needing to specify common parameters such as the title, description and reward amount each time.
     * </p>
     * <p>
     * An alternative way to create HITs is to first generate a HITTypeID using the <code>CreateHITType</code> operation
     * and then call the <code>CreateHITWithHITType</code> operation. This is the recommended best practice for
     * Requesters who are creating large numbers of HITs.
     * </p>
     * <p>
     * CreateHIT also supports several ways to provide question data: by providing a value for the <code>Question</code>
     * parameter that fully specifies the contents of the HIT, or by providing a <code>HitLayoutId</code> and associated
     * <code>HitLayoutParameters</code>.
     * </p>
     * <note>
     * <p>
     * If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see <a
     * href="https://requester.mturk.com/pricing">Amazon Mechanical Turk Pricing</a>.
     * </p>
     * </note>
     * 
     * @param createHITRequest
     * @return Result of the CreateHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHIT" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateHITResult createHIT(CreateHITRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHIT(request);
    }

    @SdkInternalApi
    final CreateHITResult executeCreateHIT(CreateHITRequest createHITRequest) {

        ExecutionContext executionContext = createExecutionContext(createHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHITRequest> request = null;
        Response<CreateHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHITResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateHITType</code> operation creates a new HIT type. This operation allows you to define a standard
     * set of HIT properties to use when creating HITs. If you register a HIT type with values that match an existing
     * HIT type, the HIT type ID of the existing type will be returned.
     * </p>
     * 
     * @param createHITTypeRequest
     * @return Result of the CreateHITType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHITType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITType" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateHITTypeResult createHITType(CreateHITTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHITType(request);
    }

    @SdkInternalApi
    final CreateHITTypeResult executeCreateHITType(CreateHITTypeRequest createHITTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createHITTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHITTypeRequest> request = null;
        Response<CreateHITTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHITTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHITTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHITType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHITTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHITTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateHITWithHITType</code> operation creates a new Human Intelligence Task (HIT) using an existing
     * HITTypeID generated by the <code>CreateHITType</code> operation.
     * </p>
     * <p>
     * This is an alternative way to create HITs from the <code>CreateHIT</code> operation. This is the recommended best
     * practice for Requesters who are creating large numbers of HITs.
     * </p>
     * <p>
     * CreateHITWithHITType also supports several ways to provide question data: by providing a value for the
     * <code>Question</code> parameter that fully specifies the contents of the HIT, or by providing a
     * <code>HitLayoutId</code> and associated <code>HitLayoutParameters</code>.
     * </p>
     * <note>
     * <p>
     * If a HIT is created with 10 or more maximum assignments, there is an additional fee. For more information, see <a
     * href="https://requester.mturk.com/pricing">Amazon Mechanical Turk Pricing</a>.
     * </p>
     * </note>
     * 
     * @param createHITWithHITTypeRequest
     * @return Result of the CreateHITWithHITType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateHITWithHITType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITWithHITType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateHITWithHITTypeResult createHITWithHITType(CreateHITWithHITTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHITWithHITType(request);
    }

    @SdkInternalApi
    final CreateHITWithHITTypeResult executeCreateHITWithHITType(CreateHITWithHITTypeRequest createHITWithHITTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createHITWithHITTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHITWithHITTypeRequest> request = null;
        Response<CreateHITWithHITTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHITWithHITTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHITWithHITTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHITWithHITType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHITWithHITTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHITWithHITTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateQualificationType</code> operation creates a new Qualification type, which is represented by a
     * <code>QualificationType</code> data structure.
     * </p>
     * 
     * @param createQualificationTypeRequest
     * @return Result of the CreateQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateQualificationTypeResult createQualificationType(CreateQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateQualificationType(request);
    }

    @SdkInternalApi
    final CreateQualificationTypeResult executeCreateQualificationType(CreateQualificationTypeRequest createQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(createQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateQualificationTypeRequest> request = null;
        Response<CreateQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateQualificationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>CreateWorkerBlock</code> operation allows you to prevent a Worker from working on your HITs. For
     * example, you can block a Worker who is producing poor quality work. You can block up to 100,000 Workers.
     * </p>
     * 
     * @param createWorkerBlockRequest
     * @return Result of the CreateWorkerBlock operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.CreateWorkerBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateWorkerBlock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWorkerBlockResult createWorkerBlock(CreateWorkerBlockRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWorkerBlock(request);
    }

    @SdkInternalApi
    final CreateWorkerBlockResult executeCreateWorkerBlock(CreateWorkerBlockRequest createWorkerBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(createWorkerBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkerBlockRequest> request = null;
        Response<CreateWorkerBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkerBlockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWorkerBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWorkerBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWorkerBlockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWorkerBlockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteHIT</code> operation is used to delete HIT that is no longer needed. Only the Requester who
     * created the HIT can delete it.
     * </p>
     * <p>
     * You can only dispose of HITs that are in the <code>Reviewable</code> state, with all of their submitted
     * assignments already either approved or rejected. If you call the DeleteHIT operation on a HIT that is not in the
     * <code>Reviewable</code> state (for example, that has not expired, or still has active assignments), or on a HIT
     * that is Reviewable but without all of its submitted assignments already approved or rejected, the service will
     * return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * HITs are automatically disposed of after 120 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you dispose of a HIT, you can no longer approve the HIT's rejected assignments.
     * </p>
     * </li>
     * <li>
     * <p>
     * Disposed HITs are not returned in results for the ListHITs operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Disposing HITs can improve the performance of operations such as ListReviewableHITs and ListHITs.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteHITRequest
     * @return Result of the DeleteHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteHIT" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteHITResult deleteHIT(DeleteHITRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHIT(request);
    }

    @SdkInternalApi
    final DeleteHITResult executeDeleteHIT(DeleteHITRequest deleteHITRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHITRequest> request = null;
        Response<DeleteHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHITResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteQualificationType</code> deletes a Qualification type and deletes any HIT types that are
     * associated with the Qualification type.
     * </p>
     * <p>
     * This operation does not revoke Qualifications already assigned to Workers because the Qualifications might be
     * needed for active HITs. If there are any pending requests for the Qualification type, Amazon Mechanical Turk
     * rejects those requests. After you delete a Qualification type, you can no longer use it to create HITs or HIT
     * types.
     * </p>
     * <note>
     * <p>
     * DeleteQualificationType must wait for all the HITs that use the deleted Qualification type to be deleted before
     * completing. It may take up to 48 hours before DeleteQualificationType completes and the unique name of the
     * Qualification type is available for reuse with CreateQualificationType.
     * </p>
     * </note>
     * 
     * @param deleteQualificationTypeRequest
     * @return Result of the DeleteQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteQualificationTypeResult deleteQualificationType(DeleteQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteQualificationType(request);
    }

    @SdkInternalApi
    final DeleteQualificationTypeResult executeDeleteQualificationType(DeleteQualificationTypeRequest deleteQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteQualificationTypeRequest> request = null;
        Response<DeleteQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteQualificationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DeleteWorkerBlock</code> operation allows you to reinstate a blocked Worker to work on your HITs. This
     * operation reverses the effects of the CreateWorkerBlock operation. You need the Worker ID to use this operation.
     * If the Worker ID is missing or invalid, this operation fails and returns the message “WorkerId is invalid.” If
     * the specified Worker is not blocked, this operation returns successfully.
     * </p>
     * 
     * @param deleteWorkerBlockRequest
     * @return Result of the DeleteWorkerBlock operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DeleteWorkerBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DeleteWorkerBlock"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWorkerBlockResult deleteWorkerBlock(DeleteWorkerBlockRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWorkerBlock(request);
    }

    @SdkInternalApi
    final DeleteWorkerBlockResult executeDeleteWorkerBlock(DeleteWorkerBlockRequest deleteWorkerBlockRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWorkerBlockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWorkerBlockRequest> request = null;
        Response<DeleteWorkerBlockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWorkerBlockRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWorkerBlockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWorkerBlock");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWorkerBlockResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWorkerBlockResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>DisassociateQualificationFromWorker</code> revokes a previously granted Qualification from a user.
     * </p>
     * <p>
     * You can provide a text message explaining why the Qualification was revoked. The user who had the Qualification
     * can see this message.
     * </p>
     * 
     * @param disassociateQualificationFromWorkerRequest
     * @return Result of the DisassociateQualificationFromWorker operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.DisassociateQualificationFromWorker
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/DisassociateQualificationFromWorker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateQualificationFromWorkerResult disassociateQualificationFromWorker(DisassociateQualificationFromWorkerRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateQualificationFromWorker(request);
    }

    @SdkInternalApi
    final DisassociateQualificationFromWorkerResult executeDisassociateQualificationFromWorker(
            DisassociateQualificationFromWorkerRequest disassociateQualificationFromWorkerRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateQualificationFromWorkerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateQualificationFromWorkerRequest> request = null;
        Response<DisassociateQualificationFromWorkerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateQualificationFromWorkerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateQualificationFromWorkerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateQualificationFromWorker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateQualificationFromWorkerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateQualificationFromWorkerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetAccountBalance</code> operation retrieves the amount of money in your Amazon Mechanical Turk
     * account.
     * </p>
     * 
     * @param getAccountBalanceRequest
     * @return Result of the GetAccountBalance operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetAccountBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAccountBalance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccountBalanceResult getAccountBalance(GetAccountBalanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountBalance(request);
    }

    @SdkInternalApi
    final GetAccountBalanceResult executeGetAccountBalance(GetAccountBalanceRequest getAccountBalanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountBalanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountBalanceRequest> request = null;
        Response<GetAccountBalanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountBalanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountBalanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountBalance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountBalanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountBalanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetAssignment</code> operation retrieves the details of the specified Assignment.
     * </p>
     * 
     * @param getAssignmentRequest
     * @return Result of the GetAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetAssignment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAssignmentResult getAssignment(GetAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssignment(request);
    }

    @SdkInternalApi
    final GetAssignmentResult executeGetAssignment(GetAssignmentRequest getAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssignmentRequest> request = null;
        Response<GetAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetFileUploadURL</code> operation generates and returns a temporary URL. You use the temporary URL to
     * retrieve a file uploaded by a Worker as an answer to a FileUploadAnswer question for a HIT. The temporary URL is
     * generated the instant the GetFileUploadURL operation is called, and is valid for 60 seconds. You can get a
     * temporary file upload URL any time until the HIT is disposed. After the HIT is disposed, any uploaded files are
     * deleted, and cannot be retrieved. Pending Deprecation on December 12, 2017. The Answer Specification structure
     * will no longer support the <code>FileUploadAnswer</code> element to be used for the QuestionForm data structure.
     * Instead, we recommend that Requesters who want to create HITs asking Workers to upload files to use Amazon S3.
     * </p>
     * 
     * @param getFileUploadURLRequest
     * @return Result of the GetFileUploadURL operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetFileUploadURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetFileUploadURL"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFileUploadURLResult getFileUploadURL(GetFileUploadURLRequest request) {
        request = beforeClientExecution(request);
        return executeGetFileUploadURL(request);
    }

    @SdkInternalApi
    final GetFileUploadURLResult executeGetFileUploadURL(GetFileUploadURLRequest getFileUploadURLRequest) {

        ExecutionContext executionContext = createExecutionContext(getFileUploadURLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFileUploadURLRequest> request = null;
        Response<GetFileUploadURLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFileUploadURLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFileUploadURLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFileUploadURL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFileUploadURLResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFileUploadURLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetHIT</code> operation retrieves the details of the specified HIT.
     * </p>
     * 
     * @param getHITRequest
     * @return Result of the GetHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetHIT" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetHITResult getHIT(GetHITRequest request) {
        request = beforeClientExecution(request);
        return executeGetHIT(request);
    }

    @SdkInternalApi
    final GetHITResult executeGetHIT(GetHITRequest getHITRequest) {

        ExecutionContext executionContext = createExecutionContext(getHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHITRequest> request = null;
        Response<GetHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetHITResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetQualificationScore</code> operation returns the value of a Worker's Qualification for a given
     * Qualification type.
     * </p>
     * <p>
     * To get a Worker's Qualification, you must know the Worker's ID. The Worker's ID is included in the assignment
     * data returned by the <code>ListAssignmentsForHIT</code> operation.
     * </p>
     * <p>
     * Only the owner of a Qualification type can query the value of a Worker's Qualification of that type.
     * </p>
     * 
     * @param getQualificationScoreRequest
     * @return Result of the GetQualificationScore operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetQualificationScore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationScore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetQualificationScoreResult getQualificationScore(GetQualificationScoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetQualificationScore(request);
    }

    @SdkInternalApi
    final GetQualificationScoreResult executeGetQualificationScore(GetQualificationScoreRequest getQualificationScoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getQualificationScoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQualificationScoreRequest> request = null;
        Response<GetQualificationScoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQualificationScoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQualificationScoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQualificationScore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQualificationScoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetQualificationScoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>GetQualificationType</code>operation retrieves information about a Qualification type using its ID.
     * </p>
     * 
     * @param getQualificationTypeRequest
     * @return Result of the GetQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.GetQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetQualificationTypeResult getQualificationType(GetQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeGetQualificationType(request);
    }

    @SdkInternalApi
    final GetQualificationTypeResult executeGetQualificationType(GetQualificationTypeRequest getQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(getQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQualificationTypeRequest> request = null;
        Response<GetQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQualificationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListAssignmentsForHIT</code> operation retrieves completed assignments for a HIT. You can use this
     * operation to retrieve the results for a HIT.
     * </p>
     * <p>
     * You can get assignments for a HIT at any time, even if the HIT is not yet Reviewable. If a HIT requested multiple
     * assignments, and has received some results but has not yet become Reviewable, you can still retrieve the partial
     * results with this operation.
     * </p>
     * <p>
     * Use the AssignmentStatus parameter to control which set of assignments for a HIT are returned. The
     * ListAssignmentsForHIT operation can return submitted assignments awaiting approval, or it can return assignments
     * that have already been approved or rejected. You can set AssignmentStatus=Approved,Rejected to get assignments
     * that have already been approved and rejected together in one result set.
     * </p>
     * <p>
     * Only the Requester who created the HIT can retrieve the assignments for that HIT.
     * </p>
     * <p>
     * Results are sorted and divided into numbered pages and the operation returns a single page of results. You can
     * use the parameters of the operation to control sorting and pagination.
     * </p>
     * 
     * @param listAssignmentsForHITRequest
     * @return Result of the ListAssignmentsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListAssignmentsForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListAssignmentsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssignmentsForHITResult listAssignmentsForHIT(ListAssignmentsForHITRequest request) {
        request = beforeClientExecution(request);
        return executeListAssignmentsForHIT(request);
    }

    @SdkInternalApi
    final ListAssignmentsForHITResult executeListAssignmentsForHIT(ListAssignmentsForHITRequest listAssignmentsForHITRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssignmentsForHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssignmentsForHITRequest> request = null;
        Response<ListAssignmentsForHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssignmentsForHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssignmentsForHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssignmentsForHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssignmentsForHITResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssignmentsForHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListBonusPayments</code> operation retrieves the amounts of bonuses you have paid to Workers for a
     * given HIT or assignment.
     * </p>
     * 
     * @param listBonusPaymentsRequest
     * @return Result of the ListBonusPayments operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListBonusPayments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListBonusPayments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBonusPaymentsResult listBonusPayments(ListBonusPaymentsRequest request) {
        request = beforeClientExecution(request);
        return executeListBonusPayments(request);
    }

    @SdkInternalApi
    final ListBonusPaymentsResult executeListBonusPayments(ListBonusPaymentsRequest listBonusPaymentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBonusPaymentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBonusPaymentsRequest> request = null;
        Response<ListBonusPaymentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBonusPaymentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBonusPaymentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBonusPayments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBonusPaymentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBonusPaymentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListHITs</code> operation returns all of a Requester's HITs. The operation returns HITs of any status,
     * except for HITs that have been deleted of with the DeleteHIT operation or that have been auto-deleted.
     * </p>
     * 
     * @param listHITsRequest
     * @return Result of the ListHITs operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListHITs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListHITs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListHITsResult listHITs(ListHITsRequest request) {
        request = beforeClientExecution(request);
        return executeListHITs(request);
    }

    @SdkInternalApi
    final ListHITsResult executeListHITs(ListHITsRequest listHITsRequest) {

        ExecutionContext executionContext = createExecutionContext(listHITsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHITsRequest> request = null;
        Response<ListHITsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHITsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listHITsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHITs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHITsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListHITsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListHITsForQualificationType</code> operation returns the HITs that use the given Qualification type
     * for a Qualification requirement. The operation returns HITs of any status, except for HITs that have been deleted
     * with the <code>DeleteHIT</code> operation or that have been auto-deleted.
     * </p>
     * 
     * @param listHITsForQualificationTypeRequest
     * @return Result of the ListHITsForQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListHITsForQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListHITsForQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListHITsForQualificationTypeResult listHITsForQualificationType(ListHITsForQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeListHITsForQualificationType(request);
    }

    @SdkInternalApi
    final ListHITsForQualificationTypeResult executeListHITsForQualificationType(ListHITsForQualificationTypeRequest listHITsForQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(listHITsForQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHITsForQualificationTypeRequest> request = null;
        Response<ListHITsForQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHITsForQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listHITsForQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListHITsForQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListHITsForQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListHITsForQualificationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListQualificationRequests</code> operation retrieves requests for Qualifications of a particular
     * Qualification type. The owner of the Qualification type calls this operation to poll for pending requests, and
     * accepts them using the AcceptQualification operation.
     * </p>
     * 
     * @param listQualificationRequestsRequest
     * @return Result of the ListQualificationRequests operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListQualificationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListQualificationRequestsResult listQualificationRequests(ListQualificationRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeListQualificationRequests(request);
    }

    @SdkInternalApi
    final ListQualificationRequestsResult executeListQualificationRequests(ListQualificationRequestsRequest listQualificationRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listQualificationRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQualificationRequestsRequest> request = null;
        Response<ListQualificationRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQualificationRequestsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listQualificationRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQualificationRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQualificationRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListQualificationRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListQualificationTypes</code> operation returns a list of Qualification types, filtered by an optional
     * search term.
     * </p>
     * 
     * @param listQualificationTypesRequest
     * @return Result of the ListQualificationTypes operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListQualificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListQualificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListQualificationTypesResult listQualificationTypes(ListQualificationTypesRequest request) {
        request = beforeClientExecution(request);
        return executeListQualificationTypes(request);
    }

    @SdkInternalApi
    final ListQualificationTypesResult executeListQualificationTypes(ListQualificationTypesRequest listQualificationTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQualificationTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQualificationTypesRequest> request = null;
        Response<ListQualificationTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQualificationTypesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQualificationTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQualificationTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQualificationTypesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListQualificationTypesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListReviewPolicyResultsForHIT</code> operation retrieves the computed results and the actions taken in
     * the course of executing your Review Policies for a given HIT. For information about how to specify Review
     * Policies when you call CreateHIT, see Review Policies. The ListReviewPolicyResultsForHIT operation can return
     * results for both Assignment-level and HIT-level review results.
     * </p>
     * 
     * @param listReviewPolicyResultsForHITRequest
     * @return Result of the ListReviewPolicyResultsForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListReviewPolicyResultsForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewPolicyResultsForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReviewPolicyResultsForHITResult listReviewPolicyResultsForHIT(ListReviewPolicyResultsForHITRequest request) {
        request = beforeClientExecution(request);
        return executeListReviewPolicyResultsForHIT(request);
    }

    @SdkInternalApi
    final ListReviewPolicyResultsForHITResult executeListReviewPolicyResultsForHIT(ListReviewPolicyResultsForHITRequest listReviewPolicyResultsForHITRequest) {

        ExecutionContext executionContext = createExecutionContext(listReviewPolicyResultsForHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReviewPolicyResultsForHITRequest> request = null;
        Response<ListReviewPolicyResultsForHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReviewPolicyResultsForHITRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listReviewPolicyResultsForHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReviewPolicyResultsForHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReviewPolicyResultsForHITResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListReviewPolicyResultsForHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListReviewableHITs</code> operation retrieves the HITs with Status equal to Reviewable or Status equal
     * to Reviewing that belong to the Requester calling the operation.
     * </p>
     * 
     * @param listReviewableHITsRequest
     * @return Result of the ListReviewableHITs operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListReviewableHITs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewableHITs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListReviewableHITsResult listReviewableHITs(ListReviewableHITsRequest request) {
        request = beforeClientExecution(request);
        return executeListReviewableHITs(request);
    }

    @SdkInternalApi
    final ListReviewableHITsResult executeListReviewableHITs(ListReviewableHITsRequest listReviewableHITsRequest) {

        ExecutionContext executionContext = createExecutionContext(listReviewableHITsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReviewableHITsRequest> request = null;
        Response<ListReviewableHITsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReviewableHITsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listReviewableHITsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListReviewableHITs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListReviewableHITsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListReviewableHITsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListWorkersBlocks</code> operation retrieves a list of Workers who are blocked from working on your
     * HITs.
     * </p>
     * 
     * @param listWorkerBlocksRequest
     * @return Result of the ListWorkerBlocks operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListWorkerBlocks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkerBlocks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkerBlocksResult listWorkerBlocks(ListWorkerBlocksRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkerBlocks(request);
    }

    @SdkInternalApi
    final ListWorkerBlocksResult executeListWorkerBlocks(ListWorkerBlocksRequest listWorkerBlocksRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkerBlocksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkerBlocksRequest> request = null;
        Response<ListWorkerBlocksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkerBlocksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWorkerBlocksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkerBlocks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkerBlocksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWorkerBlocksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>ListWorkersWithQualificationType</code> operation returns all of the Workers that have been associated
     * with a given Qualification type.
     * </p>
     * 
     * @param listWorkersWithQualificationTypeRequest
     * @return Result of the ListWorkersWithQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.ListWorkersWithQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListWorkersWithQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWorkersWithQualificationTypeResult listWorkersWithQualificationType(ListWorkersWithQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeListWorkersWithQualificationType(request);
    }

    @SdkInternalApi
    final ListWorkersWithQualificationTypeResult executeListWorkersWithQualificationType(
            ListWorkersWithQualificationTypeRequest listWorkersWithQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(listWorkersWithQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWorkersWithQualificationTypeRequest> request = null;
        Response<ListWorkersWithQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWorkersWithQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWorkersWithQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWorkersWithQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWorkersWithQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWorkersWithQualificationTypeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>NotifyWorkers</code> operation sends an email to one or more Workers that you specify with the Worker
     * ID. You can specify up to 100 Worker IDs to send the same message with a single call to the NotifyWorkers
     * operation. The NotifyWorkers operation will send a notification email to a Worker only if you have previously
     * approved or rejected work from the Worker.
     * </p>
     * 
     * @param notifyWorkersRequest
     * @return Result of the NotifyWorkers operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.NotifyWorkers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotifyWorkers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public NotifyWorkersResult notifyWorkers(NotifyWorkersRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyWorkers(request);
    }

    @SdkInternalApi
    final NotifyWorkersResult executeNotifyWorkers(NotifyWorkersRequest notifyWorkersRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyWorkersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyWorkersRequest> request = null;
        Response<NotifyWorkersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyWorkersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(notifyWorkersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyWorkers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyWorkersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new NotifyWorkersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>RejectAssignment</code> operation rejects the results of a completed assignment.
     * </p>
     * <p>
     * You can include an optional feedback message with the rejection, which the Worker can see in the Status section
     * of the web site. When you include a feedback message with the rejection, it helps the Worker understand why the
     * assignment was rejected, and can improve the quality of the results the Worker submits in the future.
     * </p>
     * <p>
     * Only the Requester who created the HIT can reject an assignment for the HIT.
     * </p>
     * 
     * @param rejectAssignmentRequest
     * @return Result of the RejectAssignment operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.RejectAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectAssignmentResult rejectAssignment(RejectAssignmentRequest request) {
        request = beforeClientExecution(request);
        return executeRejectAssignment(request);
    }

    @SdkInternalApi
    final RejectAssignmentResult executeRejectAssignment(RejectAssignmentRequest rejectAssignmentRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectAssignmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectAssignmentRequest> request = null;
        Response<RejectAssignmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectAssignmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectAssignmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectAssignment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectAssignmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectAssignmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>RejectQualificationRequest</code> operation rejects a user's request for a Qualification.
     * </p>
     * <p>
     * You can provide a text message explaining why the request was rejected. The Worker who made the request can see
     * this message.
     * </p>
     * 
     * @param rejectQualificationRequestRequest
     * @return Result of the RejectQualificationRequest operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.RejectQualificationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/RejectQualificationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectQualificationRequestResult rejectQualificationRequest(RejectQualificationRequestRequest request) {
        request = beforeClientExecution(request);
        return executeRejectQualificationRequest(request);
    }

    @SdkInternalApi
    final RejectQualificationRequestResult executeRejectQualificationRequest(RejectQualificationRequestRequest rejectQualificationRequestRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectQualificationRequestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectQualificationRequestRequest> request = null;
        Response<RejectQualificationRequestResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectQualificationRequestRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(rejectQualificationRequestRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectQualificationRequest");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectQualificationRequestResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RejectQualificationRequestResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>SendBonus</code> operation issues a payment of money from your account to a Worker. This payment
     * happens separately from the reward you pay to the Worker when you approve the Worker's assignment. The SendBonus
     * operation requires the Worker's ID and the assignment ID as parameters to initiate payment of the bonus. You must
     * include a message that explains the reason for the bonus payment, as the Worker may not be expecting the payment.
     * Amazon Mechanical Turk collects a fee for bonus payments, similar to the HIT listing fee. This operation fails if
     * your account does not have enough funds to pay for both the bonus and the fees.
     * </p>
     * 
     * @param sendBonusRequest
     * @return Result of the SendBonus operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.SendBonus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendBonus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendBonusResult sendBonus(SendBonusRequest request) {
        request = beforeClientExecution(request);
        return executeSendBonus(request);
    }

    @SdkInternalApi
    final SendBonusResult executeSendBonus(SendBonusRequest sendBonusRequest) {

        ExecutionContext executionContext = createExecutionContext(sendBonusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendBonusRequest> request = null;
        Response<SendBonusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendBonusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendBonusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendBonus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendBonusResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendBonusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>SendTestEventNotification</code> operation causes Amazon Mechanical Turk to send a notification message
     * as if a HIT event occurred, according to the provided notification specification. This allows you to test
     * notifications without setting up notifications for a real HIT type and trying to trigger them using the website.
     * When you call this operation, the service attempts to send the test notification immediately.
     * </p>
     * 
     * @param sendTestEventNotificationRequest
     * @return Result of the SendTestEventNotification operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.SendTestEventNotification
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendTestEventNotification"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendTestEventNotificationResult sendTestEventNotification(SendTestEventNotificationRequest request) {
        request = beforeClientExecution(request);
        return executeSendTestEventNotification(request);
    }

    @SdkInternalApi
    final SendTestEventNotificationResult executeSendTestEventNotification(SendTestEventNotificationRequest sendTestEventNotificationRequest) {

        ExecutionContext executionContext = createExecutionContext(sendTestEventNotificationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendTestEventNotificationRequest> request = null;
        Response<SendTestEventNotificationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendTestEventNotificationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendTestEventNotificationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendTestEventNotification");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendTestEventNotificationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendTestEventNotificationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateExpirationForHIT</code> operation allows you update the expiration time of a HIT. If you update
     * it to a time in the past, the HIT will be immediately expired.
     * </p>
     * 
     * @param updateExpirationForHITRequest
     * @return Result of the UpdateExpirationForHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateExpirationForHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateExpirationForHIT"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateExpirationForHITResult updateExpirationForHIT(UpdateExpirationForHITRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateExpirationForHIT(request);
    }

    @SdkInternalApi
    final UpdateExpirationForHITResult executeUpdateExpirationForHIT(UpdateExpirationForHITRequest updateExpirationForHITRequest) {

        ExecutionContext executionContext = createExecutionContext(updateExpirationForHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateExpirationForHITRequest> request = null;
        Response<UpdateExpirationForHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateExpirationForHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateExpirationForHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateExpirationForHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateExpirationForHITResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateExpirationForHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateHITReviewStatus</code> operation updates the status of a HIT. If the status is Reviewable, this
     * operation can update the status to Reviewing, or it can revert a Reviewing HIT back to the Reviewable status.
     * </p>
     * 
     * @param updateHITReviewStatusRequest
     * @return Result of the UpdateHITReviewStatus operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateHITReviewStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateHITReviewStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateHITReviewStatusResult updateHITReviewStatus(UpdateHITReviewStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHITReviewStatus(request);
    }

    @SdkInternalApi
    final UpdateHITReviewStatusResult executeUpdateHITReviewStatus(UpdateHITReviewStatusRequest updateHITReviewStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHITReviewStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHITReviewStatusRequest> request = null;
        Response<UpdateHITReviewStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHITReviewStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHITReviewStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHITReviewStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHITReviewStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateHITReviewStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateHITTypeOfHIT</code> operation allows you to change the HITType properties of a HIT. This
     * operation disassociates the HIT from its old HITType properties and associates it with the new HITType
     * properties. The HIT takes on the properties of the new HITType in place of the old ones.
     * </p>
     * 
     * @param updateHITTypeOfHITRequest
     * @return Result of the UpdateHITTypeOfHIT operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateHITTypeOfHIT
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateHITTypeOfHIT"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateHITTypeOfHITResult updateHITTypeOfHIT(UpdateHITTypeOfHITRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateHITTypeOfHIT(request);
    }

    @SdkInternalApi
    final UpdateHITTypeOfHITResult executeUpdateHITTypeOfHIT(UpdateHITTypeOfHITRequest updateHITTypeOfHITRequest) {

        ExecutionContext executionContext = createExecutionContext(updateHITTypeOfHITRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHITTypeOfHITRequest> request = null;
        Response<UpdateHITTypeOfHITResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHITTypeOfHITRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateHITTypeOfHITRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateHITTypeOfHIT");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateHITTypeOfHITResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateHITTypeOfHITResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateNotificationSettings</code> operation creates, updates, disables or re-enables notifications for
     * a HIT type. If you call the UpdateNotificationSettings operation for a HIT type that already has a notification
     * specification, the operation replaces the old specification with a new one. You can call the
     * UpdateNotificationSettings operation to enable or disable notifications for the HIT type, without having to
     * modify the notification specification itself by providing updates to the Active status without specifying a new
     * notification specification. To change the Active status of a HIT type's notifications, the HIT type must already
     * have a notification specification, or one must be provided in the same call to
     * <code>UpdateNotificationSettings</code>.
     * </p>
     * 
     * @param updateNotificationSettingsRequest
     * @return Result of the UpdateNotificationSettings operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateNotificationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateNotificationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNotificationSettingsResult updateNotificationSettings(UpdateNotificationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNotificationSettings(request);
    }

    @SdkInternalApi
    final UpdateNotificationSettingsResult executeUpdateNotificationSettings(UpdateNotificationSettingsRequest updateNotificationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNotificationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNotificationSettingsRequest> request = null;
        Response<UpdateNotificationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNotificationSettingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNotificationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNotificationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNotificationSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNotificationSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The <code>UpdateQualificationType</code> operation modifies the attributes of an existing Qualification type,
     * which is represented by a QualificationType data structure. Only the owner of a Qualification type can modify its
     * attributes.
     * </p>
     * <p>
     * Most attributes of a Qualification type can be changed after the type has been created. However, the Name and
     * Keywords fields cannot be modified. The RetryDelayInSeconds parameter can be modified or added to change the
     * delay or to enable retries, but RetryDelayInSeconds cannot be used to disable retries.
     * </p>
     * <p>
     * You can use this operation to update the test for a Qualification type. The test is updated based on the values
     * specified for the Test, TestDurationInSeconds and AnswerKey parameters. All three parameters specify the updated
     * test. If you are updating the test for a type, you must specify the Test and TestDurationInSeconds parameters.
     * The AnswerKey parameter is optional; omitting it specifies that the updated test does not have an answer key.
     * </p>
     * <p>
     * If you omit the Test parameter, the test for the Qualification type is unchanged. There is no way to remove a
     * test from a Qualification type that has one. If the type already has a test, you cannot update it to be
     * AutoGranted. If the Qualification type does not have a test and one is provided by an update, the type will
     * henceforth have a test.
     * </p>
     * <p>
     * If you want to update the test duration or answer key for an existing test without changing the questions, you
     * must specify a Test parameter with the original questions, along with the updated values.
     * </p>
     * <p>
     * If you provide an updated Test but no AnswerKey, the new test will not have an answer key. Requests for such
     * Qualifications must be granted manually.
     * </p>
     * <p>
     * You can also update the AutoGranted and AutoGrantedValue attributes of the Qualification type.
     * </p>
     * 
     * @param updateQualificationTypeRequest
     * @return Result of the UpdateQualificationType operation returned by the service.
     * @throws ServiceException
     *         Amazon Mechanical Turk is temporarily unable to process your request. Try your call again.
     * @throws RequestErrorException
     *         Your request is invalid.
     * @sample AmazonMTurk.UpdateQualificationType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateQualificationType"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateQualificationTypeResult updateQualificationType(UpdateQualificationTypeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateQualificationType(request);
    }

    @SdkInternalApi
    final UpdateQualificationTypeResult executeUpdateQualificationType(UpdateQualificationTypeRequest updateQualificationTypeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateQualificationTypeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateQualificationTypeRequest> request = null;
        Response<UpdateQualificationTypeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateQualificationTypeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateQualificationTypeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MTurk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateQualificationType");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateQualificationTypeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateQualificationTypeResultJsonUnmarshaller());
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
