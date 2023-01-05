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
 * Welcome to the Audit Manager API reference. This guide is for developers who need detailed information about the
 * Audit Manager API operations, data types, and errors.
 * </p>
 * <p>
 * Audit Manager is a service that provides automated evidence collection so that you can continually audit your Amazon
 * Web Services usage. You can use it to assess the effectiveness of your controls, manage risk, and simplify
 * compliance.
 * </p>
 * <p>
 * Audit Manager provides prebuilt frameworks that structure and automate assessments for a given compliance standard.
 * Frameworks include a prebuilt collection of controls with descriptions and testing procedures. These controls are
 * grouped according to the requirements of the specified compliance standard or regulation. You can also customize
 * frameworks and controls to support internal audits with specific requirements.
 * </p>
 * <p>
 * Use the following links to get started with the Audit Manager API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Operations.html">Actions</a>: An
 * alphabetical list of all Audit Manager API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Types.html">Data types</a>: An
 * alphabetical list of all Audit Manager data types.
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
 * If you're new to Audit Manager, we recommend that you review the <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/what-is.html"> Audit Manager User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAuditManagerAsync extends AWSAuditManager {

    /**
     * <p>
     * Associates an evidence folder to an assessment report in a Audit Manager assessment.
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
     * Associates an evidence folder to an assessment report in a Audit Manager assessment.
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
     * Associates a list of evidence to an assessment report in an Audit Manager assessment.
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
     * Associates a list of evidence to an assessment report in an Audit Manager assessment.
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
     * Creates a batch of delegations for an assessment in Audit Manager.
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
     * Creates a batch of delegations for an assessment in Audit Manager.
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
     * Deletes a batch of delegations for an assessment in Audit Manager.
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
     * Deletes a batch of delegations for an assessment in Audit Manager.
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
     * Disassociates a list of evidence from an assessment report in Audit Manager.
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
     * Disassociates a list of evidence from an assessment report in Audit Manager.
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
     * Uploads one or more pieces of evidence to a control in an Audit Manager assessment. You can upload manual
     * evidence from any Amazon Simple Storage Service (Amazon S3) bucket by specifying the S3 URI of the evidence.
     * </p>
     * <p>
     * You must upload manual evidence to your S3 bucket before you can upload it to your assessment. For instructions,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a> in the <i>Amazon Simple
     * Storage Service API Reference.</i>
     * </p>
     * <p>
     * The following restrictions apply to this action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum size of an individual evidence file: 100 MB
     * </p>
     * </li>
     * <li>
     * <p>
     * Number of daily manual evidence uploads per control: 100
     * </p>
     * </li>
     * <li>
     * <p>
     * Supported file formats: See <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Audit Manager service restrictions, see <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and restrictions for
     * Audit Manager</a>.
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
     * Uploads one or more pieces of evidence to a control in an Audit Manager assessment. You can upload manual
     * evidence from any Amazon Simple Storage Service (Amazon S3) bucket by specifying the S3 URI of the evidence.
     * </p>
     * <p>
     * You must upload manual evidence to your S3 bucket before you can upload it to your assessment. For instructions,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a> in the <i>Amazon Simple
     * Storage Service API Reference.</i>
     * </p>
     * <p>
     * The following restrictions apply to this action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum size of an individual evidence file: 100 MB
     * </p>
     * </li>
     * <li>
     * <p>
     * Number of daily manual evidence uploads per control: 100
     * </p>
     * </li>
     * <li>
     * <p>
     * Supported file formats: See <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Audit Manager service restrictions, see <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and restrictions for
     * Audit Manager</a>.
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
     * Creates an assessment in Audit Manager.
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
     * Creates an assessment in Audit Manager.
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
     * Creates a custom framework in Audit Manager.
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
     * Creates a custom framework in Audit Manager.
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
     * Creates a new custom control in Audit Manager.
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
     * Creates a new custom control in Audit Manager.
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
     * Deletes an assessment in Audit Manager.
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
     * Deletes an assessment in Audit Manager.
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
     * Deletes a custom framework in Audit Manager.
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
     * Deletes a custom framework in Audit Manager.
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
     * Deletes a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkShareRequest
     * @return A Java Future containing the result of the DeleteAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.DeleteAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentFrameworkShareResult> deleteAssessmentFrameworkShareAsync(
            DeleteAssessmentFrameworkShareRequest deleteAssessmentFrameworkShareRequest);

    /**
     * <p>
     * Deletes a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.DeleteAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssessmentFrameworkShareResult> deleteAssessmentFrameworkShareAsync(
            DeleteAssessmentFrameworkShareRequest deleteAssessmentFrameworkShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentFrameworkShareRequest, DeleteAssessmentFrameworkShareResult> asyncHandler);

    /**
     * <p>
     * Deletes an assessment report in Audit Manager.
     * </p>
     * <p>
     * When you run the <code>DeleteAssessmentReport</code> operation, Audit Manager attempts to delete the following
     * data:
     * </p>
     * <ol>
     * <li>
     * <p>
     * The specified assessment report that’s stored in your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * The associated metadata that’s stored in Audit Manager
     * </p>
     * </li>
     * </ol>
     * <p>
     * If Audit Manager can’t access the assessment report in your S3 bucket, the report isn’t deleted. In this event,
     * the <code>DeleteAssessmentReport</code> operation doesn’t fail. Instead, it proceeds to delete the associated
     * metadata only. You must then delete the assessment report from the S3 bucket yourself.
     * </p>
     * <p>
     * This scenario happens when Audit Manager receives a <code>403 (Forbidden)</code> or <code>404 (Not Found)</code>
     * error from Amazon S3. To avoid this, make sure that your S3 bucket is available, and that you configured the
     * correct permissions for Audit Manager to delete resources in your S3 bucket. For an example permissions policy
     * that you can use, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/security_iam_id-based-policy-examples.html#full-administrator-access-assessment-report-destination"
     * >Assessment report destination permissions</a> in the <i>Audit Manager User Guide</i>. For information about the
     * issues that could cause a <code>403 (Forbidden)</code> or <code>404 (Not Found</code>) error from Amazon S3, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ErrorCodeList">List of Error
     * Codes</a> in the <i>Amazon Simple Storage Service API Reference</i>.
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
     * Deletes an assessment report in Audit Manager.
     * </p>
     * <p>
     * When you run the <code>DeleteAssessmentReport</code> operation, Audit Manager attempts to delete the following
     * data:
     * </p>
     * <ol>
     * <li>
     * <p>
     * The specified assessment report that’s stored in your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * The associated metadata that’s stored in Audit Manager
     * </p>
     * </li>
     * </ol>
     * <p>
     * If Audit Manager can’t access the assessment report in your S3 bucket, the report isn’t deleted. In this event,
     * the <code>DeleteAssessmentReport</code> operation doesn’t fail. Instead, it proceeds to delete the associated
     * metadata only. You must then delete the assessment report from the S3 bucket yourself.
     * </p>
     * <p>
     * This scenario happens when Audit Manager receives a <code>403 (Forbidden)</code> or <code>404 (Not Found)</code>
     * error from Amazon S3. To avoid this, make sure that your S3 bucket is available, and that you configured the
     * correct permissions for Audit Manager to delete resources in your S3 bucket. For an example permissions policy
     * that you can use, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/security_iam_id-based-policy-examples.html#full-administrator-access-assessment-report-destination"
     * >Assessment report destination permissions</a> in the <i>Audit Manager User Guide</i>. For information about the
     * issues that could cause a <code>403 (Forbidden)</code> or <code>404 (Not Found</code>) error from Amazon S3, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ErrorCodeList">List of Error
     * Codes</a> in the <i>Amazon Simple Storage Service API Reference</i>.
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
     * Deletes a custom control in Audit Manager.
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
     * Deletes a custom control in Audit Manager.
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
     * Deregisters an account in Audit Manager.
     * </p>
     * <note>
     * <p>
     * When you deregister your account from Audit Manager, your data isn’t deleted. If you want to delete your resource
     * data, you must perform that task separately before you deregister your account. Either, you can do this in the
     * Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.
     * </p>
     * <p>
     * To delete your Audit Manager resource data, see the following instructions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessment.html">DeleteAssessment
     * </a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-assessment.html">Deleting an
     * assessment</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFramework.html">
     * DeleteAssessmentFramework</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-custom-framework.html">Deleting a custom
     * framework</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFrameworkShare.html">
     * DeleteAssessmentFrameworkShare</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/deleting-shared-framework-requests.html"
     * >Deleting a share request</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentReport.html">
     * DeleteAssessmentReport</a> (see also: <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/generate-assessment-report.html#delete-assessment-report-steps"
     * >Deleting an assessment report</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteControl.html">DeleteControl</a>
     * (see also: <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-controls.html">Deleting a
     * custom control</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are
     * listed above.
     * </p>
     * </note>
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
     * Deregisters an account in Audit Manager.
     * </p>
     * <note>
     * <p>
     * When you deregister your account from Audit Manager, your data isn’t deleted. If you want to delete your resource
     * data, you must perform that task separately before you deregister your account. Either, you can do this in the
     * Audit Manager console. Or, you can use one of the delete API operations that are provided by Audit Manager.
     * </p>
     * <p>
     * To delete your Audit Manager resource data, see the following instructions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessment.html">DeleteAssessment
     * </a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-assessment.html">Deleting an
     * assessment</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFramework.html">
     * DeleteAssessmentFramework</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-custom-framework.html">Deleting a custom
     * framework</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFrameworkShare.html">
     * DeleteAssessmentFrameworkShare</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/deleting-shared-framework-requests.html"
     * >Deleting a share request</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentReport.html">
     * DeleteAssessmentReport</a> (see also: <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/generate-assessment-report.html#delete-assessment-report-steps"
     * >Deleting an assessment report</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteControl.html">DeleteControl</a>
     * (see also: <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-controls.html">Deleting a
     * custom control</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are
     * listed above.
     * </p>
     * </note>
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
     * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.
     * </p>
     * <p>
     * When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the
     * evidence that you previously collected under that account. This is also the case when you deregister a delegated
     * administrator from Organizations. However, Audit Manager will stop collecting and attaching evidence to that
     * delegated administrator account moving forward.
     * </p>
     * <important>
     * <p>
     * Keep in mind the following cleanup task if you use evidence finder:
     * </p>
     * <p>
     * Before you use your management account to remove a delegated administrator, make sure that the current delegated
     * administrator account signs in to Audit Manager and disables evidence finder first. Disabling evidence finder
     * automatically deletes the event data store that was created in their account when they enabled evidence finder.
     * If this task isn’t completed, the event data store remains in their account. In this case, we recommend that the
     * original delegated administrator goes to CloudTrail Lake and manually <a
     * href="https://docs.aws.amazon.com/userguide/awscloudtrail/latest/userguide/query-eds-disable-termination.html"
     * >deletes the event data store</a>.
     * </p>
     * <p>
     * This cleanup task is necessary to ensure that you don't end up with multiple event data stores. Audit Manager
     * will ignore an unused event data store after you remove or change a delegated administrator account. However, the
     * unused event data store continues to incur storage costs from CloudTrail Lake if you don't delete it.
     * </p>
     * </important>
     * <p>
     * When you deregister a delegated administrator account for Audit Manager, the data for that account isn’t deleted.
     * If you want to delete resource data for a delegated administrator account, you must perform that task separately
     * before you deregister the account. Either, you can do this in the Audit Manager console. Or, you can use one of
     * the delete API operations that are provided by Audit Manager.
     * </p>
     * <p>
     * To delete your Audit Manager resource data, see the following instructions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessment.html">DeleteAssessment
     * </a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-assessment.html">Deleting an
     * assessment</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFramework.html">
     * DeleteAssessmentFramework</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-custom-framework.html">Deleting a custom
     * framework</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFrameworkShare.html">
     * DeleteAssessmentFrameworkShare</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/deleting-shared-framework-requests.html"
     * >Deleting a share request</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentReport.html">
     * DeleteAssessmentReport</a> (see also: <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/generate-assessment-report.html#delete-assessment-report-steps"
     * >Deleting an assessment report</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteControl.html">DeleteControl</a>
     * (see also: <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-controls.html">Deleting a
     * custom control</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are
     * listed above.
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
     * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.
     * </p>
     * <p>
     * When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the
     * evidence that you previously collected under that account. This is also the case when you deregister a delegated
     * administrator from Organizations. However, Audit Manager will stop collecting and attaching evidence to that
     * delegated administrator account moving forward.
     * </p>
     * <important>
     * <p>
     * Keep in mind the following cleanup task if you use evidence finder:
     * </p>
     * <p>
     * Before you use your management account to remove a delegated administrator, make sure that the current delegated
     * administrator account signs in to Audit Manager and disables evidence finder first. Disabling evidence finder
     * automatically deletes the event data store that was created in their account when they enabled evidence finder.
     * If this task isn’t completed, the event data store remains in their account. In this case, we recommend that the
     * original delegated administrator goes to CloudTrail Lake and manually <a
     * href="https://docs.aws.amazon.com/userguide/awscloudtrail/latest/userguide/query-eds-disable-termination.html"
     * >deletes the event data store</a>.
     * </p>
     * <p>
     * This cleanup task is necessary to ensure that you don't end up with multiple event data stores. Audit Manager
     * will ignore an unused event data store after you remove or change a delegated administrator account. However, the
     * unused event data store continues to incur storage costs from CloudTrail Lake if you don't delete it.
     * </p>
     * </important>
     * <p>
     * When you deregister a delegated administrator account for Audit Manager, the data for that account isn’t deleted.
     * If you want to delete resource data for a delegated administrator account, you must perform that task separately
     * before you deregister the account. Either, you can do this in the Audit Manager console. Or, you can use one of
     * the delete API operations that are provided by Audit Manager.
     * </p>
     * <p>
     * To delete your Audit Manager resource data, see the following instructions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessment.html">DeleteAssessment
     * </a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-assessment.html">Deleting an
     * assessment</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFramework.html">
     * DeleteAssessmentFramework</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-custom-framework.html">Deleting a custom
     * framework</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFrameworkShare.html">
     * DeleteAssessmentFrameworkShare</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/deleting-shared-framework-requests.html"
     * >Deleting a share request</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentReport.html">
     * DeleteAssessmentReport</a> (see also: <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/generate-assessment-report.html#delete-assessment-report-steps"
     * >Deleting an assessment report</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteControl.html">DeleteControl</a>
     * (see also: <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-controls.html">Deleting a
     * custom control</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * At this time, Audit Manager doesn't provide an option to delete evidence. All available delete operations are
     * listed above.
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
     * Disassociates an evidence folder from the specified assessment report in Audit Manager.
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
     * Disassociates an evidence folder from the specified assessment report in Audit Manager.
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
     * Returns the registration status of an account in Audit Manager.
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
     * Returns the registration status of an account in Audit Manager.
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
     * Returns an assessment from Audit Manager.
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
     * Returns an assessment from Audit Manager.
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
     * Returns a framework from Audit Manager.
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
     * Returns a framework from Audit Manager.
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
     * Returns the URL of an assessment report in Audit Manager.
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
     * Returns the URL of an assessment report in Audit Manager.
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
     * Returns a list of changelogs from Audit Manager.
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
     * Returns a list of changelogs from Audit Manager.
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
     * Returns a control from Audit Manager.
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
     * Returns a control from Audit Manager.
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
     * Returns evidence from Audit Manager.
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
     * Returns evidence from Audit Manager.
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
     * Returns all evidence from a specified evidence folder in Audit Manager.
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
     * Returns all evidence from a specified evidence folder in Audit Manager.
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
     * Returns an evidence folder from the specified assessment in Audit Manager.
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
     * Returns an evidence folder from the specified assessment in Audit Manager.
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
     * Returns the evidence folders from a specified assessment in Audit Manager.
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
     * Returns the evidence folders from a specified assessment in Audit Manager.
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
     * Returns a list of evidence folders that are associated with a specified control of an assessment in Audit
     * Manager.
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
     * Returns a list of evidence folders that are associated with a specified control of an assessment in Audit
     * Manager.
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
     * Gets the latest analytics data for all your current active assessments.
     * </p>
     * 
     * @param getInsightsRequest
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSAuditManagerAsync.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Gets the latest analytics data for all your current active assessments.
     * </p>
     * 
     * @param getInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler);

    /**
     * <p>
     * Gets the latest analytics data for a specific active assessment.
     * </p>
     * 
     * @param getInsightsByAssessmentRequest
     * @return A Java Future containing the result of the GetInsightsByAssessment operation returned by the service.
     * @sample AWSAuditManagerAsync.GetInsightsByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsByAssessmentResult> getInsightsByAssessmentAsync(GetInsightsByAssessmentRequest getInsightsByAssessmentRequest);

    /**
     * <p>
     * Gets the latest analytics data for a specific active assessment.
     * </p>
     * 
     * @param getInsightsByAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightsByAssessment operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.GetInsightsByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsByAssessmentResult> getInsightsByAssessmentAsync(GetInsightsByAssessmentRequest getInsightsByAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightsByAssessmentRequest, GetInsightsByAssessmentResult> asyncHandler);

    /**
     * <p>
     * Returns the name of the delegated Amazon Web Services administrator account for the organization.
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
     * Returns the name of the delegated Amazon Web Services administrator account for the organization.
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
     * Returns a list of all of the Amazon Web Services that you can choose to include in your assessment. When you <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_CreateAssessment.html">create an
     * assessment</a>, specify which of these services you want to include to narrow the assessment's <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Scope.html">scope</a>.
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
     * Returns a list of all of the Amazon Web Services that you can choose to include in your assessment. When you <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_CreateAssessment.html">create an
     * assessment</a>, specify which of these services you want to include to narrow the assessment's <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Scope.html">scope</a>.
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
     * Returns the settings for the specified Amazon Web Services account.
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
     * Returns the settings for the specified Amazon Web Services account.
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
     * Lists the latest analytics data for controls within a specific control domain and a specific active assessment.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain and assessment that was specified.
     * Moreover, the control must have collected evidence on the <code>lastUpdated</code> date of
     * <code>controlInsightsByAssessment</code>. If neither of these conditions are met, no data is listed for that
     * control.
     * </p>
     * </note>
     * 
     * @param listAssessmentControlInsightsByControlDomainRequest
     * @return A Java Future containing the result of the ListAssessmentControlInsightsByControlDomain operation
     *         returned by the service.
     * @sample AWSAuditManagerAsync.ListAssessmentControlInsightsByControlDomain
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentControlInsightsByControlDomainResult> listAssessmentControlInsightsByControlDomainAsync(
            ListAssessmentControlInsightsByControlDomainRequest listAssessmentControlInsightsByControlDomainRequest);

    /**
     * <p>
     * Lists the latest analytics data for controls within a specific control domain and a specific active assessment.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain and assessment that was specified.
     * Moreover, the control must have collected evidence on the <code>lastUpdated</code> date of
     * <code>controlInsightsByAssessment</code>. If neither of these conditions are met, no data is listed for that
     * control.
     * </p>
     * </note>
     * 
     * @param listAssessmentControlInsightsByControlDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssessmentControlInsightsByControlDomain operation
     *         returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListAssessmentControlInsightsByControlDomain
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentControlInsightsByControlDomainResult> listAssessmentControlInsightsByControlDomainAsync(
            ListAssessmentControlInsightsByControlDomainRequest listAssessmentControlInsightsByControlDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentControlInsightsByControlDomainRequest, ListAssessmentControlInsightsByControlDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of sent or received share requests for custom frameworks in Audit Manager.
     * </p>
     * 
     * @param listAssessmentFrameworkShareRequestsRequest
     * @return A Java Future containing the result of the ListAssessmentFrameworkShareRequests operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.ListAssessmentFrameworkShareRequests
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentFrameworkShareRequestsResult> listAssessmentFrameworkShareRequestsAsync(
            ListAssessmentFrameworkShareRequestsRequest listAssessmentFrameworkShareRequestsRequest);

    /**
     * <p>
     * Returns a list of sent or received share requests for custom frameworks in Audit Manager.
     * </p>
     * 
     * @param listAssessmentFrameworkShareRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssessmentFrameworkShareRequests operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.ListAssessmentFrameworkShareRequests
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssessmentFrameworkShareRequestsResult> listAssessmentFrameworkShareRequestsAsync(
            ListAssessmentFrameworkShareRequestsRequest listAssessmentFrameworkShareRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentFrameworkShareRequestsRequest, ListAssessmentFrameworkShareRequestsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the frameworks that are available in the Audit Manager framework library.
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
     * Returns a list of the frameworks that are available in the Audit Manager framework library.
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
     * Returns a list of assessment reports created in Audit Manager.
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
     * Returns a list of assessment reports created in Audit Manager.
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
     * Returns a list of current and past assessments from Audit Manager.
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
     * Returns a list of current and past assessments from Audit Manager.
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
     * Lists the latest analytics data for control domains across all of your active assessments.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that control domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsRequest
     * @return A Java Future containing the result of the ListControlDomainInsights operation returned by the service.
     * @sample AWSAuditManagerAsync.ListControlDomainInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsights"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlDomainInsightsResult> listControlDomainInsightsAsync(
            ListControlDomainInsightsRequest listControlDomainInsightsRequest);

    /**
     * <p>
     * Lists the latest analytics data for control domains across all of your active assessments.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that control domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListControlDomainInsights operation returned by the service.
     * @sample AWSAuditManagerAsyncHandler.ListControlDomainInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsights"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlDomainInsightsResult> listControlDomainInsightsAsync(
            ListControlDomainInsightsRequest listControlDomainInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<ListControlDomainInsightsRequest, ListControlDomainInsightsResult> asyncHandler);

    /**
     * <p>
     * Lists analytics data for control domains within a specified active assessment.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsByAssessmentRequest
     * @return A Java Future containing the result of the ListControlDomainInsightsByAssessment operation returned by
     *         the service.
     * @sample AWSAuditManagerAsync.ListControlDomainInsightsByAssessment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlDomainInsightsByAssessmentResult> listControlDomainInsightsByAssessmentAsync(
            ListControlDomainInsightsByAssessmentRequest listControlDomainInsightsByAssessmentRequest);

    /**
     * <p>
     * Lists analytics data for control domains within a specified active assessment.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsByAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListControlDomainInsightsByAssessment operation returned by
     *         the service.
     * @sample AWSAuditManagerAsyncHandler.ListControlDomainInsightsByAssessment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlDomainInsightsByAssessmentResult> listControlDomainInsightsByAssessmentAsync(
            ListControlDomainInsightsByAssessmentRequest listControlDomainInsightsByAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<ListControlDomainInsightsByAssessmentRequest, ListControlDomainInsightsByAssessmentResult> asyncHandler);

    /**
     * <p>
     * Lists the latest analytics data for controls within a specific control domain across all active assessments.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain that was specified and the control
     * collected evidence on the <code>lastUpdated</code> date of <code>controlInsightsMetadata</code>. If neither of
     * these conditions are met, no data is listed for that control.
     * </p>
     * </note>
     * 
     * @param listControlInsightsByControlDomainRequest
     * @return A Java Future containing the result of the ListControlInsightsByControlDomain operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.ListControlInsightsByControlDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlInsightsByControlDomainResult> listControlInsightsByControlDomainAsync(
            ListControlInsightsByControlDomainRequest listControlInsightsByControlDomainRequest);

    /**
     * <p>
     * Lists the latest analytics data for controls within a specific control domain across all active assessments.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain that was specified and the control
     * collected evidence on the <code>lastUpdated</code> date of <code>controlInsightsMetadata</code>. If neither of
     * these conditions are met, no data is listed for that control.
     * </p>
     * </note>
     * 
     * @param listControlInsightsByControlDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListControlInsightsByControlDomain operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.ListControlInsightsByControlDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlInsightsByControlDomainResult> listControlInsightsByControlDomainAsync(
            ListControlInsightsByControlDomainRequest listControlInsightsByControlDomainRequest,
            com.amazonaws.handlers.AsyncHandler<ListControlInsightsByControlDomainRequest, ListControlInsightsByControlDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of controls from Audit Manager.
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
     * Returns a list of controls from Audit Manager.
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
     * Returns a list of keywords that are pre-mapped to the specified control data source.
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
     * Returns a list of keywords that are pre-mapped to the specified control data source.
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
     * Returns a list of all Audit Manager notifications.
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
     * Returns a list of all Audit Manager notifications.
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
     * Returns a list of tags for the specified resource in Audit Manager.
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
     * Returns a list of tags for the specified resource in Audit Manager.
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
     * Enables Audit Manager for the specified Amazon Web Services account.
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
     * Enables Audit Manager for the specified Amazon Web Services account.
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
     * Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager.
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
     * Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager.
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
     * Creates a share request for a custom framework in Audit Manager.
     * </p>
     * <p>
     * The share request specifies a recipient and notifies them that a custom framework is available. Recipients have
     * 120 days to accept or decline the request. If no action is taken, the share request expires.
     * </p>
     * <p>
     * When you create a share request, Audit Manager stores a snapshot of your custom framework in the US East (N.
     * Virginia) Amazon Web Services Region. Audit Manager also stores a backup of the same snapshot in the US West
     * (Oregon) Amazon Web Services Region.
     * </p>
     * <p>
     * Audit Manager deletes the snapshot and the backup snapshot when one of the following events occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The sender revokes the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient declines the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient encounters an error and doesn't successfully accept the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The share request expires before the recipient responds to the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a sender <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/framework-sharing.html#framework-sharing-resend"
     * >resends a share request</a>, the snapshot is replaced with an updated version that corresponds with the latest
     * version of the custom framework.
     * </p>
     * <p>
     * When a recipient accepts a share request, the snapshot is replicated into their Amazon Web Services account under
     * the Amazon Web Services Region that was specified in the share request.
     * </p>
     * <important>
     * <p>
     * When you invoke the <code>StartAssessmentFrameworkShare</code> API, you are about to share a custom framework
     * with another Amazon Web Services account. You may not share a custom framework that is derived from a standard
     * framework if the standard framework is designated as not eligible for sharing by Amazon Web Services, unless you
     * have obtained permission to do so from the owner of the standard framework. To learn more about which standard
     * frameworks are eligible for sharing, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/share-custom-framework-concepts-and-terminology.html#eligibility"
     * >Framework sharing eligibility</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * </important>
     * 
     * @param startAssessmentFrameworkShareRequest
     * @return A Java Future containing the result of the StartAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.StartAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/StartAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssessmentFrameworkShareResult> startAssessmentFrameworkShareAsync(
            StartAssessmentFrameworkShareRequest startAssessmentFrameworkShareRequest);

    /**
     * <p>
     * Creates a share request for a custom framework in Audit Manager.
     * </p>
     * <p>
     * The share request specifies a recipient and notifies them that a custom framework is available. Recipients have
     * 120 days to accept or decline the request. If no action is taken, the share request expires.
     * </p>
     * <p>
     * When you create a share request, Audit Manager stores a snapshot of your custom framework in the US East (N.
     * Virginia) Amazon Web Services Region. Audit Manager also stores a backup of the same snapshot in the US West
     * (Oregon) Amazon Web Services Region.
     * </p>
     * <p>
     * Audit Manager deletes the snapshot and the backup snapshot when one of the following events occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The sender revokes the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient declines the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient encounters an error and doesn't successfully accept the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The share request expires before the recipient responds to the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a sender <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/framework-sharing.html#framework-sharing-resend"
     * >resends a share request</a>, the snapshot is replaced with an updated version that corresponds with the latest
     * version of the custom framework.
     * </p>
     * <p>
     * When a recipient accepts a share request, the snapshot is replicated into their Amazon Web Services account under
     * the Amazon Web Services Region that was specified in the share request.
     * </p>
     * <important>
     * <p>
     * When you invoke the <code>StartAssessmentFrameworkShare</code> API, you are about to share a custom framework
     * with another Amazon Web Services account. You may not share a custom framework that is derived from a standard
     * framework if the standard framework is designated as not eligible for sharing by Amazon Web Services, unless you
     * have obtained permission to do so from the owner of the standard framework. To learn more about which standard
     * frameworks are eligible for sharing, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/share-custom-framework-concepts-and-terminology.html#eligibility"
     * >Framework sharing eligibility</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * </important>
     * 
     * @param startAssessmentFrameworkShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.StartAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/StartAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAssessmentFrameworkShareResult> startAssessmentFrameworkShareAsync(
            StartAssessmentFrameworkShareRequest startAssessmentFrameworkShareRequest,
            com.amazonaws.handlers.AsyncHandler<StartAssessmentFrameworkShareRequest, StartAssessmentFrameworkShareResult> asyncHandler);

    /**
     * <p>
     * Tags the specified resource in Audit Manager.
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
     * Tags the specified resource in Audit Manager.
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
     * Removes a tag from a resource in Audit Manager.
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
     * Removes a tag from a resource in Audit Manager.
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
     * Edits an Audit Manager assessment.
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
     * Edits an Audit Manager assessment.
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
     * Updates a control within an assessment in Audit Manager.
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
     * Updates a control within an assessment in Audit Manager.
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
     * Updates the status of a control set in an Audit Manager assessment.
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
     * Updates the status of a control set in an Audit Manager assessment.
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
     * Updates a custom framework in Audit Manager.
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
     * Updates a custom framework in Audit Manager.
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
     * Updates a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkShareRequest
     * @return A Java Future containing the result of the UpdateAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsync.UpdateAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentFrameworkShareResult> updateAssessmentFrameworkShareAsync(
            UpdateAssessmentFrameworkShareRequest updateAssessmentFrameworkShareRequest);

    /**
     * <p>
     * Updates a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssessmentFrameworkShare operation returned by the
     *         service.
     * @sample AWSAuditManagerAsyncHandler.UpdateAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssessmentFrameworkShareResult> updateAssessmentFrameworkShareAsync(
            UpdateAssessmentFrameworkShareRequest updateAssessmentFrameworkShareRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentFrameworkShareRequest, UpdateAssessmentFrameworkShareResult> asyncHandler);

    /**
     * <p>
     * Updates the status of an assessment in Audit Manager.
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
     * Updates the status of an assessment in Audit Manager.
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
     * Updates a custom control in Audit Manager.
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
     * Updates a custom control in Audit Manager.
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
     * Updates Audit Manager settings for the current user account.
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
     * Updates Audit Manager settings for the current user account.
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
     * Validates the integrity of an assessment report in Audit Manager.
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
     * Validates the integrity of an assessment report in Audit Manager.
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
