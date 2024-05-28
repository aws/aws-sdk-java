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
package com.amazonaws.services.paymentcryptography;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Payment Cryptography Control Plane asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Payment Cryptography Control Plane APIs manage encryption keys for use during payment-related
 * cryptographic operations. You can create, import, export, share, manage, and delete keys. You can also manage
 * Identity and Access Management (IAM) policies for keys. For more information, see <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/security-iam.html">Identity and access
 * management</a> in the <i>Amazon Web Services Payment Cryptography User Guide.</i>
 * </p>
 * <p>
 * To use encryption keys for payment-related transaction processing and associated cryptographic operations, you use
 * the <a href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/Welcome.html">Amazon Web
 * Services Payment Cryptography Data Plane</a>. You can perform actions like encrypt, decrypt, generate, and verify
 * payment-related data.
 * </p>
 * <p>
 * All Amazon Web Services Payment Cryptography API calls must be signed and transmitted using Transport Layer Security
 * (TLS). We recommend you always use the latest supported TLS version for logging API requests.
 * </p>
 * <p>
 * Amazon Web Services Payment Cryptography supports CloudTrail for control plane operations, a service that logs Amazon
 * Web Services API calls and related events for your Amazon Web Services account and delivers them to an Amazon S3
 * bucket you specify. By using the information collected by CloudTrail, you can determine what requests were made to
 * Amazon Web Services Payment Cryptography, who made the request, when it was made, and so on. If you don't conﬁgure a
 * trail, you can still view the most recent events in the CloudTrail console. For more information, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/">CloudTrail User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPaymentCryptographyAsyncClient extends AWSPaymentCryptographyClient implements AWSPaymentCryptographyAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPaymentCryptographyAsyncClientBuilder asyncBuilder() {
        return AWSPaymentCryptographyAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Payment Cryptography Control Plane using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPaymentCryptographyAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Payment Cryptography Control Plane using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSPaymentCryptographyAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest request) {

        return createKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(final CreateKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {
        final CreateKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateKeyResult>() {
            @Override
            public CreateKeyResult call() throws Exception {
                CreateKeyResult result = null;

                try {
                    result = executeCreateKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
        final DeleteAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result = null;

                try {
                    result = executeDeleteAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request) {

        return deleteKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(final DeleteKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler) {
        final DeleteKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyResult>() {
            @Override
            public DeleteKeyResult call() throws Exception {
                DeleteKeyResult result = null;

                try {
                    result = executeDeleteKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(ExportKeyRequest request) {

        return exportKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(final ExportKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportKeyRequest, ExportKeyResult> asyncHandler) {
        final ExportKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportKeyResult>() {
            @Override
            public ExportKeyResult call() throws Exception {
                ExportKeyResult result = null;

                try {
                    result = executeExportKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest request) {

        return getAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAliasResult> getAliasAsync(final GetAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler) {
        final GetAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAliasResult>() {
            @Override
            public GetAliasResult call() throws Exception {
                GetAliasResult result = null;

                try {
                    result = executeGetAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request) {

        return getKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(final GetKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler) {
        final GetKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyResult>() {
            @Override
            public GetKeyResult call() throws Exception {
                GetKeyResult result = null;

                try {
                    result = executeGetKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(GetParametersForExportRequest request) {

        return getParametersForExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(final GetParametersForExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersForExportRequest, GetParametersForExportResult> asyncHandler) {
        final GetParametersForExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParametersForExportResult>() {
            @Override
            public GetParametersForExportResult call() throws Exception {
                GetParametersForExportResult result = null;

                try {
                    result = executeGetParametersForExport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest request) {

        return getParametersForImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(final GetParametersForImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler) {
        final GetParametersForImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParametersForImportResult>() {
            @Override
            public GetParametersForImportResult call() throws Exception {
                GetParametersForImportResult result = null;

                try {
                    result = executeGetParametersForImport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(GetPublicKeyCertificateRequest request) {

        return getPublicKeyCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(final GetPublicKeyCertificateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPublicKeyCertificateRequest, GetPublicKeyCertificateResult> asyncHandler) {
        final GetPublicKeyCertificateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPublicKeyCertificateResult>() {
            @Override
            public GetPublicKeyCertificateResult call() throws Exception {
                GetPublicKeyCertificateResult result = null;

                try {
                    result = executeGetPublicKeyCertificate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportKeyResult> importKeyAsync(ImportKeyRequest request) {

        return importKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportKeyResult> importKeyAsync(final ImportKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportKeyRequest, ImportKeyResult> asyncHandler) {
        final ImportKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportKeyResult>() {
            @Override
            public ImportKeyResult call() throws Exception {
                ImportKeyResult result = null;

                try {
                    result = executeImportKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
        final ListAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result = null;

                try {
                    result = executeListAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(final ListKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {
        final ListKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeysResult>() {
            @Override
            public ListKeysResult call() throws Exception {
                ListKeysResult result = null;

                try {
                    result = executeListKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(RestoreKeyRequest request) {

        return restoreKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(final RestoreKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreKeyRequest, RestoreKeyResult> asyncHandler) {
        final RestoreKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreKeyResult>() {
            @Override
            public RestoreKeyResult call() throws Exception {
                RestoreKeyResult result = null;

                try {
                    result = executeRestoreKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(StartKeyUsageRequest request) {

        return startKeyUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(final StartKeyUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartKeyUsageRequest, StartKeyUsageResult> asyncHandler) {
        final StartKeyUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartKeyUsageResult>() {
            @Override
            public StartKeyUsageResult call() throws Exception {
                StartKeyUsageResult result = null;

                try {
                    result = executeStartKeyUsage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(StopKeyUsageRequest request) {

        return stopKeyUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(final StopKeyUsageRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopKeyUsageRequest, StopKeyUsageResult> asyncHandler) {
        final StopKeyUsageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopKeyUsageResult>() {
            @Override
            public StopKeyUsageResult call() throws Exception {
                StopKeyUsageResult result = null;

                try {
                    result = executeStopKeyUsage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {
        final UpdateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result = null;

                try {
                    result = executeUpdateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
