/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkvoice;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkvoice.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime SDK Voice asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKVoiceAsyncClient extends AmazonChimeSDKVoiceClient implements AmazonChimeSDKVoiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeSDKVoiceAsyncClientBuilder asyncBuilder() {
        return AmazonChimeSDKVoiceAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Voice using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKVoiceAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Voice using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonChimeSDKVoiceAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest request) {

        return associatePhoneNumbersWithVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            final AssociatePhoneNumbersWithVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorRequest, AssociatePhoneNumbersWithVoiceConnectorResult> asyncHandler) {
        final AssociatePhoneNumbersWithVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumbersWithVoiceConnectorResult>() {
            @Override
            public AssociatePhoneNumbersWithVoiceConnectorResult call() throws Exception {
                AssociatePhoneNumbersWithVoiceConnectorResult result = null;

                try {
                    result = executeAssociatePhoneNumbersWithVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest request) {

        return associatePhoneNumbersWithVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            final AssociatePhoneNumbersWithVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorGroupRequest, AssociatePhoneNumbersWithVoiceConnectorGroupResult> asyncHandler) {
        final AssociatePhoneNumbersWithVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociatePhoneNumbersWithVoiceConnectorGroupResult>() {
            @Override
            public AssociatePhoneNumbersWithVoiceConnectorGroupResult call() throws Exception {
                AssociatePhoneNumbersWithVoiceConnectorGroupResult result = null;

                try {
                    result = executeAssociatePhoneNumbersWithVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest request) {

        return batchDeletePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(final BatchDeletePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeletePhoneNumberRequest, BatchDeletePhoneNumberResult> asyncHandler) {
        final BatchDeletePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeletePhoneNumberResult>() {
            @Override
            public BatchDeletePhoneNumberResult call() throws Exception {
                BatchDeletePhoneNumberResult result = null;

                try {
                    result = executeBatchDeletePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest request) {

        return batchUpdatePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(final BatchUpdatePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdatePhoneNumberRequest, BatchUpdatePhoneNumberResult> asyncHandler) {
        final BatchUpdatePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdatePhoneNumberResult>() {
            @Override
            public BatchUpdatePhoneNumberResult call() throws Exception {
                BatchUpdatePhoneNumberResult result = null;

                try {
                    result = executeBatchUpdatePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest request) {

        return createPhoneNumberOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(final CreatePhoneNumberOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePhoneNumberOrderRequest, CreatePhoneNumberOrderResult> asyncHandler) {
        final CreatePhoneNumberOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePhoneNumberOrderResult>() {
            @Override
            public CreatePhoneNumberOrderResult call() throws Exception {
                CreatePhoneNumberOrderResult result = null;

                try {
                    result = executeCreatePhoneNumberOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest request) {

        return createProxySessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(final CreateProxySessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProxySessionRequest, CreateProxySessionResult> asyncHandler) {
        final CreateProxySessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProxySessionResult>() {
            @Override
            public CreateProxySessionResult call() throws Exception {
                CreateProxySessionResult result = null;

                try {
                    result = executeCreateProxySession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(CreateSipMediaApplicationRequest request) {

        return createSipMediaApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(final CreateSipMediaApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationRequest, CreateSipMediaApplicationResult> asyncHandler) {
        final CreateSipMediaApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSipMediaApplicationResult>() {
            @Override
            public CreateSipMediaApplicationResult call() throws Exception {
                CreateSipMediaApplicationResult result = null;

                try {
                    result = executeCreateSipMediaApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(CreateSipMediaApplicationCallRequest request) {

        return createSipMediaApplicationCallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(
            final CreateSipMediaApplicationCallRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationCallRequest, CreateSipMediaApplicationCallResult> asyncHandler) {
        final CreateSipMediaApplicationCallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSipMediaApplicationCallResult>() {
            @Override
            public CreateSipMediaApplicationCallResult call() throws Exception {
                CreateSipMediaApplicationCallResult result = null;

                try {
                    result = executeCreateSipMediaApplicationCall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest request) {

        return createSipRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(final CreateSipRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSipRuleRequest, CreateSipRuleResult> asyncHandler) {
        final CreateSipRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSipRuleResult>() {
            @Override
            public CreateSipRuleResult call() throws Exception {
                CreateSipRuleResult result = null;

                try {
                    result = executeCreateSipRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest request) {

        return createVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(final CreateVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorRequest, CreateVoiceConnectorResult> asyncHandler) {
        final CreateVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVoiceConnectorResult>() {
            @Override
            public CreateVoiceConnectorResult call() throws Exception {
                CreateVoiceConnectorResult result = null;

                try {
                    result = executeCreateVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(CreateVoiceConnectorGroupRequest request) {

        return createVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(final CreateVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorGroupRequest, CreateVoiceConnectorGroupResult> asyncHandler) {
        final CreateVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVoiceConnectorGroupResult>() {
            @Override
            public CreateVoiceConnectorGroupResult call() throws Exception {
                CreateVoiceConnectorGroupResult result = null;

                try {
                    result = executeCreateVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest request) {

        return deletePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(final DeletePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePhoneNumberRequest, DeletePhoneNumberResult> asyncHandler) {
        final DeletePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePhoneNumberResult>() {
            @Override
            public DeletePhoneNumberResult call() throws Exception {
                DeletePhoneNumberResult result = null;

                try {
                    result = executeDeletePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest request) {

        return deleteProxySessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(final DeleteProxySessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProxySessionRequest, DeleteProxySessionResult> asyncHandler) {
        final DeleteProxySessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProxySessionResult>() {
            @Override
            public DeleteProxySessionResult call() throws Exception {
                DeleteProxySessionResult result = null;

                try {
                    result = executeDeleteProxySession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(DeleteSipMediaApplicationRequest request) {

        return deleteSipMediaApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(final DeleteSipMediaApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSipMediaApplicationRequest, DeleteSipMediaApplicationResult> asyncHandler) {
        final DeleteSipMediaApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSipMediaApplicationResult>() {
            @Override
            public DeleteSipMediaApplicationResult call() throws Exception {
                DeleteSipMediaApplicationResult result = null;

                try {
                    result = executeDeleteSipMediaApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest request) {

        return deleteSipRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(final DeleteSipRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSipRuleRequest, DeleteSipRuleResult> asyncHandler) {
        final DeleteSipRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSipRuleResult>() {
            @Override
            public DeleteSipRuleResult call() throws Exception {
                DeleteSipRuleResult result = null;

                try {
                    result = executeDeleteSipRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest request) {

        return deleteVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(final DeleteVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorRequest, DeleteVoiceConnectorResult> asyncHandler) {
        final DeleteVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorResult>() {
            @Override
            public DeleteVoiceConnectorResult call() throws Exception {
                DeleteVoiceConnectorResult result = null;

                try {
                    result = executeDeleteVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest request) {

        return deleteVoiceConnectorEmergencyCallingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            final DeleteVoiceConnectorEmergencyCallingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorEmergencyCallingConfigurationRequest, DeleteVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler) {
        final DeleteVoiceConnectorEmergencyCallingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorEmergencyCallingConfigurationResult>() {
            @Override
            public DeleteVoiceConnectorEmergencyCallingConfigurationResult call() throws Exception {
                DeleteVoiceConnectorEmergencyCallingConfigurationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorEmergencyCallingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(DeleteVoiceConnectorGroupRequest request) {

        return deleteVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(final DeleteVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorGroupRequest, DeleteVoiceConnectorGroupResult> asyncHandler) {
        final DeleteVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorGroupResult>() {
            @Override
            public DeleteVoiceConnectorGroupResult call() throws Exception {
                DeleteVoiceConnectorGroupResult result = null;

                try {
                    result = executeDeleteVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest request) {

        return deleteVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            final DeleteVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorOriginationRequest, DeleteVoiceConnectorOriginationResult> asyncHandler) {
        final DeleteVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorOriginationResult>() {
            @Override
            public DeleteVoiceConnectorOriginationResult call() throws Exception {
                DeleteVoiceConnectorOriginationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(DeleteVoiceConnectorProxyRequest request) {

        return deleteVoiceConnectorProxyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(final DeleteVoiceConnectorProxyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorProxyRequest, DeleteVoiceConnectorProxyResult> asyncHandler) {
        final DeleteVoiceConnectorProxyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorProxyResult>() {
            @Override
            public DeleteVoiceConnectorProxyResult call() throws Exception {
                DeleteVoiceConnectorProxyResult result = null;

                try {
                    result = executeDeleteVoiceConnectorProxy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest request) {

        return deleteVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            final DeleteVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorStreamingConfigurationRequest, DeleteVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final DeleteVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public DeleteVoiceConnectorStreamingConfigurationResult call() throws Exception {
                DeleteVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest request) {

        return deleteVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            final DeleteVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationRequest, DeleteVoiceConnectorTerminationResult> asyncHandler) {
        final DeleteVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorTerminationResult>() {
            @Override
            public DeleteVoiceConnectorTerminationResult call() throws Exception {
                DeleteVoiceConnectorTerminationResult result = null;

                try {
                    result = executeDeleteVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest request) {

        return deleteVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            final DeleteVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationCredentialsRequest, DeleteVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final DeleteVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public DeleteVoiceConnectorTerminationCredentialsResult call() throws Exception {
                DeleteVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executeDeleteVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest request) {

        return disassociatePhoneNumbersFromVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            final DisassociatePhoneNumbersFromVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorRequest, DisassociatePhoneNumbersFromVoiceConnectorResult> asyncHandler) {
        final DisassociatePhoneNumbersFromVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumbersFromVoiceConnectorResult>() {
            @Override
            public DisassociatePhoneNumbersFromVoiceConnectorResult call() throws Exception {
                DisassociatePhoneNumbersFromVoiceConnectorResult result = null;

                try {
                    result = executeDisassociatePhoneNumbersFromVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest request) {

        return disassociatePhoneNumbersFromVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            final DisassociatePhoneNumbersFromVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest, DisassociatePhoneNumbersFromVoiceConnectorGroupResult> asyncHandler) {
        final DisassociatePhoneNumbersFromVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociatePhoneNumbersFromVoiceConnectorGroupResult>() {
            @Override
            public DisassociatePhoneNumbersFromVoiceConnectorGroupResult call() throws Exception {
                DisassociatePhoneNumbersFromVoiceConnectorGroupResult result = null;

                try {
                    result = executeDisassociatePhoneNumbersFromVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest request) {

        return getGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(final GetGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler) {
        final GetGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGlobalSettingsResult>() {
            @Override
            public GetGlobalSettingsResult call() throws Exception {
                GetGlobalSettingsResult result = null;

                try {
                    result = executeGetGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest request) {

        return getPhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(final GetPhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberRequest, GetPhoneNumberResult> asyncHandler) {
        final GetPhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberResult>() {
            @Override
            public GetPhoneNumberResult call() throws Exception {
                GetPhoneNumberResult result = null;

                try {
                    result = executeGetPhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest request) {

        return getPhoneNumberOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(final GetPhoneNumberOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberOrderRequest, GetPhoneNumberOrderResult> asyncHandler) {
        final GetPhoneNumberOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberOrderResult>() {
            @Override
            public GetPhoneNumberOrderResult call() throws Exception {
                GetPhoneNumberOrderResult result = null;

                try {
                    result = executeGetPhoneNumberOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest request) {

        return getPhoneNumberSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(final GetPhoneNumberSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPhoneNumberSettingsRequest, GetPhoneNumberSettingsResult> asyncHandler) {
        final GetPhoneNumberSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPhoneNumberSettingsResult>() {
            @Override
            public GetPhoneNumberSettingsResult call() throws Exception {
                GetPhoneNumberSettingsResult result = null;

                try {
                    result = executeGetPhoneNumberSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest request) {

        return getProxySessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(final GetProxySessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProxySessionRequest, GetProxySessionResult> asyncHandler) {
        final GetProxySessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProxySessionResult>() {
            @Override
            public GetProxySessionResult call() throws Exception {
                GetProxySessionResult result = null;

                try {
                    result = executeGetProxySession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest request) {

        return getSipMediaApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(final GetSipMediaApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationRequest, GetSipMediaApplicationResult> asyncHandler) {
        final GetSipMediaApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSipMediaApplicationResult>() {
            @Override
            public GetSipMediaApplicationResult call() throws Exception {
                GetSipMediaApplicationResult result = null;

                try {
                    result = executeGetSipMediaApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            GetSipMediaApplicationAlexaSkillConfigurationRequest request) {

        return getSipMediaApplicationAlexaSkillConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationAlexaSkillConfigurationResult> getSipMediaApplicationAlexaSkillConfigurationAsync(
            final GetSipMediaApplicationAlexaSkillConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationAlexaSkillConfigurationRequest, GetSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler) {
        final GetSipMediaApplicationAlexaSkillConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSipMediaApplicationAlexaSkillConfigurationResult>() {
            @Override
            public GetSipMediaApplicationAlexaSkillConfigurationResult call() throws Exception {
                GetSipMediaApplicationAlexaSkillConfigurationResult result = null;

                try {
                    result = executeGetSipMediaApplicationAlexaSkillConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            GetSipMediaApplicationLoggingConfigurationRequest request) {

        return getSipMediaApplicationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            final GetSipMediaApplicationLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationLoggingConfigurationRequest, GetSipMediaApplicationLoggingConfigurationResult> asyncHandler) {
        final GetSipMediaApplicationLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSipMediaApplicationLoggingConfigurationResult>() {
            @Override
            public GetSipMediaApplicationLoggingConfigurationResult call() throws Exception {
                GetSipMediaApplicationLoggingConfigurationResult result = null;

                try {
                    result = executeGetSipMediaApplicationLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest request) {

        return getSipRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(final GetSipRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSipRuleRequest, GetSipRuleResult> asyncHandler) {
        final GetSipRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSipRuleResult>() {
            @Override
            public GetSipRuleResult call() throws Exception {
                GetSipRuleResult result = null;

                try {
                    result = executeGetSipRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest request) {

        return getVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(final GetVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorRequest, GetVoiceConnectorResult> asyncHandler) {
        final GetVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorResult>() {
            @Override
            public GetVoiceConnectorResult call() throws Exception {
                GetVoiceConnectorResult result = null;

                try {
                    result = executeGetVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            GetVoiceConnectorEmergencyCallingConfigurationRequest request) {

        return getVoiceConnectorEmergencyCallingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            final GetVoiceConnectorEmergencyCallingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorEmergencyCallingConfigurationRequest, GetVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler) {
        final GetVoiceConnectorEmergencyCallingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorEmergencyCallingConfigurationResult>() {
            @Override
            public GetVoiceConnectorEmergencyCallingConfigurationResult call() throws Exception {
                GetVoiceConnectorEmergencyCallingConfigurationResult result = null;

                try {
                    result = executeGetVoiceConnectorEmergencyCallingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest request) {

        return getVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(final GetVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorGroupRequest, GetVoiceConnectorGroupResult> asyncHandler) {
        final GetVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorGroupResult>() {
            @Override
            public GetVoiceConnectorGroupResult call() throws Exception {
                GetVoiceConnectorGroupResult result = null;

                try {
                    result = executeGetVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest request) {

        return getVoiceConnectorLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            final GetVoiceConnectorLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorLoggingConfigurationRequest, GetVoiceConnectorLoggingConfigurationResult> asyncHandler) {
        final GetVoiceConnectorLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorLoggingConfigurationResult>() {
            @Override
            public GetVoiceConnectorLoggingConfigurationResult call() throws Exception {
                GetVoiceConnectorLoggingConfigurationResult result = null;

                try {
                    result = executeGetVoiceConnectorLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(GetVoiceConnectorOriginationRequest request) {

        return getVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(final GetVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorOriginationRequest, GetVoiceConnectorOriginationResult> asyncHandler) {
        final GetVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorOriginationResult>() {
            @Override
            public GetVoiceConnectorOriginationResult call() throws Exception {
                GetVoiceConnectorOriginationResult result = null;

                try {
                    result = executeGetVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest request) {

        return getVoiceConnectorProxyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(final GetVoiceConnectorProxyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorProxyRequest, GetVoiceConnectorProxyResult> asyncHandler) {
        final GetVoiceConnectorProxyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorProxyResult>() {
            @Override
            public GetVoiceConnectorProxyResult call() throws Exception {
                GetVoiceConnectorProxyResult result = null;

                try {
                    result = executeGetVoiceConnectorProxy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest request) {

        return getVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            final GetVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorStreamingConfigurationRequest, GetVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final GetVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public GetVoiceConnectorStreamingConfigurationResult call() throws Exception {
                GetVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executeGetVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(GetVoiceConnectorTerminationRequest request) {

        return getVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(final GetVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationRequest, GetVoiceConnectorTerminationResult> asyncHandler) {
        final GetVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorTerminationResult>() {
            @Override
            public GetVoiceConnectorTerminationResult call() throws Exception {
                GetVoiceConnectorTerminationResult result = null;

                try {
                    result = executeGetVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest request) {

        return getVoiceConnectorTerminationHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            final GetVoiceConnectorTerminationHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationHealthRequest, GetVoiceConnectorTerminationHealthResult> asyncHandler) {
        final GetVoiceConnectorTerminationHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceConnectorTerminationHealthResult>() {
            @Override
            public GetVoiceConnectorTerminationHealthResult call() throws Exception {
                GetVoiceConnectorTerminationHealthResult result = null;

                try {
                    result = executeGetVoiceConnectorTerminationHealth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAvailableVoiceConnectorRegionsResult> listAvailableVoiceConnectorRegionsAsync(
            ListAvailableVoiceConnectorRegionsRequest request) {

        return listAvailableVoiceConnectorRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableVoiceConnectorRegionsResult> listAvailableVoiceConnectorRegionsAsync(
            final ListAvailableVoiceConnectorRegionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableVoiceConnectorRegionsRequest, ListAvailableVoiceConnectorRegionsResult> asyncHandler) {
        final ListAvailableVoiceConnectorRegionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableVoiceConnectorRegionsResult>() {
            @Override
            public ListAvailableVoiceConnectorRegionsResult call() throws Exception {
                ListAvailableVoiceConnectorRegionsResult result = null;

                try {
                    result = executeListAvailableVoiceConnectorRegions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest request) {

        return listPhoneNumberOrdersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(final ListPhoneNumberOrdersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPhoneNumberOrdersRequest, ListPhoneNumberOrdersResult> asyncHandler) {
        final ListPhoneNumberOrdersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPhoneNumberOrdersResult>() {
            @Override
            public ListPhoneNumberOrdersResult call() throws Exception {
                ListPhoneNumberOrdersResult result = null;

                try {
                    result = executeListPhoneNumberOrders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest request) {

        return listProxySessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(final ListProxySessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProxySessionsRequest, ListProxySessionsResult> asyncHandler) {
        final ListProxySessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProxySessionsResult>() {
            @Override
            public ListProxySessionsResult call() throws Exception {
                ListProxySessionsResult result = null;

                try {
                    result = executeListProxySessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest request) {

        return listSipMediaApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(final ListSipMediaApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSipMediaApplicationsRequest, ListSipMediaApplicationsResult> asyncHandler) {
        final ListSipMediaApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSipMediaApplicationsResult>() {
            @Override
            public ListSipMediaApplicationsResult call() throws Exception {
                ListSipMediaApplicationsResult result = null;

                try {
                    result = executeListSipMediaApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest request) {

        return listSipRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(final ListSipRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSipRulesRequest, ListSipRulesResult> asyncHandler) {
        final ListSipRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSipRulesResult>() {
            @Override
            public ListSipRulesResult call() throws Exception {
                ListSipRulesResult result = null;

                try {
                    result = executeListSipRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSupportedPhoneNumberCountriesResult> listSupportedPhoneNumberCountriesAsync(
            ListSupportedPhoneNumberCountriesRequest request) {

        return listSupportedPhoneNumberCountriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSupportedPhoneNumberCountriesResult> listSupportedPhoneNumberCountriesAsync(
            final ListSupportedPhoneNumberCountriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSupportedPhoneNumberCountriesRequest, ListSupportedPhoneNumberCountriesResult> asyncHandler) {
        final ListSupportedPhoneNumberCountriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSupportedPhoneNumberCountriesResult>() {
            @Override
            public ListSupportedPhoneNumberCountriesResult call() throws Exception {
                ListSupportedPhoneNumberCountriesResult result = null;

                try {
                    result = executeListSupportedPhoneNumberCountries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest request) {

        return listVoiceConnectorGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(final ListVoiceConnectorGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorGroupsRequest, ListVoiceConnectorGroupsResult> asyncHandler) {
        final ListVoiceConnectorGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorGroupsResult>() {
            @Override
            public ListVoiceConnectorGroupsResult call() throws Exception {
                ListVoiceConnectorGroupsResult result = null;

                try {
                    result = executeListVoiceConnectorGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest request) {

        return listVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            final ListVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorTerminationCredentialsRequest, ListVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final ListVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public ListVoiceConnectorTerminationCredentialsResult call() throws Exception {
                ListVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executeListVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest request) {

        return listVoiceConnectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(final ListVoiceConnectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorsRequest, ListVoiceConnectorsResult> asyncHandler) {
        final ListVoiceConnectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVoiceConnectorsResult>() {
            @Override
            public ListVoiceConnectorsResult call() throws Exception {
                ListVoiceConnectorsResult result = null;

                try {
                    result = executeListVoiceConnectors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            PutSipMediaApplicationAlexaSkillConfigurationRequest request) {

        return putSipMediaApplicationAlexaSkillConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSipMediaApplicationAlexaSkillConfigurationResult> putSipMediaApplicationAlexaSkillConfigurationAsync(
            final PutSipMediaApplicationAlexaSkillConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationAlexaSkillConfigurationRequest, PutSipMediaApplicationAlexaSkillConfigurationResult> asyncHandler) {
        final PutSipMediaApplicationAlexaSkillConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSipMediaApplicationAlexaSkillConfigurationResult>() {
            @Override
            public PutSipMediaApplicationAlexaSkillConfigurationResult call() throws Exception {
                PutSipMediaApplicationAlexaSkillConfigurationResult result = null;

                try {
                    result = executePutSipMediaApplicationAlexaSkillConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            PutSipMediaApplicationLoggingConfigurationRequest request) {

        return putSipMediaApplicationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            final PutSipMediaApplicationLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationLoggingConfigurationRequest, PutSipMediaApplicationLoggingConfigurationResult> asyncHandler) {
        final PutSipMediaApplicationLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutSipMediaApplicationLoggingConfigurationResult>() {
            @Override
            public PutSipMediaApplicationLoggingConfigurationResult call() throws Exception {
                PutSipMediaApplicationLoggingConfigurationResult result = null;

                try {
                    result = executePutSipMediaApplicationLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            PutVoiceConnectorEmergencyCallingConfigurationRequest request) {

        return putVoiceConnectorEmergencyCallingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            final PutVoiceConnectorEmergencyCallingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorEmergencyCallingConfigurationRequest, PutVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler) {
        final PutVoiceConnectorEmergencyCallingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorEmergencyCallingConfigurationResult>() {
            @Override
            public PutVoiceConnectorEmergencyCallingConfigurationResult call() throws Exception {
                PutVoiceConnectorEmergencyCallingConfigurationResult result = null;

                try {
                    result = executePutVoiceConnectorEmergencyCallingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest request) {

        return putVoiceConnectorLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            final PutVoiceConnectorLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorLoggingConfigurationRequest, PutVoiceConnectorLoggingConfigurationResult> asyncHandler) {
        final PutVoiceConnectorLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorLoggingConfigurationResult>() {
            @Override
            public PutVoiceConnectorLoggingConfigurationResult call() throws Exception {
                PutVoiceConnectorLoggingConfigurationResult result = null;

                try {
                    result = executePutVoiceConnectorLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(PutVoiceConnectorOriginationRequest request) {

        return putVoiceConnectorOriginationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(final PutVoiceConnectorOriginationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorOriginationRequest, PutVoiceConnectorOriginationResult> asyncHandler) {
        final PutVoiceConnectorOriginationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorOriginationResult>() {
            @Override
            public PutVoiceConnectorOriginationResult call() throws Exception {
                PutVoiceConnectorOriginationResult result = null;

                try {
                    result = executePutVoiceConnectorOrigination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest request) {

        return putVoiceConnectorProxyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(final PutVoiceConnectorProxyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorProxyRequest, PutVoiceConnectorProxyResult> asyncHandler) {
        final PutVoiceConnectorProxyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorProxyResult>() {
            @Override
            public PutVoiceConnectorProxyResult call() throws Exception {
                PutVoiceConnectorProxyResult result = null;

                try {
                    result = executePutVoiceConnectorProxy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest request) {

        return putVoiceConnectorStreamingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            final PutVoiceConnectorStreamingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorStreamingConfigurationRequest, PutVoiceConnectorStreamingConfigurationResult> asyncHandler) {
        final PutVoiceConnectorStreamingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorStreamingConfigurationResult>() {
            @Override
            public PutVoiceConnectorStreamingConfigurationResult call() throws Exception {
                PutVoiceConnectorStreamingConfigurationResult result = null;

                try {
                    result = executePutVoiceConnectorStreamingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(PutVoiceConnectorTerminationRequest request) {

        return putVoiceConnectorTerminationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(final PutVoiceConnectorTerminationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationRequest, PutVoiceConnectorTerminationResult> asyncHandler) {
        final PutVoiceConnectorTerminationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorTerminationResult>() {
            @Override
            public PutVoiceConnectorTerminationResult call() throws Exception {
                PutVoiceConnectorTerminationResult result = null;

                try {
                    result = executePutVoiceConnectorTermination(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest request) {

        return putVoiceConnectorTerminationCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            final PutVoiceConnectorTerminationCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationCredentialsRequest, PutVoiceConnectorTerminationCredentialsResult> asyncHandler) {
        final PutVoiceConnectorTerminationCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutVoiceConnectorTerminationCredentialsResult>() {
            @Override
            public PutVoiceConnectorTerminationCredentialsResult call() throws Exception {
                PutVoiceConnectorTerminationCredentialsResult result = null;

                try {
                    result = executePutVoiceConnectorTerminationCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest request) {

        return restorePhoneNumberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(final RestorePhoneNumberRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestorePhoneNumberRequest, RestorePhoneNumberResult> asyncHandler) {
        final RestorePhoneNumberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestorePhoneNumberResult>() {
            @Override
            public RestorePhoneNumberResult call() throws Exception {
                RestorePhoneNumberResult result = null;

                try {
                    result = executeRestorePhoneNumber(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest request) {

        return updateGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(final UpdateGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler) {
        final UpdateGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlobalSettingsResult>() {
            @Override
            public UpdateGlobalSettingsResult call() throws Exception {
                UpdateGlobalSettingsResult result = null;

                try {
                    result = executeUpdateGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(UpdatePhoneNumberSettingsRequest request) {

        return updatePhoneNumberSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(final UpdatePhoneNumberSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberSettingsRequest, UpdatePhoneNumberSettingsResult> asyncHandler) {
        final UpdatePhoneNumberSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePhoneNumberSettingsResult>() {
            @Override
            public UpdatePhoneNumberSettingsResult call() throws Exception {
                UpdatePhoneNumberSettingsResult result = null;

                try {
                    result = executeUpdatePhoneNumberSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest request) {

        return updateProxySessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(final UpdateProxySessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProxySessionRequest, UpdateProxySessionResult> asyncHandler) {
        final UpdateProxySessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProxySessionResult>() {
            @Override
            public UpdateProxySessionResult call() throws Exception {
                UpdateProxySessionResult result = null;

                try {
                    result = executeUpdateProxySession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(UpdateSipMediaApplicationRequest request) {

        return updateSipMediaApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(final UpdateSipMediaApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSipMediaApplicationRequest, UpdateSipMediaApplicationResult> asyncHandler) {
        final UpdateSipMediaApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSipMediaApplicationResult>() {
            @Override
            public UpdateSipMediaApplicationResult call() throws Exception {
                UpdateSipMediaApplicationResult result = null;

                try {
                    result = executeUpdateSipMediaApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSipMediaApplicationCallResult> updateSipMediaApplicationCallAsync(UpdateSipMediaApplicationCallRequest request) {

        return updateSipMediaApplicationCallAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSipMediaApplicationCallResult> updateSipMediaApplicationCallAsync(
            final UpdateSipMediaApplicationCallRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSipMediaApplicationCallRequest, UpdateSipMediaApplicationCallResult> asyncHandler) {
        final UpdateSipMediaApplicationCallRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSipMediaApplicationCallResult>() {
            @Override
            public UpdateSipMediaApplicationCallResult call() throws Exception {
                UpdateSipMediaApplicationCallResult result = null;

                try {
                    result = executeUpdateSipMediaApplicationCall(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest request) {

        return updateSipRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(final UpdateSipRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSipRuleRequest, UpdateSipRuleResult> asyncHandler) {
        final UpdateSipRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSipRuleResult>() {
            @Override
            public UpdateSipRuleResult call() throws Exception {
                UpdateSipRuleResult result = null;

                try {
                    result = executeUpdateSipRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest request) {

        return updateVoiceConnectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(final UpdateVoiceConnectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorRequest, UpdateVoiceConnectorResult> asyncHandler) {
        final UpdateVoiceConnectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVoiceConnectorResult>() {
            @Override
            public UpdateVoiceConnectorResult call() throws Exception {
                UpdateVoiceConnectorResult result = null;

                try {
                    result = executeUpdateVoiceConnector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(UpdateVoiceConnectorGroupRequest request) {

        return updateVoiceConnectorGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(final UpdateVoiceConnectorGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorGroupRequest, UpdateVoiceConnectorGroupResult> asyncHandler) {
        final UpdateVoiceConnectorGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVoiceConnectorGroupResult>() {
            @Override
            public UpdateVoiceConnectorGroupResult call() throws Exception {
                UpdateVoiceConnectorGroupResult result = null;

                try {
                    result = executeUpdateVoiceConnectorGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidateE911AddressResult> validateE911AddressAsync(ValidateE911AddressRequest request) {

        return validateE911AddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateE911AddressResult> validateE911AddressAsync(final ValidateE911AddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateE911AddressRequest, ValidateE911AddressResult> asyncHandler) {
        final ValidateE911AddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateE911AddressResult>() {
            @Override
            public ValidateE911AddressResult call() throws Exception {
                ValidateE911AddressResult result = null;

                try {
                    result = executeValidateE911Address(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
