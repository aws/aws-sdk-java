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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/GetScalingPlanResourceForecastData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScalingPlanResourceForecastDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     */
    private String scalingPlanName;
    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     */
    private Long scalingPlanVersion;
    /**
     * <p>
     * The namespace of the AWS service.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the name of
     * the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension for the resource.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * The type of forecast data to get.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LoadForecast</code>: The load metric forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityForecast</code>: The capacity forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data is
     * calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The calculation
     * used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.
     * </p>
     * </li>
     * </ul>
     */
    private String forecastDataType;
    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days
     * before the current date and time.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is seven days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @param scalingPlanName
     *        The name of the scaling plan.
     */

    public void setScalingPlanName(String scalingPlanName) {
        this.scalingPlanName = scalingPlanName;
    }

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @return The name of the scaling plan.
     */

    public String getScalingPlanName() {
        return this.scalingPlanName;
    }

    /**
     * <p>
     * The name of the scaling plan.
     * </p>
     * 
     * @param scalingPlanName
     *        The name of the scaling plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingPlanResourceForecastDataRequest withScalingPlanName(String scalingPlanName) {
        setScalingPlanName(scalingPlanName);
        return this;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan.
     */

    public void setScalingPlanVersion(Long scalingPlanVersion) {
        this.scalingPlanVersion = scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @return The version number of the scaling plan.
     */

    public Long getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     * <p>
     * The version number of the scaling plan.
     * </p>
     * 
     * @param scalingPlanVersion
     *        The version number of the scaling plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingPlanResourceForecastDataRequest withScalingPlanVersion(Long scalingPlanVersion) {
        setScalingPlanVersion(scalingPlanVersion);
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service.
     * </p>
     * 
     * @return The namespace of the AWS service.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public GetScalingPlanResourceForecastDataRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public GetScalingPlanResourceForecastDataRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the name of
     * the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource. This string consists of the resource type and unique identifier. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the
     *        name of the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *        service name. Example: <code>service/default/sample-webapp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the name of
     * the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the resource. This string consists of the resource type and unique identifier. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the
     *         name of the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *         service name. Example: <code>service/default/sample-webapp</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is
     *         the Spot Fleet request ID. Example:
     *         <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *         Example: <code>table/my-table</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is
     *         the resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *         name. Example: <code>cluster:my-db-cluster</code>.
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the name of
     * the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and service
     * name. Example: <code>service/default/sample-webapp</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     * resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource. This string consists of the resource type and unique identifier. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Auto Scaling group - The resource type is <code>autoScalingGroup</code> and the unique identifier is the
     *        name of the Auto Scaling group. Example: <code>autoScalingGroup/my-asg</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ECS service - The resource type is <code>service</code> and the unique identifier is the cluster name and
     *        service name. Example: <code>service/default/sample-webapp</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spot Fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot Fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the resource ID.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        resource ID. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingPlanResourceForecastDataRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension for the resource.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
     * </p>
     * 
     * @return The scalable dimension for the resource.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public GetScalingPlanResourceForecastDataRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public GetScalingPlanResourceForecastDataRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The type of forecast data to get.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LoadForecast</code>: The load metric forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityForecast</code>: The capacity forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data is
     * calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The calculation
     * used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.
     * </p>
     * </li>
     * </ul>
     * 
     * @param forecastDataType
     *        The type of forecast data to get.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LoadForecast</code>: The load metric forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityForecast</code>: The capacity forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data
     *        is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling
     *        instruction.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The
     *        calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling
     *        instruction.
     *        </p>
     *        </li>
     * @see ForecastDataType
     */

    public void setForecastDataType(String forecastDataType) {
        this.forecastDataType = forecastDataType;
    }

    /**
     * <p>
     * The type of forecast data to get.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LoadForecast</code>: The load metric forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityForecast</code>: The capacity forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data is
     * calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The calculation
     * used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of forecast data to get.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LoadForecast</code>: The load metric forecast.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CapacityForecast</code>: The capacity forecast.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This
     *         data is calculated as the larger of two values: the capacity forecast or the minimum capacity in the
     *         scaling instruction.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The
     *         calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling
     *         instruction.
     *         </p>
     *         </li>
     * @see ForecastDataType
     */

    public String getForecastDataType() {
        return this.forecastDataType;
    }

    /**
     * <p>
     * The type of forecast data to get.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LoadForecast</code>: The load metric forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityForecast</code>: The capacity forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data is
     * calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The calculation
     * used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.
     * </p>
     * </li>
     * </ul>
     * 
     * @param forecastDataType
     *        The type of forecast data to get.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LoadForecast</code>: The load metric forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityForecast</code>: The capacity forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data
     *        is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling
     *        instruction.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The
     *        calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling
     *        instruction.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForecastDataType
     */

    public GetScalingPlanResourceForecastDataRequest withForecastDataType(String forecastDataType) {
        setForecastDataType(forecastDataType);
        return this;
    }

    /**
     * <p>
     * The type of forecast data to get.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LoadForecast</code>: The load metric forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityForecast</code>: The capacity forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data is
     * calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling instruction.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The calculation
     * used is determined by the predictive scaling maximum capacity behavior setting in the scaling instruction.
     * </p>
     * </li>
     * </ul>
     * 
     * @param forecastDataType
     *        The type of forecast data to get.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LoadForecast</code>: The load metric forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityForecast</code>: The capacity forecast.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMinCapacity</code>: The minimum capacity for each scheduled scaling action. This data
     *        is calculated as the larger of two values: the capacity forecast or the minimum capacity in the scaling
     *        instruction.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ScheduledActionMaxCapacity</code>: The maximum capacity for each scheduled scaling action. The
     *        calculation used is determined by the predictive scaling maximum capacity behavior setting in the scaling
     *        instruction.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForecastDataType
     */

    public GetScalingPlanResourceForecastDataRequest withForecastDataType(ForecastDataType forecastDataType) {
        this.forecastDataType = forecastDataType.toString();
        return this;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days
     * before the current date and time.
     * </p>
     * 
     * @param startTime
     *        The inclusive start time of the time range for the forecast data to get. The date and time can be at most
     *        56 days before the current date and time.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days
     * before the current date and time.
     * </p>
     * 
     * @return The inclusive start time of the time range for the forecast data to get. The date and time can be at most
     *         56 days before the current date and time.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The inclusive start time of the time range for the forecast data to get. The date and time can be at most 56 days
     * before the current date and time.
     * </p>
     * 
     * @param startTime
     *        The inclusive start time of the time range for the forecast data to get. The date and time can be at most
     *        56 days before the current date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingPlanResourceForecastDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is seven days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @param endTime
     *        The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *        the start and end time is seven days. </p>
     *        <p>
     *        Although this parameter can accept a date and time that is more than two days in the future, the
     *        availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days
     *        in advance.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is seven days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @return The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *         the start and end time is seven days. </p>
     *         <p>
     *         Although this parameter can accept a date and time that is more than two days in the future, the
     *         availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days
     *         in advance.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The exclusive end time of the time range for the forecast data to get. The maximum time duration between the
     * start and end time is seven days.
     * </p>
     * <p>
     * Although this parameter can accept a date and time that is more than two days in the future, the availability of
     * forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days in advance.
     * </p>
     * 
     * @param endTime
     *        The exclusive end time of the time range for the forecast data to get. The maximum time duration between
     *        the start and end time is seven days. </p>
     *        <p>
     *        Although this parameter can accept a date and time that is more than two days in the future, the
     *        availability of forecast data has limits. AWS Auto Scaling only issues forecasts for periods of two days
     *        in advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetScalingPlanResourceForecastDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScalingPlanName() != null)
            sb.append("ScalingPlanName: ").append(getScalingPlanName()).append(",");
        if (getScalingPlanVersion() != null)
            sb.append("ScalingPlanVersion: ").append(getScalingPlanVersion()).append(",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: ").append(getScalableDimension()).append(",");
        if (getForecastDataType() != null)
            sb.append("ForecastDataType: ").append(getForecastDataType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetScalingPlanResourceForecastDataRequest == false)
            return false;
        GetScalingPlanResourceForecastDataRequest other = (GetScalingPlanResourceForecastDataRequest) obj;
        if (other.getScalingPlanName() == null ^ this.getScalingPlanName() == null)
            return false;
        if (other.getScalingPlanName() != null && other.getScalingPlanName().equals(this.getScalingPlanName()) == false)
            return false;
        if (other.getScalingPlanVersion() == null ^ this.getScalingPlanVersion() == null)
            return false;
        if (other.getScalingPlanVersion() != null && other.getScalingPlanVersion().equals(this.getScalingPlanVersion()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getForecastDataType() == null ^ this.getForecastDataType() == null)
            return false;
        if (other.getForecastDataType() != null && other.getForecastDataType().equals(this.getForecastDataType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingPlanName() == null) ? 0 : getScalingPlanName().hashCode());
        hashCode = prime * hashCode + ((getScalingPlanVersion() == null) ? 0 : getScalingPlanVersion().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getForecastDataType() == null) ? 0 : getForecastDataType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetScalingPlanResourceForecastDataRequest clone() {
        return (GetScalingPlanResourceForecastDataRequest) super.clone();
    }

}
