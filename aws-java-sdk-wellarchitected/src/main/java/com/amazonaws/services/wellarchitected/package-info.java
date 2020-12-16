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

/**
 * <fullname>AWS Well-Architected Tool</fullname>
 * <p>
 * This is the <i>AWS Well-Architected Tool API Reference</i>.
 * </p>
 * <p>
 * The AWS Well-Architected Tool API provides programmatic access to the <a
 * href="http://aws.amazon.com/well-architected-tool">AWS Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">AWS Management Console</a>.
 * </p>
 * <p>
 * <b>Managing workloads:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateWorkload</a>: Define a new workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListWorkloads</a>: List workloads.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetWorkload</a>: Get the properties of a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateWorkload</a>: Update the properties of a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteWorkload</a>: Delete a workload.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Managing milestones:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateMilestone</a>: Create a milestone.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListMilestones</a>: List milestones.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetMilestone</a>: Get the properties of a milestone.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Managing lenses:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListLenses</a>: List the available lenses.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AssociateLenses</a>: Add one or more lenses to a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisassociateLenses</a>: Remove one or more lenses from a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListNotifications</a>: List lens notifications for a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLensVersionDifference</a>: Get the differences between the version of a lens used in a workload and the latest
 * version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpgradeLensReview</a>: Upgrade a workload to use the latest version of a lens.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Managing reviews:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListLensReviews</a>: List reviews associated with a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLensReview</a>: Get pillar and risk data associated with a workload review.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLensReviewReport</a>: Get the report associated with a workload review.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateLensReview</a>: Update the notes associated with a workload review.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAnswers</a>: List the questions and answers in a workload review.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAnswer</a>: Update the answer to a specific question in a workload review.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListLensReviewImprovements</a>: List the improvement plan associated with a workload review.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Managing workload shares:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListWorkloadShares</a>: List the workload shares associated with a workload.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateWorkloadShare</a>: Create a workload share.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateWorkloadShare</a>: Update a workload share.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteWorkloadShare</a>: Delete a workload share.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Managing workload share invitations:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListShareInvitations</a>: List workload share invitations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateShareInvitation</a>: Update a workload share invitation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about the AWS Well-Architected Tool, see the <a
 * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">AWS Well-Architected Tool User
 * Guide</a>.
 * </p>
 */
package com.amazonaws.services.wellarchitected;

