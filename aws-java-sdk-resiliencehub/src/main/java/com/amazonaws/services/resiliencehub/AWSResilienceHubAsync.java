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
 * Resilience Hub helps you proactively prepare and protect your Amazon Web Services applications from disruptions. It
 * offers continual resiliency assessment and validation that integrates into your software development lifecycle. This
 * enables you to uncover resiliency weaknesses, ensure recovery time objective (RTO) and recovery point objective (RPO)
 * targets for your applications are met, and resolve issues before they are released into production.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSResilienceHubAsync extends AWSResilienceHub {

    /**
     * <p>
     * Adds the source of resource-maps to the draft version of an application. During assessment, Resilience Hub will
     * use these resource-maps to resolve the latest physical ID for each resource in the application template. For more
     * information about different types of resources suported by Resilience Hub and how to add them in your
     * application, see <a href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/how-app-manage.html">Step
     * 2: How is your application managed?</a> in the Resilience Hub User Guide.
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
     * Adds the source of resource-maps to the draft version of an application. During assessment, Resilience Hub will
     * use these resource-maps to resolve the latest physical ID for each resource in the application template. For more
     * information about different types of resources suported by Resilience Hub and how to add them in your
     * application, see <a href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/how-app-manage.html">Step
     * 2: How is your application managed?</a> in the Resilience Hub User Guide.
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
     * Enables you to include or exclude one or more operational recommendations.
     * </p>
     * 
     * @param batchUpdateRecommendationStatusRequest
     * @return A Java Future containing the result of the BatchUpdateRecommendationStatus operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.BatchUpdateRecommendationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRecommendationStatusResult> batchUpdateRecommendationStatusAsync(
            BatchUpdateRecommendationStatusRequest batchUpdateRecommendationStatusRequest);

    /**
     * <p>
     * Enables you to include or exclude one or more operational recommendations.
     * </p>
     * 
     * @param batchUpdateRecommendationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateRecommendationStatus operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.BatchUpdateRecommendationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateRecommendationStatusResult> batchUpdateRecommendationStatusAsync(
            BatchUpdateRecommendationStatusRequest batchUpdateRecommendationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateRecommendationStatusRequest, BatchUpdateRecommendationStatusResult> asyncHandler);

    /**
     * <p>
     * Creates an Resilience Hub application. An Resilience Hub application is a collection of Amazon Web Services
     * resources structured to prevent and recover Amazon Web Services application disruptions. To describe a Resilience
     * Hub application, you provide an application name, resources from one or more CloudFormation stacks, Resource
     * Groups, Terraform state files, AppRegistry applications, and an appropriate resiliency policy. In addition, you
     * can also add resources that are located on Amazon Elastic Kubernetes Service (Amazon EKS) clusters as optional
     * resources. For more information about the number of resources supported per application, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/resiliencehub.html#limits_resiliencehub">Service quotas</a>.
     * </p>
     * <p>
     * After you create an Resilience Hub application, you publish it so that you can run a resiliency assessment on it.
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
     * Creates an Resilience Hub application. An Resilience Hub application is a collection of Amazon Web Services
     * resources structured to prevent and recover Amazon Web Services application disruptions. To describe a Resilience
     * Hub application, you provide an application name, resources from one or more CloudFormation stacks, Resource
     * Groups, Terraform state files, AppRegistry applications, and an appropriate resiliency policy. In addition, you
     * can also add resources that are located on Amazon Elastic Kubernetes Service (Amazon EKS) clusters as optional
     * resources. For more information about the number of resources supported per application, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/resiliencehub.html#limits_resiliencehub">Service quotas</a>.
     * </p>
     * <p>
     * After you create an Resilience Hub application, you publish it so that you can run a resiliency assessment on it.
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
     * Creates a new Application Component in the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param createAppVersionAppComponentRequest
     * @return A Java Future containing the result of the CreateAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.CreateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppVersionAppComponentResult> createAppVersionAppComponentAsync(
            CreateAppVersionAppComponentRequest createAppVersionAppComponentRequest);

    /**
     * <p>
     * Creates a new Application Component in the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param createAppVersionAppComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.CreateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppVersionAppComponentResult> createAppVersionAppComponentAsync(
            CreateAppVersionAppComponentRequest createAppVersionAppComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppVersionAppComponentRequest, CreateAppVersionAppComponentResult> asyncHandler);

    /**
     * <p>
     * Adds a resource to the Resilience Hub application and assigns it to the specified Application Components. If you
     * specify a new Application Component, Resilience Hub will automatically create the Application Component.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update application version with new <code>physicalResourceID</code>, you must call
     * <code>ResolveAppVersionResources</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createAppVersionResourceRequest
     * @return A Java Future containing the result of the CreateAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsync.CreateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppVersionResourceResult> createAppVersionResourceAsync(CreateAppVersionResourceRequest createAppVersionResourceRequest);

    /**
     * <p>
     * Adds a resource to the Resilience Hub application and assigns it to the specified Application Components. If you
     * specify a new Application Component, Resilience Hub will automatically create the Application Component.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update application version with new <code>physicalResourceID</code>, you must call
     * <code>ResolveAppVersionResources</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createAppVersionResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.CreateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppVersionResourceResult> createAppVersionResourceAsync(CreateAppVersionResourceRequest createAppVersionResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppVersionResourceRequest, CreateAppVersionResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new recommendation template for the Resilience Hub application.
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
     * Creates a new recommendation template for the Resilience Hub application.
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
     * <note>
     * <p>
     * Resilience Hub allows you to provide a value of zero for <code>rtoInSecs</code> and <code>rpoInSecs</code> of
     * your resiliency policy. But, while assessing your application, the lowest possible assessment result is near
     * zero. Hence, if you provide value zero for <code>rtoInSecs</code> and <code>rpoInSecs</code>, the estimated
     * workload RTO and estimated workload RPO result will be near zero and the <b>Compliance status</b> for your
     * application will be set to <b>Policy breached</b>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Resilience Hub allows you to provide a value of zero for <code>rtoInSecs</code> and <code>rpoInSecs</code> of
     * your resiliency policy. But, while assessing your application, the lowest possible assessment result is near
     * zero. Hence, if you provide value zero for <code>rtoInSecs</code> and <code>rpoInSecs</code>, the estimated
     * workload RTO and estimated workload RPO result will be near zero and the <b>Compliance status</b> for your
     * application will be set to <b>Policy breached</b>.
     * </p>
     * </note>
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
     * Deletes an Resilience Hub application. This is a destructive action that can't be undone.
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
     * Deletes an Resilience Hub application. This is a destructive action that can't be undone.
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
     * Deletes an Resilience Hub application assessment. This is a destructive action that can't be undone.
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
     * Deletes an Resilience Hub application assessment. This is a destructive action that can't be undone.
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
     * Deletes the input source and all of its imported resources from the Resilience Hub application.
     * </p>
     * 
     * @param deleteAppInputSourceRequest
     * @return A Java Future containing the result of the DeleteAppInputSource operation returned by the service.
     * @sample AWSResilienceHubAsync.DeleteAppInputSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppInputSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInputSourceResult> deleteAppInputSourceAsync(DeleteAppInputSourceRequest deleteAppInputSourceRequest);

    /**
     * <p>
     * Deletes the input source and all of its imported resources from the Resilience Hub application.
     * </p>
     * 
     * @param deleteAppInputSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInputSource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DeleteAppInputSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppInputSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInputSourceResult> deleteAppInputSourceAsync(DeleteAppInputSourceRequest deleteAppInputSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInputSourceRequest, DeleteAppInputSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes an Application Component from the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * You will not be able to delete an Application Component if it has resources associated with it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteAppVersionAppComponentRequest
     * @return A Java Future containing the result of the DeleteAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.DeleteAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppVersionAppComponentResult> deleteAppVersionAppComponentAsync(
            DeleteAppVersionAppComponentRequest deleteAppVersionAppComponentRequest);

    /**
     * <p>
     * Deletes an Application Component from the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * You will not be able to delete an Application Component if it has resources associated with it.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteAppVersionAppComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.DeleteAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppVersionAppComponentResult> deleteAppVersionAppComponentAsync(
            DeleteAppVersionAppComponentRequest deleteAppVersionAppComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppVersionAppComponentRequest, DeleteAppVersionAppComponentResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource from the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only delete a manually added resource. To exclude non-manually added resources, use the
     * <code>UpdateAppVersionResource</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteAppVersionResourceRequest
     * @return A Java Future containing the result of the DeleteAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsync.DeleteAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppVersionResourceResult> deleteAppVersionResourceAsync(DeleteAppVersionResourceRequest deleteAppVersionResourceRequest);

    /**
     * <p>
     * Deletes a resource from the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You can only delete a manually added resource. To exclude non-manually added resources, use the
     * <code>UpdateAppVersionResource</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param deleteAppVersionResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DeleteAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppVersionResourceResult> deleteAppVersionResourceAsync(DeleteAppVersionResourceRequest deleteAppVersionResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppVersionResourceRequest, DeleteAppVersionResourceResult> asyncHandler);

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
     * Describes an Resilience Hub application.
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
     * Describes an Resilience Hub application.
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
     * Describes an assessment for an Resilience Hub application.
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
     * Describes an assessment for an Resilience Hub application.
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
     * Describes the Resilience Hub application version.
     * </p>
     * 
     * @param describeAppVersionRequest
     * @return A Java Future containing the result of the DescribeAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResult> describeAppVersionAsync(DescribeAppVersionRequest describeAppVersionRequest);

    /**
     * <p>
     * Describes the Resilience Hub application version.
     * </p>
     * 
     * @param describeAppVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResult> describeAppVersionAsync(DescribeAppVersionRequest describeAppVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionRequest, DescribeAppVersionResult> asyncHandler);

    /**
     * <p>
     * Describes an Application Component in the Resilience Hub application.
     * </p>
     * 
     * @param describeAppVersionAppComponentRequest
     * @return A Java Future containing the result of the DescribeAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.DescribeAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionAppComponentResult> describeAppVersionAppComponentAsync(
            DescribeAppVersionAppComponentRequest describeAppVersionAppComponentRequest);

    /**
     * <p>
     * Describes an Application Component in the Resilience Hub application.
     * </p>
     * 
     * @param describeAppVersionAppComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionAppComponentResult> describeAppVersionAppComponentAsync(
            DescribeAppVersionAppComponentRequest describeAppVersionAppComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionAppComponentRequest, DescribeAppVersionAppComponentResult> asyncHandler);

    /**
     * <p>
     * Describes a resource of the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API accepts only one of the following parameters to descibe the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalResourceId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>physicalResourceId</code> (Along with <code>physicalResourceId</code>, you can also provide
     * <code>awsAccountId</code>, and <code>awsRegion</code>)
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAppVersionResourceRequest
     * @return A Java Future containing the result of the DescribeAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsync.DescribeAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResourceResult> describeAppVersionResourceAsync(
            DescribeAppVersionResourceRequest describeAppVersionResourceRequest);

    /**
     * <p>
     * Describes a resource of the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API accepts only one of the following parameters to descibe the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>resourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalResourceId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>physicalResourceId</code> (Along with <code>physicalResourceId</code>, you can also provide
     * <code>awsAccountId</code>, and <code>awsRegion</code>)
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAppVersionResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.DescribeAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppVersionResourceResult> describeAppVersionResourceAsync(
            DescribeAppVersionResourceRequest describeAppVersionResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppVersionResourceRequest, DescribeAppVersionResourceResult> asyncHandler);

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
     * Describes details about an Resilience Hub application.
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
     * Describes details about an Resilience Hub application.
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
     * <note>
     * <p>
     * If you get a 404 error with <code>ResourceImportStatusNotFoundAppMetadataException</code>, you must call
     * <code>importResourcesToDraftAppVersion</code> after creating the application and before calling
     * <code>describeDraftAppVersionResourcesImportStatus</code> to obtain the status.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * If you get a 404 error with <code>ResourceImportStatusNotFoundAppMetadataException</code>, you must call
     * <code>importResourcesToDraftAppVersion</code> after creating the application and before calling
     * <code>describeDraftAppVersionResourcesImportStatus</code> to obtain the status.
     * </p>
     * </note>
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
     * Describes a specified resiliency policy for an Resilience Hub application. The returned policy object includes
     * creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and more.
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
     * Describes a specified resiliency policy for an Resilience Hub application. The returned policy object includes
     * creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and more.
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
     * Imports resources to Resilience Hub application draft version from different input sources. For more information
     * about the input sources supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
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
     * Imports resources to Resilience Hub application draft version from different input sources. For more information
     * about the input sources supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
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
     * Lists the alarm recommendations for an Resilience Hub application.
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
     * Lists the alarm recommendations for an Resilience Hub application.
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
     * List of compliance drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentComplianceDriftsRequest
     * @return A Java Future containing the result of the ListAppAssessmentComplianceDrifts operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListAppAssessmentComplianceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentComplianceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentComplianceDriftsResult> listAppAssessmentComplianceDriftsAsync(
            ListAppAssessmentComplianceDriftsRequest listAppAssessmentComplianceDriftsRequest);

    /**
     * <p>
     * List of compliance drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentComplianceDriftsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppAssessmentComplianceDrifts operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListAppAssessmentComplianceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentComplianceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentComplianceDriftsResult> listAppAssessmentComplianceDriftsAsync(
            ListAppAssessmentComplianceDriftsRequest listAppAssessmentComplianceDriftsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentComplianceDriftsRequest, ListAppAssessmentComplianceDriftsResult> asyncHandler);

    /**
     * <p>
     * Indicates the list of resource drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentResourceDriftsRequest
     * @return A Java Future containing the result of the ListAppAssessmentResourceDrifts operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.ListAppAssessmentResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentResourceDriftsResult> listAppAssessmentResourceDriftsAsync(
            ListAppAssessmentResourceDriftsRequest listAppAssessmentResourceDriftsRequest);

    /**
     * <p>
     * Indicates the list of resource drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentResourceDriftsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppAssessmentResourceDrifts operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.ListAppAssessmentResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppAssessmentResourceDriftsResult> listAppAssessmentResourceDriftsAsync(
            ListAppAssessmentResourceDriftsRequest listAppAssessmentResourceDriftsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppAssessmentResourceDriftsRequest, ListAppAssessmentResourceDriftsResult> asyncHandler);

    /**
     * <p>
     * Lists the assessments for an Resilience Hub application. You can use request parameters to refine the results for
     * the response object.
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
     * Lists the assessments for an Resilience Hub application. You can use request parameters to refine the results for
     * the response object.
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
     * Lists the compliances for an Resilience Hub Application Component.
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
     * Lists the compliances for an Resilience Hub Application Component.
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
     * Lists the recommendations for an Resilience Hub Application Component.
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
     * Lists the recommendations for an Resilience Hub Application Component.
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
     * Lists all the input sources of the Resilience Hub application. For more information about the input sources
     * supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
     * </p>
     * 
     * @param listAppInputSourcesRequest
     * @return A Java Future containing the result of the ListAppInputSources operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppInputSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppInputSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInputSourcesResult> listAppInputSourcesAsync(ListAppInputSourcesRequest listAppInputSourcesRequest);

    /**
     * <p>
     * Lists all the input sources of the Resilience Hub application. For more information about the input sources
     * supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
     * </p>
     * 
     * @param listAppInputSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInputSources operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppInputSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppInputSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInputSourcesResult> listAppInputSourcesAsync(ListAppInputSourcesRequest listAppInputSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInputSourcesRequest, ListAppInputSourcesResult> asyncHandler);

    /**
     * <p>
     * Lists all the Application Components in the Resilience Hub application.
     * </p>
     * 
     * @param listAppVersionAppComponentsRequest
     * @return A Java Future containing the result of the ListAppVersionAppComponents operation returned by the service.
     * @sample AWSResilienceHubAsync.ListAppVersionAppComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionAppComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionAppComponentsResult> listAppVersionAppComponentsAsync(
            ListAppVersionAppComponentsRequest listAppVersionAppComponentsRequest);

    /**
     * <p>
     * Lists all the Application Components in the Resilience Hub application.
     * </p>
     * 
     * @param listAppVersionAppComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppVersionAppComponents operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.ListAppVersionAppComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionAppComponents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppVersionAppComponentsResult> listAppVersionAppComponentsAsync(
            ListAppVersionAppComponentsRequest listAppVersionAppComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppVersionAppComponentsRequest, ListAppVersionAppComponentsResult> asyncHandler);

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
     * Lists all the resources in an Resilience Hub application.
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
     * Lists all the resources in an Resilience Hub application.
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
     * <note>
     * <p>
     * You can filter applications using only one filter at a time or without using any filter. If you try to filter
     * applications using multiple filters, you will get the following error:
     * </p>
     * <p>
     * <code>An error occurred (ValidationException) when calling the ListApps operation: Only one filter is supported for this operation.</code>
     * </p>
     * </note>
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
     * <note>
     * <p>
     * You can filter applications using only one filter at a time or without using any filter. If you try to filter
     * applications using multiple filters, you will get the following error:
     * </p>
     * <p>
     * <code>An error occurred (ValidationException) when calling the ListApps operation: Only one filter is supported for this operation.</code>
     * </p>
     * </note>
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
     * Lists the resources that are not currently supported in Resilience Hub. An unsupported resource is a resource
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
     * Lists the resources that are not currently supported in Resilience Hub. An unsupported resource is a resource
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
     * Adds or updates the app template for an Resilience Hub application draft version.
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
     * Adds or updates the app template for an Resilience Hub application draft version.
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
     * Updates the Resilience Hub application version.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this information for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param updateAppVersionRequest
     * @return A Java Future containing the result of the UpdateAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsync.UpdateAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionResult> updateAppVersionAsync(UpdateAppVersionRequest updateAppVersionRequest);

    /**
     * <p>
     * Updates the Resilience Hub application version.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this information for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param updateAppVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppVersion operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.UpdateAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionResult> updateAppVersionAsync(UpdateAppVersionRequest updateAppVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionRequest, UpdateAppVersionResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Application Component in the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param updateAppVersionAppComponentRequest
     * @return A Java Future containing the result of the UpdateAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsync.UpdateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionAppComponentResult> updateAppVersionAppComponentAsync(
            UpdateAppVersionAppComponentRequest updateAppVersionAppComponentRequest);

    /**
     * <p>
     * Updates an existing Application Component in the Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this Application Component for running
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </note>
     * 
     * @param updateAppVersionAppComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppVersionAppComponent operation returned by the
     *         service.
     * @sample AWSResilienceHubAsyncHandler.UpdateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionAppComponentResult> updateAppVersionAppComponentAsync(
            UpdateAppVersionAppComponentRequest updateAppVersionAppComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionAppComponentRequest, UpdateAppVersionAppComponentResult> asyncHandler);

    /**
     * <p>
     * Updates the resource details in the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update application version with new <code>physicalResourceID</code>, you must call
     * <code>ResolveAppVersionResources</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateAppVersionResourceRequest
     * @return A Java Future containing the result of the UpdateAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsync.UpdateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionResourceResult> updateAppVersionResourceAsync(UpdateAppVersionResourceRequest updateAppVersionResourceRequest);

    /**
     * <p>
     * Updates the resource details in the Resilience Hub application.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This action has no effect outside Resilience Hub.
     * </p>
     * </li>
     * <li>
     * <p>
     * This API updates the Resilience Hub application draft version. To use this resource for running resiliency
     * assessments, you must publish the Resilience Hub application using the <code>PublishAppVersion</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update application version with new <code>physicalResourceID</code>, you must call
     * <code>ResolveAppVersionResources</code> API.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param updateAppVersionResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppVersionResource operation returned by the service.
     * @sample AWSResilienceHubAsyncHandler.UpdateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppVersionResourceResult> updateAppVersionResourceAsync(UpdateAppVersionResourceRequest updateAppVersionResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppVersionResourceRequest, UpdateAppVersionResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a resiliency policy.
     * </p>
     * <note>
     * <p>
     * Resilience Hub allows you to provide a value of zero for <code>rtoInSecs</code> and <code>rpoInSecs</code> of
     * your resiliency policy. But, while assessing your application, the lowest possible assessment result is near
     * zero. Hence, if you provide value zero for <code>rtoInSecs</code> and <code>rpoInSecs</code>, the estimated
     * workload RTO and estimated workload RPO result will be near zero and the <b>Compliance status</b> for your
     * application will be set to <b>Policy breached</b>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Resilience Hub allows you to provide a value of zero for <code>rtoInSecs</code> and <code>rpoInSecs</code> of
     * your resiliency policy. But, while assessing your application, the lowest possible assessment result is near
     * zero. Hence, if you provide value zero for <code>rtoInSecs</code> and <code>rpoInSecs</code>, the estimated
     * workload RTO and estimated workload RPO result will be near zero and the <b>Compliance status</b> for your
     * application will be set to <b>Policy breached</b>.
     * </p>
     * </note>
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
