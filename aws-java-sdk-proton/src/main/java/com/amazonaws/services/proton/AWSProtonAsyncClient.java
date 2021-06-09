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
package com.amazonaws.services.proton;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Proton asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This is the AWS Proton Service API Reference. It provides descriptions, syntax and usage examples for each of the <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Operations.html">actions</a> and <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Types.html">data types</a> for the AWS Proton
 * service.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response.
 * </p>
 * <p>
 * Alternatively, you can use the AWS CLI to access an API. For more information, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS Command Line Interface User
 * Guide</a>.
 * </p>
 * <p>
 * The AWS Proton service is a two-pronged automation framework. Administrators create service templates to provide
 * standardized infrastructure and deployment tooling for serverless and container based applications. Developers, in
 * turn, select from the available service templates to automate their application or service deployments.
 * </p>
 * <p>
 * Because administrators define the infrastructure and tooling that AWS Proton deploys and manages, they need
 * permissions to use all of the listed API operations.
 * </p>
 * <p>
 * When developers select a specific infrastructure and tooling set, AWS Proton deploys their applications. To monitor
 * their applications that are running on AWS Proton, developers need permissions to the service <i>create</i>,
 * <i>list</i>, <i>update</i> and <i>delete</i> API operations and the service instance <i>list</i> and <i>update</i>
 * API operations.
 * </p>
 * <p>
 * To learn more about AWS Proton administration, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/adminguide/Welcome.html">AWS Proton Administration Guide</a>.
 * </p>
 * <p>
 * To learn more about deploying serverless and containerized applications on AWS Proton, see the <a
 * href="https://docs.aws.amazon.com/proton/latest/userguide/Welcome.html">AWS Proton User Guide</a>.
 * </p>
 * <p>
 * <b>Ensuring Idempotency</b>
 * </p>
 * <p>
 * When you make a mutating API request, the request typically returns a result before the asynchronous workflows of the
 * operation are complete. Operations might also time out or encounter other server issues before they're complete, even
 * if the request already returned a result. This might make it difficult to determine whether the request succeeded.
 * Moreover, you might need to retry the request multiple times to ensure that the operation completes successfully.
 * However, if the original request and the subsequent retries are successful, the operation occurs multiple times. This
 * means that you might create more resources than you intended.
 * </p>
 * <p>
 * <i>Idempotency</i> ensures that an API request action completes no more than one time. With an idempotent request, if
 * the original request action completes successfully, any subsequent retries complete successfully without performing
 * any further actions. However, the result might contain updated information, such as the current creation status.
 * </p>
 * <p>
 * The following lists of APIs are grouped according to methods that ensure idempotency.
 * </p>
 * <p>
 * <b>Idempotent create APIs with a client token</b>
 * </p>
 * <p>
 * The API actions in this list support idempotency with the use of a <i>client token</i>. The corresponding AWS CLI
 * commands also support idempotency using a client token. A client token is a unique, case-sensitive string of up to 64
 * ASCII characters. To make an idempotent API request using one of these actions, specify a client token in the
 * request. We recommend that you <i>don't</i> reuse the same client token for other API requests. If you don’t provide
 * a client token for these APIs, a default client token is automatically provided by SDKs.
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request using the same client token and the same parameters, the retry succeeds without performing
 * any further actions other than returning the original resource detail data in the response.
 * </p>
 * <p>
 * If you retry the request using the same client token, but one or more of the parameters are different, the retry
 * throws a <code>ValidationException</code> with an <code>IdempotentParameterMismatch</code> error.
 * </p>
 * <p>
 * Client tokens expire eight hours after a request is made. If you retry the request with the expired token, a new
 * resource is created.
 * </p>
 * <p>
 * If the original resource is deleted and you retry the request, a new resource is created.
 * </p>
 * <p>
 * Idempotent create APIs with a client token:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateEnvironmentTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateServiceTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateEnvironmentAccountConnection
 * </p>
 * </li>
 * </ul>
 * 
 * <pre>
 * <code> &lt;p&gt; &lt;b&gt;Idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;When you retry the request with an API from this group and the resource was deleted, its metadata is returned in the response.&lt;/p&gt; &lt;p&gt;If you retry and the resource doesn't exist, the response is empty.&lt;/p&gt; &lt;p&gt;In both cases, the retry succeeds.&lt;/p&gt; &lt;p&gt;Idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplate&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteServiceTemplateVersion&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironmentAccountConnection&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Asynchronous idempotent delete APIs&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Given a request action that has succeeded:&lt;/p&gt; &lt;p&gt;If you retry the request with an API from this group, if the original request delete operation status is &lt;code&gt;DELETE_IN_PROGRESS&lt;/code&gt;, the retry returns the resource detail data in the response without performing any further actions.&lt;/p&gt; &lt;p&gt;If the original request delete operation is complete, a retry returns an empty response.&lt;/p&gt; &lt;p&gt;Asynchronous idempotent delete APIs:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;DeleteEnvironment&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;DeleteService&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
 * </pre>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSProtonAsyncClient extends AWSProtonClient implements AWSProtonAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSProtonAsyncClientBuilder asyncBuilder() {
        return AWSProtonAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Proton using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSProtonAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Proton using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSProtonAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptEnvironmentAccountConnectionResult> acceptEnvironmentAccountConnectionAsync(
            AcceptEnvironmentAccountConnectionRequest request) {

        return acceptEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptEnvironmentAccountConnectionResult> acceptEnvironmentAccountConnectionAsync(
            final AcceptEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptEnvironmentAccountConnectionRequest, AcceptEnvironmentAccountConnectionResult> asyncHandler) {
        final AcceptEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptEnvironmentAccountConnectionResult>() {
            @Override
            public AcceptEnvironmentAccountConnectionResult call() throws Exception {
                AcceptEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeAcceptEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<CancelEnvironmentDeploymentResult> cancelEnvironmentDeploymentAsync(CancelEnvironmentDeploymentRequest request) {

        return cancelEnvironmentDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelEnvironmentDeploymentResult> cancelEnvironmentDeploymentAsync(final CancelEnvironmentDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelEnvironmentDeploymentRequest, CancelEnvironmentDeploymentResult> asyncHandler) {
        final CancelEnvironmentDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelEnvironmentDeploymentResult>() {
            @Override
            public CancelEnvironmentDeploymentResult call() throws Exception {
                CancelEnvironmentDeploymentResult result = null;

                try {
                    result = executeCancelEnvironmentDeployment(finalRequest);
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
    public java.util.concurrent.Future<CancelServiceInstanceDeploymentResult> cancelServiceInstanceDeploymentAsync(
            CancelServiceInstanceDeploymentRequest request) {

        return cancelServiceInstanceDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelServiceInstanceDeploymentResult> cancelServiceInstanceDeploymentAsync(
            final CancelServiceInstanceDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelServiceInstanceDeploymentRequest, CancelServiceInstanceDeploymentResult> asyncHandler) {
        final CancelServiceInstanceDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelServiceInstanceDeploymentResult>() {
            @Override
            public CancelServiceInstanceDeploymentResult call() throws Exception {
                CancelServiceInstanceDeploymentResult result = null;

                try {
                    result = executeCancelServiceInstanceDeployment(finalRequest);
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
    public java.util.concurrent.Future<CancelServicePipelineDeploymentResult> cancelServicePipelineDeploymentAsync(
            CancelServicePipelineDeploymentRequest request) {

        return cancelServicePipelineDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelServicePipelineDeploymentResult> cancelServicePipelineDeploymentAsync(
            final CancelServicePipelineDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelServicePipelineDeploymentRequest, CancelServicePipelineDeploymentResult> asyncHandler) {
        final CancelServicePipelineDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelServicePipelineDeploymentResult>() {
            @Override
            public CancelServicePipelineDeploymentResult call() throws Exception {
                CancelServicePipelineDeploymentResult result = null;

                try {
                    result = executeCancelServicePipelineDeployment(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentAccountConnectionResult> createEnvironmentAccountConnectionAsync(
            CreateEnvironmentAccountConnectionRequest request) {

        return createEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentAccountConnectionResult> createEnvironmentAccountConnectionAsync(
            final CreateEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentAccountConnectionRequest, CreateEnvironmentAccountConnectionResult> asyncHandler) {
        final CreateEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentAccountConnectionResult>() {
            @Override
            public CreateEnvironmentAccountConnectionResult call() throws Exception {
                CreateEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeCreateEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentTemplateResult> createEnvironmentTemplateAsync(CreateEnvironmentTemplateRequest request) {

        return createEnvironmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentTemplateResult> createEnvironmentTemplateAsync(final CreateEnvironmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentTemplateRequest, CreateEnvironmentTemplateResult> asyncHandler) {
        final CreateEnvironmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentTemplateResult>() {
            @Override
            public CreateEnvironmentTemplateResult call() throws Exception {
                CreateEnvironmentTemplateResult result = null;

                try {
                    result = executeCreateEnvironmentTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentTemplateVersionResult> createEnvironmentTemplateVersionAsync(
            CreateEnvironmentTemplateVersionRequest request) {

        return createEnvironmentTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentTemplateVersionResult> createEnvironmentTemplateVersionAsync(
            final CreateEnvironmentTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentTemplateVersionRequest, CreateEnvironmentTemplateVersionResult> asyncHandler) {
        final CreateEnvironmentTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentTemplateVersionResult>() {
            @Override
            public CreateEnvironmentTemplateVersionResult call() throws Exception {
                CreateEnvironmentTemplateVersionResult result = null;

                try {
                    result = executeCreateEnvironmentTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest request) {

        return createServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceResult> createServiceAsync(final CreateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler) {
        final CreateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceResult>() {
            @Override
            public CreateServiceResult call() throws Exception {
                CreateServiceResult result = null;

                try {
                    result = executeCreateService(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceTemplateResult> createServiceTemplateAsync(CreateServiceTemplateRequest request) {

        return createServiceTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceTemplateResult> createServiceTemplateAsync(final CreateServiceTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceTemplateRequest, CreateServiceTemplateResult> asyncHandler) {
        final CreateServiceTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceTemplateResult>() {
            @Override
            public CreateServiceTemplateResult call() throws Exception {
                CreateServiceTemplateResult result = null;

                try {
                    result = executeCreateServiceTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateServiceTemplateVersionResult> createServiceTemplateVersionAsync(CreateServiceTemplateVersionRequest request) {

        return createServiceTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServiceTemplateVersionResult> createServiceTemplateVersionAsync(final CreateServiceTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateServiceTemplateVersionRequest, CreateServiceTemplateVersionResult> asyncHandler) {
        final CreateServiceTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateServiceTemplateVersionResult>() {
            @Override
            public CreateServiceTemplateVersionResult call() throws Exception {
                CreateServiceTemplateVersionResult result = null;

                try {
                    result = executeCreateServiceTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentAccountConnectionResult> deleteEnvironmentAccountConnectionAsync(
            DeleteEnvironmentAccountConnectionRequest request) {

        return deleteEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentAccountConnectionResult> deleteEnvironmentAccountConnectionAsync(
            final DeleteEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentAccountConnectionRequest, DeleteEnvironmentAccountConnectionResult> asyncHandler) {
        final DeleteEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentAccountConnectionResult>() {
            @Override
            public DeleteEnvironmentAccountConnectionResult call() throws Exception {
                DeleteEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeDeleteEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentTemplateResult> deleteEnvironmentTemplateAsync(DeleteEnvironmentTemplateRequest request) {

        return deleteEnvironmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentTemplateResult> deleteEnvironmentTemplateAsync(final DeleteEnvironmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentTemplateRequest, DeleteEnvironmentTemplateResult> asyncHandler) {
        final DeleteEnvironmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentTemplateResult>() {
            @Override
            public DeleteEnvironmentTemplateResult call() throws Exception {
                DeleteEnvironmentTemplateResult result = null;

                try {
                    result = executeDeleteEnvironmentTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentTemplateVersionResult> deleteEnvironmentTemplateVersionAsync(
            DeleteEnvironmentTemplateVersionRequest request) {

        return deleteEnvironmentTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentTemplateVersionResult> deleteEnvironmentTemplateVersionAsync(
            final DeleteEnvironmentTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentTemplateVersionRequest, DeleteEnvironmentTemplateVersionResult> asyncHandler) {
        final DeleteEnvironmentTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentTemplateVersionResult>() {
            @Override
            public DeleteEnvironmentTemplateVersionResult call() throws Exception {
                DeleteEnvironmentTemplateVersionResult result = null;

                try {
                    result = executeDeleteEnvironmentTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest request) {

        return deleteServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(final DeleteServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler) {
        final DeleteServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceResult>() {
            @Override
            public DeleteServiceResult call() throws Exception {
                DeleteServiceResult result = null;

                try {
                    result = executeDeleteService(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceTemplateResult> deleteServiceTemplateAsync(DeleteServiceTemplateRequest request) {

        return deleteServiceTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceTemplateResult> deleteServiceTemplateAsync(final DeleteServiceTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceTemplateRequest, DeleteServiceTemplateResult> asyncHandler) {
        final DeleteServiceTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceTemplateResult>() {
            @Override
            public DeleteServiceTemplateResult call() throws Exception {
                DeleteServiceTemplateResult result = null;

                try {
                    result = executeDeleteServiceTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteServiceTemplateVersionResult> deleteServiceTemplateVersionAsync(DeleteServiceTemplateVersionRequest request) {

        return deleteServiceTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServiceTemplateVersionResult> deleteServiceTemplateVersionAsync(final DeleteServiceTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteServiceTemplateVersionRequest, DeleteServiceTemplateVersionResult> asyncHandler) {
        final DeleteServiceTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteServiceTemplateVersionResult>() {
            @Override
            public DeleteServiceTemplateVersionResult call() throws Exception {
                DeleteServiceTemplateVersionResult result = null;

                try {
                    result = executeDeleteServiceTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(final GetEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {
        final GetEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentResult>() {
            @Override
            public GetEnvironmentResult call() throws Exception {
                GetEnvironmentResult result = null;

                try {
                    result = executeGetEnvironment(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentAccountConnectionResult> getEnvironmentAccountConnectionAsync(
            GetEnvironmentAccountConnectionRequest request) {

        return getEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentAccountConnectionResult> getEnvironmentAccountConnectionAsync(
            final GetEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentAccountConnectionRequest, GetEnvironmentAccountConnectionResult> asyncHandler) {
        final GetEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentAccountConnectionResult>() {
            @Override
            public GetEnvironmentAccountConnectionResult call() throws Exception {
                GetEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeGetEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentTemplateResult> getEnvironmentTemplateAsync(GetEnvironmentTemplateRequest request) {

        return getEnvironmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentTemplateResult> getEnvironmentTemplateAsync(final GetEnvironmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentTemplateRequest, GetEnvironmentTemplateResult> asyncHandler) {
        final GetEnvironmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentTemplateResult>() {
            @Override
            public GetEnvironmentTemplateResult call() throws Exception {
                GetEnvironmentTemplateResult result = null;

                try {
                    result = executeGetEnvironmentTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetEnvironmentTemplateVersionResult> getEnvironmentTemplateVersionAsync(GetEnvironmentTemplateVersionRequest request) {

        return getEnvironmentTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentTemplateVersionResult> getEnvironmentTemplateVersionAsync(
            final GetEnvironmentTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentTemplateVersionRequest, GetEnvironmentTemplateVersionResult> asyncHandler) {
        final GetEnvironmentTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentTemplateVersionResult>() {
            @Override
            public GetEnvironmentTemplateVersionResult call() throws Exception {
                GetEnvironmentTemplateVersionResult result = null;

                try {
                    result = executeGetEnvironmentTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest request) {

        return getServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceResult> getServiceAsync(final GetServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler) {
        final GetServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceResult>() {
            @Override
            public GetServiceResult call() throws Exception {
                GetServiceResult result = null;

                try {
                    result = executeGetService(finalRequest);
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
    public java.util.concurrent.Future<GetServiceInstanceResult> getServiceInstanceAsync(GetServiceInstanceRequest request) {

        return getServiceInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceInstanceResult> getServiceInstanceAsync(final GetServiceInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceInstanceRequest, GetServiceInstanceResult> asyncHandler) {
        final GetServiceInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceInstanceResult>() {
            @Override
            public GetServiceInstanceResult call() throws Exception {
                GetServiceInstanceResult result = null;

                try {
                    result = executeGetServiceInstance(finalRequest);
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
    public java.util.concurrent.Future<GetServiceTemplateResult> getServiceTemplateAsync(GetServiceTemplateRequest request) {

        return getServiceTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceTemplateResult> getServiceTemplateAsync(final GetServiceTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceTemplateRequest, GetServiceTemplateResult> asyncHandler) {
        final GetServiceTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceTemplateResult>() {
            @Override
            public GetServiceTemplateResult call() throws Exception {
                GetServiceTemplateResult result = null;

                try {
                    result = executeGetServiceTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetServiceTemplateVersionResult> getServiceTemplateVersionAsync(GetServiceTemplateVersionRequest request) {

        return getServiceTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServiceTemplateVersionResult> getServiceTemplateVersionAsync(final GetServiceTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServiceTemplateVersionRequest, GetServiceTemplateVersionResult> asyncHandler) {
        final GetServiceTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServiceTemplateVersionResult>() {
            @Override
            public GetServiceTemplateVersionResult call() throws Exception {
                GetServiceTemplateVersionResult result = null;

                try {
                    result = executeGetServiceTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentAccountConnectionsResult> listEnvironmentAccountConnectionsAsync(
            ListEnvironmentAccountConnectionsRequest request) {

        return listEnvironmentAccountConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentAccountConnectionsResult> listEnvironmentAccountConnectionsAsync(
            final ListEnvironmentAccountConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentAccountConnectionsRequest, ListEnvironmentAccountConnectionsResult> asyncHandler) {
        final ListEnvironmentAccountConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentAccountConnectionsResult>() {
            @Override
            public ListEnvironmentAccountConnectionsResult call() throws Exception {
                ListEnvironmentAccountConnectionsResult result = null;

                try {
                    result = executeListEnvironmentAccountConnections(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentTemplateVersionsResult> listEnvironmentTemplateVersionsAsync(
            ListEnvironmentTemplateVersionsRequest request) {

        return listEnvironmentTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentTemplateVersionsResult> listEnvironmentTemplateVersionsAsync(
            final ListEnvironmentTemplateVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentTemplateVersionsRequest, ListEnvironmentTemplateVersionsResult> asyncHandler) {
        final ListEnvironmentTemplateVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentTemplateVersionsResult>() {
            @Override
            public ListEnvironmentTemplateVersionsResult call() throws Exception {
                ListEnvironmentTemplateVersionsResult result = null;

                try {
                    result = executeListEnvironmentTemplateVersions(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentTemplatesResult> listEnvironmentTemplatesAsync(ListEnvironmentTemplatesRequest request) {

        return listEnvironmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentTemplatesResult> listEnvironmentTemplatesAsync(final ListEnvironmentTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentTemplatesRequest, ListEnvironmentTemplatesResult> asyncHandler) {
        final ListEnvironmentTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentTemplatesResult>() {
            @Override
            public ListEnvironmentTemplatesResult call() throws Exception {
                ListEnvironmentTemplatesResult result = null;

                try {
                    result = executeListEnvironmentTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
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
    public java.util.concurrent.Future<ListServiceInstancesResult> listServiceInstancesAsync(ListServiceInstancesRequest request) {

        return listServiceInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceInstancesResult> listServiceInstancesAsync(final ListServiceInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceInstancesRequest, ListServiceInstancesResult> asyncHandler) {
        final ListServiceInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceInstancesResult>() {
            @Override
            public ListServiceInstancesResult call() throws Exception {
                ListServiceInstancesResult result = null;

                try {
                    result = executeListServiceInstances(finalRequest);
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
    public java.util.concurrent.Future<ListServiceTemplateVersionsResult> listServiceTemplateVersionsAsync(ListServiceTemplateVersionsRequest request) {

        return listServiceTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceTemplateVersionsResult> listServiceTemplateVersionsAsync(final ListServiceTemplateVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceTemplateVersionsRequest, ListServiceTemplateVersionsResult> asyncHandler) {
        final ListServiceTemplateVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceTemplateVersionsResult>() {
            @Override
            public ListServiceTemplateVersionsResult call() throws Exception {
                ListServiceTemplateVersionsResult result = null;

                try {
                    result = executeListServiceTemplateVersions(finalRequest);
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
    public java.util.concurrent.Future<ListServiceTemplatesResult> listServiceTemplatesAsync(ListServiceTemplatesRequest request) {

        return listServiceTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServiceTemplatesResult> listServiceTemplatesAsync(final ListServiceTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServiceTemplatesRequest, ListServiceTemplatesResult> asyncHandler) {
        final ListServiceTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServiceTemplatesResult>() {
            @Override
            public ListServiceTemplatesResult call() throws Exception {
                ListServiceTemplatesResult result = null;

                try {
                    result = executeListServiceTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest request) {

        return listServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServicesResult> listServicesAsync(final ListServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler) {
        final ListServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListServicesResult>() {
            @Override
            public ListServicesResult call() throws Exception {
                ListServicesResult result = null;

                try {
                    result = executeListServices(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<RejectEnvironmentAccountConnectionResult> rejectEnvironmentAccountConnectionAsync(
            RejectEnvironmentAccountConnectionRequest request) {

        return rejectEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectEnvironmentAccountConnectionResult> rejectEnvironmentAccountConnectionAsync(
            final RejectEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectEnvironmentAccountConnectionRequest, RejectEnvironmentAccountConnectionResult> asyncHandler) {
        final RejectEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectEnvironmentAccountConnectionResult>() {
            @Override
            public RejectEnvironmentAccountConnectionResult call() throws Exception {
                RejectEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeRejectEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request) {

        return updateAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(final UpdateAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler) {
        final UpdateAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountSettingsResult>() {
            @Override
            public UpdateAccountSettingsResult call() throws Exception {
                UpdateAccountSettingsResult result = null;

                try {
                    result = executeUpdateAccountSettings(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentAccountConnectionResult> updateEnvironmentAccountConnectionAsync(
            UpdateEnvironmentAccountConnectionRequest request) {

        return updateEnvironmentAccountConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentAccountConnectionResult> updateEnvironmentAccountConnectionAsync(
            final UpdateEnvironmentAccountConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentAccountConnectionRequest, UpdateEnvironmentAccountConnectionResult> asyncHandler) {
        final UpdateEnvironmentAccountConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentAccountConnectionResult>() {
            @Override
            public UpdateEnvironmentAccountConnectionResult call() throws Exception {
                UpdateEnvironmentAccountConnectionResult result = null;

                try {
                    result = executeUpdateEnvironmentAccountConnection(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentTemplateResult> updateEnvironmentTemplateAsync(UpdateEnvironmentTemplateRequest request) {

        return updateEnvironmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentTemplateResult> updateEnvironmentTemplateAsync(final UpdateEnvironmentTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentTemplateRequest, UpdateEnvironmentTemplateResult> asyncHandler) {
        final UpdateEnvironmentTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentTemplateResult>() {
            @Override
            public UpdateEnvironmentTemplateResult call() throws Exception {
                UpdateEnvironmentTemplateResult result = null;

                try {
                    result = executeUpdateEnvironmentTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentTemplateVersionResult> updateEnvironmentTemplateVersionAsync(
            UpdateEnvironmentTemplateVersionRequest request) {

        return updateEnvironmentTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentTemplateVersionResult> updateEnvironmentTemplateVersionAsync(
            final UpdateEnvironmentTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentTemplateVersionRequest, UpdateEnvironmentTemplateVersionResult> asyncHandler) {
        final UpdateEnvironmentTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentTemplateVersionResult>() {
            @Override
            public UpdateEnvironmentTemplateVersionResult call() throws Exception {
                UpdateEnvironmentTemplateVersionResult result = null;

                try {
                    result = executeUpdateEnvironmentTemplateVersion(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest request) {

        return updateServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(final UpdateServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler) {
        final UpdateServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceResult>() {
            @Override
            public UpdateServiceResult call() throws Exception {
                UpdateServiceResult result = null;

                try {
                    result = executeUpdateService(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceInstanceResult> updateServiceInstanceAsync(UpdateServiceInstanceRequest request) {

        return updateServiceInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceInstanceResult> updateServiceInstanceAsync(final UpdateServiceInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceInstanceRequest, UpdateServiceInstanceResult> asyncHandler) {
        final UpdateServiceInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceInstanceResult>() {
            @Override
            public UpdateServiceInstanceResult call() throws Exception {
                UpdateServiceInstanceResult result = null;

                try {
                    result = executeUpdateServiceInstance(finalRequest);
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
    public java.util.concurrent.Future<UpdateServicePipelineResult> updateServicePipelineAsync(UpdateServicePipelineRequest request) {

        return updateServicePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServicePipelineResult> updateServicePipelineAsync(final UpdateServicePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServicePipelineRequest, UpdateServicePipelineResult> asyncHandler) {
        final UpdateServicePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServicePipelineResult>() {
            @Override
            public UpdateServicePipelineResult call() throws Exception {
                UpdateServicePipelineResult result = null;

                try {
                    result = executeUpdateServicePipeline(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceTemplateResult> updateServiceTemplateAsync(UpdateServiceTemplateRequest request) {

        return updateServiceTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceTemplateResult> updateServiceTemplateAsync(final UpdateServiceTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceTemplateRequest, UpdateServiceTemplateResult> asyncHandler) {
        final UpdateServiceTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceTemplateResult>() {
            @Override
            public UpdateServiceTemplateResult call() throws Exception {
                UpdateServiceTemplateResult result = null;

                try {
                    result = executeUpdateServiceTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateServiceTemplateVersionResult> updateServiceTemplateVersionAsync(UpdateServiceTemplateVersionRequest request) {

        return updateServiceTemplateVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServiceTemplateVersionResult> updateServiceTemplateVersionAsync(final UpdateServiceTemplateVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateServiceTemplateVersionRequest, UpdateServiceTemplateVersionResult> asyncHandler) {
        final UpdateServiceTemplateVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateServiceTemplateVersionResult>() {
            @Override
            public UpdateServiceTemplateVersionResult call() throws Exception {
                UpdateServiceTemplateVersionResult result = null;

                try {
                    result = executeUpdateServiceTemplateVersion(finalRequest);
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
