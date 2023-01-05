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

import com.amazonaws.services.computeoptimizer.model.*;

/**
 * Interface for accessing AWS Compute Optimizer asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.computeoptimizer.AbstractAWSComputeOptimizerAsync} instead.
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
public interface AWSComputeOptimizerAsync extends AWSComputeOptimizer {

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
     * @return A Java Future containing the result of the DeleteRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.DeleteRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DeleteRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommendationPreferencesResult> deleteRecommendationPreferencesAsync(
            DeleteRecommendationPreferencesRequest deleteRecommendationPreferencesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.DeleteRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DeleteRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommendationPreferencesResult> deleteRecommendationPreferencesAsync(
            DeleteRecommendationPreferencesRequest deleteRecommendationPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommendationPreferencesRequest, DeleteRecommendationPreferencesResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRecommendationExportJobs operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.DescribeRecommendationExportJobs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecommendationExportJobs operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.DescribeRecommendationExportJobs
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/DescribeRecommendationExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            DescribeRecommendationExportJobsRequest describeRecommendationExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommendationExportJobsRequest, DescribeRecommendationExportJobsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportAutoScalingGroupRecommendations operation returned by
     *         the service.
     * @sample AWSComputeOptimizerAsync.ExportAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportAutoScalingGroupRecommendations operation returned by
     *         the service.
     * @sample AWSComputeOptimizerAsyncHandler.ExportAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            ExportAutoScalingGroupRecommendationsRequest exportAutoScalingGroupRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportAutoScalingGroupRecommendationsRequest, ExportAutoScalingGroupRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportEBSVolumeRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.ExportEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEBSVolumeRecommendationsResult> exportEBSVolumeRecommendationsAsync(
            ExportEBSVolumeRecommendationsRequest exportEBSVolumeRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportEBSVolumeRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.ExportEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEBSVolumeRecommendationsResult> exportEBSVolumeRecommendationsAsync(
            ExportEBSVolumeRecommendationsRequest exportEBSVolumeRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportEBSVolumeRecommendationsRequest, ExportEBSVolumeRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportEC2InstanceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.ExportEC2InstanceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportEC2InstanceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.ExportEC2InstanceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            ExportEC2InstanceRecommendationsRequest exportEC2InstanceRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportEC2InstanceRecommendationsRequest, ExportEC2InstanceRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportECSServiceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.ExportECSServiceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportECSServiceRecommendationsResult> exportECSServiceRecommendationsAsync(
            ExportECSServiceRecommendationsRequest exportECSServiceRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportECSServiceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.ExportECSServiceRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportECSServiceRecommendationsResult> exportECSServiceRecommendationsAsync(
            ExportECSServiceRecommendationsRequest exportECSServiceRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportECSServiceRecommendationsRequest, ExportECSServiceRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ExportLambdaFunctionRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.ExportLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportLambdaFunctionRecommendationsResult> exportLambdaFunctionRecommendationsAsync(
            ExportLambdaFunctionRecommendationsRequest exportLambdaFunctionRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportLambdaFunctionRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.ExportLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportLambdaFunctionRecommendationsResult> exportLambdaFunctionRecommendationsAsync(
            ExportLambdaFunctionRecommendationsRequest exportLambdaFunctionRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ExportLambdaFunctionRecommendationsRequest, ExportLambdaFunctionRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetAutoScalingGroupRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAutoScalingGroupRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetAutoScalingGroupRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            GetAutoScalingGroupRecommendationsRequest getAutoScalingGroupRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAutoScalingGroupRecommendationsRequest, GetAutoScalingGroupRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEBSVolumeRecommendations operation returned by the service.
     * @sample AWSComputeOptimizerAsync.GetEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(
            GetEBSVolumeRecommendationsRequest getEBSVolumeRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEBSVolumeRecommendations operation returned by the service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEBSVolumeRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(
            GetEBSVolumeRecommendationsRequest getEBSVolumeRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEBSVolumeRecommendationsRequest, GetEBSVolumeRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEC2InstanceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetEC2InstanceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(
            GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEC2InstanceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEC2InstanceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2InstanceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(
            GetEC2InstanceRecommendationsRequest getEC2InstanceRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEC2InstanceRecommendationsRequest, GetEC2InstanceRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEC2RecommendationProjectedMetrics operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetEC2RecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEC2RecommendationProjectedMetrics operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEC2RecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            GetEC2RecommendationProjectedMetricsRequest getEC2RecommendationProjectedMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEC2RecommendationProjectedMetricsRequest, GetEC2RecommendationProjectedMetricsResult> asyncHandler);

    /**
     * <p>
     * Returns the projected metrics of Amazon ECS service recommendations.
     * </p>
     * 
     * @param getECSServiceRecommendationProjectedMetricsRequest
     * @return A Java Future containing the result of the GetECSServiceRecommendationProjectedMetrics operation returned
     *         by the service.
     * @sample AWSComputeOptimizerAsync.GetECSServiceRecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetECSServiceRecommendationProjectedMetricsResult> getECSServiceRecommendationProjectedMetricsAsync(
            GetECSServiceRecommendationProjectedMetricsRequest getECSServiceRecommendationProjectedMetricsRequest);

    /**
     * <p>
     * Returns the projected metrics of Amazon ECS service recommendations.
     * </p>
     * 
     * @param getECSServiceRecommendationProjectedMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetECSServiceRecommendationProjectedMetrics operation returned
     *         by the service.
     * @sample AWSComputeOptimizerAsyncHandler.GetECSServiceRecommendationProjectedMetrics
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendationProjectedMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetECSServiceRecommendationProjectedMetricsResult> getECSServiceRecommendationProjectedMetricsAsync(
            GetECSServiceRecommendationProjectedMetricsRequest getECSServiceRecommendationProjectedMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetECSServiceRecommendationProjectedMetricsRequest, GetECSServiceRecommendationProjectedMetricsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetECSServiceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetECSServiceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetECSServiceRecommendationsResult> getECSServiceRecommendationsAsync(
            GetECSServiceRecommendationsRequest getECSServiceRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetECSServiceRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetECSServiceRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetECSServiceRecommendationsResult> getECSServiceRecommendationsAsync(
            GetECSServiceRecommendationsRequest getECSServiceRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetECSServiceRecommendationsRequest, GetECSServiceRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEffectiveRecommendationPreferences operation returned by
     *         the service.
     * @sample AWSComputeOptimizerAsync.GetEffectiveRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEffectiveRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectiveRecommendationPreferencesResult> getEffectiveRecommendationPreferencesAsync(
            GetEffectiveRecommendationPreferencesRequest getEffectiveRecommendationPreferencesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEffectiveRecommendationPreferences operation returned by
     *         the service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEffectiveRecommendationPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEffectiveRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectiveRecommendationPreferencesResult> getEffectiveRecommendationPreferencesAsync(
            GetEffectiveRecommendationPreferencesRequest getEffectiveRecommendationPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEffectiveRecommendationPreferencesRequest, GetEffectiveRecommendationPreferencesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEnrollmentStatus operation returned by the service.
     * @sample AWSComputeOptimizerAsync.GetEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(GetEnrollmentStatusRequest getEnrollmentStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnrollmentStatus operation returned by the service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(GetEnrollmentStatusRequest getEnrollmentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnrollmentStatusRequest, GetEnrollmentStatusResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEnrollmentStatusesForOrganization operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetEnrollmentStatusesForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatusesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnrollmentStatusesForOrganizationResult> getEnrollmentStatusesForOrganizationAsync(
            GetEnrollmentStatusesForOrganizationRequest getEnrollmentStatusesForOrganizationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnrollmentStatusesForOrganization operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetEnrollmentStatusesForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEnrollmentStatusesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnrollmentStatusesForOrganizationResult> getEnrollmentStatusesForOrganizationAsync(
            GetEnrollmentStatusesForOrganizationRequest getEnrollmentStatusesForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnrollmentStatusesForOrganizationRequest, GetEnrollmentStatusesForOrganizationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetLambdaFunctionRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            GetLambdaFunctionRecommendationsRequest getLambdaFunctionRecommendationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLambdaFunctionRecommendations operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetLambdaFunctionRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetLambdaFunctionRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            GetLambdaFunctionRecommendationsRequest getLambdaFunctionRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLambdaFunctionRecommendationsRequest, GetLambdaFunctionRecommendationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.GetRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationPreferencesResult> getRecommendationPreferencesAsync(
            GetRecommendationPreferencesRequest getRecommendationPreferencesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.GetRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationPreferencesResult> getRecommendationPreferencesAsync(
            GetRecommendationPreferencesRequest getRecommendationPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationPreferencesRequest, GetRecommendationPreferencesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRecommendationSummaries operation returned by the service.
     * @sample AWSComputeOptimizerAsync.GetRecommendationSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(
            GetRecommendationSummariesRequest getRecommendationSummariesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommendationSummaries operation returned by the service.
     * @sample AWSComputeOptimizerAsyncHandler.GetRecommendationSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetRecommendationSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(
            GetRecommendationSummariesRequest getRecommendationSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommendationSummariesRequest, GetRecommendationSummariesResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsync.PutRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PutRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecommendationPreferencesResult> putRecommendationPreferencesAsync(
            PutRecommendationPreferencesRequest putRecommendationPreferencesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRecommendationPreferences operation returned by the
     *         service.
     * @sample AWSComputeOptimizerAsyncHandler.PutRecommendationPreferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PutRecommendationPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecommendationPreferencesResult> putRecommendationPreferencesAsync(
            PutRecommendationPreferencesRequest putRecommendationPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<PutRecommendationPreferencesRequest, PutRecommendationPreferencesResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateEnrollmentStatus operation returned by the service.
     * @sample AWSComputeOptimizerAsync.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnrollmentStatus operation returned by the service.
     * @sample AWSComputeOptimizerAsyncHandler.UpdateEnrollmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UpdateEnrollmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest updateEnrollmentStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler);

}
