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
package com.amazonaws.services.paymentcryptographydata;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptographydata.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Payment Cryptography Data Plane asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * You use the Amazon Web Services Payment Cryptography Data Plane to manage how encryption keys are used for
 * payment-related transaction processing and associated cryptographic operations. You can encrypt, decrypt, generate,
 * verify, and translate payment-related cryptographic operations in Amazon Web Services Payment Cryptography. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/data-operations.html">Data operations</a> in
 * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
 * </p>
 * <p>
 * To manage your encryption keys, you use the <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/Welcome.html">Amazon Web Services Payment
 * Cryptography Control Plane</a>. You can create, import, export, share, manage, and delete keys. You can also manage
 * Identity and Access Management (IAM) policies for keys.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPaymentCryptographyDataAsyncClient extends AWSPaymentCryptographyDataClient implements AWSPaymentCryptographyDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPaymentCryptographyDataAsyncClientBuilder asyncBuilder() {
        return AWSPaymentCryptographyDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Payment Cryptography Data Plane using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPaymentCryptographyDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Payment Cryptography Data Plane using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSPaymentCryptographyDataAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DecryptDataResult> decryptDataAsync(DecryptDataRequest request) {

        return decryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptDataResult> decryptDataAsync(final DecryptDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecryptDataRequest, DecryptDataResult> asyncHandler) {
        final DecryptDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DecryptDataResult>() {
            @Override
            public DecryptDataResult call() throws Exception {
                DecryptDataResult result = null;

                try {
                    result = executeDecryptData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EncryptDataResult> encryptDataAsync(EncryptDataRequest request) {

        return encryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptDataResult> encryptDataAsync(final EncryptDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<EncryptDataRequest, EncryptDataResult> asyncHandler) {
        final EncryptDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EncryptDataResult>() {
            @Override
            public EncryptDataResult call() throws Exception {
                EncryptDataResult result = null;

                try {
                    result = executeEncryptData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateCardValidationDataResult> generateCardValidationDataAsync(GenerateCardValidationDataRequest request) {

        return generateCardValidationDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateCardValidationDataResult> generateCardValidationDataAsync(final GenerateCardValidationDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateCardValidationDataRequest, GenerateCardValidationDataResult> asyncHandler) {
        final GenerateCardValidationDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateCardValidationDataResult>() {
            @Override
            public GenerateCardValidationDataResult call() throws Exception {
                GenerateCardValidationDataResult result = null;

                try {
                    result = executeGenerateCardValidationData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateMacResult> generateMacAsync(GenerateMacRequest request) {

        return generateMacAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateMacResult> generateMacAsync(final GenerateMacRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateMacRequest, GenerateMacResult> asyncHandler) {
        final GenerateMacRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateMacResult>() {
            @Override
            public GenerateMacResult call() throws Exception {
                GenerateMacResult result = null;

                try {
                    result = executeGenerateMac(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GeneratePinDataResult> generatePinDataAsync(GeneratePinDataRequest request) {

        return generatePinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GeneratePinDataResult> generatePinDataAsync(final GeneratePinDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GeneratePinDataRequest, GeneratePinDataResult> asyncHandler) {
        final GeneratePinDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GeneratePinDataResult>() {
            @Override
            public GeneratePinDataResult call() throws Exception {
                GeneratePinDataResult result = null;

                try {
                    result = executeGeneratePinData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ReEncryptDataResult> reEncryptDataAsync(ReEncryptDataRequest request) {

        return reEncryptDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptDataResult> reEncryptDataAsync(final ReEncryptDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReEncryptDataRequest, ReEncryptDataResult> asyncHandler) {
        final ReEncryptDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ReEncryptDataResult>() {
            @Override
            public ReEncryptDataResult call() throws Exception {
                ReEncryptDataResult result = null;

                try {
                    result = executeReEncryptData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TranslatePinDataResult> translatePinDataAsync(TranslatePinDataRequest request) {

        return translatePinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TranslatePinDataResult> translatePinDataAsync(final TranslatePinDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<TranslatePinDataRequest, TranslatePinDataResult> asyncHandler) {
        final TranslatePinDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TranslatePinDataResult>() {
            @Override
            public TranslatePinDataResult call() throws Exception {
                TranslatePinDataResult result = null;

                try {
                    result = executeTranslatePinData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyAuthRequestCryptogramResult> verifyAuthRequestCryptogramAsync(VerifyAuthRequestCryptogramRequest request) {

        return verifyAuthRequestCryptogramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyAuthRequestCryptogramResult> verifyAuthRequestCryptogramAsync(final VerifyAuthRequestCryptogramRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyAuthRequestCryptogramRequest, VerifyAuthRequestCryptogramResult> asyncHandler) {
        final VerifyAuthRequestCryptogramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyAuthRequestCryptogramResult>() {
            @Override
            public VerifyAuthRequestCryptogramResult call() throws Exception {
                VerifyAuthRequestCryptogramResult result = null;

                try {
                    result = executeVerifyAuthRequestCryptogram(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyCardValidationDataResult> verifyCardValidationDataAsync(VerifyCardValidationDataRequest request) {

        return verifyCardValidationDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyCardValidationDataResult> verifyCardValidationDataAsync(final VerifyCardValidationDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyCardValidationDataRequest, VerifyCardValidationDataResult> asyncHandler) {
        final VerifyCardValidationDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyCardValidationDataResult>() {
            @Override
            public VerifyCardValidationDataResult call() throws Exception {
                VerifyCardValidationDataResult result = null;

                try {
                    result = executeVerifyCardValidationData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyMacResult> verifyMacAsync(VerifyMacRequest request) {

        return verifyMacAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyMacResult> verifyMacAsync(final VerifyMacRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyMacRequest, VerifyMacResult> asyncHandler) {
        final VerifyMacRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyMacResult>() {
            @Override
            public VerifyMacResult call() throws Exception {
                VerifyMacResult result = null;

                try {
                    result = executeVerifyMac(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<VerifyPinDataResult> verifyPinDataAsync(VerifyPinDataRequest request) {

        return verifyPinDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyPinDataResult> verifyPinDataAsync(final VerifyPinDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<VerifyPinDataRequest, VerifyPinDataResult> asyncHandler) {
        final VerifyPinDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<VerifyPinDataResult>() {
            @Override
            public VerifyPinDataResult call() throws Exception {
                VerifyPinDataResult result = null;

                try {
                    result = executeVerifyPinData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
