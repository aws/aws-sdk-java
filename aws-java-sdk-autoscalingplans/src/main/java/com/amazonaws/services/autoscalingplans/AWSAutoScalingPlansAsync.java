/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscalingplans;

import javax.annotation.Generated;

import com.amazonaws.services.autoscalingplans.model.*;

/**
 * Interface for accessing AWS Auto Scaling Plans asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlansAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Auto Scaling</fullname>
 * <p>
 * Use AWS Auto Scaling to quickly discover all the scalable AWS resources for your application and configure dynamic
 * scaling and predictive scaling for your resources using scaling plans. Use this service in conjunction with the
 * Amazon EC2 Auto Scaling, Application Auto Scaling, Amazon CloudWatch, and AWS CloudFormation services.
 * </p>
 * <p>
 * Currently, predictive scaling is only available for Amazon EC2 Auto Scaling groups.
 * </p>
 * <p>
 * For more information about AWS Auto Scaling, including information about granting IAM users required permissions for
 * AWS Auto Scaling actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html">AWS Auto Scaling User
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAutoScalingPlansAsync extends AWSAutoScalingPlans {

    /**
     * <p>
     * Creates a scaling plan.
     * </p>
     * 
     * @param createScalingPlanRequest
     * @return A Java Future containing the result of the CreateScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsync.CreateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/CreateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(CreateScalingPlanRequest createScalingPlanRequest);

    /**
     * <p>
     * Creates a scaling plan.
     * </p>
     * 
     * @param createScalingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsyncHandler.CreateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/CreateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(CreateScalingPlanRequest createScalingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScalingPlanRequest, CreateScalingPlanResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified scaling plan.
     * </p>
     * <p>
     * Deleting a scaling plan deletes the underlying <a>ScalingInstruction</a> for all of the scalable resources that
     * are covered by the plan.
     * </p>
     * <p>
     * If the plan has launched resources or has scaling activities in progress, you must delete those resources
     * separately.
     * </p>
     * 
     * @param deleteScalingPlanRequest
     * @return A Java Future containing the result of the DeleteScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsync.DeleteScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DeleteScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(DeleteScalingPlanRequest deleteScalingPlanRequest);

    /**
     * <p>
     * Deletes the specified scaling plan.
     * </p>
     * <p>
     * Deleting a scaling plan deletes the underlying <a>ScalingInstruction</a> for all of the scalable resources that
     * are covered by the plan.
     * </p>
     * <p>
     * If the plan has launched resources or has scaling activities in progress, you must delete those resources
     * separately.
     * </p>
     * 
     * @param deleteScalingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsyncHandler.DeleteScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DeleteScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(DeleteScalingPlanRequest deleteScalingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPlanRequest, DeleteScalingPlanResult> asyncHandler);

    /**
     * <p>
     * Describes the scalable resources in the specified scaling plan.
     * </p>
     * 
     * @param describeScalingPlanResourcesRequest
     * @return A Java Future containing the result of the DescribeScalingPlanResources operation returned by the
     *         service.
     * @sample AWSAutoScalingPlansAsync.DescribeScalingPlanResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlanResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(
            DescribeScalingPlanResourcesRequest describeScalingPlanResourcesRequest);

    /**
     * <p>
     * Describes the scalable resources in the specified scaling plan.
     * </p>
     * 
     * @param describeScalingPlanResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPlanResources operation returned by the
     *         service.
     * @sample AWSAutoScalingPlansAsyncHandler.DescribeScalingPlanResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlanResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(
            DescribeScalingPlanResourcesRequest describeScalingPlanResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPlanResourcesRequest, DescribeScalingPlanResourcesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your scaling plans.
     * </p>
     * 
     * @param describeScalingPlansRequest
     * @return A Java Future containing the result of the DescribeScalingPlans operation returned by the service.
     * @sample AWSAutoScalingPlansAsync.DescribeScalingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(DescribeScalingPlansRequest describeScalingPlansRequest);

    /**
     * <p>
     * Describes one or more of your scaling plans.
     * </p>
     * 
     * @param describeScalingPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPlans operation returned by the service.
     * @sample AWSAutoScalingPlansAsyncHandler.DescribeScalingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(DescribeScalingPlansRequest describeScalingPlansRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPlansRequest, DescribeScalingPlansResult> asyncHandler);

    /**
     * <p>
     * Retrieves the forecast data for a scalable resource.
     * </p>
     * <p>
     * Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data
     * points from a specified CloudWatch load metric. Data points are available for up to 56 days.
     * </p>
     * 
     * @param getScalingPlanResourceForecastDataRequest
     * @return A Java Future containing the result of the GetScalingPlanResourceForecastData operation returned by the
     *         service.
     * @sample AWSAutoScalingPlansAsync.GetScalingPlanResourceForecastData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/GetScalingPlanResourceForecastData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetScalingPlanResourceForecastDataResult> getScalingPlanResourceForecastDataAsync(
            GetScalingPlanResourceForecastDataRequest getScalingPlanResourceForecastDataRequest);

    /**
     * <p>
     * Retrieves the forecast data for a scalable resource.
     * </p>
     * <p>
     * Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data
     * points from a specified CloudWatch load metric. Data points are available for up to 56 days.
     * </p>
     * 
     * @param getScalingPlanResourceForecastDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScalingPlanResourceForecastData operation returned by the
     *         service.
     * @sample AWSAutoScalingPlansAsyncHandler.GetScalingPlanResourceForecastData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/GetScalingPlanResourceForecastData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetScalingPlanResourceForecastDataResult> getScalingPlanResourceForecastDataAsync(
            GetScalingPlanResourceForecastDataRequest getScalingPlanResourceForecastDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetScalingPlanResourceForecastDataRequest, GetScalingPlanResourceForecastDataResult> asyncHandler);

    /**
     * <p>
     * Updates the specified scaling plan.
     * </p>
     * <p>
     * You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     * </p>
     * 
     * @param updateScalingPlanRequest
     * @return A Java Future containing the result of the UpdateScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsync.UpdateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/UpdateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateScalingPlanResult> updateScalingPlanAsync(UpdateScalingPlanRequest updateScalingPlanRequest);

    /**
     * <p>
     * Updates the specified scaling plan.
     * </p>
     * <p>
     * You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     * </p>
     * 
     * @param updateScalingPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScalingPlan operation returned by the service.
     * @sample AWSAutoScalingPlansAsyncHandler.UpdateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/UpdateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateScalingPlanResult> updateScalingPlanAsync(UpdateScalingPlanRequest updateScalingPlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScalingPlanRequest, UpdateScalingPlanResult> asyncHandler);

}
