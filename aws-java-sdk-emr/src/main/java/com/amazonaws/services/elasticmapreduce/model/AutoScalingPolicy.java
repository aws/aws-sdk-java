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
 * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. An automatic
 * scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value
 * of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AutoScalingPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not
     * cause an instance group to grow above or below these limits.
     * </p>
     */
    private ScalingConstraints constraints;
    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScalingRule> rules;

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not
     * cause an instance group to grow above or below these limits.
     * </p>
     * 
     * @param constraints
     *        The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will
     *        not cause an instance group to grow above or below these limits.
     */

    public void setConstraints(ScalingConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not
     * cause an instance group to grow above or below these limits.
     * </p>
     * 
     * @return The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will
     *         not cause an instance group to grow above or below these limits.
     */

    public ScalingConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not
     * cause an instance group to grow above or below these limits.
     * </p>
     * 
     * @param constraints
     *        The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will
     *        not cause an instance group to grow above or below these limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicy withConstraints(ScalingConstraints constraints) {
        setConstraints(constraints);
        return this;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     * </p>
     * 
     * @return The scale-in and scale-out rules that comprise the automatic scaling policy.
     */

    public java.util.List<ScalingRule> getRules() {
        if (rules == null) {
            rules = new com.amazonaws.internal.SdkInternalList<ScalingRule>();
        }
        return rules;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     * </p>
     * 
     * @param rules
     *        The scale-in and scale-out rules that comprise the automatic scaling policy.
     */

    public void setRules(java.util.Collection<ScalingRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new com.amazonaws.internal.SdkInternalList<ScalingRule>(rules);
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The scale-in and scale-out rules that comprise the automatic scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicy withRules(ScalingRule... rules) {
        if (this.rules == null) {
            setRules(new com.amazonaws.internal.SdkInternalList<ScalingRule>(rules.length));
        }
        for (ScalingRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scale-in and scale-out rules that comprise the automatic scaling policy.
     * </p>
     * 
     * @param rules
     *        The scale-in and scale-out rules that comprise the automatic scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicy withRules(java.util.Collection<ScalingRule> rules) {
        setRules(rules);
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
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicy == false)
            return false;
        AutoScalingPolicy other = (AutoScalingPolicy) obj;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingPolicy clone() {
        try {
            return (AutoScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.AutoScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
