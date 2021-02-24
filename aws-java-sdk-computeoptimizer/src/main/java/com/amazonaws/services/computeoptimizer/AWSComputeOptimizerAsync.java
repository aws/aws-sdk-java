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
 * AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS compute
 * resources, such as EC2 instances, Auto Scaling groups, AWS Lambda functions, and Amazon EBS volumes. It reports
 * whether your resources are optimal, and generates optimization recommendations to reduce the cost and improve the
 * performance of your workloads. Compute Optimizer also provides recent utilization metric data, as well as projected
 * utilization metric data for the recommendations, which you can use to evaluate which recommendation provides the best
 * price-performance trade-off. The analysis of your usage patterns can help you decide when to move or resize your
 * running resources, and still meet your performance and capacity requirements. For more information about Compute
 * Optimizer, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComputeOptimizerAsync extends AWSComputeOptimizer {

    /**
     * <p>
     * Describes recommendation export jobs created in the last seven days.
     * </p>
     * <p>
     * Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     * actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code>
     * action to view your export jobs.
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
     * Use the <code>ExportAutoScalingGroupRecommendations</code> or <code>ExportEC2InstanceRecommendations</code>
     * actions to request an export of your recommendations. Then use the <code>DescribeRecommendationExportJobs</code>
     * action to view your export jobs.
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
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Auto Scaling group export job in progress per AWS Region.
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
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Auto Scaling group export job in progress per AWS Region.
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
     * Exports optimization recommendations for Amazon EC2 instances.
     * </p>
     * <p>
     * Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EC2 instance export job in progress per AWS Region.
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
     * Notation (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html">Exporting
     * Recommendations</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * You can have only one Amazon EC2 instance export job in progress per AWS Region.
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
     * Returns Auto Scaling group recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * AWS Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of
     * requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * AWS Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements.
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * AWS Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements.
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * AWS Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet
     * a specific set of requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * AWS Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet
     * a specific set of requirements. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is the management account of an organization, this action also confirms the enrollment status of
     * member accounts within the organization.
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
     * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is the management account of an organization, this action also confirms the enrollment status of
     * member accounts within the organization.
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
     * Returns AWS Lambda function recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * Returns AWS Lambda function recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more
     * information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/requirements.html">Supported resources and
     * requirements</a> in the <i>AWS Compute Optimizer User Guide</i>.
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
     * Returns the optimization findings for an account.
     * </p>
     * <p>
     * For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned,
     * over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not
     * optimized, or optimized.
     * </p>
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
     * For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned,
     * over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not
     * optimized, or optimized.
     * </p>
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
     * Updates the enrollment (opt in and opt out) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * within the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt
     * out. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/security-iam.html">Controlling access with AWS Identity
     * and Access Management</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * When you opt in, Compute Optimizer automatically creates a Service-Linked Role in your account to access its
     * data. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/using-service-linked-roles.html">Using Service-Linked
     * Roles for AWS Compute Optimizer</a> in the <i>Compute Optimizer User Guide</i>.
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
     * Updates the enrollment (opt in and opt out) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a management account of an organization, this action can also be used to enroll member accounts
     * within the organization.
     * </p>
     * <p>
     * You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt
     * out. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/security-iam.html">Controlling access with AWS Identity
     * and Access Management</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * When you opt in, Compute Optimizer automatically creates a Service-Linked Role in your account to access its
     * data. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/ug/using-service-linked-roles.html">Using Service-Linked
     * Roles for AWS Compute Optimizer</a> in the <i>Compute Optimizer User Guide</i>.
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
