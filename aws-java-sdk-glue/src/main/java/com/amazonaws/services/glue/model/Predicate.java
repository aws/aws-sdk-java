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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the predicate of the trigger, which determines when it fires.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Predicate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Predicate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
     * </p>
     */
    private String logical;
    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     */
    private java.util.List<Condition> conditions;

    /**
     * <p>
     * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
     * </p>
     * 
     * @param logical
     *        Optional field if only one condition is listed. If multiple conditions are listed, then this field is
     *        required.
     * @see Logical
     */

    public void setLogical(String logical) {
        this.logical = logical;
    }

    /**
     * <p>
     * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
     * </p>
     * 
     * @return Optional field if only one condition is listed. If multiple conditions are listed, then this field is
     *         required.
     * @see Logical
     */

    public String getLogical() {
        return this.logical;
    }

    /**
     * <p>
     * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
     * </p>
     * 
     * @param logical
     *        Optional field if only one condition is listed. If multiple conditions are listed, then this field is
     *        required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Logical
     */

    public Predicate withLogical(String logical) {
        setLogical(logical);
        return this;
    }

    /**
     * <p>
     * Optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
     * </p>
     * 
     * @param logical
     *        Optional field if only one condition is listed. If multiple conditions are listed, then this field is
     *        required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Logical
     */

    public Predicate withLogical(Logical logical) {
        this.logical = logical.toString();
        return this;
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * 
     * @return A list of the conditions that determine when the trigger will fire.
     */

    public java.util.List<Condition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * 
     * @param conditions
     *        A list of the conditions that determine when the trigger will fire.
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
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        A list of the conditions that determine when the trigger will fire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withConditions(Condition... conditions) {
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
     * A list of the conditions that determine when the trigger will fire.
     * </p>
     * 
     * @param conditions
     *        A list of the conditions that determine when the trigger will fire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withConditions(java.util.Collection<Condition> conditions) {
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
        if (getLogical() != null)
            sb.append("Logical: ").append(getLogical()).append(",");
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

        if (obj instanceof Predicate == false)
            return false;
        Predicate other = (Predicate) obj;
        if (other.getLogical() == null ^ this.getLogical() == null)
            return false;
        if (other.getLogical() != null && other.getLogical().equals(this.getLogical()) == false)
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

        hashCode = prime * hashCode + ((getLogical() == null) ? 0 : getLogical().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public Predicate clone() {
        try {
            return (Predicate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PredicateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
