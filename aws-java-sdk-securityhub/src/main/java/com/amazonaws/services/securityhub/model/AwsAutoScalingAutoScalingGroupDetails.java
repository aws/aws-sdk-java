/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an auto scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingAutoScalingGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingAutoScalingGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The list of load balancers associated with the group.
     * </p>
     */
    private java.util.List<String> loadBalancerNames;
    /**
     * <p>
     * The service to use for the health checks.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2
     * instance that has come into service.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * Indicates when the auto scaling group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withLaunchConfigurationName(String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The list of load balancers associated with the group.
     * </p>
     * 
     * @return The list of load balancers associated with the group.
     */

    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * The list of load balancers associated with the group.
     * </p>
     * 
     * @param loadBalancerNames
     *        The list of load balancers associated with the group.
     */

    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * The list of load balancers associated with the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerNames(java.util.Collection)} or {@link #withLoadBalancerNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        The list of load balancers associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withLoadBalancerNames(String... loadBalancerNames) {
        if (this.loadBalancerNames == null) {
            setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        }
        for (String ele : loadBalancerNames) {
            this.loadBalancerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of load balancers associated with the group.
     * </p>
     * 
     * @param loadBalancerNames
     *        The list of load balancers associated with the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks.
     * </p>
     * 
     * @return The service to use for the health checks.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withHealthCheckType(String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of
     *        an EC2 instance that has come into service.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @return The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of
     *         an EC2 instance that has come into service.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of an EC2
     * instance that has come into service.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before it checks the health status of
     *        an EC2 instance that has come into service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * Indicates when the auto scaling group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        Indicates when the auto scaling group was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Indicates when the auto scaling group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the auto scaling group was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Indicates when the auto scaling group was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        Indicates when the auto scaling group was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupDetails withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: ").append(getLaunchConfigurationName()).append(",");
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: ").append(getLoadBalancerNames()).append(",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: ").append(getHealthCheckType()).append(",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: ").append(getHealthCheckGracePeriod()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingAutoScalingGroupDetails == false)
            return false;
        AwsAutoScalingAutoScalingGroupDetails other = (AwsAutoScalingAutoScalingGroupDetails) obj;
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        if (other.getHealthCheckType() == null ^ this.getHealthCheckType() == null)
            return false;
        if (other.getHealthCheckType() != null && other.getHealthCheckType().equals(this.getHealthCheckType()) == false)
            return false;
        if (other.getHealthCheckGracePeriod() == null ^ this.getHealthCheckGracePeriod() == null)
            return false;
        if (other.getHealthCheckGracePeriod() != null && other.getHealthCheckGracePeriod().equals(this.getHealthCheckGracePeriod()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckType() == null) ? 0 : getHealthCheckType().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriod() == null) ? 0 : getHealthCheckGracePeriod().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingAutoScalingGroupDetails clone() {
        try {
            return (AwsAutoScalingAutoScalingGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingAutoScalingGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
