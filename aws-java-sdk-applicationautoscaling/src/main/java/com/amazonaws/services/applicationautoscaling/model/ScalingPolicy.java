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

/**
 * <p>
 * An object representing a scaling policy.
 * </p>
 */
public class ScalingPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scaling policy.
     * </p>
     */
    private String policyARN;
    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling policy. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * The scaling policy type.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The configuration for the step scaling policy.
     * </p>
     */
    private StepScalingPolicyConfiguration stepScalingPolicyConfiguration;
    /**
     * <p>
     * The CloudWatch alarms that are associated with the scaling policy.
     * </p>
     */
    private java.util.List<Alarm> alarms;
    /**
     * <p>
     * The Unix timestamp for when the scaling policy was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scaling policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the scaling policy.
     */

    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scaling policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scaling policy.
     */

    public String getPolicyARN() {
        return this.policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scaling policy.
     * </p>
     * 
     * @param policyARN
     *        The Amazon Resource Name (ARN) of the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withPolicyARN(String policyARN) {
        setPolicyARN(policyARN);
        return this;
    }

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

    public ScalingPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The namespace for the AWS service that the scaling policy is associated with. For more information, see
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
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingPolicy withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling policy is associated with. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingPolicy withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling policy. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scaling policy. For
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
     * The resource type and unique identifier string for the resource associated with the scaling policy. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @return The resource type and unique identifier string for the resource associated with the scaling policy. For
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
     * The resource type and unique identifier string for the resource associated with the scaling policy. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scaling policy. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling policy. The scalable dimension contains the service
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
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     * 
     * @return The scalable dimension associated with the scaling policy. The scalable dimension contains the service
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
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling policy. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingPolicy withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling policy. The scalable dimension contains the service
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
     * The scalable dimension associated with the scaling policy. The scalable dimension contains the service namespace,
     * resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired task count of
     * an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon
     * EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling policy. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingPolicy withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scaling policy type.
     * </p>
     * 
     * @param policyType
     *        The scaling policy type.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The scaling policy type.
     * </p>
     * 
     * @return The scaling policy type.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The scaling policy type.
     * </p>
     * 
     * @param policyType
     *        The scaling policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The scaling policy type.
     * </p>
     * 
     * @param policyType
     *        The scaling policy type.
     * @see PolicyType
     */

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
    }

    /**
     * <p>
     * The scaling policy type.
     * </p>
     * 
     * @param policyType
     *        The scaling policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(PolicyType policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The configuration for the step scaling policy.
     * </p>
     * 
     * @param stepScalingPolicyConfiguration
     *        The configuration for the step scaling policy.
     */

    public void setStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The configuration for the step scaling policy.
     * </p>
     * 
     * @return The configuration for the step scaling policy.
     */

    public StepScalingPolicyConfiguration getStepScalingPolicyConfiguration() {
        return this.stepScalingPolicyConfiguration;
    }

    /**
     * <p>
     * The configuration for the step scaling policy.
     * </p>
     * 
     * @param stepScalingPolicyConfiguration
     *        The configuration for the step scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withStepScalingPolicyConfiguration(StepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
        setStepScalingPolicyConfiguration(stepScalingPolicyConfiguration);
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms that are associated with the scaling policy.
     * </p>
     * 
     * @return The CloudWatch alarms that are associated with the scaling policy.
     */

    public java.util.List<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * <p>
     * The CloudWatch alarms that are associated with the scaling policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms that are associated with the scaling policy.
     */

    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new java.util.ArrayList<Alarm>(alarms);
    }

    /**
     * <p>
     * The CloudWatch alarms that are associated with the scaling policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlarms(java.util.Collection)} or {@link #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms that are associated with the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAlarms(Alarm... alarms) {
        if (this.alarms == null) {
            setAlarms(new java.util.ArrayList<Alarm>(alarms.length));
        }
        for (Alarm ele : alarms) {
            this.alarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms that are associated with the scaling policy.
     * </p>
     * 
     * @param alarms
     *        The CloudWatch alarms that are associated with the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling policy was created.
     * </p>
     * 
     * @param creationTime
     *        The Unix timestamp for when the scaling policy was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling policy was created.
     * </p>
     * 
     * @return The Unix timestamp for when the scaling policy was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling policy was created.
     * </p>
     * 
     * @param creationTime
     *        The Unix timestamp for when the scaling policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getPolicyARN() != null)
            sb.append("PolicyARN: " + getPolicyARN() + ",");
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
            sb.append("StepScalingPolicyConfiguration: " + getStepScalingPolicyConfiguration() + ",");
        if (getAlarms() != null)
            sb.append("Alarms: " + getAlarms() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null)
            return false;
        if (other.getPolicyARN() != null && other.getPolicyARN().equals(this.getPolicyARN()) == false)
            return false;
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
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getStepScalingPolicyConfiguration() == null) ? 0 : getStepScalingPolicyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
