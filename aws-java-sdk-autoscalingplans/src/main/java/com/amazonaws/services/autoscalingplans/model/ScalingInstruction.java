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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a scaling instruction for a scalable resource.
 * </p>
 * <p>
 * The scaling instruction is used in combination with a scaling plan, which is a set of instructions for configuring
 * dynamic scaling and predictive scaling for the scalable resources in your application. Each scaling instruction
 * applies to one resource.
 * </p>
 * <p>
 * AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions. Target tracking scaling
 * policies adjust the capacity of your scalable resource as required to maintain resource utilization at the target
 * value that you specified.
 * </p>
 * <p>
 * AWS Auto Scaling also configures predictive scaling for your Amazon EC2 Auto Scaling groups using a subset of
 * parameters, including the load metric, the scaling metric, the target value for the scaling metric, the predictive
 * scaling mode (forecast and scale or forecast only), and the desired behavior when the forecast capacity exceeds the
 * maximum capacity of the resource. With predictive scaling, AWS Auto Scaling generates forecasts with traffic
 * predictions for the two days ahead and schedules scaling actions that proactively add and remove resource capacity to
 * match the forecast.
 * </p>
 * <p>
 * We recommend waiting a minimum of 24 hours after creating an Auto Scaling group to configure predictive scaling. At
 * minimum, there must be 24 hours of historical data to generate a forecast.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/plans/userguide/auto-scaling-getting-started.html">Getting Started with
 * AWS Auto Scaling</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingInstruction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingInstruction implements Serializable, Cloneable, StructuredPojo {

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
     * The scalable dimension associated with the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     */
    private String scalableDimension;
    /**
     * <p>
     * The minimum capacity of the resource.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting
     * for <b>PredictiveScalingMaxCapacityBehavior</b>.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a
     * specific scaling metric and a target value for the metric, along with various parameters to use with dynamic
     * scaling.
     * </p>
     * <p>
     * With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that
     * provides the largest capacity for both scale in and scale out.
     * </p>
     * <p>
     * Condition: The scaling metric must be unique across target tracking configurations.
     * </p>
     */
    private java.util.List<TargetTrackingConfiguration> targetTrackingConfigurations;
    /**
     * <p>
     * The predefined load metric to use for predictive scaling. This parameter or a
     * <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     */
    private PredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
    /**
     * <p>
     * The customized load metric to use for predictive scaling. This parameter or a
     * <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     */
    private CustomizedLoadMetricSpecification customizedLoadMetricSpecification;
    /**
     * <p>
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     * example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of
     * the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be
     * provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required
     * depends on several factors, such as the size of the instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300
     * seconds.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     */
    private Integer scheduledActionBufferTime;
    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity to equal but not exceed forecast capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra
     * capacity if unexpected traffic occurs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     */
    private String predictiveScalingMaxCapacityBehavior;
    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling. Required if the <b>PredictiveScalingMaxCapacityBehavior</b> is
     * set to <code>SetMaxCapacityAboveForecastCapacity</code>, and cannot be used otherwise.
     * </p>
     * <p>
     * The range is 1-100.
     * </p>
     */
    private Integer predictiveScalingMaxCapacityBuffer;
    /**
     * <p>
     * The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto Scaling
     * forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast.
     * </p>
     */
    private String predictiveScalingMode;
    /**
     * <p>
     * Controls whether a resource's externally created scaling policies are kept or replaced.
     * </p>
     * <p>
     * The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     * <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are deleted and
     * new target tracking scaling policies created.
     * </p>
     * <p>
     * Only valid when configuring dynamic scaling.
     * </p>
     * <p>
     * Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more
     * than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
     * </p>
     */
    private String scalingPolicyUpdateBehavior;
    /**
     * <p>
     * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto
     * Scaling creates target tracking scaling policies based on the specified target tracking configurations.
     * </p>
     * <p>
     * The default is enabled (<code>false</code>).
     * </p>
     */
    private Boolean disableDynamicScaling;

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

    public ScalingInstruction withServiceNamespace(String serviceNamespace) {
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

    public ScalingInstruction withServiceNamespace(ServiceNamespace serviceNamespace) {
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
     *        The ID of the resource. This string consists of the resource type and unique identifier.</p>
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
     * @return The ID of the resource. This string consists of the resource type and unique identifier.</p>
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
     *        The ID of the resource. This string consists of the resource type and unique identifier.</p>
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

    public ScalingInstruction withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     *        </p>
     *        </li>
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scalable dimension associated with the resource.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling
     *         group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *         secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *         secondary index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *         Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     *         </p>
     *         </li>
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingInstruction withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global secondary
     * index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster. Available for
     * Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>autoscaling:autoScalingGroup:DesiredCapacity</code> - The desired capacity of an Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ecs:service:DesiredCount</code> - The desired task count of an ECS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot Fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:table:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:ReadCapacityUnits</code> - The provisioned read capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dynamodb:index:WriteCapacityUnits</code> - The provisioned write capacity for a DynamoDB global
     *        secondary index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rds:cluster:ReadReplicaCount</code> - The count of Aurora Replicas in an Aurora DB cluster.
     *        Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingInstruction withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The minimum capacity of the resource.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity of the resource.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum capacity of the resource.
     * </p>
     * 
     * @return The minimum capacity of the resource.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum capacity of the resource.
     * </p>
     * 
     * @param minCapacity
     *        The minimum capacity of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting
     * for <b>PredictiveScalingMaxCapacityBehavior</b>.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default
     *        setting for <b>PredictiveScalingMaxCapacityBehavior</b>.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting
     * for <b>PredictiveScalingMaxCapacityBehavior</b>.
     * </p>
     * 
     * @return The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default
     *         setting for <b>PredictiveScalingMaxCapacityBehavior</b>.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting
     * for <b>PredictiveScalingMaxCapacityBehavior</b>.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default
     *        setting for <b>PredictiveScalingMaxCapacityBehavior</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a
     * specific scaling metric and a target value for the metric, along with various parameters to use with dynamic
     * scaling.
     * </p>
     * <p>
     * With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that
     * provides the largest capacity for both scale in and scale out.
     * </p>
     * <p>
     * Condition: The scaling metric must be unique across target tracking configurations.
     * </p>
     * 
     * @return The structure that defines new target tracking configurations (up to 10). Each of these structures
     *         includes a specific scaling metric and a target value for the metric, along with various parameters to
     *         use with dynamic scaling. </p>
     *         <p>
     *         With predictive scaling and dynamic scaling, the resource scales based on the target tracking
     *         configuration that provides the largest capacity for both scale in and scale out.
     *         </p>
     *         <p>
     *         Condition: The scaling metric must be unique across target tracking configurations.
     */

    public java.util.List<TargetTrackingConfiguration> getTargetTrackingConfigurations() {
        return targetTrackingConfigurations;
    }

    /**
     * <p>
     * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a
     * specific scaling metric and a target value for the metric, along with various parameters to use with dynamic
     * scaling.
     * </p>
     * <p>
     * With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that
     * provides the largest capacity for both scale in and scale out.
     * </p>
     * <p>
     * Condition: The scaling metric must be unique across target tracking configurations.
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The structure that defines new target tracking configurations (up to 10). Each of these structures
     *        includes a specific scaling metric and a target value for the metric, along with various parameters to use
     *        with dynamic scaling. </p>
     *        <p>
     *        With predictive scaling and dynamic scaling, the resource scales based on the target tracking
     *        configuration that provides the largest capacity for both scale in and scale out.
     *        </p>
     *        <p>
     *        Condition: The scaling metric must be unique across target tracking configurations.
     */

    public void setTargetTrackingConfigurations(java.util.Collection<TargetTrackingConfiguration> targetTrackingConfigurations) {
        if (targetTrackingConfigurations == null) {
            this.targetTrackingConfigurations = null;
            return;
        }

        this.targetTrackingConfigurations = new java.util.ArrayList<TargetTrackingConfiguration>(targetTrackingConfigurations);
    }

    /**
     * <p>
     * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a
     * specific scaling metric and a target value for the metric, along with various parameters to use with dynamic
     * scaling.
     * </p>
     * <p>
     * With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that
     * provides the largest capacity for both scale in and scale out.
     * </p>
     * <p>
     * Condition: The scaling metric must be unique across target tracking configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTrackingConfigurations(java.util.Collection)} or
     * {@link #withTargetTrackingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The structure that defines new target tracking configurations (up to 10). Each of these structures
     *        includes a specific scaling metric and a target value for the metric, along with various parameters to use
     *        with dynamic scaling. </p>
     *        <p>
     *        With predictive scaling and dynamic scaling, the resource scales based on the target tracking
     *        configuration that provides the largest capacity for both scale in and scale out.
     *        </p>
     *        <p>
     *        Condition: The scaling metric must be unique across target tracking configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withTargetTrackingConfigurations(TargetTrackingConfiguration... targetTrackingConfigurations) {
        if (this.targetTrackingConfigurations == null) {
            setTargetTrackingConfigurations(new java.util.ArrayList<TargetTrackingConfiguration>(targetTrackingConfigurations.length));
        }
        for (TargetTrackingConfiguration ele : targetTrackingConfigurations) {
            this.targetTrackingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The structure that defines new target tracking configurations (up to 10). Each of these structures includes a
     * specific scaling metric and a target value for the metric, along with various parameters to use with dynamic
     * scaling.
     * </p>
     * <p>
     * With predictive scaling and dynamic scaling, the resource scales based on the target tracking configuration that
     * provides the largest capacity for both scale in and scale out.
     * </p>
     * <p>
     * Condition: The scaling metric must be unique across target tracking configurations.
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The structure that defines new target tracking configurations (up to 10). Each of these structures
     *        includes a specific scaling metric and a target value for the metric, along with various parameters to use
     *        with dynamic scaling. </p>
     *        <p>
     *        With predictive scaling and dynamic scaling, the resource scales based on the target tracking
     *        configuration that provides the largest capacity for both scale in and scale out.
     *        </p>
     *        <p>
     *        Condition: The scaling metric must be unique across target tracking configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withTargetTrackingConfigurations(java.util.Collection<TargetTrackingConfiguration> targetTrackingConfigurations) {
        setTargetTrackingConfigurations(targetTrackingConfigurations);
        return this;
    }

    /**
     * <p>
     * The predefined load metric to use for predictive scaling. This parameter or a
     * <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @param predefinedLoadMetricSpecification
     *        The predefined load metric to use for predictive scaling. This parameter or a
     *        <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *        used otherwise.
     */

    public void setPredefinedLoadMetricSpecification(PredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
    }

    /**
     * <p>
     * The predefined load metric to use for predictive scaling. This parameter or a
     * <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @return The predefined load metric to use for predictive scaling. This parameter or a
     *         <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *         used otherwise.
     */

    public PredefinedLoadMetricSpecification getPredefinedLoadMetricSpecification() {
        return this.predefinedLoadMetricSpecification;
    }

    /**
     * <p>
     * The predefined load metric to use for predictive scaling. This parameter or a
     * <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @param predefinedLoadMetricSpecification
     *        The predefined load metric to use for predictive scaling. This parameter or a
     *        <b>CustomizedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *        used otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withPredefinedLoadMetricSpecification(PredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
        setPredefinedLoadMetricSpecification(predefinedLoadMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The customized load metric to use for predictive scaling. This parameter or a
     * <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @param customizedLoadMetricSpecification
     *        The customized load metric to use for predictive scaling. This parameter or a
     *        <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *        used otherwise.
     */

    public void setCustomizedLoadMetricSpecification(CustomizedLoadMetricSpecification customizedLoadMetricSpecification) {
        this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
    }

    /**
     * <p>
     * The customized load metric to use for predictive scaling. This parameter or a
     * <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @return The customized load metric to use for predictive scaling. This parameter or a
     *         <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *         used otherwise.
     */

    public CustomizedLoadMetricSpecification getCustomizedLoadMetricSpecification() {
        return this.customizedLoadMetricSpecification;
    }

    /**
     * <p>
     * The customized load metric to use for predictive scaling. This parameter or a
     * <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be used
     * otherwise.
     * </p>
     * 
     * @param customizedLoadMetricSpecification
     *        The customized load metric to use for predictive scaling. This parameter or a
     *        <b>PredefinedLoadMetricSpecification</b> is required when configuring predictive scaling, and cannot be
     *        used otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withCustomizedLoadMetricSpecification(CustomizedLoadMetricSpecification customizedLoadMetricSpecification) {
        setCustomizedLoadMetricSpecification(customizedLoadMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     * example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of
     * the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be
     * provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required
     * depends on several factors, such as the size of the instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300
     * seconds.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @param scheduledActionBufferTime
     *        The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     *        example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run
     *        time of the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources
     *        time to be provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual
     *        amount of time required depends on several factors, such as the size of the instance and whether there are
     *        startup scripts to complete. </p>
     *        <p>
     *        The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is
     *        300 seconds.
     *        </p>
     *        <p>
     *        Only valid when configuring predictive scaling.
     */

    public void setScheduledActionBufferTime(Integer scheduledActionBufferTime) {
        this.scheduledActionBufferTime = scheduledActionBufferTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     * example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of
     * the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be
     * provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required
     * depends on several factors, such as the size of the instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300
     * seconds.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @return The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     *         example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run
     *         time of the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources
     *         time to be provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual
     *         amount of time required depends on several factors, such as the size of the instance and whether there
     *         are startup scripts to complete. </p>
     *         <p>
     *         The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is
     *         300 seconds.
     *         </p>
     *         <p>
     *         Only valid when configuring predictive scaling.
     */

    public Integer getScheduledActionBufferTime() {
        return this.scheduledActionBufferTime;
    }

    /**
     * <p>
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     * example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run time of
     * the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources time to be
     * provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual amount of time required
     * depends on several factors, such as the size of the instance and whether there are startup scripts to complete.
     * </p>
     * <p>
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is 300
     * seconds.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @param scheduledActionBufferTime
     *        The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out. For
     *        example, if the forecast says to add capacity at 10:00 AM, and the buffer time is 5 minutes, then the run
     *        time of the corresponding scheduled scaling action will be 9:55 AM. The intention is to give resources
     *        time to be provisioned. For example, it can take a few minutes to launch an EC2 instance. The actual
     *        amount of time required depends on several factors, such as the size of the instance and whether there are
     *        startup scripts to complete. </p>
     *        <p>
     *        The value must be less than the forecast interval duration of 3600 seconds (60 minutes). The default is
     *        300 seconds.
     *        </p>
     *        <p>
     *        Only valid when configuring predictive scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withScheduledActionBufferTime(Integer scheduledActionBufferTime) {
        setScheduledActionBufferTime(scheduledActionBufferTime);
        return this;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity to equal but not exceed forecast capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra
     * capacity if unexpected traffic occurs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @param predictiveScalingMaxCapacityBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>
     *        .</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher
     *        than the maximum capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than
     *        the maximum capacity to equal but not exceed forecast capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher
     *        than the maximum capacity by a specified buffer value. The intention is to give the target tracking
     *        scaling policy extra capacity if unexpected traffic occurs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Only valid when configuring predictive scaling.
     * @see PredictiveScalingMaxCapacityBehavior
     */

    public void setPredictiveScalingMaxCapacityBehavior(String predictiveScalingMaxCapacityBehavior) {
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity to equal but not exceed forecast capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra
     * capacity if unexpected traffic occurs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @return Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *         capacity specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>
     *         .</p>
     *         <p>
     *         The following are possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher
     *         than the maximum capacity. The maximum capacity is enforced as a hard limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than
     *         the maximum capacity to equal but not exceed forecast capacity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher
     *         than the maximum capacity by a specified buffer value. The intention is to give the target tracking
     *         scaling policy extra capacity if unexpected traffic occurs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Only valid when configuring predictive scaling.
     * @see PredictiveScalingMaxCapacityBehavior
     */

    public String getPredictiveScalingMaxCapacityBehavior() {
        return this.predictiveScalingMaxCapacityBehavior;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity to equal but not exceed forecast capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra
     * capacity if unexpected traffic occurs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @param predictiveScalingMaxCapacityBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>
     *        .</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher
     *        than the maximum capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than
     *        the maximum capacity to equal but not exceed forecast capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher
     *        than the maximum capacity by a specified buffer value. The intention is to give the target tracking
     *        scaling policy extra capacity if unexpected traffic occurs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Only valid when configuring predictive scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMaxCapacityBehavior
     */

    public ScalingInstruction withPredictiveScalingMaxCapacityBehavior(String predictiveScalingMaxCapacityBehavior) {
        setPredictiveScalingMaxCapacityBehavior(predictiveScalingMaxCapacityBehavior);
        return this;
    }

    /**
     * <p>
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity
     * specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>.
     * </p>
     * <p>
     * The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity to equal but not exceed forecast capacity.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than the
     * maximum capacity by a specified buffer value. The intention is to give the target tracking scaling policy extra
     * capacity if unexpected traffic occurs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only valid when configuring predictive scaling.
     * </p>
     * 
     * @param predictiveScalingMaxCapacityBehavior
     *        Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum
     *        capacity specified for the resource. The default value is <code>SetForecastCapacityToMaxCapacity</code>
     *        .</p>
     *        <p>
     *        The following are possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SetForecastCapacityToMaxCapacity</code> - AWS Auto Scaling cannot scale resource capacity higher
     *        than the maximum capacity. The maximum capacity is enforced as a hard limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityToForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher than
     *        the maximum capacity to equal but not exceed forecast capacity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SetMaxCapacityAboveForecastCapacity</code> - AWS Auto Scaling may scale resource capacity higher
     *        than the maximum capacity by a specified buffer value. The intention is to give the target tracking
     *        scaling policy extra capacity if unexpected traffic occurs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Only valid when configuring predictive scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMaxCapacityBehavior
     */

    public ScalingInstruction withPredictiveScalingMaxCapacityBehavior(PredictiveScalingMaxCapacityBehavior predictiveScalingMaxCapacityBehavior) {
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling. Required if the <b>PredictiveScalingMaxCapacityBehavior</b> is
     * set to <code>SetMaxCapacityAboveForecastCapacity</code>, and cannot be used otherwise.
     * </p>
     * <p>
     * The range is 1-100.
     * </p>
     * 
     * @param predictiveScalingMaxCapacityBuffer
     *        The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *        capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *        buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *        capacity is 40, then the effective maximum capacity is 55.</p>
     *        <p>
     *        Only valid when configuring predictive scaling. Required if the
     *        <b>PredictiveScalingMaxCapacityBehavior</b> is set to <code>SetMaxCapacityAboveForecastCapacity</code>,
     *        and cannot be used otherwise.
     *        </p>
     *        <p>
     *        The range is 1-100.
     */

    public void setPredictiveScalingMaxCapacityBuffer(Integer predictiveScalingMaxCapacityBuffer) {
        this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling. Required if the <b>PredictiveScalingMaxCapacityBehavior</b> is
     * set to <code>SetMaxCapacityAboveForecastCapacity</code>, and cannot be used otherwise.
     * </p>
     * <p>
     * The range is 1-100.
     * </p>
     * 
     * @return The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *         capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *         buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *         capacity is 40, then the effective maximum capacity is 55.</p>
     *         <p>
     *         Only valid when configuring predictive scaling. Required if the
     *         <b>PredictiveScalingMaxCapacityBehavior</b> is set to <code>SetMaxCapacityAboveForecastCapacity</code>,
     *         and cannot be used otherwise.
     *         </p>
     *         <p>
     *         The range is 1-100.
     */

    public Integer getPredictiveScalingMaxCapacityBuffer() {
        return this.predictiveScalingMaxCapacityBuffer;
    }

    /**
     * <p>
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * The value is specified as a percentage relative to the forecast capacity. For example, if the buffer is 10, this
     * means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum capacity is 40, then the
     * effective maximum capacity is 55.
     * </p>
     * <p>
     * Only valid when configuring predictive scaling. Required if the <b>PredictiveScalingMaxCapacityBehavior</b> is
     * set to <code>SetMaxCapacityAboveForecastCapacity</code>, and cannot be used otherwise.
     * </p>
     * <p>
     * The range is 1-100.
     * </p>
     * 
     * @param predictiveScalingMaxCapacityBuffer
     *        The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum
     *        capacity. The value is specified as a percentage relative to the forecast capacity. For example, if the
     *        buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the maximum
     *        capacity is 40, then the effective maximum capacity is 55.</p>
     *        <p>
     *        Only valid when configuring predictive scaling. Required if the
     *        <b>PredictiveScalingMaxCapacityBehavior</b> is set to <code>SetMaxCapacityAboveForecastCapacity</code>,
     *        and cannot be used otherwise.
     *        </p>
     *        <p>
     *        The range is 1-100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withPredictiveScalingMaxCapacityBuffer(Integer predictiveScalingMaxCapacityBuffer) {
        setPredictiveScalingMaxCapacityBuffer(predictiveScalingMaxCapacityBuffer);
        return this;
    }

    /**
     * <p>
     * The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto Scaling
     * forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast.
     * </p>
     * 
     * @param predictiveScalingMode
     *        The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto
     *        Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity
     *        forecast.
     * @see PredictiveScalingMode
     */

    public void setPredictiveScalingMode(String predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode;
    }

    /**
     * <p>
     * The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto Scaling
     * forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast.
     * </p>
     * 
     * @return The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto
     *         Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity
     *         forecast.
     * @see PredictiveScalingMode
     */

    public String getPredictiveScalingMode() {
        return this.predictiveScalingMode;
    }

    /**
     * <p>
     * The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto Scaling
     * forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast.
     * </p>
     * 
     * @param predictiveScalingMode
     *        The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto
     *        Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity
     *        forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMode
     */

    public ScalingInstruction withPredictiveScalingMode(String predictiveScalingMode) {
        setPredictiveScalingMode(predictiveScalingMode);
        return this;
    }

    /**
     * <p>
     * The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto Scaling
     * forecasts capacity but does not create any scheduled scaling actions based on the capacity forecast.
     * </p>
     * 
     * @param predictiveScalingMode
     *        The predictive scaling mode. The default value is <code>ForecastAndScale</code>. Otherwise, AWS Auto
     *        Scaling forecasts capacity but does not create any scheduled scaling actions based on the capacity
     *        forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PredictiveScalingMode
     */

    public ScalingInstruction withPredictiveScalingMode(PredictiveScalingMode predictiveScalingMode) {
        this.predictiveScalingMode = predictiveScalingMode.toString();
        return this;
    }

    /**
     * <p>
     * Controls whether a resource's externally created scaling policies are kept or replaced.
     * </p>
     * <p>
     * The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     * <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are deleted and
     * new target tracking scaling policies created.
     * </p>
     * <p>
     * Only valid when configuring dynamic scaling.
     * </p>
     * <p>
     * Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more
     * than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
     * </p>
     * 
     * @param scalingPolicyUpdateBehavior
     *        Controls whether a resource's externally created scaling policies are kept or replaced. </p>
     *        <p>
     *        The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     *        <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are
     *        deleted and new target tracking scaling policies created.
     *        </p>
     *        <p>
     *        Only valid when configuring dynamic scaling.
     *        </p>
     *        <p>
     *        Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are
     *        more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new
     *        ones.
     * @see ScalingPolicyUpdateBehavior
     */

    public void setScalingPolicyUpdateBehavior(String scalingPolicyUpdateBehavior) {
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
    }

    /**
     * <p>
     * Controls whether a resource's externally created scaling policies are kept or replaced.
     * </p>
     * <p>
     * The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     * <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are deleted and
     * new target tracking scaling policies created.
     * </p>
     * <p>
     * Only valid when configuring dynamic scaling.
     * </p>
     * <p>
     * Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more
     * than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
     * </p>
     * 
     * @return Controls whether a resource's externally created scaling policies are kept or replaced. </p>
     *         <p>
     *         The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     *         <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are
     *         deleted and new target tracking scaling policies created.
     *         </p>
     *         <p>
     *         Only valid when configuring dynamic scaling.
     *         </p>
     *         <p>
     *         Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are
     *         more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create
     *         new ones.
     * @see ScalingPolicyUpdateBehavior
     */

    public String getScalingPolicyUpdateBehavior() {
        return this.scalingPolicyUpdateBehavior;
    }

    /**
     * <p>
     * Controls whether a resource's externally created scaling policies are kept or replaced.
     * </p>
     * <p>
     * The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     * <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are deleted and
     * new target tracking scaling policies created.
     * </p>
     * <p>
     * Only valid when configuring dynamic scaling.
     * </p>
     * <p>
     * Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more
     * than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
     * </p>
     * 
     * @param scalingPolicyUpdateBehavior
     *        Controls whether a resource's externally created scaling policies are kept or replaced. </p>
     *        <p>
     *        The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     *        <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are
     *        deleted and new target tracking scaling policies created.
     *        </p>
     *        <p>
     *        Only valid when configuring dynamic scaling.
     *        </p>
     *        <p>
     *        Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are
     *        more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new
     *        ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPolicyUpdateBehavior
     */

    public ScalingInstruction withScalingPolicyUpdateBehavior(String scalingPolicyUpdateBehavior) {
        setScalingPolicyUpdateBehavior(scalingPolicyUpdateBehavior);
        return this;
    }

    /**
     * <p>
     * Controls whether a resource's externally created scaling policies are kept or replaced.
     * </p>
     * <p>
     * The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     * <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are deleted and
     * new target tracking scaling policies created.
     * </p>
     * <p>
     * Only valid when configuring dynamic scaling.
     * </p>
     * <p>
     * Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are more
     * than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new ones.
     * </p>
     * 
     * @param scalingPolicyUpdateBehavior
     *        Controls whether a resource's externally created scaling policies are kept or replaced. </p>
     *        <p>
     *        The default value is <code>KeepExternalPolicies</code>. If the parameter is set to
     *        <code>ReplaceExternalPolicies</code>, any scaling policies that are external to AWS Auto Scaling are
     *        deleted and new target tracking scaling policies created.
     *        </p>
     *        <p>
     *        Only valid when configuring dynamic scaling.
     *        </p>
     *        <p>
     *        Condition: The number of existing policies to be replaced must be less than or equal to 50. If there are
     *        more than 50 policies to be replaced, AWS Auto Scaling keeps all existing policies and does not create new
     *        ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingPolicyUpdateBehavior
     */

    public ScalingInstruction withScalingPolicyUpdateBehavior(ScalingPolicyUpdateBehavior scalingPolicyUpdateBehavior) {
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto
     * Scaling creates target tracking scaling policies based on the specified target tracking configurations.
     * </p>
     * <p>
     * The default is enabled (<code>false</code>).
     * </p>
     * 
     * @param disableDynamicScaling
     *        Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS
     *        Auto Scaling creates target tracking scaling policies based on the specified target tracking
     *        configurations. </p>
     *        <p>
     *        The default is enabled (<code>false</code>).
     */

    public void setDisableDynamicScaling(Boolean disableDynamicScaling) {
        this.disableDynamicScaling = disableDynamicScaling;
    }

    /**
     * <p>
     * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto
     * Scaling creates target tracking scaling policies based on the specified target tracking configurations.
     * </p>
     * <p>
     * The default is enabled (<code>false</code>).
     * </p>
     * 
     * @return Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS
     *         Auto Scaling creates target tracking scaling policies based on the specified target tracking
     *         configurations. </p>
     *         <p>
     *         The default is enabled (<code>false</code>).
     */

    public Boolean getDisableDynamicScaling() {
        return this.disableDynamicScaling;
    }

    /**
     * <p>
     * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto
     * Scaling creates target tracking scaling policies based on the specified target tracking configurations.
     * </p>
     * <p>
     * The default is enabled (<code>false</code>).
     * </p>
     * 
     * @param disableDynamicScaling
     *        Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS
     *        Auto Scaling creates target tracking scaling policies based on the specified target tracking
     *        configurations. </p>
     *        <p>
     *        The default is enabled (<code>false</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withDisableDynamicScaling(Boolean disableDynamicScaling) {
        setDisableDynamicScaling(disableDynamicScaling);
        return this;
    }

    /**
     * <p>
     * Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS Auto
     * Scaling creates target tracking scaling policies based on the specified target tracking configurations.
     * </p>
     * <p>
     * The default is enabled (<code>false</code>).
     * </p>
     * 
     * @return Controls whether dynamic scaling by AWS Auto Scaling is disabled. When dynamic scaling is enabled, AWS
     *         Auto Scaling creates target tracking scaling policies based on the specified target tracking
     *         configurations. </p>
     *         <p>
     *         The default is enabled (<code>false</code>).
     */

    public Boolean isDisableDynamicScaling() {
        return this.disableDynamicScaling;
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: ").append(getServiceNamespace()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: ").append(getScalableDimension()).append(",");
        if (getMinCapacity() != null)
            sb.append("MinCapacity: ").append(getMinCapacity()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getTargetTrackingConfigurations() != null)
            sb.append("TargetTrackingConfigurations: ").append(getTargetTrackingConfigurations()).append(",");
        if (getPredefinedLoadMetricSpecification() != null)
            sb.append("PredefinedLoadMetricSpecification: ").append(getPredefinedLoadMetricSpecification()).append(",");
        if (getCustomizedLoadMetricSpecification() != null)
            sb.append("CustomizedLoadMetricSpecification: ").append(getCustomizedLoadMetricSpecification()).append(",");
        if (getScheduledActionBufferTime() != null)
            sb.append("ScheduledActionBufferTime: ").append(getScheduledActionBufferTime()).append(",");
        if (getPredictiveScalingMaxCapacityBehavior() != null)
            sb.append("PredictiveScalingMaxCapacityBehavior: ").append(getPredictiveScalingMaxCapacityBehavior()).append(",");
        if (getPredictiveScalingMaxCapacityBuffer() != null)
            sb.append("PredictiveScalingMaxCapacityBuffer: ").append(getPredictiveScalingMaxCapacityBuffer()).append(",");
        if (getPredictiveScalingMode() != null)
            sb.append("PredictiveScalingMode: ").append(getPredictiveScalingMode()).append(",");
        if (getScalingPolicyUpdateBehavior() != null)
            sb.append("ScalingPolicyUpdateBehavior: ").append(getScalingPolicyUpdateBehavior()).append(",");
        if (getDisableDynamicScaling() != null)
            sb.append("DisableDynamicScaling: ").append(getDisableDynamicScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingInstruction == false)
            return false;
        ScalingInstruction other = (ScalingInstruction) obj;
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
        if (other.getMinCapacity() == null ^ this.getMinCapacity() == null)
            return false;
        if (other.getMinCapacity() != null && other.getMinCapacity().equals(this.getMinCapacity()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getTargetTrackingConfigurations() == null ^ this.getTargetTrackingConfigurations() == null)
            return false;
        if (other.getTargetTrackingConfigurations() != null && other.getTargetTrackingConfigurations().equals(this.getTargetTrackingConfigurations()) == false)
            return false;
        if (other.getPredefinedLoadMetricSpecification() == null ^ this.getPredefinedLoadMetricSpecification() == null)
            return false;
        if (other.getPredefinedLoadMetricSpecification() != null
                && other.getPredefinedLoadMetricSpecification().equals(this.getPredefinedLoadMetricSpecification()) == false)
            return false;
        if (other.getCustomizedLoadMetricSpecification() == null ^ this.getCustomizedLoadMetricSpecification() == null)
            return false;
        if (other.getCustomizedLoadMetricSpecification() != null
                && other.getCustomizedLoadMetricSpecification().equals(this.getCustomizedLoadMetricSpecification()) == false)
            return false;
        if (other.getScheduledActionBufferTime() == null ^ this.getScheduledActionBufferTime() == null)
            return false;
        if (other.getScheduledActionBufferTime() != null && other.getScheduledActionBufferTime().equals(this.getScheduledActionBufferTime()) == false)
            return false;
        if (other.getPredictiveScalingMaxCapacityBehavior() == null ^ this.getPredictiveScalingMaxCapacityBehavior() == null)
            return false;
        if (other.getPredictiveScalingMaxCapacityBehavior() != null
                && other.getPredictiveScalingMaxCapacityBehavior().equals(this.getPredictiveScalingMaxCapacityBehavior()) == false)
            return false;
        if (other.getPredictiveScalingMaxCapacityBuffer() == null ^ this.getPredictiveScalingMaxCapacityBuffer() == null)
            return false;
        if (other.getPredictiveScalingMaxCapacityBuffer() != null
                && other.getPredictiveScalingMaxCapacityBuffer().equals(this.getPredictiveScalingMaxCapacityBuffer()) == false)
            return false;
        if (other.getPredictiveScalingMode() == null ^ this.getPredictiveScalingMode() == null)
            return false;
        if (other.getPredictiveScalingMode() != null && other.getPredictiveScalingMode().equals(this.getPredictiveScalingMode()) == false)
            return false;
        if (other.getScalingPolicyUpdateBehavior() == null ^ this.getScalingPolicyUpdateBehavior() == null)
            return false;
        if (other.getScalingPolicyUpdateBehavior() != null && other.getScalingPolicyUpdateBehavior().equals(this.getScalingPolicyUpdateBehavior()) == false)
            return false;
        if (other.getDisableDynamicScaling() == null ^ this.getDisableDynamicScaling() == null)
            return false;
        if (other.getDisableDynamicScaling() != null && other.getDisableDynamicScaling().equals(this.getDisableDynamicScaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getMinCapacity() == null) ? 0 : getMinCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfigurations() == null) ? 0 : getTargetTrackingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getPredefinedLoadMetricSpecification() == null) ? 0 : getPredefinedLoadMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getCustomizedLoadMetricSpecification() == null) ? 0 : getCustomizedLoadMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionBufferTime() == null) ? 0 : getScheduledActionBufferTime().hashCode());
        hashCode = prime * hashCode + ((getPredictiveScalingMaxCapacityBehavior() == null) ? 0 : getPredictiveScalingMaxCapacityBehavior().hashCode());
        hashCode = prime * hashCode + ((getPredictiveScalingMaxCapacityBuffer() == null) ? 0 : getPredictiveScalingMaxCapacityBuffer().hashCode());
        hashCode = prime * hashCode + ((getPredictiveScalingMode() == null) ? 0 : getPredictiveScalingMode().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicyUpdateBehavior() == null) ? 0 : getScalingPolicyUpdateBehavior().hashCode());
        hashCode = prime * hashCode + ((getDisableDynamicScaling() == null) ? 0 : getDisableDynamicScaling().hashCode());
        return hashCode;
    }

    @Override
    public ScalingInstruction clone() {
        try {
            return (ScalingInstruction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingInstructionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
