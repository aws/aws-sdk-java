/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeregisterScalableTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     */
    private String scalableDimension;

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The namespace for the AWS service that the scalable target is associated with. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DeregisterScalableTargetRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DeregisterScalableTargetRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scalable target. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @return The resource type and unique identifier string for the resource associated with the scalable target. For
     *         Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *         and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *         requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *         request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scalable target. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterScalableTargetRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @return The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *         namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *         desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for
     *         the target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DeregisterScalableTargetRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DeregisterScalableTargetRequest withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
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
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: " + getScalableDimension());
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
