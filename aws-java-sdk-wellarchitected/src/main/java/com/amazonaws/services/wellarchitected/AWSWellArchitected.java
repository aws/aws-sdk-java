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
package com.amazonaws.services.wellarchitected;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.wellarchitected.model.*;

/**
 * Interface for accessing Well-Architected.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.wellarchitected.AbstractAWSWellArchitected} instead.
 * </p>
 * <p>
 * <fullname>Well-Architected Tool</fullname>
 * <p>
 * This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a
 * href="http://aws.amazon.com/well-architected-tool">Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">Amazon Web Services Management Console</a>. For information
 * about the Well-Architected Tool, see the <a
 * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">Well-Architected Tool User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWellArchitected {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "wellarchitected";

    /**
     * <p>
     * Associate a lens to a workload.
     * </p>
     * <p>
     * Up to 10 lenses can be associated with a workload in a single API operation. A maximum of 20 lenses can be
     * associated with a workload.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By accessing and/or applying custom lenses created by another Amazon Web Services user or account, you
     * acknowledge that custom lenses created by other users and shared with you are Third Party Content as defined in
     * the Amazon Web Services Customer Agreement.
     * </p>
     * </note>
     * 
     * @param associateLensesRequest
     *        Input to associate lens reviews.
     * @return Result of the AssociateLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.AssociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateLensesResult associateLenses(AssociateLensesRequest associateLensesRequest);

    /**
     * <p>
     * Create a lens share.
     * </p>
     * <p>
     * The owner of a lens can share it with other Amazon Web Services accounts, IAM users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region. Shared access to a lens is not removed until
     * the lens invitation is deleted.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param createLensShareRequest
     * @return Result of the CreateLensShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLensShareResult createLensShare(CreateLensShareRequest createLensShareRequest);

    /**
     * <p>
     * Create a new lens version.
     * </p>
     * <p>
     * A lens can have up to 100 versions.
     * </p>
     * <p>
     * After a lens has been imported, create a new lens version to publish it. The owner of a lens can share the lens
     * with other Amazon Web Services accounts and IAM users in the same Amazon Web Services Region. Only the owner of a
     * lens can delete it.
     * </p>
     * 
     * @param createLensVersionRequest
     * @return Result of the CreateLensVersion operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateLensVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLensVersionResult createLensVersion(CreateLensVersionRequest createLensVersionRequest);

    /**
     * <p>
     * Create a milestone for an existing workload.
     * </p>
     * 
     * @param createMilestoneRequest
     *        Input for milestone creation.
     * @return Result of the CreateMilestone operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateMilestone"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMilestoneResult createMilestone(CreateMilestoneRequest createMilestoneRequest);

    /**
     * <p>
     * Create a new workload.
     * </p>
     * <p>
     * The owner of a workload can share the workload with other Amazon Web Services accounts, IAM users, an
     * organization, and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload
     * can delete it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/define-workload.html">Defining a Workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * 
     * @param createWorkloadRequest
     *        Input for workload creation.
     * @return Result of the CreateWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWorkloadResult createWorkload(CreateWorkloadRequest createWorkloadRequest);

    /**
     * <p>
     * Create a workload share.
     * </p>
     * <p>
     * The owner of a workload can share it with other Amazon Web Services accounts and IAM users in the same Amazon Web
     * Services Region. Shared access to a workload is not removed until the workload invitation is deleted.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/workloads-sharing.html">Sharing a Workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * 
     * @param createWorkloadShareRequest
     *        Input for Create Workload Share
     * @return Result of the CreateWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.CreateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkloadShareResult createWorkloadShare(CreateWorkloadShareRequest createWorkloadShareRequest);

    /**
     * <p>
     * Delete an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and IAM users
     * that you shared the lens with can continue to use it, but they will no longer be able to apply it to new
     * workloads.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteLensRequest
     * @return Result of the DeleteLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLens" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLensResult deleteLens(DeleteLensRequest deleteLensRequest);

    /**
     * <p>
     * Delete a lens share.
     * </p>
     * <p>
     * After the lens share is deleted, Amazon Web Services accounts, IAM users, organizations, and organizational units
     * (OUs) that you shared the lens with can continue to use it, but they will no longer be able to apply it to new
     * workloads.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your custom lenses with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your custom lenses available to those other accounts. Those other accounts may continue to access and
     * use your shared custom lenses even if you delete the custom lenses from your own Amazon Web Services account or
     * terminate your Amazon Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteLensShareRequest
     * @return Result of the DeleteLensShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLensShareResult deleteLensShare(DeleteLensShareRequest deleteLensShareRequest);

    /**
     * <p>
     * Delete an existing workload.
     * </p>
     * 
     * @param deleteWorkloadRequest
     *        Input for workload deletion.
     * @return Result of the DeleteWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWorkloadResult deleteWorkload(DeleteWorkloadRequest deleteWorkloadRequest);

    /**
     * <p>
     * Delete a workload share.
     * </p>
     * 
     * @param deleteWorkloadShareRequest
     *        Input for Delete Workload Share
     * @return Result of the DeleteWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DeleteWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkloadShareResult deleteWorkloadShare(DeleteWorkloadShareRequest deleteWorkloadShareRequest);

    /**
     * <p>
     * Disassociate a lens from a workload.
     * </p>
     * <p>
     * Up to 10 lenses can be disassociated from a workload in a single API operation.
     * </p>
     * <note>
     * <p>
     * The Amazon Web Services Well-Architected Framework lens (<code>wellarchitected</code>) cannot be removed from a
     * workload.
     * </p>
     * </note>
     * 
     * @param disassociateLensesRequest
     *        Input to disassociate lens reviews.
     * @return Result of the DisassociateLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.DisassociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateLensesResult disassociateLenses(DisassociateLensesRequest disassociateLensesRequest);

    /**
     * <p>
     * Export an existing lens.
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>. Only the owner of a lens can export it.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or
     * collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable
     * law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param exportLensRequest
     * @return Result of the ExportLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ExportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
     *      Documentation</a>
     */
    ExportLensResult exportLens(ExportLensRequest exportLensRequest);

    /**
     * <p>
     * Get the answer to a specific question in a workload review.
     * </p>
     * 
     * @param getAnswerRequest
     *        Input to get answer.
     * @return Result of the GetAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnswerResult getAnswer(GetAnswerRequest getAnswerRequest);

    /**
     * <p>
     * Get an existing lens.
     * </p>
     * 
     * @param getLensRequest
     * @return Result of the GetLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLens" target="_top">AWS API
     *      Documentation</a>
     */
    GetLensResult getLens(GetLensRequest getLensRequest);

    /**
     * <p>
     * Get lens review.
     * </p>
     * 
     * @param getLensReviewRequest
     *        Input to get lens review.
     * @return Result of the GetLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReview" target="_top">AWS
     *      API Documentation</a>
     */
    GetLensReviewResult getLensReview(GetLensReviewRequest getLensReviewRequest);

    /**
     * <p>
     * Get lens review report.
     * </p>
     * 
     * @param getLensReviewReportRequest
     *        Input to get lens review report.
     * @return Result of the GetLensReviewReport operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensReviewReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReviewReport"
     *      target="_top">AWS API Documentation</a>
     */
    GetLensReviewReportResult getLensReviewReport(GetLensReviewReportRequest getLensReviewReportRequest);

    /**
     * <p>
     * Get lens version differences.
     * </p>
     * 
     * @param getLensVersionDifferenceRequest
     * @return Result of the GetLensVersionDifference operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetLensVersionDifference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
     *      target="_top">AWS API Documentation</a>
     */
    GetLensVersionDifferenceResult getLensVersionDifference(GetLensVersionDifferenceRequest getLensVersionDifferenceRequest);

    /**
     * <p>
     * Get a milestone for an existing workload.
     * </p>
     * 
     * @param getMilestoneRequest
     *        Input to get a milestone.
     * @return Result of the GetMilestone operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetMilestone" target="_top">AWS
     *      API Documentation</a>
     */
    GetMilestoneResult getMilestone(GetMilestoneRequest getMilestoneRequest);

    /**
     * <p>
     * Get an existing workload.
     * </p>
     * 
     * @param getWorkloadRequest
     *        Input to get a workload.
     * @return Result of the GetWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    GetWorkloadResult getWorkload(GetWorkloadRequest getWorkloadRequest);

    /**
     * <p>
     * Import a new lens.
     * </p>
     * <p>
     * The lens cannot be applied to workloads or shared with other Amazon Web Services accounts until it's published
     * with <a>CreateLensVersion</a>
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <p>
     * A custom lens cannot exceed 500 KB in size.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your custom lenses. If your custom lens or those shared with you and used in your account do include or
     * collect PII you are responsible for: ensuring that the included PII is processed in accordance with applicable
     * law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param importLensRequest
     * @return Result of the ImportLens operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ServiceQuotaExceededException
     *         The user has reached their resource quota.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ImportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImportLens" target="_top">AWS API
     *      Documentation</a>
     */
    ImportLensResult importLens(ImportLensRequest importLensRequest);

    /**
     * <p>
     * List of answers.
     * </p>
     * 
     * @param listAnswersRequest
     *        Input to list answers.
     * @return Result of the ListAnswers operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListAnswers" target="_top">AWS
     *      API Documentation</a>
     */
    ListAnswersResult listAnswers(ListAnswersRequest listAnswersRequest);

    /**
     * <p>
     * List of Trusted Advisor check details by account related to the workload.
     * </p>
     * 
     * @param listCheckDetailsRequest
     * @return Result of the ListCheckDetails operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListCheckDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckDetails"
     *      target="_top">AWS API Documentation</a>
     */
    ListCheckDetailsResult listCheckDetails(ListCheckDetailsRequest listCheckDetailsRequest);

    /**
     * <p>
     * List of Trusted Advisor checks summarized for all accounts related to the workload.
     * </p>
     * 
     * @param listCheckSummariesRequest
     * @return Result of the ListCheckSummaries operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    ListCheckSummariesResult listCheckSummaries(ListCheckSummariesRequest listCheckSummariesRequest);

    /**
     * <p>
     * List lens review improvements.
     * </p>
     * 
     * @param listLensReviewImprovementsRequest
     *        Input to list lens review improvements.
     * @return Result of the ListLensReviewImprovements operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensReviewImprovements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviewImprovements"
     *      target="_top">AWS API Documentation</a>
     */
    ListLensReviewImprovementsResult listLensReviewImprovements(ListLensReviewImprovementsRequest listLensReviewImprovementsRequest);

    /**
     * <p>
     * List lens reviews.
     * </p>
     * 
     * @param listLensReviewsRequest
     *        Input to list lens reviews.
     * @return Result of the ListLensReviews operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviews"
     *      target="_top">AWS API Documentation</a>
     */
    ListLensReviewsResult listLensReviews(ListLensReviewsRequest listLensReviewsRequest);

    /**
     * <p>
     * List the lens shares associated with the lens.
     * </p>
     * 
     * @param listLensSharesRequest
     * @return Result of the ListLensShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLensShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS
     *      API Documentation</a>
     */
    ListLensSharesResult listLensShares(ListLensSharesRequest listLensSharesRequest);

    /**
     * <p>
     * List the available lenses.
     * </p>
     * 
     * @param listLensesRequest
     *        Input to list lenses.
     * @return Result of the ListLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLenses" target="_top">AWS API
     *      Documentation</a>
     */
    ListLensesResult listLenses(ListLensesRequest listLensesRequest);

    /**
     * <p>
     * List all milestones for an existing workload.
     * </p>
     * 
     * @param listMilestonesRequest
     *        Input to list all milestones for a workload.
     * @return Result of the ListMilestones operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListMilestones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListMilestones" target="_top">AWS
     *      API Documentation</a>
     */
    ListMilestonesResult listMilestones(ListMilestonesRequest listMilestonesRequest);

    /**
     * <p>
     * List lens notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotificationsResult listNotifications(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * List the workload invitations.
     * </p>
     * 
     * @param listShareInvitationsRequest
     *        Input for List Share Invitations
     * @return Result of the ListShareInvitations operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    ListShareInvitationsResult listShareInvitations(ListShareInvitationsRequest listShareInvitationsRequest);

    /**
     * <p>
     * List the tags for a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be either a workload ARN or a custom lens ARN.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the workload shares associated with the workload.
     * </p>
     * 
     * @param listWorkloadSharesRequest
     *        Input for List Workload Share
     * @return Result of the ListWorkloadShares operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListWorkloadShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloadShares"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkloadSharesResult listWorkloadShares(ListWorkloadSharesRequest listWorkloadSharesRequest);

    /**
     * <p>
     * List workloads. Paginated.
     * </p>
     * 
     * @param listWorkloadsRequest
     *        Input to list all workloads.
     * @return Result of the ListWorkloads operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    ListWorkloadsResult listWorkloads(ListWorkloadsRequest listWorkloadsRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be either a workload ARN or a custom lens ARN.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be either a workload ARN or a custom lens ARN.
     * </p>
     * </note>
     * <p>
     * To specify multiple tags, use separate <b>tagKeys</b> parameters, for example:
     * </p>
     * <p>
     * <code>DELETE /tags/WorkloadArn?tagKeys=key1&amp;tagKeys=key2</code>
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @sample AWSWellArchitected.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update the answer to a specific question in a workload review.
     * </p>
     * 
     * @param updateAnswerRequest
     *        Input to update answer.
     * @return Result of the UpdateAnswer operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateAnswer" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAnswerResult updateAnswer(UpdateAnswerRequest updateAnswerRequest);

    /**
     * <p>
     * Updates whether the Amazon Web Services account is opted into organization sharing features.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * <p>
     * Update lens review.
     * </p>
     * 
     * @param updateLensReviewRequest
     *        Input for update lens review.
     * @return Result of the UpdateLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLensReviewResult updateLensReview(UpdateLensReviewRequest updateLensReviewRequest);

    /**
     * <p>
     * Update a workload or custom lens share invitation.
     * </p>
     * <note>
     * <p>
     * This API operation can be called independently of any resource. Previous documentation implied that a workload
     * ARN must be specified.
     * </p>
     * </note>
     * 
     * @param updateShareInvitationRequest
     *        Input for Update Share Invitation
     * @return Result of the UpdateShareInvitation operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateShareInvitationResult updateShareInvitation(UpdateShareInvitationRequest updateShareInvitationRequest);

    /**
     * <p>
     * Update an existing workload.
     * </p>
     * 
     * @param updateWorkloadRequest
     *        Input to update a workload.
     * @return Result of the UpdateWorkload operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWorkloadResult updateWorkload(UpdateWorkloadRequest updateWorkloadRequest);

    /**
     * <p>
     * Update a workload share.
     * </p>
     * 
     * @param updateWorkloadShareRequest
     *        Input for Update Workload Share
     * @return Result of the UpdateWorkloadShare operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpdateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkloadShareResult updateWorkloadShare(UpdateWorkloadShareRequest updateWorkloadShareRequest);

    /**
     * <p>
     * Upgrade lens review.
     * </p>
     * 
     * @param upgradeLensReviewRequest
     * @return Result of the UpgradeLensReview operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource was not found.
     * @throws ConflictException
     *         The resource already exists.
     * @throws InternalServerException
     *         There is a problem with the Well-Architected Tool API service.
     * @throws AccessDeniedException
     *         User does not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @sample AWSWellArchitected.UpgradeLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    UpgradeLensReviewResult upgradeLensReview(UpgradeLensReviewRequest upgradeLensReviewRequest);

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
