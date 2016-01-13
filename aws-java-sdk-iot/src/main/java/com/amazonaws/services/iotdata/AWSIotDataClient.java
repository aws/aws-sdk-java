/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.iotdata;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.services.iotdata.model.transform.*;

/**
 * Client for accessing AWS IoT Data Plane. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS IoT (Beta)</fullname>
 * <p>
 * <b>AWS IoT is considered a beta service as defined in the Service Terms</b>
 * </p>
 * <p>
 * AWS IoT-Data enables secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. It implements a broker for applications
 * and things to publish messages over HTTP (Publish) and retrieve, update, and
 * delete thing shadows. A thing shadow is a persistent representation of your
 * things and their state in the AWS cloud.
 * </p>
 */
public class AWSIotDataClient extends AmazonWebServiceClient implements
        AWSIotData {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIotData.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "iotdata";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "data.iot";

    /**
     * List of exception unmarshallers for all AWS IoT Data Plane exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSIotDataClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS IoT Data Plane (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSIotDataClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSIotDataClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS IoT Data Plane (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSIotDataClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS IoT Data Plane (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT Data Plane
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS IoT Data Plane (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSIotDataClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.UnauthorizedException.class,
                        "UnauthorizedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.MethodNotAllowedException.class,
                        "MethodNotAllowedException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iotdata.model.ConflictException.class,
                "ConflictException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.RequestEntityTooLargeException.class,
                        "RequestEntityTooLargeException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.UnsupportedDocumentEncodingException.class,
                        "UnsupportedDocumentEncodingException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iotdata.model.ThrottlingException.class,
                "ThrottlingException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.ServiceUnavailableException.class,
                        "ServiceUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.InternalFailureException.class,
                        "InternalFailureException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iotdata.model.InvalidRequestException.class,
                        "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://data.iot.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/iotdata/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/iotdata/request.handler2s"));
    }

    /**
     * <p>
     * Deletes the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_DeleteThingShadow.html"
     * >DeleteThingShadow</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param deleteThingShadowRequest
     *        The input for the DeleteThingShadow operation.
     * @return Result of the DeleteThingShadow operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.DeleteThingShadow
     */
    @Override
    public DeleteThingShadowResult deleteThingShadow(
            DeleteThingShadowRequest deleteThingShadowRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingShadowRequest> request = null;
        Response<DeleteThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingShadowRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteThingShadowResult> responseHandler = new JsonResponseHandler<DeleteThingShadowResult>(
                    new DeleteThingShadowResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(false);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_GetThingShadow.html"
     * >GetThingShadow</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param getThingShadowRequest
     *        The input for the GetThingShadow operation.
     * @return Result of the GetThingShadow operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.GetThingShadow
     */
    @Override
    public GetThingShadowResult getThingShadow(
            GetThingShadowRequest getThingShadowRequest) {
        ExecutionContext executionContext = createExecutionContext(getThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetThingShadowRequest> request = null;
        Response<GetThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetThingShadowRequestMarshaller().marshall(super
                        .beforeMarshalling(getThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetThingShadowResult> responseHandler = new JsonResponseHandler<GetThingShadowResult>(
                    new GetThingShadowResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(false);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Publishes state information.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/protocols.html#http"
     * >HTTP Protocol</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param publishRequest
     *        The input for the Publish operation.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @sample AWSIotData.Publish
     */
    @Override
    public void publish(PublishRequest publishRequest) {
        ExecutionContext executionContext = createExecutionContext(publishRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PublishRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PublishRequestMarshaller().marshall(super
                        .beforeMarshalling(publishRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the thing shadow for the specified thing.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/API_UpdateThingShadow.html"
     * >UpdateThingShadow</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param updateThingShadowRequest
     *        The input for the UpdateThingShadow operation.
     * @return Result of the UpdateThingShadow operation returned by the
     *         service.
     * @throws ConflictException
     *         The specified version does not match the version of the document.
     * @throws RequestEntityTooLargeException
     *         The payload exceeds the maximum size allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws MethodNotAllowedException
     *         The specified combination of HTTP verb and URI is not supported.
     * @throws UnsupportedDocumentEncodingException
     *         The document encoding is not supported.
     * @sample AWSIotData.UpdateThingShadow
     */
    @Override
    public UpdateThingShadowResult updateThingShadow(
            UpdateThingShadowRequest updateThingShadowRequest) {
        ExecutionContext executionContext = createExecutionContext(updateThingShadowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingShadowRequest> request = null;
        Response<UpdateThingShadowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingShadowRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateThingShadowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateThingShadowResult> responseHandler = new JsonResponseHandler<UpdateThingShadowResult>(
                    new UpdateThingShadowResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(false);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
