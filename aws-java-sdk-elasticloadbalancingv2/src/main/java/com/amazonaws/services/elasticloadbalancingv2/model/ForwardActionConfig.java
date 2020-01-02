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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a forward action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ForwardActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForwardActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * One or more target groups. For Network Load Balancers, you can specify a single target group.
     * </p>
     */
    private java.util.List<TargetGroupTuple> targetGroups;
    /**
     * <p>
     * The target group stickiness for the rule.
     * </p>
     */
    private TargetGroupStickinessConfig targetGroupStickinessConfig;

    /**
     * <p>
     * One or more target groups. For Network Load Balancers, you can specify a single target group.
     * </p>
     * 
     * @return One or more target groups. For Network Load Balancers, you can specify a single target group.
     */

    public java.util.List<TargetGroupTuple> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * One or more target groups. For Network Load Balancers, you can specify a single target group.
     * </p>
     * 
     * @param targetGroups
     *        One or more target groups. For Network Load Balancers, you can specify a single target group.
     */

    public void setTargetGroups(java.util.Collection<TargetGroupTuple> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<TargetGroupTuple>(targetGroups);
    }

    /**
     * <p>
     * One or more target groups. For Network Load Balancers, you can specify a single target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroups(java.util.Collection)} or {@link #withTargetGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetGroups
     *        One or more target groups. For Network Load Balancers, you can specify a single target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardActionConfig withTargetGroups(TargetGroupTuple... targetGroups) {
        if (this.targetGroups == null) {
            setTargetGroups(new java.util.ArrayList<TargetGroupTuple>(targetGroups.length));
        }
        for (TargetGroupTuple ele : targetGroups) {
            this.targetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more target groups. For Network Load Balancers, you can specify a single target group.
     * </p>
     * 
     * @param targetGroups
     *        One or more target groups. For Network Load Balancers, you can specify a single target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardActionConfig withTargetGroups(java.util.Collection<TargetGroupTuple> targetGroups) {
        setTargetGroups(targetGroups);
        return this;
    }

    /**
     * <p>
     * The target group stickiness for the rule.
     * </p>
     * 
     * @param targetGroupStickinessConfig
     *        The target group stickiness for the rule.
     */

    public void setTargetGroupStickinessConfig(TargetGroupStickinessConfig targetGroupStickinessConfig) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
    }

    /**
     * <p>
     * The target group stickiness for the rule.
     * </p>
     * 
     * @return The target group stickiness for the rule.
     */

    public TargetGroupStickinessConfig getTargetGroupStickinessConfig() {
        return this.targetGroupStickinessConfig;
    }

    /**
     * <p>
     * The target group stickiness for the rule.
     * </p>
     * 
     * @param targetGroupStickinessConfig
     *        The target group stickiness for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardActionConfig withTargetGroupStickinessConfig(TargetGroupStickinessConfig targetGroupStickinessConfig) {
        setTargetGroupStickinessConfig(targetGroupStickinessConfig);
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
        if (getTargetGroups() != null)
            sb.append("TargetGroups: ").append(getTargetGroups()).append(",");
        if (getTargetGroupStickinessConfig() != null)
            sb.append("TargetGroupStickinessConfig: ").append(getTargetGroupStickinessConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForwardActionConfig == false)
            return false;
        ForwardActionConfig other = (ForwardActionConfig) obj;
        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        if (other.getTargetGroupStickinessConfig() == null ^ this.getTargetGroupStickinessConfig() == null)
            return false;
        if (other.getTargetGroupStickinessConfig() != null && other.getTargetGroupStickinessConfig().equals(this.getTargetGroupStickinessConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupStickinessConfig() == null) ? 0 : getTargetGroupStickinessConfig().hashCode());
        return hashCode;
    }

    @Override
    public ForwardActionConfig clone() {
        try {
            return (ForwardActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
