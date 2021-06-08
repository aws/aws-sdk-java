/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldbsession;

import javax.annotation.Generated;

import com.amazonaws.services.qldbsession.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing QLDB Session asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The transactional data APIs for Amazon QLDB
 * </p>
 * <note>
 * <p>
 * Instead of interacting directly with this API, we recommend using the QLDB driver or the QLDB shell to execute data
 * transactions on a ledger.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are working with an AWS SDK, use the QLDB driver. The driver provides a high-level abstraction layer above
 * this <i>QLDB Session</i> data plane and manages <code>SendCommand</code> API calls for you. For information and a
 * list of supported programming languages, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html">Getting started with the
 * driver</a> in the <i>Amazon QLDB Developer Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are working with the AWS Command Line Interface (AWS CLI), use the QLDB shell. The shell is a command line
 * interface that uses the QLDB driver to interact with a ledger. For information, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html">Accessing Amazon QLDB using the QLDB
 * shell</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonQLDBSessionAsyncClient extends AmazonQLDBSessionClient implements AmazonQLDBSessionAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonQLDBSessionAsyncClientBuilder asyncBuilder() {
        return AmazonQLDBSessionAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on QLDB Session using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonQLDBSessionAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on QLDB Session using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonQLDBSessionAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest request) {

        return sendCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(final SendCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler) {
        final SendCommandRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCommandResult>() {
            @Override
            public SendCommandResult call() throws Exception {
                SendCommandResult result = null;

                try {
                    result = executeSendCommand(finalRequest);
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
