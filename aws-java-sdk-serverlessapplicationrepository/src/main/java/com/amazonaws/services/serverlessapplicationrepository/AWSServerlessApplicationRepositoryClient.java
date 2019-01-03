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
package com.amazonaws.services.serverlessapplicationrepository;

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

import com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.services.serverlessapplicationrepository.model.transform.*;

/**
 * Client for accessing AWSServerlessApplicationRepository. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * The AWS Serverless Application Repository makes it easy for developers and enterprises to quickly find and deploy
 * serverless applications in the AWS Cloud. For more information about serverless applications, see Serverless
 * Computing and Applications on the AWS website.
 * </p>
 * <p>
 * The AWS Serverless Application Repository is deeply integrated with the AWS Lambda console, so that developers of all
 * levels can get started with serverless computing without needing to learn anything new. You can use category keywords
 * to browse for applications such as web and mobile backends, data processing applications, or chatbots. You can also
 * search for applications by name, publisher, or event source. To use an application, you simply choose it, configure
 * any required fields, and deploy it with a few clicks.
 * </p>
 * <p>
 * You can also easily publish applications, sharing them publicly with the community at large, or privately within your
 * team or across your organization. To publish a serverless application (or app), you can use the AWS Management
 * Console, AWS Command Line Interface (AWS CLI), or AWS SDKs to upload the code. Along with the code, you upload a
 * simple manifest file, also known as the AWS Serverless Application Model (AWS SAM) template. For more information
 * about AWS SAM, see AWS Serverless Application Model (AWS SAM) on the AWS Labs GitHub repository.
 * </p>
 * <p>
 * The AWS Serverless Application Repository Developer Guide contains more information about the two developer
 * experiences available:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Consuming Applications – Browse for applications and view information about them, including source code and readme
 * files. Also install, configure, and deploy applications of your choosing.
 * </p>
 * <p>
 * Publishing Applications – Configure and upload applications to make them available to other developers, and publish
 * new versions of applications.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServerlessApplicationRepositoryClient extends AmazonWebServiceClient implements AWSServerlessApplicationRepository {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSServerlessApplicationRepository.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "serverlessrepo";

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
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.serverlessapplicationrepository.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(
                            com.amazonaws.services.serverlessapplicationrepository.model.AWSServerlessApplicationRepositoryException.class));

    public static AWSServerlessApplicationRepositoryClientBuilder builder() {
        return AWSServerlessApplicationRepositoryClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWSServerlessApplicationRepository using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServerlessApplicationRepositoryClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWSServerlessApplicationRepository using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSServerlessApplicationRepositoryClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("serverlessrepo.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/serverlessapplicationrepository/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/serverlessapplicationrepository/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplication"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
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
     * Creates an application version.
     * </p>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplicationVersion(request);
    }

    @SdkInternalApi
    final CreateApplicationVersionResult executeCreateApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationVersionRequest> request = null;
        Response<CreateApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateApplicationVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateApplicationVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS CloudFormation change set for the given application.
     * </p>
     * 
     * @param createCloudFormationChangeSetRequest
     * @return Result of the CreateCloudFormationChangeSet operation returned by the service.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateCloudFormationChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCloudFormationChangeSetResult createCloudFormationChangeSet(CreateCloudFormationChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCloudFormationChangeSet(request);
    }

    @SdkInternalApi
    final CreateCloudFormationChangeSetResult executeCreateCloudFormationChangeSet(CreateCloudFormationChangeSetRequest createCloudFormationChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createCloudFormationChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFormationChangeSetRequest> request = null;
        Response<CreateCloudFormationChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCloudFormationChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCloudFormationChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCloudFormationChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCloudFormationChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCloudFormationChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS CloudFormation template.
     * </p>
     * 
     * @param createCloudFormationTemplateRequest
     * @return Result of the CreateCloudFormationTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.CreateCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCloudFormationTemplateResult createCloudFormationTemplate(CreateCloudFormationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCloudFormationTemplate(request);
    }

    @SdkInternalApi
    final CreateCloudFormationTemplateResult executeCreateCloudFormationTemplate(CreateCloudFormationTemplateRequest createCloudFormationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createCloudFormationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFormationTemplateRequest> request = null;
        Response<CreateCloudFormationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCloudFormationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCloudFormationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCloudFormationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCloudFormationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCloudFormationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AWSServerlessApplicationRepository.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/DeleteApplication"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
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
     * Gets the specified application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplication" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
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
     * Retrieves the policy for the application.
     * </p>
     * 
     * @param getApplicationPolicyRequest
     * @return Result of the GetApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApplicationPolicyResult getApplicationPolicy(GetApplicationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetApplicationPolicy(request);
    }

    @SdkInternalApi
    final GetApplicationPolicyResult executeGetApplicationPolicy(GetApplicationPolicyRequest getApplicationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getApplicationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetApplicationPolicyRequest> request = null;
        Response<GetApplicationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetApplicationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getApplicationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetApplicationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetApplicationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetApplicationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the specified AWS CloudFormation template.
     * </p>
     * 
     * @param getCloudFormationTemplateRequest
     * @return Result of the GetCloudFormationTemplate operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.GetCloudFormationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/GetCloudFormationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCloudFormationTemplateResult getCloudFormationTemplate(GetCloudFormationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCloudFormationTemplate(request);
    }

    @SdkInternalApi
    final GetCloudFormationTemplateResult executeGetCloudFormationTemplate(GetCloudFormationTemplateRequest getCloudFormationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCloudFormationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFormationTemplateRequest> request = null;
        Response<GetCloudFormationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCloudFormationTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCloudFormationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCloudFormationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCloudFormationTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCloudFormationTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the list of applications nested in the containing application.
     * </p>
     * 
     * @param listApplicationDependenciesRequest
     * @return Result of the ListApplicationDependencies operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplicationDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationDependenciesResult listApplicationDependencies(ListApplicationDependenciesRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationDependencies(request);
    }

    @SdkInternalApi
    final ListApplicationDependenciesResult executeListApplicationDependencies(ListApplicationDependenciesRequest listApplicationDependenciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationDependenciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationDependenciesRequest> request = null;
        Response<ListApplicationDependenciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationDependenciesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationDependenciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationDependencies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationDependenciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationDependenciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists versions for the specified application.
     * </p>
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListApplicationVersionsResult listApplicationVersions(ListApplicationVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListApplicationVersions(request);
    }

    @SdkInternalApi
    final ListApplicationVersionsResult executeListApplicationVersions(ListApplicationVersionsRequest listApplicationVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationVersionsRequest> request = null;
        Response<ListApplicationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listApplicationVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListApplicationVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListApplicationVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListApplicationVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists applications owned by the requester.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ListApplications"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
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
     * Sets the permission policy for an application. For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a> .
     * </p>
     * 
     * @param putApplicationPolicyRequest
     * @return Result of the PutApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @sample AWSServerlessApplicationRepository.PutApplicationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/PutApplicationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutApplicationPolicyResult putApplicationPolicy(PutApplicationPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutApplicationPolicy(request);
    }

    @SdkInternalApi
    final PutApplicationPolicyResult executePutApplicationPolicy(PutApplicationPolicyRequest putApplicationPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putApplicationPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutApplicationPolicyRequest> request = null;
        Response<PutApplicationPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutApplicationPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putApplicationPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutApplicationPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutApplicationPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutApplicationPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws BadRequestException
     *         One of the parameters in the request is invalid.
     * @throws InternalServerErrorException
     *         The AWS Serverless Application Repository service encountered an internal error.
     * @throws ForbiddenException
     *         The client is not authenticated.
     * @throws NotFoundException
     *         The resource (for example, an access policy statement) specified in the request doesn't exist.
     * @throws TooManyRequestsException
     *         The client is sending more than the allowed number of requests per unit of time.
     * @throws ConflictException
     *         The resource already exists.
     * @sample AWSServerlessApplicationRepository.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/UpdateApplication"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ServerlessApplicationRepository");
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

}
