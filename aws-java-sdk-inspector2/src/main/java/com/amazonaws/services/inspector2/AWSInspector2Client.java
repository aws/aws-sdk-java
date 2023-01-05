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
 * within your Amazon EC2 and Amazon ECR environments.
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
     * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
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
     * Creates a filter resource using specified filter criteria.
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
     * Creates a finding report.
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
