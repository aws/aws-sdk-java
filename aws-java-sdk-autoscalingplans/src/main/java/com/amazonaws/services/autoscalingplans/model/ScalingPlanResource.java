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
 * Represents a scalable resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingPlanResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPlanResource implements Serializable, Cloneable, StructuredPojo {

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
     * The scaling policies.
     * </p>
     */
    private java.util.List<ScalingPolicy> scalingPolicies;
    /**
     * <p>
     * The scaling status of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling configuration is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created or the
     * scaling configuration could not be applied. Check the status message for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is being
     * created or deleted or the scaling configuration could not be fully applied. Check the status message for more
     * information.
     * </p>
     * </li>
     * </ul>
     */
    private String scalingStatusCode;
    /**
     * <p>
     * A simple message about the current scaling status of the resource.
     * </p>
     */
    private String scalingStatusMessage;

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

    public ScalingPlanResource withScalingPlanName(String scalingPlanName) {
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

    public ScalingPlanResource withScalingPlanVersion(Long scalingPlanVersion) {
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

    public ScalingPlanResource withServiceNamespace(String serviceNamespace) {
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

    public ScalingPlanResource withServiceNamespace(ServiceNamespace serviceNamespace) {
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

    public ScalingPlanResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
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
     *        The scalable dimension for the resource.</p>
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
     * The scalable dimension for the resource.
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
     * @return The scalable dimension for the resource.</p>
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
     * The scalable dimension for the resource.
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
     *        The scalable dimension for the resource.</p>
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

    public ScalingPlanResource withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension for the resource.
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
     *        The scalable dimension for the resource.</p>
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

    public ScalingPlanResource withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @return The scaling policies.
     */

    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return scalingPolicies;
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     */

    public void setScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new java.util.ArrayList<ScalingPolicy>(scalingPolicies);
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPolicies(java.util.Collection)} or {@link #withScalingPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPolicies(ScalingPolicy... scalingPolicies) {
        if (this.scalingPolicies == null) {
            setScalingPolicies(new java.util.ArrayList<ScalingPolicy>(scalingPolicies.length));
        }
        for (ScalingPolicy ele : scalingPolicies) {
            this.scalingPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        The scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingPolicies(java.util.Collection<ScalingPolicy> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
        return this;
    }

    /**
     * <p>
     * The scaling status of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling configuration is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created or the
     * scaling configuration could not be applied. Check the status message for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is being
     * created or deleted or the scaling configuration could not be fully applied. Check the status message for more
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingStatusCode
     *        The scaling status of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling configuration is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created
     *        or the scaling configuration could not be applied. Check the status message for more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is
     *        being created or deleted or the scaling configuration could not be fully applied. Check the status message
     *        for more information.
     *        </p>
     *        </li>
     * @see ScalingStatusCode
     */

    public void setScalingStatusCode(String scalingStatusCode) {
        this.scalingStatusCode = scalingStatusCode;
    }

    /**
     * <p>
     * The scaling status of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling configuration is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created or the
     * scaling configuration could not be applied. Check the status message for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is being
     * created or deleted or the scaling configuration could not be fully applied. Check the status message for more
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scaling status of the resource.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code> - The scaling configuration is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created
     *         or the scaling configuration could not be applied. Check the status message for more information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is
     *         being created or deleted or the scaling configuration could not be fully applied. Check the status
     *         message for more information.
     *         </p>
     *         </li>
     * @see ScalingStatusCode
     */

    public String getScalingStatusCode() {
        return this.scalingStatusCode;
    }

    /**
     * <p>
     * The scaling status of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling configuration is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created or the
     * scaling configuration could not be applied. Check the status message for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is being
     * created or deleted or the scaling configuration could not be fully applied. Check the status message for more
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingStatusCode
     *        The scaling status of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling configuration is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created
     *        or the scaling configuration could not be applied. Check the status message for more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is
     *        being created or deleted or the scaling configuration could not be fully applied. Check the status message
     *        for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusCode
     */

    public ScalingPlanResource withScalingStatusCode(String scalingStatusCode) {
        setScalingStatusCode(scalingStatusCode);
        return this;
    }

    /**
     * <p>
     * The scaling status of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - The scaling configuration is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created or the
     * scaling configuration could not be applied. Check the status message for more information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is being
     * created or deleted or the scaling configuration could not be fully applied. Check the status message for more
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalingStatusCode
     *        The scaling status of the resource.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - The scaling configuration is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Inactive</code> - The scaling configuration is not active because the scaling plan is being created
     *        or the scaling configuration could not be applied. Check the status message for more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PartiallyActive</code> - The scaling configuration is partially active because the scaling plan is
     *        being created or deleted or the scaling configuration could not be fully applied. Check the status message
     *        for more information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusCode
     */

    public ScalingPlanResource withScalingStatusCode(ScalingStatusCode scalingStatusCode) {
        this.scalingStatusCode = scalingStatusCode.toString();
        return this;
    }

    /**
     * <p>
     * A simple message about the current scaling status of the resource.
     * </p>
     * 
     * @param scalingStatusMessage
     *        A simple message about the current scaling status of the resource.
     */

    public void setScalingStatusMessage(String scalingStatusMessage) {
        this.scalingStatusMessage = scalingStatusMessage;
    }

    /**
     * <p>
     * A simple message about the current scaling status of the resource.
     * </p>
     * 
     * @return A simple message about the current scaling status of the resource.
     */

    public String getScalingStatusMessage() {
        return this.scalingStatusMessage;
    }

    /**
     * <p>
     * A simple message about the current scaling status of the resource.
     * </p>
     * 
     * @param scalingStatusMessage
     *        A simple message about the current scaling status of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPlanResource withScalingStatusMessage(String scalingStatusMessage) {
        setScalingStatusMessage(scalingStatusMessage);
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
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: ").append(getScalingPolicies()).append(",");
        if (getScalingStatusCode() != null)
            sb.append("ScalingStatusCode: ").append(getScalingStatusCode()).append(",");
        if (getScalingStatusMessage() != null)
            sb.append("ScalingStatusMessage: ").append(getScalingStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPlanResource == false)
            return false;
        ScalingPlanResource other = (ScalingPlanResource) obj;
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
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
            return false;
        if (other.getScalingStatusCode() == null ^ this.getScalingStatusCode() == null)
            return false;
        if (other.getScalingStatusCode() != null && other.getScalingStatusCode().equals(this.getScalingStatusCode()) == false)
            return false;
        if (other.getScalingStatusMessage() == null ^ this.getScalingStatusMessage() == null)
            return false;
        if (other.getScalingStatusMessage() != null && other.getScalingStatusMessage().equals(this.getScalingStatusMessage()) == false)
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
        hashCode = prime * hashCode + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        hashCode = prime * hashCode + ((getScalingStatusCode() == null) ? 0 : getScalingStatusCode().hashCode());
        hashCode = prime * hashCode + ((getScalingStatusMessage() == null) ? 0 : getScalingStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPlanResource clone() {
        try {
            return (ScalingPlanResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingPlanResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
