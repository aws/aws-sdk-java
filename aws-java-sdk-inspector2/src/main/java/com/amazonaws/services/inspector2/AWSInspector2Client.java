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
package com.amazonaws.services.inspector2;

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

import com.amazonaws.services.inspector2.AWSInspector2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.services.inspector2.model.transform.*;

/**
 * Client for accessing Inspector2. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Inspector is a vulnerability discovery service that automates continuous scanning for security vulnerabilities
 * within your Amazon EC2, Amazon ECR, and Amazon Web Services Lambda environments.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSInspector2Client extends AmazonWebServiceClient implements AWSInspector2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSInspector2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "inspector2";

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
                                    com.amazonaws.services.inspector2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.inspector2.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.inspector2.model.AWSInspector2Exception.class));

    public static AWSInspector2ClientBuilder builder() {
        return AWSInspector2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Inspector2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSInspector2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Inspector2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSInspector2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("inspector2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/inspector2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/inspector2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator. An HTTP 200 response
     * indicates the association was successfully started, but doesn’t indicate whether it was completed. You can check
     * if the association completed by using <a
     * href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_ListMembers.html">ListMembers</a> for multiple
     * accounts or <a href="https://docs.aws.amazon.com/inspector/v2/APIReference/API_GetMember.html">GetMembers</a> for
     * a single account.
     * </p>
     * 
     * @param associateMemberRequest
     * @return Result of the AssociateMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.AssociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AssociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateMemberResult associateMember(AssociateMemberRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateMember(request);
    }

    @SdkInternalApi
    final AssociateMemberResult executeAssociateMember(AssociateMemberRequest associateMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(associateMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateMemberRequest> request = null;
        Response<AssociateMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
     * </p>
     * 
     * @param batchGetAccountStatusRequest
     * @return Result of the BatchGetAccountStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetAccountStatusResult batchGetAccountStatus(BatchGetAccountStatusRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetAccountStatus(request);
    }

    @SdkInternalApi
    final BatchGetAccountStatusResult executeBatchGetAccountStatus(BatchGetAccountStatusRequest batchGetAccountStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetAccountStatusRequest> request = null;
        Response<BatchGetAccountStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetAccountStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetAccountStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetAccountStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetAccountStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchGetAccountStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves code snippets from findings that Amazon Inspector detected code vulnerabilities in.
     * </p>
     * 
     * @param batchGetCodeSnippetRequest
     * @return Result of the BatchGetCodeSnippet operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetCodeSnippet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetCodeSnippet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchGetCodeSnippetResult batchGetCodeSnippet(BatchGetCodeSnippetRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetCodeSnippet(request);
    }

    @SdkInternalApi
    final BatchGetCodeSnippetResult executeBatchGetCodeSnippet(BatchGetCodeSnippetRequest batchGetCodeSnippetRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetCodeSnippetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCodeSnippetRequest> request = null;
        Response<BatchGetCodeSnippetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCodeSnippetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetCodeSnippetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetCodeSnippet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetCodeSnippetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetCodeSnippetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets vulnerability details for findings.
     * </p>
     * 
     * @param batchGetFindingDetailsRequest
     * @return Result of the BatchGetFindingDetails operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetFindingDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFindingDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetFindingDetailsResult batchGetFindingDetails(BatchGetFindingDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetFindingDetails(request);
    }

    @SdkInternalApi
    final BatchGetFindingDetailsResult executeBatchGetFindingDetails(BatchGetFindingDetailsRequest batchGetFindingDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetFindingDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetFindingDetailsRequest> request = null;
        Response<BatchGetFindingDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetFindingDetailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetFindingDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetFindingDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetFindingDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetFindingDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets free trial status for multiple Amazon Web Services accounts.
     * </p>
     * 
     * @param batchGetFreeTrialInfoRequest
     * @return Result of the BatchGetFreeTrialInfo operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetFreeTrialInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFreeTrialInfo"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetFreeTrialInfoResult batchGetFreeTrialInfo(BatchGetFreeTrialInfoRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetFreeTrialInfo(request);
    }

    @SdkInternalApi
    final BatchGetFreeTrialInfoResult executeBatchGetFreeTrialInfo(BatchGetFreeTrialInfoRequest batchGetFreeTrialInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetFreeTrialInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetFreeTrialInfoRequest> request = null;
        Response<BatchGetFreeTrialInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetFreeTrialInfoRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetFreeTrialInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetFreeTrialInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetFreeTrialInfoResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchGetFreeTrialInfoResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves Amazon Inspector deep inspection activation status of multiple member accounts within your
     * organization. You must be the delegated administrator of an organization in Amazon Inspector to use this API.
     * </p>
     * 
     * @param batchGetMemberEc2DeepInspectionStatusRequest
     * @return Result of the BatchGetMemberEc2DeepInspectionStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetMemberEc2DeepInspectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetMemberEc2DeepInspectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetMemberEc2DeepInspectionStatusResult batchGetMemberEc2DeepInspectionStatus(BatchGetMemberEc2DeepInspectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetMemberEc2DeepInspectionStatus(request);
    }

    @SdkInternalApi
    final BatchGetMemberEc2DeepInspectionStatusResult executeBatchGetMemberEc2DeepInspectionStatus(
            BatchGetMemberEc2DeepInspectionStatusRequest batchGetMemberEc2DeepInspectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetMemberEc2DeepInspectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetMemberEc2DeepInspectionStatusRequest> request = null;
        Response<BatchGetMemberEc2DeepInspectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetMemberEc2DeepInspectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetMemberEc2DeepInspectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetMemberEc2DeepInspectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetMemberEc2DeepInspectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetMemberEc2DeepInspectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates or deactivates Amazon Inspector deep inspection for the provided member accounts in your organization.
     * You must be the delegated administrator of an organization in Amazon Inspector to use this API.
     * </p>
     * 
     * @param batchUpdateMemberEc2DeepInspectionStatusRequest
     * @return Result of the BatchUpdateMemberEc2DeepInspectionStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchUpdateMemberEc2DeepInspectionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchUpdateMemberEc2DeepInspectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchUpdateMemberEc2DeepInspectionStatusResult batchUpdateMemberEc2DeepInspectionStatus(BatchUpdateMemberEc2DeepInspectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateMemberEc2DeepInspectionStatus(request);
    }

    @SdkInternalApi
    final BatchUpdateMemberEc2DeepInspectionStatusResult executeBatchUpdateMemberEc2DeepInspectionStatus(
            BatchUpdateMemberEc2DeepInspectionStatusRequest batchUpdateMemberEc2DeepInspectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateMemberEc2DeepInspectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateMemberEc2DeepInspectionStatusRequest> request = null;
        Response<BatchUpdateMemberEc2DeepInspectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateMemberEc2DeepInspectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchUpdateMemberEc2DeepInspectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateMemberEc2DeepInspectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateMemberEc2DeepInspectionStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchUpdateMemberEc2DeepInspectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels the given findings report.
     * </p>
     * 
     * @param cancelFindingsReportRequest
     * @return Result of the CancelFindingsReport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CancelFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CancelFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelFindingsReportResult cancelFindingsReport(CancelFindingsReportRequest request) {
        request = beforeClientExecution(request);
        return executeCancelFindingsReport(request);
    }

    @SdkInternalApi
    final CancelFindingsReportResult executeCancelFindingsReport(CancelFindingsReportRequest cancelFindingsReportRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelFindingsReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelFindingsReportRequest> request = null;
        Response<CancelFindingsReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelFindingsReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelFindingsReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelFindingsReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelFindingsReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelFindingsReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a software bill of materials (SBOM) report.
     * </p>
     * 
     * @param cancelSbomExportRequest
     * @return Result of the CancelSbomExport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CancelSbomExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CancelSbomExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelSbomExportResult cancelSbomExport(CancelSbomExportRequest request) {
        request = beforeClientExecution(request);
        return executeCancelSbomExport(request);
    }

    @SdkInternalApi
    final CancelSbomExportResult executeCancelSbomExport(CancelSbomExportRequest cancelSbomExportRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelSbomExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelSbomExportRequest> request = null;
        Response<CancelSbomExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelSbomExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelSbomExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelSbomExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelSbomExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelSbomExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a CIS scan configuration.
     * </p>
     * 
     * @param createCisScanConfigurationRequest
     * @return Result of the CreateCisScanConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateCisScanConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateCisScanConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCisScanConfigurationResult createCisScanConfiguration(CreateCisScanConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCisScanConfiguration(request);
    }

    @SdkInternalApi
    final CreateCisScanConfigurationResult executeCreateCisScanConfiguration(CreateCisScanConfigurationRequest createCisScanConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createCisScanConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCisScanConfigurationRequest> request = null;
        Response<CreateCisScanConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCisScanConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCisScanConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCisScanConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCisScanConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCisScanConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a filter resource using specified filter criteria. When the filter action is set to <code>SUPPRESS</code>
     * this action creates a suppression rule.
     * </p>
     * 
     * @param createFilterRequest
     * @return Result of the CreateFilter operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws BadRequestException
     *         One or more tags submitted as part of the request is not valid.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFilterResult createFilter(CreateFilterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFilter(request);
    }

    @SdkInternalApi
    final CreateFilterResult executeCreateFilter(CreateFilterRequest createFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(createFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFilterRequest> request = null;
        Response<CreateFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a finding report. By default only <code>ACTIVE</code> findings are returned in the report. To see
     * <code>SUPRESSED</code> or <code>CLOSED</code> findings you must specify a value for the
     * <code>findingStatus</code> filter criteria.
     * </p>
     * 
     * @param createFindingsReportRequest
     * @return Result of the CreateFindingsReport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFindingsReportResult createFindingsReport(CreateFindingsReportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFindingsReport(request);
    }

    @SdkInternalApi
    final CreateFindingsReportResult executeCreateFindingsReport(CreateFindingsReportRequest createFindingsReportRequest) {

        ExecutionContext executionContext = createExecutionContext(createFindingsReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFindingsReportRequest> request = null;
        Response<CreateFindingsReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFindingsReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFindingsReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFindingsReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFindingsReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFindingsReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a software bill of materials (SBOM) report.
     * </p>
     * 
     * @param createSbomExportRequest
     * @return Result of the CreateSbomExport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateSbomExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateSbomExport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateSbomExportResult createSbomExport(CreateSbomExportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSbomExport(request);
    }

    @SdkInternalApi
    final CreateSbomExportResult executeCreateSbomExport(CreateSbomExportRequest createSbomExportRequest) {

        ExecutionContext executionContext = createExecutionContext(createSbomExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSbomExportRequest> request = null;
        Response<CreateSbomExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSbomExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSbomExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSbomExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSbomExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSbomExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a CIS scan configuration.
     * </p>
     * 
     * @param deleteCisScanConfigurationRequest
     * @return Result of the DeleteCisScanConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DeleteCisScanConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DeleteCisScanConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCisScanConfigurationResult deleteCisScanConfiguration(DeleteCisScanConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCisScanConfiguration(request);
    }

    @SdkInternalApi
    final DeleteCisScanConfigurationResult executeDeleteCisScanConfiguration(DeleteCisScanConfigurationRequest deleteCisScanConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCisScanConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCisScanConfigurationRequest> request = null;
        Response<DeleteCisScanConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCisScanConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCisScanConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCisScanConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCisScanConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCisScanConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a filter resource.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFilterResult deleteFilter(DeleteFilterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFilter(request);
    }

    @SdkInternalApi
    final DeleteFilterResult executeDeleteFilter(DeleteFilterRequest deleteFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFilterRequest> request = null;
        Response<DeleteFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe Amazon Inspector configuration settings for an Amazon Web Services organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final DescribeOrganizationConfigurationResult executeDescribeOrganizationConfiguration(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrganizationConfigurationRequest> request = null;
        Response<DescribeOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeOrganizationConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an
     * account disables the Amazon Inspector service.
     * </p>
     * 
     * @param disableRequest
     * @return Result of the Disable operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.Disable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Disable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableResult disable(DisableRequest request) {
        request = beforeClientExecution(request);
        return executeDisable(request);
    }

    @SdkInternalApi
    final DisableResult executeDisable(DisableRequest disableRequest) {

        ExecutionContext executionContext = createExecutionContext(disableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRequest> request = null;
        Response<DisableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Disable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param disableDelegatedAdminAccountRequest
     * @return Result of the DisableDelegatedAdminAccount operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DisableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableDelegatedAdminAccountResult disableDelegatedAdminAccount(DisableDelegatedAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDisableDelegatedAdminAccount(request);
    }

    @SdkInternalApi
    final DisableDelegatedAdminAccountResult executeDisableDelegatedAdminAccount(DisableDelegatedAdminAccountRequest disableDelegatedAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(disableDelegatedAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDelegatedAdminAccountRequest> request = null;
        Response<DisableDelegatedAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDelegatedAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disableDelegatedAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableDelegatedAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableDelegatedAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisableDelegatedAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a member account from an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return Result of the DisassociateMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisassociateMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateMemberResult disassociateMember(DisassociateMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateMember(request);
    }

    @SdkInternalApi
    final DisassociateMemberResult executeDisassociateMember(DisassociateMemberRequest disassociateMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateMemberRequest> request = null;
        Response<DisassociateMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
     * </p>
     * 
     * @param enableRequest
     * @return Result of the Enable operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.Enable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Enable" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableResult enable(EnableRequest request) {
        request = beforeClientExecution(request);
        return executeEnable(request);
    }

    @SdkInternalApi
    final EnableResult executeEnable(EnableRequest enableRequest) {

        ExecutionContext executionContext = createExecutionContext(enableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRequest> request = null;
        Response<EnableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Enable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the Amazon Inspector delegated administrator for your Organizations organization.
     * </p>
     * 
     * @param enableDelegatedAdminAccountRequest
     * @return Result of the EnableDelegatedAdminAccount operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.EnableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EnableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableDelegatedAdminAccountResult enableDelegatedAdminAccount(EnableDelegatedAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeEnableDelegatedAdminAccount(request);
    }

    @SdkInternalApi
    final EnableDelegatedAdminAccountResult executeEnableDelegatedAdminAccount(EnableDelegatedAdminAccountRequest enableDelegatedAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(enableDelegatedAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDelegatedAdminAccountRequest> request = null;
        Response<EnableDelegatedAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDelegatedAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(enableDelegatedAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableDelegatedAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableDelegatedAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new EnableDelegatedAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a CIS scan report.
     * </p>
     * 
     * @param getCisScanReportRequest
     * @return Result of the GetCisScanReport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetCisScanReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanReport" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCisScanReportResult getCisScanReport(GetCisScanReportRequest request) {
        request = beforeClientExecution(request);
        return executeGetCisScanReport(request);
    }

    @SdkInternalApi
    final GetCisScanReportResult executeGetCisScanReport(GetCisScanReportRequest getCisScanReportRequest) {

        ExecutionContext executionContext = createExecutionContext(getCisScanReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCisScanReportRequest> request = null;
        Response<GetCisScanReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCisScanReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCisScanReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCisScanReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCisScanReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCisScanReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves CIS scan result details.
     * </p>
     * 
     * @param getCisScanResultDetailsRequest
     * @return Result of the GetCisScanResultDetails operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetCisScanResultDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetCisScanResultDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCisScanResultDetailsResult getCisScanResultDetails(GetCisScanResultDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCisScanResultDetails(request);
    }

    @SdkInternalApi
    final GetCisScanResultDetailsResult executeGetCisScanResultDetails(GetCisScanResultDetailsRequest getCisScanResultDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCisScanResultDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCisScanResultDetailsRequest> request = null;
        Response<GetCisScanResultDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCisScanResultDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCisScanResultDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCisScanResultDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCisScanResultDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCisScanResultDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves setting configurations for Inspector scans.
     * </p>
     * 
     * @param getConfigurationRequest
     * @return Result of the GetConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConfigurationResult getConfiguration(GetConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguration(request);
    }

    @SdkInternalApi
    final GetConfigurationResult executeGetConfiguration(GetConfigurationRequest getConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigurationRequest> request = null;
        Response<GetConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param getDelegatedAdminAccountRequest
     * @return Result of the GetDelegatedAdminAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDelegatedAdminAccountResult getDelegatedAdminAccount(GetDelegatedAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetDelegatedAdminAccount(request);
    }

    @SdkInternalApi
    final GetDelegatedAdminAccountResult executeGetDelegatedAdminAccount(GetDelegatedAdminAccountRequest getDelegatedAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getDelegatedAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDelegatedAdminAccountRequest> request = null;
        Response<GetDelegatedAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDelegatedAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDelegatedAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDelegatedAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDelegatedAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDelegatedAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the activation status of Amazon Inspector deep inspection and custom paths associated with your
     * account.
     * </p>
     * 
     * @param getEc2DeepInspectionConfigurationRequest
     * @return Result of the GetEc2DeepInspectionConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetEc2DeepInspectionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetEc2DeepInspectionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEc2DeepInspectionConfigurationResult getEc2DeepInspectionConfiguration(GetEc2DeepInspectionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetEc2DeepInspectionConfiguration(request);
    }

    @SdkInternalApi
    final GetEc2DeepInspectionConfigurationResult executeGetEc2DeepInspectionConfiguration(
            GetEc2DeepInspectionConfigurationRequest getEc2DeepInspectionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getEc2DeepInspectionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEc2DeepInspectionConfigurationRequest> request = null;
        Response<GetEc2DeepInspectionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEc2DeepInspectionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEc2DeepInspectionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEc2DeepInspectionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEc2DeepInspectionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEc2DeepInspectionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an encryption key.
     * </p>
     * 
     * @param getEncryptionKeyRequest
     * @return Result of the GetEncryptionKey operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEncryptionKeyResult getEncryptionKey(GetEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetEncryptionKey(request);
    }

    @SdkInternalApi
    final GetEncryptionKeyResult executeGetEncryptionKey(GetEncryptionKeyRequest getEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEncryptionKeyRequest> request = null;
        Response<GetEncryptionKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEncryptionKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEncryptionKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEncryptionKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of a findings report.
     * </p>
     * 
     * @param getFindingsReportStatusRequest
     * @return Result of the GetFindingsReportStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetFindingsReportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetFindingsReportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFindingsReportStatusResult getFindingsReportStatus(GetFindingsReportStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindingsReportStatus(request);
    }

    @SdkInternalApi
    final GetFindingsReportStatusResult executeGetFindingsReportStatus(GetFindingsReportStatusRequest getFindingsReportStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingsReportStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsReportStatusRequest> request = null;
        Response<GetFindingsReportStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsReportStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getFindingsReportStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindingsReportStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingsReportStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetFindingsReportStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets member information for your organization.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMemberResult getMember(GetMemberRequest request) {
        request = beforeClientExecution(request);
        return executeGetMember(request);
    }

    @SdkInternalApi
    final GetMemberResult executeGetMember(GetMemberRequest getMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(getMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMemberRequest> request = null;
        Response<GetMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMemberResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details of a software bill of materials (SBOM) report.
     * </p>
     * 
     * @param getSbomExportRequest
     * @return Result of the GetSbomExport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetSbomExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetSbomExport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSbomExportResult getSbomExport(GetSbomExportRequest request) {
        request = beforeClientExecution(request);
        return executeGetSbomExport(request);
    }

    @SdkInternalApi
    final GetSbomExportResult executeGetSbomExport(GetSbomExportRequest getSbomExportRequest) {

        ExecutionContext executionContext = createExecutionContext(getSbomExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSbomExportRequest> request = null;
        Response<GetSbomExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSbomExportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSbomExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSbomExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSbomExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSbomExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the permissions an account has to configure Amazon Inspector.
     * </p>
     * 
     * @param listAccountPermissionsRequest
     * @return Result of the ListAccountPermissions operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListAccountPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListAccountPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAccountPermissionsResult listAccountPermissions(ListAccountPermissionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccountPermissions(request);
    }

    @SdkInternalApi
    final ListAccountPermissionsResult executeListAccountPermissions(ListAccountPermissionsRequest listAccountPermissionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAccountPermissionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAccountPermissionsRequest> request = null;
        Response<ListAccountPermissionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAccountPermissionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAccountPermissionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccountPermissions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAccountPermissionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAccountPermissionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists CIS scan configurations.
     * </p>
     * 
     * @param listCisScanConfigurationsRequest
     * @return Result of the ListCisScanConfigurations operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCisScanConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCisScanConfigurationsResult listCisScanConfigurations(ListCisScanConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListCisScanConfigurations(request);
    }

    @SdkInternalApi
    final ListCisScanConfigurationsResult executeListCisScanConfigurations(ListCisScanConfigurationsRequest listCisScanConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCisScanConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCisScanConfigurationsRequest> request = null;
        Response<ListCisScanConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCisScanConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCisScanConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCisScanConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCisScanConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCisScanConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists scan results aggregated by checks.
     * </p>
     * 
     * @param listCisScanResultsAggregatedByChecksRequest
     * @return Result of the ListCisScanResultsAggregatedByChecks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCisScanResultsAggregatedByChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanResultsAggregatedByChecks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCisScanResultsAggregatedByChecksResult listCisScanResultsAggregatedByChecks(ListCisScanResultsAggregatedByChecksRequest request) {
        request = beforeClientExecution(request);
        return executeListCisScanResultsAggregatedByChecks(request);
    }

    @SdkInternalApi
    final ListCisScanResultsAggregatedByChecksResult executeListCisScanResultsAggregatedByChecks(
            ListCisScanResultsAggregatedByChecksRequest listCisScanResultsAggregatedByChecksRequest) {

        ExecutionContext executionContext = createExecutionContext(listCisScanResultsAggregatedByChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCisScanResultsAggregatedByChecksRequest> request = null;
        Response<ListCisScanResultsAggregatedByChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCisScanResultsAggregatedByChecksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCisScanResultsAggregatedByChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCisScanResultsAggregatedByChecks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCisScanResultsAggregatedByChecksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCisScanResultsAggregatedByChecksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists scan results aggregated by a target resource.
     * </p>
     * 
     * @param listCisScanResultsAggregatedByTargetResourceRequest
     * @return Result of the ListCisScanResultsAggregatedByTargetResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCisScanResultsAggregatedByTargetResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanResultsAggregatedByTargetResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCisScanResultsAggregatedByTargetResourceResult listCisScanResultsAggregatedByTargetResource(
            ListCisScanResultsAggregatedByTargetResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListCisScanResultsAggregatedByTargetResource(request);
    }

    @SdkInternalApi
    final ListCisScanResultsAggregatedByTargetResourceResult executeListCisScanResultsAggregatedByTargetResource(
            ListCisScanResultsAggregatedByTargetResourceRequest listCisScanResultsAggregatedByTargetResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listCisScanResultsAggregatedByTargetResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCisScanResultsAggregatedByTargetResourceRequest> request = null;
        Response<ListCisScanResultsAggregatedByTargetResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCisScanResultsAggregatedByTargetResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCisScanResultsAggregatedByTargetResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCisScanResultsAggregatedByTargetResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCisScanResultsAggregatedByTargetResourceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListCisScanResultsAggregatedByTargetResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a CIS scan list.
     * </p>
     * 
     * @param listCisScansRequest
     * @return Result of the ListCisScans operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCisScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScans" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCisScansResult listCisScans(ListCisScansRequest request) {
        request = beforeClientExecution(request);
        return executeListCisScans(request);
    }

    @SdkInternalApi
    final ListCisScansResult executeListCisScans(ListCisScansRequest listCisScansRequest) {

        ExecutionContext executionContext = createExecutionContext(listCisScansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCisScansRequest> request = null;
        Response<ListCisScansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCisScansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCisScansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCisScans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCisScansResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCisScansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists coverage details for you environment.
     * </p>
     * 
     * @param listCoverageRequest
     * @return Result of the ListCoverage operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCoverageResult listCoverage(ListCoverageRequest request) {
        request = beforeClientExecution(request);
        return executeListCoverage(request);
    }

    @SdkInternalApi
    final ListCoverageResult executeListCoverage(ListCoverageRequest listCoverageRequest) {

        ExecutionContext executionContext = createExecutionContext(listCoverageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCoverageRequest> request = null;
        Response<ListCoverageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCoverageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCoverageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCoverage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCoverageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCoverageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Inspector coverage statistics for your environment.
     * </p>
     * 
     * @param listCoverageStatisticsRequest
     * @return Result of the ListCoverageStatistics operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCoverageStatisticsResult listCoverageStatistics(ListCoverageStatisticsRequest request) {
        request = beforeClientExecution(request);
        return executeListCoverageStatistics(request);
    }

    @SdkInternalApi
    final ListCoverageStatisticsResult executeListCoverageStatistics(ListCoverageStatisticsRequest listCoverageStatisticsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCoverageStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCoverageStatisticsRequest> request = null;
        Response<ListCoverageStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCoverageStatisticsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCoverageStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCoverageStatistics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCoverageStatisticsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCoverageStatisticsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param listDelegatedAdminAccountsRequest
     * @return Result of the ListDelegatedAdminAccounts operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListDelegatedAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListDelegatedAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDelegatedAdminAccountsResult listDelegatedAdminAccounts(ListDelegatedAdminAccountsRequest request) {
        request = beforeClientExecution(request);
        return executeListDelegatedAdminAccounts(request);
    }

    @SdkInternalApi
    final ListDelegatedAdminAccountsResult executeListDelegatedAdminAccounts(ListDelegatedAdminAccountsRequest listDelegatedAdminAccountsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDelegatedAdminAccountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDelegatedAdminAccountsRequest> request = null;
        Response<ListDelegatedAdminAccountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDelegatedAdminAccountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDelegatedAdminAccountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDelegatedAdminAccounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDelegatedAdminAccountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDelegatedAdminAccountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the filters associated with your account.
     * </p>
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFiltersResult listFilters(ListFiltersRequest request) {
        request = beforeClientExecution(request);
        return executeListFilters(request);
    }

    @SdkInternalApi
    final ListFiltersResult executeListFilters(ListFiltersRequest listFiltersRequest) {

        ExecutionContext executionContext = createExecutionContext(listFiltersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFiltersRequest> request = null;
        Response<ListFiltersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFiltersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFiltersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFilters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFiltersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFiltersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists aggregated finding data for your environment based on specific criteria.
     * </p>
     * 
     * @param listFindingAggregationsRequest
     * @return Result of the ListFindingAggregations operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFindingAggregations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindingAggregations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFindingAggregationsResult listFindingAggregations(ListFindingAggregationsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindingAggregations(request);
    }

    @SdkInternalApi
    final ListFindingAggregationsResult executeListFindingAggregations(ListFindingAggregationsRequest listFindingAggregationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingAggregationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingAggregationsRequest> request = null;
        Response<ListFindingAggregationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingAggregationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listFindingAggregationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindingAggregations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingAggregationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListFindingAggregationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists findings for your environment.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindings(request);
    }

    @SdkInternalApi
    final ListFindingsResult executeListFindings(ListFindingsRequest listFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List members associated with the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMembersResult listMembers(ListMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListMembers(request);
    }

    @SdkInternalApi
    final ListMembersResult executeListMembers(ListMembersRequest listMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags attached to a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListTagsForResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
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
     * Lists the Amazon Inspector usage totals over the last 30 days.
     * </p>
     * 
     * @param listUsageTotalsRequest
     * @return Result of the ListUsageTotals operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUsageTotalsResult listUsageTotals(ListUsageTotalsRequest request) {
        request = beforeClientExecution(request);
        return executeListUsageTotals(request);
    }

    @SdkInternalApi
    final ListUsageTotalsResult executeListUsageTotals(ListUsageTotalsRequest listUsageTotalsRequest) {

        ExecutionContext executionContext = createExecutionContext(listUsageTotalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUsageTotalsRequest> request = null;
        Response<ListUsageTotalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUsageTotalsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUsageTotalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUsageTotals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUsageTotalsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUsageTotalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets an encryption key. After the key is reset your resources will be encrypted by an Amazon Web Services owned
     * key.
     * </p>
     * 
     * @param resetEncryptionKeyRequest
     * @return Result of the ResetEncryptionKey operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ResetEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResetEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResetEncryptionKeyResult resetEncryptionKey(ResetEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executeResetEncryptionKey(request);
    }

    @SdkInternalApi
    final ResetEncryptionKeyResult executeResetEncryptionKey(ResetEncryptionKeyRequest resetEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(resetEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetEncryptionKeyRequest> request = null;
        Response<ResetEncryptionKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetEncryptionKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetEncryptionKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetEncryptionKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists Amazon Inspector coverage details for a specific vulnerability.
     * </p>
     * 
     * @param searchVulnerabilitiesRequest
     * @return Result of the SearchVulnerabilities operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.SearchVulnerabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SearchVulnerabilities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchVulnerabilitiesResult searchVulnerabilities(SearchVulnerabilitiesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchVulnerabilities(request);
    }

    @SdkInternalApi
    final SearchVulnerabilitiesResult executeSearchVulnerabilities(SearchVulnerabilitiesRequest searchVulnerabilitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchVulnerabilitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchVulnerabilitiesRequest> request = null;
        Response<SearchVulnerabilitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchVulnerabilitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchVulnerabilitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchVulnerabilities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchVulnerabilitiesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new SearchVulnerabilitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a CIS session health. This API is used by the Amazon Inspector SSM plugin to communicate with the Amazon
     * Inspector service. The Amazon Inspector SSM plugin calls this API to start a CIS scan session for the scan ID
     * supplied by the service.
     * </p>
     * 
     * @param sendCisSessionHealthRequest
     * @return Result of the SendCisSessionHealth operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.SendCisSessionHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SendCisSessionHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendCisSessionHealthResult sendCisSessionHealth(SendCisSessionHealthRequest request) {
        request = beforeClientExecution(request);
        return executeSendCisSessionHealth(request);
    }

    @SdkInternalApi
    final SendCisSessionHealthResult executeSendCisSessionHealth(SendCisSessionHealthRequest sendCisSessionHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(sendCisSessionHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCisSessionHealthRequest> request = null;
        Response<SendCisSessionHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCisSessionHealthRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendCisSessionHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendCisSessionHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendCisSessionHealthResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendCisSessionHealthResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a CIS session telemetry. This API is used by the Amazon Inspector SSM plugin to communicate with the Amazon
     * Inspector service. The Amazon Inspector SSM plugin calls this API to start a CIS scan session for the scan ID
     * supplied by the service.
     * </p>
     * 
     * @param sendCisSessionTelemetryRequest
     * @return Result of the SendCisSessionTelemetry operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.SendCisSessionTelemetry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SendCisSessionTelemetry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendCisSessionTelemetryResult sendCisSessionTelemetry(SendCisSessionTelemetryRequest request) {
        request = beforeClientExecution(request);
        return executeSendCisSessionTelemetry(request);
    }

    @SdkInternalApi
    final SendCisSessionTelemetryResult executeSendCisSessionTelemetry(SendCisSessionTelemetryRequest sendCisSessionTelemetryRequest) {

        ExecutionContext executionContext = createExecutionContext(sendCisSessionTelemetryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCisSessionTelemetryRequest> request = null;
        Response<SendCisSessionTelemetryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCisSessionTelemetryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(sendCisSessionTelemetryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendCisSessionTelemetry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendCisSessionTelemetryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new SendCisSessionTelemetryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a CIS session. This API is used by the Amazon Inspector SSM plugin to communicate with the Amazon
     * Inspector service. The Amazon Inspector SSM plugin calls this API to start a CIS scan session for the scan ID
     * supplied by the service.
     * </p>
     * 
     * @param startCisSessionRequest
     * @return Result of the StartCisSession operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.StartCisSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StartCisSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartCisSessionResult startCisSession(StartCisSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartCisSession(request);
    }

    @SdkInternalApi
    final StartCisSessionResult executeStartCisSession(StartCisSessionRequest startCisSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startCisSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCisSessionRequest> request = null;
        Response<StartCisSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCisSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCisSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartCisSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCisSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCisSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a CIS session. This API is used by the Amazon Inspector SSM plugin to communicate with the Amazon Inspector
     * service. The Amazon Inspector SSM plugin calls this API to start a CIS scan session for the scan ID supplied by
     * the service.
     * </p>
     * 
     * @param stopCisSessionRequest
     * @return Result of the StopCisSession operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.StopCisSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StopCisSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopCisSessionResult stopCisSession(StopCisSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStopCisSession(request);
    }

    @SdkInternalApi
    final StopCisSessionResult executeStopCisSession(StopCisSessionRequest stopCisSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCisSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCisSessionRequest> request = null;
        Response<StopCisSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCisSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCisSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopCisSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCisSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCisSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         One or more tags submitted as part of the request is not valid.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
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
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
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
     * Updates a CIS scan configuration.
     * </p>
     * 
     * @param updateCisScanConfigurationRequest
     * @return Result of the UpdateCisScanConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateCisScanConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateCisScanConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCisScanConfigurationResult updateCisScanConfiguration(UpdateCisScanConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCisScanConfiguration(request);
    }

    @SdkInternalApi
    final UpdateCisScanConfigurationResult executeUpdateCisScanConfiguration(UpdateCisScanConfigurationRequest updateCisScanConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCisScanConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCisScanConfigurationRequest> request = null;
        Response<UpdateCisScanConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCisScanConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCisScanConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCisScanConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCisScanConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCisScanConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector
     * delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization
     * cannot update this setting.
     * </p>
     * 
     * @param updateConfigurationRequest
     * @return Result of the UpdateConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateConfigurationResult updateConfiguration(UpdateConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguration(request);
    }

    @SdkInternalApi
    final UpdateConfigurationResult executeUpdateConfiguration(UpdateConfigurationRequest updateConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationRequest> request = null;
        Response<UpdateConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Activates, deactivates Amazon Inspector deep inspection, or updates custom paths for your account.
     * </p>
     * 
     * @param updateEc2DeepInspectionConfigurationRequest
     * @return Result of the UpdateEc2DeepInspectionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateEc2DeepInspectionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateEc2DeepInspectionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEc2DeepInspectionConfigurationResult updateEc2DeepInspectionConfiguration(UpdateEc2DeepInspectionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEc2DeepInspectionConfiguration(request);
    }

    @SdkInternalApi
    final UpdateEc2DeepInspectionConfigurationResult executeUpdateEc2DeepInspectionConfiguration(
            UpdateEc2DeepInspectionConfigurationRequest updateEc2DeepInspectionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEc2DeepInspectionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEc2DeepInspectionConfigurationRequest> request = null;
        Response<UpdateEc2DeepInspectionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEc2DeepInspectionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEc2DeepInspectionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEc2DeepInspectionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEc2DeepInspectionConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEc2DeepInspectionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an encryption key. A <code>ResourceNotFoundException</code> means that an Amazon Web Services owned key
     * is being used for encryption.
     * </p>
     * 
     * @param updateEncryptionKeyRequest
     * @return Result of the UpdateEncryptionKey operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateEncryptionKeyResult updateEncryptionKey(UpdateEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEncryptionKey(request);
    }

    @SdkInternalApi
    final UpdateEncryptionKeyResult executeUpdateEncryptionKey(UpdateEncryptionKeyRequest updateEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEncryptionKeyRequest> request = null;
        Response<UpdateEncryptionKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEncryptionKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEncryptionKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEncryptionKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param updateFilterRequest
     * @return Result of the UpdateFilter operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFilterResult updateFilter(UpdateFilterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFilter(request);
    }

    @SdkInternalApi
    final UpdateFilterResult executeUpdateFilter(UpdateFilterRequest updateFilterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFilterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFilterRequest> request = null;
        Response<UpdateFilterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFilterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFilterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFilter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFilterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFilterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Amazon Inspector deep inspection custom paths for your organization. You must be an Amazon Inspector
     * delegated administrator to use this API.
     * </p>
     * 
     * @param updateOrgEc2DeepInspectionConfigurationRequest
     * @return Result of the UpdateOrgEc2DeepInspectionConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateOrgEc2DeepInspectionConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrgEc2DeepInspectionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrgEc2DeepInspectionConfigurationResult updateOrgEc2DeepInspectionConfiguration(UpdateOrgEc2DeepInspectionConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrgEc2DeepInspectionConfiguration(request);
    }

    @SdkInternalApi
    final UpdateOrgEc2DeepInspectionConfigurationResult executeUpdateOrgEc2DeepInspectionConfiguration(
            UpdateOrgEc2DeepInspectionConfigurationRequest updateOrgEc2DeepInspectionConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrgEc2DeepInspectionConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrgEc2DeepInspectionConfigurationRequest> request = null;
        Response<UpdateOrgEc2DeepInspectionConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrgEc2DeepInspectionConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrgEc2DeepInspectionConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrgEc2DeepInspectionConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrgEc2DeepInspectionConfigurationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateOrgEc2DeepInspectionConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configurations for your Amazon Inspector organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOrganizationConfiguration(request);
    }

    @SdkInternalApi
    final UpdateOrganizationConfigurationResult executeUpdateOrganizationConfiguration(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOrganizationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOrganizationConfigurationRequest> request = null;
        Response<UpdateOrganizationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOrganizationConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateOrganizationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Inspector2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOrganizationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOrganizationConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateOrganizationConfigurationResultJsonUnmarshaller());
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
