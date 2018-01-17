/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the scaling configuration for a scalable resource.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * Aurora MySQL-compatible edition.
     * </p>
     * </li>
     * </ul>
     */
    private String scalableDimension;
    /**
     * <p>
     * The minimum value to scale to in response to a scale in event.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum value to scale to in response to a scale out event.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The target tracking scaling policies (up to 10).
     * </p>
     */
    private java.util.List<TargetTrackingConfiguration> targetTrackingConfigurations;

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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     *        Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     *         Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is
     *         the Spot fleet request ID. Example:
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     *        Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the
     *        Spot fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * Aurora MySQL-compatible edition.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        Available for Aurora MySQL-compatible edition.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * Aurora MySQL-compatible edition.
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
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *         Available for Aurora MySQL-compatible edition.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * Aurora MySQL-compatible edition.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        Available for Aurora MySQL-compatible edition.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * Aurora MySQL-compatible edition.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        Available for Aurora MySQL-compatible edition.
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
     * The minimum value to scale to in response to a scale in event.
     * </p>
     * 
     * @param minCapacity
     *        The minimum value to scale to in response to a scale in event.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum value to scale to in response to a scale in event.
     * </p>
     * 
     * @return The minimum value to scale to in response to a scale in event.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum value to scale to in response to a scale in event.
     * </p>
     * 
     * @param minCapacity
     *        The minimum value to scale to in response to a scale in event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum value to scale to in response to a scale out event.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum value to scale to in response to a scale out event.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum value to scale to in response to a scale out event.
     * </p>
     * 
     * @return The maximum value to scale to in response to a scale out event.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum value to scale to in response to a scale out event.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum value to scale to in response to a scale out event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The target tracking scaling policies (up to 10).
     * </p>
     * 
     * @return The target tracking scaling policies (up to 10).
     */

    public java.util.List<TargetTrackingConfiguration> getTargetTrackingConfigurations() {
        return targetTrackingConfigurations;
    }

    /**
     * <p>
     * The target tracking scaling policies (up to 10).
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The target tracking scaling policies (up to 10).
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
     * The target tracking scaling policies (up to 10).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTrackingConfigurations(java.util.Collection)} or
     * {@link #withTargetTrackingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The target tracking scaling policies (up to 10).
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
     * The target tracking scaling policies (up to 10).
     * </p>
     * 
     * @param targetTrackingConfigurations
     *        The target tracking scaling policies (up to 10).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingInstruction withTargetTrackingConfigurations(java.util.Collection<TargetTrackingConfiguration> targetTrackingConfigurations) {
        setTargetTrackingConfigurations(targetTrackingConfigurations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("TargetTrackingConfigurations: ").append(getTargetTrackingConfigurations());
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
