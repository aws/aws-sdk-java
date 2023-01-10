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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.auditmanager.model.*;

/**
 * Interface for accessing AWS Audit Manager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.auditmanager.AbstractAWSAuditManager} instead.
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
 * Parameters that all operations can use.
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
public interface AWSAuditManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "auditmanager";

    /**
     * <p>
     * Associates an evidence folder to an assessment report in an Audit Manager assessment.
     * </p>
     * 
     * @param associateAssessmentReportEvidenceFolderRequest
     * @return Result of the AssociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.AssociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAssessmentReportEvidenceFolderResult associateAssessmentReportEvidenceFolder(
            AssociateAssessmentReportEvidenceFolderRequest associateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Associates a list of evidence to an assessment report in an Audit Manager assessment.
     * </p>
     * 
     * @param batchAssociateAssessmentReportEvidenceRequest
     * @return Result of the BatchAssociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.BatchAssociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchAssociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateAssessmentReportEvidenceResult batchAssociateAssessmentReportEvidence(
            BatchAssociateAssessmentReportEvidenceRequest batchAssociateAssessmentReportEvidenceRequest);

    /**
     * <p>
     * Creates a batch of delegations for an assessment in Audit Manager.
     * </p>
     * 
     * @param batchCreateDelegationByAssessmentRequest
     * @return Result of the BatchCreateDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchCreateDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateDelegationByAssessmentResult batchCreateDelegationByAssessment(BatchCreateDelegationByAssessmentRequest batchCreateDelegationByAssessmentRequest);

    /**
     * <p>
     * Deletes a batch of delegations for an assessment in Audit Manager.
     * </p>
     * 
     * @param batchDeleteDelegationByAssessmentRequest
     * @return Result of the BatchDeleteDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchDeleteDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteDelegationByAssessmentResult batchDeleteDelegationByAssessment(BatchDeleteDelegationByAssessmentRequest batchDeleteDelegationByAssessmentRequest);

    /**
     * <p>
     * Disassociates a list of evidence from an assessment report in Audit Manager.
     * </p>
     * 
     * @param batchDisassociateAssessmentReportEvidenceRequest
     * @return Result of the BatchDisassociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.BatchDisassociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateAssessmentReportEvidenceResult batchDisassociateAssessmentReportEvidence(
            BatchDisassociateAssessmentReportEvidenceRequest batchDisassociateAssessmentReportEvidenceRequest);

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
     * @return Result of the BatchImportEvidenceToAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchImportEvidenceToAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchImportEvidenceToAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    BatchImportEvidenceToAssessmentControlResult batchImportEvidenceToAssessmentControl(
            BatchImportEvidenceToAssessmentControlRequest batchImportEvidenceToAssessmentControlRequest);

    /**
     * <p>
     * Creates an assessment in Audit Manager.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return Result of the CreateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAssessmentResult createAssessment(CreateAssessmentRequest createAssessmentRequest);

    /**
     * <p>
     * Creates a custom framework in Audit Manager.
     * </p>
     * 
     * @param createAssessmentFrameworkRequest
     * @return Result of the CreateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAssessmentFrameworkResult createAssessmentFramework(CreateAssessmentFrameworkRequest createAssessmentFrameworkRequest);

    /**
     * <p>
     * Creates an assessment report for the specified assessment.
     * </p>
     * 
     * @param createAssessmentReportRequest
     * @return Result of the CreateAssessmentReport operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.CreateAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAssessmentReportResult createAssessmentReport(CreateAssessmentReportRequest createAssessmentReportRequest);

    /**
     * <p>
     * Creates a new custom control in Audit Manager.
     * </p>
     * 
     * @param createControlRequest
     * @return Result of the CreateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
     *      Documentation</a>
     */
    CreateControlResult createControl(CreateControlRequest createControlRequest);

    /**
     * <p>
     * Deletes an assessment in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return Result of the DeleteAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAssessmentResult deleteAssessment(DeleteAssessmentRequest deleteAssessmentRequest);

    /**
     * <p>
     * Deletes a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkRequest
     * @return Result of the DeleteAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssessmentFrameworkResult deleteAssessmentFramework(DeleteAssessmentFrameworkRequest deleteAssessmentFrameworkRequest);

    /**
     * <p>
     * Deletes a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkShareRequest
     * @return Result of the DeleteAssessmentFrameworkShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssessmentFrameworkShareResult deleteAssessmentFrameworkShare(DeleteAssessmentFrameworkShareRequest deleteAssessmentFrameworkShareRequest);

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
     * @return Result of the DeleteAssessmentReport operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeleteAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssessmentReportResult deleteAssessmentReport(DeleteAssessmentReportRequest deleteAssessmentReportRequest);

    /**
     * <p>
     * Deletes a custom control in Audit Manager.
     * </p>
     * 
     * @param deleteControlRequest
     * @return Result of the DeleteControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteControl" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteControlResult deleteControl(DeleteControlRequest deleteControlRequest);

    /**
     * <p>
     * Deregisters an account in Audit Manager.
     * </p>
     * <note>
     * <p>
     * Before you deregister, you can use the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_UpdateSettings.html">UpdateSettings</a>
     * API operation to set your preferred data retention policy. By default, Audit Manager retains your data. If you
     * want to delete your data, you can use the <code>DeregistrationPolicy</code> attribute to request the deletion of
     * your data.
     * </p>
     * <p>
     * For more information about data retention, see <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/data-protection.html">Data Protection</a> in the
     * <i>Audit Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deregisterAccountRequest
     * @return Result of the DeregisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeregisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterAccountResult deregisterAccount(DeregisterAccountRequest deregisterAccountRequest);

    /**
     * <p>
     * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.
     * </p>
     * <p>
     * When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the
     * evidence that you previously collected under that account. This is also the case when you deregister a delegated
     * administrator from Organizations. However, Audit Manager stops collecting and attaching evidence to that
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
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-eds-disable-termination.html">deletes the
     * event data store</a>.
     * </p>
     * <p>
     * This cleanup task is necessary to ensure that you don't end up with multiple event data stores. Audit Manager
     * ignores an unused event data store after you remove or change a delegated administrator account. However, the
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
     * At this time, Audit Manager doesn't provide an option to delete evidence for a specific delegated administrator.
     * Instead, when your management account deregisters Audit Manager, we perform a cleanup for the current delegated
     * administrator account at the time of deregistration.
     * </p>
     * 
     * @param deregisterOrganizationAdminAccountRequest
     * @return Result of the DeregisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeregisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterOrganizationAdminAccountResult deregisterOrganizationAdminAccount(
            DeregisterOrganizationAdminAccountRequest deregisterOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disassociates an evidence folder from the specified assessment report in Audit Manager.
     * </p>
     * 
     * @param disassociateAssessmentReportEvidenceFolderRequest
     * @return Result of the DisassociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DisassociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DisassociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAssessmentReportEvidenceFolderResult disassociateAssessmentReportEvidenceFolder(
            DisassociateAssessmentReportEvidenceFolderRequest disassociateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Returns the registration status of an account in Audit Manager.
     * </p>
     * 
     * @param getAccountStatusRequest
     * @return Result of the GetAccountStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAccountStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetAccountStatusResult getAccountStatus(GetAccountStatusRequest getAccountStatusRequest);

    /**
     * <p>
     * Returns an assessment from Audit Manager.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return Result of the GetAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssessmentResult getAssessment(GetAssessmentRequest getAssessmentRequest);

    /**
     * <p>
     * Returns a framework from Audit Manager.
     * </p>
     * 
     * @param getAssessmentFrameworkRequest
     * @return Result of the GetAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssessmentFrameworkResult getAssessmentFramework(GetAssessmentFrameworkRequest getAssessmentFrameworkRequest);

    /**
     * <p>
     * Returns the URL of an assessment report in Audit Manager.
     * </p>
     * 
     * @param getAssessmentReportUrlRequest
     * @return Result of the GetAssessmentReportUrl operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.GetAssessmentReportUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssessmentReportUrlResult getAssessmentReportUrl(GetAssessmentReportUrlRequest getAssessmentReportUrlRequest);

    /**
     * <p>
     * Returns a list of changelogs from Audit Manager.
     * </p>
     * 
     * @param getChangeLogsRequest
     * @return Result of the GetChangeLogs operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetChangeLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
     *      Documentation</a>
     */
    GetChangeLogsResult getChangeLogs(GetChangeLogsRequest getChangeLogsRequest);

    /**
     * <p>
     * Returns a control from Audit Manager.
     * </p>
     * 
     * @param getControlRequest
     * @return Result of the GetControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetControl" target="_top">AWS API
     *      Documentation</a>
     */
    GetControlResult getControl(GetControlRequest getControlRequest);

    /**
     * <p>
     * Returns a list of delegations from an audit owner to a delegate.
     * </p>
     * 
     * @param getDelegationsRequest
     * @return Result of the GetDelegations operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetDelegations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetDelegations" target="_top">AWS
     *      API Documentation</a>
     */
    GetDelegationsResult getDelegations(GetDelegationsRequest getDelegationsRequest);

    /**
     * <p>
     * Returns evidence from Audit Manager.
     * </p>
     * 
     * @param getEvidenceRequest
     * @return Result of the GetEvidence operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
     *      Documentation</a>
     */
    GetEvidenceResult getEvidence(GetEvidenceRequest getEvidenceRequest);

    /**
     * <p>
     * Returns all evidence from a specified evidence folder in Audit Manager.
     * </p>
     * 
     * @param getEvidenceByEvidenceFolderRequest
     * @return Result of the GetEvidenceByEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceByEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    GetEvidenceByEvidenceFolderResult getEvidenceByEvidenceFolder(GetEvidenceByEvidenceFolderRequest getEvidenceByEvidenceFolderRequest);

    /**
     * <p>
     * Returns an evidence folder from the specified assessment in Audit Manager.
     * </p>
     * 
     * @param getEvidenceFolderRequest
     * @return Result of the GetEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS
     *      API Documentation</a>
     */
    GetEvidenceFolderResult getEvidenceFolder(GetEvidenceFolderRequest getEvidenceFolderRequest);

    /**
     * <p>
     * Returns the evidence folders from a specified assessment in Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentRequest
     * @return Result of the GetEvidenceFoldersByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFoldersByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    GetEvidenceFoldersByAssessmentResult getEvidenceFoldersByAssessment(GetEvidenceFoldersByAssessmentRequest getEvidenceFoldersByAssessmentRequest);

    /**
     * <p>
     * Returns a list of evidence folders that are associated with a specified control in an Audit Manager assessment.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentControlRequest
     * @return Result of the GetEvidenceFoldersByAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFoldersByAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    GetEvidenceFoldersByAssessmentControlResult getEvidenceFoldersByAssessmentControl(
            GetEvidenceFoldersByAssessmentControlRequest getEvidenceFoldersByAssessmentControlRequest);

    /**
     * <p>
     * Gets the latest analytics data for all your current active assessments.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    GetInsightsResult getInsights(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Gets the latest analytics data for a specific active assessment.
     * </p>
     * 
     * @param getInsightsByAssessmentRequest
     * @return Result of the GetInsightsByAssessment operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetInsightsByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    GetInsightsByAssessmentResult getInsightsByAssessment(GetInsightsByAssessmentRequest getInsightsByAssessmentRequest);

    /**
     * <p>
     * Returns the name of the delegated Amazon Web Services administrator account for the organization.
     * </p>
     * 
     * @param getOrganizationAdminAccountRequest
     * @return Result of the GetOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.GetOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationAdminAccountResult getOrganizationAdminAccount(GetOrganizationAdminAccountRequest getOrganizationAdminAccountRequest);

    /**
     * <p>
     * Returns a list of all of the Amazon Web Services that you can choose to include in your assessment. When you <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_CreateAssessment.html">create an
     * assessment</a>, specify which of these services you want to include to narrow the assessment's <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Scope.html">scope</a>.
     * </p>
     * 
     * @param getServicesInScopeRequest
     * @return Result of the GetServicesInScope operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetServicesInScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetServicesInScope"
     *      target="_top">AWS API Documentation</a>
     */
    GetServicesInScopeResult getServicesInScope(GetServicesInScopeRequest getServicesInScopeRequest);

    /**
     * <p>
     * Returns the settings for the specified Amazon Web Services account.
     * </p>
     * 
     * @param getSettingsRequest
     * @return Result of the GetSettings operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetSettingsResult getSettings(GetSettingsRequest getSettingsRequest);

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
     * @return Result of the ListAssessmentControlInsightsByControlDomain operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentControlInsightsByControlDomain
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentControlInsightsByControlDomainResult listAssessmentControlInsightsByControlDomain(
            ListAssessmentControlInsightsByControlDomainRequest listAssessmentControlInsightsByControlDomainRequest);

    /**
     * <p>
     * Returns a list of sent or received share requests for custom frameworks in Audit Manager.
     * </p>
     * 
     * @param listAssessmentFrameworkShareRequestsRequest
     * @return Result of the ListAssessmentFrameworkShareRequests operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentFrameworkShareRequests
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentFrameworkShareRequestsResult listAssessmentFrameworkShareRequests(
            ListAssessmentFrameworkShareRequestsRequest listAssessmentFrameworkShareRequestsRequest);

    /**
     * <p>
     * Returns a list of the frameworks that are available in the Audit Manager framework library.
     * </p>
     * 
     * @param listAssessmentFrameworksRequest
     * @return Result of the ListAssessmentFrameworks operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentFrameworksResult listAssessmentFrameworks(ListAssessmentFrameworksRequest listAssessmentFrameworksRequest);

    /**
     * <p>
     * Returns a list of assessment reports created in Audit Manager.
     * </p>
     * 
     * @param listAssessmentReportsRequest
     * @return Result of the ListAssessmentReports operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentReportsResult listAssessmentReports(ListAssessmentReportsRequest listAssessmentReportsRequest);

    /**
     * <p>
     * Returns a list of current and past assessments from Audit Manager.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return Result of the ListAssessments operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssessmentsResult listAssessments(ListAssessmentsRequest listAssessmentsRequest);

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
     * @return Result of the ListControlDomainInsights operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @sample AWSAuditManager.ListControlDomainInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsights"
     *      target="_top">AWS API Documentation</a>
     */
    ListControlDomainInsightsResult listControlDomainInsights(ListControlDomainInsightsRequest listControlDomainInsightsRequest);

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
     * @return Result of the ListControlDomainInsightsByAssessment operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListControlDomainInsightsByAssessment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    ListControlDomainInsightsByAssessmentResult listControlDomainInsightsByAssessment(
            ListControlDomainInsightsByAssessmentRequest listControlDomainInsightsByAssessmentRequest);

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
     * @return Result of the ListControlInsightsByControlDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @sample AWSAuditManager.ListControlInsightsByControlDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    ListControlInsightsByControlDomainResult listControlInsightsByControlDomain(
            ListControlInsightsByControlDomainRequest listControlInsightsByControlDomainRequest);

    /**
     * <p>
     * Returns a list of controls from Audit Manager.
     * </p>
     * 
     * @param listControlsRequest
     * @return Result of the ListControls operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControls" target="_top">AWS API
     *      Documentation</a>
     */
    ListControlsResult listControls(ListControlsRequest listControlsRequest);

    /**
     * <p>
     * Returns a list of keywords that are pre-mapped to the specified control data source.
     * </p>
     * 
     * @param listKeywordsForDataSourceRequest
     * @return Result of the ListKeywordsForDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListKeywordsForDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    ListKeywordsForDataSourceResult listKeywordsForDataSource(ListKeywordsForDataSourceRequest listKeywordsForDataSourceRequest);

    /**
     * <p>
     * Returns a list of all Audit Manager notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListNotifications" target="_top">AWS
     *      API Documentation</a>
     */
    ListNotificationsResult listNotifications(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * Returns a list of tags for the specified resource in Audit Manager.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Enables Audit Manager for the specified Amazon Web Services account.
     * </p>
     * 
     * @param registerAccountRequest
     * @return Result of the RegisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSAuditManager.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterAccountResult registerAccount(RegisterAccountRequest registerAccountRequest);

    /**
     * <p>
     * Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager.
     * </p>
     * 
     * @param registerOrganizationAdminAccountRequest
     * @return Result of the RegisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.RegisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterOrganizationAdminAccountResult registerOrganizationAdminAccount(RegisterOrganizationAdminAccountRequest registerOrganizationAdminAccountRequest);

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
     * @return Result of the StartAssessmentFrameworkShare operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.StartAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/StartAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    StartAssessmentFrameworkShareResult startAssessmentFrameworkShare(StartAssessmentFrameworkShareRequest startAssessmentFrameworkShareRequest);

    /**
     * <p>
     * Tags the specified resource in Audit Manager.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource in Audit Manager.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Edits an Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return Result of the UpdateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAssessmentResult updateAssessment(UpdateAssessmentRequest updateAssessmentRequest);

    /**
     * <p>
     * Updates a control within an assessment in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentControlRequest
     * @return Result of the UpdateAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentControlResult updateAssessmentControl(UpdateAssessmentControlRequest updateAssessmentControlRequest);

    /**
     * <p>
     * Updates the status of a control set in an Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentControlSetStatusRequest
     * @return Result of the UpdateAssessmentControlSetStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControlSetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControlSetStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentControlSetStatusResult updateAssessmentControlSetStatus(UpdateAssessmentControlSetStatusRequest updateAssessmentControlSetStatusRequest);

    /**
     * <p>
     * Updates a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkRequest
     * @return Result of the UpdateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentFrameworkResult updateAssessmentFramework(UpdateAssessmentFrameworkRequest updateAssessmentFrameworkRequest);

    /**
     * <p>
     * Updates a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkShareRequest
     * @return Result of the UpdateAssessmentFrameworkShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentFrameworkShareResult updateAssessmentFrameworkShare(UpdateAssessmentFrameworkShareRequest updateAssessmentFrameworkShareRequest);

    /**
     * <p>
     * Updates the status of an assessment in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentStatusRequest
     * @return Result of the UpdateAssessmentStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.UpdateAssessmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentStatusResult updateAssessmentStatus(UpdateAssessmentStatusRequest updateAssessmentStatusRequest);

    /**
     * <p>
     * Updates a custom control in Audit Manager.
     * </p>
     * 
     * @param updateControlRequest
     * @return Result of the UpdateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateControlResult updateControl(UpdateControlRequest updateControlRequest);

    /**
     * <p>
     * Updates Audit Manager settings for the current user account.
     * </p>
     * 
     * @param updateSettingsRequest
     * @return Result of the UpdateSettings operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateSettings" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSettingsResult updateSettings(UpdateSettingsRequest updateSettingsRequest);

    /**
     * <p>
     * Validates the integrity of an assessment report in Audit Manager.
     * </p>
     * 
     * @param validateAssessmentReportIntegrityRequest
     * @return Result of the ValidateAssessmentReportIntegrity operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.ValidateAssessmentReportIntegrity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ValidateAssessmentReportIntegrity"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateAssessmentReportIntegrityResult validateAssessmentReportIntegrity(ValidateAssessmentReportIntegrityRequest validateAssessmentReportIntegrityRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
