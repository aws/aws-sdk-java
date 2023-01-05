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
package com.amazonaws.services.computeoptimizer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.computeoptimizer.model.*;

/**
 * Interface for accessing AWS Compute Optimizer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.computeoptimizer.AbstractAWSComputeOptimizer} instead.
 * </p>
 * <p>
 * <p>
 * Compute Optimizer is a service that analyzes the configuration and utilization metrics of your Amazon Web Services
 * compute resources, such as Amazon EC2 instances, Amazon EC2 Auto Scaling groups, Lambda functions, Amazon EBS
 * volumes, and Amazon ECS services on Fargate. It reports whether your resources are optimal, and generates
 * optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also
 * provides recent utilization metric data, in addition to projected utilization metric data for the recommendations,
 * which you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of
 * your usage patterns can help you decide when to move or resize your running resources, and still meet your
 * performance and capacity requirements. For more information about Compute Optimizer, including the required
 * permissions to use the service, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">Compute
 * Optimizer User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComputeOptimizer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "compute-optimizer";

    /**
     * <p>
     * Deletes a recommendation preference, such as enhanced infrastructure metrics.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param deleteRecommendationPreferencesRequest
     * @return Result of the DeleteRecommendationPreferences operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.DeleteRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DeleteRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecommendationPreferencesResult deleteRecommendationPreferences(DeleteRecommendationPreferencesRequest deleteRecommendationPreferencesRequest);

    /**
     * <p>
     * Describes recommendation export jobs created in the last seven days.
     * </p>
     * <p>
     * Use the <a>ExportAutoScalingGroupRecommendations</a> or <a>ExportEC2InstanceRecommendations</a> actions to
     * request an export of your recommendations. Then use the <a>DescribeRecommendationExportJobs</a> action to view
     * your export jobs.
     * </p>
     * 
     * @param describeRecommendationExportJobsRequest
     * @return Result of the DescribeRecommendationExportJobs operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.DescribeRecommendationExportJobs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRecommendationExportJobsResult describeRecommendationExportJobs(DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Auto Scaling groups.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Auto Scaling group export job in progress per Amazon Web Services Region.
     * </p>
     * 
     * @param exportAutoScalingGroupRecommendationsRequest
     * @return Result of the ExportAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportAutoScalingGroupRecommendationsResult exportAutoScalingGroupRecommendations(
            ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Amazon EBS volumes.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EBS volume export job in progress per Amazon Web Services Region.
     * </p>
     * 
     * @param exportEBSVolumeRecommendationsRequest
     * @return Result of the ExportEBSVolumeRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportEBSVolumeRecommendationsResult exportEBSVolumeRecommendations(ExportEBSVolumeRecommendationsRequest exportEBSVolumeRecommendationsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EC2 instance export job in progress per Amazon Web Services Region.
     * </p>
     * 
     * @param exportEC2InstanceRecommendationsRequest
     * @return Result of the ExportEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportEC2InstanceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportEC2InstanceRecommendationsResult exportEC2InstanceRecommendations(ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Amazon ECS services on Fargate.
     * </p>
     * <p>
     * Recommendations are exported in a CSV file, and its metadata in a JSON file, to an existing Amazon Simple Storage
     * Service (Amazon S3) bucket that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can only have one Amazon ECS service export job in progress per Amazon Web Services Region.
     * </p>
     * 
     * @param exportECSServiceRecommendationsRequest
     * @return Result of the ExportECSServiceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportECSServiceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportECSServiceRecommendationsResult exportECSServiceRecommendations(ExportECSServiceRecommendationsRequest exportECSServiceRecommendationsRequest);

    /**
     * <p>
     * Exports optimization recommendations for Lambda functions.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Lambda function export job in progress per Amazon Web Services Region.
     * </p>
     * 
     * @param exportLambdaFunctionRecommendationsRequest
     * @return Result of the ExportLambdaFunctionRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.ExportLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ExportLambdaFunctionRecommendationsResult exportLambdaFunctionRecommendations(
            ExportLambdaFunctionRecommendationsRequest exportLambdaFunctionRecommendationsRequest);

    /**
     * <p>
     * Returns Auto Scaling group recommendations.
     * </p>
     * <p>
     * Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getAutoScalingGroupRecommendationsRequest
     * @return Result of the GetAutoScalingGroupRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetAutoScalingGroupRecommendationsResult getAutoScalingGroupRecommendations(
            GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest);

    /**
     * <p>
     * Returns Amazon Elastic Block Store (Amazon EBS) volume recommendations.
     * </p>
     * <p>
     * Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements. For
     * more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEBSVolumeRecommendationsRequest
     * @return Result of the GetEBSVolumeRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetEBSVolumeRecommendationsResult getEBSVolumeRecommendations(GetEBSVolumeRecommendationsRequest getEBSVolumeRecommendationsRequest);

    /**
     * <p>
     * Returns Amazon EC2 instance recommendations.
     * </p>
     * <p>
     * Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet a
     * specific set of requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getEC2InstanceRecommendationsRequest
     * @return Result of the GetEC2InstanceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2InstanceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetEC2InstanceRecommendationsResult getEC2InstanceRecommendations(GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest);

    /**
     * <p>
     * Returns the projected utilization metrics of Amazon EC2 instance recommendations.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned when you
     * run this action. Additionally, the <code>Memory</code> metric is returned only for resources that have the
     * unified CloudWatch agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param getEC2RecommendationProjectedMetricsRequest
     * @return Result of the GetEC2RecommendationProjectedMetrics operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEC2RecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    GetEC2RecommendationProjectedMetricsResult getEC2RecommendationProjectedMetrics(
            GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest);

    /**
     * <p>
     * Returns the projected metrics of Amazon ECS service recommendations.
     * </p>
     * 
     * @param getECSServiceRecommendationProjectedMetricsRequest
     * @return Result of the GetECSServiceRecommendationProjectedMetrics operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetECSServiceRecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    GetECSServiceRecommendationProjectedMetricsResult getECSServiceRecommendationProjectedMetrics(
            GetECSServiceRecommendationProjectedMetricsRequest getECSServiceRecommendationProjectedMetricsRequest);

    /**
     * <p>
     * Returns Amazon ECS service recommendations.
     * </p>
     * <p>
     * Compute Optimizer generates recommendations for Amazon ECS services on Fargate that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getECSServiceRecommendationsRequest
     * @return Result of the GetECSServiceRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetECSServiceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetECSServiceRecommendationsResult getECSServiceRecommendations(GetECSServiceRecommendationsRequest getECSServiceRecommendationsRequest);

    /**
     * <p>
     * Returns the recommendation preferences that are in effect for a given resource, such as enhanced infrastructure
     * metrics. Considers all applicable preferences that you might have set at the resource, account, and organization
     * level.
     * </p>
     * <p>
     * When you create a recommendation preference, you can set its status to <code>Active</code> or
     * <code>Inactive</code>. Use this action to view the recommendation preferences that are in effect, or
     * <code>Active</code>.
     * </p>
     * 
     * @param getEffectiveRecommendationPreferencesRequest
     * @return Result of the GetEffectiveRecommendationPreferences operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEffectiveRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEffectiveRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetEffectiveRecommendationPreferencesResult getEffectiveRecommendationPreferences(
            GetEffectiveRecommendationPreferencesRequest getEffectiveRecommendationPreferencesRequest);

    /**
     * <p>
     * Returns the enrollment (opt in) status of an account to the Compute Optimizer service.
     * </p>
     * <p>
     * If the account is the management account of an organization, this action also confirms the enrollment status of
     * member accounts of the organization. Use the <a>GetEnrollmentStatusesForOrganization</a> action to get detailed
     * information about the enrollment status of member accounts of an organization.
     * </p>
     * 
     * @param getEnrollmentStatusRequest
     * @return Result of the GetEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnrollmentStatusResult getEnrollmentStatus(GetEnrollmentStatusRequest getEnrollmentStatusRequest);

    /**
     * <p>
     * Returns the Compute Optimizer enrollment (opt-in) status of organization member accounts, if your account is an
     * organization management account.
     * </p>
     * <p>
     * To get the enrollment status of standalone accounts, use the <a>GetEnrollmentStatus</a> action.
     * </p>
     * 
     * @param getEnrollmentStatusesForOrganizationRequest
     * @return Result of the GetEnrollmentStatusesForOrganization operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetEnrollmentStatusesForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatusesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnrollmentStatusesForOrganizationResult getEnrollmentStatusesForOrganization(
            GetEnrollmentStatusesForOrganizationRequest getEnrollmentStatusesForOrganizationRequest);

    /**
     * <p>
     * Returns Lambda function recommendations.
     * </p>
     * <p>
     * Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getLambdaFunctionRecommendationsRequest
     * @return Result of the GetLambdaFunctionRecommendations operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeds a limit of the service.
     * @sample AWSComputeOptimizer.GetLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetLambdaFunctionRecommendationsResult getLambdaFunctionRecommendations(GetLambdaFunctionRecommendationsRequest getLambdaFunctionRecommendationsRequest);

    /**
     * <p>
     * Returns existing recommendation preferences, such as enhanced infrastructure metrics.
     * </p>
     * <p>
     * Use the <code>scope</code> parameter to specify which preferences to return. You can specify to return
     * preferences for an organization, a specific account ID, or a specific EC2 instance or Auto Scaling group Amazon
     * Resource Name (ARN).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param getRecommendationPreferencesRequest
     * @return Result of the GetRecommendationPreferences operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationPreferencesResult getRecommendationPreferences(GetRecommendationPreferencesRequest getRecommendationPreferencesRequest);

    /**
     * <p>
     * Returns the optimization findings for an account.
     * </p>
     * <p>
     * It returns the number of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon EC2 instances in an account that are <code>Underprovisioned</code>, <code>Overprovisioned</code>, or
     * <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto Scaling groups in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon EBS volumes in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda functions in an account that are <code>NotOptimized</code>, or <code>Optimized</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ECS services in an account that are <code>Underprovisioned</code>, <code>Overprovisioned</code>, or
     * <code>Optimized</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRecommendationSummariesRequest
     * @return Result of the GetRecommendationSummaries operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.GetRecommendationSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecommendationSummariesResult getRecommendationSummaries(GetRecommendationSummariesRequest getRecommendationSummariesRequest);

    /**
     * <p>
     * Creates a new recommendation preference or updates an existing recommendation preference, such as enhanced
     * infrastructure metrics.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/enhanced-infrastructure-metrics.html">Activating
     * enhanced infrastructure metrics</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param putRecommendationPreferencesRequest
     * @return Result of the PutRecommendationPreferences operation returned by the service.
     * @throws OptInRequiredException
     *         The account is not opted in to Compute Optimizer.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.PutRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PutRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    PutRecommendationPreferencesResult putRecommendationPreferences(PutRecommendationPreferencesRequest putRecommendationPreferencesRequest);

    /**
     * <p>
     * Updates the enrollment (opt in and opt out) status of an account to the Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * of the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt
     * out. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html">Controlling access with Amazon
     * Web Services Identity and Access Management</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * When you opt in, Compute Optimizer automatically creates a service-linked role in your account to access its
     * data. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/using-service-linked-roles.html">Using
     * Service-Linked Roles for Compute Optimizer</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param updateEnrollmentStatusRequest
     * @return Result of the UpdateEnrollmentStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Try your call again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InvalidParameterValueException
     *         The value supplied for the input parameter is out of range or not valid.
     * @throws MissingAuthenticationTokenException
     *         The request must contain either a valid (registered) Amazon Web Services access key ID or X.509
     *         certificate.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSComputeOptimizer.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnrollmentStatusResult updateEnrollmentStatus(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest);

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
