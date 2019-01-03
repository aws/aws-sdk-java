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
package com.amazonaws.services.macie;

import javax.annotation.Generated;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Macie asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Macie</fullname>
 * <p>
 * Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
 * sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
 * intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
 * accessed or moved. For more information, see the <a
 * href="https://docs.aws.amazon.com/macie/latest/userguide/what-is-macie.html">Macie User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMacieAsyncClient extends AmazonMacieClient implements AmazonMacieAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonMacieAsyncClientBuilder asyncBuilder() {
        return AmazonMacieAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Macie using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonMacieAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(AssociateMemberAccountRequest request) {

        return associateMemberAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberAccountResult> associateMemberAccountAsync(final AssociateMemberAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberAccountRequest, AssociateMemberAccountResult> asyncHandler) {
        final AssociateMemberAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberAccountResult>() {
            @Override
            public AssociateMemberAccountResult call() throws Exception {
                AssociateMemberAccountResult result = null;

                try {
                    result = executeAssociateMemberAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(AssociateS3ResourcesRequest request) {

        return associateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateS3ResourcesResult> associateS3ResourcesAsync(final AssociateS3ResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateS3ResourcesRequest, AssociateS3ResourcesResult> asyncHandler) {
        final AssociateS3ResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateS3ResourcesResult>() {
            @Override
            public AssociateS3ResourcesResult call() throws Exception {
                AssociateS3ResourcesResult result = null;

                try {
                    result = executeAssociateS3Resources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(DisassociateMemberAccountRequest request) {

        return disassociateMemberAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberAccountResult> disassociateMemberAccountAsync(final DisassociateMemberAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberAccountRequest, DisassociateMemberAccountResult> asyncHandler) {
        final DisassociateMemberAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberAccountResult>() {
            @Override
            public DisassociateMemberAccountResult call() throws Exception {
                DisassociateMemberAccountResult result = null;

                try {
                    result = executeDisassociateMemberAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(DisassociateS3ResourcesRequest request) {

        return disassociateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateS3ResourcesResult> disassociateS3ResourcesAsync(final DisassociateS3ResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateS3ResourcesRequest, DisassociateS3ResourcesResult> asyncHandler) {
        final DisassociateS3ResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateS3ResourcesResult>() {
            @Override
            public DisassociateS3ResourcesResult call() throws Exception {
                DisassociateS3ResourcesResult result = null;

                try {
                    result = executeDisassociateS3Resources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest request) {

        return listMemberAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(final ListMemberAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler) {
        final ListMemberAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMemberAccountsResult>() {
            @Override
            public ListMemberAccountsResult call() throws Exception {
                ListMemberAccountsResult result = null;

                try {
                    result = executeListMemberAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(ListS3ResourcesRequest request) {

        return listS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListS3ResourcesResult> listS3ResourcesAsync(final ListS3ResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListS3ResourcesRequest, ListS3ResourcesResult> asyncHandler) {
        final ListS3ResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListS3ResourcesResult>() {
            @Override
            public ListS3ResourcesResult call() throws Exception {
                ListS3ResourcesResult result = null;

                try {
                    result = executeListS3Resources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(UpdateS3ResourcesRequest request) {

        return updateS3ResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateS3ResourcesResult> updateS3ResourcesAsync(final UpdateS3ResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateS3ResourcesRequest, UpdateS3ResourcesResult> asyncHandler) {
        final UpdateS3ResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateS3ResourcesResult>() {
            @Override
            public UpdateS3ResourcesResult call() throws Exception {
                UpdateS3ResourcesResult result = null;

                try {
                    result = executeUpdateS3Resources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
