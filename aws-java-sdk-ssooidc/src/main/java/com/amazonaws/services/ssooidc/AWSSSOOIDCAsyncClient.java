/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssooidc;

import javax.annotation.Generated;

import com.amazonaws.services.ssooidc.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SSO OIDC asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Single Sign-On (SSO) OpenID Connect (OIDC) is a web service that enables a client (such as AWS CLI or a native
 * application) to register with AWS SSO. The service also enables the client to fetch the user’s access token upon
 * successful authentication and authorization with AWS SSO. This service conforms with the OAuth 2.0 based
 * implementation of the device authorization grant standard (<a
 * href="https://tools.ietf.org/html/rfc8628">https://tools.ietf.org/html/rfc8628</a>).
 * </p>
 * <p>
 * For general information about AWS SSO, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">What is AWS Single Sign-On?</a> in the
 * <i>AWS SSO User Guide</i>.
 * </p>
 * <p>
 * This API reference guide describes the AWS SSO OIDC operations that you can call programatically and includes
 * detailed information on data types and errors.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms such as
 * Java, Ruby, .Net, iOS, and Android. The SDKs provide a convenient way to create programmatic access to AWS SSO and
 * other AWS services. For more information about the AWS SDKs, including how to download and install them, see <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSOOIDCAsyncClient extends AWSSSOOIDCClient implements AWSSSOOIDCAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSSOOIDCAsyncClientBuilder asyncBuilder() {
        return AWSSSOOIDCAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSO OIDC using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSSOOIDCAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest request) {

        return createTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(final CreateTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler) {
        final CreateTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTokenResult>() {
            @Override
            public CreateTokenResult call() throws Exception {
                CreateTokenResult result = null;

                try {
                    result = executeCreateToken(finalRequest);
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
    public java.util.concurrent.Future<RegisterClientResult> registerClientAsync(RegisterClientRequest request) {

        return registerClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterClientResult> registerClientAsync(final RegisterClientRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterClientRequest, RegisterClientResult> asyncHandler) {
        final RegisterClientRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterClientResult>() {
            @Override
            public RegisterClientResult call() throws Exception {
                RegisterClientResult result = null;

                try {
                    result = executeRegisterClient(finalRequest);
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
    public java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(StartDeviceAuthorizationRequest request) {

        return startDeviceAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(final StartDeviceAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResult> asyncHandler) {
        final StartDeviceAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeviceAuthorizationResult>() {
            @Override
            public StartDeviceAuthorizationResult call() throws Exception {
                StartDeviceAuthorizationResult result = null;

                try {
                    result = executeStartDeviceAuthorization(finalRequest);
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
