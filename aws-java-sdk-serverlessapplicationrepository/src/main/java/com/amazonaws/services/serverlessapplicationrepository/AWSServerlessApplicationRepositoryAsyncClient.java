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
package com.amazonaws.services.serverlessapplicationrepository;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSServerlessApplicationRepository asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The AWS Serverless Application Repository makes it easy for developers and enterprises to quickly find and deploy
 * serverless applications in the AWS Cloud. For more information about serverless applications, see Serverless
 * Computing and Applications on the AWS website.
 * </p>
 * <p>
 * The AWS Serverless Application Repository is deeply integrated with the AWS Lambda console, so that developers of all
 * levels can get started with serverless computing without needing to learn anything new. You can use category keywords
 * to browse for applications such as web and mobile backends, data processing applications, or chatbots. You can also
 * search for applications by name, publisher, or event source. To use an application, you simply choose it, configure
 * any required fields, and deploy it with a few clicks.
 * </p>
 * <p>
 * You can also easily publish applications, sharing them publicly with the community at large, or privately within your
 * team or across your organization. To publish a serverless application (or app), you can use the AWS Management
 * Console, AWS Command Line Interface (AWS CLI), or AWS SDKs to upload the code. Along with the code, you upload a
 * simple manifest file, also known as the AWS Serverless Application Model (AWS SAM) template. For more information
 * about AWS SAM, see AWS Serverless Application Model (AWS SAM) on the AWS Labs GitHub repository.
 * </p>
 * <p>
 * The AWS Serverless Application Repository Developer Guide contains more information about the two developer
 * experiences available:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Consuming Applications – Browse for applications and view information about them, including source code and readme
 * files. Also install, configure, and deploy applications of your choosing.
 * </p>
 * <p>
 * Publishing Applications – Configure and upload applications to make them available to other developers, and publish
 * new versions of applications.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSServerlessApplicationRepositoryAsyncClient extends AWSServerlessApplicationRepositoryClient implements AWSServerlessApplicationRepositoryAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSServerlessApplicationRepositoryAsyncClientBuilder asyncBuilder() {
        return AWSServerlessApplicationRepositoryAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSServerlessApplicationRepository using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSServerlessApplicationRepositoryAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
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
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest request) {

        return createApplicationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(final CreateApplicationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler) {
        final CreateApplicationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationVersionResult>() {
            @Override
            public CreateApplicationVersionResult call() throws Exception {
                CreateApplicationVersionResult result = null;

                try {
                    result = executeCreateApplicationVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateCloudFormationChangeSetResult> createCloudFormationChangeSetAsync(CreateCloudFormationChangeSetRequest request) {

        return createCloudFormationChangeSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFormationChangeSetResult> createCloudFormationChangeSetAsync(
            final CreateCloudFormationChangeSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudFormationChangeSetRequest, CreateCloudFormationChangeSetResult> asyncHandler) {
        final CreateCloudFormationChangeSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudFormationChangeSetResult>() {
            @Override
            public CreateCloudFormationChangeSetResult call() throws Exception {
                CreateCloudFormationChangeSetResult result = null;

                try {
                    result = executeCreateCloudFormationChangeSet(finalRequest);
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
    public java.util.concurrent.Future<CreateCloudFormationTemplateResult> createCloudFormationTemplateAsync(CreateCloudFormationTemplateRequest request) {

        return createCloudFormationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudFormationTemplateResult> createCloudFormationTemplateAsync(final CreateCloudFormationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudFormationTemplateRequest, CreateCloudFormationTemplateResult> asyncHandler) {
        final CreateCloudFormationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudFormationTemplateResult>() {
            @Override
            public CreateCloudFormationTemplateResult call() throws Exception {
                CreateCloudFormationTemplateResult result = null;

                try {
                    result = executeCreateCloudFormationTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
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
    public java.util.concurrent.Future<GetApplicationPolicyResult> getApplicationPolicyAsync(GetApplicationPolicyRequest request) {

        return getApplicationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationPolicyResult> getApplicationPolicyAsync(final GetApplicationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationPolicyRequest, GetApplicationPolicyResult> asyncHandler) {
        final GetApplicationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationPolicyResult>() {
            @Override
            public GetApplicationPolicyResult call() throws Exception {
                GetApplicationPolicyResult result = null;

                try {
                    result = executeGetApplicationPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetCloudFormationTemplateResult> getCloudFormationTemplateAsync(GetCloudFormationTemplateRequest request) {

        return getCloudFormationTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudFormationTemplateResult> getCloudFormationTemplateAsync(final GetCloudFormationTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudFormationTemplateRequest, GetCloudFormationTemplateResult> asyncHandler) {
        final GetCloudFormationTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudFormationTemplateResult>() {
            @Override
            public GetCloudFormationTemplateResult call() throws Exception {
                GetCloudFormationTemplateResult result = null;

                try {
                    result = executeGetCloudFormationTemplate(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationDependenciesResult> listApplicationDependenciesAsync(ListApplicationDependenciesRequest request) {

        return listApplicationDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationDependenciesResult> listApplicationDependenciesAsync(final ListApplicationDependenciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationDependenciesRequest, ListApplicationDependenciesResult> asyncHandler) {
        final ListApplicationDependenciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationDependenciesResult>() {
            @Override
            public ListApplicationDependenciesResult call() throws Exception {
                ListApplicationDependenciesResult result = null;

                try {
                    result = executeListApplicationDependencies(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(ListApplicationVersionsRequest request) {

        return listApplicationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationVersionsResult> listApplicationVersionsAsync(final ListApplicationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationVersionsRequest, ListApplicationVersionsResult> asyncHandler) {
        final ListApplicationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationVersionsResult>() {
            @Override
            public ListApplicationVersionsResult call() throws Exception {
                ListApplicationVersionsResult result = null;

                try {
                    result = executeListApplicationVersions(finalRequest);
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
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
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
    public java.util.concurrent.Future<PutApplicationPolicyResult> putApplicationPolicyAsync(PutApplicationPolicyRequest request) {

        return putApplicationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutApplicationPolicyResult> putApplicationPolicyAsync(final PutApplicationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutApplicationPolicyRequest, PutApplicationPolicyResult> asyncHandler) {
        final PutApplicationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutApplicationPolicyResult>() {
            @Override
            public PutApplicationPolicyResult call() throws Exception {
                PutApplicationPolicyResult result = null;

                try {
                    result = executePutApplicationPolicy(finalRequest);
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
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
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
