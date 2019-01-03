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
package com.amazonaws.services.mobile;

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

import com.amazonaws.services.mobile.AWSMobileClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mobile.model.*;
import com.amazonaws.services.mobile.model.transform.*;

/**
 * Client for accessing AWS Mobile. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
 * and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
 * those resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMobileClient extends AmazonWebServiceClient implements AWSMobile {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMobile.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "AWSMobileHubService";

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
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.mobile.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.mobile.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountActionRequiredException").withModeledClass(
                                    com.amazonaws.services.mobile.model.AccountActionRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalFailureException").withModeledClass(
                                    com.amazonaws.services.mobile.model.InternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.mobile.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.mobile.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.mobile.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.mobile.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mobile.model.AWSMobileException.class));

    public static AWSMobileClientBuilder builder() {
        return AWSMobileClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Mobile using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMobileClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Mobile using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMobileClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mobile.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mobile/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mobile/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an AWS Mobile Hub project.
     * </p>
     * 
     * @param createProjectRequest
     *        Request structure used to request a project be created.
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @throws LimitExceededException
     *         There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number
     *         of resources in some AWS service. You should create another sub-account using AWS Organizations or remove
     *         some resources and retry your request.
     * @sample AWSMobile.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateProjectResult createProject(CreateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProject(request);
    }

    @SdkInternalApi
    final CreateProjectResult executeCreateProject(CreateProjectRequest createProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(createProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProjectRequest> request = null;
        Response<CreateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delets a project in AWS Mobile Hub.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Request structure used to request a project be deleted.
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteProjectResult deleteProject(DeleteProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProject(request);
    }

    @SdkInternalApi
    final DeleteProjectResult executeDeleteProject(DeleteProjectRequest deleteProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProjectRequest> request = null;
        Response<DeleteProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the bundle details for the requested bundle id.
     * </p>
     * 
     * @param describeBundleRequest
     *        Request structure to request the details of a specific bundle.
     * @return Result of the DescribeBundle operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DescribeBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeBundle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBundleResult describeBundle(DescribeBundleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBundle(request);
    }

    @SdkInternalApi
    final DescribeBundleResult executeDescribeBundle(DescribeBundleRequest describeBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBundleRequest> request = null;
        Response<DescribeBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a project in AWS Mobile Hub.
     * </p>
     * 
     * @param describeProjectRequest
     *        Request structure used to request details about a project.
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeProjectResult describeProject(DescribeProjectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeProject(request);
    }

    @SdkInternalApi
    final DescribeProjectResult executeDescribeProject(DescribeProjectRequest describeProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeProjectRequest> request = null;
        Response<DescribeProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
     * app clients with backend AWS resources.
     * </p>
     * 
     * @param exportBundleRequest
     *        Request structure used to request generation of custom SDK and tool packages required to integrate mobile
     *        web or app clients with backed AWS resources.
     * @return Result of the ExportBundle operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.ExportBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportBundleResult exportBundle(ExportBundleRequest request) {
        request = beforeClientExecution(request);
        return executeExportBundle(request);
    }

    @SdkInternalApi
    final ExportBundleResult executeExportBundle(ExportBundleRequest exportBundleRequest) {

        ExecutionContext executionContext = createExecutionContext(exportBundleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportBundleRequest> request = null;
        Response<ExportBundleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportBundleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportBundleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportBundle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportBundleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportBundleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
     * credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
     * account.
     * </p>
     * 
     * @param exportProjectRequest
     *        Request structure used in requests to export project configuration details.
     * @return Result of the ExportProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @sample AWSMobile.ExportProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportProjectResult exportProject(ExportProjectRequest request) {
        request = beforeClientExecution(request);
        return executeExportProject(request);
    }

    @SdkInternalApi
    final ExportProjectResult executeExportProject(ExportProjectRequest exportProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(exportProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportProjectRequest> request = null;
        Response<ExportProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportProjectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all available bundles.
     * </p>
     * 
     * @param listBundlesRequest
     *        Request structure to request all available bundles.
     * @return Result of the ListBundles operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @sample AWSMobile.ListBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListBundles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListBundlesResult listBundles(ListBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeListBundles(request);
    }

    @SdkInternalApi
    final ListBundlesResult executeListBundles(ListBundlesRequest listBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(listBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBundlesRequest> request = null;
        Response<ListBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBundles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBundlesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists projects in AWS Mobile Hub.
     * </p>
     * 
     * @param listProjectsRequest
     *        Request structure used to request projects list in AWS Mobile Hub.
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @sample AWSMobile.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListProjectsResult listProjects(ListProjectsRequest request) {
        request = beforeClientExecution(request);
        return executeListProjects(request);
    }

    @SdkInternalApi
    final ListProjectsResult executeListProjects(ListProjectsRequest listProjectsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProjectsRequest> request = null;
        Response<ListProjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProjectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProjects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProjectsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProjectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an existing project.
     * </p>
     * 
     * @param updateProjectRequest
     *        Request structure used for requests to update project configuration.
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalFailureException
     *         The service has encountered an unexpected error condition which prevents it from servicing the request.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable. The request should be retried after some time delay.
     * @throws UnauthorizedException
     *         Credentials of the caller are insufficient to authorize the request.
     * @throws TooManyRequestsException
     *         Too many requests have been received for this AWS account in too short a time. The request should be
     *         retried after some time delay.
     * @throws BadRequestException
     *         The request cannot be processed because some parameter is not valid or the project state prevents the
     *         operation from being performed.
     * @throws NotFoundException
     *         No entity can be found with the specified identifier.
     * @throws AccountActionRequiredException
     *         Account Action is required in order to continue the request.
     * @throws LimitExceededException
     *         There are too many AWS Mobile Hub projects in the account or the account has exceeded the maximum number
     *         of resources in some AWS service. You should create another sub-account using AWS Organizations or remove
     *         some resources and retry your request.
     * @sample AWSMobile.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateProjectResult updateProject(UpdateProjectRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProject(request);
    }

    @SdkInternalApi
    final UpdateProjectResult executeUpdateProject(UpdateProjectRequest updateProjectRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProjectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProjectRequest> request = null;
        Response<UpdateProjectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProjectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProjectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Mobile");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProject");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProjectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProjectResultJsonUnmarshaller());
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
