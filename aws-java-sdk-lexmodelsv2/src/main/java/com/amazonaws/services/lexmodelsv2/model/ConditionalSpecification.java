/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a list of conditional branches. Branches are evaluated in the order that they are entered in the list. The
 * first branch with a condition that evaluates to true is executed. The last branch in the list is the default branch.
 * The default branch should not have any condition expression. The default branch is executed if no other branch has a
 * matching condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConditionalSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are not
     * evaluated.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The
     * response and next step are executed when the condition is true.
     * </p>
     */
    private java.util.List<ConditionalBranch> conditionalBranches;
    /**
     * <p>
     * The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     * conditional branch is made up of a condition, a response and a next step.
     * </p>
     */
    private DefaultConditionalBranch defaultBranch;

    /**
     * <p>
     * Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are not
     * evaluated.
     * </p>
     * 
     * @param active
     *        Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are
     *        not evaluated.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are not
     * evaluated.
     * </p>
     * 
     * @return Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are
     *         not evaluated.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are not
     * evaluated.
     * </p>
     * 
     * @param active
     *        Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are
     *        not evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSpecification withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are not
     * evaluated.
     * </p>
     * 
     * @return Determines whether a conditional branch is active. When <code>active</code> is false, the conditions are
     *         not evaluated.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The
     * response and next step are executed when the condition is true.
     * </p>
     * 
     * @return A list of conditional branches. A conditional branch is made up of a condition, a response and a next
     *         step. The response and next step are executed when the condition is true.
     */

    public java.util.List<ConditionalBranch> getConditionalBranches() {
        return conditionalBranches;
    }

    /**
     * <p>
     * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The
     * response and next step are executed when the condition is true.
     * </p>
     * 
     * @param conditionalBranches
     *        A list of conditional branches. A conditional branch is made up of a condition, a response and a next
     *        step. The response and next step are executed when the condition is true.
     */

    public void setConditionalBranches(java.util.Collection<ConditionalBranch> conditionalBranches) {
        if (conditionalBranches == null) {
            this.conditionalBranches = null;
            return;
        }

        this.conditionalBranches = new java.util.ArrayList<ConditionalBranch>(conditionalBranches);
    }

    /**
     * <p>
     * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The
     * response and next step are executed when the condition is true.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionalBranches(java.util.Collection)} or {@link #withConditionalBranches(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conditionalBranches
     *        A list of conditional branches. A conditional branch is made up of a condition, a response and a next
     *        step. The response and next step are executed when the condition is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSpecification withConditionalBranches(ConditionalBranch... conditionalBranches) {
        if (this.conditionalBranches == null) {
            setConditionalBranches(new java.util.ArrayList<ConditionalBranch>(conditionalBranches.length));
        }
        for (ConditionalBranch ele : conditionalBranches) {
            this.conditionalBranches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditional branches. A conditional branch is made up of a condition, a response and a next step. The
     * response and next step are executed when the condition is true.
     * </p>
     * 
     * @param conditionalBranches
     *        A list of conditional branches. A conditional branch is made up of a condition, a response and a next
     *        step. The response and next step are executed when the condition is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSpecification withConditionalBranches(java.util.Collection<ConditionalBranch> conditionalBranches) {
        setConditionalBranches(conditionalBranches);
        return this;
    }

    /**
     * <p>
     * The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     * conditional branch is made up of a condition, a response and a next step.
     * </p>
     * 
     * @param defaultBranch
     *        The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     *        conditional branch is made up of a condition, a response and a next step.
     */

    public void setDefaultBranch(DefaultConditionalBranch defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * <p>
     * The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     * conditional branch is made up of a condition, a response and a next step.
     * </p>
     * 
     * @return The conditional branch that should be followed when the conditions for other branches are not satisfied.
     *         A conditional branch is made up of a condition, a response and a next step.
     */

    public DefaultConditionalBranch getDefaultBranch() {
        return this.defaultBranch;
    }

    /**
     * <p>
     * The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     * conditional branch is made up of a condition, a response and a next step.
     * </p>
     * 
     * @param defaultBranch
     *        The conditional branch that should be followed when the conditions for other branches are not satisfied. A
     *        conditional branch is made up of a condition, a response and a next step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalSpecification withDefaultBranch(DefaultConditionalBranch defaultBranch) {
        setDefaultBranch(defaultBranch);
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getConditionalBranches() != null)
            sb.append("ConditionalBranches: ").append(getConditionalBranches()).append(",");
        if (getDefaultBranch() != null)
            sb.append("DefaultBranch: ").append(getDefaultBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalSpecification == false)
            return false;
        ConditionalSpecification other = (ConditionalSpecification) obj;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getConditionalBranches() == null ^ this.getConditionalBranches() == null)
            return false;
        if (other.getConditionalBranches() != null && other.getConditionalBranches().equals(this.getConditionalBranches()) == false)
            return false;
        if (other.getDefaultBranch() == null ^ this.getDefaultBranch() == null)
            return false;
        if (other.getDefaultBranch() != null && other.getDefaultBranch().equals(this.getDefaultBranch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getConditionalBranches() == null) ? 0 : getConditionalBranches().hashCode());
        hashCode = prime * hashCode + ((getDefaultBranch() == null) ? 0 : getDefaultBranch().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalSpecification clone() {
        try {
            return (ConditionalSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConditionalSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
