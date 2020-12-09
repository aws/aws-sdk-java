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
package com.amazonaws.services.auditmanager;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;

/**
 * Interface for accessing AWS Audit Manager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.auditmanager.AbstractAWSAuditManagerAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAuditManagerAsync extends AWSAuditManager {

    /**
     * <p>
     * Associates an evidence folder to the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param associateAssessmentReportEvidenceFolderRequest
     * @return A Java Future containing the result of the AssociateAssessmentReportEvidenceFolder operation returned by
     *         the service.
     * @sample AWSAuditManagerAsync.AssociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            AssociateAssessmentReportEvidenceFolderRequest associateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Associates an evidence folder to the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param associateAssessmentReportEvidenceFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAssessmentReportEvidenceFolder operation returned by
     *         the service.
     * @sample AWSAuditManagerAsyncHandler.AssociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            AssociateAssessmentReportEvidenceFolderRequest associateAssessmentReportEvidenceFolderRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAssessmentReportEvidenceFolderRequest, AssociateAssessmentReportEvidenceFolderResult> asyncHandler);

    /**
     * <p>
     * Associates a list of evidence to an assessment report in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchAssociateAssessmentReportEvidenceRequest
     * @return A Java Future containing the result of the BatchAssociateAssessmentReportEvidence operation returned by
     *         the service.
     * @sample AWSAuditManagerAsync.BatchAssociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchAssociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            BatchAssociateAssessmentReportEvidenceRequest batchAssociateAssessmentReportEvidenceRequest);

    /**
     * <p>
     * Associates a list of evidence to an assessment report in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchAssociateAssessmentReportEvidenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateAssessmentReportEvidence operation returned by
     *         the service.
     * @sample AWSAuditManagerAsyncHandler.BatchAssociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchAssociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            BatchAssociateAssessmentReportEvidenceRequest batchAssociateAssessmentReportEvidenceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateAssessmentReportEvidenceRequest, BatchAssociateAssessmentReportEvidenceResult> asyncHandler);

    /**
     * <p>
     * Create a batch of delegations for a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchCreateDelegationByAssessmentRequest
     * @return A Java Future containing the result of the BatchCreateDelegationByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.BatchCreateDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            BatchCreateDelegationByAssessmentRequest batchCreateDelegationByAssessmentRequest);

    /**
     * <p>
     * Create a batch of delegations for a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchCreateDelegationByAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateDelegationByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.BatchCreateDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            BatchCreateDelegationByAssessmentRequest batchCreateDelegationByAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateDelegationByAssessmentRequest, BatchCreateDelegationByAssessmentResult> asyncHandler);

    /**
     * <p>
     * Deletes the delegations in the specified AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchDeleteDelegationByAssessmentRequest
     * @return A Java Future containing the result of the BatchDeleteDelegationByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.BatchDeleteDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            BatchDeleteDelegationByAssessmentRequest batchDeleteDelegationByAssessmentRequest);

    /**
     * <p>
     * Deletes the delegations in the specified AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchDeleteDelegationByAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteDelegationByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.BatchDeleteDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            BatchDeleteDelegationByAssessmentRequest batchDeleteDelegationByAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDelegationByAssessmentRequest, BatchDeleteDelegationByAssessmentResult> asyncHandler);

    /**
     * <p>
     * Disassociates a list of evidence from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param batchDisassociateAssessmentReportEvidenceRequest
     * @return A Java Future containing the result of the BatchDisassociateAssessmentReportEvidence operation returned
     *         by the service.
     * @sample AWSAuditManagerAsync.BatchDisassociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            BatchDisassociateAssessmentReportEvidenceRequest batchDisassociateAssessmentReportEvidenceRequest);

    /**
     * <p>
     * Disassociates a list of evidence from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param batchDisassociateAssessmentReportEvidenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateAssessmentReportEvidence operation returned
     *         by the service.
     * @sample AWSAuditManagerAsyncHandler.BatchDisassociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            BatchDisassociateAssessmentReportEvidenceRequest batchDisassociateAssessmentReportEvidenceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateAssessmentReportEvidenceRequest, BatchDisassociateAssessmentReportEvidenceResult> asyncHandler);

    /**
     * <p>
     * Uploads one or more pieces of evidence to the specified control in the assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchImportEvidenceToAssessmentControlRequest
     * @return A Java Future containing the result of the BatchImportEvidenceToAssessmentControl operation returned by
     *         the service.
     * @sample AWSAuditManagerAsync.BatchImportEvidenceToAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchImportEvidenceToAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            BatchImportEvidenceToAssessmentControlRequest batchImportEvidenceToAssessmentControlRequest);

    /**
     * <p>
     * Uploads one or more pieces of evidence to the specified control in the assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchImportEvidenceToAssessmentControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchImportEvidenceToAssessmentControl operation returned by
     *         the service.
     * @sample AWSAuditManagerAsyncHandler.BatchImportEvidenceToAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchImportEvidenceToAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            BatchImportEvidenceToAssessmentControlRequest batchImportEvidenceToAssessmentControlRequest,
            com.amazonaws.handlers.AsyncHandler<BatchImportEvidenceToAssessmentControlRequest, BatchImportEvidenceToAssessmentControlResult> asyncHandler);

    /**
     * <p>
     * Creates an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return A Java Future containing the result of the CreateAssessment operation returned by the service.
     * @sample AWSAuditManagerAsync.CreateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(CreateAssessmentRequest createAssessmentRequest);

    /**
     * <p>
     * Creates an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssessment operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.CreateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(CreateAssessmentRequest createAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentRequest, CreateAssessmentResult> asyncHandler);

    /**
     * <p>
     * Creates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentFrameworkRequest
     * @return A Java Future containing the result of the CreateAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsync.CreateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(
            CreateAssessmentFrameworkRequest createAssessmentFrameworkRequest);

    /**
     * <p>
     * Creates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentFrameworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.CreateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(
            CreateAssessmentFrameworkRequest createAssessmentFrameworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentFrameworkRequest, CreateAssessmentFrameworkResult> asyncHandler);

    /**
     * <p>
     * Creates an assessment report for the specified assessment.
     * </p>
     * 
     * @param createAssessmentReportRequest
     * @return A Java Future containing the result of the CreateAssessmentReport operation returned by the service.
     * @sample AWSAuditManagerAsync.CreateAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(CreateAssessmentReportRequest createAssessmentReportRequest);

    /**
     * <p>
     * Creates an assessment report for the specified assessment.
     * </p>
     * 
     * @param createAssessmentReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssessmentReport operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.CreateAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(CreateAssessmentReportRequest createAssessmentReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentReportRequest, CreateAssessmentReportResult> asyncHandler);

    /**
     * <p>
     * Creates a new custom control in AWS Audit Manager.
     * </p>
     * 
     * @param createControlRequest
     * @return A Java Future containing the result of the CreateControl operation returned by the service.
     * @sample AWSAuditManagerAsync.CreateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateControlResult> createControlAsync(CreateControlRequest createControlRequest);

    /**
     * <p>
     * Creates a new custom control in AWS Audit Manager.
     * </p>
     * 
     * @param createControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateControl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.CreateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateControlResult> createControlAsync(CreateControlRequest createControlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateControlRequest, CreateControlResult> asyncHandler);

    /**
     * <p>
     * Deletes an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return A Java Future containing the result of the DeleteAssessment operation returned by the service.
     * @sample AWSAuditManagerAsync.DeleteAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(DeleteAssessmentRequest deleteAssessmentRequest);

    /**
     * <p>
     * Deletes an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssessment operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.DeleteAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(DeleteAssessmentRequest deleteAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRequest, DeleteAssessmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkRequest
     * @return A Java Future containing the result of the DeleteAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsync.DeleteAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(
            DeleteAssessmentFrameworkRequest deleteAssessmentFrameworkRequest);

    /**
     * <p>
     * Deletes a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.DeleteAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(
            DeleteAssessmentFrameworkRequest deleteAssessmentFrameworkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentFrameworkRequest, DeleteAssessmentFrameworkResult> asyncHandler);

    /**
     * <p>
     * Deletes an assessment report from an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentReportRequest
     * @return A Java Future containing the result of the DeleteAssessmentReport operation returned by the service.
     * @sample AWSAuditManagerAsync.DeleteAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(DeleteAssessmentReportRequest deleteAssessmentReportRequest);

    /**
     * <p>
     * Deletes an assessment report from an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssessmentReport operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.DeleteAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(DeleteAssessmentReportRequest deleteAssessmentReportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentReportRequest, DeleteAssessmentReportResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param deleteControlRequest
     * @return A Java Future containing the result of the DeleteControl operation returned by the service.
     * @sample AWSAuditManagerAsync.DeleteControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(DeleteControlRequest deleteControlRequest);

    /**
     * <p>
     * Deletes a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param deleteControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteControl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.DeleteControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(DeleteControlRequest deleteControlRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteControlRequest, DeleteControlResult> asyncHandler);

    /**
     * <p>
     * Deregisters an account in AWS Audit Manager.
     * </p>
     * 
     * @param deregisterAccountRequest
     * @return A Java Future containing the result of the DeregisterAccount operation returned by the service.
     * @sample AWSAuditManagerAsync.DeregisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(DeregisterAccountRequest deregisterAccountRequest);

    /**
     * <p>
     * Deregisters an account in AWS Audit Manager.
     * </p>
     * 
     * @param deregisterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterAccount operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.DeregisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(DeregisterAccountRequest deregisterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterAccountRequest, DeregisterAccountResult> asyncHandler);

    /**
     * <p>
     * Deregisters the delegated AWS administrator account from the AWS organization.
     * </p>
     * 
     * @param deregisterOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DeregisterOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.DeregisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            DeregisterOrganizationAdminAccountRequest deregisterOrganizationAdminAccountRequest);

    /**
     * <p>
     * Deregisters the delegated AWS administrator account from the AWS organization.
     * </p>
     * 
     * @param deregisterOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.DeregisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            DeregisterOrganizationAdminAccountRequest deregisterOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterOrganizationAdminAccountRequest, DeregisterOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates an evidence folder from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param disassociateAssessmentReportEvidenceFolderRequest
     * @return A Java Future containing the result of the DisassociateAssessmentReportEvidenceFolder operation returned
     *         by the service.
     * @sample AWSAuditManagerAsync.DisassociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DisassociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            DisassociateAssessmentReportEvidenceFolderRequest disassociateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Disassociates an evidence folder from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param disassociateAssessmentReportEvidenceFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAssessmentReportEvidenceFolder operation returned
     *         by the service.
     * @sample AWSAuditManagerAsyncHandler.DisassociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DisassociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            DisassociateAssessmentReportEvidenceFolderRequest disassociateAssessmentReportEvidenceFolderRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAssessmentReportEvidenceFolderRequest, DisassociateAssessmentReportEvidenceFolderResult> asyncHandler);

    /**
     * <p>
     * Returns the registration status of an account in AWS Audit Manager.
     * </p>
     * 
     * @param getAccountStatusRequest
     * @return A Java Future containing the result of the GetAccountStatus operation returned by the service.
     * @sample AWSAuditManagerAsync.GetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAccountStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(GetAccountStatusRequest getAccountStatusRequest);

    /**
     * <p>
     * Returns the registration status of an account in AWS Audit Manager.
     * </p>
     * 
     * @param getAccountStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountStatus operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAccountStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(GetAccountStatusRequest getAccountStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountStatusRequest, GetAccountStatusResult> asyncHandler);

    /**
     * <p>
     * Returns an assessment from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return A Java Future containing the result of the GetAssessment operation returned by the service.
     * @sample AWSAuditManagerAsync.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest getAssessmentRequest);

    /**
     * <p>
     * Returns an assessment from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssessment operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest getAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentRequest, GetAssessmentResult> asyncHandler);

    /**
     * <p>
     * Returns a framework from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentFrameworkRequest
     * @return A Java Future containing the result of the GetAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsync.GetAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(GetAssessmentFrameworkRequest getAssessmentFrameworkRequest);

    /**
     * <p>
     * Returns a framework from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentFrameworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(GetAssessmentFrameworkRequest getAssessmentFrameworkRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentFrameworkRequest, GetAssessmentFrameworkResult> asyncHandler);

    /**
     * <p>
     * Returns the URL of a specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentReportUrlRequest
     * @return A Java Future containing the result of the GetAssessmentReportUrl operation returned by the service.
     * @sample AWSAuditManagerAsync.GetAssessmentReportUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(GetAssessmentReportUrlRequest getAssessmentReportUrlRequest);

    /**
     * <p>
     * Returns the URL of a specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentReportUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAssessmentReportUrl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetAssessmentReportUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(GetAssessmentReportUrlRequest getAssessmentReportUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentReportUrlRequest, GetAssessmentReportUrlResult> asyncHandler);

    /**
     * <p>
     * Returns a list of changelogs from AWS Audit Manager.
     * </p>
     * 
     * @param getChangeLogsRequest
     * @return A Java Future containing the result of the GetChangeLogs operation returned by the service.
     * @sample AWSAuditManagerAsync.GetChangeLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(GetChangeLogsRequest getChangeLogsRequest);

    /**
     * <p>
     * Returns a list of changelogs from AWS Audit Manager.
     * </p>
     * 
     * @param getChangeLogsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeLogs operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetChangeLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(GetChangeLogsRequest getChangeLogsRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeLogsRequest, GetChangeLogsResult> asyncHandler);

    /**
     * <p>
     * Returns a control from AWS Audit Manager.
     * </p>
     * 
     * @param getControlRequest
     * @return A Java Future containing the result of the GetControl operation returned by the service.
     * @sample AWSAuditManagerAsync.GetControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetControlResult> getControlAsync(GetControlRequest getControlRequest);

    /**
     * <p>
     * Returns a control from AWS Audit Manager.
     * </p>
     * 
     * @param getControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetControl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetControlResult> getControlAsync(GetControlRequest getControlRequest,
            com.amazonaws.handlers.AsyncHandler<GetControlRequest, GetControlResult> asyncHandler);

    /**
     * <p>
     * Returns a list of delegations from an audit owner to a delegate.
     * </p>
     * 
     * @param getDelegationsRequest
     * @return A Java Future containing the result of the GetDelegations operation returned by the service.
     * @sample AWSAuditManagerAsync.GetDelegations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetDelegations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(GetDelegationsRequest getDelegationsRequest);

    /**
     * <p>
     * Returns a list of delegations from an audit owner to a delegate.
     * </p>
     * 
     * @param getDelegationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDelegations operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetDelegations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetDelegations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(GetDelegationsRequest getDelegationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDelegationsRequest, GetDelegationsResult> asyncHandler);

    /**
     * <p>
     * Returns evidence from AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceRequest
     * @return A Java Future containing the result of the GetEvidence operation returned by the service.
     * @sample AWSAuditManagerAsync.GetEvidence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(GetEvidenceRequest getEvidenceRequest);

    /**
     * <p>
     * Returns evidence from AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvidence operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetEvidence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(GetEvidenceRequest getEvidenceRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceRequest, GetEvidenceResult> asyncHandler);

    /**
     * <p>
     * Returns all evidence from a specified evidence folder in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceByEvidenceFolderRequest
     * @return A Java Future containing the result of the GetEvidenceByEvidenceFolder operation returned by the service.
     * @sample AWSAuditManagerAsync.GetEvidenceByEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(
            GetEvidenceByEvidenceFolderRequest getEvidenceByEvidenceFolderRequest);

    /**
     * <p>
     * Returns all evidence from a specified evidence folder in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceByEvidenceFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvidenceByEvidenceFolder operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetEvidenceByEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(
            GetEvidenceByEvidenceFolderRequest getEvidenceByEvidenceFolderRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceByEvidenceFolderRequest, GetEvidenceByEvidenceFolderResult> asyncHandler);

    /**
     * <p>
     * Returns an evidence folder from the specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFolderRequest
     * @return A Java Future containing the result of the GetEvidenceFolder operation returned by the service.
     * @sample AWSAuditManagerAsync.GetEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(GetEvidenceFolderRequest getEvidenceFolderRequest);

    /**
     * <p>
     * Returns an evidence folder from the specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFolderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvidenceFolder operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(GetEvidenceFolderRequest getEvidenceFolderRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFolderRequest, GetEvidenceFolderResult> asyncHandler);

    /**
     * <p>
     * Returns the evidence folders from a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentRequest
     * @return A Java Future containing the result of the GetEvidenceFoldersByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.GetEvidenceFoldersByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(
            GetEvidenceFoldersByAssessmentRequest getEvidenceFoldersByAssessmentRequest);

    /**
     * <p>
     * Returns the evidence folders from a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvidenceFoldersByAssessment operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.GetEvidenceFoldersByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(
            GetEvidenceFoldersByAssessmentRequest getEvidenceFoldersByAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentRequest, GetEvidenceFoldersByAssessmentResult> asyncHandler);

    /**
     * <p>
     * Returns a list of evidence folders associated with a specified control of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentControlRequest
     * @return A Java Future containing the result of the GetEvidenceFoldersByAssessmentControl operation returned by
     *         the service.
     * @sample AWSAuditManagerAsync.GetEvidenceFoldersByAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            GetEvidenceFoldersByAssessmentControlRequest getEvidenceFoldersByAssessmentControlRequest);

    /**
     * <p>
     * Returns a list of evidence folders associated with a specified control of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvidenceFoldersByAssessmentControl operation returned by
     *         the service.
     * @sample AWSAuditManagerAsyncHandler.GetEvidenceFoldersByAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            GetEvidenceFoldersByAssessmentControlRequest getEvidenceFoldersByAssessmentControlRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentControlRequest, GetEvidenceFoldersByAssessmentControlResult> asyncHandler);

    /**
     * <p>
     * Returns the name of the delegated AWS administrator account for the AWS organization.
     * </p>
     * 
     * @param getOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the GetOrganizationAdminAccount operation returned by the service.
     * @sample AWSAuditManagerAsync.GetOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(
            GetOrganizationAdminAccountRequest getOrganizationAdminAccountRequest);

    /**
     * <p>
     * Returns the name of the delegated AWS administrator account for the AWS organization.
     * </p>
     * 
     * @param getOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrganizationAdminAccount operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(
            GetOrganizationAdminAccountRequest getOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationAdminAccountRequest, GetOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the in-scope AWS services for the specified assessment.
     * </p>
     * 
     * @param getServicesInScopeRequest
     * @return A Java Future containing the result of the GetServicesInScope operation returned by the service.
     * @sample AWSAuditManagerAsync.GetServicesInScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetServicesInScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(GetServicesInScopeRequest getServicesInScopeRequest);

    /**
     * <p>
     * Returns a list of the in-scope AWS services for the specified assessment.
     * </p>
     * 
     * @param getServicesInScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServicesInScope operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetServicesInScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetServicesInScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(GetServicesInScopeRequest getServicesInScopeRequest,
            com.amazonaws.handlers.AsyncHandler<GetServicesInScopeRequest, GetServicesInScopeResult> asyncHandler);

    /**
     * <p>
     * Returns the settings for the specified AWS account.
     * </p>
     * 
     * @param getSettingsRequest
     * @return A Java Future containing the result of the GetSettings operation returned by the service.
     * @sample AWSAuditManagerAsync.GetSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(GetSettingsRequest getSettingsRequest);

    /**
     * <p>
     * Returns the settings for the specified AWS account.
     * </p>
     * 
     * @param getSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSettings operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(GetSettingsRequest getSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSettingsRequest, GetSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the frameworks available in the AWS Audit Manager framework library.
     * </p>
     * 
     * @param listAssessmentFrameworksRequest
     * @return A Java Future containing the result of the ListAssessmentFrameworks operation returned by the service.
     * @sample AWSAuditManagerAsync.ListAssessmentFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(ListAssessmentFrameworksRequest listAssessmentFrameworksRequest);

    /**
     * <p>
     * Returns a list of the frameworks available in the AWS Audit Manager framework library.
     * </p>
     * 
     * @param listAssessmentFrameworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssessmentFrameworks operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListAssessmentFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(ListAssessmentFrameworksRequest listAssessmentFrameworksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentFrameworksRequest, ListAssessmentFrameworksResult> asyncHandler);

    /**
     * <p>
     * Returns a list of assessment reports created in AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentReportsRequest
     * @return A Java Future containing the result of the ListAssessmentReports operation returned by the service.
     * @sample AWSAuditManagerAsync.ListAssessmentReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(ListAssessmentReportsRequest listAssessmentReportsRequest);

    /**
     * <p>
     * Returns a list of assessment reports created in AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssessmentReports operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListAssessmentReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(ListAssessmentReportsRequest listAssessmentReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentReportsRequest, ListAssessmentReportsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of current and past assessments from AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return A Java Future containing the result of the ListAssessments operation returned by the service.
     * @sample AWSAuditManagerAsync.ListAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(ListAssessmentsRequest listAssessmentsRequest);

    /**
     * <p>
     * Returns a list of current and past assessments from AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssessments operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(ListAssessmentsRequest listAssessmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentsRequest, ListAssessmentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of controls from AWS Audit Manager.
     * </p>
     * 
     * @param listControlsRequest
     * @return A Java Future containing the result of the ListControls operation returned by the service.
     * @sample AWSAuditManagerAsync.ListControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListControlsResult> listControlsAsync(ListControlsRequest listControlsRequest);

    /**
     * <p>
     * Returns a list of controls from AWS Audit Manager.
     * </p>
     * 
     * @param listControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListControls operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControls" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListControlsResult> listControlsAsync(ListControlsRequest listControlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListControlsRequest, ListControlsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of keywords that pre-mapped to the specified control data source.
     * </p>
     * 
     * @param listKeywordsForDataSourceRequest
     * @return A Java Future containing the result of the ListKeywordsForDataSource operation returned by the service.
     * @sample AWSAuditManagerAsync.ListKeywordsForDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(
            ListKeywordsForDataSourceRequest listKeywordsForDataSourceRequest);

    /**
     * <p>
     * Returns a list of keywords that pre-mapped to the specified control data source.
     * </p>
     * 
     * @param listKeywordsForDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeywordsForDataSource operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListKeywordsForDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(
            ListKeywordsForDataSourceRequest listKeywordsForDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeywordsForDataSourceRequest, ListKeywordsForDataSourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all AWS Audit Manager notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AWSAuditManagerAsync.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListNotifications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * Returns a list of all AWS Audit Manager notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListNotifications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAuditManagerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Enables AWS Audit Manager for the specified AWS account.
     * </p>
     * 
     * @param registerAccountRequest
     * @return A Java Future containing the result of the RegisterAccount operation returned by the service.
     * @sample AWSAuditManagerAsync.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest registerAccountRequest);

    /**
     * <p>
     * Enables AWS Audit Manager for the specified AWS account.
     * </p>
     * 
     * @param registerAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterAccount operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest registerAccountRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterAccountRequest, RegisterAccountResult> asyncHandler);

    /**
     * <p>
     * Enables an AWS account within the organization as the delegated administrator for AWS Audit Manager.
     * </p>
     * 
     * @param registerOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the RegisterOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.RegisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            RegisterOrganizationAdminAccountRequest registerOrganizationAdminAccountRequest);

    /**
     * <p>
     * Enables an AWS account within the organization as the delegated administrator for AWS Audit Manager.
     * </p>
     * 
     * @param registerOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.RegisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            RegisterOrganizationAdminAccountRequest registerOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterOrganizationAdminAccountRequest, RegisterOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Tags the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAuditManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource in AWS Audit Manager.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAuditManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource in AWS Audit Manager.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Edits an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return A Java Future containing the result of the UpdateAssessment operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(UpdateAssessmentRequest updateAssessmentRequest);

    /**
     * <p>
     * Edits an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessment operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(UpdateAssessmentRequest updateAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentRequest, UpdateAssessmentResult> asyncHandler);

    /**
     * <p>
     * Updates a control within an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentControlRequest
     * @return A Java Future containing the result of the UpdateAssessmentControl operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateAssessmentControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(UpdateAssessmentControlRequest updateAssessmentControlRequest);

    /**
     * <p>
     * Updates a control within an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessmentControl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessmentControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(UpdateAssessmentControlRequest updateAssessmentControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlRequest, UpdateAssessmentControlResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a control set in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentControlSetStatusRequest
     * @return A Java Future containing the result of the UpdateAssessmentControlSetStatus operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.UpdateAssessmentControlSetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControlSetStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            UpdateAssessmentControlSetStatusRequest updateAssessmentControlSetStatusRequest);

    /**
     * <p>
     * Updates the status of a control set in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentControlSetStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessmentControlSetStatus operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessmentControlSetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControlSetStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            UpdateAssessmentControlSetStatusRequest updateAssessmentControlSetStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlSetStatusRequest, UpdateAssessmentControlSetStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkRequest
     * @return A Java Future containing the result of the UpdateAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(
            UpdateAssessmentFrameworkRequest updateAssessmentFrameworkRequest);

    /**
     * <p>
     * Updates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessmentFramework operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(
            UpdateAssessmentFrameworkRequest updateAssessmentFrameworkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentFrameworkRequest, UpdateAssessmentFrameworkResult> asyncHandler);

    /**
     * <p>
     * Updates the status of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentStatusRequest
     * @return A Java Future containing the result of the UpdateAssessmentStatus operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateAssessmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(UpdateAssessmentStatusRequest updateAssessmentStatusRequest);

    /**
     * <p>
     * Updates the status of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessmentStatus operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(UpdateAssessmentStatusRequest updateAssessmentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentStatusRequest, UpdateAssessmentStatusResult> asyncHandler);

    /**
     * <p>
     * Updates a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param updateControlRequest
     * @return A Java Future containing the result of the UpdateControl operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateControlResult> updateControlAsync(UpdateControlRequest updateControlRequest);

    /**
     * <p>
     * Updates a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param updateControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateControl operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateControlResult> updateControlAsync(UpdateControlRequest updateControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateControlRequest, UpdateControlResult> asyncHandler);

    /**
     * <p>
     * Updates AWS Audit Manager settings for the current user account.
     * </p>
     * 
     * @param updateSettingsRequest
     * @return A Java Future containing the result of the UpdateSettings operation returned by the service.
     * @sample AWSAuditManagerAsync.UpdateSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(UpdateSettingsRequest updateSettingsRequest);

    /**
     * <p>
     * Updates AWS Audit Manager settings for the current user account.
     * </p>
     * 
     * @param updateSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSettings operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.UpdateSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(UpdateSettingsRequest updateSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSettingsRequest, UpdateSettingsResult> asyncHandler);

    /**
     * <p>
     * Validates the integrity of an assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param validateAssessmentReportIntegrityRequest
     * @return A Java Future containing the result of the ValidateAssessmentReportIntegrity operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.ValidateAssessmentReportIntegrity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ValidateAssessmentReportIntegrity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            ValidateAssessmentReportIntegrityRequest validateAssessmentReportIntegrityRequest);

    /**
     * <p>
     * Validates the integrity of an assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param validateAssessmentReportIntegrityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateAssessmentReportIntegrity operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.ValidateAssessmentReportIntegrity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ValidateAssessmentReportIntegrity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            ValidateAssessmentReportIntegrityRequest validateAssessmentReportIntegrityRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateAssessmentReportIntegrityRequest, ValidateAssessmentReportIntegrityResult> asyncHandler);

}
