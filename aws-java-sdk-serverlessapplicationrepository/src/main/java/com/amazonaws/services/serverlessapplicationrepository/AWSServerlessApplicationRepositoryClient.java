/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.serverlessapplicationrepository.AWSServerlessApplicationRepositoryClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.services.serverlessapplicationrepository.model.transform.*;

/**
 * Client for accessing AWSServerlessApplicationRepository. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * AWS Serverless Repository
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Creates an application, optionally including an AWS SAM file to create the first application version in the same
     * call.
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @throws ForbiddenException
     *         403 response
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
     * Creates an application version.
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @throws ForbiddenException
     *         403 response
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
     * Creates an AWS CloudFormation ChangeSet for the given application.
     * 
     * @param createCloudFormationChangeSetRequest
     *        Create application ChangeSet request
     * @return Result of the CreateCloudFormationChangeSet operation returned by the service.
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Gets the specified application.
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Gets the policy for the specified application.
     * 
     * @param getApplicationPolicyRequest
     * @return Result of the GetApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Lists versions for the specified application.
     * 
     * @param listApplicationVersionsRequest
     * @return Result of the ListApplicationVersions operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Lists applications owned by the requester.
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Puts the policy for the specified application.
     * 
     * @param putApplicationPolicyRequest
     *        Put policy request
     * @return Result of the PutApplicationPolicy operation returned by the service.
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
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
     * Updates the specified application.
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @throws ForbiddenException
     *         403 response
     * @throws NotFoundException
     *         404 response
     * @throws TooManyRequestsException
     *         429 response
     * @throws ConflictException
     *         409 response
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
