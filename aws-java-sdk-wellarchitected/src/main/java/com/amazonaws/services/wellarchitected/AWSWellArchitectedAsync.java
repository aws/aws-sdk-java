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
package com.amazonaws.services.wellarchitected;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;

/**
 * Interface for accessing Well-Architected asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.wellarchitected.AbstractAWSWellArchitectedAsync} instead.
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
public interface AWSWellArchitectedAsync extends AWSWellArchitected {

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
     * @return A Java Future containing the result of the AssociateLenses operation returned by the service.
     * @sample AWSWellArchitectedAsync.AssociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(AssociateLensesRequest associateLensesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLenses operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.AssociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(AssociateLensesRequest associateLensesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLensesRequest, AssociateLensesResult> asyncHandler);

    /**
     * <p>
     * Associate a profile with a workload.
     * </p>
     * 
     * @param associateProfilesRequest
     * @return A Java Future containing the result of the AssociateProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsync.AssociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProfilesResult> associateProfilesAsync(AssociateProfilesRequest associateProfilesRequest);

    /**
     * <p>
     * Associate a profile with a workload.
     * </p>
     * 
     * @param associateProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.AssociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AssociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProfilesResult> associateProfilesAsync(AssociateProfilesRequest associateProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProfilesRequest, AssociateProfilesResult> asyncHandler);

    /**
     * <p>
     * Create a lens share.
     * </p>
     * <p>
     * The owner of a lens can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region. Lenses provided by Amazon Web Services (Amazon
     * Web Services Official Content) cannot be shared.
     * </p>
     * <p>
     * Shared access to a lens is not removed until the lens invitation is deleted.
     * </p>
     * <p>
     * If you share a lens with an organization or OU, all accounts in the organization or OU are granted access to the
     * lens.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-sharing.html">Sharing a custom lens</a>
     * in the <i>Well-Architected Tool User Guide</i>.
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
     * @return A Java Future containing the result of the CreateLensShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLensShareResult> createLensShareAsync(CreateLensShareRequest createLensShareRequest);

    /**
     * <p>
     * Create a lens share.
     * </p>
     * <p>
     * The owner of a lens can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region. Lenses provided by Amazon Web Services (Amazon
     * Web Services Official Content) cannot be shared.
     * </p>
     * <p>
     * Shared access to a lens is not removed until the lens invitation is deleted.
     * </p>
     * <p>
     * If you share a lens with an organization or OU, all accounts in the organization or OU are granted access to the
     * lens.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-sharing.html">Sharing a custom lens</a>
     * in the <i>Well-Architected Tool User Guide</i>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLensShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLensShareResult> createLensShareAsync(CreateLensShareRequest createLensShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLensShareRequest, CreateLensShareResult> asyncHandler);

    /**
     * <p>
     * Create a new lens version.
     * </p>
     * <p>
     * A lens can have up to 100 versions.
     * </p>
     * <p>
     * Use this operation to publish a new lens version after you have imported a lens. The <code>LensAlias</code> is
     * used to identify the lens to be published. The owner of a lens can share the lens with other Amazon Web Services
     * accounts and users in the same Amazon Web Services Region. Only the owner of a lens can delete it.
     * </p>
     * 
     * @param createLensVersionRequest
     * @return A Java Future containing the result of the CreateLensVersion operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateLensVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLensVersionResult> createLensVersionAsync(CreateLensVersionRequest createLensVersionRequest);

    /**
     * <p>
     * Create a new lens version.
     * </p>
     * <p>
     * A lens can have up to 100 versions.
     * </p>
     * <p>
     * Use this operation to publish a new lens version after you have imported a lens. The <code>LensAlias</code> is
     * used to identify the lens to be published. The owner of a lens can share the lens with other Amazon Web Services
     * accounts and users in the same Amazon Web Services Region. Only the owner of a lens can delete it.
     * </p>
     * 
     * @param createLensVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLensVersion operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateLensVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateLensVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLensVersionResult> createLensVersionAsync(CreateLensVersionRequest createLensVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLensVersionRequest, CreateLensVersionResult> asyncHandler);

    /**
     * <p>
     * Create a milestone for an existing workload.
     * </p>
     * 
     * @param createMilestoneRequest
     *        Input for milestone creation.
     * @return A Java Future containing the result of the CreateMilestone operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateMilestone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(CreateMilestoneRequest createMilestoneRequest);

    /**
     * <p>
     * Create a milestone for an existing workload.
     * </p>
     * 
     * @param createMilestoneRequest
     *        Input for milestone creation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMilestone operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateMilestone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(CreateMilestoneRequest createMilestoneRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMilestoneRequest, CreateMilestoneResult> asyncHandler);

    /**
     * <p>
     * Create a profile.
     * </p>
     * 
     * @param createProfileRequest
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest);

    /**
     * <p>
     * Create a profile.
     * </p>
     * 
     * @param createProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfile operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest createProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler);

    /**
     * <p>
     * Create a profile share.
     * </p>
     * 
     * @param createProfileShareRequest
     * @return A Java Future containing the result of the CreateProfileShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileShareResult> createProfileShareAsync(CreateProfileShareRequest createProfileShareRequest);

    /**
     * <p>
     * Create a profile share.
     * </p>
     * 
     * @param createProfileShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfileShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileShareResult> createProfileShareAsync(CreateProfileShareRequest createProfileShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileShareRequest, CreateProfileShareResult> asyncHandler);

    /**
     * <p>
     * Create a review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your review templates. If your review template or those shared with you and used in your account do
     * include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with
     * applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param createReviewTemplateRequest
     * @return A Java Future containing the result of the CreateReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReviewTemplateResult> createReviewTemplateAsync(CreateReviewTemplateRequest createReviewTemplateRequest);

    /**
     * <p>
     * Create a review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * Do not include or gather personal identifiable information (PII) of end users or other identifiable individuals
     * in or via your review templates. If your review template or those shared with you and used in your account do
     * include or collect PII you are responsible for: ensuring that the included PII is processed in accordance with
     * applicable law, providing adequate privacy notices, and obtaining necessary consents for processing such data.
     * </p>
     * </note>
     * 
     * @param createReviewTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReviewTemplateResult> createReviewTemplateAsync(CreateReviewTemplateRequest createReviewTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReviewTemplateRequest, CreateReviewTemplateResult> asyncHandler);

    /**
     * <p>
     * Create a review template share.
     * </p>
     * <p>
     * The owner of a review template can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region.
     * </p>
     * <p>
     * Shared access to a review template is not removed until the review template share invitation is deleted.
     * </p>
     * <p>
     * If you share a review template with an organization or OU, all accounts in the organization or OU are granted
     * access to the review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your review template with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your review template available to those other accounts.
     * </p>
     * </note>
     * 
     * @param createTemplateShareRequest
     * @return A Java Future containing the result of the CreateTemplateShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateShareResult> createTemplateShareAsync(CreateTemplateShareRequest createTemplateShareRequest);

    /**
     * <p>
     * Create a review template share.
     * </p>
     * <p>
     * The owner of a review template can share it with other Amazon Web Services accounts, users, an organization, and
     * organizational units (OUs) in the same Amazon Web Services Region.
     * </p>
     * <p>
     * Shared access to a review template is not removed until the review template share invitation is deleted.
     * </p>
     * <p>
     * If you share a review template with an organization or OU, all accounts in the organization or OU are granted
     * access to the review template.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your review template with other Amazon Web Services accounts, you acknowledge that Amazon Web Services
     * will make your review template available to those other accounts.
     * </p>
     * </note>
     * 
     * @param createTemplateShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplateShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateShareResult> createTemplateShareAsync(CreateTemplateShareRequest createTemplateShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateShareRequest, CreateTemplateShareResult> asyncHandler);

    /**
     * <p>
     * Create a new workload.
     * </p>
     * <p>
     * The owner of a workload can share the workload with other Amazon Web Services accounts, users, an organization,
     * and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload can delete
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/define-workload.html">Defining a Workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Either <code>AwsRegions</code>, <code>NonAwsRegions</code>, or both must be specified when creating a workload.
     * </p>
     * <p>
     * You also must specify <code>ReviewOwner</code>, even though the parameter is listed as not being required in the
     * following section.
     * </p>
     * </important>
     * <p>
     * When creating a workload using a review template, you must have the following IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateAnswer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:ListReviewTemplateAnswers</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateLensReview</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createWorkloadRequest
     *        Input for workload creation.
     * @return A Java Future containing the result of the CreateWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(CreateWorkloadRequest createWorkloadRequest);

    /**
     * <p>
     * Create a new workload.
     * </p>
     * <p>
     * The owner of a workload can share the workload with other Amazon Web Services accounts, users, an organization,
     * and organizational units (OUs) in the same Amazon Web Services Region. Only the owner of a workload can delete
     * it.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/define-workload.html">Defining a Workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * <important>
     * <p>
     * Either <code>AwsRegions</code>, <code>NonAwsRegions</code>, or both must be specified when creating a workload.
     * </p>
     * <p>
     * You also must specify <code>ReviewOwner</code>, even though the parameter is listed as not being required in the
     * following section.
     * </p>
     * </important>
     * <p>
     * When creating a workload using a review template, you must have the following IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateAnswer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:ListReviewTemplateAnswers</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>wellarchitected:GetReviewTemplateLensReview</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createWorkloadRequest
     *        Input for workload creation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(CreateWorkloadRequest createWorkloadRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkloadRequest, CreateWorkloadResult> asyncHandler);

    /**
     * <p>
     * Create a workload share.
     * </p>
     * <p>
     * The owner of a workload can share it with other Amazon Web Services accounts and users in the same Amazon Web
     * Services Region. Shared access to a workload is not removed until the workload invitation is deleted.
     * </p>
     * <p>
     * If you share a workload with an organization or OU, all accounts in the organization or OU are granted access to
     * the workload.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/workloads-sharing.html">Sharing a workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * 
     * @param createWorkloadShareRequest
     *        Input for Create Workload Share
     * @return A Java Future containing the result of the CreateWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.CreateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(CreateWorkloadShareRequest createWorkloadShareRequest);

    /**
     * <p>
     * Create a workload share.
     * </p>
     * <p>
     * The owner of a workload can share it with other Amazon Web Services accounts and users in the same Amazon Web
     * Services Region. Shared access to a workload is not removed until the workload invitation is deleted.
     * </p>
     * <p>
     * If you share a workload with an organization or OU, all accounts in the organization or OU are granted access to
     * the workload.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/workloads-sharing.html">Sharing a workload</a>
     * in the <i>Well-Architected Tool User Guide</i>.
     * </p>
     * 
     * @param createWorkloadShareRequest
     *        Input for Create Workload Share
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.CreateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(CreateWorkloadShareRequest createWorkloadShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkloadShareRequest, CreateWorkloadShareResult> asyncHandler);

    /**
     * <p>
     * Delete an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and users that
     * you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.
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
     * @return A Java Future containing the result of the DeleteLens operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLensResult> deleteLensAsync(DeleteLensRequest deleteLensRequest);

    /**
     * <p>
     * Delete an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can delete it. After the lens is deleted, Amazon Web Services accounts and users that
     * you shared the lens with can continue to use it, but they will no longer be able to apply it to new workloads.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLens operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLensResult> deleteLensAsync(DeleteLensRequest deleteLensRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLensRequest, DeleteLensResult> asyncHandler);

    /**
     * <p>
     * Delete a lens share.
     * </p>
     * <p>
     * After the lens share is deleted, Amazon Web Services accounts, users, organizations, and organizational units
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
     * @return A Java Future containing the result of the DeleteLensShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLensShareResult> deleteLensShareAsync(DeleteLensShareRequest deleteLensShareRequest);

    /**
     * <p>
     * Delete a lens share.
     * </p>
     * <p>
     * After the lens share is deleted, Amazon Web Services accounts, users, organizations, and organizational units
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLensShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteLensShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLensShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLensShareResult> deleteLensShareAsync(DeleteLensShareRequest deleteLensShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLensShareRequest, DeleteLensShareResult> asyncHandler);

    /**
     * <p>
     * Delete a profile.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your profile with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will
     * make your profile available to those other accounts. Those other accounts may continue to access and use your
     * shared profile even if you delete the profile from your own Amazon Web Services account or terminate your Amazon
     * Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteProfileRequest
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest);

    /**
     * <p>
     * Delete a profile.
     * </p>
     * <note>
     * <p>
     * <b>Disclaimer</b>
     * </p>
     * <p>
     * By sharing your profile with other Amazon Web Services accounts, you acknowledge that Amazon Web Services will
     * make your profile available to those other accounts. Those other accounts may continue to access and use your
     * shared profile even if you delete the profile from your own Amazon Web Services account or terminate your Amazon
     * Web Services account.
     * </p>
     * </note>
     * 
     * @param deleteProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfile operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest deleteProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler);

    /**
     * <p>
     * Delete a profile share.
     * </p>
     * 
     * @param deleteProfileShareRequest
     * @return A Java Future containing the result of the DeleteProfileShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileShareResult> deleteProfileShareAsync(DeleteProfileShareRequest deleteProfileShareRequest);

    /**
     * <p>
     * Delete a profile share.
     * </p>
     * 
     * @param deleteProfileShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProfileShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteProfileShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfileShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProfileShareResult> deleteProfileShareAsync(DeleteProfileShareRequest deleteProfileShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProfileShareRequest, DeleteProfileShareResult> asyncHandler);

    /**
     * <p>
     * Delete a review template.
     * </p>
     * <p>
     * Only the owner of a review template can delete it.
     * </p>
     * <p>
     * After the review template is deleted, Amazon Web Services accounts, users, organizations, and organizational
     * units (OUs) that you shared the review template with will no longer be able to apply it to new workloads.
     * </p>
     * 
     * @param deleteReviewTemplateRequest
     * @return A Java Future containing the result of the DeleteReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReviewTemplateResult> deleteReviewTemplateAsync(DeleteReviewTemplateRequest deleteReviewTemplateRequest);

    /**
     * <p>
     * Delete a review template.
     * </p>
     * <p>
     * Only the owner of a review template can delete it.
     * </p>
     * <p>
     * After the review template is deleted, Amazon Web Services accounts, users, organizations, and organizational
     * units (OUs) that you shared the review template with will no longer be able to apply it to new workloads.
     * </p>
     * 
     * @param deleteReviewTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReviewTemplateResult> deleteReviewTemplateAsync(DeleteReviewTemplateRequest deleteReviewTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReviewTemplateRequest, DeleteReviewTemplateResult> asyncHandler);

    /**
     * <p>
     * Delete a review template share.
     * </p>
     * <p>
     * After the review template share is deleted, Amazon Web Services accounts, users, organizations, and
     * organizational units (OUs) that you shared the review template with will no longer be able to apply it to new
     * workloads.
     * </p>
     * 
     * @param deleteTemplateShareRequest
     * @return A Java Future containing the result of the DeleteTemplateShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateShareResult> deleteTemplateShareAsync(DeleteTemplateShareRequest deleteTemplateShareRequest);

    /**
     * <p>
     * Delete a review template share.
     * </p>
     * <p>
     * After the review template share is deleted, Amazon Web Services accounts, users, organizations, and
     * organizational units (OUs) that you shared the review template with will no longer be able to apply it to new
     * workloads.
     * </p>
     * 
     * @param deleteTemplateShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplateShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteTemplateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteTemplateShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateShareResult> deleteTemplateShareAsync(DeleteTemplateShareRequest deleteTemplateShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateShareRequest, DeleteTemplateShareResult> asyncHandler);

    /**
     * <p>
     * Delete an existing workload.
     * </p>
     * 
     * @param deleteWorkloadRequest
     *        Input for workload deletion.
     * @return A Java Future containing the result of the DeleteWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(DeleteWorkloadRequest deleteWorkloadRequest);

    /**
     * <p>
     * Delete an existing workload.
     * </p>
     * 
     * @param deleteWorkloadRequest
     *        Input for workload deletion.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(DeleteWorkloadRequest deleteWorkloadRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkloadRequest, DeleteWorkloadResult> asyncHandler);

    /**
     * <p>
     * Delete a workload share.
     * </p>
     * 
     * @param deleteWorkloadShareRequest
     *        Input for Delete Workload Share
     * @return A Java Future containing the result of the DeleteWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.DeleteWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(DeleteWorkloadShareRequest deleteWorkloadShareRequest);

    /**
     * <p>
     * Delete a workload share.
     * </p>
     * 
     * @param deleteWorkloadShareRequest
     *        Input for Delete Workload Share
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DeleteWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(DeleteWorkloadShareRequest deleteWorkloadShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkloadShareRequest, DeleteWorkloadShareResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateLenses operation returned by the service.
     * @sample AWSWellArchitectedAsync.DisassociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(DisassociateLensesRequest disassociateLensesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLenses operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DisassociateLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateLenses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(DisassociateLensesRequest disassociateLensesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLensesRequest, DisassociateLensesResult> asyncHandler);

    /**
     * <p>
     * Disassociate a profile from a workload.
     * </p>
     * 
     * @param disassociateProfilesRequest
     * @return A Java Future containing the result of the DisassociateProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsync.DisassociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProfilesResult> disassociateProfilesAsync(DisassociateProfilesRequest disassociateProfilesRequest);

    /**
     * <p>
     * Disassociate a profile from a workload.
     * </p>
     * 
     * @param disassociateProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.DisassociateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DisassociateProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateProfilesResult> disassociateProfilesAsync(DisassociateProfilesRequest disassociateProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateProfilesRequest, DisassociateProfilesResult> asyncHandler);

    /**
     * <p>
     * Export an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can export it. Lenses provided by Amazon Web Services (Amazon Web Services Official
     * Content) cannot be exported.
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>.
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
     * @return A Java Future containing the result of the ExportLens operation returned by the service.
     * @sample AWSWellArchitectedAsync.ExportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportLensResult> exportLensAsync(ExportLensRequest exportLensRequest);

    /**
     * <p>
     * Export an existing lens.
     * </p>
     * <p>
     * Only the owner of a lens can export it. Lenses provided by Amazon Web Services (Amazon Web Services Official
     * Content) cannot be exported.
     * </p>
     * <p>
     * Lenses are defined in JSON. For more information, see <a
     * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/lenses-format-specification.html">JSON format
     * specification</a> in the <i>Well-Architected Tool User Guide</i>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportLens operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ExportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ExportLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportLensResult> exportLensAsync(ExportLensRequest exportLensRequest,
            com.amazonaws.handlers.AsyncHandler<ExportLensRequest, ExportLensResult> asyncHandler);

    /**
     * <p>
     * Get the answer to a specific question in a workload review.
     * </p>
     * 
     * @param getAnswerRequest
     *        Input to get answer.
     * @return A Java Future containing the result of the GetAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(GetAnswerRequest getAnswerRequest);

    /**
     * <p>
     * Get the answer to a specific question in a workload review.
     * </p>
     * 
     * @param getAnswerRequest
     *        Input to get answer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(GetAnswerRequest getAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnswerRequest, GetAnswerResult> asyncHandler);

    /**
     * <p>
     * Get a consolidated report of your workloads.
     * </p>
     * <p>
     * You can optionally choose to include workloads that have been shared with you.
     * </p>
     * 
     * @param getConsolidatedReportRequest
     * @return A Java Future containing the result of the GetConsolidatedReport operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetConsolidatedReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetConsolidatedReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConsolidatedReportResult> getConsolidatedReportAsync(GetConsolidatedReportRequest getConsolidatedReportRequest);

    /**
     * <p>
     * Get a consolidated report of your workloads.
     * </p>
     * <p>
     * You can optionally choose to include workloads that have been shared with you.
     * </p>
     * 
     * @param getConsolidatedReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConsolidatedReport operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetConsolidatedReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetConsolidatedReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConsolidatedReportResult> getConsolidatedReportAsync(GetConsolidatedReportRequest getConsolidatedReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetConsolidatedReportRequest, GetConsolidatedReportResult> asyncHandler);

    /**
     * <p>
     * Global settings for all workloads.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * <p>
     * Global settings for all workloads.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler);

    /**
     * <p>
     * Get an existing lens.
     * </p>
     * 
     * @param getLensRequest
     * @return A Java Future containing the result of the GetLens operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLensResult> getLensAsync(GetLensRequest getLensRequest);

    /**
     * <p>
     * Get an existing lens.
     * </p>
     * 
     * @param getLensRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLens operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLensResult> getLensAsync(GetLensRequest getLensRequest,
            com.amazonaws.handlers.AsyncHandler<GetLensRequest, GetLensResult> asyncHandler);

    /**
     * <p>
     * Get lens review.
     * </p>
     * 
     * @param getLensReviewRequest
     *        Input to get lens review.
     * @return A Java Future containing the result of the GetLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReview" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(GetLensReviewRequest getLensReviewRequest);

    /**
     * <p>
     * Get lens review.
     * </p>
     * 
     * @param getLensReviewRequest
     *        Input to get lens review.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReview" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(GetLensReviewRequest getLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<GetLensReviewRequest, GetLensReviewResult> asyncHandler);

    /**
     * <p>
     * Get lens review report.
     * </p>
     * 
     * @param getLensReviewReportRequest
     *        Input to get lens review report.
     * @return A Java Future containing the result of the GetLensReviewReport operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetLensReviewReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReviewReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(GetLensReviewReportRequest getLensReviewReportRequest);

    /**
     * <p>
     * Get lens review report.
     * </p>
     * 
     * @param getLensReviewReportRequest
     *        Input to get lens review report.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLensReviewReport operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetLensReviewReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReviewReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(GetLensReviewReportRequest getLensReviewReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetLensReviewReportRequest, GetLensReviewReportResult> asyncHandler);

    /**
     * <p>
     * Get lens version differences.
     * </p>
     * 
     * @param getLensVersionDifferenceRequest
     * @return A Java Future containing the result of the GetLensVersionDifference operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetLensVersionDifference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(GetLensVersionDifferenceRequest getLensVersionDifferenceRequest);

    /**
     * <p>
     * Get lens version differences.
     * </p>
     * 
     * @param getLensVersionDifferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLensVersionDifference operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetLensVersionDifference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensVersionDifference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(GetLensVersionDifferenceRequest getLensVersionDifferenceRequest,
            com.amazonaws.handlers.AsyncHandler<GetLensVersionDifferenceRequest, GetLensVersionDifferenceResult> asyncHandler);

    /**
     * <p>
     * Get a milestone for an existing workload.
     * </p>
     * 
     * @param getMilestoneRequest
     *        Input to get a milestone.
     * @return A Java Future containing the result of the GetMilestone operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetMilestone" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(GetMilestoneRequest getMilestoneRequest);

    /**
     * <p>
     * Get a milestone for an existing workload.
     * </p>
     * 
     * @param getMilestoneRequest
     *        Input to get a milestone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMilestone operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetMilestone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetMilestone" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(GetMilestoneRequest getMilestoneRequest,
            com.amazonaws.handlers.AsyncHandler<GetMilestoneRequest, GetMilestoneResult> asyncHandler);

    /**
     * <p>
     * Get profile information.
     * </p>
     * 
     * @param getProfileRequest
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest);

    /**
     * <p>
     * Get profile information.
     * </p>
     * 
     * @param getProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfile operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest getProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler);

    /**
     * <p>
     * Get profile template.
     * </p>
     * 
     * @param getProfileTemplateRequest
     * @return A Java Future containing the result of the GetProfileTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetProfileTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfileTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileTemplateResult> getProfileTemplateAsync(GetProfileTemplateRequest getProfileTemplateRequest);

    /**
     * <p>
     * Get profile template.
     * </p>
     * 
     * @param getProfileTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProfileTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetProfileTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetProfileTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetProfileTemplateResult> getProfileTemplateAsync(GetProfileTemplateRequest getProfileTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetProfileTemplateRequest, GetProfileTemplateResult> asyncHandler);

    /**
     * <p>
     * Get review template.
     * </p>
     * 
     * @param getReviewTemplateRequest
     * @return A Java Future containing the result of the GetReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateResult> getReviewTemplateAsync(GetReviewTemplateRequest getReviewTemplateRequest);

    /**
     * <p>
     * Get review template.
     * </p>
     * 
     * @param getReviewTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateResult> getReviewTemplateAsync(GetReviewTemplateRequest getReviewTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetReviewTemplateRequest, GetReviewTemplateResult> asyncHandler);

    /**
     * <p>
     * Get review template answer.
     * </p>
     * 
     * @param getReviewTemplateAnswerRequest
     * @return A Java Future containing the result of the GetReviewTemplateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateAnswerResult> getReviewTemplateAnswerAsync(GetReviewTemplateAnswerRequest getReviewTemplateAnswerRequest);

    /**
     * <p>
     * Get review template answer.
     * </p>
     * 
     * @param getReviewTemplateAnswerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReviewTemplateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateAnswerResult> getReviewTemplateAnswerAsync(GetReviewTemplateAnswerRequest getReviewTemplateAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<GetReviewTemplateAnswerRequest, GetReviewTemplateAnswerResult> asyncHandler);

    /**
     * <p>
     * Get a lens review associated with a review template.
     * </p>
     * 
     * @param getReviewTemplateLensReviewRequest
     * @return A Java Future containing the result of the GetReviewTemplateLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateLensReviewResult> getReviewTemplateLensReviewAsync(
            GetReviewTemplateLensReviewRequest getReviewTemplateLensReviewRequest);

    /**
     * <p>
     * Get a lens review associated with a review template.
     * </p>
     * 
     * @param getReviewTemplateLensReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReviewTemplateLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReviewTemplateLensReviewResult> getReviewTemplateLensReviewAsync(
            GetReviewTemplateLensReviewRequest getReviewTemplateLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<GetReviewTemplateLensReviewRequest, GetReviewTemplateLensReviewResult> asyncHandler);

    /**
     * <p>
     * Get an existing workload.
     * </p>
     * 
     * @param getWorkloadRequest
     *        Input to get a workload.
     * @return A Java Future containing the result of the GetWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsync.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest getWorkloadRequest);

    /**
     * <p>
     * Get an existing workload.
     * </p>
     * 
     * @param getWorkloadRequest
     *        Input to get a workload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest getWorkloadRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler);

    /**
     * <p>
     * Import a new custom lens or update an existing custom lens.
     * </p>
     * <p>
     * To update an existing custom lens, specify its ARN as the <code>LensAlias</code>. If no ARN is specified, a new
     * custom lens is created.
     * </p>
     * <p>
     * The new or updated lens will have a status of <code>DRAFT</code>. The lens cannot be applied to workloads or
     * shared with other Amazon Web Services accounts until it's published with <a>CreateLensVersion</a>.
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
     * @return A Java Future containing the result of the ImportLens operation returned by the service.
     * @sample AWSWellArchitectedAsync.ImportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImportLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportLensResult> importLensAsync(ImportLensRequest importLensRequest);

    /**
     * <p>
     * Import a new custom lens or update an existing custom lens.
     * </p>
     * <p>
     * To update an existing custom lens, specify its ARN as the <code>LensAlias</code>. If no ARN is specified, a new
     * custom lens is created.
     * </p>
     * <p>
     * The new or updated lens will have a status of <code>DRAFT</code>. The lens cannot be applied to workloads or
     * shared with other Amazon Web Services accounts until it's published with <a>CreateLensVersion</a>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportLens operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ImportLens
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImportLens" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportLensResult> importLensAsync(ImportLensRequest importLensRequest,
            com.amazonaws.handlers.AsyncHandler<ImportLensRequest, ImportLensResult> asyncHandler);

    /**
     * <p>
     * List of answers for a particular workload and lens.
     * </p>
     * 
     * @param listAnswersRequest
     *        Input to list answers.
     * @return A Java Future containing the result of the ListAnswers operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListAnswers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(ListAnswersRequest listAnswersRequest);

    /**
     * <p>
     * List of answers for a particular workload and lens.
     * </p>
     * 
     * @param listAnswersRequest
     *        Input to list answers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnswers operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListAnswers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(ListAnswersRequest listAnswersRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnswersRequest, ListAnswersResult> asyncHandler);

    /**
     * <p>
     * List of Trusted Advisor check details by account related to the workload.
     * </p>
     * 
     * @param listCheckDetailsRequest
     * @return A Java Future containing the result of the ListCheckDetails operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListCheckDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCheckDetailsResult> listCheckDetailsAsync(ListCheckDetailsRequest listCheckDetailsRequest);

    /**
     * <p>
     * List of Trusted Advisor check details by account related to the workload.
     * </p>
     * 
     * @param listCheckDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCheckDetails operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListCheckDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCheckDetailsResult> listCheckDetailsAsync(ListCheckDetailsRequest listCheckDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCheckDetailsRequest, ListCheckDetailsResult> asyncHandler);

    /**
     * <p>
     * List of Trusted Advisor checks summarized for all accounts related to the workload.
     * </p>
     * 
     * @param listCheckSummariesRequest
     * @return A Java Future containing the result of the ListCheckSummaries operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCheckSummariesResult> listCheckSummariesAsync(ListCheckSummariesRequest listCheckSummariesRequest);

    /**
     * <p>
     * List of Trusted Advisor checks summarized for all accounts related to the workload.
     * </p>
     * 
     * @param listCheckSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCheckSummaries operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCheckSummariesResult> listCheckSummariesAsync(ListCheckSummariesRequest listCheckSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCheckSummariesRequest, ListCheckSummariesResult> asyncHandler);

    /**
     * <p>
     * List the improvements of a particular lens review.
     * </p>
     * 
     * @param listLensReviewImprovementsRequest
     *        Input to list lens review improvements.
     * @return A Java Future containing the result of the ListLensReviewImprovements operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListLensReviewImprovements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviewImprovements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(
            ListLensReviewImprovementsRequest listLensReviewImprovementsRequest);

    /**
     * <p>
     * List the improvements of a particular lens review.
     * </p>
     * 
     * @param listLensReviewImprovementsRequest
     *        Input to list lens review improvements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLensReviewImprovements operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListLensReviewImprovements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviewImprovements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(
            ListLensReviewImprovementsRequest listLensReviewImprovementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLensReviewImprovementsRequest, ListLensReviewImprovementsResult> asyncHandler);

    /**
     * <p>
     * List lens reviews for a particular workload.
     * </p>
     * 
     * @param listLensReviewsRequest
     *        Input to list lens reviews.
     * @return A Java Future containing the result of the ListLensReviews operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListLensReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviews"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(ListLensReviewsRequest listLensReviewsRequest);

    /**
     * <p>
     * List lens reviews for a particular workload.
     * </p>
     * 
     * @param listLensReviewsRequest
     *        Input to list lens reviews.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLensReviews operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListLensReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensReviews"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(ListLensReviewsRequest listLensReviewsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLensReviewsRequest, ListLensReviewsResult> asyncHandler);

    /**
     * <p>
     * List the lens shares associated with the lens.
     * </p>
     * 
     * @param listLensSharesRequest
     * @return A Java Future containing the result of the ListLensShares operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListLensShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLensSharesResult> listLensSharesAsync(ListLensSharesRequest listLensSharesRequest);

    /**
     * <p>
     * List the lens shares associated with the lens.
     * </p>
     * 
     * @param listLensSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLensShares operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListLensShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLensShares" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLensSharesResult> listLensSharesAsync(ListLensSharesRequest listLensSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLensSharesRequest, ListLensSharesResult> asyncHandler);

    /**
     * <p>
     * List the available lenses.
     * </p>
     * 
     * @param listLensesRequest
     *        Input to list lenses.
     * @return A Java Future containing the result of the ListLenses operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLenses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLensesResult> listLensesAsync(ListLensesRequest listLensesRequest);

    /**
     * <p>
     * List the available lenses.
     * </p>
     * 
     * @param listLensesRequest
     *        Input to list lenses.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLenses operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListLenses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListLenses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLensesResult> listLensesAsync(ListLensesRequest listLensesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLensesRequest, ListLensesResult> asyncHandler);

    /**
     * <p>
     * List all milestones for an existing workload.
     * </p>
     * 
     * @param listMilestonesRequest
     *        Input to list all milestones for a workload.
     * @return A Java Future containing the result of the ListMilestones operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListMilestones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListMilestones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(ListMilestonesRequest listMilestonesRequest);

    /**
     * <p>
     * List all milestones for an existing workload.
     * </p>
     * 
     * @param listMilestonesRequest
     *        Input to list all milestones for a workload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMilestones operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListMilestones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListMilestones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(ListMilestonesRequest listMilestonesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMilestonesRequest, ListMilestonesResult> asyncHandler);

    /**
     * <p>
     * List lens notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest);

    /**
     * <p>
     * List lens notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotifications operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest listNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler);

    /**
     * <p>
     * List profile notifications.
     * </p>
     * 
     * @param listProfileNotificationsRequest
     * @return A Java Future containing the result of the ListProfileNotifications operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListProfileNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileNotificationsResult> listProfileNotificationsAsync(ListProfileNotificationsRequest listProfileNotificationsRequest);

    /**
     * <p>
     * List profile notifications.
     * </p>
     * 
     * @param listProfileNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileNotifications operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListProfileNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileNotificationsResult> listProfileNotificationsAsync(ListProfileNotificationsRequest listProfileNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileNotificationsRequest, ListProfileNotificationsResult> asyncHandler);

    /**
     * <p>
     * List profile shares.
     * </p>
     * 
     * @param listProfileSharesRequest
     * @return A Java Future containing the result of the ListProfileShares operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListProfileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileSharesResult> listProfileSharesAsync(ListProfileSharesRequest listProfileSharesRequest);

    /**
     * <p>
     * List profile shares.
     * </p>
     * 
     * @param listProfileSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfileShares operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListProfileShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfileShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProfileSharesResult> listProfileSharesAsync(ListProfileSharesRequest listProfileSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfileSharesRequest, ListProfileSharesResult> asyncHandler);

    /**
     * <p>
     * List profiles.
     * </p>
     * 
     * @param listProfilesRequest
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest);

    /**
     * <p>
     * List profiles.
     * </p>
     * 
     * @param listProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProfiles operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest listProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler);

    /**
     * <p>
     * List the answers of a review template.
     * </p>
     * 
     * @param listReviewTemplateAnswersRequest
     * @return A Java Future containing the result of the ListReviewTemplateAnswers operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListReviewTemplateAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplateAnswers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReviewTemplateAnswersResult> listReviewTemplateAnswersAsync(
            ListReviewTemplateAnswersRequest listReviewTemplateAnswersRequest);

    /**
     * <p>
     * List the answers of a review template.
     * </p>
     * 
     * @param listReviewTemplateAnswersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReviewTemplateAnswers operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListReviewTemplateAnswers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplateAnswers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReviewTemplateAnswersResult> listReviewTemplateAnswersAsync(
            ListReviewTemplateAnswersRequest listReviewTemplateAnswersRequest,
            com.amazonaws.handlers.AsyncHandler<ListReviewTemplateAnswersRequest, ListReviewTemplateAnswersResult> asyncHandler);

    /**
     * <p>
     * List review templates.
     * </p>
     * 
     * @param listReviewTemplatesRequest
     * @return A Java Future containing the result of the ListReviewTemplates operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListReviewTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReviewTemplatesResult> listReviewTemplatesAsync(ListReviewTemplatesRequest listReviewTemplatesRequest);

    /**
     * <p>
     * List review templates.
     * </p>
     * 
     * @param listReviewTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReviewTemplates operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListReviewTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListReviewTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReviewTemplatesResult> listReviewTemplatesAsync(ListReviewTemplatesRequest listReviewTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListReviewTemplatesRequest, ListReviewTemplatesResult> asyncHandler);

    /**
     * <p>
     * List the share invitations.
     * </p>
     * <p>
     * <code>WorkloadNamePrefix</code>, <code>LensNamePrefix</code>, <code>ProfileNamePrefix</code>, and
     * <code>TemplateNamePrefix</code> are mutually exclusive. Use the parameter that matches your
     * <code>ShareResourceType</code>.
     * </p>
     * 
     * @param listShareInvitationsRequest
     *        Input for List Share Invitations
     * @return A Java Future containing the result of the ListShareInvitations operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(ListShareInvitationsRequest listShareInvitationsRequest);

    /**
     * <p>
     * List the share invitations.
     * </p>
     * <p>
     * <code>WorkloadNamePrefix</code>, <code>LensNamePrefix</code>, <code>ProfileNamePrefix</code>, and
     * <code>TemplateNamePrefix</code> are mutually exclusive. Use the parameter that matches your
     * <code>ShareResourceType</code>.
     * </p>
     * 
     * @param listShareInvitationsRequest
     *        Input for List Share Invitations
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListShareInvitations operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListShareInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListShareInvitations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(ListShareInvitationsRequest listShareInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListShareInvitationsRequest, ListShareInvitationsResult> asyncHandler);

    /**
     * <p>
     * List the tags for a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * List review template shares.
     * </p>
     * 
     * @param listTemplateSharesRequest
     * @return A Java Future containing the result of the ListTemplateShares operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListTemplateShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTemplateShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateSharesResult> listTemplateSharesAsync(ListTemplateSharesRequest listTemplateSharesRequest);

    /**
     * <p>
     * List review template shares.
     * </p>
     * 
     * @param listTemplateSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateShares operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListTemplateShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListTemplateShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateSharesResult> listTemplateSharesAsync(ListTemplateSharesRequest listTemplateSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateSharesRequest, ListTemplateSharesResult> asyncHandler);

    /**
     * <p>
     * List the workload shares associated with the workload.
     * </p>
     * 
     * @param listWorkloadSharesRequest
     *        Input for List Workload Share
     * @return A Java Future containing the result of the ListWorkloadShares operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListWorkloadShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloadShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(ListWorkloadSharesRequest listWorkloadSharesRequest);

    /**
     * <p>
     * List the workload shares associated with the workload.
     * </p>
     * 
     * @param listWorkloadSharesRequest
     *        Input for List Workload Share
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkloadShares operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListWorkloadShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloadShares"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(ListWorkloadSharesRequest listWorkloadSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadSharesRequest, ListWorkloadSharesResult> asyncHandler);

    /**
     * <p>
     * Paginated list of workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     *        Input to list all workloads.
     * @return A Java Future containing the result of the ListWorkloads operation returned by the service.
     * @sample AWSWellArchitectedAsync.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest listWorkloadsRequest);

    /**
     * <p>
     * Paginated list of workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     *        Input to list all workloads.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkloads operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest listWorkloadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWellArchitectedAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
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
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWellArchitectedAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * <note>
     * <p>
     * The WorkloadArn parameter can be a workload ARN, a custom lens ARN, a profile ARN, or review template ARN.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update the answer to a specific question in a workload review.
     * </p>
     * 
     * @param updateAnswerRequest
     *        Input to update answer.
     * @return A Java Future containing the result of the UpdateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateAnswer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(UpdateAnswerRequest updateAnswerRequest);

    /**
     * <p>
     * Update the answer to a specific question in a workload review.
     * </p>
     * 
     * @param updateAnswerRequest
     *        Input to update answer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateAnswer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(UpdateAnswerRequest updateAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnswerRequest, UpdateAnswerResult> asyncHandler);

    /**
     * <p>
     * Update whether the Amazon Web Services account is opted into organization sharing and discovery integration
     * features.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * <p>
     * Update whether the Amazon Web Services account is opted into organization sharing and discovery integration
     * features.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateGlobalSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler);

    /**
     * <p>
     * Update integration features.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest);

    /**
     * <p>
     * Update integration features.
     * </p>
     * 
     * @param updateIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntegration operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest updateIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler);

    /**
     * <p>
     * Update lens review for a particular workload.
     * </p>
     * 
     * @param updateLensReviewRequest
     *        Input for update lens review.
     * @return A Java Future containing the result of the UpdateLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(UpdateLensReviewRequest updateLensReviewRequest);

    /**
     * <p>
     * Update lens review for a particular workload.
     * </p>
     * 
     * @param updateLensReviewRequest
     *        Input for update lens review.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(UpdateLensReviewRequest updateLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLensReviewRequest, UpdateLensReviewResult> asyncHandler);

    /**
     * <p>
     * Update a profile.
     * </p>
     * 
     * @param updateProfileRequest
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest);

    /**
     * <p>
     * Update a profile.
     * </p>
     * 
     * @param updateProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfile operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest updateProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler);

    /**
     * <p>
     * Update a review template.
     * </p>
     * 
     * @param updateReviewTemplateRequest
     * @return A Java Future containing the result of the UpdateReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateResult> updateReviewTemplateAsync(UpdateReviewTemplateRequest updateReviewTemplateRequest);

    /**
     * <p>
     * Update a review template.
     * </p>
     * 
     * @param updateReviewTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReviewTemplate operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateReviewTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateResult> updateReviewTemplateAsync(UpdateReviewTemplateRequest updateReviewTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateRequest, UpdateReviewTemplateResult> asyncHandler);

    /**
     * <p>
     * Update a review template answer.
     * </p>
     * 
     * @param updateReviewTemplateAnswerRequest
     * @return A Java Future containing the result of the UpdateReviewTemplateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateAnswerResult> updateReviewTemplateAnswerAsync(
            UpdateReviewTemplateAnswerRequest updateReviewTemplateAnswerRequest);

    /**
     * <p>
     * Update a review template answer.
     * </p>
     * 
     * @param updateReviewTemplateAnswerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReviewTemplateAnswer operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateReviewTemplateAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateAnswer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateAnswerResult> updateReviewTemplateAnswerAsync(
            UpdateReviewTemplateAnswerRequest updateReviewTemplateAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateAnswerRequest, UpdateReviewTemplateAnswerResult> asyncHandler);

    /**
     * <p>
     * Update a lens review associated with a review template.
     * </p>
     * 
     * @param updateReviewTemplateLensReviewRequest
     * @return A Java Future containing the result of the UpdateReviewTemplateLensReview operation returned by the
     *         service.
     * @sample AWSWellArchitectedAsync.UpdateReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateLensReviewResult> updateReviewTemplateLensReviewAsync(
            UpdateReviewTemplateLensReviewRequest updateReviewTemplateLensReviewRequest);

    /**
     * <p>
     * Update a lens review associated with a review template.
     * </p>
     * 
     * @param updateReviewTemplateLensReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReviewTemplateLensReview operation returned by the
     *         service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReviewTemplateLensReviewResult> updateReviewTemplateLensReviewAsync(
            UpdateReviewTemplateLensReviewRequest updateReviewTemplateLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateLensReviewRequest, UpdateReviewTemplateLensReviewResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateShareInvitation operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(UpdateShareInvitationRequest updateShareInvitationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateShareInvitation operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateShareInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateShareInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(UpdateShareInvitationRequest updateShareInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateShareInvitationRequest, UpdateShareInvitationResult> asyncHandler);

    /**
     * <p>
     * Update an existing workload.
     * </p>
     * 
     * @param updateWorkloadRequest
     *        Input to update a workload.
     * @return A Java Future containing the result of the UpdateWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(UpdateWorkloadRequest updateWorkloadRequest);

    /**
     * <p>
     * Update an existing workload.
     * </p>
     * 
     * @param updateWorkloadRequest
     *        Input to update a workload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkload operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkload" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(UpdateWorkloadRequest updateWorkloadRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkloadRequest, UpdateWorkloadResult> asyncHandler);

    /**
     * <p>
     * Update a workload share.
     * </p>
     * 
     * @param updateWorkloadShareRequest
     *        Input for Update Workload Share
     * @return A Java Future containing the result of the UpdateWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpdateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(UpdateWorkloadShareRequest updateWorkloadShareRequest);

    /**
     * <p>
     * Update a workload share.
     * </p>
     * 
     * @param updateWorkloadShareRequest
     *        Input for Update Workload Share
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkloadShare operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpdateWorkloadShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkloadShare"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(UpdateWorkloadShareRequest updateWorkloadShareRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkloadShareRequest, UpdateWorkloadShareResult> asyncHandler);

    /**
     * <p>
     * Upgrade lens review for a particular workload.
     * </p>
     * 
     * @param upgradeLensReviewRequest
     * @return A Java Future containing the result of the UpgradeLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpgradeLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(UpgradeLensReviewRequest upgradeLensReviewRequest);

    /**
     * <p>
     * Upgrade lens review for a particular workload.
     * </p>
     * 
     * @param upgradeLensReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeLensReview operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpgradeLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(UpgradeLensReviewRequest upgradeLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeLensReviewRequest, UpgradeLensReviewResult> asyncHandler);

    /**
     * <p>
     * Upgrade a profile.
     * </p>
     * 
     * @param upgradeProfileVersionRequest
     * @return A Java Future containing the result of the UpgradeProfileVersion operation returned by the service.
     * @sample AWSWellArchitectedAsync.UpgradeProfileVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeProfileVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeProfileVersionResult> upgradeProfileVersionAsync(UpgradeProfileVersionRequest upgradeProfileVersionRequest);

    /**
     * <p>
     * Upgrade a profile.
     * </p>
     * 
     * @param upgradeProfileVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeProfileVersion operation returned by the service.
     * @sample AWSWellArchitectedAsyncHandler.UpgradeProfileVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeProfileVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeProfileVersionResult> upgradeProfileVersionAsync(UpgradeProfileVersionRequest upgradeProfileVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeProfileVersionRequest, UpgradeProfileVersionResult> asyncHandler);

    /**
     * <p>
     * Upgrade the lens review of a review template.
     * </p>
     * 
     * @param upgradeReviewTemplateLensReviewRequest
     * @return A Java Future containing the result of the UpgradeReviewTemplateLensReview operation returned by the
     *         service.
     * @sample AWSWellArchitectedAsync.UpgradeReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeReviewTemplateLensReviewResult> upgradeReviewTemplateLensReviewAsync(
            UpgradeReviewTemplateLensReviewRequest upgradeReviewTemplateLensReviewRequest);

    /**
     * <p>
     * Upgrade the lens review of a review template.
     * </p>
     * 
     * @param upgradeReviewTemplateLensReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeReviewTemplateLensReview operation returned by the
     *         service.
     * @sample AWSWellArchitectedAsyncHandler.UpgradeReviewTemplateLensReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpgradeReviewTemplateLensReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeReviewTemplateLensReviewResult> upgradeReviewTemplateLensReviewAsync(
            UpgradeReviewTemplateLensReviewRequest upgradeReviewTemplateLensReviewRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeReviewTemplateLensReviewRequest, UpgradeReviewTemplateLensReviewResult> asyncHandler);

}
