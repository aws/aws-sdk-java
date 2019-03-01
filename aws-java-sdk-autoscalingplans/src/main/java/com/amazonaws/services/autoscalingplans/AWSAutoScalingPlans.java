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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.autoscalingplans.model.*;

/**
 * Interface for accessing AWS Auto Scaling Plans.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.autoscalingplans.AbstractAWSAutoScalingPlans} instead.
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
public interface AWSAutoScalingPlans {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "autoscaling";

    /**
     * <p>
     * Creates a scaling plan.
     * </p>
     * 
     * @param createScalingPlanRequest
     * @return Result of the CreateScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws LimitExceededException
     *         Your account exceeded a limit. This exception is thrown when a per-account resource limit is exceeded.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.CreateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/CreateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    CreateScalingPlanResult createScalingPlan(CreateScalingPlanRequest createScalingPlanRequest);

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
     * @return Result of the DeleteScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws ObjectNotFoundException
     *         The specified object could not be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DeleteScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DeleteScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteScalingPlanResult deleteScalingPlan(DeleteScalingPlanRequest deleteScalingPlanRequest);

    /**
     * <p>
     * Describes the scalable resources in the specified scaling plan.
     * </p>
     * 
     * @param describeScalingPlanResourcesRequest
     * @return Result of the DescribeScalingPlanResources operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InvalidNextTokenException
     *         The token provided is not valid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DescribeScalingPlanResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlanResources"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingPlanResourcesResult describeScalingPlanResources(DescribeScalingPlanResourcesRequest describeScalingPlanResourcesRequest);

    /**
     * <p>
     * Describes one or more of your scaling plans.
     * </p>
     * 
     * @param describeScalingPlansRequest
     * @return Result of the DescribeScalingPlans operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InvalidNextTokenException
     *         The token provided is not valid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.DescribeScalingPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/DescribeScalingPlans"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingPlansResult describeScalingPlans(DescribeScalingPlansRequest describeScalingPlansRequest);

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
     * @return Result of the GetScalingPlanResourceForecastData operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSAutoScalingPlans.GetScalingPlanResourceForecastData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/GetScalingPlanResourceForecastData"
     *      target="_top">AWS API Documentation</a>
     */
    GetScalingPlanResourceForecastDataResult getScalingPlanResourceForecastData(
            GetScalingPlanResourceForecastDataRequest getScalingPlanResourceForecastDataRequest);

    /**
     * <p>
     * Updates the specified scaling plan.
     * </p>
     * <p>
     * You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     * </p>
     * 
     * @param updateScalingPlanRequest
     * @return Result of the UpdateScalingPlan operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the parameters provided.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you request an update to a scaling plan that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @throws ObjectNotFoundException
     *         The specified object could not be found.
     * @sample AWSAutoScalingPlans.UpdateScalingPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/UpdateScalingPlan"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateScalingPlanResult updateScalingPlan(UpdateScalingPlanRequest updateScalingPlanRequest);

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
