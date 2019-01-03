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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A scale-in or scale-out rule that defines scaling activity, including the CloudWatch metric alarm that triggers
 * activity, how EC2 instances are added or removed, and the periodicity of adjustments. The automatic scaling policy
 * for an instance group can comprise one or more automatic scaling rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ScalingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     */
    private ScalingAction action;
    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     * </p>
     */
    private ScalingTrigger trigger;

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     * </p>
     * 
     * @param name
     *        The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     * </p>
     * 
     * @return The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     * </p>
     * 
     * @param name
     *        The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingRule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     * 
     * @param description
     *        A friendly, more verbose description of the automatic scaling rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     * 
     * @return A friendly, more verbose description of the automatic scaling rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the automatic scaling rule.
     * </p>
     * 
     * @param description
     *        A friendly, more verbose description of the automatic scaling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     * 
     * @param action
     *        The conditions that trigger an automatic scaling activity.
     */

    public void setAction(ScalingAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     * 
     * @return The conditions that trigger an automatic scaling activity.
     */

    public ScalingAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The conditions that trigger an automatic scaling activity.
     * </p>
     * 
     * @param action
     *        The conditions that trigger an automatic scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingRule withAction(ScalingAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     * </p>
     * 
     * @param trigger
     *        The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     */

    public void setTrigger(ScalingTrigger trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     * </p>
     * 
     * @return The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     */

    public ScalingTrigger getTrigger() {
        return this.trigger;
    }

    /**
     * <p>
     * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     * </p>
     * 
     * @param trigger
     *        The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingRule withTrigger(ScalingTrigger trigger) {
        setTrigger(trigger);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTrigger() != null)
            sb.append("Trigger: ").append(getTrigger());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingRule == false)
            return false;
        ScalingRule other = (ScalingRule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        return hashCode;
    }

    @Override
    public ScalingRule clone() {
        try {
            return (ScalingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ScalingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
