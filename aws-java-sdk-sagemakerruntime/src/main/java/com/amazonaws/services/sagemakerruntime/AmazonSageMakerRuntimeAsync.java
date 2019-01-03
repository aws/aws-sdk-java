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
package com.amazonaws.services.sagemakerruntime;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakerruntime.model.*;

/**
 * Interface for accessing Amazon SageMaker Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakerruntime.AbstractAmazonSageMakerRuntimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon SageMaker runtime API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerRuntimeAsync extends AmazonSageMakerRuntime {

    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
     * this API to get inferences from the model hosted at the specified endpoint.
     * </p>
     * <p>
     * For an overview of Amazon SageMaker, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
     * headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.
     * </p>
     * <p>
     * Cals to <code>InvokeEndpoint</code> are authenticated by using AWS Signature Version 4. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
     * (AWS Signature Version 4)</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <note>
     * <p>
     * Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but
     * Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller.
     * </p>
     * </note>
     * 
     * @param invokeEndpointRequest
     * @return A Java Future containing the result of the InvokeEndpoint operation returned by the service.
     * @sample AmazonSageMakerRuntimeAsync.InvokeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeEndpointResult> invokeEndpointAsync(InvokeEndpointRequest invokeEndpointRequest);

    /**
     * <p>
     * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use
     * this API to get inferences from the model hosted at the specified endpoint.
     * </p>
     * <p>
     * For an overview of Amazon SageMaker, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * <p>
     * Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional
     * headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.
     * </p>
     * <p>
     * Cals to <code>InvokeEndpoint</code> are authenticated by using AWS Signature Version 4. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
     * (AWS Signature Version 4)</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * <note>
     * <p>
     * Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but
     * Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller.
     * </p>
     * </note>
     * 
     * @param invokeEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeEndpoint operation returned by the service.
     * @sample AmazonSageMakerRuntimeAsyncHandler.InvokeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeEndpointResult> invokeEndpointAsync(InvokeEndpointRequest invokeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeEndpointRequest, InvokeEndpointResult> asyncHandler);

}
