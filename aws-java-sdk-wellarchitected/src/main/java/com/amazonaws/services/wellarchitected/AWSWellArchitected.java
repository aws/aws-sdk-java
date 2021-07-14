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
 * <fullname>AWS Well-Architected Tool</fullname>
 * <p>
 * This is the <i>AWS Well-Architected Tool API Reference</i>. The AWS Well-Architected Tool API provides programmatic
 * access to the <a href="http://aws.amazon.com/well-architected-tool">AWS Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">AWS Management Console</a>. For information about the AWS
 * Well-Architected Tool, see the <a href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">AWS
 * Well-Architected Tool User Guide</a>.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * The owner of a workload can share the workload with other AWS accounts and IAM users in the same AWS Region. Only
     * the owner of a workload can delete it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/define-workload.html">Defining a Workload</a>
     * in the <i>AWS Well-Architected Tool User Guide</i>.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * The owner of a workload can share it with other AWS accounts and IAM users in the same AWS Region. Shared access
     * to a workload is not removed until the workload invitation is deleted.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/workloads-sharing.html">Sharing a Workload</a>
     * in the <i>AWS Well-Architected Tool User Guide</i>.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * <note>
     * <p>
     * The AWS Well-Architected Framework lens (<code>wellarchitected</code>) cannot be removed from a workload.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * List of answers.
     * </p>
     * 
     * @param listAnswersRequest
     *        Input to list answers.
     * @return Result of the ListAnswers operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * List lens review improvements.
     * </p>
     * 
     * @param listLensReviewImprovementsRequest
     *        Input to list lens review improvements.
     * @return Result of the ListLensReviewImprovements operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * List the available lenses.
     * </p>
     * 
     * @param listLensesRequest
     *        Input to list lenses.
     * @return Result of the ListLenses operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     * Update a workload invitation.
     * </p>
     * 
     * @param updateShareInvitationRequest
     *        Input for Update Share Invitation
     * @return Result of the UpdateShareInvitation operation returned by the service.
     * @throws ValidationException
     *         The user input is not valid.
     * @throws InternalServerException
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
     *         There is a problem with the AWS Well-Architected Tool API service.
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
