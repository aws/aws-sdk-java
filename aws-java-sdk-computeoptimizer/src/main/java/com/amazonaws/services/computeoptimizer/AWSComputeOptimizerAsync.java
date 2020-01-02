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
 * AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS resources,
 * such as EC2 instances and Auto Scaling groups. It reports whether your resources are optimal, and generates
 * optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also
 * provides recent utilization metric data, as well as projected utilization metric data for the recommendations, which
 * you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of your
 * usage patterns can help you decide when to move or resize your running resources, and still meet your performance and
 * capacity requirements. For more information about Compute Optimizer, see the <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSComputeOptimizerAsync extends AWSComputeOptimizer {

    /**
     * <p>
     * Returns Auto Scaling group recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run
     * instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto
     * Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired,
     * minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be
     * of a fixed size. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.
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
     * AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run
     * instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto
     * Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired,
     * minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be
     * of a fixed size. For more information, see the <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute Optimizer User Guide</a>.
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
     * Returns Amazon EC2 instance recommendations.
     * </p>
     * <p>
     * AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and
     * Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more
     * information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute
     * Optimizer User Guide</a>.
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
     * AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and
     * Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more
     * information, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/what-is.html">AWS Compute
     * Optimizer User Guide</a>.
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
     * If the account is a master account of an organization, this operation also confirms the enrollment status of
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
     * If the account is a master account of an organization, this operation also confirms the enrollment status of
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
     * Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a master account of an organization, this operation can also enroll member accounts within the
     * organization.
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
     * Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service.
     * </p>
     * <p>
     * If the account is a master account of an organization, this operation can also enroll member accounts within the
     * organization.
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
