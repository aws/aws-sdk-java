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
     * Associates an evidence folder to the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param associateAssessmentReportEvidenceFolderRequest
     * @return Result of the AssociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.AssociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAssessmentReportEvidenceFolderResult associateAssessmentReportEvidenceFolder(
            AssociateAssessmentReportEvidenceFolderRequest associateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Associates a list of evidence to an assessment report in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchAssociateAssessmentReportEvidenceRequest
     * @return Result of the BatchAssociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.BatchAssociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchAssociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAssociateAssessmentReportEvidenceResult batchAssociateAssessmentReportEvidence(
            BatchAssociateAssessmentReportEvidenceRequest batchAssociateAssessmentReportEvidenceRequest);

    /**
     * <p>
     * Create a batch of delegations for a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchCreateDelegationByAssessmentRequest
     * @return Result of the BatchCreateDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Deletes the delegations in the specified AWS Audit Manager assessment.
     * </p>
     * 
     * @param batchDeleteDelegationByAssessmentRequest
     * @return Result of the BatchDeleteDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Disassociates a list of evidence from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param batchDisassociateAssessmentReportEvidenceRequest
     * @return Result of the BatchDisassociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.BatchDisassociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisassociateAssessmentReportEvidenceResult batchDisassociateAssessmentReportEvidence(
            BatchDisassociateAssessmentReportEvidenceRequest batchDisassociateAssessmentReportEvidenceRequest);

    /**
     * <p>
     * Uploads one or more pieces of evidence to the specified control in the assessment in AWS Audit Manager.
     * </p>
     * 
     * @param batchImportEvidenceToAssessmentControlRequest
     * @return Result of the BatchImportEvidenceToAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Creates an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return Result of the CreateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.CreateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAssessmentResult createAssessment(CreateAssessmentRequest createAssessmentRequest);

    /**
     * <p>
     * Creates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param createAssessmentFrameworkRequest
     * @return Result of the CreateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
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
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.CreateAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAssessmentReportResult createAssessmentReport(CreateAssessmentReportRequest createAssessmentReportRequest);

    /**
     * <p>
     * Creates a new custom control in AWS Audit Manager.
     * </p>
     * 
     * @param createControlRequest
     * @return Result of the CreateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.CreateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
     *      Documentation</a>
     */
    CreateControlResult createControl(CreateControlRequest createControlRequest);

    /**
     * <p>
     * Deletes an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return Result of the DeleteAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAssessmentResult deleteAssessment(DeleteAssessmentRequest deleteAssessmentRequest);

    /**
     * <p>
     * Deletes a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkRequest
     * @return Result of the DeleteAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssessmentFrameworkResult deleteAssessmentFramework(DeleteAssessmentFrameworkRequest deleteAssessmentFrameworkRequest);

    /**
     * <p>
     * Deletes an assessment report from an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentReportRequest
     * @return Result of the DeleteAssessmentReport operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.DeleteAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAssessmentReportResult deleteAssessmentReport(DeleteAssessmentReportRequest deleteAssessmentReportRequest);

    /**
     * <p>
     * Deletes a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param deleteControlRequest
     * @return Result of the DeleteControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteControl" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteControlResult deleteControl(DeleteControlRequest deleteControlRequest);

    /**
     * <p>
     * Deregisters an account in AWS Audit Manager.
     * </p>
     * 
     * @param deregisterAccountRequest
     * @return Result of the DeregisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.DeregisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterAccountResult deregisterAccount(DeregisterAccountRequest deregisterAccountRequest);

    /**
     * <p>
     * Deregisters the delegated AWS administrator account from the AWS organization.
     * </p>
     * 
     * @param deregisterOrganizationAdminAccountRequest
     * @return Result of the DeregisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.DeregisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterOrganizationAdminAccountResult deregisterOrganizationAdminAccount(
            DeregisterOrganizationAdminAccountRequest deregisterOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disassociates an evidence folder from the specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param disassociateAssessmentReportEvidenceFolderRequest
     * @return Result of the DisassociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.DisassociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DisassociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAssessmentReportEvidenceFolderResult disassociateAssessmentReportEvidenceFolder(
            DisassociateAssessmentReportEvidenceFolderRequest disassociateAssessmentReportEvidenceFolderRequest);

    /**
     * <p>
     * Returns the registration status of an account in AWS Audit Manager.
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
     * Returns an assessment from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return Result of the GetAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssessmentResult getAssessment(GetAssessmentRequest getAssessmentRequest);

    /**
     * <p>
     * Returns a framework from AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentFrameworkRequest
     * @return Result of the GetAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssessmentFrameworkResult getAssessmentFramework(GetAssessmentFrameworkRequest getAssessmentFrameworkRequest);

    /**
     * <p>
     * Returns the URL of a specified assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param getAssessmentReportUrlRequest
     * @return Result of the GetAssessmentReportUrl operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.GetAssessmentReportUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
     *      target="_top">AWS API Documentation</a>
     */
    GetAssessmentReportUrlResult getAssessmentReportUrl(GetAssessmentReportUrlRequest getAssessmentReportUrlRequest);

    /**
     * <p>
     * Returns a list of changelogs from AWS Audit Manager.
     * </p>
     * 
     * @param getChangeLogsRequest
     * @return Result of the GetChangeLogs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
     * Returns a control from AWS Audit Manager.
     * </p>
     * 
     * @param getControlRequest
     * @return Result of the GetControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetDelegations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetDelegations" target="_top">AWS
     *      API Documentation</a>
     */
    GetDelegationsResult getDelegations(GetDelegationsRequest getDelegationsRequest);

    /**
     * <p>
     * Returns evidence from AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceRequest
     * @return Result of the GetEvidence operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
     *      Documentation</a>
     */
    GetEvidenceResult getEvidence(GetEvidenceRequest getEvidenceRequest);

    /**
     * <p>
     * Returns all evidence from a specified evidence folder in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceByEvidenceFolderRequest
     * @return Result of the GetEvidenceByEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceByEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    GetEvidenceByEvidenceFolderResult getEvidenceByEvidenceFolder(GetEvidenceByEvidenceFolderRequest getEvidenceByEvidenceFolderRequest);

    /**
     * <p>
     * Returns an evidence folder from the specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFolderRequest
     * @return Result of the GetEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS
     *      API Documentation</a>
     */
    GetEvidenceFolderResult getEvidenceFolder(GetEvidenceFolderRequest getEvidenceFolderRequest);

    /**
     * <p>
     * Returns the evidence folders from a specified assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentRequest
     * @return Result of the GetEvidenceFoldersByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns a list of evidence folders associated with a specified control of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentControlRequest
     * @return Result of the GetEvidenceFoldersByAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns the name of the delegated AWS administrator account for the AWS organization.
     * </p>
     * 
     * @param getOrganizationAdminAccountRequest
     * @return Result of the GetOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.GetOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationAdminAccountResult getOrganizationAdminAccount(GetOrganizationAdminAccountRequest getOrganizationAdminAccountRequest);

    /**
     * <p>
     * Returns a list of the in-scope AWS services for the specified assessment.
     * </p>
     * 
     * @param getServicesInScopeRequest
     * @return Result of the GetServicesInScope operation returned by the service.
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
     * Returns the settings for the specified AWS account.
     * </p>
     * 
     * @param getSettingsRequest
     * @return Result of the GetSettings operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetSettingsResult getSettings(GetSettingsRequest getSettingsRequest);

    /**
     * <p>
     * Returns a list of the frameworks available in the AWS Audit Manager framework library.
     * </p>
     * 
     * @param listAssessmentFrameworksRequest
     * @return Result of the ListAssessmentFrameworks operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentFrameworksResult listAssessmentFrameworks(ListAssessmentFrameworksRequest listAssessmentFrameworksRequest);

    /**
     * <p>
     * Returns a list of assessment reports created in AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentReportsRequest
     * @return Result of the ListAssessmentReports operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssessmentReportsResult listAssessmentReports(ListAssessmentReportsRequest listAssessmentReportsRequest);

    /**
     * <p>
     * Returns a list of current and past assessments from AWS Audit Manager.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return Result of the ListAssessments operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns a list of controls from AWS Audit Manager.
     * </p>
     * 
     * @param listControlsRequest
     * @return Result of the ListControls operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns a list of keywords that pre-mapped to the specified control data source.
     * </p>
     * 
     * @param listKeywordsForDataSourceRequest
     * @return Result of the ListKeywordsForDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns a list of all AWS Audit Manager notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * Returns a list of tags for the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Enables AWS Audit Manager for the specified AWS account.
     * </p>
     * 
     * @param registerAccountRequest
     * @return Result of the RegisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterAccountResult registerAccount(RegisterAccountRequest registerAccountRequest);

    /**
     * <p>
     * Enables an AWS account within the organization as the delegated administrator for AWS Audit Manager.
     * </p>
     * 
     * @param registerOrganizationAdminAccountRequest
     * @return Result of the RegisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.RegisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterOrganizationAdminAccountResult registerOrganizationAdminAccount(RegisterOrganizationAdminAccountRequest registerOrganizationAdminAccountRequest);

    /**
     * <p>
     * Tags the specified resource in AWS Audit Manager.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource in AWS Audit Manager.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @sample AWSAuditManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Edits an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return Result of the UpdateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAssessmentResult updateAssessment(UpdateAssessmentRequest updateAssessmentRequest);

    /**
     * <p>
     * Updates a control within an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentControlRequest
     * @return Result of the UpdateAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentControlResult updateAssessmentControl(UpdateAssessmentControlRequest updateAssessmentControlRequest);

    /**
     * <p>
     * Updates the status of a control set in an AWS Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentControlSetStatusRequest
     * @return Result of the UpdateAssessmentControlSetStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControlSetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControlSetStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentControlSetStatusResult updateAssessmentControlSetStatus(UpdateAssessmentControlSetStatusRequest updateAssessmentControlSetStatusRequest);

    /**
     * <p>
     * Updates a custom framework in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkRequest
     * @return Result of the UpdateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentFrameworkResult updateAssessmentFramework(UpdateAssessmentFrameworkRequest updateAssessmentFrameworkRequest);

    /**
     * <p>
     * Updates the status of an assessment in AWS Audit Manager.
     * </p>
     * 
     * @param updateAssessmentStatusRequest
     * @return Result of the UpdateAssessmentStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAssessmentStatusResult updateAssessmentStatus(UpdateAssessmentStatusRequest updateAssessmentStatusRequest);

    /**
     * <p>
     * Updates a custom control in AWS Audit Manager.
     * </p>
     * 
     * @param updateControlRequest
     * @return Result of the UpdateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateControlResult updateControl(UpdateControlRequest updateControlRequest);

    /**
     * <p>
     * Updates AWS Audit Manager settings for the current user account.
     * </p>
     * 
     * @param updateSettingsRequest
     * @return Result of the UpdateSettings operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateSettings" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSettingsResult updateSettings(UpdateSettingsRequest updateSettingsRequest);

    /**
     * <p>
     * Validates the integrity of an assessment report in AWS Audit Manager.
     * </p>
     * 
     * @param validateAssessmentReportIntegrityRequest
     * @return Result of the ValidateAssessmentReportIntegrity operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource specified in the request cannot be found.
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
