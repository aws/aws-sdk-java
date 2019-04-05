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
package com.amazonaws.services.secretsmanager;

import javax.annotation.Generated;

import com.amazonaws.services.secretsmanager.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Secrets Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Secrets Manager API Reference</fullname>
 * <p>
 * AWS Secrets Manager is a web service that enables you to store, manage, and retrieve, secrets.
 * </p>
 * <p>
 * This guide provides descriptions of the Secrets Manager API. For more information about using this service, see the
 * <a href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/introduction.html">AWS Secrets Manager User
 * Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Secrets Manager API Reference documents the Secrets Manager API version 2017-10-17.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (such as Java, Ruby, .NET, iOS, and Android). The SDKs provide a
 * convenient way to create programmatic access to AWS Secrets Manager. For example, the SDKs take care of
 * cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
 * the AWS SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon
 * Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to Secrets Manager. However, you also can use
 * the Secrets Manager HTTP Query API to make direct calls to the Secrets Manager web service. To learn more about the
 * Secrets Manager HTTP Query API, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/query-requests.html">Making Query Requests</a> in
 * the <i>AWS Secrets Manager User Guide</i>.
 * </p>
 * <p>
 * Secrets Manager supports GET and POST requests for all actions. That is, the API doesn't require you to use GET for
 * some actions and POST for others. However, GET requests are subject to the limitation size of a URL. Therefore, for
 * operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Support and Feedback for AWS Secrets Manager</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:awssecretsmanager-feedback@amazon.com">awssecretsmanager-feedback@amazon.com</a>, or post your feedback
 * and questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=296">AWS Secrets Manager Discussion
 * Forum</a>. For more information about the AWS Discussion Forums, see <a
 * href="http://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>How examples are presented</b>
 * </p>
 * <p>
 * The JSON that AWS Secrets Manager expects as your request parameters and that the service returns as a response to
 * HTTP query requests are single, long strings without line breaks or white space formatting. The JSON shown in the
 * examples is formatted with both line breaks and white space to improve readability. When example input parameters
 * would also result in long strings that extend beyond the screen, we insert line breaks to enhance readability. You
 * should always submit the input as a single JSON text string.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS Secrets Manager supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers
 * log files to an Amazon S3 bucket. By using information that's collected by AWS CloudTrail, you can determine which
 * requests were successfully made to Secrets Manager, who made the request, when it was made, and so on. For more about
 * AWS Secrets Manager and its support for AWS CloudTrail, see <a
 * href="http://docs.aws.amazon.com/secretsmanager/latest/userguide/monitoring.html#monitoring_cloudtrail">Logging AWS
 * Secrets Manager Events with AWS CloudTrail</a> in the <i>AWS Secrets Manager User Guide</i>. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecretsManagerAsyncClient extends AWSSecretsManagerClient implements AWSSecretsManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSecretsManagerAsyncClientBuilder asyncBuilder() {
        return AWSSecretsManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Secrets Manager using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSecretsManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(CancelRotateSecretRequest request) {

        return cancelRotateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelRotateSecretResult> cancelRotateSecretAsync(final CancelRotateSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelRotateSecretRequest, CancelRotateSecretResult> asyncHandler) {
        final CancelRotateSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelRotateSecretResult>() {
            @Override
            public CancelRotateSecretResult call() throws Exception {
                CancelRotateSecretResult result = null;

                try {
                    result = executeCancelRotateSecret(finalRequest);
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
    public java.util.concurrent.Future<CreateSecretResult> createSecretAsync(CreateSecretRequest request) {

        return createSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecretResult> createSecretAsync(final CreateSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecretRequest, CreateSecretResult> asyncHandler) {
        final CreateSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecretResult>() {
            @Override
            public CreateSecretResult call() throws Exception {
                CreateSecretResult result = null;

                try {
                    result = executeCreateSecret(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(DeleteSecretRequest request) {

        return deleteSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecretResult> deleteSecretAsync(final DeleteSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecretRequest, DeleteSecretResult> asyncHandler) {
        final DeleteSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecretResult>() {
            @Override
            public DeleteSecretResult call() throws Exception {
                DeleteSecretResult result = null;

                try {
                    result = executeDeleteSecret(finalRequest);
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
    public java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(DescribeSecretRequest request) {

        return describeSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecretResult> describeSecretAsync(final DescribeSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecretRequest, DescribeSecretResult> asyncHandler) {
        final DescribeSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecretResult>() {
            @Override
            public DescribeSecretResult call() throws Exception {
                DescribeSecretResult result = null;

                try {
                    result = executeDescribeSecret(finalRequest);
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
    public java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(GetRandomPasswordRequest request) {

        return getRandomPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRandomPasswordResult> getRandomPasswordAsync(final GetRandomPasswordRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRandomPasswordRequest, GetRandomPasswordResult> asyncHandler) {
        final GetRandomPasswordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRandomPasswordResult>() {
            @Override
            public GetRandomPasswordResult call() throws Exception {
                GetRandomPasswordResult result = null;

                try {
                    result = executeGetRandomPassword(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest request) {

        return getResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(final GetResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler) {
        final GetResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePolicyResult>() {
            @Override
            public GetResourcePolicyResult call() throws Exception {
                GetResourcePolicyResult result = null;

                try {
                    result = executeGetResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(GetSecretValueRequest request) {

        return getSecretValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecretValueResult> getSecretValueAsync(final GetSecretValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecretValueRequest, GetSecretValueResult> asyncHandler) {
        final GetSecretValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecretValueResult>() {
            @Override
            public GetSecretValueResult call() throws Exception {
                GetSecretValueResult result = null;

                try {
                    result = executeGetSecretValue(finalRequest);
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
    public java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(ListSecretVersionIdsRequest request) {

        return listSecretVersionIdsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecretVersionIdsResult> listSecretVersionIdsAsync(final ListSecretVersionIdsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecretVersionIdsRequest, ListSecretVersionIdsResult> asyncHandler) {
        final ListSecretVersionIdsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecretVersionIdsResult>() {
            @Override
            public ListSecretVersionIdsResult call() throws Exception {
                ListSecretVersionIdsResult result = null;

                try {
                    result = executeListSecretVersionIds(finalRequest);
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
    public java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(ListSecretsRequest request) {

        return listSecretsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecretsResult> listSecretsAsync(final ListSecretsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecretsRequest, ListSecretsResult> asyncHandler) {
        final ListSecretsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecretsResult>() {
            @Override
            public ListSecretsResult call() throws Exception {
                ListSecretsResult result = null;

                try {
                    result = executeListSecrets(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(PutSecretValueRequest request) {

        return putSecretValueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSecretValueResult> putSecretValueAsync(final PutSecretValueRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSecretValueRequest, PutSecretValueResult> asyncHandler) {
        final PutSecretValueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSecretValueResult>() {
            @Override
            public PutSecretValueResult call() throws Exception {
                PutSecretValueResult result = null;

                try {
                    result = executePutSecretValue(finalRequest);
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
    public java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(RestoreSecretRequest request) {

        return restoreSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreSecretResult> restoreSecretAsync(final RestoreSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreSecretRequest, RestoreSecretResult> asyncHandler) {
        final RestoreSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreSecretResult>() {
            @Override
            public RestoreSecretResult call() throws Exception {
                RestoreSecretResult result = null;

                try {
                    result = executeRestoreSecret(finalRequest);
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
    public java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(RotateSecretRequest request) {

        return rotateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RotateSecretResult> rotateSecretAsync(final RotateSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<RotateSecretRequest, RotateSecretResult> asyncHandler) {
        final RotateSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RotateSecretResult>() {
            @Override
            public RotateSecretResult call() throws Exception {
                RotateSecretResult result = null;

                try {
                    result = executeRotateSecret(finalRequest);
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
    public java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(UpdateSecretRequest request) {

        return updateSecretAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretResult> updateSecretAsync(final UpdateSecretRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecretRequest, UpdateSecretResult> asyncHandler) {
        final UpdateSecretRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecretResult>() {
            @Override
            public UpdateSecretResult call() throws Exception {
                UpdateSecretResult result = null;

                try {
                    result = executeUpdateSecret(finalRequest);
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
    public java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(UpdateSecretVersionStageRequest request) {

        return updateSecretVersionStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecretVersionStageResult> updateSecretVersionStageAsync(final UpdateSecretVersionStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecretVersionStageRequest, UpdateSecretVersionStageResult> asyncHandler) {
        final UpdateSecretVersionStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecretVersionStageResult>() {
            @Override
            public UpdateSecretVersionStageResult call() throws Exception {
                UpdateSecretVersionStageResult result = null;

                try {
                    result = executeUpdateSecretVersionStage(finalRequest);
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
