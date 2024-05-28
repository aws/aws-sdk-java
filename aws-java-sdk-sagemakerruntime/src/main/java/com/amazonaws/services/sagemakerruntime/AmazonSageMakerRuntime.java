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
package com.amazonaws.services.sagemakerruntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemakerruntime.model.*;

/**
 * Interface for accessing Amazon SageMaker Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakerruntime.AbstractAmazonSageMakerRuntime} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon SageMaker runtime API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "runtime.sagemaker";

    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
     * this API to get inferences from the model hosted at the specified endpoint.
     * </p>
     * <p>
     * For an overview of Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
     * headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.
     * </p>
     * <p>
     * Calls to <code>InvokeEndpoint</code> are authenticated by using Amazon Web Services Signature Version 4. For
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <p>
     * A customer's model containers must respond to requests within 60 seconds. The model itself can have a maximum
     * processing time of 60 seconds before responding to invocations. If your model is going to take 50-60 seconds of
     * processing time, the SDK socket timeout should be set to be 70 seconds.
     * </p>
     * <note>
     * <p>
     * Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but
     * Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller.
     * </p>
     * </note>
     * 
     * @param invokeEndpointRequest
     * @return Result of the InvokeEndpoint operation returned by the service.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Try your call again.
     * @throws ValidationErrorException
     *         Inspect your request and try again.
     * @throws ModelErrorException
     *         Model (owned by the customer in the container) returned 4xx or 5xx error code.
     * @throws InternalDependencyException
     *         Your request caused an exception with an internal dependency. Contact customer support.
     * @throws ModelNotReadyException
     *         Either a serverless endpoint variant's resources are still being provisioned, or a multi-model endpoint
     *         is still downloading or loading the target model. Wait and try your request again.
     * @sample AmazonSageMakerRuntime.InvokeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    InvokeEndpointResult invokeEndpoint(InvokeEndpointRequest invokeEndpointRequest);

    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
     * this API to get inferences from the model hosted at the specified endpoint in an asynchronous manner.
     * </p>
     * <p>
     * Inference requests sent to this API are enqueued for asynchronous processing. The processing of the inference
     * request may or may not complete before you receive a response from this API. The response from this API will not
     * contain the result of the inference request but contain information about where you can locate it.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
     * headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.
     * </p>
     * <p>
     * Calls to <code>InvokeEndpointAsync</code> are authenticated by using Amazon Web Services Signature Version 4. For
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating
     * Requests (Amazon Web Services Signature Version 4)</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * 
     * @param invokeEndpointAsyncRequest
     * @return Result of the InvokeEndpointAsync operation returned by the service.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Try your call again.
     * @throws ValidationErrorException
     *         Inspect your request and try again.
     * @sample AmazonSageMakerRuntime.InvokeEndpointAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpointAsync"
     *      target="_top">AWS API Documentation</a>
     */
    InvokeEndpointAsyncResult invokeEndpointAsync(InvokeEndpointAsyncRequest invokeEndpointAsyncRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
