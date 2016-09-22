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
public class PutScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The unique resource identifier string for the scalable target that this scaling policy applies to. For Amazon ECS
     * services, the resource type is <code>services</code>, and the identifier is the cluster name and service name;
     * for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource type is
     * <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The configuration for the step scaling policy. If you are creating a new policy, this parameter is required. If
     * you are updating an existing policy, this parameter is not required. For more information, see
     * <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     * </p>
     */
    private StepScalingPolicyConfiguration stepScalingPolicyConfiguration;

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @return The name of the scaling policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that this scaling policy applies to. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The AWS service namespace of the scalable target that this scaling policy applies to. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that this scaling policy applies to. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public PutScalingPolicyRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that this scaling policy applies to. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that this scaling policy applies to. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">
     * AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that this scaling policy applies to. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public PutScalingPolicyRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The unique resource identifier string for the scalable target that this scaling policy applies to. For Amazon ECS
     * services, the resource type is <code>services</code>, and the identifier is the cluster name and service name;
     * for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource type is
     * <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The unique resource identifier string for the scalable target that this scaling policy applies to. For
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
     * The unique resource identifier string for the scalable target that this scaling policy applies to. For Amazon ECS
     * services, the resource type is <code>services</code>, and the identifier is the cluster name and service name;
     * for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource type is
     * <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @return The unique resource identifier string for the scalable target that this scaling policy applies to. For
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
     * The unique resource identifier string for the scalable target that this scaling policy applies to. For Amazon ECS
     * services, the resource type is <code>services</code>, and the identifier is the cluster name and service name;
     * for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource type is
     * <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The unique resource identifier string for the scalable target that this scaling policy applies to. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     *        contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @return The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     *         contains the service namespace, resource type, and scaling property, such as
     *         <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *         request.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     *        contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public PutScalingPolicyRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     *        contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request.
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension
     *        contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public PutScalingPolicyRequest withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     * 
     * @param policyType
     *        The policy type. If you are creating a new policy, this parameter is required. If you are updating an
     *        existing policy, this parameter is not required.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     * 
     * @return The policy type. If you are creating a new policy, this parameter is required. If you are updating an
     *         existing policy, this parameter is not required.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     * 
     * @param policyType
     *        The policy type. If you are creating a new policy, this parameter is required. If you are updating an
     *        existing policy, this parameter is not required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutScalingPolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     * 
     * @param policyType
     *        The policy type. If you are creating a new policy, this parameter is required. If you are updating an
     *        existing policy, this parameter is not required.
     * @see PolicyType
     */

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The policy type. If you are creating a new policy, this parameter is required. If you are updating an existing
     * policy, this parameter is not required.
     * </p>
     * 
     * @param policyType
     *        The policy type. If you are creating a new policy, this parameter is required. If you are updating an
     *        existing policy, this parameter is not required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutScalingPolicyRequest withPolicyType(PolicyType policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The configuration for the step scaling policy. If you are creating a new policy, this parameter is required. If
     * you are updating an existing policy, this parameter is not required. For more information, see
     * <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     * </p>
     * 
     * @param stepScalingPolicyConfiguration
     *        The configuration for the step scaling policy. If you are creating a new policy, this parameter is
     *        required. If you are updating an existing policy, this parameter is not required. For more information,
     *        see <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     */

    public void setStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The configuration for the step scaling policy. If you are creating a new policy, this parameter is required. If
     * you are updating an existing policy, this parameter is not required. For more information, see
     * <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     * </p>
     * 
     * @return The configuration for the step scaling policy. If you are creating a new policy, this parameter is
     *         required. If you are updating an existing policy, this parameter is not required. For more information,
     *         see <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     */

    public StepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
        return this.stepScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The configuration for the step scaling policy. If you are creating a new policy, this parameter is required. If
     * you are updating an existing policy, this parameter is not required. For more information, see
     * <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     * </p>
     * 
     * @param stepScalingPolicyConfiguration
     *        The configuration for the step scaling policy. If you are creating a new policy, this parameter is
     *        required. If you are updating an existing policy, this parameter is not required. For more information,
     *        see <a>StepScalingPolicyConfiguration</a> and <a>StepAdjustment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutScalingPolicyRequest withStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        setStepScalingPolicyConfiguration(stepScalingPolicyConfiguration);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: " + getScalableDimension() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getStepScalingPolicyConfiguration() != null)
            sb.append("StepScalingPolicyConfiguration: " + getStepScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScalingPolicyRequest == false)
            return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
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
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getStepScalingPolicyConfiguration() == null ^ this.getStepScalingPolicyConfiguration() == null)
            return false;
        if (other.getStepScalingPolicyConfiguration() != null
                && other.getStepScalingPolicyConfiguration().equals(this.getStepScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getStepScalingPolicyConfiguration() == null) ? 0 : getStepScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutScalingPolicyRequest clone() {
        return (PutScalingPolicyRequest) super.clone();
    }
}
