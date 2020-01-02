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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the conditions to evaluate for an activity in a journey, and how to evaluate those conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     */
    private java.util.List<SimpleCondition> conditions;
    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an
     * activity, whether both or only one of the conditions must be met for the activity to be performed.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * 
     * @return The conditions to evaluate for the activity.
     */

    public java.util.List<SimpleCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * 
     * @param conditions
     *        The conditions to evaluate for the activity.
     */

    public void setConditions(java.util.Collection<SimpleCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<SimpleCondition>(conditions);
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        The conditions to evaluate for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withConditions(SimpleCondition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<SimpleCondition>(conditions.length));
        }
        for (SimpleCondition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The conditions to evaluate for the activity.
     * </p>
     * 
     * @param conditions
     *        The conditions to evaluate for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withConditions(java.util.Collection<SimpleCondition> conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an
     * activity, whether both or only one of the conditions must be met for the activity to be performed.
     * </p>
     * 
     * @param operator
     *        Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions
     *        for an activity, whether both or only one of the conditions must be met for the activity to be performed.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an
     * activity, whether both or only one of the conditions must be met for the activity to be performed.
     * </p>
     * 
     * @return Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions
     *         for an activity, whether both or only one of the conditions must be met for the activity to be performed.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an
     * activity, whether both or only one of the conditions must be met for the activity to be performed.
     * </p>
     * 
     * @param operator
     *        Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions
     *        for an activity, whether both or only one of the conditions must be met for the activity to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Condition withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an
     * activity, whether both or only one of the conditions must be met for the activity to be performed.
     * </p>
     * 
     * @param operator
     *        Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions
     *        for an activity, whether both or only one of the conditions must be met for the activity to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Condition withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
