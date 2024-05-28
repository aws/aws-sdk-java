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
package com.amazonaws.services.codegurusecurity;

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

import com.amazonaws.services.codegurusecurity.AmazonCodeGuruSecurityClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.codegurusecurity.model.*;

import com.amazonaws.services.codegurusecurity.model.transform.*;

/**
 * Client for accessing Amazon CodeGuru Security. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <note>
 * <p>
 * Amazon CodeGuru Security is in preview release and is subject to change.
 * </p>
 * </note>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Security API operations. CodeGuru Security is a service
 * that uses program analysis and machine learning to detect security policy violations and vulnerabilities, and
 * recommends ways to address these security risks.
 * </p>
 * <p>
 * By proactively detecting and providing recommendations for addressing security risks, CodeGuru Security improves the
 * overall security of your application code. For more information about CodeGuru Security, see the <a
 * href="https://docs.aws.amazon.com/codeguru/latest/security-ug/what-is-codeguru-security.html">Amazon CodeGuru
 * Security User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruSecurityClient extends AmazonWebServiceClient implements AmazonCodeGuruSecurity {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCodeGuruSecurity.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "codeguru-security";

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
                                    com.amazonaws.services.codegurusecurity.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codegurusecurity.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codegurusecurity.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codegurusecurity.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codegurusecurity.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.codegurusecurity.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.codegurusecurity.model.AmazonCodeGuruSecurityException.class));

    public static AmazonCodeGuruSecurityClientBuilder builder() {
        return AmazonCodeGuruSecurityClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CodeGuru Security using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruSecurityClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CodeGuru Security using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruSecurityClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("codeguru-security.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/codegurusecurity/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/codegurusecurity/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Returns a list of all requested findings.
     * </p>
     * 
     * @param batchGetFindingsRequest
     * @return Result of the BatchGetFindings operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.BatchGetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetFindingsResult batchGetFindings(BatchGetFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetFindings(request);
    }

    @SdkInternalApi
    final BatchGetFindingsResult executeBatchGetFindings(BatchGetFindingsRequest batchGetFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetFindingsRequest> request = null;
        Response<BatchGetFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use to create a scan using code uploaded to an S3 bucket.
     * </p>
     * 
     * @param createScanRequest
     * @return Result of the CreateScan operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.CreateScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateScanResult createScan(CreateScanRequest request) {
        request = beforeClientExecution(request);
        return executeCreateScan(request);
    }

    @SdkInternalApi
    final CreateScanResult executeCreateScan(CreateScanRequest createScanRequest) {

        ExecutionContext executionContext = createExecutionContext(createScanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateScanRequest> request = null;
        Response<CreateScanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateScanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createScanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateScan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateScanResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateScanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a pre-signed URL and request headers used to upload a code resource.
     * </p>
     * <p>
     * You can upload your code resource to the URL and add the request headers using any HTTP client.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return Result of the CreateUploadUrl operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateUploadUrlResult createUploadUrl(CreateUploadUrlRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUploadUrl(request);
    }

    @SdkInternalApi
    final CreateUploadUrlResult executeCreateUploadUrl(CreateUploadUrlRequest createUploadUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(createUploadUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUploadUrlRequest> request = null;
        Response<CreateUploadUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUploadUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUploadUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUploadUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUploadUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUploadUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use to get account level configuration.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @return Result of the GetAccountConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAccountConfigurationResult getAccountConfiguration(GetAccountConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountConfiguration(request);
    }

    @SdkInternalApi
    final GetAccountConfigurationResult executeGetAccountConfiguration(GetAccountConfigurationRequest getAccountConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountConfigurationRequest> request = null;
        Response<GetAccountConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getAccountConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAccountConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all findings generated by a particular scan.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetFindings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetFindingsResult getFindings(GetFindingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetFindings(request);
    }

    @SdkInternalApi
    final GetFindingsResult executeGetFindings(GetFindingsRequest getFindingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFindingsRequest> request = null;
        Response<GetFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFindingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFindings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns top level metrics about an account from a specified date, including number of open findings, the
     * categories with most findings, the scans with most open findings, and scans with most open critical findings.
     * </p>
     * 
     * @param getMetricsSummaryRequest
     * @return Result of the GetMetricsSummary operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetMetricsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMetricsSummaryResult getMetricsSummary(GetMetricsSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetMetricsSummary(request);
    }

    @SdkInternalApi
    final GetMetricsSummaryResult executeGetMetricsSummary(GetMetricsSummaryRequest getMetricsSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getMetricsSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMetricsSummaryRequest> request = null;
        Response<GetMetricsSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMetricsSummaryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMetricsSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMetricsSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMetricsSummaryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMetricsSummaryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a scan, including whether or not a scan has completed.
     * </p>
     * 
     * @param getScanRequest
     * @return Result of the GetScan operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.GetScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetScanResult getScan(GetScanRequest request) {
        request = beforeClientExecution(request);
        return executeGetScan(request);
    }

    @SdkInternalApi
    final GetScanResult executeGetScan(GetScanRequest getScanRequest) {

        ExecutionContext executionContext = createExecutionContext(getScanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetScanRequest> request = null;
        Response<GetScanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetScanRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getScanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetScan");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetScanResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetScanResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metrics about all findings in an account within a specified time range.
     * </p>
     * 
     * @param listFindingsMetricsRequest
     * @return Result of the ListFindingsMetrics operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListFindingsMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFindingsMetricsResult listFindingsMetrics(ListFindingsMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeListFindingsMetrics(request);
    }

    @SdkInternalApi
    final ListFindingsMetricsResult executeListFindingsMetrics(ListFindingsMetricsRequest listFindingsMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFindingsMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsMetricsRequest> request = null;
        Response<ListFindingsMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFindingsMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all the standard scans in an account. Does not return express scans.
     * </p>
     * 
     * @param listScansRequest
     * @return Result of the ListScans operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListScans" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListScansResult listScans(ListScansRequest request) {
        request = beforeClientExecution(request);
        return executeListScans(request);
    }

    @SdkInternalApi
    final ListScansResult executeListScans(ListScansRequest listScansRequest) {

        ExecutionContext executionContext = createExecutionContext(listScansRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListScansRequest> request = null;
        Response<ListScansResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListScansRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listScansRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListScans");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListScansResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListScansResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all tags associated with a scan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
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
     * Use to add one or more tags to an existing scan.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
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
     * Use to remove one or more tags from an existing scan.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
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
     * Use to update account-level configuration with an encryption key.
     * </p>
     * 
     * @param updateAccountConfigurationRequest
     * @return Result of the UpdateAccountConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruSecurity.UpdateAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UpdateAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAccountConfigurationResult updateAccountConfiguration(UpdateAccountConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccountConfiguration(request);
    }

    @SdkInternalApi
    final UpdateAccountConfigurationResult executeUpdateAccountConfiguration(UpdateAccountConfigurationRequest updateAccountConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAccountConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAccountConfigurationRequest> request = null;
        Response<UpdateAccountConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAccountConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAccountConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CodeGuru Security");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccountConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAccountConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAccountConfigurationResultJsonUnmarshaller());
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
