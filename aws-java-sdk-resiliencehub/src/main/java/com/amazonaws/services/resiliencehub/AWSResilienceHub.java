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
 * AWS Resilience Hub helps you proactively prepare and protect your Amazon Web Services applications from disruptions.
 * Resilience Hub offers continuous resiliency assessment and validation that integrates into your software development
 * lifecycle. This enables you to uncover resiliency weaknesses, ensure recovery time objective (RTO) and recovery point
 * objective (RPO) targets for your applications are met, and resolve issues before they are released into production.
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
     * Adds the resource mapping for the draft application version.
     * </p>
     * 
     * @param addDraftAppVersionResourceMappingsRequest
     * @return Result of the AddDraftAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * @return Result of the CreateApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Creates a new recommendation template.
     * </p>
     * 
     * @param createRecommendationTemplateRequest
     * @return Result of the CreateRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * 
     * @param createResiliencyPolicyRequest
     * @return Result of the CreateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Deletes an AWS Resilience Hub application. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSResilienceHub.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes an AWS Resilience Hub application assessment. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteAppAssessmentRequest
     * @return Result of the DeleteAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Deletes a recommendation template. This is a destructive action that can't be undone.
     * </p>
     * 
     * @param deleteRecommendationTemplateRequest
     * @return Result of the DeleteRecommendationTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Describes an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Describes an assessment for an AWS Resilience Hub application.
     * </p>
     * 
     * @param describeAppAssessmentRequest
     * @return Result of the DescribeAppAssessment operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Returns the resolution status for the specified resolution identifier for an application version. If
     * <code>resolutionId</code> is not specified, the current resolution status is returned.
     * </p>
     * 
     * @param describeAppVersionResourcesResolutionStatusRequest
     * @return Result of the DescribeAppVersionResourcesResolutionStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Describes details about an AWS Resilience Hub
     * </p>
     * 
     * @param describeAppVersionTemplateRequest
     * @return Result of the DescribeAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * 
     * @param describeDraftAppVersionResourcesImportStatusRequest
     * @return Result of the DescribeDraftAppVersionResourcesImportStatus operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Describes a specified resiliency policy for an AWS Resilience Hub application. The returned policy object
     * includes creation time, data location constraints, the Amazon Resource Name (ARN) for the policy, tags, tier, and
     * more.
     * </p>
     * 
     * @param describeResiliencyPolicyRequest
     * @return Result of the DescribeResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Imports resources from sources such as a CloudFormation stack, resource-groups, or application registry app to a
     * draft application version.
     * </p>
     * 
     * @param importResourcesToDraftAppVersionRequest
     * @return Result of the ImportResourcesToDraftAppVersion operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists the alarm recommendations for a AWS Resilience Hub application.
     * </p>
     * 
     * @param listAlarmRecommendationsRequest
     * @return Result of the ListAlarmRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists the assessments for an AWS Resilience Hub application. You can use request parameters to refine the results
     * for the response object.
     * </p>
     * 
     * @param listAppAssessmentsRequest
     * @return Result of the ListAppAssessments operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists the compliances for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentCompliancesRequest
     * @return Result of the ListAppComponentCompliances operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists the recommendations for an AWS Resilience Hub component.
     * </p>
     * 
     * @param listAppComponentRecommendationsRequest
     * @return Result of the ListAppComponentRecommendations operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists how the resources in an application version are mapped/sourced from. Mappings can be physical resource
     * identifiers, CloudFormation stacks, resource-groups, or an application registry app.
     * </p>
     * 
     * @param listAppVersionResourceMappingsRequest
     * @return Result of the ListAppVersionResourceMappings operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists all the resources in an application version.
     * </p>
     * 
     * @param listAppVersionResourcesRequest
     * @return Result of the ListAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Lists the resources that are not currently supported in AWS Resilience Hub. An unsupported resource is a resource
     * that exists in the object that was used to create an app, but is not supported by Resilience Hub.
     * </p>
     * 
     * @param listUnsupportedAppVersionResourcesRequest
     * @return Result of the ListUnsupportedAppVersionResources operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Adds or updates the app template for a draft version of a Resilience Hub app.
     * </p>
     * 
     * @param putDraftAppVersionTemplateRequest
     * @return Result of the PutDraftAppVersionTemplate operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
     * Updates a resiliency policy.
     * </p>
     * 
     * @param updateResiliencyPolicyRequest
     * @return Result of the UpdateResiliencyPolicy operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the AWS Resilience Hub service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws ValidationException
     *         Indicates that a request was not valid.
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
