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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the Classic Load Balancers and target groups to attach to a Spot Fleet request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LoadBalancersConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancersConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     */
    private ClassicLoadBalancersConfig classicLoadBalancersConfig;
    /**
     * <p>
     * The target groups.
     * </p>
     */
    private TargetGroupsConfig targetGroupsConfig;

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     * 
     * @param classicLoadBalancersConfig
     *        The Classic Load Balancers.
     */

    public void setClassicLoadBalancersConfig(ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
    }

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     * 
     * @return The Classic Load Balancers.
     */

    public ClassicLoadBalancersConfig getClassicLoadBalancersConfig() {
        return this.classicLoadBalancersConfig;
    }

    /**
     * <p>
     * The Classic Load Balancers.
     * </p>
     * 
     * @param classicLoadBalancersConfig
     *        The Classic Load Balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancersConfig withClassicLoadBalancersConfig(ClassicLoadBalancersConfig classicLoadBalancersConfig) {
        setClassicLoadBalancersConfig(classicLoadBalancersConfig);
        return this;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @param targetGroupsConfig
     *        The target groups.
     */

    public void setTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        this.targetGroupsConfig = targetGroupsConfig;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @return The target groups.
     */

    public TargetGroupsConfig getTargetGroupsConfig() {
        return this.targetGroupsConfig;
    }

    /**
     * <p>
     * The target groups.
     * </p>
     * 
     * @param targetGroupsConfig
     *        The target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancersConfig withTargetGroupsConfig(TargetGroupsConfig targetGroupsConfig) {
        setTargetGroupsConfig(targetGroupsConfig);
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
        if (getClassicLoadBalancersConfig() != null)
            sb.append("ClassicLoadBalancersConfig: ").append(getClassicLoadBalancersConfig()).append(",");
        if (getTargetGroupsConfig() != null)
            sb.append("TargetGroupsConfig: ").append(getTargetGroupsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancersConfig == false)
            return false;
        LoadBalancersConfig other = (LoadBalancersConfig) obj;
        if (other.getClassicLoadBalancersConfig() == null ^ this.getClassicLoadBalancersConfig() == null)
            return false;
        if (other.getClassicLoadBalancersConfig() != null && other.getClassicLoadBalancersConfig().equals(this.getClassicLoadBalancersConfig()) == false)
            return false;
        if (other.getTargetGroupsConfig() == null ^ this.getTargetGroupsConfig() == null)
            return false;
        if (other.getTargetGroupsConfig() != null && other.getTargetGroupsConfig().equals(this.getTargetGroupsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassicLoadBalancersConfig() == null) ? 0 : getClassicLoadBalancersConfig().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupsConfig() == null) ? 0 : getTargetGroupsConfig().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancersConfig clone() {
        try {
            return (LoadBalancersConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
