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
package com.amazonaws.services.kinesisvideo;

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
import com.amazonaws.services.kinesisvideo.AmazonKinesisVideoArchivedMediaClientBuilder;

import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.services.kinesisvideo.model.transform.*;

/**
 * Client for accessing Kinesis Video Archived Media. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p/>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonKinesisVideoArchivedMediaClient extends AmazonWebServiceClient implements AmazonKinesisVideoArchivedMedia {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonKinesisVideoArchivedMedia.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kinesisvideo";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientLimitExceededException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotAuthorizedException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.NotAuthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kinesisvideo.model.AmazonKinesisVideoException.class));

    public static AmazonKinesisVideoArchivedMediaClientBuilder builder() {
        return AmazonKinesisVideoArchivedMediaClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Kinesis Video Archived Media using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonKinesisVideoArchivedMediaClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("kinesisvideo.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisvideo/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisvideo/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Gets media for a list of fragments (specified by fragment number) from the archived data in a Kinesis video
     * stream.
     * </p>
     * <note>
     * <p>
     * This operation is only available for the AWS SDK for Java. It is not supported in AWS SDKs for other languages.
     * </p>
     * </note>
     * <p>
     * The following limits apply when using the <code>GetMediaForFragmentList</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMediaForFragmentList</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
     * during a <code>GetMediaForFragmentList</code> session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMediaForFragmentListRequest
     * @return Result of the GetMediaForFragmentList operation returned by the service.
     * @throws ResourceNotFoundException
     *         Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @sample AmazonKinesisVideoArchivedMedia.GetMediaForFragmentList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMediaForFragmentListResult getMediaForFragmentList(GetMediaForFragmentListRequest request) {
        request = beforeClientExecution(request);
        return executeGetMediaForFragmentList(request);
    }

    @SdkInternalApi
    final GetMediaForFragmentListResult executeGetMediaForFragmentList(GetMediaForFragmentListRequest getMediaForFragmentListRequest) {

        ExecutionContext executionContext = createExecutionContext(getMediaForFragmentListRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMediaForFragmentListRequest> request = null;
        Response<GetMediaForFragmentListResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMediaForFragmentListRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMediaForFragmentListRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMediaForFragmentListResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true),
                    new GetMediaForFragmentListResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            response.getAwsResponse().setPayload(new com.amazonaws.util.ServiceClientHolderInputStream(response.getAwsResponse().getPayload(), this));

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <a>Fragment</a> objects from the specified stream and start location within the archived data.
     * </p>
     * 
     * @param listFragmentsRequest
     * @return Result of the ListFragments operation returned by the service.
     * @throws ResourceNotFoundException
     *         Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @sample AmazonKinesisVideoArchivedMedia.ListFragments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFragmentsResult listFragments(ListFragmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListFragments(request);
    }

    @SdkInternalApi
    final ListFragmentsResult executeListFragments(ListFragmentsRequest listFragmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFragmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFragmentsRequest> request = null;
        Response<ListFragmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFragmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFragmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFragmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFragmentsResultJsonUnmarshaller());
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
