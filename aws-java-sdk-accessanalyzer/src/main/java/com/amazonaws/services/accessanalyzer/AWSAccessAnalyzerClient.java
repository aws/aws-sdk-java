/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer;

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

import com.amazonaws.services.accessanalyzer.AWSAccessAnalyzerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.services.accessanalyzer.model.transform.*;

/**
 * Client for accessing Access Analyzer. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS IAM Access Analyzer helps identify potential resource-access risks by enabling you to identify any policies that
 * grant access to an external principal. It does this by using logic-based reasoning to analyze resource-based policies
 * in your AWS environment. An external principal can be another AWS account, a root user, an IAM user or role, a
 * federated user, an AWS service, or an anonymous user. This guide describes the AWS IAM Access Analyzer operations
 * that you can call programmatically. For general information about Access Analyzer, see the <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html">AWS IAM Access Analyzer section
 * of the IAM User Guide</a>.
 * </p>
 * <p>
 * To start using Access Analyzer, you first need to create an analyzer.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAccessAnalyzerClient extends AmazonWebServiceClient implements AWSAccessAnalyzer {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAccessAnalyzer.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "access-analyzer";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.accessanalyzer.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.accessanalyzer.model.AWSAccessAnalyzerException.class));

    public static AWSAccessAnalyzerClientBuilder builder() {
        return AWSAccessAnalyzerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Access Analyzer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAccessAnalyzerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Access Analyzer using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAccessAnalyzerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("access-analyzer.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/accessanalyzer/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/accessanalyzer/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an analyzer for your account.
     * </p>
     * 
     * @param createAnalyzerRequest
     *        Creates an analyzer.
     * @return Result of the CreateAnalyzer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CreateAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAnalyzerResult createAnalyzer(CreateAnalyzerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnalyzer(request);
    }

    @SdkInternalApi
    final CreateAnalyzerResult executeCreateAnalyzer(CreateAnalyzerRequest createAnalyzerRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnalyzerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnalyzerRequest> request = null;
        Response<CreateAnalyzerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnalyzerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnalyzerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnalyzer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnalyzerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAnalyzerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an archive rule for the specified analyzer. Archive rules automatically archive findings that meet the
     * criteria you define when you create the rule.
     * </p>
     * 
     * @param createArchiveRuleRequest
     *        Creates an archive rule.
     * @return Result of the CreateArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CreateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateArchiveRuleResult createArchiveRule(CreateArchiveRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateArchiveRule(request);
    }

    @SdkInternalApi
    final CreateArchiveRuleResult executeCreateArchiveRule(CreateArchiveRuleRequest createArchiveRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createArchiveRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateArchiveRuleRequest> request = null;
        Response<CreateArchiveRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateArchiveRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createArchiveRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateArchiveRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateArchiveRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateArchiveRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account in the
     * current or specific Region. All findings that were generated by the analyzer are deleted. You cannot undo this
     * action.
     * </p>
     * 
     * @param deleteAnalyzerRequest
     *        Deletes an analyzer.
     * @return Result of the DeleteAnalyzer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.DeleteAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAnalyzerResult deleteAnalyzer(DeleteAnalyzerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnalyzer(request);
    }

    @SdkInternalApi
    final DeleteAnalyzerResult executeDeleteAnalyzer(DeleteAnalyzerRequest deleteAnalyzerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnalyzerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnalyzerRequest> request = null;
        Response<DeleteAnalyzerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnalyzerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnalyzerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnalyzer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnalyzerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAnalyzerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified archive rule.
     * </p>
     * 
     * @param deleteArchiveRuleRequest
     *        Deletes an archive rule.
     * @return Result of the DeleteArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.DeleteArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteArchiveRuleResult deleteArchiveRule(DeleteArchiveRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteArchiveRule(request);
    }

    @SdkInternalApi
    final DeleteArchiveRuleResult executeDeleteArchiveRule(DeleteArchiveRuleRequest deleteArchiveRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteArchiveRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteArchiveRuleRequest> request = null;
        Response<DeleteArchiveRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteArchiveRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteArchiveRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteArchiveRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteArchiveRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteArchiveRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a resource that was analyzed.
     * </p>
     * 
     * @param getAnalyzedResourceRequest
     *        Retrieves an analyzed resource.
     * @return Result of the GetAnalyzedResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetAnalyzedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzedResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAnalyzedResourceResult getAnalyzedResource(GetAnalyzedResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnalyzedResource(request);
    }

    @SdkInternalApi
    final GetAnalyzedResourceResult executeGetAnalyzedResource(GetAnalyzedResourceRequest getAnalyzedResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnalyzedResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnalyzedResourceRequest> request = null;
        Response<GetAnalyzedResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnalyzedResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnalyzedResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnalyzedResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnalyzedResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnalyzedResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified analyzer.
     * </p>
     * 
     * @param getAnalyzerRequest
     *        Retrieves an analyzer.
     * @return Result of the GetAnalyzer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAnalyzerResult getAnalyzer(GetAnalyzerRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnalyzer(request);
    }

    @SdkInternalApi
    final GetAnalyzerResult executeGetAnalyzer(GetAnalyzerRequest getAnalyzerRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnalyzerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnalyzerRequest> request = null;
        Response<GetAnalyzerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnalyzerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnalyzerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnalyzer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnalyzerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnalyzerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about an archive rule.
     * </p>
     * 
     * @param getArchiveRuleRequest
     *        Retrieves an archive rule.
     * @return Result of the GetArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetArchiveRule" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetArchiveRuleResult getArchiveRule(GetArchiveRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetArchiveRule(request);
    }

    @SdkInternalApi
    final GetArchiveRuleResult executeGetArchiveRule(GetArchiveRuleRequest getArchiveRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getArchiveRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetArchiveRuleRequest> request = null;
        Response<GetArchiveRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetArchiveRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getArchiveRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetArchiveRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetArchiveRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetArchiveRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the specified finding.
     * </p>
     * 
     * @param getFindingRequest
     *        Retrieves a finding.
     * @return Result of the GetFinding operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetFinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFinding" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetFindingResult getFinding(GetFindingRequest request) {
        request = beforeClientExecution(request);
        return executeGetFinding(request);
    }

    @SdkInternalApi
    final GetFindingResult executeGetFinding(GetFindingRequest getFindingRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingRequest> request = null;
        Response<GetFindingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFinding");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
     * </p>
     * 
     * @param listAnalyzedResourcesRequest
     *        Retrieves a list of resources that have been analyzed.
     * @return Result of the ListAnalyzedResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAnalyzedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzedResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnalyzedResourcesResult listAnalyzedResources(ListAnalyzedResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnalyzedResources(request);
    }

    @SdkInternalApi
    final ListAnalyzedResourcesResult executeListAnalyzedResources(ListAnalyzedResourcesRequest listAnalyzedResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnalyzedResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnalyzedResourcesRequest> request = null;
        Response<ListAnalyzedResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnalyzedResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnalyzedResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnalyzedResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnalyzedResourcesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAnalyzedResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of analyzers.
     * </p>
     * 
     * @param listAnalyzersRequest
     *        Retrieves a list of analyzers.
     * @return Result of the ListAnalyzers operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAnalyzers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAnalyzersResult listAnalyzers(ListAnalyzersRequest request) {
        request = beforeClientExecution(request);
        return executeListAnalyzers(request);
    }

    @SdkInternalApi
    final ListAnalyzersResult executeListAnalyzers(ListAnalyzersRequest listAnalyzersRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnalyzersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnalyzersRequest> request = null;
        Response<ListAnalyzersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnalyzersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnalyzersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnalyzers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnalyzersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAnalyzersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param listArchiveRulesRequest
     *        Retrieves a list of archive rules created for the specified analyzer.
     * @return Result of the ListArchiveRules operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListArchiveRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListArchiveRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListArchiveRulesResult listArchiveRules(ListArchiveRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListArchiveRules(request);
    }

    @SdkInternalApi
    final ListArchiveRulesResult executeListArchiveRules(ListArchiveRulesRequest listArchiveRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listArchiveRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListArchiveRulesRequest> request = null;
        Response<ListArchiveRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListArchiveRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listArchiveRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListArchiveRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListArchiveRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListArchiveRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of findings generated by the specified analyzer.
     * </p>
     * 
     * @param listFindingsRequest
     *        Retrieves a list of findings generated by the specified analyzer.
     * @return Result of the ListFindings operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListFindings" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
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
     * Retrieves a list of tags applied to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Retrieves a list of tags applied to the specified resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
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
     * Immediately starts a scan of the policies applied to the specified resource.
     * </p>
     * 
     * @param startResourceScanRequest
     *        Starts a scan of the policies applied to the specified resource.
     * @return Result of the StartResourceScan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.StartResourceScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StartResourceScan"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartResourceScanResult startResourceScan(StartResourceScanRequest request) {
        request = beforeClientExecution(request);
        return executeStartResourceScan(request);
    }

    @SdkInternalApi
    final StartResourceScanResult executeStartResourceScan(StartResourceScanRequest startResourceScanRequest) {

        ExecutionContext executionContext = createExecutionContext(startResourceScanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartResourceScanRequest> request = null;
        Response<StartResourceScanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartResourceScanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startResourceScanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartResourceScan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartResourceScanResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartResourceScanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds a tag to the specified resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
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
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from the specified resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
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
     * Updates the criteria and values for the specified archive rule.
     * </p>
     * 
     * @param updateArchiveRuleRequest
     *        Updates the specified archive rule.
     * @return Result of the UpdateArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UpdateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateArchiveRuleResult updateArchiveRule(UpdateArchiveRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateArchiveRule(request);
    }

    @SdkInternalApi
    final UpdateArchiveRuleResult executeUpdateArchiveRule(UpdateArchiveRuleRequest updateArchiveRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateArchiveRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateArchiveRuleRequest> request = null;
        Response<UpdateArchiveRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateArchiveRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateArchiveRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateArchiveRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateArchiveRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateArchiveRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status for the specified findings.
     * </p>
     * 
     * @param updateFindingsRequest
     *        Updates findings with the new values provided in the request.
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateFindings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateFindingsResult updateFindings(UpdateFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFindings(request);
    }

    @SdkInternalApi
    final UpdateFindingsResult executeUpdateFindings(UpdateFindingsRequest updateFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFindingsRequest> request = null;
        Response<UpdateFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AccessAnalyzer");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFindingsResultJsonUnmarshaller());
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
