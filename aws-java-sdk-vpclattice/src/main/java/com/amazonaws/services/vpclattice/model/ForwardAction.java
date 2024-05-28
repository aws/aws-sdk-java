/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a forward action. You can use forward actions to route requests to one or more target groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ForwardAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ForwardAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group. This means that
     * requests are distributed to individual target groups based on their weights. For example, if two target groups
     * have the same weight, each target group receives half of the traffic.
     * </p>
     * <p>
     * The default value is 1. This means that if only one target group is provided, there is no need to set the weight;
     * 100% of the traffic goes to that target group.
     * </p>
     */
    private java.util.List<WeightedTargetGroup> targetGroups;

    /**
     * <p>
     * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group. This means that
     * requests are distributed to individual target groups based on their weights. For example, if two target groups
     * have the same weight, each target group receives half of the traffic.
     * </p>
     * <p>
     * The default value is 1. This means that if only one target group is provided, there is no need to set the weight;
     * 100% of the traffic goes to that target group.
     * </p>
     * 
     * @return The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward
     *         actions, you can assign a weight that controls the prioritization and selection of each target group.
     *         This means that requests are distributed to individual target groups based on their weights. For example,
     *         if two target groups have the same weight, each target group receives half of the traffic.</p>
     *         <p>
     *         The default value is 1. This means that if only one target group is provided, there is no need to set the
     *         weight; 100% of the traffic goes to that target group.
     */

    public java.util.List<WeightedTargetGroup> getTargetGroups() {
        return targetGroups;
    }

    /**
     * <p>
     * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group. This means that
     * requests are distributed to individual target groups based on their weights. For example, if two target groups
     * have the same weight, each target group receives half of the traffic.
     * </p>
     * <p>
     * The default value is 1. This means that if only one target group is provided, there is no need to set the weight;
     * 100% of the traffic goes to that target group.
     * </p>
     * 
     * @param targetGroups
     *        The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward
     *        actions, you can assign a weight that controls the prioritization and selection of each target group. This
     *        means that requests are distributed to individual target groups based on their weights. For example, if
     *        two target groups have the same weight, each target group receives half of the traffic.</p>
     *        <p>
     *        The default value is 1. This means that if only one target group is provided, there is no need to set the
     *        weight; 100% of the traffic goes to that target group.
     */

    public void setTargetGroups(java.util.Collection<WeightedTargetGroup> targetGroups) {
        if (targetGroups == null) {
            this.targetGroups = null;
            return;
        }

        this.targetGroups = new java.util.ArrayList<WeightedTargetGroup>(targetGroups);
    }

    /**
     * <p>
     * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group. This means that
     * requests are distributed to individual target groups based on their weights. For example, if two target groups
     * have the same weight, each target group receives half of the traffic.
     * </p>
     * <p>
     * The default value is 1. This means that if only one target group is provided, there is no need to set the weight;
     * 100% of the traffic goes to that target group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetGroups(java.util.Collection)} or {@link #withTargetGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetGroups
     *        The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward
     *        actions, you can assign a weight that controls the prioritization and selection of each target group. This
     *        means that requests are distributed to individual target groups based on their weights. For example, if
     *        two target groups have the same weight, each target group receives half of the traffic.</p>
     *        <p>
     *        The default value is 1. This means that if only one target group is provided, there is no need to set the
     *        weight; 100% of the traffic goes to that target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardAction withTargetGroups(WeightedTargetGroup... targetGroups) {
        if (this.targetGroups == null) {
            setTargetGroups(new java.util.ArrayList<WeightedTargetGroup>(targetGroups.length));
        }
        for (WeightedTargetGroup ele : targetGroups) {
            this.targetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group. This means that
     * requests are distributed to individual target groups based on their weights. For example, if two target groups
     * have the same weight, each target group receives half of the traffic.
     * </p>
     * <p>
     * The default value is 1. This means that if only one target group is provided, there is no need to set the weight;
     * 100% of the traffic goes to that target group.
     * </p>
     * 
     * @param targetGroups
     *        The target groups. Traffic matching the rule is forwarded to the specified target groups. With forward
     *        actions, you can assign a weight that controls the prioritization and selection of each target group. This
     *        means that requests are distributed to individual target groups based on their weights. For example, if
     *        two target groups have the same weight, each target group receives half of the traffic.</p>
     *        <p>
     *        The default value is 1. This means that if only one target group is provided, there is no need to set the
     *        weight; 100% of the traffic goes to that target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForwardAction withTargetGroups(java.util.Collection<WeightedTargetGroup> targetGroups) {
        setTargetGroups(targetGroups);
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
            sb.append("TargetGroups: ").append(getTargetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForwardAction == false)
            return false;
        ForwardAction other = (ForwardAction) obj;
        if (other.getTargetGroups() == null ^ this.getTargetGroups() == null)
            return false;
        if (other.getTargetGroups() != null && other.getTargetGroups().equals(this.getTargetGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroups() == null) ? 0 : getTargetGroups().hashCode());
        return hashCode;
    }

    @Override
    public ForwardAction clone() {
        try {
            return (ForwardAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.ForwardActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
