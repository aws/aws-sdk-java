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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.resiliencehub.model.*;

/**
 * Interface for accessing AWS Resilience Hub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.resiliencehub.AbstractAWSResilienceHub} instead.
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
public interface AWSResilienceHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "resiliencehub";

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
     * @return Result of the AddDraftAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.AddDraftAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AddDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    AddDraftAppVersionResourceMappingsResult addDraftAppVersionResourceMappings(
            AddDraftAppVersionResourceMappingsRequest addDraftAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Enables you to include or exclude one or more operational recommendations.
     * </p>
     * 
     * @param batchUpdateRecommendationStatusRequest
     * @return Result of the BatchUpdateRecommendationStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.BatchUpdateRecommendationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateRecommendationStatusResult batchUpdateRecommendationStatus(BatchUpdateRecommendationStatusRequest batchUpdateRecommendationStatusRequest);

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
     * @return Result of the CreateApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

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
     * @return Result of the CreateAppVersionAppComponent operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppVersionAppComponentResult createAppVersionAppComponent(CreateAppVersionAppComponentRequest createAppVersionAppComponentRequest);

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
     * @return Result of the CreateAppVersionResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAppVersionResourceResult createAppVersionResource(CreateAppVersionResourceRequest createAppVersionResourceRequest);

    /**
     * <p>
     * Creates a new recommendation template for the Resilience Hub application.
     * </p>
     * 
     * @param createRecommendationTemplateRequest
     * @return Result of the CreateRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRecommendationTemplateResult createRecommendationTemplate(CreateRecommendationTemplateRequest createRecommendationTemplateRequest);

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
     * @return Result of the CreateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.CreateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/CreateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResiliencyPolicyResult createResiliencyPolicy(CreateResiliencyPolicyRequest createResiliencyPolicyRequest);

    /**
     * <p>
     * Deletes an Resilience Hub application. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @sample AWSResilienceHub.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes an Resilience Hub application assessment. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppAssessmentRequest
     * @return Result of the DeleteAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppAssessmentResult deleteAppAssessment(DeleteAppAssessmentRequest deleteAppAssessmentRequest);

    /**
     * <p>
     * Deletes the input source and all of its imported resources from the Resilience Hub application.
     * </p>
     * 
     * @param deleteAppInputSourceRequest
     * @return Result of the DeleteAppInputSource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteAppInputSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppInputSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppInputSourceResult deleteAppInputSource(DeleteAppInputSourceRequest deleteAppInputSourceRequest);

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
     * @return Result of the DeleteAppVersionAppComponent operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppVersionAppComponentResult deleteAppVersionAppComponent(DeleteAppVersionAppComponentRequest deleteAppVersionAppComponentRequest);

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
     * @return Result of the DeleteAppVersionResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAppVersionResourceResult deleteAppVersionResource(DeleteAppVersionResourceRequest deleteAppVersionResourceRequest);

    /**
     * <p>
     * Deletes a recommendation template. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteRecommendationTemplateRequest
     * @return Result of the DeleteRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteRecommendationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteRecommendationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecommendationTemplateResult deleteRecommendationTemplate(DeleteRecommendationTemplateRequest deleteRecommendationTemplateRequest);

    /**
     * <p>
     * Deletes a resiliency policy. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteResiliencyPolicyRequest
     * @return Result of the DeleteResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DeleteResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResiliencyPolicyResult deleteResiliencyPolicy(DeleteResiliencyPolicyRequest deleteResiliencyPolicyRequest);

    /**
     * <p>
     * Describes an Resilience Hub application.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAppResult describeApp(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Describes an assessment for an Resilience Hub application.
     * </p>
     * 
     * @param describeAppAssessmentRequest
     * @return Result of the DescribeAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppAssessmentResult describeAppAssessment(DescribeAppAssessmentRequest describeAppAssessmentRequest);

    /**
     * <p>
     * Describes the Resilience Hub application version.
     * </p>
     * 
     * @param describeAppVersionRequest
     * @return Result of the DescribeAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppVersionResult describeAppVersion(DescribeAppVersionRequest describeAppVersionRequest);

    /**
     * <p>
     * Describes an Application Component in the Resilience Hub application.
     * </p>
     * 
     * @param describeAppVersionAppComponentRequest
     * @return Result of the DescribeAppVersionAppComponent operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppVersionAppComponentResult describeAppVersionAppComponent(DescribeAppVersionAppComponentRequest describeAppVersionAppComponentRequest);

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
     * @return Result of the DescribeAppVersionResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppVersionResourceResult describeAppVersionResource(DescribeAppVersionResourceRequest describeAppVersionResourceRequest);

    /**
     * <p>
     * Returns the resolution status for the specified resolution identifier for an application version. If
     * <code>resolutionId</code> is not specified, the current resolution status is returned.
     * </p>
     * 
     * @param describeAppVersionResourcesResolutionStatusRequest
     * @return Result of the DescribeAppVersionResourcesResolutionStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionResourcesResolutionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionResourcesResolutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppVersionResourcesResolutionStatusResult describeAppVersionResourcesResolutionStatus(
            DescribeAppVersionResourcesResolutionStatusRequest describeAppVersionResourcesResolutionStatusRequest);

    /**
     * <p>
     * Describes details about an Resilience Hub application.
     * </p>
     * 
     * @param describeAppVersionTemplateRequest
     * @return Result of the DescribeAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAppVersionTemplateResult describeAppVersionTemplate(DescribeAppVersionTemplateRequest describeAppVersionTemplateRequest);

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
     * @return Result of the DescribeDraftAppVersionResourcesImportStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeDraftAppVersionResourcesImportStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeDraftAppVersionResourcesImportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDraftAppVersionResourcesImportStatusResult describeDraftAppVersionResourcesImportStatus(
            DescribeDraftAppVersionResourcesImportStatusRequest describeDraftAppVersionResourcesImportStatusRequest);

    /**
     * <p>
     * Describes a specified resiliency policy for an Resilience Hub application. The returned policy object includes
     * creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and more.
     * </p>
     * 
     * @param describeResiliencyPolicyRequest
     * @return Result of the DescribeResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.DescribeResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DescribeResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResiliencyPolicyResult describeResiliencyPolicy(DescribeResiliencyPolicyRequest describeResiliencyPolicyRequest);

    /**
     * <p>
     * Imports resources to Resilience Hub application draft version from different input sources. For more information
     * about the input sources supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
     * </p>
     * 
     * @param importResourcesToDraftAppVersionRequest
     * @return Result of the ImportResourcesToDraftAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ImportResourcesToDraftAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ImportResourcesToDraftAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    ImportResourcesToDraftAppVersionResult importResourcesToDraftAppVersion(ImportResourcesToDraftAppVersionRequest importResourcesToDraftAppVersionRequest);

    /**
     * <p>
     * Lists the alarm recommendations for an Resilience Hub application.
     * </p>
     * 
     * @param listAlarmRecommendationsRequest
     * @return Result of the ListAlarmRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAlarmRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAlarmRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAlarmRecommendationsResult listAlarmRecommendations(ListAlarmRecommendationsRequest listAlarmRecommendationsRequest);

    /**
     * <p>
     * List of compliance drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentComplianceDriftsRequest
     * @return Result of the ListAppAssessmentComplianceDrifts operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppAssessmentComplianceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentComplianceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppAssessmentComplianceDriftsResult listAppAssessmentComplianceDrifts(ListAppAssessmentComplianceDriftsRequest listAppAssessmentComplianceDriftsRequest);

    /**
     * <p>
     * Indicates the list of resource drifts that were detected while running an assessment.
     * </p>
     * 
     * @param listAppAssessmentResourceDriftsRequest
     * @return Result of the ListAppAssessmentResourceDrifts operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppAssessmentResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessmentResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppAssessmentResourceDriftsResult listAppAssessmentResourceDrifts(ListAppAssessmentResourceDriftsRequest listAppAssessmentResourceDriftsRequest);

    /**
     * <p>
     * Lists the assessments for an Resilience Hub application. You can use request parameters to refine the results for
     * the response object.
     * </p>
     * 
     * @param listAppAssessmentsRequest
     * @return Result of the ListAppAssessments operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppAssessmentsResult listAppAssessments(ListAppAssessmentsRequest listAppAssessmentsRequest);

    /**
     * <p>
     * Lists the compliances for an Resilience Hub Application Component.
     * </p>
     * 
     * @param listAppComponentCompliancesRequest
     * @return Result of the ListAppComponentCompliances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppComponentCompliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentCompliances"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppComponentCompliancesResult listAppComponentCompliances(ListAppComponentCompliancesRequest listAppComponentCompliancesRequest);

    /**
     * <p>
     * Lists the recommendations for an Resilience Hub Application Component.
     * </p>
     * 
     * @param listAppComponentRecommendationsRequest
     * @return Result of the ListAppComponentRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppComponentRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppComponentRecommendationsResult listAppComponentRecommendations(ListAppComponentRecommendationsRequest listAppComponentRecommendationsRequest);

    /**
     * <p>
     * Lists all the input sources of the Resilience Hub application. For more information about the input sources
     * supported by Resilience Hub, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/discover-structure.html">Discover the structure
     * and describe your Resilience Hub application</a>.
     * </p>
     * 
     * @param listAppInputSourcesRequest
     * @return Result of the ListAppInputSources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppInputSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppInputSources"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppInputSourcesResult listAppInputSources(ListAppInputSourcesRequest listAppInputSourcesRequest);

    /**
     * <p>
     * Lists all the Application Components in the Resilience Hub application.
     * </p>
     * 
     * @param listAppVersionAppComponentsRequest
     * @return Result of the ListAppVersionAppComponents operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersionAppComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionAppComponents"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppVersionAppComponentsResult listAppVersionAppComponents(ListAppVersionAppComponentsRequest listAppVersionAppComponentsRequest);

    /**
     * <p>
     * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource
     * identifiers, CloudFormation stacks, resource-groups, or an application registry app.
     * </p>
     * 
     * @param listAppVersionResourceMappingsRequest
     * @return Result of the ListAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersionResourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppVersionResourceMappingsResult listAppVersionResourceMappings(ListAppVersionResourceMappingsRequest listAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Lists all the resources in an Resilience Hub application.
     * </p>
     * 
     * @param listAppVersionResourcesRequest
     * @return Result of the ListAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListAppVersionResourcesResult listAppVersionResources(ListAppVersionResourcesRequest listAppVersionResourcesRequest);

    /**
     * <p>
     * Lists the different versions for the Resilience Hub applications.
     * </p>
     * 
     * @param listAppVersionsRequest
     * @return Result of the ListAppVersions operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListAppVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListAppVersionsResult listAppVersions(ListAppVersionsRequest listAppVersionsRequest);

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
     * @return Result of the ListApps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists the recommendation templates for the Resilience Hub applications.
     * </p>
     * 
     * @param listRecommendationTemplatesRequest
     * @return Result of the ListRecommendationTemplates operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListRecommendationTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListRecommendationTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationTemplatesResult listRecommendationTemplates(ListRecommendationTemplatesRequest listRecommendationTemplatesRequest);

    /**
     * <p>
     * Lists the resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listResiliencyPoliciesRequest
     * @return Result of the ListResiliencyPolicies operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListResiliencyPoliciesResult listResiliencyPolicies(ListResiliencyPoliciesRequest listResiliencyPoliciesRequest);

    /**
     * <p>
     * Lists the standard operating procedure (SOP) recommendations for the Resilience Hub applications.
     * </p>
     * 
     * @param listSopRecommendationsRequest
     * @return Result of the ListSopRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListSopRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSopRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListSopRecommendationsResult listSopRecommendations(ListSopRecommendationsRequest listSopRecommendationsRequest);

    /**
     * <p>
     * Lists the suggested resiliency policies for the Resilience Hub applications.
     * </p>
     * 
     * @param listSuggestedResiliencyPoliciesRequest
     * @return Result of the ListSuggestedResiliencyPolicies operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListSuggestedResiliencyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListSuggestedResiliencyPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListSuggestedResiliencyPoliciesResult listSuggestedResiliencyPolicies(ListSuggestedResiliencyPoliciesRequest listSuggestedResiliencyPoliciesRequest);

    /**
     * <p>
     * Lists the tags for your resources in your Resilience Hub applications.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the test recommendations for the Resilience Hub application.
     * </p>
     * 
     * @param listTestRecommendationsRequest
     * @return Result of the ListTestRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListTestRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListTestRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListTestRecommendationsResult listTestRecommendations(ListTestRecommendationsRequest listTestRecommendationsRequest);

    /**
     * <p>
     * Lists the resources that are not currently supported in Resilience Hub. An unsupported resource is a resource
     * that exists in the object that was used to create an app, but is not supported by Resilience Hub.
     * </p>
     * 
     * @param listUnsupportedAppVersionResourcesRequest
     * @return Result of the ListUnsupportedAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ListUnsupportedAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListUnsupportedAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListUnsupportedAppVersionResourcesResult listUnsupportedAppVersionResources(
            ListUnsupportedAppVersionResourcesRequest listUnsupportedAppVersionResourcesRequest);

    /**
     * <p>
     * Publishes a new version of a specific Resilience Hub application.
     * </p>
     * 
     * @param publishAppVersionRequest
     * @return Result of the PublishAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.PublishAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PublishAppVersion"
     *      target="_top">AWS API Documentation</a>
     */
    PublishAppVersionResult publishAppVersion(PublishAppVersionRequest publishAppVersionRequest);

    /**
     * <p>
     * Adds or updates the app template for an Resilience Hub application draft version.
     * </p>
     * 
     * @param putDraftAppVersionTemplateRequest
     * @return Result of the PutDraftAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.PutDraftAppVersionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PutDraftAppVersionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    PutDraftAppVersionTemplateResult putDraftAppVersionTemplate(PutDraftAppVersionTemplateRequest putDraftAppVersionTemplateRequest);

    /**
     * <p>
     * Removes resource mappings from a draft application version.
     * </p>
     * 
     * @param removeDraftAppVersionResourceMappingsRequest
     * @return Result of the RemoveDraftAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.RemoveDraftAppVersionResourceMappings
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RemoveDraftAppVersionResourceMappings"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveDraftAppVersionResourceMappingsResult removeDraftAppVersionResourceMappings(
            RemoveDraftAppVersionResourceMappingsRequest removeDraftAppVersionResourceMappingsRequest);

    /**
     * <p>
     * Resolves the resources for an application version.
     * </p>
     * 
     * @param resolveAppVersionResourcesRequest
     * @return Result of the ResolveAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.ResolveAppVersionResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResolveAppVersionResources"
     *      target="_top">AWS API Documentation</a>
     */
    ResolveAppVersionResourcesResult resolveAppVersionResources(ResolveAppVersionResourcesRequest resolveAppVersionResourcesRequest);

    /**
     * <p>
     * Creates a new application assessment for an application.
     * </p>
     * 
     * @param startAppAssessmentRequest
     * @return Result of the StartAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.StartAppAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/StartAppAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    StartAppAssessmentResult startAppAssessment(StartAppAssessmentRequest startAppAssessmentRequest);

    /**
     * <p>
     * Applies one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateAppRequest
     * @return Result of the UpdateApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest);

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
     * @return Result of the UpdateAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateAppVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersion" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAppVersionResult updateAppVersion(UpdateAppVersionRequest updateAppVersionRequest);

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
     * @return Result of the UpdateAppVersionAppComponent operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateAppVersionAppComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionAppComponent"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppVersionAppComponentResult updateAppVersionAppComponent(UpdateAppVersionAppComponentRequest updateAppVersionAppComponentRequest);

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
     * @return Result of the UpdateAppVersionResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         This exception occurs when you have exceeded your service quota. To perform the requested action, remove
     *         some of the relevant resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateAppVersionResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionResource"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAppVersionResourceResult updateAppVersionResource(UpdateAppVersionResourceRequest updateAppVersionResourceRequest);

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
     * @return Result of the UpdateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Resilience Hub service.
     * @throws ResourceNotFoundException
     *         This exception occurs when the specified resource could not be found.
     * @throws ConflictException
     *         This exception occurs when a conflict with a previous successful write is detected. This generally occurs
     *         when the previous write did not have time to propagate to the host serving the current request. A retry
     *         (with appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         This exception occurs when you have exceeded the limit on the number of requests per second.
     * @throws ValidationException
     *         This exception occurs when a request is not valid.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions.
     * @sample AWSResilienceHub.UpdateResiliencyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateResiliencyPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResiliencyPolicyResult updateResiliencyPolicy(UpdateResiliencyPolicyRequest updateResiliencyPolicyRequest);

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
