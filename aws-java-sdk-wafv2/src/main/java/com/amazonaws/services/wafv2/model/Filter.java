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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single logging filter, used in <a>LoggingFilter</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Filter" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How to handle logs that satisfy the filter's conditions and requirement.
     * </p>
     */
    private String behavior;
    /**
     * <p>
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must
     * match all conditions or must match at least one condition.
     * </p>
     */
    private String requirement;
    /**
     * <p>
     * Match conditions for the filter.
     * </p>
     */
    private java.util.List<Condition> conditions;

    /**
     * <p>
     * How to handle logs that satisfy the filter's conditions and requirement.
     * </p>
     * 
     * @param behavior
     *        How to handle logs that satisfy the filter's conditions and requirement.
     * @see FilterBehavior
     */

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * How to handle logs that satisfy the filter's conditions and requirement.
     * </p>
     * 
     * @return How to handle logs that satisfy the filter's conditions and requirement.
     * @see FilterBehavior
     */

    public String getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * How to handle logs that satisfy the filter's conditions and requirement.
     * </p>
     * 
     * @param behavior
     *        How to handle logs that satisfy the filter's conditions and requirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterBehavior
     */

    public Filter withBehavior(String behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * How to handle logs that satisfy the filter's conditions and requirement.
     * </p>
     * 
     * @param behavior
     *        How to handle logs that satisfy the filter's conditions and requirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterBehavior
     */

    public Filter withBehavior(FilterBehavior behavior) {
        this.behavior = behavior.toString();
        return this;
    }

    /**
     * <p>
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must
     * match all conditions or must match at least one condition.
     * </p>
     * 
     * @param requirement
     *        Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log
     *        must match all conditions or must match at least one condition.
     * @see FilterRequirement
     */

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * <p>
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must
     * match all conditions or must match at least one condition.
     * </p>
     * 
     * @return Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log
     *         must match all conditions or must match at least one condition.
     * @see FilterRequirement
     */

    public String getRequirement() {
        return this.requirement;
    }

    /**
     * <p>
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must
     * match all conditions or must match at least one condition.
     * </p>
     * 
     * @param requirement
     *        Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log
     *        must match all conditions or must match at least one condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterRequirement
     */

    public Filter withRequirement(String requirement) {
        setRequirement(requirement);
        return this;
    }

    /**
     * <p>
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must
     * match all conditions or must match at least one condition.
     * </p>
     * 
     * @param requirement
     *        Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log
     *        must match all conditions or must match at least one condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterRequirement
     */

    public Filter withRequirement(FilterRequirement requirement) {
        this.requirement = requirement.toString();
        return this;
    }

    /**
     * <p>
     * Match conditions for the filter.
     * </p>
     * 
     * @return Match conditions for the filter.
     */

    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * Match conditions for the filter.
     * </p>
     * 
     * @param conditions
     *        Match conditions for the filter.
     */

    public void setConditions(java.util.Collection<Condition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<Condition>(conditions);
    }

    /**
     * <p>
     * Match conditions for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        Match conditions for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withConditions(Condition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<Condition>(conditions.length));
        }
        for (Condition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Match conditions for the filter.
     * </p>
     * 
     * @param conditions
     *        Match conditions for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withConditions(java.util.Collection<Condition> conditions) {
        setConditions(conditions);
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
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior()).append(",");
        if (getRequirement() != null)
            sb.append("Requirement: ").append(getRequirement()).append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        if (other.getRequirement() == null ^ this.getRequirement() == null)
            return false;
        if (other.getRequirement() != null && other.getRequirement().equals(this.getRequirement()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        hashCode = prime * hashCode + ((getRequirement() == null) ? 0 : getRequirement().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
