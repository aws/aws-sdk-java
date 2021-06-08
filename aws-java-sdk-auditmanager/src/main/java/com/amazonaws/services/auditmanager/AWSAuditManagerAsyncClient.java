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
package com.amazonaws.services.auditmanager;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Audit Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the AWS Audit Manager API reference. This guide is for developers who need detailed information about the
 * AWS Audit Manager API operations, data types, and errors.
 * </p>
 * <p>
 * AWS Audit Manager is a service that provides automated evidence collection so that you can continuously audit your
 * AWS usage, and assess the effectiveness of your controls to better manage risk and simplify compliance.
 * </p>
 * <p>
 * AWS Audit Manager provides pre-built frameworks that structure and automate assessments for a given compliance
 * standard. Frameworks include a pre-built collection of controls with descriptions and testing procedures, which are
 * grouped according to the requirements of the specified compliance standard or regulation. You can also customize
 * frameworks and controls to support internal audits with unique requirements.
 * </p>
 * <p>
 * Use the following links to get started with the AWS Audit Manager API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Operations.html">Actions</a>: An
 * alphabetical list of all AWS Audit Manager API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Types.html">Data types</a>: An
 * alphabetical list of all AWS Audit Manager data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/CommonParameters.html">Common parameters</a>:
 * Parameters that all Query operations can use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/CommonErrors.html">Common errors</a>: Client
 * and server errors that all operations can return.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you're new to AWS Audit Manager, we recommend that you review the <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/what-is.html"> AWS Audit Manager User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAuditManagerAsyncClient extends AWSAuditManagerClient implements AWSAuditManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAuditManagerAsyncClientBuilder asyncBuilder() {
        return AWSAuditManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Audit Manager using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAuditManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Audit Manager using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAuditManagerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            AssociateAssessmentReportEvidenceFolderRequest request) {

        return associateAssessmentReportEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            final AssociateAssessmentReportEvidenceFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateAssessmentReportEvidenceFolderRequest, AssociateAssessmentReportEvidenceFolderResult> asyncHandler) {
        final AssociateAssessmentReportEvidenceFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateAssessmentReportEvidenceFolderResult>() {
            @Override
            public AssociateAssessmentReportEvidenceFolderResult call() throws Exception {
                AssociateAssessmentReportEvidenceFolderResult result = null;

                try {
                    result = executeAssociateAssessmentReportEvidenceFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            BatchAssociateAssessmentReportEvidenceRequest request) {

        return batchAssociateAssessmentReportEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            final BatchAssociateAssessmentReportEvidenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAssociateAssessmentReportEvidenceRequest, BatchAssociateAssessmentReportEvidenceResult> asyncHandler) {
        final BatchAssociateAssessmentReportEvidenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAssociateAssessmentReportEvidenceResult>() {
            @Override
            public BatchAssociateAssessmentReportEvidenceResult call() throws Exception {
                BatchAssociateAssessmentReportEvidenceResult result = null;

                try {
                    result = executeBatchAssociateAssessmentReportEvidence(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            BatchCreateDelegationByAssessmentRequest request) {

        return batchCreateDelegationByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            final BatchCreateDelegationByAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateDelegationByAssessmentRequest, BatchCreateDelegationByAssessmentResult> asyncHandler) {
        final BatchCreateDelegationByAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateDelegationByAssessmentResult>() {
            @Override
            public BatchCreateDelegationByAssessmentResult call() throws Exception {
                BatchCreateDelegationByAssessmentResult result = null;

                try {
                    result = executeBatchCreateDelegationByAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            BatchDeleteDelegationByAssessmentRequest request) {

        return batchDeleteDelegationByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            final BatchDeleteDelegationByAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteDelegationByAssessmentRequest, BatchDeleteDelegationByAssessmentResult> asyncHandler) {
        final BatchDeleteDelegationByAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteDelegationByAssessmentResult>() {
            @Override
            public BatchDeleteDelegationByAssessmentResult call() throws Exception {
                BatchDeleteDelegationByAssessmentResult result = null;

                try {
                    result = executeBatchDeleteDelegationByAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            BatchDisassociateAssessmentReportEvidenceRequest request) {

        return batchDisassociateAssessmentReportEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            final BatchDisassociateAssessmentReportEvidenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisassociateAssessmentReportEvidenceRequest, BatchDisassociateAssessmentReportEvidenceResult> asyncHandler) {
        final BatchDisassociateAssessmentReportEvidenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisassociateAssessmentReportEvidenceResult>() {
            @Override
            public BatchDisassociateAssessmentReportEvidenceResult call() throws Exception {
                BatchDisassociateAssessmentReportEvidenceResult result = null;

                try {
                    result = executeBatchDisassociateAssessmentReportEvidence(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            BatchImportEvidenceToAssessmentControlRequest request) {

        return batchImportEvidenceToAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            final BatchImportEvidenceToAssessmentControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchImportEvidenceToAssessmentControlRequest, BatchImportEvidenceToAssessmentControlResult> asyncHandler) {
        final BatchImportEvidenceToAssessmentControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchImportEvidenceToAssessmentControlResult>() {
            @Override
            public BatchImportEvidenceToAssessmentControlResult call() throws Exception {
                BatchImportEvidenceToAssessmentControlResult result = null;

                try {
                    result = executeBatchImportEvidenceToAssessmentControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(CreateAssessmentRequest request) {

        return createAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(final CreateAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentRequest, CreateAssessmentResult> asyncHandler) {
        final CreateAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentResult>() {
            @Override
            public CreateAssessmentResult call() throws Exception {
                CreateAssessmentResult result = null;

                try {
                    result = executeCreateAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(CreateAssessmentFrameworkRequest request) {

        return createAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(final CreateAssessmentFrameworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentFrameworkRequest, CreateAssessmentFrameworkResult> asyncHandler) {
        final CreateAssessmentFrameworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentFrameworkResult>() {
            @Override
            public CreateAssessmentFrameworkResult call() throws Exception {
                CreateAssessmentFrameworkResult result = null;

                try {
                    result = executeCreateAssessmentFramework(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(CreateAssessmentReportRequest request) {

        return createAssessmentReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(final CreateAssessmentReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssessmentReportRequest, CreateAssessmentReportResult> asyncHandler) {
        final CreateAssessmentReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAssessmentReportResult>() {
            @Override
            public CreateAssessmentReportResult call() throws Exception {
                CreateAssessmentReportResult result = null;

                try {
                    result = executeCreateAssessmentReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateControlResult> createControlAsync(CreateControlRequest request) {

        return createControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateControlResult> createControlAsync(final CreateControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateControlRequest, CreateControlResult> asyncHandler) {
        final CreateControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateControlResult>() {
            @Override
            public CreateControlResult call() throws Exception {
                CreateControlResult result = null;

                try {
                    result = executeCreateControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(DeleteAssessmentRequest request) {

        return deleteAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(final DeleteAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRequest, DeleteAssessmentResult> asyncHandler) {
        final DeleteAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentResult>() {
            @Override
            public DeleteAssessmentResult call() throws Exception {
                DeleteAssessmentResult result = null;

                try {
                    result = executeDeleteAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(DeleteAssessmentFrameworkRequest request) {

        return deleteAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(final DeleteAssessmentFrameworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentFrameworkRequest, DeleteAssessmentFrameworkResult> asyncHandler) {
        final DeleteAssessmentFrameworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentFrameworkResult>() {
            @Override
            public DeleteAssessmentFrameworkResult call() throws Exception {
                DeleteAssessmentFrameworkResult result = null;

                try {
                    result = executeDeleteAssessmentFramework(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(DeleteAssessmentReportRequest request) {

        return deleteAssessmentReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(final DeleteAssessmentReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssessmentReportRequest, DeleteAssessmentReportResult> asyncHandler) {
        final DeleteAssessmentReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAssessmentReportResult>() {
            @Override
            public DeleteAssessmentReportResult call() throws Exception {
                DeleteAssessmentReportResult result = null;

                try {
                    result = executeDeleteAssessmentReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(DeleteControlRequest request) {

        return deleteControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(final DeleteControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteControlRequest, DeleteControlResult> asyncHandler) {
        final DeleteControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteControlResult>() {
            @Override
            public DeleteControlResult call() throws Exception {
                DeleteControlResult result = null;

                try {
                    result = executeDeleteControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(DeregisterAccountRequest request) {

        return deregisterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(final DeregisterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterAccountRequest, DeregisterAccountResult> asyncHandler) {
        final DeregisterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterAccountResult>() {
            @Override
            public DeregisterAccountResult call() throws Exception {
                DeregisterAccountResult result = null;

                try {
                    result = executeDeregisterAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            DeregisterOrganizationAdminAccountRequest request) {

        return deregisterOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            final DeregisterOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterOrganizationAdminAccountRequest, DeregisterOrganizationAdminAccountResult> asyncHandler) {
        final DeregisterOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterOrganizationAdminAccountResult>() {
            @Override
            public DeregisterOrganizationAdminAccountResult call() throws Exception {
                DeregisterOrganizationAdminAccountResult result = null;

                try {
                    result = executeDeregisterOrganizationAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            DisassociateAssessmentReportEvidenceFolderRequest request) {

        return disassociateAssessmentReportEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            final DisassociateAssessmentReportEvidenceFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateAssessmentReportEvidenceFolderRequest, DisassociateAssessmentReportEvidenceFolderResult> asyncHandler) {
        final DisassociateAssessmentReportEvidenceFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateAssessmentReportEvidenceFolderResult>() {
            @Override
            public DisassociateAssessmentReportEvidenceFolderResult call() throws Exception {
                DisassociateAssessmentReportEvidenceFolderResult result = null;

                try {
                    result = executeDisassociateAssessmentReportEvidenceFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(GetAccountStatusRequest request) {

        return getAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(final GetAccountStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountStatusRequest, GetAccountStatusResult> asyncHandler) {
        final GetAccountStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountStatusResult>() {
            @Override
            public GetAccountStatusResult call() throws Exception {
                GetAccountStatusResult result = null;

                try {
                    result = executeGetAccountStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest request) {

        return getAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(final GetAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentRequest, GetAssessmentResult> asyncHandler) {
        final GetAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssessmentResult>() {
            @Override
            public GetAssessmentResult call() throws Exception {
                GetAssessmentResult result = null;

                try {
                    result = executeGetAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(GetAssessmentFrameworkRequest request) {

        return getAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(final GetAssessmentFrameworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentFrameworkRequest, GetAssessmentFrameworkResult> asyncHandler) {
        final GetAssessmentFrameworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssessmentFrameworkResult>() {
            @Override
            public GetAssessmentFrameworkResult call() throws Exception {
                GetAssessmentFrameworkResult result = null;

                try {
                    result = executeGetAssessmentFramework(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(GetAssessmentReportUrlRequest request) {

        return getAssessmentReportUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(final GetAssessmentReportUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAssessmentReportUrlRequest, GetAssessmentReportUrlResult> asyncHandler) {
        final GetAssessmentReportUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAssessmentReportUrlResult>() {
            @Override
            public GetAssessmentReportUrlResult call() throws Exception {
                GetAssessmentReportUrlResult result = null;

                try {
                    result = executeGetAssessmentReportUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(GetChangeLogsRequest request) {

        return getChangeLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(final GetChangeLogsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChangeLogsRequest, GetChangeLogsResult> asyncHandler) {
        final GetChangeLogsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChangeLogsResult>() {
            @Override
            public GetChangeLogsResult call() throws Exception {
                GetChangeLogsResult result = null;

                try {
                    result = executeGetChangeLogs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetControlResult> getControlAsync(GetControlRequest request) {

        return getControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetControlResult> getControlAsync(final GetControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetControlRequest, GetControlResult> asyncHandler) {
        final GetControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetControlResult>() {
            @Override
            public GetControlResult call() throws Exception {
                GetControlResult result = null;

                try {
                    result = executeGetControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(GetDelegationsRequest request) {

        return getDelegationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(final GetDelegationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDelegationsRequest, GetDelegationsResult> asyncHandler) {
        final GetDelegationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDelegationsResult>() {
            @Override
            public GetDelegationsResult call() throws Exception {
                GetDelegationsResult result = null;

                try {
                    result = executeGetDelegations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(GetEvidenceRequest request) {

        return getEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(final GetEvidenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvidenceRequest, GetEvidenceResult> asyncHandler) {
        final GetEvidenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvidenceResult>() {
            @Override
            public GetEvidenceResult call() throws Exception {
                GetEvidenceResult result = null;

                try {
                    result = executeGetEvidence(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(GetEvidenceByEvidenceFolderRequest request) {

        return getEvidenceByEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(final GetEvidenceByEvidenceFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvidenceByEvidenceFolderRequest, GetEvidenceByEvidenceFolderResult> asyncHandler) {
        final GetEvidenceByEvidenceFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvidenceByEvidenceFolderResult>() {
            @Override
            public GetEvidenceByEvidenceFolderResult call() throws Exception {
                GetEvidenceByEvidenceFolderResult result = null;

                try {
                    result = executeGetEvidenceByEvidenceFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(GetEvidenceFolderRequest request) {

        return getEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(final GetEvidenceFolderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvidenceFolderRequest, GetEvidenceFolderResult> asyncHandler) {
        final GetEvidenceFolderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvidenceFolderResult>() {
            @Override
            public GetEvidenceFolderResult call() throws Exception {
                GetEvidenceFolderResult result = null;

                try {
                    result = executeGetEvidenceFolder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(GetEvidenceFoldersByAssessmentRequest request) {

        return getEvidenceFoldersByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(
            final GetEvidenceFoldersByAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentRequest, GetEvidenceFoldersByAssessmentResult> asyncHandler) {
        final GetEvidenceFoldersByAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvidenceFoldersByAssessmentResult>() {
            @Override
            public GetEvidenceFoldersByAssessmentResult call() throws Exception {
                GetEvidenceFoldersByAssessmentResult result = null;

                try {
                    result = executeGetEvidenceFoldersByAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            GetEvidenceFoldersByAssessmentControlRequest request) {

        return getEvidenceFoldersByAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            final GetEvidenceFoldersByAssessmentControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentControlRequest, GetEvidenceFoldersByAssessmentControlResult> asyncHandler) {
        final GetEvidenceFoldersByAssessmentControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEvidenceFoldersByAssessmentControlResult>() {
            @Override
            public GetEvidenceFoldersByAssessmentControlResult call() throws Exception {
                GetEvidenceFoldersByAssessmentControlResult result = null;

                try {
                    result = executeGetEvidenceFoldersByAssessmentControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(GetOrganizationAdminAccountRequest request) {

        return getOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(final GetOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOrganizationAdminAccountRequest, GetOrganizationAdminAccountResult> asyncHandler) {
        final GetOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOrganizationAdminAccountResult>() {
            @Override
            public GetOrganizationAdminAccountResult call() throws Exception {
                GetOrganizationAdminAccountResult result = null;

                try {
                    result = executeGetOrganizationAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(GetServicesInScopeRequest request) {

        return getServicesInScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(final GetServicesInScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetServicesInScopeRequest, GetServicesInScopeResult> asyncHandler) {
        final GetServicesInScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetServicesInScopeResult>() {
            @Override
            public GetServicesInScopeResult call() throws Exception {
                GetServicesInScopeResult result = null;

                try {
                    result = executeGetServicesInScope(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(GetSettingsRequest request) {

        return getSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(final GetSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSettingsRequest, GetSettingsResult> asyncHandler) {
        final GetSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSettingsResult>() {
            @Override
            public GetSettingsResult call() throws Exception {
                GetSettingsResult result = null;

                try {
                    result = executeGetSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(ListAssessmentFrameworksRequest request) {

        return listAssessmentFrameworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(final ListAssessmentFrameworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentFrameworksRequest, ListAssessmentFrameworksResult> asyncHandler) {
        final ListAssessmentFrameworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentFrameworksResult>() {
            @Override
            public ListAssessmentFrameworksResult call() throws Exception {
                ListAssessmentFrameworksResult result = null;

                try {
                    result = executeListAssessmentFrameworks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(ListAssessmentReportsRequest request) {

        return listAssessmentReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(final ListAssessmentReportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentReportsRequest, ListAssessmentReportsResult> asyncHandler) {
        final ListAssessmentReportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentReportsResult>() {
            @Override
            public ListAssessmentReportsResult call() throws Exception {
                ListAssessmentReportsResult result = null;

                try {
                    result = executeListAssessmentReports(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(ListAssessmentsRequest request) {

        return listAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(final ListAssessmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssessmentsRequest, ListAssessmentsResult> asyncHandler) {
        final ListAssessmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssessmentsResult>() {
            @Override
            public ListAssessmentsResult call() throws Exception {
                ListAssessmentsResult result = null;

                try {
                    result = executeListAssessments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListControlsResult> listControlsAsync(ListControlsRequest request) {

        return listControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListControlsResult> listControlsAsync(final ListControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListControlsRequest, ListControlsResult> asyncHandler) {
        final ListControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListControlsResult>() {
            @Override
            public ListControlsResult call() throws Exception {
                ListControlsResult result = null;

                try {
                    result = executeListControls(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(ListKeywordsForDataSourceRequest request) {

        return listKeywordsForDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(final ListKeywordsForDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeywordsForDataSourceRequest, ListKeywordsForDataSourceResult> asyncHandler) {
        final ListKeywordsForDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeywordsForDataSourceResult>() {
            @Override
            public ListKeywordsForDataSourceResult call() throws Exception {
                ListKeywordsForDataSourceResult result = null;

                try {
                    result = executeListKeywordsForDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request) {

        return listNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(final ListNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler) {
        final ListNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationsResult>() {
            @Override
            public ListNotificationsResult call() throws Exception {
                ListNotificationsResult result = null;

                try {
                    result = executeListNotifications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest request) {

        return registerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(final RegisterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterAccountRequest, RegisterAccountResult> asyncHandler) {
        final RegisterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterAccountResult>() {
            @Override
            public RegisterAccountResult call() throws Exception {
                RegisterAccountResult result = null;

                try {
                    result = executeRegisterAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            RegisterOrganizationAdminAccountRequest request) {

        return registerOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            final RegisterOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterOrganizationAdminAccountRequest, RegisterOrganizationAdminAccountResult> asyncHandler) {
        final RegisterOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterOrganizationAdminAccountResult>() {
            @Override
            public RegisterOrganizationAdminAccountResult call() throws Exception {
                RegisterOrganizationAdminAccountResult result = null;

                try {
                    result = executeRegisterOrganizationAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(UpdateAssessmentRequest request) {

        return updateAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(final UpdateAssessmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentRequest, UpdateAssessmentResult> asyncHandler) {
        final UpdateAssessmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentResult>() {
            @Override
            public UpdateAssessmentResult call() throws Exception {
                UpdateAssessmentResult result = null;

                try {
                    result = executeUpdateAssessment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(UpdateAssessmentControlRequest request) {

        return updateAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(final UpdateAssessmentControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlRequest, UpdateAssessmentControlResult> asyncHandler) {
        final UpdateAssessmentControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentControlResult>() {
            @Override
            public UpdateAssessmentControlResult call() throws Exception {
                UpdateAssessmentControlResult result = null;

                try {
                    result = executeUpdateAssessmentControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            UpdateAssessmentControlSetStatusRequest request) {

        return updateAssessmentControlSetStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            final UpdateAssessmentControlSetStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlSetStatusRequest, UpdateAssessmentControlSetStatusResult> asyncHandler) {
        final UpdateAssessmentControlSetStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentControlSetStatusResult>() {
            @Override
            public UpdateAssessmentControlSetStatusResult call() throws Exception {
                UpdateAssessmentControlSetStatusResult result = null;

                try {
                    result = executeUpdateAssessmentControlSetStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(UpdateAssessmentFrameworkRequest request) {

        return updateAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(final UpdateAssessmentFrameworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentFrameworkRequest, UpdateAssessmentFrameworkResult> asyncHandler) {
        final UpdateAssessmentFrameworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentFrameworkResult>() {
            @Override
            public UpdateAssessmentFrameworkResult call() throws Exception {
                UpdateAssessmentFrameworkResult result = null;

                try {
                    result = executeUpdateAssessmentFramework(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(UpdateAssessmentStatusRequest request) {

        return updateAssessmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(final UpdateAssessmentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssessmentStatusRequest, UpdateAssessmentStatusResult> asyncHandler) {
        final UpdateAssessmentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAssessmentStatusResult>() {
            @Override
            public UpdateAssessmentStatusResult call() throws Exception {
                UpdateAssessmentStatusResult result = null;

                try {
                    result = executeUpdateAssessmentStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateControlResult> updateControlAsync(UpdateControlRequest request) {

        return updateControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateControlResult> updateControlAsync(final UpdateControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateControlRequest, UpdateControlResult> asyncHandler) {
        final UpdateControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateControlResult>() {
            @Override
            public UpdateControlResult call() throws Exception {
                UpdateControlResult result = null;

                try {
                    result = executeUpdateControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(UpdateSettingsRequest request) {

        return updateSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(final UpdateSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSettingsRequest, UpdateSettingsResult> asyncHandler) {
        final UpdateSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSettingsResult>() {
            @Override
            public UpdateSettingsResult call() throws Exception {
                UpdateSettingsResult result = null;

                try {
                    result = executeUpdateSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            ValidateAssessmentReportIntegrityRequest request) {

        return validateAssessmentReportIntegrityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            final ValidateAssessmentReportIntegrityRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateAssessmentReportIntegrityRequest, ValidateAssessmentReportIntegrityResult> asyncHandler) {
        final ValidateAssessmentReportIntegrityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateAssessmentReportIntegrityResult>() {
            @Override
            public ValidateAssessmentReportIntegrityResult call() throws Exception {
                ValidateAssessmentReportIntegrityResult result = null;

                try {
                    result = executeValidateAssessmentReportIntegrity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
