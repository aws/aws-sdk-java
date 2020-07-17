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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/RegisterScalableTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterScalableTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The identifier of the resource that is associated with the scalable target. This string consists of the resource
     * type and unique identifier.
     * </p>
     * <ul>
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
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index
     * name. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using
     * the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the
     * function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     * <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name.
     * Example: <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     */
    private String scalableDimension;
    /**
     * <p>
     * The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto Scaling can
     * scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target. For certain resources, the minimum value
     * allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB clusters, EMR
     * clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     * </p>
     */
    private Integer minCapacity;
    /**
     * <p>
     * The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto Scaling can
     * scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and it
     * must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your
     * behalf.
     * </p>
     * <p>
     * If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which it
     * creates if it does not yet exist. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     * >Application Auto Scaling IAM Roles</a>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic
     * scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling activities.
     * Setting it to <code>false</code> (default) resumes the specified scaling activities.
     * </p>
     * <p>
     * <b>Suspension Outcomes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that involve
     * scheduled actions are suspended.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     * >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     */
    private SuspendedState suspendedState;

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource. For a resource provided by your own
     *        application or service, use <code>custom-resource</code> instead.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     * 
     * @return The namespace of the AWS service that provides the resource. For a resource provided by your own
     *         application or service, use <code>custom-resource</code> instead.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource. For a resource provided by your own
     *        application or service, use <code>custom-resource</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public RegisterScalableTargetRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource. For a resource provided by your own
     *        application or service, use <code>custom-resource</code> instead.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        withServiceNamespace(serviceNamespace);
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource. For a resource provided by your own application or
     * service, use <code>custom-resource</code> instead.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource. For a resource provided by your own
     *        application or service, use <code>custom-resource</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public RegisterScalableTargetRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the resource that is associated with the scalable target. This string consists of the resource
     * type and unique identifier.
     * </p>
     * <ul>
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
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index
     * name. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using
     * the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the
     * function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     * <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name.
     * Example: <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource that is associated with the scalable target. This string consists of the
     *        resource type and unique identifier.</p>
     *        <ul>
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
     *        EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *        and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     *        Example: <code>fleet/sample-fleet</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        index name. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is
     *        the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Custom resources are not supported with a resource type. This parameter must specify the
     *        <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *        identifier is defined by the service provider. More information is available in our <a
     *        href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified
     *        using the endpoint ARN. Example:
     *        <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is
     *        the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     *        <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table
     *        name. Example: <code>keyspace/mykeyspace/table/mytable</code>.
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that is associated with the scalable target. This string consists of the resource
     * type and unique identifier.
     * </p>
     * <ul>
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
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index
     * name. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using
     * the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the
     * function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     * <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name.
     * Example: <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the resource that is associated with the scalable target. This string consists of the
     *         resource type and unique identifier.</p>
     *         <ul>
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
     *         EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *         and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet
     *         name. Example: <code>fleet/sample-fleet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name.
     *         Example: <code>table/my-table</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is
     *         the index name. Example: <code>table/my-table/index/my-table-index</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *         name. Example: <code>cluster:my-db-cluster</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier
     *         is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Custom resources are not supported with a resource type. This parameter must specify the
     *         <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *         identifier is defined by the service provider. More information is available in our <a
     *         href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Comprehend document classification endpoint - The resource type and unique identifier are
     *         specified using the endpoint ARN. Example:
     *         <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is
     *         the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     *         <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table
     *         name. Example: <code>keyspace/mykeyspace/table/mytable</code>.
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that is associated with the scalable target. This string consists of the resource
     * type and unique identifier.
     * </p>
     * <ul>
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
     * EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID and
     * instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     * Example: <code>fleet/sample-fleet</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name. Example:
     * <code>table/my-table</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the index
     * name. Example: <code>table/my-table/index/my-table-index</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster name.
     * Example: <code>cluster:my-db-cluster</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is the
     * resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources are not supported with a resource type. This parameter must specify the <code>OutputValue</code>
     * from the CloudFormation template stack used to access the resources. The unique identifier is defined by the
     * service provider. More information is available in our <a
     * href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified using
     * the endpoint ARN. Example:
     * <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is the
     * function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     * <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table name.
     * Example: <code>keyspace/mykeyspace/table/mytable</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource that is associated with the scalable target. This string consists of the
     *        resource type and unique identifier.</p>
     *        <ul>
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
     *        EMR cluster - The resource type is <code>instancegroup</code> and the unique identifier is the cluster ID
     *        and instance group ID. Example: <code>instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AppStream 2.0 fleet - The resource type is <code>fleet</code> and the unique identifier is the fleet name.
     *        Example: <code>fleet/sample-fleet</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB table - The resource type is <code>table</code> and the unique identifier is the table name.
     *        Example: <code>table/my-table</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DynamoDB global secondary index - The resource type is <code>index</code> and the unique identifier is the
     *        index name. Example: <code>table/my-table/index/my-table-index</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora DB cluster - The resource type is <code>cluster</code> and the unique identifier is the cluster
     *        name. Example: <code>cluster:my-db-cluster</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variant - The resource type is <code>variant</code> and the unique identifier is
     *        the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Custom resources are not supported with a resource type. This parameter must specify the
     *        <code>OutputValue</code> from the CloudFormation template stack used to access the resources. The unique
     *        identifier is defined by the service provider. More information is available in our <a
     *        href="https://github.com/aws/aws-auto-scaling-custom-resource">GitHub repository</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Comprehend document classification endpoint - The resource type and unique identifier are specified
     *        using the endpoint ARN. Example:
     *        <code>arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Lambda provisioned concurrency - The resource type is <code>function</code> and the unique identifier is
     *        the function name with a function version or alias name suffix that is not <code>$LATEST</code>. Example:
     *        <code>function:my-function:prod</code> or <code>function:my-function:1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Keyspaces table - The resource type is <code>table</code> and the unique identifier is the table
     *        name. Example: <code>keyspace/mykeyspace/table/mytable</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterScalableTargetRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. This string consists of the service namespace,
     *        resource type, and scaling property.</p>
     *        <ul>
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
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units
     *        for an Amazon Comprehend document classification endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scalable dimension associated with the scalable target. This string consists of the service
     *         namespace, resource type, and scaling property.</p>
     *         <ul>
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
     *         <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     *         <li>
     *         <p>
     *         <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *         model endpoint variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource
     *         provided by your own application or service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference
     *         units for an Amazon Comprehend document classification endpoint.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces
     *         table.
     *         </p>
     *         </li>
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. This string consists of the service namespace,
     *        resource type, and scaling property.</p>
     *        <ul>
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
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units
     *        for an Amazon Comprehend document classification endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public RegisterScalableTargetRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. This string consists of the service namespace,
     *        resource type, and scaling property.</p>
     *        <ul>
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
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units
     *        for an Amazon Comprehend document classification endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        withScalableDimension(scalableDimension);
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. This string consists of the service namespace,
     * resource type, and scaling property.
     * </p>
     * <ul>
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
     * <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     * <li>
     * <p>
     * <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker model
     * endpoint variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided by
     * your own application or service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units for an
     * Amazon Comprehend document classification endpoint.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. This string consists of the service namespace,
     *        resource type, and scaling property.</p>
     *        <ul>
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
     *        <code>elasticmapreduce:instancegroup:InstanceCount</code> - The instance count of an EMR Instance Group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>appstream:fleet:DesiredCapacity</code> - The desired capacity of an AppStream 2.0 fleet.
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
     *        <li>
     *        <p>
     *        <code>sagemaker:variant:DesiredInstanceCount</code> - The number of EC2 instances for an Amazon SageMaker
     *        model endpoint variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-resource:ResourceType:Property</code> - The scalable dimension for a custom resource provided
     *        by your own application or service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>comprehend:document-classifier-endpoint:DesiredInferenceUnits</code> - The number of inference units
     *        for an Amazon Comprehend document classification endpoint.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>lambda:function:ProvisionedConcurrency</code> - The provisioned concurrency for a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:ReadCapacityUnits</code> - The provisioned read capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cassandra:table:WriteCapacityUnits</code> - The provisioned write capacity for an Amazon Keyspaces
     *        table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public RegisterScalableTargetRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
        return this;
    }

    /**
     * <p>
     * The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto Scaling can
     * scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target. For certain resources, the minimum value
     * allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB clusters, EMR
     * clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     * </p>
     * 
     * @param minCapacity
     *        The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto
     *        Scaling can scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     *        </p>
     *        <p>
     *        This parameter is required if you are registering a scalable target. For certain resources, the minimum
     *        value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB
     *        clusters, EMR clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     */

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    /**
     * <p>
     * The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto Scaling can
     * scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target. For certain resources, the minimum value
     * allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB clusters, EMR
     * clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     * </p>
     * 
     * @return The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto
     *         Scaling can scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     *         </p>
     *         <p>
     *         This parameter is required if you are registering a scalable target. For certain resources, the minimum
     *         value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB
     *         clusters, EMR clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     */

    public Integer getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * <p>
     * The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto Scaling can
     * scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target. For certain resources, the minimum value
     * allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB clusters, EMR
     * clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     * </p>
     * 
     * @param minCapacity
     *        The minimum value that you plan to scale in to. When a scaling policy is in effect, Application Auto
     *        Scaling can scale in (contract) as needed to the minimum capacity limit in response to changing demand.
     *        </p>
     *        <p>
     *        This parameter is required if you are registering a scalable target. For certain resources, the minimum
     *        value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB
     *        clusters, EMR clusters, and custom resources. For all other resources, the minimum value allowed is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterScalableTargetRequest withMinCapacity(Integer minCapacity) {
        setMinCapacity(minCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto Scaling can
     * scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto
     *        Scaling can scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     *        </p>
     *        <p>
     *        This parameter is required if you are registering a scalable target.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto Scaling can
     * scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target.
     * </p>
     * 
     * @return The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto
     *         Scaling can scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     *         </p>
     *         <p>
     *         This parameter is required if you are registering a scalable target.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto Scaling can
     * scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     * </p>
     * <p>
     * This parameter is required if you are registering a scalable target.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum value that you plan to scale out to. When a scaling policy is in effect, Application Auto
     *        Scaling can scale out (expand) as needed to the maximum capacity limit in response to changing demand.
     *        </p>
     *        <p>
     *        This parameter is required if you are registering a scalable target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterScalableTargetRequest withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and it
     * must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your
     * behalf.
     * </p>
     * <p>
     * If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which it
     * creates if it does not yet exist. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     * >Application Auto Scaling IAM Roles</a>.
     * </p>
     * 
     * @param roleARN
     *        This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and
     *        it must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target
     *        on your behalf. </p>
     *        <p>
     *        If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which
     *        it creates if it does not yet exist. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     *        >Application Auto Scaling IAM Roles</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and it
     * must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your
     * behalf.
     * </p>
     * <p>
     * If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which it
     * creates if it does not yet exist. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     * >Application Auto Scaling IAM Roles</a>.
     * </p>
     * 
     * @return This parameter is required for services that do not support service-linked roles (such as Amazon EMR),
     *         and it must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable
     *         target on your behalf. </p>
     *         <p>
     *         If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which
     *         it creates if it does not yet exist. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     *         >Application Auto Scaling IAM Roles</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and it
     * must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target on your
     * behalf.
     * </p>
     * <p>
     * If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which it
     * creates if it does not yet exist. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     * >Application Auto Scaling IAM Roles</a>.
     * </p>
     * 
     * @param roleARN
     *        This parameter is required for services that do not support service-linked roles (such as Amazon EMR), and
     *        it must specify the ARN of an IAM role that allows Application Auto Scaling to modify the scalable target
     *        on your behalf. </p>
     *        <p>
     *        If the service supports service-linked roles, Application Auto Scaling uses a service-linked role, which
     *        it creates if it does not yet exist. For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles"
     *        >Application Auto Scaling IAM Roles</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterScalableTargetRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic
     * scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling activities.
     * Setting it to <code>false</code> (default) resumes the specified scaling activities.
     * </p>
     * <p>
     * <b>Suspension Outcomes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that involve
     * scheduled actions are suspended.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     * >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendedState
     *        An embedded object that contains attributes and attribute values that are used to suspend and resume
     *        automatic scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling
     *        activities. Setting it to <code>false</code> (default) resumes the specified scaling activities. </p>
     *        <p>
     *        <b>Suspension Outcomes</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that
     *        are triggered by a scaling policy are suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities
     *        that are triggered by a scaling policy are suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that
     *        involve scheduled actions are suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     *        >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public void setSuspendedState(SuspendedState suspendedState) {
        this.suspendedState = suspendedState;
    }

    /**
     * <p>
     * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic
     * scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling activities.
     * Setting it to <code>false</code> (default) resumes the specified scaling activities.
     * </p>
     * <p>
     * <b>Suspension Outcomes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that involve
     * scheduled actions are suspended.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     * >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @return An embedded object that contains attributes and attribute values that are used to suspend and resume
     *         automatic scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling
     *         activities. Setting it to <code>false</code> (default) resumes the specified scaling activities. </p>
     *         <p>
     *         <b>Suspension Outcomes</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that
     *         are triggered by a scaling policy are suspended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities
     *         that are triggered by a scaling policy are suspended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that
     *         involve scheduled actions are suspended.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     *         >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     */

    public SuspendedState getSuspendedState() {
        return this.suspendedState;
    }

    /**
     * <p>
     * An embedded object that contains attributes and attribute values that are used to suspend and resume automatic
     * scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling activities.
     * Setting it to <code>false</code> (default) resumes the specified scaling activities.
     * </p>
     * <p>
     * <b>Suspension Outcomes</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities that are
     * triggered by a scaling policy are suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that involve
     * scheduled actions are suspended.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     * >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendedState
     *        An embedded object that contains attributes and attribute values that are used to suspend and resume
     *        automatic scaling. Setting the value of an attribute to <code>true</code> suspends the specified scaling
     *        activities. Setting it to <code>false</code> (default) resumes the specified scaling activities. </p>
     *        <p>
     *        <b>Suspension Outcomes</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>DynamicScalingInSuspended</code>, while a suspension is in effect, all scale-in activities that
     *        are triggered by a scaling policy are suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>DynamicScalingOutSuspended</code>, while a suspension is in effect, all scale-out activities
     *        that are triggered by a scaling policy are suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>ScheduledScalingSuspended</code>, while a suspension is in effect, all scaling activities that
     *        involve scheduled actions are suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html"
     *        >Suspending and Resuming Scaling</a> in the <i>Application Auto Scaling User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterScalableTargetRequest withSuspendedState(SuspendedState suspendedState) {
        setSuspendedState(suspendedState);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getSuspendedState() != null)
            sb.append("SuspendedState: ").append(getSuspendedState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterScalableTargetRequest == false)
            return false;
        RegisterScalableTargetRequest other = (RegisterScalableTargetRequest) obj;
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
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getSuspendedState() == null ^ this.getSuspendedState() == null)
            return false;
        if (other.getSuspendedState() != null && other.getSuspendedState().equals(this.getSuspendedState()) == false)
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
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getSuspendedState() == null) ? 0 : getSuspendedState().hashCode());
        return hashCode;
    }

    @Override
    public RegisterScalableTargetRequest clone() {
        return (RegisterScalableTargetRequest) super.clone();
    }

}
