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
package com.amazonaws.services.connect;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Connect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that you use to set up and manage a customer contact center
 * and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect provides metrics and real-time reporting that enable you to optimize contact routing. You can also
 * resolve customer issues more efficiently by getting customers in touch with the appropriate agents.
 * </p>
 * <p>
 * There are limits to the number of Amazon Connect resources that you can create. There are also limits to the number
 * of requests that you can make per second. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon Connect
 * Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * <p>
 * You can connect programmatically to an Amazon Web Services service by using an endpoint. For a list of Amazon Connect
 * endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/connect_region.html">Amazon Connect
 * Endpoints</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonConnectAsyncClient extends AmazonConnectClient implements AmazonConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonConnectAsyncClientBuilder asyncBuilder() {
        return AmazonConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Connect using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(ActivateEvaluationFormRequest request) {

        return activateEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateEvaluationFormResult> activateEvaluationFormAsync(final ActivateEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateEvaluationFormRequest, ActivateEvaluationFormResult> asyncHandler) {
        final ActivateEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateEvaluationFormResult>() {
            @Override
            public ActivateEvaluationFormResult call() throws Exception {
                ActivateEvaluationFormResult result = null;

                try {
                    result = executeActivateEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<AssociateAnalyticsDataSetResult> associateAnalyticsDataSetAsync(AssociateAnalyticsDataSetRequest request) {

        return associateAnalyticsDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAnalyticsDataSetResult> associateAnalyticsDataSetAsync(final AssociateAnalyticsDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAnalyticsDataSetRequest, AssociateAnalyticsDataSetResult> asyncHandler) {
        final AssociateAnalyticsDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAnalyticsDataSetResult>() {
            @Override
            public AssociateAnalyticsDataSetResult call() throws Exception {
                AssociateAnalyticsDataSetResult result = null;

                try {
                    result = executeAssociateAnalyticsDataSet(finalRequest);
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
    public java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(AssociateApprovedOriginRequest request) {

        return associateApprovedOriginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateApprovedOriginResult> associateApprovedOriginAsync(final AssociateApprovedOriginRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateApprovedOriginRequest, AssociateApprovedOriginResult> asyncHandler) {
        final AssociateApprovedOriginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateApprovedOriginResult>() {
            @Override
            public AssociateApprovedOriginResult call() throws Exception {
                AssociateApprovedOriginResult result = null;

                try {
                    result = executeAssociateApprovedOrigin(finalRequest);
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
    public java.util.concurrent.Future<AssociateBotResult> associateBotAsync(AssociateBotRequest request) {

        return associateBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateBotResult> associateBotAsync(final AssociateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateBotRequest, AssociateBotResult> asyncHandler) {
        final AssociateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateBotResult>() {
            @Override
            public AssociateBotResult call() throws Exception {
                AssociateBotResult result = null;

                try {
                    result = executeAssociateBot(finalRequest);
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
    public java.util.concurrent.Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(AssociateDefaultVocabularyRequest request) {

        return associateDefaultVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateDefaultVocabularyResult> associateDefaultVocabularyAsync(final AssociateDefaultVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateDefaultVocabularyRequest, AssociateDefaultVocabularyResult> asyncHandler) {
        final AssociateDefaultVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateDefaultVocabularyResult>() {
            @Override
            public AssociateDefaultVocabularyResult call() throws Exception {
                AssociateDefaultVocabularyResult result = null;

                try {
                    result = executeAssociateDefaultVocabulary(finalRequest);
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
    public java.util.concurrent.Future<AssociateFlowResult> associateFlowAsync(AssociateFlowRequest request) {

        return associateFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateFlowResult> associateFlowAsync(final AssociateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateFlowRequest, AssociateFlowResult> asyncHandler) {
        final AssociateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateFlowResult>() {
            @Override
            public AssociateFlowResult call() throws Exception {
                AssociateFlowResult result = null;

                try {
                    result = executeAssociateFlow(finalRequest);
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
    public java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(AssociateInstanceStorageConfigRequest request) {

        return associateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateInstanceStorageConfigResult> associateInstanceStorageConfigAsync(
            final AssociateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateInstanceStorageConfigRequest, AssociateInstanceStorageConfigResult> asyncHandler) {
        final AssociateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateInstanceStorageConfigResult>() {
            @Override
            public AssociateInstanceStorageConfigResult call() throws Exception {
                AssociateInstanceStorageConfigResult result = null;

                try {
                    result = executeAssociateInstanceStorageConfig(finalRequest);
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
    public java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(AssociateLambdaFunctionRequest request) {

        return associateLambdaFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLambdaFunctionResult> associateLambdaFunctionAsync(final AssociateLambdaFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLambdaFunctionRequest, AssociateLambdaFunctionResult> asyncHandler) {
        final AssociateLambdaFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLambdaFunctionResult>() {
            @Override
            public AssociateLambdaFunctionResult call() throws Exception {
                AssociateLambdaFunctionResult result = null;

                try {
                    result = executeAssociateLambdaFunction(finalRequest);
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
    public java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(AssociateLexBotRequest request) {

        return associateLexBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLexBotResult> associateLexBotAsync(final AssociateLexBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLexBotRequest, AssociateLexBotResult> asyncHandler) {
        final AssociateLexBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLexBotResult>() {
            @Override
            public AssociateLexBotResult call() throws Exception {
                AssociateLexBotResult result = null;

                try {
                    result = executeAssociateLexBot(finalRequest);
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
    public java.util.concurrent.Future<AssociatePhoneNumberContactFlowResult> associatePhoneNumberContactFlowAsync(
            AssociatePhoneNumberContactFlowRequest request) {

        return associatePhoneNumberContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumberContactFlowResult> associatePhoneNumberContactFlowAsync(
            final AssociatePhoneNumberContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumberContactFlowRequest, AssociatePhoneNumberContactFlowResult> asyncHandler) {
        final AssociatePhoneNumberContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumberContactFlowResult>() {
            @Override
            public AssociatePhoneNumberContactFlowResult call() throws Exception {
                AssociatePhoneNumberContactFlowResult result = null;

                try {
                    result = executeAssociatePhoneNumberContactFlow(finalRequest);
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
    public java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(AssociateQueueQuickConnectsRequest request) {

        return associateQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateQueueQuickConnectsResult> associateQueueQuickConnectsAsync(final AssociateQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateQueueQuickConnectsRequest, AssociateQueueQuickConnectsResult> asyncHandler) {
        final AssociateQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateQueueQuickConnectsResult>() {
            @Override
            public AssociateQueueQuickConnectsResult call() throws Exception {
                AssociateQueueQuickConnectsResult result = null;

                try {
                    result = executeAssociateQueueQuickConnects(finalRequest);
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
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(AssociateRoutingProfileQueuesRequest request) {

        return associateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRoutingProfileQueuesResult> associateRoutingProfileQueuesAsync(
            final AssociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRoutingProfileQueuesRequest, AssociateRoutingProfileQueuesResult> asyncHandler) {
        final AssociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRoutingProfileQueuesResult>() {
            @Override
            public AssociateRoutingProfileQueuesResult call() throws Exception {
                AssociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeAssociateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(AssociateSecurityKeyRequest request) {

        return associateSecurityKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateSecurityKeyResult> associateSecurityKeyAsync(final AssociateSecurityKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateSecurityKeyRequest, AssociateSecurityKeyResult> asyncHandler) {
        final AssociateSecurityKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateSecurityKeyResult>() {
            @Override
            public AssociateSecurityKeyResult call() throws Exception {
                AssociateSecurityKeyResult result = null;

                try {
                    result = executeAssociateSecurityKey(finalRequest);
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
    public java.util.concurrent.Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            AssociateTrafficDistributionGroupUserRequest request) {

        return associateTrafficDistributionGroupUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTrafficDistributionGroupUserResult> associateTrafficDistributionGroupUserAsync(
            final AssociateTrafficDistributionGroupUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTrafficDistributionGroupUserRequest, AssociateTrafficDistributionGroupUserResult> asyncHandler) {
        final AssociateTrafficDistributionGroupUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTrafficDistributionGroupUserResult>() {
            @Override
            public AssociateTrafficDistributionGroupUserResult call() throws Exception {
                AssociateTrafficDistributionGroupUserResult result = null;

                try {
                    result = executeAssociateTrafficDistributionGroupUser(finalRequest);
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
    public java.util.concurrent.Future<AssociateUserProficienciesResult> associateUserProficienciesAsync(AssociateUserProficienciesRequest request) {

        return associateUserProficienciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateUserProficienciesResult> associateUserProficienciesAsync(final AssociateUserProficienciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateUserProficienciesRequest, AssociateUserProficienciesResult> asyncHandler) {
        final AssociateUserProficienciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateUserProficienciesResult>() {
            @Override
            public AssociateUserProficienciesResult call() throws Exception {
                AssociateUserProficienciesResult result = null;

                try {
                    result = executeAssociateUserProficiencies(finalRequest);
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
    public java.util.concurrent.Future<BatchAssociateAnalyticsDataSetResult> batchAssociateAnalyticsDataSetAsync(BatchAssociateAnalyticsDataSetRequest request) {

        return batchAssociateAnalyticsDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateAnalyticsDataSetResult> batchAssociateAnalyticsDataSetAsync(
            final BatchAssociateAnalyticsDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateAnalyticsDataSetRequest, BatchAssociateAnalyticsDataSetResult> asyncHandler) {
        final BatchAssociateAnalyticsDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateAnalyticsDataSetResult>() {
            @Override
            public BatchAssociateAnalyticsDataSetResult call() throws Exception {
                BatchAssociateAnalyticsDataSetResult result = null;

                try {
                    result = executeBatchAssociateAnalyticsDataSet(finalRequest);
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
    public java.util.concurrent.Future<BatchDisassociateAnalyticsDataSetResult> batchDisassociateAnalyticsDataSetAsync(
            BatchDisassociateAnalyticsDataSetRequest request) {

        return batchDisassociateAnalyticsDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateAnalyticsDataSetResult> batchDisassociateAnalyticsDataSetAsync(
            final BatchDisassociateAnalyticsDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateAnalyticsDataSetRequest, BatchDisassociateAnalyticsDataSetResult> asyncHandler) {
        final BatchDisassociateAnalyticsDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateAnalyticsDataSetResult>() {
            @Override
            public BatchDisassociateAnalyticsDataSetResult call() throws Exception {
                BatchDisassociateAnalyticsDataSetResult result = null;

                try {
                    result = executeBatchDisassociateAnalyticsDataSet(finalRequest);
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
    public java.util.concurrent.Future<BatchGetAttachedFileMetadataResult> batchGetAttachedFileMetadataAsync(BatchGetAttachedFileMetadataRequest request) {

        return batchGetAttachedFileMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAttachedFileMetadataResult> batchGetAttachedFileMetadataAsync(final BatchGetAttachedFileMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetAttachedFileMetadataRequest, BatchGetAttachedFileMetadataResult> asyncHandler) {
        final BatchGetAttachedFileMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetAttachedFileMetadataResult>() {
            @Override
            public BatchGetAttachedFileMetadataResult call() throws Exception {
                BatchGetAttachedFileMetadataResult result = null;

                try {
                    result = executeBatchGetAttachedFileMetadata(finalRequest);
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
    public java.util.concurrent.Future<BatchGetFlowAssociationResult> batchGetFlowAssociationAsync(BatchGetFlowAssociationRequest request) {

        return batchGetFlowAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFlowAssociationResult> batchGetFlowAssociationAsync(final BatchGetFlowAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetFlowAssociationRequest, BatchGetFlowAssociationResult> asyncHandler) {
        final BatchGetFlowAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetFlowAssociationResult>() {
            @Override
            public BatchGetFlowAssociationResult call() throws Exception {
                BatchGetFlowAssociationResult result = null;

                try {
                    result = executeBatchGetFlowAssociation(finalRequest);
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
    public java.util.concurrent.Future<BatchPutContactResult> batchPutContactAsync(BatchPutContactRequest request) {

        return batchPutContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutContactResult> batchPutContactAsync(final BatchPutContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutContactRequest, BatchPutContactResult> asyncHandler) {
        final BatchPutContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutContactResult>() {
            @Override
            public BatchPutContactResult call() throws Exception {
                BatchPutContactResult result = null;

                try {
                    result = executeBatchPutContact(finalRequest);
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
    public java.util.concurrent.Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(ClaimPhoneNumberRequest request) {

        return claimPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClaimPhoneNumberResult> claimPhoneNumberAsync(final ClaimPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ClaimPhoneNumberRequest, ClaimPhoneNumberResult> asyncHandler) {
        final ClaimPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClaimPhoneNumberResult>() {
            @Override
            public ClaimPhoneNumberResult call() throws Exception {
                ClaimPhoneNumberResult result = null;

                try {
                    result = executeClaimPhoneNumber(finalRequest);
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
    public java.util.concurrent.Future<CompleteAttachedFileUploadResult> completeAttachedFileUploadAsync(CompleteAttachedFileUploadRequest request) {

        return completeAttachedFileUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteAttachedFileUploadResult> completeAttachedFileUploadAsync(final CompleteAttachedFileUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteAttachedFileUploadRequest, CompleteAttachedFileUploadResult> asyncHandler) {
        final CompleteAttachedFileUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CompleteAttachedFileUploadResult>() {
            @Override
            public CompleteAttachedFileUploadResult call() throws Exception {
                CompleteAttachedFileUploadResult result = null;

                try {
                    result = executeCompleteAttachedFileUpload(finalRequest);
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
    public java.util.concurrent.Future<CreateAgentStatusResult> createAgentStatusAsync(CreateAgentStatusRequest request) {

        return createAgentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAgentStatusResult> createAgentStatusAsync(final CreateAgentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAgentStatusRequest, CreateAgentStatusResult> asyncHandler) {
        final CreateAgentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAgentStatusResult>() {
            @Override
            public CreateAgentStatusResult call() throws Exception {
                CreateAgentStatusResult result = null;

                try {
                    result = executeCreateAgentStatus(finalRequest);
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
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(CreateContactFlowRequest request) {

        return createContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactFlowResult> createContactFlowAsync(final CreateContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactFlowRequest, CreateContactFlowResult> asyncHandler) {
        final CreateContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactFlowResult>() {
            @Override
            public CreateContactFlowResult call() throws Exception {
                CreateContactFlowResult result = null;

                try {
                    result = executeCreateContactFlow(finalRequest);
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
    public java.util.concurrent.Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(CreateContactFlowModuleRequest request) {

        return createContactFlowModuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateContactFlowModuleResult> createContactFlowModuleAsync(final CreateContactFlowModuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateContactFlowModuleRequest, CreateContactFlowModuleResult> asyncHandler) {
        final CreateContactFlowModuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateContactFlowModuleResult>() {
            @Override
            public CreateContactFlowModuleResult call() throws Exception {
                CreateContactFlowModuleResult result = null;

                try {
                    result = executeCreateContactFlowModule(finalRequest);
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
    public java.util.concurrent.Future<CreateEvaluationFormResult> createEvaluationFormAsync(CreateEvaluationFormRequest request) {

        return createEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEvaluationFormResult> createEvaluationFormAsync(final CreateEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEvaluationFormRequest, CreateEvaluationFormResult> asyncHandler) {
        final CreateEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEvaluationFormResult>() {
            @Override
            public CreateEvaluationFormResult call() throws Exception {
                CreateEvaluationFormResult result = null;

                try {
                    result = executeCreateEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(CreateHoursOfOperationRequest request) {

        return createHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHoursOfOperationResult> createHoursOfOperationAsync(final CreateHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHoursOfOperationRequest, CreateHoursOfOperationResult> asyncHandler) {
        final CreateHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHoursOfOperationResult>() {
            @Override
            public CreateHoursOfOperationResult call() throws Exception {
                CreateHoursOfOperationResult result = null;

                try {
                    result = executeCreateHoursOfOperation(finalRequest);
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
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest request) {

        return createInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(final CreateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler) {
        final CreateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInstanceResult>() {
            @Override
            public CreateInstanceResult call() throws Exception {
                CreateInstanceResult result = null;

                try {
                    result = executeCreateInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(CreateIntegrationAssociationRequest request) {

        return createIntegrationAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationAssociationResult> createIntegrationAssociationAsync(final CreateIntegrationAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntegrationAssociationRequest, CreateIntegrationAssociationResult> asyncHandler) {
        final CreateIntegrationAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntegrationAssociationResult>() {
            @Override
            public CreateIntegrationAssociationResult call() throws Exception {
                CreateIntegrationAssociationResult result = null;

                try {
                    result = executeCreateIntegrationAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreateParticipantResult> createParticipantAsync(CreateParticipantRequest request) {

        return createParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantResult> createParticipantAsync(final CreateParticipantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateParticipantRequest, CreateParticipantResult> asyncHandler) {
        final CreateParticipantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateParticipantResult>() {
            @Override
            public CreateParticipantResult call() throws Exception {
                CreateParticipantResult result = null;

                try {
                    result = executeCreateParticipant(finalRequest);
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
    public java.util.concurrent.Future<CreatePersistentContactAssociationResult> createPersistentContactAssociationAsync(
            CreatePersistentContactAssociationRequest request) {

        return createPersistentContactAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePersistentContactAssociationResult> createPersistentContactAssociationAsync(
            final CreatePersistentContactAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePersistentContactAssociationRequest, CreatePersistentContactAssociationResult> asyncHandler) {
        final CreatePersistentContactAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePersistentContactAssociationResult>() {
            @Override
            public CreatePersistentContactAssociationResult call() throws Exception {
                CreatePersistentContactAssociationResult result = null;

                try {
                    result = executeCreatePersistentContactAssociation(finalRequest);
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
    public java.util.concurrent.Future<CreatePredefinedAttributeResult> createPredefinedAttributeAsync(CreatePredefinedAttributeRequest request) {

        return createPredefinedAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePredefinedAttributeResult> createPredefinedAttributeAsync(final CreatePredefinedAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePredefinedAttributeRequest, CreatePredefinedAttributeResult> asyncHandler) {
        final CreatePredefinedAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePredefinedAttributeResult>() {
            @Override
            public CreatePredefinedAttributeResult call() throws Exception {
                CreatePredefinedAttributeResult result = null;

                try {
                    result = executeCreatePredefinedAttribute(finalRequest);
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
    public java.util.concurrent.Future<CreatePromptResult> createPromptAsync(CreatePromptRequest request) {

        return createPromptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePromptResult> createPromptAsync(final CreatePromptRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePromptRequest, CreatePromptResult> asyncHandler) {
        final CreatePromptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePromptResult>() {
            @Override
            public CreatePromptResult call() throws Exception {
                CreatePromptResult result = null;

                try {
                    result = executeCreatePrompt(finalRequest);
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
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {
        final CreateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueResult>() {
            @Override
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;

                try {
                    result = executeCreateQueue(finalRequest);
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
    public java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(CreateQuickConnectRequest request) {

        return createQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQuickConnectResult> createQuickConnectAsync(final CreateQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQuickConnectRequest, CreateQuickConnectResult> asyncHandler) {
        final CreateQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQuickConnectResult>() {
            @Override
            public CreateQuickConnectResult call() throws Exception {
                CreateQuickConnectResult result = null;

                try {
                    result = executeCreateQuickConnect(finalRequest);
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
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(CreateRoutingProfileRequest request) {

        return createRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingProfileResult> createRoutingProfileAsync(final CreateRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoutingProfileRequest, CreateRoutingProfileResult> asyncHandler) {
        final CreateRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoutingProfileResult>() {
            @Override
            public CreateRoutingProfileResult call() throws Exception {
                CreateRoutingProfileResult result = null;

                try {
                    result = executeCreateRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(final CreateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {
        final CreateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleResult>() {
            @Override
            public CreateRuleResult call() throws Exception {
                CreateRuleResult result = null;

                try {
                    result = executeCreateRule(finalRequest);
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
    public java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(CreateSecurityProfileRequest request) {

        return createSecurityProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityProfileResult> createSecurityProfileAsync(final CreateSecurityProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityProfileRequest, CreateSecurityProfileResult> asyncHandler) {
        final CreateSecurityProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityProfileResult>() {
            @Override
            public CreateSecurityProfileResult call() throws Exception {
                CreateSecurityProfileResult result = null;

                try {
                    result = executeCreateSecurityProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateTaskTemplateResult> createTaskTemplateAsync(CreateTaskTemplateRequest request) {

        return createTaskTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTaskTemplateResult> createTaskTemplateAsync(final CreateTaskTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTaskTemplateRequest, CreateTaskTemplateResult> asyncHandler) {
        final CreateTaskTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTaskTemplateResult>() {
            @Override
            public CreateTaskTemplateResult call() throws Exception {
                CreateTaskTemplateResult result = null;

                try {
                    result = executeCreateTaskTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(CreateTrafficDistributionGroupRequest request) {

        return createTrafficDistributionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficDistributionGroupResult> createTrafficDistributionGroupAsync(
            final CreateTrafficDistributionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficDistributionGroupRequest, CreateTrafficDistributionGroupResult> asyncHandler) {
        final CreateTrafficDistributionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficDistributionGroupResult>() {
            @Override
            public CreateTrafficDistributionGroupResult call() throws Exception {
                CreateTrafficDistributionGroupResult result = null;

                try {
                    result = executeCreateTrafficDistributionGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(CreateUseCaseRequest request) {

        return createUseCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUseCaseResult> createUseCaseAsync(final CreateUseCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUseCaseRequest, CreateUseCaseResult> asyncHandler) {
        final CreateUseCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUseCaseResult>() {
            @Override
            public CreateUseCaseResult call() throws Exception {
                CreateUseCaseResult result = null;

                try {
                    result = executeCreateUseCase(finalRequest);
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
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(final CreateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {
        final CreateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserResult>() {
            @Override
            public CreateUserResult call() throws Exception {
                CreateUserResult result = null;

                try {
                    result = executeCreateUser(finalRequest);
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
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(CreateUserHierarchyGroupRequest request) {

        return createUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserHierarchyGroupResult> createUserHierarchyGroupAsync(final CreateUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateUserHierarchyGroupRequest, CreateUserHierarchyGroupResult> asyncHandler) {
        final CreateUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateUserHierarchyGroupResult>() {
            @Override
            public CreateUserHierarchyGroupResult call() throws Exception {
                CreateUserHierarchyGroupResult result = null;

                try {
                    result = executeCreateUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateViewResult> createViewAsync(CreateViewRequest request) {

        return createViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateViewResult> createViewAsync(final CreateViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateViewRequest, CreateViewResult> asyncHandler) {
        final CreateViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateViewResult>() {
            @Override
            public CreateViewResult call() throws Exception {
                CreateViewResult result = null;

                try {
                    result = executeCreateView(finalRequest);
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
    public java.util.concurrent.Future<CreateViewVersionResult> createViewVersionAsync(CreateViewVersionRequest request) {

        return createViewVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateViewVersionResult> createViewVersionAsync(final CreateViewVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateViewVersionRequest, CreateViewVersionResult> asyncHandler) {
        final CreateViewVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateViewVersionResult>() {
            @Override
            public CreateViewVersionResult call() throws Exception {
                CreateViewVersionResult result = null;

                try {
                    result = executeCreateViewVersion(finalRequest);
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
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(CreateVocabularyRequest request) {

        return createVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVocabularyResult> createVocabularyAsync(final CreateVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVocabularyRequest, CreateVocabularyResult> asyncHandler) {
        final CreateVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVocabularyResult>() {
            @Override
            public CreateVocabularyResult call() throws Exception {
                CreateVocabularyResult result = null;

                try {
                    result = executeCreateVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(DeactivateEvaluationFormRequest request) {

        return deactivateEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateEvaluationFormResult> deactivateEvaluationFormAsync(final DeactivateEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateEvaluationFormRequest, DeactivateEvaluationFormResult> asyncHandler) {
        final DeactivateEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateEvaluationFormResult>() {
            @Override
            public DeactivateEvaluationFormResult call() throws Exception {
                DeactivateEvaluationFormResult result = null;

                try {
                    result = executeDeactivateEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<DeleteAttachedFileResult> deleteAttachedFileAsync(DeleteAttachedFileRequest request) {

        return deleteAttachedFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttachedFileResult> deleteAttachedFileAsync(final DeleteAttachedFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttachedFileRequest, DeleteAttachedFileResult> asyncHandler) {
        final DeleteAttachedFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttachedFileResult>() {
            @Override
            public DeleteAttachedFileResult call() throws Exception {
                DeleteAttachedFileResult result = null;

                try {
                    result = executeDeleteAttachedFile(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactEvaluationResult> deleteContactEvaluationAsync(DeleteContactEvaluationRequest request) {

        return deleteContactEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactEvaluationResult> deleteContactEvaluationAsync(final DeleteContactEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactEvaluationRequest, DeleteContactEvaluationResult> asyncHandler) {
        final DeleteContactEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactEvaluationResult>() {
            @Override
            public DeleteContactEvaluationResult call() throws Exception {
                DeleteContactEvaluationResult result = null;

                try {
                    result = executeDeleteContactEvaluation(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactFlowResult> deleteContactFlowAsync(DeleteContactFlowRequest request) {

        return deleteContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactFlowResult> deleteContactFlowAsync(final DeleteContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactFlowRequest, DeleteContactFlowResult> asyncHandler) {
        final DeleteContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactFlowResult>() {
            @Override
            public DeleteContactFlowResult call() throws Exception {
                DeleteContactFlowResult result = null;

                try {
                    result = executeDeleteContactFlow(finalRequest);
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
    public java.util.concurrent.Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(DeleteContactFlowModuleRequest request) {

        return deleteContactFlowModuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteContactFlowModuleResult> deleteContactFlowModuleAsync(final DeleteContactFlowModuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteContactFlowModuleRequest, DeleteContactFlowModuleResult> asyncHandler) {
        final DeleteContactFlowModuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteContactFlowModuleResult>() {
            @Override
            public DeleteContactFlowModuleResult call() throws Exception {
                DeleteContactFlowModuleResult result = null;

                try {
                    result = executeDeleteContactFlowModule(finalRequest);
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
    public java.util.concurrent.Future<DeleteEvaluationFormResult> deleteEvaluationFormAsync(DeleteEvaluationFormRequest request) {

        return deleteEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEvaluationFormResult> deleteEvaluationFormAsync(final DeleteEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEvaluationFormRequest, DeleteEvaluationFormResult> asyncHandler) {
        final DeleteEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEvaluationFormResult>() {
            @Override
            public DeleteEvaluationFormResult call() throws Exception {
                DeleteEvaluationFormResult result = null;

                try {
                    result = executeDeleteEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<DeleteHoursOfOperationResult> deleteHoursOfOperationAsync(DeleteHoursOfOperationRequest request) {

        return deleteHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHoursOfOperationResult> deleteHoursOfOperationAsync(final DeleteHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHoursOfOperationRequest, DeleteHoursOfOperationResult> asyncHandler) {
        final DeleteHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHoursOfOperationResult>() {
            @Override
            public DeleteHoursOfOperationResult call() throws Exception {
                DeleteHoursOfOperationResult result = null;

                try {
                    result = executeDeleteHoursOfOperation(finalRequest);
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
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest request) {

        return deleteInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(final DeleteInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler) {
        final DeleteInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInstanceResult>() {
            @Override
            public DeleteInstanceResult call() throws Exception {
                DeleteInstanceResult result = null;

                try {
                    result = executeDeleteInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(DeleteIntegrationAssociationRequest request) {

        return deleteIntegrationAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationAssociationResult> deleteIntegrationAssociationAsync(final DeleteIntegrationAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationAssociationRequest, DeleteIntegrationAssociationResult> asyncHandler) {
        final DeleteIntegrationAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationAssociationResult>() {
            @Override
            public DeleteIntegrationAssociationResult call() throws Exception {
                DeleteIntegrationAssociationResult result = null;

                try {
                    result = executeDeleteIntegrationAssociation(finalRequest);
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
    public java.util.concurrent.Future<DeletePredefinedAttributeResult> deletePredefinedAttributeAsync(DeletePredefinedAttributeRequest request) {

        return deletePredefinedAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePredefinedAttributeResult> deletePredefinedAttributeAsync(final DeletePredefinedAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePredefinedAttributeRequest, DeletePredefinedAttributeResult> asyncHandler) {
        final DeletePredefinedAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePredefinedAttributeResult>() {
            @Override
            public DeletePredefinedAttributeResult call() throws Exception {
                DeletePredefinedAttributeResult result = null;

                try {
                    result = executeDeletePredefinedAttribute(finalRequest);
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
    public java.util.concurrent.Future<DeletePromptResult> deletePromptAsync(DeletePromptRequest request) {

        return deletePromptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePromptResult> deletePromptAsync(final DeletePromptRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePromptRequest, DeletePromptResult> asyncHandler) {
        final DeletePromptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePromptResult>() {
            @Override
            public DeletePromptResult call() throws Exception {
                DeletePromptResult result = null;

                try {
                    result = executeDeletePrompt(finalRequest);
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
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request) {

        return deleteQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(final DeleteQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {
        final DeleteQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueResult>() {
            @Override
            public DeleteQueueResult call() throws Exception {
                DeleteQueueResult result = null;

                try {
                    result = executeDeleteQueue(finalRequest);
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
    public java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(DeleteQuickConnectRequest request) {

        return deleteQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuickConnectResult> deleteQuickConnectAsync(final DeleteQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQuickConnectRequest, DeleteQuickConnectResult> asyncHandler) {
        final DeleteQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQuickConnectResult>() {
            @Override
            public DeleteQuickConnectResult call() throws Exception {
                DeleteQuickConnectResult result = null;

                try {
                    result = executeDeleteQuickConnect(finalRequest);
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
    public java.util.concurrent.Future<DeleteRoutingProfileResult> deleteRoutingProfileAsync(DeleteRoutingProfileRequest request) {

        return deleteRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoutingProfileResult> deleteRoutingProfileAsync(final DeleteRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoutingProfileRequest, DeleteRoutingProfileResult> asyncHandler) {
        final DeleteRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoutingProfileResult>() {
            @Override
            public DeleteRoutingProfileResult call() throws Exception {
                DeleteRoutingProfileResult result = null;

                try {
                    result = executeDeleteRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(DeleteSecurityProfileRequest request) {

        return deleteSecurityProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityProfileResult> deleteSecurityProfileAsync(final DeleteSecurityProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityProfileRequest, DeleteSecurityProfileResult> asyncHandler) {
        final DeleteSecurityProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityProfileResult>() {
            @Override
            public DeleteSecurityProfileResult call() throws Exception {
                DeleteSecurityProfileResult result = null;

                try {
                    result = executeDeleteSecurityProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(DeleteTaskTemplateRequest request) {

        return deleteTaskTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTaskTemplateResult> deleteTaskTemplateAsync(final DeleteTaskTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTaskTemplateRequest, DeleteTaskTemplateResult> asyncHandler) {
        final DeleteTaskTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTaskTemplateResult>() {
            @Override
            public DeleteTaskTemplateResult call() throws Exception {
                DeleteTaskTemplateResult result = null;

                try {
                    result = executeDeleteTaskTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(DeleteTrafficDistributionGroupRequest request) {

        return deleteTrafficDistributionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficDistributionGroupResult> deleteTrafficDistributionGroupAsync(
            final DeleteTrafficDistributionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficDistributionGroupRequest, DeleteTrafficDistributionGroupResult> asyncHandler) {
        final DeleteTrafficDistributionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficDistributionGroupResult>() {
            @Override
            public DeleteTrafficDistributionGroupResult call() throws Exception {
                DeleteTrafficDistributionGroupResult result = null;

                try {
                    result = executeDeleteTrafficDistributionGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(DeleteUseCaseRequest request) {

        return deleteUseCaseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUseCaseResult> deleteUseCaseAsync(final DeleteUseCaseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUseCaseRequest, DeleteUseCaseResult> asyncHandler) {
        final DeleteUseCaseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUseCaseResult>() {
            @Override
            public DeleteUseCaseResult call() throws Exception {
                DeleteUseCaseResult result = null;

                try {
                    result = executeDeleteUseCase(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
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
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(DeleteUserHierarchyGroupRequest request) {

        return deleteUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserHierarchyGroupResult> deleteUserHierarchyGroupAsync(final DeleteUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserHierarchyGroupRequest, DeleteUserHierarchyGroupResult> asyncHandler) {
        final DeleteUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserHierarchyGroupResult>() {
            @Override
            public DeleteUserHierarchyGroupResult call() throws Exception {
                DeleteUserHierarchyGroupResult result = null;

                try {
                    result = executeDeleteUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(DeleteViewRequest request) {

        return deleteViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteViewResult> deleteViewAsync(final DeleteViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteViewRequest, DeleteViewResult> asyncHandler) {
        final DeleteViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteViewResult>() {
            @Override
            public DeleteViewResult call() throws Exception {
                DeleteViewResult result = null;

                try {
                    result = executeDeleteView(finalRequest);
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
    public java.util.concurrent.Future<DeleteViewVersionResult> deleteViewVersionAsync(DeleteViewVersionRequest request) {

        return deleteViewVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteViewVersionResult> deleteViewVersionAsync(final DeleteViewVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteViewVersionRequest, DeleteViewVersionResult> asyncHandler) {
        final DeleteViewVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteViewVersionResult>() {
            @Override
            public DeleteViewVersionResult call() throws Exception {
                DeleteViewVersionResult result = null;

                try {
                    result = executeDeleteViewVersion(finalRequest);
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
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(DeleteVocabularyRequest request) {

        return deleteVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVocabularyResult> deleteVocabularyAsync(final DeleteVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVocabularyRequest, DeleteVocabularyResult> asyncHandler) {
        final DeleteVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVocabularyResult>() {
            @Override
            public DeleteVocabularyResult call() throws Exception {
                DeleteVocabularyResult result = null;

                try {
                    result = executeDeleteVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DescribeAgentStatusResult> describeAgentStatusAsync(DescribeAgentStatusRequest request) {

        return describeAgentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAgentStatusResult> describeAgentStatusAsync(final DescribeAgentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAgentStatusRequest, DescribeAgentStatusResult> asyncHandler) {
        final DescribeAgentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAgentStatusResult>() {
            @Override
            public DescribeAgentStatusResult call() throws Exception {
                DescribeAgentStatusResult result = null;

                try {
                    result = executeDescribeAgentStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest request) {

        return describeContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactResult> describeContactAsync(final DescribeContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler) {
        final DescribeContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactResult>() {
            @Override
            public DescribeContactResult call() throws Exception {
                DescribeContactResult result = null;

                try {
                    result = executeDescribeContact(finalRequest);
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
    public java.util.concurrent.Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(DescribeContactEvaluationRequest request) {

        return describeContactEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactEvaluationResult> describeContactEvaluationAsync(final DescribeContactEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactEvaluationRequest, DescribeContactEvaluationResult> asyncHandler) {
        final DescribeContactEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactEvaluationResult>() {
            @Override
            public DescribeContactEvaluationResult call() throws Exception {
                DescribeContactEvaluationResult result = null;

                try {
                    result = executeDescribeContactEvaluation(finalRequest);
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
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(DescribeContactFlowRequest request) {

        return describeContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactFlowResult> describeContactFlowAsync(final DescribeContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactFlowRequest, DescribeContactFlowResult> asyncHandler) {
        final DescribeContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactFlowResult>() {
            @Override
            public DescribeContactFlowResult call() throws Exception {
                DescribeContactFlowResult result = null;

                try {
                    result = executeDescribeContactFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(DescribeContactFlowModuleRequest request) {

        return describeContactFlowModuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeContactFlowModuleResult> describeContactFlowModuleAsync(final DescribeContactFlowModuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeContactFlowModuleRequest, DescribeContactFlowModuleResult> asyncHandler) {
        final DescribeContactFlowModuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeContactFlowModuleResult>() {
            @Override
            public DescribeContactFlowModuleResult call() throws Exception {
                DescribeContactFlowModuleResult result = null;

                try {
                    result = executeDescribeContactFlowModule(finalRequest);
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
    public java.util.concurrent.Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(DescribeEvaluationFormRequest request) {

        return describeEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEvaluationFormResult> describeEvaluationFormAsync(final DescribeEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEvaluationFormRequest, DescribeEvaluationFormResult> asyncHandler) {
        final DescribeEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEvaluationFormResult>() {
            @Override
            public DescribeEvaluationFormResult call() throws Exception {
                DescribeEvaluationFormResult result = null;

                try {
                    result = executeDescribeEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(DescribeHoursOfOperationRequest request) {

        return describeHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHoursOfOperationResult> describeHoursOfOperationAsync(final DescribeHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHoursOfOperationRequest, DescribeHoursOfOperationResult> asyncHandler) {
        final DescribeHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHoursOfOperationResult>() {
            @Override
            public DescribeHoursOfOperationResult call() throws Exception {
                DescribeHoursOfOperationResult result = null;

                try {
                    result = executeDescribeHoursOfOperation(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest request) {

        return describeInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(final DescribeInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler) {
        final DescribeInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceResult>() {
            @Override
            public DescribeInstanceResult call() throws Exception {
                DescribeInstanceResult result = null;

                try {
                    result = executeDescribeInstance(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest request) {

        return describeInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(final DescribeInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler) {
        final DescribeInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceAttributeResult>() {
            @Override
            public DescribeInstanceAttributeResult call() throws Exception {
                DescribeInstanceAttributeResult result = null;

                try {
                    result = executeDescribeInstanceAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(DescribeInstanceStorageConfigRequest request) {

        return describeInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceStorageConfigResult> describeInstanceStorageConfigAsync(
            final DescribeInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceStorageConfigRequest, DescribeInstanceStorageConfigResult> asyncHandler) {
        final DescribeInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstanceStorageConfigResult>() {
            @Override
            public DescribeInstanceStorageConfigResult call() throws Exception {
                DescribeInstanceStorageConfigResult result = null;

                try {
                    result = executeDescribeInstanceStorageConfig(finalRequest);
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
    public java.util.concurrent.Future<DescribePhoneNumberResult> describePhoneNumberAsync(DescribePhoneNumberRequest request) {

        return describePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePhoneNumberResult> describePhoneNumberAsync(final DescribePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePhoneNumberRequest, DescribePhoneNumberResult> asyncHandler) {
        final DescribePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePhoneNumberResult>() {
            @Override
            public DescribePhoneNumberResult call() throws Exception {
                DescribePhoneNumberResult result = null;

                try {
                    result = executeDescribePhoneNumber(finalRequest);
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
    public java.util.concurrent.Future<DescribePredefinedAttributeResult> describePredefinedAttributeAsync(DescribePredefinedAttributeRequest request) {

        return describePredefinedAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePredefinedAttributeResult> describePredefinedAttributeAsync(final DescribePredefinedAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePredefinedAttributeRequest, DescribePredefinedAttributeResult> asyncHandler) {
        final DescribePredefinedAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePredefinedAttributeResult>() {
            @Override
            public DescribePredefinedAttributeResult call() throws Exception {
                DescribePredefinedAttributeResult result = null;

                try {
                    result = executeDescribePredefinedAttribute(finalRequest);
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
    public java.util.concurrent.Future<DescribePromptResult> describePromptAsync(DescribePromptRequest request) {

        return describePromptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePromptResult> describePromptAsync(final DescribePromptRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePromptRequest, DescribePromptResult> asyncHandler) {
        final DescribePromptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePromptResult>() {
            @Override
            public DescribePromptResult call() throws Exception {
                DescribePromptResult result = null;

                try {
                    result = executeDescribePrompt(finalRequest);
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
    public java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(DescribeQueueRequest request) {

        return describeQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueueResult> describeQueueAsync(final DescribeQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQueueRequest, DescribeQueueResult> asyncHandler) {
        final DescribeQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQueueResult>() {
            @Override
            public DescribeQueueResult call() throws Exception {
                DescribeQueueResult result = null;

                try {
                    result = executeDescribeQueue(finalRequest);
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
    public java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(DescribeQuickConnectRequest request) {

        return describeQuickConnectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQuickConnectResult> describeQuickConnectAsync(final DescribeQuickConnectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeQuickConnectRequest, DescribeQuickConnectResult> asyncHandler) {
        final DescribeQuickConnectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeQuickConnectResult>() {
            @Override
            public DescribeQuickConnectResult call() throws Exception {
                DescribeQuickConnectResult result = null;

                try {
                    result = executeDescribeQuickConnect(finalRequest);
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
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(DescribeRoutingProfileRequest request) {

        return describeRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRoutingProfileResult> describeRoutingProfileAsync(final DescribeRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRoutingProfileRequest, DescribeRoutingProfileResult> asyncHandler) {
        final DescribeRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRoutingProfileResult>() {
            @Override
            public DescribeRoutingProfileResult call() throws Exception {
                DescribeRoutingProfileResult result = null;

                try {
                    result = executeDescribeRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(final DescribeRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {
        final DescribeRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleResult>() {
            @Override
            public DescribeRuleResult call() throws Exception {
                DescribeRuleResult result = null;

                try {
                    result = executeDescribeRule(finalRequest);
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
    public java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(DescribeSecurityProfileRequest request) {

        return describeSecurityProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSecurityProfileResult> describeSecurityProfileAsync(final DescribeSecurityProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSecurityProfileRequest, DescribeSecurityProfileResult> asyncHandler) {
        final DescribeSecurityProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSecurityProfileResult>() {
            @Override
            public DescribeSecurityProfileResult call() throws Exception {
                DescribeSecurityProfileResult result = null;

                try {
                    result = executeDescribeSecurityProfile(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            DescribeTrafficDistributionGroupRequest request) {

        return describeTrafficDistributionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrafficDistributionGroupResult> describeTrafficDistributionGroupAsync(
            final DescribeTrafficDistributionGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrafficDistributionGroupRequest, DescribeTrafficDistributionGroupResult> asyncHandler) {
        final DescribeTrafficDistributionGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrafficDistributionGroupResult>() {
            @Override
            public DescribeTrafficDistributionGroupResult call() throws Exception {
                DescribeTrafficDistributionGroupResult result = null;

                try {
                    result = executeDescribeTrafficDistributionGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(DescribeUserHierarchyGroupRequest request) {

        return describeUserHierarchyGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyGroupResult> describeUserHierarchyGroupAsync(final DescribeUserHierarchyGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyGroupRequest, DescribeUserHierarchyGroupResult> asyncHandler) {
        final DescribeUserHierarchyGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyGroupResult>() {
            @Override
            public DescribeUserHierarchyGroupResult call() throws Exception {
                DescribeUserHierarchyGroupResult result = null;

                try {
                    result = executeDescribeUserHierarchyGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(DescribeUserHierarchyStructureRequest request) {

        return describeUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserHierarchyStructureResult> describeUserHierarchyStructureAsync(
            final DescribeUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserHierarchyStructureRequest, DescribeUserHierarchyStructureResult> asyncHandler) {
        final DescribeUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserHierarchyStructureResult>() {
            @Override
            public DescribeUserHierarchyStructureResult call() throws Exception {
                DescribeUserHierarchyStructureResult result = null;

                try {
                    result = executeDescribeUserHierarchyStructure(finalRequest);
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
    public java.util.concurrent.Future<DescribeViewResult> describeViewAsync(DescribeViewRequest request) {

        return describeViewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeViewResult> describeViewAsync(final DescribeViewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeViewRequest, DescribeViewResult> asyncHandler) {
        final DescribeViewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeViewResult>() {
            @Override
            public DescribeViewResult call() throws Exception {
                DescribeViewResult result = null;

                try {
                    result = executeDescribeView(finalRequest);
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
    public java.util.concurrent.Future<DescribeVocabularyResult> describeVocabularyAsync(DescribeVocabularyRequest request) {

        return describeVocabularyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVocabularyResult> describeVocabularyAsync(final DescribeVocabularyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVocabularyRequest, DescribeVocabularyResult> asyncHandler) {
        final DescribeVocabularyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVocabularyResult>() {
            @Override
            public DescribeVocabularyResult call() throws Exception {
                DescribeVocabularyResult result = null;

                try {
                    result = executeDescribeVocabulary(finalRequest);
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
    public java.util.concurrent.Future<DisassociateAnalyticsDataSetResult> disassociateAnalyticsDataSetAsync(DisassociateAnalyticsDataSetRequest request) {

        return disassociateAnalyticsDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAnalyticsDataSetResult> disassociateAnalyticsDataSetAsync(final DisassociateAnalyticsDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAnalyticsDataSetRequest, DisassociateAnalyticsDataSetResult> asyncHandler) {
        final DisassociateAnalyticsDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAnalyticsDataSetResult>() {
            @Override
            public DisassociateAnalyticsDataSetResult call() throws Exception {
                DisassociateAnalyticsDataSetResult result = null;

                try {
                    result = executeDisassociateAnalyticsDataSet(finalRequest);
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
    public java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(DisassociateApprovedOriginRequest request) {

        return disassociateApprovedOriginAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateApprovedOriginResult> disassociateApprovedOriginAsync(final DisassociateApprovedOriginRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateApprovedOriginRequest, DisassociateApprovedOriginResult> asyncHandler) {
        final DisassociateApprovedOriginRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateApprovedOriginResult>() {
            @Override
            public DisassociateApprovedOriginResult call() throws Exception {
                DisassociateApprovedOriginResult result = null;

                try {
                    result = executeDisassociateApprovedOrigin(finalRequest);
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
    public java.util.concurrent.Future<DisassociateBotResult> disassociateBotAsync(DisassociateBotRequest request) {

        return disassociateBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateBotResult> disassociateBotAsync(final DisassociateBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateBotRequest, DisassociateBotResult> asyncHandler) {
        final DisassociateBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateBotResult>() {
            @Override
            public DisassociateBotResult call() throws Exception {
                DisassociateBotResult result = null;

                try {
                    result = executeDisassociateBot(finalRequest);
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
    public java.util.concurrent.Future<DisassociateFlowResult> disassociateFlowAsync(DisassociateFlowRequest request) {

        return disassociateFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFlowResult> disassociateFlowAsync(final DisassociateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFlowRequest, DisassociateFlowResult> asyncHandler) {
        final DisassociateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFlowResult>() {
            @Override
            public DisassociateFlowResult call() throws Exception {
                DisassociateFlowResult result = null;

                try {
                    result = executeDisassociateFlow(finalRequest);
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
    public java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            DisassociateInstanceStorageConfigRequest request) {

        return disassociateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateInstanceStorageConfigResult> disassociateInstanceStorageConfigAsync(
            final DisassociateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateInstanceStorageConfigRequest, DisassociateInstanceStorageConfigResult> asyncHandler) {
        final DisassociateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateInstanceStorageConfigResult>() {
            @Override
            public DisassociateInstanceStorageConfigResult call() throws Exception {
                DisassociateInstanceStorageConfigResult result = null;

                try {
                    result = executeDisassociateInstanceStorageConfig(finalRequest);
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
    public java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(DisassociateLambdaFunctionRequest request) {

        return disassociateLambdaFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLambdaFunctionResult> disassociateLambdaFunctionAsync(final DisassociateLambdaFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLambdaFunctionRequest, DisassociateLambdaFunctionResult> asyncHandler) {
        final DisassociateLambdaFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLambdaFunctionResult>() {
            @Override
            public DisassociateLambdaFunctionResult call() throws Exception {
                DisassociateLambdaFunctionResult result = null;

                try {
                    result = executeDisassociateLambdaFunction(finalRequest);
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
    public java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(DisassociateLexBotRequest request) {

        return disassociateLexBotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLexBotResult> disassociateLexBotAsync(final DisassociateLexBotRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLexBotRequest, DisassociateLexBotResult> asyncHandler) {
        final DisassociateLexBotRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLexBotResult>() {
            @Override
            public DisassociateLexBotResult call() throws Exception {
                DisassociateLexBotResult result = null;

                try {
                    result = executeDisassociateLexBot(finalRequest);
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
    public java.util.concurrent.Future<DisassociatePhoneNumberContactFlowResult> disassociatePhoneNumberContactFlowAsync(
            DisassociatePhoneNumberContactFlowRequest request) {

        return disassociatePhoneNumberContactFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumberContactFlowResult> disassociatePhoneNumberContactFlowAsync(
            final DisassociatePhoneNumberContactFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumberContactFlowRequest, DisassociatePhoneNumberContactFlowResult> asyncHandler) {
        final DisassociatePhoneNumberContactFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumberContactFlowResult>() {
            @Override
            public DisassociatePhoneNumberContactFlowResult call() throws Exception {
                DisassociatePhoneNumberContactFlowResult result = null;

                try {
                    result = executeDisassociatePhoneNumberContactFlow(finalRequest);
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
    public java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(DisassociateQueueQuickConnectsRequest request) {

        return disassociateQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateQueueQuickConnectsResult> disassociateQueueQuickConnectsAsync(
            final DisassociateQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateQueueQuickConnectsRequest, DisassociateQueueQuickConnectsResult> asyncHandler) {
        final DisassociateQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateQueueQuickConnectsResult>() {
            @Override
            public DisassociateQueueQuickConnectsResult call() throws Exception {
                DisassociateQueueQuickConnectsResult result = null;

                try {
                    result = executeDisassociateQueueQuickConnects(finalRequest);
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
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            DisassociateRoutingProfileQueuesRequest request) {

        return disassociateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRoutingProfileQueuesResult> disassociateRoutingProfileQueuesAsync(
            final DisassociateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRoutingProfileQueuesRequest, DisassociateRoutingProfileQueuesResult> asyncHandler) {
        final DisassociateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRoutingProfileQueuesResult>() {
            @Override
            public DisassociateRoutingProfileQueuesResult call() throws Exception {
                DisassociateRoutingProfileQueuesResult result = null;

                try {
                    result = executeDisassociateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(DisassociateSecurityKeyRequest request) {

        return disassociateSecurityKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateSecurityKeyResult> disassociateSecurityKeyAsync(final DisassociateSecurityKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateSecurityKeyRequest, DisassociateSecurityKeyResult> asyncHandler) {
        final DisassociateSecurityKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateSecurityKeyResult>() {
            @Override
            public DisassociateSecurityKeyResult call() throws Exception {
                DisassociateSecurityKeyResult result = null;

                try {
                    result = executeDisassociateSecurityKey(finalRequest);
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
    public java.util.concurrent.Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            DisassociateTrafficDistributionGroupUserRequest request) {

        return disassociateTrafficDistributionGroupUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrafficDistributionGroupUserResult> disassociateTrafficDistributionGroupUserAsync(
            final DisassociateTrafficDistributionGroupUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTrafficDistributionGroupUserRequest, DisassociateTrafficDistributionGroupUserResult> asyncHandler) {
        final DisassociateTrafficDistributionGroupUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTrafficDistributionGroupUserResult>() {
            @Override
            public DisassociateTrafficDistributionGroupUserResult call() throws Exception {
                DisassociateTrafficDistributionGroupUserResult result = null;

                try {
                    result = executeDisassociateTrafficDistributionGroupUser(finalRequest);
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
    public java.util.concurrent.Future<DisassociateUserProficienciesResult> disassociateUserProficienciesAsync(DisassociateUserProficienciesRequest request) {

        return disassociateUserProficienciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserProficienciesResult> disassociateUserProficienciesAsync(
            final DisassociateUserProficienciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateUserProficienciesRequest, DisassociateUserProficienciesResult> asyncHandler) {
        final DisassociateUserProficienciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateUserProficienciesResult>() {
            @Override
            public DisassociateUserProficienciesResult call() throws Exception {
                DisassociateUserProficienciesResult result = null;

                try {
                    result = executeDisassociateUserProficiencies(finalRequest);
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
    public java.util.concurrent.Future<DismissUserContactResult> dismissUserContactAsync(DismissUserContactRequest request) {

        return dismissUserContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DismissUserContactResult> dismissUserContactAsync(final DismissUserContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<DismissUserContactRequest, DismissUserContactResult> asyncHandler) {
        final DismissUserContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DismissUserContactResult>() {
            @Override
            public DismissUserContactResult call() throws Exception {
                DismissUserContactResult result = null;

                try {
                    result = executeDismissUserContact(finalRequest);
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
    public java.util.concurrent.Future<GetAttachedFileResult> getAttachedFileAsync(GetAttachedFileRequest request) {

        return getAttachedFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttachedFileResult> getAttachedFileAsync(final GetAttachedFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttachedFileRequest, GetAttachedFileResult> asyncHandler) {
        final GetAttachedFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAttachedFileResult>() {
            @Override
            public GetAttachedFileResult call() throws Exception {
                GetAttachedFileResult result = null;

                try {
                    result = executeGetAttachedFile(finalRequest);
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
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(GetContactAttributesRequest request) {

        return getContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContactAttributesResult> getContactAttributesAsync(final GetContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetContactAttributesRequest, GetContactAttributesResult> asyncHandler) {
        final GetContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetContactAttributesResult>() {
            @Override
            public GetContactAttributesResult call() throws Exception {
                GetContactAttributesResult result = null;

                try {
                    result = executeGetContactAttributes(finalRequest);
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
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(GetCurrentMetricDataRequest request) {

        return getCurrentMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCurrentMetricDataResult> getCurrentMetricDataAsync(final GetCurrentMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCurrentMetricDataRequest, GetCurrentMetricDataResult> asyncHandler) {
        final GetCurrentMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCurrentMetricDataResult>() {
            @Override
            public GetCurrentMetricDataResult call() throws Exception {
                GetCurrentMetricDataResult result = null;

                try {
                    result = executeGetCurrentMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetCurrentUserDataResult> getCurrentUserDataAsync(GetCurrentUserDataRequest request) {

        return getCurrentUserDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCurrentUserDataResult> getCurrentUserDataAsync(final GetCurrentUserDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCurrentUserDataRequest, GetCurrentUserDataResult> asyncHandler) {
        final GetCurrentUserDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCurrentUserDataResult>() {
            @Override
            public GetCurrentUserDataResult call() throws Exception {
                GetCurrentUserDataResult result = null;

                try {
                    result = executeGetCurrentUserData(finalRequest);
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
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest request) {

        return getFederationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(final GetFederationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler) {
        final GetFederationTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFederationTokenResult>() {
            @Override
            public GetFederationTokenResult call() throws Exception {
                GetFederationTokenResult result = null;

                try {
                    result = executeGetFederationToken(finalRequest);
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
    public java.util.concurrent.Future<GetFlowAssociationResult> getFlowAssociationAsync(GetFlowAssociationRequest request) {

        return getFlowAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFlowAssociationResult> getFlowAssociationAsync(final GetFlowAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFlowAssociationRequest, GetFlowAssociationResult> asyncHandler) {
        final GetFlowAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFlowAssociationResult>() {
            @Override
            public GetFlowAssociationResult call() throws Exception {
                GetFlowAssociationResult result = null;

                try {
                    result = executeGetFlowAssociation(finalRequest);
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
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest request) {

        return getMetricDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataResult> getMetricDataAsync(final GetMetricDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler) {
        final GetMetricDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricDataResult>() {
            @Override
            public GetMetricDataResult call() throws Exception {
                GetMetricDataResult result = null;

                try {
                    result = executeGetMetricData(finalRequest);
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
    public java.util.concurrent.Future<GetMetricDataV2Result> getMetricDataV2Async(GetMetricDataV2Request request) {

        return getMetricDataV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMetricDataV2Result> getMetricDataV2Async(final GetMetricDataV2Request request,
            final com.amazonaws.handlers.AsyncHandler<GetMetricDataV2Request, GetMetricDataV2Result> asyncHandler) {
        final GetMetricDataV2Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMetricDataV2Result>() {
            @Override
            public GetMetricDataV2Result call() throws Exception {
                GetMetricDataV2Result result = null;

                try {
                    result = executeGetMetricDataV2(finalRequest);
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
    public java.util.concurrent.Future<GetPromptFileResult> getPromptFileAsync(GetPromptFileRequest request) {

        return getPromptFileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPromptFileResult> getPromptFileAsync(final GetPromptFileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPromptFileRequest, GetPromptFileResult> asyncHandler) {
        final GetPromptFileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPromptFileResult>() {
            @Override
            public GetPromptFileResult call() throws Exception {
                GetPromptFileResult result = null;

                try {
                    result = executeGetPromptFile(finalRequest);
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
    public java.util.concurrent.Future<GetTaskTemplateResult> getTaskTemplateAsync(GetTaskTemplateRequest request) {

        return getTaskTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTaskTemplateResult> getTaskTemplateAsync(final GetTaskTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTaskTemplateRequest, GetTaskTemplateResult> asyncHandler) {
        final GetTaskTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTaskTemplateResult>() {
            @Override
            public GetTaskTemplateResult call() throws Exception {
                GetTaskTemplateResult result = null;

                try {
                    result = executeGetTaskTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetTrafficDistributionResult> getTrafficDistributionAsync(GetTrafficDistributionRequest request) {

        return getTrafficDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficDistributionResult> getTrafficDistributionAsync(final GetTrafficDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficDistributionRequest, GetTrafficDistributionResult> asyncHandler) {
        final GetTrafficDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficDistributionResult>() {
            @Override
            public GetTrafficDistributionResult call() throws Exception {
                GetTrafficDistributionResult result = null;

                try {
                    result = executeGetTrafficDistribution(finalRequest);
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
    public java.util.concurrent.Future<ImportPhoneNumberResult> importPhoneNumberAsync(ImportPhoneNumberRequest request) {

        return importPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportPhoneNumberResult> importPhoneNumberAsync(final ImportPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportPhoneNumberRequest, ImportPhoneNumberResult> asyncHandler) {
        final ImportPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportPhoneNumberResult>() {
            @Override
            public ImportPhoneNumberResult call() throws Exception {
                ImportPhoneNumberResult result = null;

                try {
                    result = executeImportPhoneNumber(finalRequest);
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
    public java.util.concurrent.Future<ListAgentStatusesResult> listAgentStatusesAsync(ListAgentStatusesRequest request) {

        return listAgentStatusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAgentStatusesResult> listAgentStatusesAsync(final ListAgentStatusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAgentStatusesRequest, ListAgentStatusesResult> asyncHandler) {
        final ListAgentStatusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAgentStatusesResult>() {
            @Override
            public ListAgentStatusesResult call() throws Exception {
                ListAgentStatusesResult result = null;

                try {
                    result = executeListAgentStatuses(finalRequest);
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
    public java.util.concurrent.Future<ListAnalyticsDataAssociationsResult> listAnalyticsDataAssociationsAsync(ListAnalyticsDataAssociationsRequest request) {

        return listAnalyticsDataAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalyticsDataAssociationsResult> listAnalyticsDataAssociationsAsync(
            final ListAnalyticsDataAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnalyticsDataAssociationsRequest, ListAnalyticsDataAssociationsResult> asyncHandler) {
        final ListAnalyticsDataAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnalyticsDataAssociationsResult>() {
            @Override
            public ListAnalyticsDataAssociationsResult call() throws Exception {
                ListAnalyticsDataAssociationsResult result = null;

                try {
                    result = executeListAnalyticsDataAssociations(finalRequest);
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
    public java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(ListApprovedOriginsRequest request) {

        return listApprovedOriginsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApprovedOriginsResult> listApprovedOriginsAsync(final ListApprovedOriginsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApprovedOriginsRequest, ListApprovedOriginsResult> asyncHandler) {
        final ListApprovedOriginsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApprovedOriginsResult>() {
            @Override
            public ListApprovedOriginsResult call() throws Exception {
                ListApprovedOriginsResult result = null;

                try {
                    result = executeListApprovedOrigins(finalRequest);
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
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest request) {

        return listBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBotsResult> listBotsAsync(final ListBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler) {
        final ListBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBotsResult>() {
            @Override
            public ListBotsResult call() throws Exception {
                ListBotsResult result = null;

                try {
                    result = executeListBots(finalRequest);
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
    public java.util.concurrent.Future<ListContactEvaluationsResult> listContactEvaluationsAsync(ListContactEvaluationsRequest request) {

        return listContactEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactEvaluationsResult> listContactEvaluationsAsync(final ListContactEvaluationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactEvaluationsRequest, ListContactEvaluationsResult> asyncHandler) {
        final ListContactEvaluationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactEvaluationsResult>() {
            @Override
            public ListContactEvaluationsResult call() throws Exception {
                ListContactEvaluationsResult result = null;

                try {
                    result = executeListContactEvaluations(finalRequest);
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
    public java.util.concurrent.Future<ListContactFlowModulesResult> listContactFlowModulesAsync(ListContactFlowModulesRequest request) {

        return listContactFlowModulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactFlowModulesResult> listContactFlowModulesAsync(final ListContactFlowModulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactFlowModulesRequest, ListContactFlowModulesResult> asyncHandler) {
        final ListContactFlowModulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactFlowModulesResult>() {
            @Override
            public ListContactFlowModulesResult call() throws Exception {
                ListContactFlowModulesResult result = null;

                try {
                    result = executeListContactFlowModules(finalRequest);
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
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(ListContactFlowsRequest request) {

        return listContactFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactFlowsResult> listContactFlowsAsync(final ListContactFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactFlowsRequest, ListContactFlowsResult> asyncHandler) {
        final ListContactFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactFlowsResult>() {
            @Override
            public ListContactFlowsResult call() throws Exception {
                ListContactFlowsResult result = null;

                try {
                    result = executeListContactFlows(finalRequest);
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
    public java.util.concurrent.Future<ListContactReferencesResult> listContactReferencesAsync(ListContactReferencesRequest request) {

        return listContactReferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListContactReferencesResult> listContactReferencesAsync(final ListContactReferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListContactReferencesRequest, ListContactReferencesResult> asyncHandler) {
        final ListContactReferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListContactReferencesResult>() {
            @Override
            public ListContactReferencesResult call() throws Exception {
                ListContactReferencesResult result = null;

                try {
                    result = executeListContactReferences(finalRequest);
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
    public java.util.concurrent.Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(ListDefaultVocabulariesRequest request) {

        return listDefaultVocabulariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDefaultVocabulariesResult> listDefaultVocabulariesAsync(final ListDefaultVocabulariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDefaultVocabulariesRequest, ListDefaultVocabulariesResult> asyncHandler) {
        final ListDefaultVocabulariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDefaultVocabulariesResult>() {
            @Override
            public ListDefaultVocabulariesResult call() throws Exception {
                ListDefaultVocabulariesResult result = null;

                try {
                    result = executeListDefaultVocabularies(finalRequest);
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
    public java.util.concurrent.Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(ListEvaluationFormVersionsRequest request) {

        return listEvaluationFormVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEvaluationFormVersionsResult> listEvaluationFormVersionsAsync(final ListEvaluationFormVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEvaluationFormVersionsRequest, ListEvaluationFormVersionsResult> asyncHandler) {
        final ListEvaluationFormVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEvaluationFormVersionsResult>() {
            @Override
            public ListEvaluationFormVersionsResult call() throws Exception {
                ListEvaluationFormVersionsResult result = null;

                try {
                    result = executeListEvaluationFormVersions(finalRequest);
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
    public java.util.concurrent.Future<ListEvaluationFormsResult> listEvaluationFormsAsync(ListEvaluationFormsRequest request) {

        return listEvaluationFormsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEvaluationFormsResult> listEvaluationFormsAsync(final ListEvaluationFormsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEvaluationFormsRequest, ListEvaluationFormsResult> asyncHandler) {
        final ListEvaluationFormsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEvaluationFormsResult>() {
            @Override
            public ListEvaluationFormsResult call() throws Exception {
                ListEvaluationFormsResult result = null;

                try {
                    result = executeListEvaluationForms(finalRequest);
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
    public java.util.concurrent.Future<ListFlowAssociationsResult> listFlowAssociationsAsync(ListFlowAssociationsRequest request) {

        return listFlowAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowAssociationsResult> listFlowAssociationsAsync(final ListFlowAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowAssociationsRequest, ListFlowAssociationsResult> asyncHandler) {
        final ListFlowAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowAssociationsResult>() {
            @Override
            public ListFlowAssociationsResult call() throws Exception {
                ListFlowAssociationsResult result = null;

                try {
                    result = executeListFlowAssociations(finalRequest);
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
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(ListHoursOfOperationsRequest request) {

        return listHoursOfOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHoursOfOperationsResult> listHoursOfOperationsAsync(final ListHoursOfOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHoursOfOperationsRequest, ListHoursOfOperationsResult> asyncHandler) {
        final ListHoursOfOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHoursOfOperationsResult>() {
            @Override
            public ListHoursOfOperationsResult call() throws Exception {
                ListHoursOfOperationsResult result = null;

                try {
                    result = executeListHoursOfOperations(finalRequest);
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
    public java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(ListInstanceAttributesRequest request) {

        return listInstanceAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceAttributesResult> listInstanceAttributesAsync(final ListInstanceAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceAttributesRequest, ListInstanceAttributesResult> asyncHandler) {
        final ListInstanceAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceAttributesResult>() {
            @Override
            public ListInstanceAttributesResult call() throws Exception {
                ListInstanceAttributesResult result = null;

                try {
                    result = executeListInstanceAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(ListInstanceStorageConfigsRequest request) {

        return listInstanceStorageConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceStorageConfigsResult> listInstanceStorageConfigsAsync(final ListInstanceStorageConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstanceStorageConfigsRequest, ListInstanceStorageConfigsResult> asyncHandler) {
        final ListInstanceStorageConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstanceStorageConfigsResult>() {
            @Override
            public ListInstanceStorageConfigsResult call() throws Exception {
                ListInstanceStorageConfigsResult result = null;

                try {
                    result = executeListInstanceStorageConfigs(finalRequest);
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
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(final ListInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {
        final ListInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInstancesResult>() {
            @Override
            public ListInstancesResult call() throws Exception {
                ListInstancesResult result = null;

                try {
                    result = executeListInstances(finalRequest);
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
    public java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(ListIntegrationAssociationsRequest request) {

        return listIntegrationAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIntegrationAssociationsResult> listIntegrationAssociationsAsync(final ListIntegrationAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIntegrationAssociationsRequest, ListIntegrationAssociationsResult> asyncHandler) {
        final ListIntegrationAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIntegrationAssociationsResult>() {
            @Override
            public ListIntegrationAssociationsResult call() throws Exception {
                ListIntegrationAssociationsResult result = null;

                try {
                    result = executeListIntegrationAssociations(finalRequest);
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
    public java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(ListLambdaFunctionsRequest request) {

        return listLambdaFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLambdaFunctionsResult> listLambdaFunctionsAsync(final ListLambdaFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLambdaFunctionsRequest, ListLambdaFunctionsResult> asyncHandler) {
        final ListLambdaFunctionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLambdaFunctionsResult>() {
            @Override
            public ListLambdaFunctionsResult call() throws Exception {
                ListLambdaFunctionsResult result = null;

                try {
                    result = executeListLambdaFunctions(finalRequest);
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
    public java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(ListLexBotsRequest request) {

        return listLexBotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLexBotsResult> listLexBotsAsync(final ListLexBotsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLexBotsRequest, ListLexBotsResult> asyncHandler) {
        final ListLexBotsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLexBotsResult>() {
            @Override
            public ListLexBotsResult call() throws Exception {
                ListLexBotsResult result = null;

                try {
                    result = executeListLexBots(finalRequest);
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
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest request) {

        return listPhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(final ListPhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler) {
        final ListPhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersResult>() {
            @Override
            public ListPhoneNumbersResult call() throws Exception {
                ListPhoneNumbersResult result = null;

                try {
                    result = executeListPhoneNumbers(finalRequest);
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
    public java.util.concurrent.Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(ListPhoneNumbersV2Request request) {

        return listPhoneNumbersV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumbersV2Result> listPhoneNumbersV2Async(final ListPhoneNumbersV2Request request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersV2Request, ListPhoneNumbersV2Result> asyncHandler) {
        final ListPhoneNumbersV2Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumbersV2Result>() {
            @Override
            public ListPhoneNumbersV2Result call() throws Exception {
                ListPhoneNumbersV2Result result = null;

                try {
                    result = executeListPhoneNumbersV2(finalRequest);
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
    public java.util.concurrent.Future<ListPredefinedAttributesResult> listPredefinedAttributesAsync(ListPredefinedAttributesRequest request) {

        return listPredefinedAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPredefinedAttributesResult> listPredefinedAttributesAsync(final ListPredefinedAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPredefinedAttributesRequest, ListPredefinedAttributesResult> asyncHandler) {
        final ListPredefinedAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPredefinedAttributesResult>() {
            @Override
            public ListPredefinedAttributesResult call() throws Exception {
                ListPredefinedAttributesResult result = null;

                try {
                    result = executeListPredefinedAttributes(finalRequest);
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
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(ListPromptsRequest request) {

        return listPromptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPromptsResult> listPromptsAsync(final ListPromptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPromptsRequest, ListPromptsResult> asyncHandler) {
        final ListPromptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPromptsResult>() {
            @Override
            public ListPromptsResult call() throws Exception {
                ListPromptsResult result = null;

                try {
                    result = executeListPrompts(finalRequest);
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
    public java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(ListQueueQuickConnectsRequest request) {

        return listQueueQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueQuickConnectsResult> listQueueQuickConnectsAsync(final ListQueueQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueQuickConnectsRequest, ListQueueQuickConnectsResult> asyncHandler) {
        final ListQueueQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueQuickConnectsResult>() {
            @Override
            public ListQueueQuickConnectsResult call() throws Exception {
                ListQueueQuickConnectsResult result = null;

                try {
                    result = executeListQueueQuickConnects(finalRequest);
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
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
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
    public java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(ListQuickConnectsRequest request) {

        return listQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQuickConnectsResult> listQuickConnectsAsync(final ListQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQuickConnectsRequest, ListQuickConnectsResult> asyncHandler) {
        final ListQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQuickConnectsResult>() {
            @Override
            public ListQuickConnectsResult call() throws Exception {
                ListQuickConnectsResult result = null;

                try {
                    result = executeListQuickConnects(finalRequest);
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
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsV2Result> listRealtimeContactAnalysisSegmentsV2Async(
            ListRealtimeContactAnalysisSegmentsV2Request request) {

        return listRealtimeContactAnalysisSegmentsV2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRealtimeContactAnalysisSegmentsV2Result> listRealtimeContactAnalysisSegmentsV2Async(
            final ListRealtimeContactAnalysisSegmentsV2Request request,
            final com.amazonaws.handlers.AsyncHandler<ListRealtimeContactAnalysisSegmentsV2Request, ListRealtimeContactAnalysisSegmentsV2Result> asyncHandler) {
        final ListRealtimeContactAnalysisSegmentsV2Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRealtimeContactAnalysisSegmentsV2Result>() {
            @Override
            public ListRealtimeContactAnalysisSegmentsV2Result call() throws Exception {
                ListRealtimeContactAnalysisSegmentsV2Result result = null;

                try {
                    result = executeListRealtimeContactAnalysisSegmentsV2(finalRequest);
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
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(ListRoutingProfileQueuesRequest request) {

        return listRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfileQueuesResult> listRoutingProfileQueuesAsync(final ListRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfileQueuesRequest, ListRoutingProfileQueuesResult> asyncHandler) {
        final ListRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfileQueuesResult>() {
            @Override
            public ListRoutingProfileQueuesResult call() throws Exception {
                ListRoutingProfileQueuesResult result = null;

                try {
                    result = executeListRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(ListRoutingProfilesRequest request) {

        return listRoutingProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingProfilesResult> listRoutingProfilesAsync(final ListRoutingProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingProfilesRequest, ListRoutingProfilesResult> asyncHandler) {
        final ListRoutingProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingProfilesResult>() {
            @Override
            public ListRoutingProfilesResult call() throws Exception {
                ListRoutingProfilesResult result = null;

                try {
                    result = executeListRoutingProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(ListSecurityKeysRequest request) {

        return listSecurityKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityKeysResult> listSecurityKeysAsync(final ListSecurityKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityKeysRequest, ListSecurityKeysResult> asyncHandler) {
        final ListSecurityKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityKeysResult>() {
            @Override
            public ListSecurityKeysResult call() throws Exception {
                ListSecurityKeysResult result = null;

                try {
                    result = executeListSecurityKeys(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityProfileApplicationsResult> listSecurityProfileApplicationsAsync(
            ListSecurityProfileApplicationsRequest request) {

        return listSecurityProfileApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfileApplicationsResult> listSecurityProfileApplicationsAsync(
            final ListSecurityProfileApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityProfileApplicationsRequest, ListSecurityProfileApplicationsResult> asyncHandler) {
        final ListSecurityProfileApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityProfileApplicationsResult>() {
            @Override
            public ListSecurityProfileApplicationsResult call() throws Exception {
                ListSecurityProfileApplicationsResult result = null;

                try {
                    result = executeListSecurityProfileApplications(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(ListSecurityProfilePermissionsRequest request) {

        return listSecurityProfilePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfilePermissionsResult> listSecurityProfilePermissionsAsync(
            final ListSecurityProfilePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityProfilePermissionsRequest, ListSecurityProfilePermissionsResult> asyncHandler) {
        final ListSecurityProfilePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityProfilePermissionsResult>() {
            @Override
            public ListSecurityProfilePermissionsResult call() throws Exception {
                ListSecurityProfilePermissionsResult result = null;

                try {
                    result = executeListSecurityProfilePermissions(finalRequest);
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
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(ListSecurityProfilesRequest request) {

        return listSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityProfilesResult> listSecurityProfilesAsync(final ListSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityProfilesRequest, ListSecurityProfilesResult> asyncHandler) {
        final ListSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityProfilesResult>() {
            @Override
            public ListSecurityProfilesResult call() throws Exception {
                ListSecurityProfilesResult result = null;

                try {
                    result = executeListSecurityProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListTaskTemplatesResult> listTaskTemplatesAsync(ListTaskTemplatesRequest request) {

        return listTaskTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTaskTemplatesResult> listTaskTemplatesAsync(final ListTaskTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTaskTemplatesRequest, ListTaskTemplatesResult> asyncHandler) {
        final ListTaskTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTaskTemplatesResult>() {
            @Override
            public ListTaskTemplatesResult call() throws Exception {
                ListTaskTemplatesResult result = null;

                try {
                    result = executeListTaskTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            ListTrafficDistributionGroupUsersRequest request) {

        return listTrafficDistributionGroupUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficDistributionGroupUsersResult> listTrafficDistributionGroupUsersAsync(
            final ListTrafficDistributionGroupUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficDistributionGroupUsersRequest, ListTrafficDistributionGroupUsersResult> asyncHandler) {
        final ListTrafficDistributionGroupUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficDistributionGroupUsersResult>() {
            @Override
            public ListTrafficDistributionGroupUsersResult call() throws Exception {
                ListTrafficDistributionGroupUsersResult result = null;

                try {
                    result = executeListTrafficDistributionGroupUsers(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(ListTrafficDistributionGroupsRequest request) {

        return listTrafficDistributionGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficDistributionGroupsResult> listTrafficDistributionGroupsAsync(
            final ListTrafficDistributionGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficDistributionGroupsRequest, ListTrafficDistributionGroupsResult> asyncHandler) {
        final ListTrafficDistributionGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficDistributionGroupsResult>() {
            @Override
            public ListTrafficDistributionGroupsResult call() throws Exception {
                ListTrafficDistributionGroupsResult result = null;

                try {
                    result = executeListTrafficDistributionGroups(finalRequest);
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
    public java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(ListUseCasesRequest request) {

        return listUseCasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUseCasesResult> listUseCasesAsync(final ListUseCasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUseCasesRequest, ListUseCasesResult> asyncHandler) {
        final ListUseCasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUseCasesResult>() {
            @Override
            public ListUseCasesResult call() throws Exception {
                ListUseCasesResult result = null;

                try {
                    result = executeListUseCases(finalRequest);
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
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(ListUserHierarchyGroupsRequest request) {

        return listUserHierarchyGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserHierarchyGroupsResult> listUserHierarchyGroupsAsync(final ListUserHierarchyGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserHierarchyGroupsRequest, ListUserHierarchyGroupsResult> asyncHandler) {
        final ListUserHierarchyGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserHierarchyGroupsResult>() {
            @Override
            public ListUserHierarchyGroupsResult call() throws Exception {
                ListUserHierarchyGroupsResult result = null;

                try {
                    result = executeListUserHierarchyGroups(finalRequest);
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
    public java.util.concurrent.Future<ListUserProficienciesResult> listUserProficienciesAsync(ListUserProficienciesRequest request) {

        return listUserProficienciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserProficienciesResult> listUserProficienciesAsync(final ListUserProficienciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserProficienciesRequest, ListUserProficienciesResult> asyncHandler) {
        final ListUserProficienciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserProficienciesResult>() {
            @Override
            public ListUserProficienciesResult call() throws Exception {
                ListUserProficienciesResult result = null;

                try {
                    result = executeListUserProficiencies(finalRequest);
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
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
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
    public java.util.concurrent.Future<ListViewVersionsResult> listViewVersionsAsync(ListViewVersionsRequest request) {

        return listViewVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListViewVersionsResult> listViewVersionsAsync(final ListViewVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListViewVersionsRequest, ListViewVersionsResult> asyncHandler) {
        final ListViewVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListViewVersionsResult>() {
            @Override
            public ListViewVersionsResult call() throws Exception {
                ListViewVersionsResult result = null;

                try {
                    result = executeListViewVersions(finalRequest);
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
    public java.util.concurrent.Future<ListViewsResult> listViewsAsync(ListViewsRequest request) {

        return listViewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListViewsResult> listViewsAsync(final ListViewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListViewsRequest, ListViewsResult> asyncHandler) {
        final ListViewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListViewsResult>() {
            @Override
            public ListViewsResult call() throws Exception {
                ListViewsResult result = null;

                try {
                    result = executeListViews(finalRequest);
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
    public java.util.concurrent.Future<MonitorContactResult> monitorContactAsync(MonitorContactRequest request) {

        return monitorContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<MonitorContactResult> monitorContactAsync(final MonitorContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<MonitorContactRequest, MonitorContactResult> asyncHandler) {
        final MonitorContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<MonitorContactResult>() {
            @Override
            public MonitorContactResult call() throws Exception {
                MonitorContactResult result = null;

                try {
                    result = executeMonitorContact(finalRequest);
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
    public java.util.concurrent.Future<PauseContactResult> pauseContactAsync(PauseContactRequest request) {

        return pauseContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PauseContactResult> pauseContactAsync(final PauseContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<PauseContactRequest, PauseContactResult> asyncHandler) {
        final PauseContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PauseContactResult>() {
            @Override
            public PauseContactResult call() throws Exception {
                PauseContactResult result = null;

                try {
                    result = executePauseContact(finalRequest);
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
    public java.util.concurrent.Future<PutUserStatusResult> putUserStatusAsync(PutUserStatusRequest request) {

        return putUserStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutUserStatusResult> putUserStatusAsync(final PutUserStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutUserStatusRequest, PutUserStatusResult> asyncHandler) {
        final PutUserStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutUserStatusResult>() {
            @Override
            public PutUserStatusResult call() throws Exception {
                PutUserStatusResult result = null;

                try {
                    result = executePutUserStatus(finalRequest);
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
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(ReleasePhoneNumberRequest request) {

        return releasePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReleasePhoneNumberResult> releasePhoneNumberAsync(final ReleasePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReleasePhoneNumberRequest, ReleasePhoneNumberResult> asyncHandler) {
        final ReleasePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReleasePhoneNumberResult>() {
            @Override
            public ReleasePhoneNumberResult call() throws Exception {
                ReleasePhoneNumberResult result = null;

                try {
                    result = executeReleasePhoneNumber(finalRequest);
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
    public java.util.concurrent.Future<ReplicateInstanceResult> replicateInstanceAsync(ReplicateInstanceRequest request) {

        return replicateInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicateInstanceResult> replicateInstanceAsync(final ReplicateInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReplicateInstanceRequest, ReplicateInstanceResult> asyncHandler) {
        final ReplicateInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReplicateInstanceResult>() {
            @Override
            public ReplicateInstanceResult call() throws Exception {
                ReplicateInstanceResult result = null;

                try {
                    result = executeReplicateInstance(finalRequest);
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
    public java.util.concurrent.Future<ResumeContactResult> resumeContactAsync(ResumeContactRequest request) {

        return resumeContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeContactResult> resumeContactAsync(final ResumeContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeContactRequest, ResumeContactResult> asyncHandler) {
        final ResumeContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeContactResult>() {
            @Override
            public ResumeContactResult call() throws Exception {
                ResumeContactResult result = null;

                try {
                    result = executeResumeContact(finalRequest);
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
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(ResumeContactRecordingRequest request) {

        return resumeContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResumeContactRecordingResult> resumeContactRecordingAsync(final ResumeContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResumeContactRecordingRequest, ResumeContactRecordingResult> asyncHandler) {
        final ResumeContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResumeContactRecordingResult>() {
            @Override
            public ResumeContactRecordingResult call() throws Exception {
                ResumeContactRecordingResult result = null;

                try {
                    result = executeResumeContactRecording(finalRequest);
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
    public java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(SearchAvailablePhoneNumbersRequest request) {

        return searchAvailablePhoneNumbersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(final SearchAvailablePhoneNumbersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler) {
        final SearchAvailablePhoneNumbersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAvailablePhoneNumbersResult>() {
            @Override
            public SearchAvailablePhoneNumbersResult call() throws Exception {
                SearchAvailablePhoneNumbersResult result = null;

                try {
                    result = executeSearchAvailablePhoneNumbers(finalRequest);
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
    public java.util.concurrent.Future<SearchContactFlowModulesResult> searchContactFlowModulesAsync(SearchContactFlowModulesRequest request) {

        return searchContactFlowModulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchContactFlowModulesResult> searchContactFlowModulesAsync(final SearchContactFlowModulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchContactFlowModulesRequest, SearchContactFlowModulesResult> asyncHandler) {
        final SearchContactFlowModulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchContactFlowModulesResult>() {
            @Override
            public SearchContactFlowModulesResult call() throws Exception {
                SearchContactFlowModulesResult result = null;

                try {
                    result = executeSearchContactFlowModules(finalRequest);
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
    public java.util.concurrent.Future<SearchContactFlowsResult> searchContactFlowsAsync(SearchContactFlowsRequest request) {

        return searchContactFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchContactFlowsResult> searchContactFlowsAsync(final SearchContactFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchContactFlowsRequest, SearchContactFlowsResult> asyncHandler) {
        final SearchContactFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchContactFlowsResult>() {
            @Override
            public SearchContactFlowsResult call() throws Exception {
                SearchContactFlowsResult result = null;

                try {
                    result = executeSearchContactFlows(finalRequest);
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
    public java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(SearchContactsRequest request) {

        return searchContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchContactsResult> searchContactsAsync(final SearchContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchContactsRequest, SearchContactsResult> asyncHandler) {
        final SearchContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchContactsResult>() {
            @Override
            public SearchContactsResult call() throws Exception {
                SearchContactsResult result = null;

                try {
                    result = executeSearchContacts(finalRequest);
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
    public java.util.concurrent.Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(SearchHoursOfOperationsRequest request) {

        return searchHoursOfOperationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchHoursOfOperationsResult> searchHoursOfOperationsAsync(final SearchHoursOfOperationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchHoursOfOperationsRequest, SearchHoursOfOperationsResult> asyncHandler) {
        final SearchHoursOfOperationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchHoursOfOperationsResult>() {
            @Override
            public SearchHoursOfOperationsResult call() throws Exception {
                SearchHoursOfOperationsResult result = null;

                try {
                    result = executeSearchHoursOfOperations(finalRequest);
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
    public java.util.concurrent.Future<SearchPredefinedAttributesResult> searchPredefinedAttributesAsync(SearchPredefinedAttributesRequest request) {

        return searchPredefinedAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchPredefinedAttributesResult> searchPredefinedAttributesAsync(final SearchPredefinedAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchPredefinedAttributesRequest, SearchPredefinedAttributesResult> asyncHandler) {
        final SearchPredefinedAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchPredefinedAttributesResult>() {
            @Override
            public SearchPredefinedAttributesResult call() throws Exception {
                SearchPredefinedAttributesResult result = null;

                try {
                    result = executeSearchPredefinedAttributes(finalRequest);
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
    public java.util.concurrent.Future<SearchPromptsResult> searchPromptsAsync(SearchPromptsRequest request) {

        return searchPromptsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchPromptsResult> searchPromptsAsync(final SearchPromptsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchPromptsRequest, SearchPromptsResult> asyncHandler) {
        final SearchPromptsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchPromptsResult>() {
            @Override
            public SearchPromptsResult call() throws Exception {
                SearchPromptsResult result = null;

                try {
                    result = executeSearchPrompts(finalRequest);
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
    public java.util.concurrent.Future<SearchQueuesResult> searchQueuesAsync(SearchQueuesRequest request) {

        return searchQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchQueuesResult> searchQueuesAsync(final SearchQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchQueuesRequest, SearchQueuesResult> asyncHandler) {
        final SearchQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchQueuesResult>() {
            @Override
            public SearchQueuesResult call() throws Exception {
                SearchQueuesResult result = null;

                try {
                    result = executeSearchQueues(finalRequest);
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
    public java.util.concurrent.Future<SearchQuickConnectsResult> searchQuickConnectsAsync(SearchQuickConnectsRequest request) {

        return searchQuickConnectsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchQuickConnectsResult> searchQuickConnectsAsync(final SearchQuickConnectsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchQuickConnectsRequest, SearchQuickConnectsResult> asyncHandler) {
        final SearchQuickConnectsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchQuickConnectsResult>() {
            @Override
            public SearchQuickConnectsResult call() throws Exception {
                SearchQuickConnectsResult result = null;

                try {
                    result = executeSearchQuickConnects(finalRequest);
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
    public java.util.concurrent.Future<SearchResourceTagsResult> searchResourceTagsAsync(SearchResourceTagsRequest request) {

        return searchResourceTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResourceTagsResult> searchResourceTagsAsync(final SearchResourceTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchResourceTagsRequest, SearchResourceTagsResult> asyncHandler) {
        final SearchResourceTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResourceTagsResult>() {
            @Override
            public SearchResourceTagsResult call() throws Exception {
                SearchResourceTagsResult result = null;

                try {
                    result = executeSearchResourceTags(finalRequest);
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
    public java.util.concurrent.Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(SearchRoutingProfilesRequest request) {

        return searchRoutingProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchRoutingProfilesResult> searchRoutingProfilesAsync(final SearchRoutingProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRoutingProfilesRequest, SearchRoutingProfilesResult> asyncHandler) {
        final SearchRoutingProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchRoutingProfilesResult>() {
            @Override
            public SearchRoutingProfilesResult call() throws Exception {
                SearchRoutingProfilesResult result = null;

                try {
                    result = executeSearchRoutingProfiles(finalRequest);
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
    public java.util.concurrent.Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(SearchSecurityProfilesRequest request) {

        return searchSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchSecurityProfilesResult> searchSecurityProfilesAsync(final SearchSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchSecurityProfilesRequest, SearchSecurityProfilesResult> asyncHandler) {
        final SearchSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchSecurityProfilesResult>() {
            @Override
            public SearchSecurityProfilesResult call() throws Exception {
                SearchSecurityProfilesResult result = null;

                try {
                    result = executeSearchSecurityProfiles(finalRequest);
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
    public java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(SearchUsersRequest request) {

        return searchUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchUsersResult> searchUsersAsync(final SearchUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchUsersRequest, SearchUsersResult> asyncHandler) {
        final SearchUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchUsersResult>() {
            @Override
            public SearchUsersResult call() throws Exception {
                SearchUsersResult result = null;

                try {
                    result = executeSearchUsers(finalRequest);
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
    public java.util.concurrent.Future<SearchVocabulariesResult> searchVocabulariesAsync(SearchVocabulariesRequest request) {

        return searchVocabulariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchVocabulariesResult> searchVocabulariesAsync(final SearchVocabulariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchVocabulariesRequest, SearchVocabulariesResult> asyncHandler) {
        final SearchVocabulariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchVocabulariesResult>() {
            @Override
            public SearchVocabulariesResult call() throws Exception {
                SearchVocabulariesResult result = null;

                try {
                    result = executeSearchVocabularies(finalRequest);
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
    public java.util.concurrent.Future<SendChatIntegrationEventResult> sendChatIntegrationEventAsync(SendChatIntegrationEventRequest request) {

        return sendChatIntegrationEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendChatIntegrationEventResult> sendChatIntegrationEventAsync(final SendChatIntegrationEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendChatIntegrationEventRequest, SendChatIntegrationEventResult> asyncHandler) {
        final SendChatIntegrationEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendChatIntegrationEventResult>() {
            @Override
            public SendChatIntegrationEventResult call() throws Exception {
                SendChatIntegrationEventResult result = null;

                try {
                    result = executeSendChatIntegrationEvent(finalRequest);
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
    public java.util.concurrent.Future<StartAttachedFileUploadResult> startAttachedFileUploadAsync(StartAttachedFileUploadRequest request) {

        return startAttachedFileUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAttachedFileUploadResult> startAttachedFileUploadAsync(final StartAttachedFileUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartAttachedFileUploadRequest, StartAttachedFileUploadResult> asyncHandler) {
        final StartAttachedFileUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartAttachedFileUploadResult>() {
            @Override
            public StartAttachedFileUploadResult call() throws Exception {
                StartAttachedFileUploadResult result = null;

                try {
                    result = executeStartAttachedFileUpload(finalRequest);
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
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(StartChatContactRequest request) {

        return startChatContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChatContactResult> startChatContactAsync(final StartChatContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChatContactRequest, StartChatContactResult> asyncHandler) {
        final StartChatContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChatContactResult>() {
            @Override
            public StartChatContactResult call() throws Exception {
                StartChatContactResult result = null;

                try {
                    result = executeStartChatContact(finalRequest);
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
    public java.util.concurrent.Future<StartContactEvaluationResult> startContactEvaluationAsync(StartContactEvaluationRequest request) {

        return startContactEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContactEvaluationResult> startContactEvaluationAsync(final StartContactEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContactEvaluationRequest, StartContactEvaluationResult> asyncHandler) {
        final StartContactEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContactEvaluationResult>() {
            @Override
            public StartContactEvaluationResult call() throws Exception {
                StartContactEvaluationResult result = null;

                try {
                    result = executeStartContactEvaluation(finalRequest);
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
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(StartContactRecordingRequest request) {

        return startContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContactRecordingResult> startContactRecordingAsync(final StartContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContactRecordingRequest, StartContactRecordingResult> asyncHandler) {
        final StartContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContactRecordingResult>() {
            @Override
            public StartContactRecordingResult call() throws Exception {
                StartContactRecordingResult result = null;

                try {
                    result = executeStartContactRecording(finalRequest);
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
    public java.util.concurrent.Future<StartContactStreamingResult> startContactStreamingAsync(StartContactStreamingRequest request) {

        return startContactStreamingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartContactStreamingResult> startContactStreamingAsync(final StartContactStreamingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartContactStreamingRequest, StartContactStreamingResult> asyncHandler) {
        final StartContactStreamingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartContactStreamingResult>() {
            @Override
            public StartContactStreamingResult call() throws Exception {
                StartContactStreamingResult result = null;

                try {
                    result = executeStartContactStreaming(finalRequest);
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
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(StartOutboundVoiceContactRequest request) {

        return startOutboundVoiceContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartOutboundVoiceContactResult> startOutboundVoiceContactAsync(final StartOutboundVoiceContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartOutboundVoiceContactRequest, StartOutboundVoiceContactResult> asyncHandler) {
        final StartOutboundVoiceContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartOutboundVoiceContactResult>() {
            @Override
            public StartOutboundVoiceContactResult call() throws Exception {
                StartOutboundVoiceContactResult result = null;

                try {
                    result = executeStartOutboundVoiceContact(finalRequest);
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
    public java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(StartTaskContactRequest request) {

        return startTaskContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTaskContactResult> startTaskContactAsync(final StartTaskContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartTaskContactRequest, StartTaskContactResult> asyncHandler) {
        final StartTaskContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartTaskContactResult>() {
            @Override
            public StartTaskContactResult call() throws Exception {
                StartTaskContactResult result = null;

                try {
                    result = executeStartTaskContact(finalRequest);
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
    public java.util.concurrent.Future<StartWebRTCContactResult> startWebRTCContactAsync(StartWebRTCContactRequest request) {

        return startWebRTCContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartWebRTCContactResult> startWebRTCContactAsync(final StartWebRTCContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartWebRTCContactRequest, StartWebRTCContactResult> asyncHandler) {
        final StartWebRTCContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartWebRTCContactResult>() {
            @Override
            public StartWebRTCContactResult call() throws Exception {
                StartWebRTCContactResult result = null;

                try {
                    result = executeStartWebRTCContact(finalRequest);
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
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(StopContactRequest request) {

        return stopContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactResult> stopContactAsync(final StopContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRequest, StopContactResult> asyncHandler) {
        final StopContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactResult>() {
            @Override
            public StopContactResult call() throws Exception {
                StopContactResult result = null;

                try {
                    result = executeStopContact(finalRequest);
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
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(StopContactRecordingRequest request) {

        return stopContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactRecordingResult> stopContactRecordingAsync(final StopContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactRecordingRequest, StopContactRecordingResult> asyncHandler) {
        final StopContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactRecordingResult>() {
            @Override
            public StopContactRecordingResult call() throws Exception {
                StopContactRecordingResult result = null;

                try {
                    result = executeStopContactRecording(finalRequest);
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
    public java.util.concurrent.Future<StopContactStreamingResult> stopContactStreamingAsync(StopContactStreamingRequest request) {

        return stopContactStreamingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopContactStreamingResult> stopContactStreamingAsync(final StopContactStreamingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopContactStreamingRequest, StopContactStreamingResult> asyncHandler) {
        final StopContactStreamingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopContactStreamingResult>() {
            @Override
            public StopContactStreamingResult call() throws Exception {
                StopContactStreamingResult result = null;

                try {
                    result = executeStopContactStreaming(finalRequest);
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
    public java.util.concurrent.Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(SubmitContactEvaluationRequest request) {

        return submitContactEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubmitContactEvaluationResult> submitContactEvaluationAsync(final SubmitContactEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubmitContactEvaluationRequest, SubmitContactEvaluationResult> asyncHandler) {
        final SubmitContactEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubmitContactEvaluationResult>() {
            @Override
            public SubmitContactEvaluationResult call() throws Exception {
                SubmitContactEvaluationResult result = null;

                try {
                    result = executeSubmitContactEvaluation(finalRequest);
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
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(SuspendContactRecordingRequest request) {

        return suspendContactRecordingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SuspendContactRecordingResult> suspendContactRecordingAsync(final SuspendContactRecordingRequest request,
            final com.amazonaws.handlers.AsyncHandler<SuspendContactRecordingRequest, SuspendContactRecordingResult> asyncHandler) {
        final SuspendContactRecordingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SuspendContactRecordingResult>() {
            @Override
            public SuspendContactRecordingResult call() throws Exception {
                SuspendContactRecordingResult result = null;

                try {
                    result = executeSuspendContactRecording(finalRequest);
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
    public java.util.concurrent.Future<TagContactResult> tagContactAsync(TagContactRequest request) {

        return tagContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagContactResult> tagContactAsync(final TagContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagContactRequest, TagContactResult> asyncHandler) {
        final TagContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagContactResult>() {
            @Override
            public TagContactResult call() throws Exception {
                TagContactResult result = null;

                try {
                    result = executeTagContact(finalRequest);
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
    public java.util.concurrent.Future<TransferContactResult> transferContactAsync(TransferContactRequest request) {

        return transferContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferContactResult> transferContactAsync(final TransferContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<TransferContactRequest, TransferContactResult> asyncHandler) {
        final TransferContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TransferContactResult>() {
            @Override
            public TransferContactResult call() throws Exception {
                TransferContactResult result = null;

                try {
                    result = executeTransferContact(finalRequest);
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
    public java.util.concurrent.Future<UntagContactResult> untagContactAsync(UntagContactRequest request) {

        return untagContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagContactResult> untagContactAsync(final UntagContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagContactRequest, UntagContactResult> asyncHandler) {
        final UntagContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagContactResult>() {
            @Override
            public UntagContactResult call() throws Exception {
                UntagContactResult result = null;

                try {
                    result = executeUntagContact(finalRequest);
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
    public java.util.concurrent.Future<UpdateAgentStatusResult> updateAgentStatusAsync(UpdateAgentStatusRequest request) {

        return updateAgentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAgentStatusResult> updateAgentStatusAsync(final UpdateAgentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAgentStatusRequest, UpdateAgentStatusResult> asyncHandler) {
        final UpdateAgentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAgentStatusResult>() {
            @Override
            public UpdateAgentStatusResult call() throws Exception {
                UpdateAgentStatusResult result = null;

                try {
                    result = executeUpdateAgentStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(UpdateContactRequest request) {

        return updateContactAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactResult> updateContactAsync(final UpdateContactRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactRequest, UpdateContactResult> asyncHandler) {
        final UpdateContactRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactResult>() {
            @Override
            public UpdateContactResult call() throws Exception {
                UpdateContactResult result = null;

                try {
                    result = executeUpdateContact(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(UpdateContactAttributesRequest request) {

        return updateContactAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactAttributesResult> updateContactAttributesAsync(final UpdateContactAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactAttributesRequest, UpdateContactAttributesResult> asyncHandler) {
        final UpdateContactAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactAttributesResult>() {
            @Override
            public UpdateContactAttributesResult call() throws Exception {
                UpdateContactAttributesResult result = null;

                try {
                    result = executeUpdateContactAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(UpdateContactEvaluationRequest request) {

        return updateContactEvaluationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactEvaluationResult> updateContactEvaluationAsync(final UpdateContactEvaluationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactEvaluationRequest, UpdateContactEvaluationResult> asyncHandler) {
        final UpdateContactEvaluationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactEvaluationResult>() {
            @Override
            public UpdateContactEvaluationResult call() throws Exception {
                UpdateContactEvaluationResult result = null;

                try {
                    result = executeUpdateContactEvaluation(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(UpdateContactFlowContentRequest request) {

        return updateContactFlowContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowContentResult> updateContactFlowContentAsync(final UpdateContactFlowContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowContentRequest, UpdateContactFlowContentResult> asyncHandler) {
        final UpdateContactFlowContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowContentResult>() {
            @Override
            public UpdateContactFlowContentResult call() throws Exception {
                UpdateContactFlowContentResult result = null;

                try {
                    result = executeUpdateContactFlowContent(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(UpdateContactFlowMetadataRequest request) {

        return updateContactFlowMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowMetadataResult> updateContactFlowMetadataAsync(final UpdateContactFlowMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowMetadataRequest, UpdateContactFlowMetadataResult> asyncHandler) {
        final UpdateContactFlowMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowMetadataResult>() {
            @Override
            public UpdateContactFlowMetadataResult call() throws Exception {
                UpdateContactFlowMetadataResult result = null;

                try {
                    result = executeUpdateContactFlowMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(UpdateContactFlowModuleContentRequest request) {

        return updateContactFlowModuleContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowModuleContentResult> updateContactFlowModuleContentAsync(
            final UpdateContactFlowModuleContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowModuleContentRequest, UpdateContactFlowModuleContentResult> asyncHandler) {
        final UpdateContactFlowModuleContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowModuleContentResult>() {
            @Override
            public UpdateContactFlowModuleContentResult call() throws Exception {
                UpdateContactFlowModuleContentResult result = null;

                try {
                    result = executeUpdateContactFlowModuleContent(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            UpdateContactFlowModuleMetadataRequest request) {

        return updateContactFlowModuleMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowModuleMetadataResult> updateContactFlowModuleMetadataAsync(
            final UpdateContactFlowModuleMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowModuleMetadataRequest, UpdateContactFlowModuleMetadataResult> asyncHandler) {
        final UpdateContactFlowModuleMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowModuleMetadataResult>() {
            @Override
            public UpdateContactFlowModuleMetadataResult call() throws Exception {
                UpdateContactFlowModuleMetadataResult result = null;

                try {
                    result = executeUpdateContactFlowModuleMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(UpdateContactFlowNameRequest request) {

        return updateContactFlowNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactFlowNameResult> updateContactFlowNameAsync(final UpdateContactFlowNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactFlowNameRequest, UpdateContactFlowNameResult> asyncHandler) {
        final UpdateContactFlowNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactFlowNameResult>() {
            @Override
            public UpdateContactFlowNameResult call() throws Exception {
                UpdateContactFlowNameResult result = null;

                try {
                    result = executeUpdateContactFlowName(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactRoutingDataResult> updateContactRoutingDataAsync(UpdateContactRoutingDataRequest request) {

        return updateContactRoutingDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactRoutingDataResult> updateContactRoutingDataAsync(final UpdateContactRoutingDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactRoutingDataRequest, UpdateContactRoutingDataResult> asyncHandler) {
        final UpdateContactRoutingDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactRoutingDataResult>() {
            @Override
            public UpdateContactRoutingDataResult call() throws Exception {
                UpdateContactRoutingDataResult result = null;

                try {
                    result = executeUpdateContactRoutingData(finalRequest);
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
    public java.util.concurrent.Future<UpdateContactScheduleResult> updateContactScheduleAsync(UpdateContactScheduleRequest request) {

        return updateContactScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateContactScheduleResult> updateContactScheduleAsync(final UpdateContactScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateContactScheduleRequest, UpdateContactScheduleResult> asyncHandler) {
        final UpdateContactScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateContactScheduleResult>() {
            @Override
            public UpdateContactScheduleResult call() throws Exception {
                UpdateContactScheduleResult result = null;

                try {
                    result = executeUpdateContactSchedule(finalRequest);
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
    public java.util.concurrent.Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(UpdateEvaluationFormRequest request) {

        return updateEvaluationFormAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEvaluationFormResult> updateEvaluationFormAsync(final UpdateEvaluationFormRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEvaluationFormRequest, UpdateEvaluationFormResult> asyncHandler) {
        final UpdateEvaluationFormRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEvaluationFormResult>() {
            @Override
            public UpdateEvaluationFormResult call() throws Exception {
                UpdateEvaluationFormResult result = null;

                try {
                    result = executeUpdateEvaluationForm(finalRequest);
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
    public java.util.concurrent.Future<UpdateHoursOfOperationResult> updateHoursOfOperationAsync(UpdateHoursOfOperationRequest request) {

        return updateHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHoursOfOperationResult> updateHoursOfOperationAsync(final UpdateHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateHoursOfOperationRequest, UpdateHoursOfOperationResult> asyncHandler) {
        final UpdateHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateHoursOfOperationResult>() {
            @Override
            public UpdateHoursOfOperationResult call() throws Exception {
                UpdateHoursOfOperationResult result = null;

                try {
                    result = executeUpdateHoursOfOperation(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(UpdateInstanceAttributeRequest request) {

        return updateInstanceAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceAttributeResult> updateInstanceAttributeAsync(final UpdateInstanceAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceAttributeRequest, UpdateInstanceAttributeResult> asyncHandler) {
        final UpdateInstanceAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceAttributeResult>() {
            @Override
            public UpdateInstanceAttributeResult call() throws Exception {
                UpdateInstanceAttributeResult result = null;

                try {
                    result = executeUpdateInstanceAttribute(finalRequest);
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
    public java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(UpdateInstanceStorageConfigRequest request) {

        return updateInstanceStorageConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceStorageConfigResult> updateInstanceStorageConfigAsync(final UpdateInstanceStorageConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInstanceStorageConfigRequest, UpdateInstanceStorageConfigResult> asyncHandler) {
        final UpdateInstanceStorageConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInstanceStorageConfigResult>() {
            @Override
            public UpdateInstanceStorageConfigResult call() throws Exception {
                UpdateInstanceStorageConfigResult result = null;

                try {
                    result = executeUpdateInstanceStorageConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(UpdateParticipantRoleConfigRequest request) {

        return updateParticipantRoleConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateParticipantRoleConfigResult> updateParticipantRoleConfigAsync(final UpdateParticipantRoleConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateParticipantRoleConfigRequest, UpdateParticipantRoleConfigResult> asyncHandler) {
        final UpdateParticipantRoleConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateParticipantRoleConfigResult>() {
            @Override
            public UpdateParticipantRoleConfigResult call() throws Exception {
                UpdateParticipantRoleConfigResult result = null;

                try {
                    result = executeUpdateParticipantRoleConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest request) {

        return updatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(final UpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler) {
        final UpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberResult>() {
            @Override
            public UpdatePhoneNumberResult call() throws Exception {
                UpdatePhoneNumberResult result = null;

                try {
                    result = executeUpdatePhoneNumber(finalRequest);
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
    public java.util.concurrent.Future<UpdatePhoneNumberMetadataResult> updatePhoneNumberMetadataAsync(UpdatePhoneNumberMetadataRequest request) {

        return updatePhoneNumberMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberMetadataResult> updatePhoneNumberMetadataAsync(final UpdatePhoneNumberMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberMetadataRequest, UpdatePhoneNumberMetadataResult> asyncHandler) {
        final UpdatePhoneNumberMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberMetadataResult>() {
            @Override
            public UpdatePhoneNumberMetadataResult call() throws Exception {
                UpdatePhoneNumberMetadataResult result = null;

                try {
                    result = executeUpdatePhoneNumberMetadata(finalRequest);
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
    public java.util.concurrent.Future<UpdatePredefinedAttributeResult> updatePredefinedAttributeAsync(UpdatePredefinedAttributeRequest request) {

        return updatePredefinedAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePredefinedAttributeResult> updatePredefinedAttributeAsync(final UpdatePredefinedAttributeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePredefinedAttributeRequest, UpdatePredefinedAttributeResult> asyncHandler) {
        final UpdatePredefinedAttributeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePredefinedAttributeResult>() {
            @Override
            public UpdatePredefinedAttributeResult call() throws Exception {
                UpdatePredefinedAttributeResult result = null;

                try {
                    result = executeUpdatePredefinedAttribute(finalRequest);
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
    public java.util.concurrent.Future<UpdatePromptResult> updatePromptAsync(UpdatePromptRequest request) {

        return updatePromptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePromptResult> updatePromptAsync(final UpdatePromptRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePromptRequest, UpdatePromptResult> asyncHandler) {
        final UpdatePromptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePromptResult>() {
            @Override
            public UpdatePromptResult call() throws Exception {
                UpdatePromptResult result = null;

                try {
                    result = executeUpdatePrompt(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(UpdateQueueHoursOfOperationRequest request) {

        return updateQueueHoursOfOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueHoursOfOperationResult> updateQueueHoursOfOperationAsync(final UpdateQueueHoursOfOperationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueHoursOfOperationRequest, UpdateQueueHoursOfOperationResult> asyncHandler) {
        final UpdateQueueHoursOfOperationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueHoursOfOperationResult>() {
            @Override
            public UpdateQueueHoursOfOperationResult call() throws Exception {
                UpdateQueueHoursOfOperationResult result = null;

                try {
                    result = executeUpdateQueueHoursOfOperation(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(UpdateQueueMaxContactsRequest request) {

        return updateQueueMaxContactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueMaxContactsResult> updateQueueMaxContactsAsync(final UpdateQueueMaxContactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueMaxContactsRequest, UpdateQueueMaxContactsResult> asyncHandler) {
        final UpdateQueueMaxContactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueMaxContactsResult>() {
            @Override
            public UpdateQueueMaxContactsResult call() throws Exception {
                UpdateQueueMaxContactsResult result = null;

                try {
                    result = executeUpdateQueueMaxContacts(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(UpdateQueueNameRequest request) {

        return updateQueueNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueNameResult> updateQueueNameAsync(final UpdateQueueNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueNameRequest, UpdateQueueNameResult> asyncHandler) {
        final UpdateQueueNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueNameResult>() {
            @Override
            public UpdateQueueNameResult call() throws Exception {
                UpdateQueueNameResult result = null;

                try {
                    result = executeUpdateQueueName(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            UpdateQueueOutboundCallerConfigRequest request) {

        return updateQueueOutboundCallerConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueOutboundCallerConfigResult> updateQueueOutboundCallerConfigAsync(
            final UpdateQueueOutboundCallerConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueOutboundCallerConfigRequest, UpdateQueueOutboundCallerConfigResult> asyncHandler) {
        final UpdateQueueOutboundCallerConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueOutboundCallerConfigResult>() {
            @Override
            public UpdateQueueOutboundCallerConfigResult call() throws Exception {
                UpdateQueueOutboundCallerConfigResult result = null;

                try {
                    result = executeUpdateQueueOutboundCallerConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(UpdateQueueStatusRequest request) {

        return updateQueueStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueStatusResult> updateQueueStatusAsync(final UpdateQueueStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueStatusRequest, UpdateQueueStatusResult> asyncHandler) {
        final UpdateQueueStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueStatusResult>() {
            @Override
            public UpdateQueueStatusResult call() throws Exception {
                UpdateQueueStatusResult result = null;

                try {
                    result = executeUpdateQueueStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(UpdateQuickConnectConfigRequest request) {

        return updateQuickConnectConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectConfigResult> updateQuickConnectConfigAsync(final UpdateQuickConnectConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectConfigRequest, UpdateQuickConnectConfigResult> asyncHandler) {
        final UpdateQuickConnectConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuickConnectConfigResult>() {
            @Override
            public UpdateQuickConnectConfigResult call() throws Exception {
                UpdateQuickConnectConfigResult result = null;

                try {
                    result = executeUpdateQuickConnectConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(UpdateQuickConnectNameRequest request) {

        return updateQuickConnectNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuickConnectNameResult> updateQuickConnectNameAsync(final UpdateQuickConnectNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQuickConnectNameRequest, UpdateQuickConnectNameResult> asyncHandler) {
        final UpdateQuickConnectNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQuickConnectNameResult>() {
            @Override
            public UpdateQuickConnectNameResult call() throws Exception {
                UpdateQuickConnectNameResult result = null;

                try {
                    result = executeUpdateQuickConnectName(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileAgentAvailabilityTimerResult> updateRoutingProfileAgentAvailabilityTimerAsync(
            UpdateRoutingProfileAgentAvailabilityTimerRequest request) {

        return updateRoutingProfileAgentAvailabilityTimerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileAgentAvailabilityTimerResult> updateRoutingProfileAgentAvailabilityTimerAsync(
            final UpdateRoutingProfileAgentAvailabilityTimerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileAgentAvailabilityTimerRequest, UpdateRoutingProfileAgentAvailabilityTimerResult> asyncHandler) {
        final UpdateRoutingProfileAgentAvailabilityTimerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileAgentAvailabilityTimerResult>() {
            @Override
            public UpdateRoutingProfileAgentAvailabilityTimerResult call() throws Exception {
                UpdateRoutingProfileAgentAvailabilityTimerResult result = null;

                try {
                    result = executeUpdateRoutingProfileAgentAvailabilityTimer(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            UpdateRoutingProfileConcurrencyRequest request) {

        return updateRoutingProfileConcurrencyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileConcurrencyResult> updateRoutingProfileConcurrencyAsync(
            final UpdateRoutingProfileConcurrencyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileConcurrencyRequest, UpdateRoutingProfileConcurrencyResult> asyncHandler) {
        final UpdateRoutingProfileConcurrencyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileConcurrencyResult>() {
            @Override
            public UpdateRoutingProfileConcurrencyResult call() throws Exception {
                UpdateRoutingProfileConcurrencyResult result = null;

                try {
                    result = executeUpdateRoutingProfileConcurrency(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            UpdateRoutingProfileDefaultOutboundQueueRequest request) {

        return updateRoutingProfileDefaultOutboundQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileDefaultOutboundQueueResult> updateRoutingProfileDefaultOutboundQueueAsync(
            final UpdateRoutingProfileDefaultOutboundQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileDefaultOutboundQueueRequest, UpdateRoutingProfileDefaultOutboundQueueResult> asyncHandler) {
        final UpdateRoutingProfileDefaultOutboundQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileDefaultOutboundQueueResult>() {
            @Override
            public UpdateRoutingProfileDefaultOutboundQueueResult call() throws Exception {
                UpdateRoutingProfileDefaultOutboundQueueResult result = null;

                try {
                    result = executeUpdateRoutingProfileDefaultOutboundQueue(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(UpdateRoutingProfileNameRequest request) {

        return updateRoutingProfileNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileNameResult> updateRoutingProfileNameAsync(final UpdateRoutingProfileNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileNameRequest, UpdateRoutingProfileNameResult> asyncHandler) {
        final UpdateRoutingProfileNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileNameResult>() {
            @Override
            public UpdateRoutingProfileNameResult call() throws Exception {
                UpdateRoutingProfileNameResult result = null;

                try {
                    result = executeUpdateRoutingProfileName(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(UpdateRoutingProfileQueuesRequest request) {

        return updateRoutingProfileQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingProfileQueuesResult> updateRoutingProfileQueuesAsync(final UpdateRoutingProfileQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingProfileQueuesRequest, UpdateRoutingProfileQueuesResult> asyncHandler) {
        final UpdateRoutingProfileQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingProfileQueuesResult>() {
            @Override
            public UpdateRoutingProfileQueuesResult call() throws Exception {
                UpdateRoutingProfileQueuesResult result = null;

                try {
                    result = executeUpdateRoutingProfileQueues(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest request) {

        return updateRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(final UpdateRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler) {
        final UpdateRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleResult>() {
            @Override
            public UpdateRuleResult call() throws Exception {
                UpdateRuleResult result = null;

                try {
                    result = executeUpdateRule(finalRequest);
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
    public java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(UpdateSecurityProfileRequest request) {

        return updateSecurityProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityProfileResult> updateSecurityProfileAsync(final UpdateSecurityProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityProfileRequest, UpdateSecurityProfileResult> asyncHandler) {
        final UpdateSecurityProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityProfileResult>() {
            @Override
            public UpdateSecurityProfileResult call() throws Exception {
                UpdateSecurityProfileResult result = null;

                try {
                    result = executeUpdateSecurityProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(UpdateTaskTemplateRequest request) {

        return updateTaskTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskTemplateResult> updateTaskTemplateAsync(final UpdateTaskTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTaskTemplateRequest, UpdateTaskTemplateResult> asyncHandler) {
        final UpdateTaskTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTaskTemplateResult>() {
            @Override
            public UpdateTaskTemplateResult call() throws Exception {
                UpdateTaskTemplateResult result = null;

                try {
                    result = executeUpdateTaskTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(UpdateTrafficDistributionRequest request) {

        return updateTrafficDistributionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficDistributionResult> updateTrafficDistributionAsync(final UpdateTrafficDistributionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficDistributionRequest, UpdateTrafficDistributionResult> asyncHandler) {
        final UpdateTrafficDistributionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficDistributionResult>() {
            @Override
            public UpdateTrafficDistributionResult call() throws Exception {
                UpdateTrafficDistributionResult result = null;

                try {
                    result = executeUpdateTrafficDistribution(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(UpdateUserHierarchyRequest request) {

        return updateUserHierarchyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyResult> updateUserHierarchyAsync(final UpdateUserHierarchyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyRequest, UpdateUserHierarchyResult> asyncHandler) {
        final UpdateUserHierarchyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyResult>() {
            @Override
            public UpdateUserHierarchyResult call() throws Exception {
                UpdateUserHierarchyResult result = null;

                try {
                    result = executeUpdateUserHierarchy(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(UpdateUserHierarchyGroupNameRequest request) {

        return updateUserHierarchyGroupNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyGroupNameResult> updateUserHierarchyGroupNameAsync(final UpdateUserHierarchyGroupNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyGroupNameRequest, UpdateUserHierarchyGroupNameResult> asyncHandler) {
        final UpdateUserHierarchyGroupNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyGroupNameResult>() {
            @Override
            public UpdateUserHierarchyGroupNameResult call() throws Exception {
                UpdateUserHierarchyGroupNameResult result = null;

                try {
                    result = executeUpdateUserHierarchyGroupName(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(UpdateUserHierarchyStructureRequest request) {

        return updateUserHierarchyStructureAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserHierarchyStructureResult> updateUserHierarchyStructureAsync(final UpdateUserHierarchyStructureRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserHierarchyStructureRequest, UpdateUserHierarchyStructureResult> asyncHandler) {
        final UpdateUserHierarchyStructureRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserHierarchyStructureResult>() {
            @Override
            public UpdateUserHierarchyStructureResult call() throws Exception {
                UpdateUserHierarchyStructureResult result = null;

                try {
                    result = executeUpdateUserHierarchyStructure(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(UpdateUserIdentityInfoRequest request) {

        return updateUserIdentityInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserIdentityInfoResult> updateUserIdentityInfoAsync(final UpdateUserIdentityInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserIdentityInfoRequest, UpdateUserIdentityInfoResult> asyncHandler) {
        final UpdateUserIdentityInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserIdentityInfoResult>() {
            @Override
            public UpdateUserIdentityInfoResult call() throws Exception {
                UpdateUserIdentityInfoResult result = null;

                try {
                    result = executeUpdateUserIdentityInfo(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(UpdateUserPhoneConfigRequest request) {

        return updateUserPhoneConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPhoneConfigResult> updateUserPhoneConfigAsync(final UpdateUserPhoneConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserPhoneConfigRequest, UpdateUserPhoneConfigResult> asyncHandler) {
        final UpdateUserPhoneConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserPhoneConfigResult>() {
            @Override
            public UpdateUserPhoneConfigResult call() throws Exception {
                UpdateUserPhoneConfigResult result = null;

                try {
                    result = executeUpdateUserPhoneConfig(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserProficienciesResult> updateUserProficienciesAsync(UpdateUserProficienciesRequest request) {

        return updateUserProficienciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserProficienciesResult> updateUserProficienciesAsync(final UpdateUserProficienciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserProficienciesRequest, UpdateUserProficienciesResult> asyncHandler) {
        final UpdateUserProficienciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserProficienciesResult>() {
            @Override
            public UpdateUserProficienciesResult call() throws Exception {
                UpdateUserProficienciesResult result = null;

                try {
                    result = executeUpdateUserProficiencies(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(UpdateUserRoutingProfileRequest request) {

        return updateUserRoutingProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserRoutingProfileResult> updateUserRoutingProfileAsync(final UpdateUserRoutingProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRoutingProfileRequest, UpdateUserRoutingProfileResult> asyncHandler) {
        final UpdateUserRoutingProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserRoutingProfileResult>() {
            @Override
            public UpdateUserRoutingProfileResult call() throws Exception {
                UpdateUserRoutingProfileResult result = null;

                try {
                    result = executeUpdateUserRoutingProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(UpdateUserSecurityProfilesRequest request) {

        return updateUserSecurityProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserSecurityProfilesResult> updateUserSecurityProfilesAsync(final UpdateUserSecurityProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserSecurityProfilesRequest, UpdateUserSecurityProfilesResult> asyncHandler) {
        final UpdateUserSecurityProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserSecurityProfilesResult>() {
            @Override
            public UpdateUserSecurityProfilesResult call() throws Exception {
                UpdateUserSecurityProfilesResult result = null;

                try {
                    result = executeUpdateUserSecurityProfiles(finalRequest);
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
    public java.util.concurrent.Future<UpdateViewContentResult> updateViewContentAsync(UpdateViewContentRequest request) {

        return updateViewContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateViewContentResult> updateViewContentAsync(final UpdateViewContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateViewContentRequest, UpdateViewContentResult> asyncHandler) {
        final UpdateViewContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateViewContentResult>() {
            @Override
            public UpdateViewContentResult call() throws Exception {
                UpdateViewContentResult result = null;

                try {
                    result = executeUpdateViewContent(finalRequest);
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
    public java.util.concurrent.Future<UpdateViewMetadataResult> updateViewMetadataAsync(UpdateViewMetadataRequest request) {

        return updateViewMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateViewMetadataResult> updateViewMetadataAsync(final UpdateViewMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateViewMetadataRequest, UpdateViewMetadataResult> asyncHandler) {
        final UpdateViewMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateViewMetadataResult>() {
            @Override
            public UpdateViewMetadataResult call() throws Exception {
                UpdateViewMetadataResult result = null;

                try {
                    result = executeUpdateViewMetadata(finalRequest);
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
