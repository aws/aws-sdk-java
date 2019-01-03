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
package com.amazonaws.services.comprehendmedical;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
 * in your documents.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComprehendMedicalAsyncClient extends AWSComprehendMedicalClient implements AWSComprehendMedicalAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSComprehendMedicalAsyncClientBuilder asyncBuilder() {
        return AWSComprehendMedicalAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ComprehendMedical using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSComprehendMedicalAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(DetectEntitiesRequest request) {

        return detectEntitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectEntitiesResult> detectEntitiesAsync(final DetectEntitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectEntitiesRequest, DetectEntitiesResult> asyncHandler) {
        final DetectEntitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectEntitiesResult>() {
            @Override
            public DetectEntitiesResult call() throws Exception {
                DetectEntitiesResult result = null;

                try {
                    result = executeDetectEntities(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(DetectPHIRequest request) {

        return detectPHIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DetectPHIResult> detectPHIAsync(final DetectPHIRequest request,
            final com.amazonaws.handlers.AsyncHandler<DetectPHIRequest, DetectPHIResult> asyncHandler) {
        final DetectPHIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DetectPHIResult>() {
            @Override
            public DetectPHIResult call() throws Exception {
                DetectPHIResult result = null;

                try {
                    result = executeDetectPHI(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
