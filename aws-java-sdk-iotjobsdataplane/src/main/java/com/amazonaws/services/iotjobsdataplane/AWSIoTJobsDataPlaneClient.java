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
package com.amazonaws.services.iotjobsdataplane;

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

import com.amazonaws.services.iotjobsdataplane.AWSIoTJobsDataPlaneClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.iotjobsdataplane.model.*;
import com.amazonaws.services.iotjobsdataplane.model.transform.*;

/**
 * Client for accessing AWS IoT Jobs Data Plane. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * AWS IoT Jobs is a service that allows you to define a set of jobs — remote operations that are sent to and executed
 * on one or more devices connected to AWS IoT. For example, you can define a job that instructs a set of devices to
 * download and install application or firmware updates, reboot, rotate certificates, or perform remote troubleshooting
 * operations.
 * </p>
 * <p>
 * To create a job, you make a job document which is a description of the remote operations to be performed, and you
 * specify a list of targets that should perform the operations. The targets can be individual things, thing groups or
 * both.
 * </p>
 * <p>
 * AWS IoT Jobs sends a message to inform the targets that a job is available. The target starts the execution of the
 * job by downloading the job document, performing the operations it specifies, and reporting its progress to AWS IoT.
 * The Jobs service provides commands to track the progress of a job on a specific target and for all the targets of the
 * job
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTJobsDataPlaneClient extends AmazonWebServiceClient implements AWSIoTJobsDataPlane {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIoTJobsDataPlane.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iot-jobs-data";

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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateTransitionException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.InvalidStateTransitionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TerminalStateException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.TerminalStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.ThrottlingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CertificateValidationException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.CertificateValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.iotjobsdataplane.model.ResourceNotFoundException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.iotjobsdataplane.model.AWSIoTJobsDataPlaneException.class));

    public static AWSIoTJobsDataPlaneClientBuilder builder() {
        return AWSIoTJobsDataPlaneClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Jobs Data Plane using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTJobsDataPlaneClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Jobs Data Plane using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSIoTJobsDataPlaneClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("data.jobs.iot.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/iotjobsdataplane/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/iotjobsdataplane/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets details of a job execution.
     * </p>
     * 
     * @param describeJobExecutionRequest
     * @return Result of the DescribeJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws TerminalStateException
     *         The job is in a terminal state.
     * @sample AWSIoTJobsDataPlane.DescribeJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/DescribeJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeJobExecutionResult describeJobExecution(DescribeJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobExecution(request);
    }

    @SdkInternalApi
    final DescribeJobExecutionResult executeDescribeJobExecution(DescribeJobExecutionRequest describeJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobExecutionRequest> request = null;
        Response<DescribeJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Jobs Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the list of all jobs for a thing that are not in a terminal status.
     * </p>
     * 
     * @param getPendingJobExecutionsRequest
     * @return Result of the GetPendingJobExecutions operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @sample AWSIoTJobsDataPlane.GetPendingJobExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/GetPendingJobExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPendingJobExecutionsResult getPendingJobExecutions(GetPendingJobExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetPendingJobExecutions(request);
    }

    @SdkInternalApi
    final GetPendingJobExecutionsResult executeGetPendingJobExecutions(GetPendingJobExecutionsRequest getPendingJobExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getPendingJobExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPendingJobExecutionsRequest> request = null;
        Response<GetPendingJobExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPendingJobExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPendingJobExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Jobs Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPendingJobExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPendingJobExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPendingJobExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets and starts the next pending (status IN_PROGRESS or QUEUED) job execution for a thing.
     * </p>
     * 
     * @param startNextPendingJobExecutionRequest
     * @return Result of the StartNextPendingJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @sample AWSIoTJobsDataPlane.StartNextPendingJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/StartNextPendingJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartNextPendingJobExecutionResult startNextPendingJobExecution(StartNextPendingJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartNextPendingJobExecution(request);
    }

    @SdkInternalApi
    final StartNextPendingJobExecutionResult executeStartNextPendingJobExecution(StartNextPendingJobExecutionRequest startNextPendingJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startNextPendingJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartNextPendingJobExecutionRequest> request = null;
        Response<StartNextPendingJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartNextPendingJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startNextPendingJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Jobs Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartNextPendingJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartNextPendingJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartNextPendingJobExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of a job execution.
     * </p>
     * 
     * @param updateJobExecutionRequest
     * @return Result of the UpdateJobExecution operation returned by the service.
     * @throws InvalidRequestException
     *         The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution
     *         request contains invalid status details. The message contains details about the error.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws CertificateValidationException
     *         The certificate is invalid.
     * @throws InvalidStateTransitionException
     *         An update attempted to change the job execution to a state that is invalid because of the job execution's
     *         current state (for example, an attempt to change a request in state SUCCESS to state IN_PROGRESS). In
     *         this case, the body of the error message also contains the executionState field.
     * @sample AWSIoTJobsDataPlane.UpdateJobExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/UpdateJobExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateJobExecutionResult updateJobExecution(UpdateJobExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateJobExecution(request);
    }

    @SdkInternalApi
    final UpdateJobExecutionResult executeUpdateJobExecution(UpdateJobExecutionRequest updateJobExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateJobExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateJobExecutionRequest> request = null;
        Response<UpdateJobExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateJobExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateJobExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IoT Jobs Data Plane");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateJobExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateJobExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateJobExecutionResultJsonUnmarshaller());
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
