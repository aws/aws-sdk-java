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
package com.amazonaws.services.resiliencehub;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;

/**
 * Interface for accessing AWS Resilience Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resiliencehub.AbstractAWSResilienceHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Resilience Hub helps you proactively prepare and protect your Amazon Web Services applications from disruptions.
 * Resilience Hub offers continuous resiliency assessment and validation that integrates into your software development
 * lifecycle. This enables you to uncover resiliency weaknesses, ensure recovery time objective (RTO) and recovery point
 * objective (RPO) targets for your applications are met, and resolve issues before they are released into production.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResilienceHubAsync extends AWSResilienceHub {

    /**
     * <p>
     * Adds the resource mapping for the draft application version.
     * </p>
     * 
     * @param addDraftAppVersionResourceMappingsRequest
     * @return A Java Future containing the result of the AddDraftAppVersionResourceMappings operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.AddDraftAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AddDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            AddDraftAppVersionResourceMappingsRequest addDraftAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Adds the resource mapping for the draft application version.
     * </p>
     * 
     * @param addDraftAppVersionResourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddDraftAppVersionResourceMappings operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.AddDraftAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AddDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddDraftAppVersionResourceMappingsResult> addDraftAppVersionResourceMappingsAsync(
            AddDraftAppVersionResourceMappingsRequest addDraftAppVersionResourceMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<AddDraftAppVersionResourceMappingsRequest, AddDraftAppVersionResourceMappingsResult> asyncHandler);

    /**
     * <p>
     * Creates a Resilience Hub application. A Resilience Hub application is a collection of Amazon Web Services
     * resources structured to prevent and recover Amazon Web Services application disruptions. To describe a Resilience
     * Hub application, you provide an application name, resources from one or more–up to five–CloudFormation stacks,
     * and an appropriate resiliency policy.
     * </p>
     * <p>
     * After you create a Resilience Hub application, you publish it so that you can run a resiliency assessment on it.
     * You can then use recommendations from the assessment to improve resiliency by running another assessment,
     * comparing results, and then iterating the process until you achieve your goals for recovery time objective (RTO)
     * and recovery point objective (RPO).
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSResilienceHubAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates a Resilience Hub application. A Resilience Hub application is a collection of Amazon Web Services
     * resources structured to prevent and recover Amazon Web Services application disruptions. To describe a Resilience
     * Hub application, you provide an application name, resources from one or more–up to five–CloudFormation stacks,
     * and an appropriate resiliency policy.
     * </p>
     * <p>
     * After you create a Resilience Hub application, you publish it so that you can run a resiliency assessment on it.
     * You can then use recommendations from the assessment to improve resiliency by running another assessment,
     * comparing results, and then iterating the process until you achieve your goals for recovery time objective (RTO)
     * and recovery point objective (RPO).
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Creates a new recommendation template.
     * </p>
     * 
     * @param createRecommendationTemplateRequest
     * @return A Java Future containing the result of the CreateRecommendationTemplate operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.CreateRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(
            CreateRecommendationTemplateRequest createRecommendationTemplateRequest);

    /**
     * <p>
     * Creates a new recommendation template.
     * </p>
     * 
     * @param createRecommendationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecommendationTemplate operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.CreateRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommendationTemplateResult> createRecommendationTemplateAsync(
            CreateRecommendationTemplateRequest createRecommendationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecommendationTemplateRequest, CreateRecommendationTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a resiliency policy for an application.
     * </p>
     * 
     * @param createResiliencyPolicyRequest
     * @return A Java Future containing the result of the CreateResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsync.CreateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(CreateResiliencyPolicyRequest createResiliencyPolicyRequest);

    /**
     * <p>
     * Creates a resiliency policy for an application.
     * </p>
     * 
     * @param createResiliencyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.CreateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResiliencyPolicyResult> createResiliencyPolicyAsync(CreateResiliencyPolicyRequest createResiliencyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResiliencyPolicyRequest, CreateResiliencyPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Resilience Hub application. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSResilienceHubAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes an AWS Resilience Hub application. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Resilience Hub application assessment. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppAssessmentRequest
     * @return A Java Future containing the result of the DeleteAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsync.DeleteAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(DeleteAppAssessmentRequest deleteAppAssessmentRequest);

    /**
     * <p>
     * Deletes an AWS Resilience Hub application assessment. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DeleteAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppAssessmentResult> deleteAppAssessmentAsync(DeleteAppAssessmentRequest deleteAppAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppAssessmentRequest, DeleteAppAssessmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a recommendation template. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteRecommendationTemplateRequest
     * @return A Java Future containing the result of the DeleteRecommendationTemplate operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.DeleteRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(
            DeleteRecommendationTemplateRequest deleteRecommendationTemplateRequest);

    /**
     * <p>
     * Deletes a recommendation template. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteRecommendationTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecommendationTemplate operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.DeleteRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommendationTemplateResult> deleteRecommendationTemplateAsync(
            DeleteRecommendationTemplateRequest deleteRecommendationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommendationTemplateRequest, DeleteRecommendationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a resiliency policy. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteResiliencyPolicyRequest
     * @return A Java Future containing the result of the DeleteResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsync.DeleteResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(DeleteResiliencyPolicyRequest deleteResiliencyPolicyRequest);

    /**
     * <p>
     * Deletes a resiliency policy. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteResiliencyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DeleteResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResiliencyPolicyResult> deleteResiliencyPolicyAsync(DeleteResiliencyPolicyRequest deleteResiliencyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResiliencyPolicyRequest, DeleteResiliencyPolicyResult> asyncHandler);

    /**
     * <p>
     * Describes an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppRequest
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Describes an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler);

    /**
     * <p>
     * Describes an assessment for an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppAssessmentRequest
     * @return A Java Future containing the result of the DescribeAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(DescribeAppAssessmentRequest describeAppAssessmentRequest);

    /**
     * <p>
     * Describes an assessment for an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppAssessmentResult> describeAppAssessmentAsync(DescribeAppAssessmentRequest describeAppAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppAssessmentRequest, DescribeAppAssessmentResult> asyncHandler);

    /**
     * <p>
     * Returns the resolution status for the specified resolution identifier for an application version. If
     * <code>resolutionId</code> is not specified, the current resolution status is returned.
     * </p>
     * 
     * @param describeAppVersionResourcesResolutionStatusRequest
     * @return A Java Future containing the result of the DescribeAppVersionResourcesResolutionStatus operation returned
     *         by the service.
     * @sample AWSResilienceHubAsync.DescribeAppVersionResourcesResolutionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResourcesResolutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            DescribeAppVersionResourcesResolutionStatusRequest describeAppVersionResourcesResolutionStatusRequest);

    /**
     * <p>
     * Returns the resolution status for the specified resolution identifier for an application version. If
     * <code>resolutionId</code> is not specified, the current resolution status is returned.
     * </p>
     * 
     * @param describeAppVersionResourcesResolutionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppVersionResourcesResolutionStatus operation returned
     *         by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppVersionResourcesResolutionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResourcesResolutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResourcesResolutionStatusResult> describeAppVersionResourcesResolutionStatusAsync(
            DescribeAppVersionResourcesResolutionStatusRequest describeAppVersionResourcesResolutionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionResourcesResolutionStatusRequest, DescribeAppVersionResourcesResolutionStatusResult> asyncHandler);

    /**
     * <p>
     * Describes details about an AWS Resilience Hub
     * </p>
     * 
     * @param describeAppVersionTemplateRequest
     * @return A Java Future containing the result of the DescribeAppVersionTemplate operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(
            DescribeAppVersionTemplateRequest describeAppVersionTemplateRequest);

    /**
     * <p>
     * Describes details about an AWS Resilience Hub
     * </p>
     * 
     * @param describeAppVersionTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppVersionTemplate operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionTemplateResult> describeAppVersionTemplateAsync(
            DescribeAppVersionTemplateRequest describeAppVersionTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionTemplateRequest, DescribeAppVersionTemplateResult> asyncHandler);

    /**
     * <p>
     * Describes the status of importing resources to an application version.
     * </p>
     * 
     * @param describeDraftAppVersionResourcesImportStatusRequest
     * @return A Java Future containing the result of the DescribeDraftAppVersionResourcesImportStatus operation
     *         returned by the service.
     * @sample AWSResilienceHubAsync.DescribeDraftAppVersionResourcesImportStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeDraftAppVersionResourcesImportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            DescribeDraftAppVersionResourcesImportStatusRequest describeDraftAppVersionResourcesImportStatusRequest);

    /**
     * <p>
     * Describes the status of importing resources to an application version.
     * </p>
     * 
     * @param describeDraftAppVersionResourcesImportStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDraftAppVersionResourcesImportStatus operation
     *         returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeDraftAppVersionResourcesImportStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeDraftAppVersionResourcesImportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDraftAppVersionResourcesImportStatusResult> describeDraftAppVersionResourcesImportStatusAsync(
            DescribeDraftAppVersionResourcesImportStatusRequest describeDraftAppVersionResourcesImportStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDraftAppVersionResourcesImportStatusRequest, DescribeDraftAppVersionResourcesImportStatusResult> asyncHandler);

    /**
     * <p>
     * Describes a specified resiliency policy for an AWS Resilience Hub application. The returned policy object
     * includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and
     * more.
     * </p>
     * 
     * @param describeResiliencyPolicyRequest
     * @return A Java Future containing the result of the DescribeResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(DescribeResiliencyPolicyRequest describeResiliencyPolicyRequest);

    /**
     * <p>
     * Describes a specified resiliency policy for an AWS Resilience Hub application. The returned policy object
     * includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and
     * more.
     * </p>
     * 
     * @param describeResiliencyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResiliencyPolicyResult> describeResiliencyPolicyAsync(DescribeResiliencyPolicyRequest describeResiliencyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResiliencyPolicyRequest, DescribeResiliencyPolicyResult> asyncHandler);

    /**
     * <p>
     * Imports resources from sources such as a CloudFormation stack, resource-groups, or application registry app to a
     * draft application version.
     * </p>
     * 
     * @param importResourcesToDraftAppVersionRequest
     * @return A Java Future containing the result of the ImportResourcesToDraftAppVersion operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ImportResourcesToDraftAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ImportResourcesToDraftAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            ImportResourcesToDraftAppVersionRequest importResourcesToDraftAppVersionRequest);

    /**
     * <p>
     * Imports resources from sources such as a CloudFormation stack, resource-groups, or application registry app to a
     * draft application version.
     * </p>
     * 
     * @param importResourcesToDraftAppVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportResourcesToDraftAppVersion operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ImportResourcesToDraftAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ImportResourcesToDraftAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportResourcesToDraftAppVersionResult> importResourcesToDraftAppVersionAsync(
            ImportResourcesToDraftAppVersionRequest importResourcesToDraftAppVersionRequest,
            com.amazonaws.handlers.AsyncHandler<ImportResourcesToDraftAppVersionRequest, ImportResourcesToDraftAppVersionResult> asyncHandler);

    /**
     * <p>
     * Lists the alarm recommendations for a AWS Resilience Hub application.
     * </p>
     * 
     * @param listAlarmRecommendationsRequest
     * @return A Java Future containing the result of the ListAlarmRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAlarmRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAlarmRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(ListAlarmRecommendationsRequest listAlarmRecommendationsRequest);

    /**
     * <p>
     * Lists the alarm recommendations for a AWS Resilience Hub application.
     * </p>
     * 
     * @param listAlarmRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlarmRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAlarmRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAlarmRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmRecommendationsResult> listAlarmRecommendationsAsync(ListAlarmRecommendationsRequest listAlarmRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlarmRecommendationsRequest, ListAlarmRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Lists the assessments for an AWS Resilience Hub application. You can use request parameters to refine the results
     * for the response object.
     * </p>
     * 
     * @param listAppAssessmentsRequest
     * @return A Java Future containing the result of the ListAppAssessments operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(ListAppAssessmentsRequest listAppAssessmentsRequest);

    /**
     * <p>
     * Lists the assessments for an AWS Resilience Hub application. You can use request parameters to refine the results
     * for the response object.
     * </p>
     * 
     * @param listAppAssessmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppAssessments operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentsResult> listAppAssessmentsAsync(ListAppAssessmentsRequest listAppAssessmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentsRequest, ListAppAssessmentsResult> asyncHandler);

    /**
     * <p>
     * Lists the compliances for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentCompliancesRequest
     * @return A Java Future containing the result of the ListAppComponentCompliances operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppComponentCompliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentCompliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(
            ListAppComponentCompliancesRequest listAppComponentCompliancesRequest);

    /**
     * <p>
     * Lists the compliances for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentCompliancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppComponentCompliances operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppComponentCompliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentCompliances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppComponentCompliancesResult> listAppComponentCompliancesAsync(
            ListAppComponentCompliancesRequest listAppComponentCompliancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppComponentCompliancesRequest, ListAppComponentCompliancesResult> asyncHandler);

    /**
     * <p>
     * Lists the recommendations for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentRecommendationsRequest
     * @return A Java Future containing the result of the ListAppComponentRecommendations operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListAppComponentRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            ListAppComponentRecommendationsRequest listAppComponentRecommendationsRequest);

    /**
     * <p>
     * Lists the recommendations for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppComponentRecommendations operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListAppComponentRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppComponentRecommendationsResult> listAppComponentRecommendationsAsync(
            ListAppComponentRecommendationsRequest listAppComponentRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppComponentRecommendationsRequest, ListAppComponentRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource
     * identifiers, CloudFormation stacks, resource-groups, or an application registry app.
     * </p>
     * 
     * @param listAppVersionResourceMappingsRequest
     * @return A Java Future containing the result of the ListAppVersionResourceMappings operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(
            ListAppVersionResourceMappingsRequest listAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource
     * identifiers, CloudFormation stacks, resource-groups, or an application registry app.
     * </p>
     * 
     * @param listAppVersionResourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppVersionResourceMappings operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionResourceMappingsResult> listAppVersionResourceMappingsAsync(
            ListAppVersionResourceMappingsRequest listAppVersionResourceMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionResourceMappingsRequest, ListAppVersionResourceMappingsResult> asyncHandler);

    /**
     * <p>
     * Lists all the resources in an application version.
     * </p>
     * 
     * @param listAppVersionResourcesRequest
     * @return A Java Future containing the result of the ListAppVersionResources operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(ListAppVersionResourcesRequest listAppVersionResourcesRequest);

    /**
     * <p>
     * Lists all the resources in an application version.
     * </p>
     * 
     * @param listAppVersionResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppVersionResources operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionResourcesResult> listAppVersionResourcesAsync(ListAppVersionResourcesRequest listAppVersionResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionResourcesRequest, ListAppVersionResourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the different versions for the Resilience Hub applications.
     * </p>
     * 
     * @param listAppVersionsRequest
     * @return A Java Future containing the result of the ListAppVersions operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(ListAppVersionsRequest listAppVersionsRequest);

    /**
     * <p>
     * Lists the different versions for the Resilience Hub applications.
     * </p>
     * 
     * @param listAppVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppVersions operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionsResult> listAppVersionsAsync(ListAppVersionsRequest listAppVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionsRequest, ListAppVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists your Resilience Hub applications.
     * </p>
     * 
     * @param listAppsRequest
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSResilienceHubAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists your Resilience Hub applications.
     * </p>
     * 
     * @param listAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler);

    /**
     * <p>
     * Lists the recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param listRecommendationTemplatesRequest
     * @return A Java Future containing the result of the ListRecommendationTemplates operation returned by the service.
     * @sample AWSResilienceHubAsync.ListRecommendationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(
            ListRecommendationTemplatesRequest listRecommendationTemplatesRequest);

    /**
     * <p>
     * Lists the recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param listRecommendationTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendationTemplates operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListRecommendationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationTemplatesResult> listRecommendationTemplatesAsync(
            ListRecommendationTemplatesRequest listRecommendationTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationTemplatesRequest, ListRecommendationTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists the resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listResiliencyPoliciesRequest
     * @return A Java Future containing the result of the ListResiliencyPolicies operation returned by the service.
     * @sample AWSResilienceHubAsync.ListResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(ListResiliencyPoliciesRequest listResiliencyPoliciesRequest);

    /**
     * <p>
     * Lists the resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listResiliencyPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResiliencyPolicies operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResiliencyPoliciesResult> listResiliencyPoliciesAsync(ListResiliencyPoliciesRequest listResiliencyPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResiliencyPoliciesRequest, ListResiliencyPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
     * </p>
     * 
     * @param listSopRecommendationsRequest
     * @return A Java Future containing the result of the ListSopRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsync.ListSopRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSopRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(ListSopRecommendationsRequest listSopRecommendationsRequest);

    /**
     * <p>
     * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
     * </p>
     * 
     * @param listSopRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSopRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListSopRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSopRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSopRecommendationsResult> listSopRecommendationsAsync(ListSopRecommendationsRequest listSopRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSopRecommendationsRequest, ListSopRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Lists the suggested resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listSuggestedResiliencyPoliciesRequest
     * @return A Java Future containing the result of the ListSuggestedResiliencyPolicies operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListSuggestedResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSuggestedResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            ListSuggestedResiliencyPoliciesRequest listSuggestedResiliencyPoliciesRequest);

    /**
     * <p>
     * Lists the suggested resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listSuggestedResiliencyPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuggestedResiliencyPolicies operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListSuggestedResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSuggestedResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuggestedResiliencyPoliciesResult> listSuggestedResiliencyPoliciesAsync(
            ListSuggestedResiliencyPoliciesRequest listSuggestedResiliencyPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuggestedResiliencyPoliciesRequest, ListSuggestedResiliencyPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for your resources in your Resilience Hub applications.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSResilienceHubAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for your resources in your Resilience Hub applications.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param listTestRecommendationsRequest
     * @return A Java Future containing the result of the ListTestRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsync.ListTestRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTestRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(ListTestRecommendationsRequest listTestRecommendationsRequest);

    /**
     * <p>
     * Lists the test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param listTestRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestRecommendations operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListTestRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTestRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestRecommendationsResult> listTestRecommendationsAsync(ListTestRecommendationsRequest listTestRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestRecommendationsRequest, ListTestRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Lists the resources that are not currently supported in AWS Resilience Hub. An unsupported resource is a resource
     * that exists in the object that was used to create an app, but is not supported by Resilience Hub.
     * </p>
     * 
     * @param listUnsupportedAppVersionResourcesRequest
     * @return A Java Future containing the result of the ListUnsupportedAppVersionResources operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListUnsupportedAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListUnsupportedAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            ListUnsupportedAppVersionResourcesRequest listUnsupportedAppVersionResourcesRequest);

    /**
     * <p>
     * Lists the resources that are not currently supported in AWS Resilience Hub. An unsupported resource is a resource
     * that exists in the object that was used to create an app, but is not supported by Resilience Hub.
     * </p>
     * 
     * @param listUnsupportedAppVersionResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUnsupportedAppVersionResources operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListUnsupportedAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListUnsupportedAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUnsupportedAppVersionResourcesResult> listUnsupportedAppVersionResourcesAsync(
            ListUnsupportedAppVersionResourcesRequest listUnsupportedAppVersionResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUnsupportedAppVersionResourcesRequest, ListUnsupportedAppVersionResourcesResult> asyncHandler);

    /**
     * <p>
     * Publishes a new version of a specific Resilience Hub application.
     * </p>
     * 
     * @param publishAppVersionRequest
     * @return A Java Future containing the result of the PublishAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsync.PublishAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PublishAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(PublishAppVersionRequest publishAppVersionRequest);

    /**
     * <p>
     * Publishes a new version of a specific Resilience Hub application.
     * </p>
     * 
     * @param publishAppVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.PublishAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PublishAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PublishAppVersionResult> publishAppVersionAsync(PublishAppVersionRequest publishAppVersionRequest,
            com.amazonaws.handlers.AsyncHandler<PublishAppVersionRequest, PublishAppVersionResult> asyncHandler);

    /**
     * <p>
     * Adds or updates the app template for a draft version of a Resilience Hub app.
     * </p>
     * 
     * @param putDraftAppVersionTemplateRequest
     * @return A Java Future containing the result of the PutDraftAppVersionTemplate operation returned by the service.
     * @sample AWSResilienceHubAsync.PutDraftAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PutDraftAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(
            PutDraftAppVersionTemplateRequest putDraftAppVersionTemplateRequest);

    /**
     * <p>
     * Adds or updates the app template for a draft version of a Resilience Hub app.
     * </p>
     * 
     * @param putDraftAppVersionTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDraftAppVersionTemplate operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.PutDraftAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PutDraftAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDraftAppVersionTemplateResult> putDraftAppVersionTemplateAsync(
            PutDraftAppVersionTemplateRequest putDraftAppVersionTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<PutDraftAppVersionTemplateRequest, PutDraftAppVersionTemplateResult> asyncHandler);

    /**
     * <p>
     * Removes resource mappings from a draft application version.
     * </p>
     * 
     * @param removeDraftAppVersionResourceMappingsRequest
     * @return A Java Future containing the result of the RemoveDraftAppVersionResourceMappings operation returned by
     *         the service.
     * @sample AWSResilienceHubAsync.RemoveDraftAppVersionResourceMappings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RemoveDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            RemoveDraftAppVersionResourceMappingsRequest removeDraftAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Removes resource mappings from a draft application version.
     * </p>
     * 
     * @param removeDraftAppVersionResourceMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveDraftAppVersionResourceMappings operation returned by
     *         the service.
     * @sample AWSResilienceHubAsyncHandler.RemoveDraftAppVersionResourceMappings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RemoveDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveDraftAppVersionResourceMappingsResult> removeDraftAppVersionResourceMappingsAsync(
            RemoveDraftAppVersionResourceMappingsRequest removeDraftAppVersionResourceMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveDraftAppVersionResourceMappingsRequest, RemoveDraftAppVersionResourceMappingsResult> asyncHandler);

    /**
     * <p>
     * Resolves the resources for an application version.
     * </p>
     * 
     * @param resolveAppVersionResourcesRequest
     * @return A Java Future containing the result of the ResolveAppVersionResources operation returned by the service.
     * @sample AWSResilienceHubAsync.ResolveAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResolveAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(
            ResolveAppVersionResourcesRequest resolveAppVersionResourcesRequest);

    /**
     * <p>
     * Resolves the resources for an application version.
     * </p>
     * 
     * @param resolveAppVersionResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveAppVersionResources operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ResolveAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResolveAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResolveAppVersionResourcesResult> resolveAppVersionResourcesAsync(
            ResolveAppVersionResourcesRequest resolveAppVersionResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveAppVersionResourcesRequest, ResolveAppVersionResourcesResult> asyncHandler);

    /**
     * <p>
     * Creates a new application assessment for an application.
     * </p>
     * 
     * @param startAppAssessmentRequest
     * @return A Java Future containing the result of the StartAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsync.StartAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/StartAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(StartAppAssessmentRequest startAppAssessmentRequest);

    /**
     * <p>
     * Creates a new application assessment for an application.
     * </p>
     * 
     * @param startAppAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAppAssessment operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.StartAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/StartAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAppAssessmentResult> startAppAssessmentAsync(StartAppAssessmentRequest startAppAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<StartAppAssessmentRequest, StartAppAssessmentResult> asyncHandler);

    /**
     * <p>
     * Applies one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSResilienceHubAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSResilienceHubAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSResilienceHubAsync.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler);

    /**
     * <p>
     * Updates a resiliency policy.
     * </p>
     * 
     * @param updateResiliencyPolicyRequest
     * @return A Java Future containing the result of the UpdateResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsync.UpdateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(UpdateResiliencyPolicyRequest updateResiliencyPolicyRequest);

    /**
     * <p>
     * Updates a resiliency policy.
     * </p>
     * 
     * @param updateResiliencyPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResiliencyPolicy operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.UpdateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResiliencyPolicyResult> updateResiliencyPolicyAsync(UpdateResiliencyPolicyRequest updateResiliencyPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResiliencyPolicyRequest, UpdateResiliencyPolicyResult> asyncHandler);

}
