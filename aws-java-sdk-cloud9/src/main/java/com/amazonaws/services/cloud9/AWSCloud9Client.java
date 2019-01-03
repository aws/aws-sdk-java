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
package com.amazonaws.services.cloud9;

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

import com.amazonaws.services.cloud9.AWSCloud9ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloud9.model.*;
import com.amazonaws.services.cloud9.model.transform.*;

/**
 * Client for accessing AWS Cloud9. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide">AWS
 * Cloud9 User Guide</a>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then connects from the instance to the environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
 * also terminates the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironmentMembership</code>: Deletes an environment member from an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentMemberships</code>: Gets information about environment members for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironments</code>: Gets information about environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentStatus</code>: Gets status information for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListEnvironments</code>: Gets a list of environment identifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironment</code>: Changes the settings of an existing environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironmentMembership</code>: Changes the settings of an existing environment member for an environment.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloud9Client extends AmazonWebServiceClient implements AWSCloud9 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloud9.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloud9";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.cloud9.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloud9.model.AWSCloud9Exception.class));

    public static AWSCloud9ClientBuilder builder() {
        return AWSCloud9ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Cloud9 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloud9Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Cloud9 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloud9Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloud9.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloud9/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloud9/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
     * and then connects from the instance to the environment.
     * </p>
     * 
     * @param createEnvironmentEC2Request
     * @return Result of the CreateEnvironmentEC2 operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.CreateEnvironmentEC2
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentEC2" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEnvironmentEC2Result createEnvironmentEC2(CreateEnvironmentEC2Request request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentEC2(request);
    }

    @SdkInternalApi
    final CreateEnvironmentEC2Result executeCreateEnvironmentEC2(CreateEnvironmentEC2Request createEnvironmentEC2Request) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentEC2Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentEC2Request> request = null;
        Response<CreateEnvironmentEC2Result> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentEC2RequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEnvironmentEC2Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentEC2");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentEC2Result>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEnvironmentEC2ResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an environment member to an AWS Cloud9 development environment.
     * </p>
     * 
     * @param createEnvironmentMembershipRequest
     * @return Result of the CreateEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.CreateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/CreateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentMembershipResult createEnvironmentMembership(CreateEnvironmentMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironmentMembership(request);
    }

    @SdkInternalApi
    final CreateEnvironmentMembershipResult executeCreateEnvironmentMembership(CreateEnvironmentMembershipRequest createEnvironmentMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentMembershipRequest> request = null;
        Response<CreateEnvironmentMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEnvironmentMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironmentMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEnvironmentMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEnvironmentMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
     * terminates the instance.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironment(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentResult executeDeleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentRequest> request = null;
        Response<DeleteEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an environment member from an AWS Cloud9 development environment.
     * </p>
     * 
     * @param deleteEnvironmentMembershipRequest
     * @return Result of the DeleteEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DeleteEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DeleteEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentMembershipResult deleteEnvironmentMembership(DeleteEnvironmentMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentMembership(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentMembershipResult executeDeleteEnvironmentMembership(DeleteEnvironmentMembershipRequest deleteEnvironmentMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentMembershipRequest> request = null;
        Response<DeleteEnvironmentMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEnvironmentMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEnvironmentMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEnvironmentMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about environment members for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentMembershipsRequest
     * @return Result of the DescribeEnvironmentMemberships operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironmentMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentMembershipsResult describeEnvironmentMemberships(DescribeEnvironmentMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentMemberships(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentMembershipsResult executeDescribeEnvironmentMemberships(DescribeEnvironmentMembershipsRequest describeEnvironmentMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentMembershipsRequest> request = null;
        Response<DescribeEnvironmentMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEnvironmentMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEnvironmentMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEnvironmentMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets status information for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param describeEnvironmentStatusRequest
     * @return Result of the DescribeEnvironmentStatus operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentStatusResult describeEnvironmentStatus(DescribeEnvironmentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentStatus(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentStatusResult executeDescribeEnvironmentStatus(DescribeEnvironmentStatusRequest describeEnvironmentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentStatusRequest> request = null;
        Response<DescribeEnvironmentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEnvironmentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEnvironmentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEnvironmentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS Cloud9 development environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     * @return Result of the DescribeEnvironments operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironments(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentsResult executeDescribeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentsRequest> request = null;
        Response<DescribeEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of AWS Cloud9 development environment identifiers.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListEnvironments(request);
    }

    @SdkInternalApi
    final ListEnvironmentsResult executeListEnvironments(ListEnvironmentsRequest listEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEnvironmentsRequest> request = null;
        Response<ListEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEnvironmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEnvironmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEnvironmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the settings of an existing AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEnvironmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the settings of an existing environment member for an AWS Cloud9 development environment.
     * </p>
     * 
     * @param updateEnvironmentMembershipRequest
     * @return Result of the UpdateEnvironmentMembership operation returned by the service.
     * @throws BadRequestException
     *         The target request is invalid.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws NotFoundException
     *         The target resource cannot be found.
     * @throws ForbiddenException
     *         An access permissions issue occurred.
     * @throws TooManyRequestsException
     *         Too many service requests were made over the given time period.
     * @throws LimitExceededException
     *         A service limit was exceeded.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSCloud9.UpdateEnvironmentMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/UpdateEnvironmentMembership"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentMembershipResult updateEnvironmentMembership(UpdateEnvironmentMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironmentMembership(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentMembershipResult executeUpdateEnvironmentMembership(UpdateEnvironmentMembershipRequest updateEnvironmentMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentMembershipRequest> request = null;
        Response<UpdateEnvironmentMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentMembershipRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateEnvironmentMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Cloud9");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironmentMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEnvironmentMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateEnvironmentMembershipResultJsonUnmarshaller());
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
