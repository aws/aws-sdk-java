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
package com.amazonaws.services.emrserverless;

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

import com.amazonaws.services.emrserverless.AWSEMRServerlessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.emrserverless.model.*;
import com.amazonaws.services.emrserverless.model.transform.*;

/**
 * Client for accessing EMR Serverless. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon EMR Serverless is a new deployment option for Amazon EMR. EMR Serverless provides a serverless runtime
 * environment that simplifies running analytics applications using the latest open source frameworks such as Apache
 * Spark and Apache Hive. With EMR Serverless, you don’t have to configure, optimize, secure, or operate clusters to run
 * applications with these frameworks.
 * </p>
 * <p>
 * The API reference to Amazon EMR Serverless is <code>emr-serverless</code>. The <code>emr-serverless</code> prefix is
 * used in the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR Serverless. For example,
 * <code>aws emr-serverless start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR Serverless. For example,
 * <code>"Action": ["emr-serverless:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR Serverless</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR Serverless service endpoints. For example,
 * <code>emr-serverless.us-east-2.amazonaws.com</code>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSEMRServerlessClient extends AmazonWebServiceClient implements AWSEMRServerless {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSEMRServerless.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "emr-serverless";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrserverless.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrserverless.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrserverless.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrserverless.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrserverless.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.emrserverless.model.AWSEMRServerlessException.class));

    public static AWSEMRServerlessClientBuilder builder() {
        return AWSEMRServerlessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on EMR Serverless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEMRServerlessClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on EMR Serverless using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSEMRServerlessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("emr-serverless.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/emrserverless/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/emrserverless/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a job run.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return Result of the CancelJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelJobRunResult cancelJobRun(CancelJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJobRun(request);
    }

    @SdkInternalApi
    final CancelJobRunResult executeCancelJobRun(CancelJobRunRequest cancelJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRunRequest> request = null;
        Response<CancelJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @sample AWSEMRServerless.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays detailed information about a specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetApplicationResult getApplication(GetApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplication(request);
    }

    @SdkInternalApi
    final GetApplicationResult executeGetApplication(GetApplicationRequest getApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationRequest> request = null;
        Response<GetApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a URL to access the job run dashboard.
     * </p>
     * 
     * @param getDashboardForJobRunRequest
     * @return Result of the GetDashboardForJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetDashboardForJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetDashboardForJobRun"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDashboardForJobRunResult getDashboardForJobRun(GetDashboardForJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetDashboardForJobRun(request);
    }

    @SdkInternalApi
    final GetDashboardForJobRunResult executeGetDashboardForJobRun(GetDashboardForJobRunRequest getDashboardForJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getDashboardForJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDashboardForJobRunRequest> request = null;
        Response<GetDashboardForJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDashboardForJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDashboardForJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDashboardForJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDashboardForJobRunResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetDashboardForJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays detailed information about a job run.
     * </p>
     * 
     * @param getJobRunRequest
     * @return Result of the GetJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.GetJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/GetJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetJobRunResult getJobRun(GetJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeGetJobRun(request);
    }

    @SdkInternalApi
    final GetJobRunResult executeGetJobRun(GetJobRunRequest getJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(getJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetJobRunRequest> request = null;
        Response<GetJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetJobRunResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists applications based on a set of parameters.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationsResult listApplications(ListApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplications(request);
    }

    @SdkInternalApi
    final ListApplicationsResult executeListApplications(ListApplicationsRequest listApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListApplicationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists job runs based on a set of parameters.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobRunsResult listJobRuns(ListJobRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobRuns(request);
    }

    @SdkInternalApi
    final ListJobRunsResult executeListJobRuns(ListJobRunsRequest listJobRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobRunsRequest> request = null;
        Response<ListJobRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
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
     * Starts a specified application and initializes initial capacity if configured.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ServiceQuotaExceededException
     *         The maximum number of resources per account has been reached.
     * @sample AWSEMRServerless.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartApplicationResult startApplication(StartApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStartApplication(request);
    }

    @SdkInternalApi
    final StartApplicationResult executeStartApplication(StartApplicationRequest startApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(startApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartApplicationRequest> request = null;
        Response<StartApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a job run.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @sample AWSEMRServerless.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartJobRun(request);
    }

    @SdkInternalApi
    final StartJobRunResult executeStartJobRun(StartJobRunRequest startJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRunRequest> request = null;
        Response<StartJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be
     * completed or cancelled before stopping an application.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StopApplication" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopApplicationResult stopApplication(StopApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeStopApplication(request);
    }

    @SdkInternalApi
    final StopApplicationResult executeStopApplication(StopApplicationRequest stopApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopApplicationRequest> request = null;
        Response<StopApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopApplicationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
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
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
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
     * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         Request processing failed because of an error or failure with the service.
     * @sample AWSEMRServerless.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR Serverless");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateApplicationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateApplicationResultJsonUnmarshaller());
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
