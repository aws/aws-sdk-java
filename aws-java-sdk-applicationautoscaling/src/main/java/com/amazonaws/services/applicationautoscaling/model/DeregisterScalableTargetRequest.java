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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DeregisterScalableTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterScalableTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The identifier of the resource associated with the scalable target. This string consists of the resource type and
     * unique identifier.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * </ul>
     */
    private String scalableDimension;

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a
     *         resource provided by your own application or service. For more information, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DeregisterScalableTargetRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        withServiceNamespace(serviceNamespace);
    }

    /**
     * <p>
     * The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     * provided by your own application or service. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace of the AWS service that provides the resource or <code>custom-resource</code> for a resource
     *        provided by your own application or service. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DeregisterScalableTargetRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scalable target. This string consists of the resource type and
     * unique identifier.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
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
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource associated with the scalable target. This string consists of the resource
     *        type and unique identifier.</p>
     *        <ul>
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
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
     *        is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
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
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scalable target. This string consists of the resource type and
     * unique identifier.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
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
     * </ul>
     * 
     * @return The identifier of the resource associated with the scalable target. This string consists of the resource
     *         type and unique identifier.</p>
     *         <ul>
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
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
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
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource associated with the scalable target. This string consists of the resource type and
     * unique identifier.
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
     * Spot fleet request - The resource type is <code>spot-fleet-request</code> and the unique identifier is the Spot
     * fleet request ID. Example: <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
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
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier is the
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
     * </ul>
     * 
     * @param resourceId
     *        The identifier of the resource associated with the scalable target. This string consists of the resource
     *        type and unique identifier.</p>
     *        <ul>
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
     *        <li>
     *        <p>
     *        Amazon SageMaker endpoint variants - The resource type is <code>variant</code> and the unique identifier
     *        is the resource ID. Example: <code>endpoint/my-end-point/variant/KMeansClustering</code>.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterScalableTargetRequest withResourceId(String resourceId) {
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DeregisterScalableTargetRequest withScalableDimension(String scalableDimension) {
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> - The target capacity of a Spot fleet request.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DeregisterScalableTargetRequest withScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
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
            sb.append("ScalableDimension: ").append(getScalableDimension());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterScalableTargetRequest == false)
            return false;
        DeregisterScalableTargetRequest other = (DeregisterScalableTargetRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterScalableTargetRequest clone() {
        return (DeregisterScalableTargetRequest) super.clone();
    }

}
