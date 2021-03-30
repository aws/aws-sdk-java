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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single step from a DataBrew recipe to be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/RecipeStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipeStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The particular action to be performed in the recipe step.
     * </p>
     */
    private RecipeAction action;
    /**
     * <p>
     * One or more conditions that must be met for the recipe step to succeed.
     * </p>
     * <note>
     * <p>
     * All of the conditions in the array must be met. In other words, all of the conditions must be combined using a
     * logical AND operation.
     * </p>
     * </note>
     */
    private java.util.List<ConditionExpression> conditionExpressions;

    /**
     * <p>
     * The particular action to be performed in the recipe step.
     * </p>
     * 
     * @param action
     *        The particular action to be performed in the recipe step.
     */

    public void setAction(RecipeAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The particular action to be performed in the recipe step.
     * </p>
     * 
     * @return The particular action to be performed in the recipe step.
     */

    public RecipeAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The particular action to be performed in the recipe step.
     * </p>
     * 
     * @param action
     *        The particular action to be performed in the recipe step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeStep withAction(RecipeAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * One or more conditions that must be met for the recipe step to succeed.
     * </p>
     * <note>
     * <p>
     * All of the conditions in the array must be met. In other words, all of the conditions must be combined using a
     * logical AND operation.
     * </p>
     * </note>
     * 
     * @return One or more conditions that must be met for the recipe step to succeed.</p> <note>
     *         <p>
     *         All of the conditions in the array must be met. In other words, all of the conditions must be combined
     *         using a logical AND operation.
     *         </p>
     */

    public java.util.List<ConditionExpression> getConditionExpressions() {
        return conditionExpressions;
    }

    /**
     * <p>
     * One or more conditions that must be met for the recipe step to succeed.
     * </p>
     * <note>
     * <p>
     * All of the conditions in the array must be met. In other words, all of the conditions must be combined using a
     * logical AND operation.
     * </p>
     * </note>
     * 
     * @param conditionExpressions
     *        One or more conditions that must be met for the recipe step to succeed.</p> <note>
     *        <p>
     *        All of the conditions in the array must be met. In other words, all of the conditions must be combined
     *        using a logical AND operation.
     *        </p>
     */

    public void setConditionExpressions(java.util.Collection<ConditionExpression> conditionExpressions) {
        if (conditionExpressions == null) {
            this.conditionExpressions = null;
            return;
        }

        this.conditionExpressions = new java.util.ArrayList<ConditionExpression>(conditionExpressions);
    }

    /**
     * <p>
     * One or more conditions that must be met for the recipe step to succeed.
     * </p>
     * <note>
     * <p>
     * All of the conditions in the array must be met. In other words, all of the conditions must be combined using a
     * logical AND operation.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionExpressions(java.util.Collection)} or {@link #withConditionExpressions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conditionExpressions
     *        One or more conditions that must be met for the recipe step to succeed.</p> <note>
     *        <p>
     *        All of the conditions in the array must be met. In other words, all of the conditions must be combined
     *        using a logical AND operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeStep withConditionExpressions(ConditionExpression... conditionExpressions) {
        if (this.conditionExpressions == null) {
            setConditionExpressions(new java.util.ArrayList<ConditionExpression>(conditionExpressions.length));
        }
        for (ConditionExpression ele : conditionExpressions) {
            this.conditionExpressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more conditions that must be met for the recipe step to succeed.
     * </p>
     * <note>
     * <p>
     * All of the conditions in the array must be met. In other words, all of the conditions must be combined using a
     * logical AND operation.
     * </p>
     * </note>
     * 
     * @param conditionExpressions
     *        One or more conditions that must be met for the recipe step to succeed.</p> <note>
     *        <p>
     *        All of the conditions in the array must be met. In other words, all of the conditions must be combined
     *        using a logical AND operation.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeStep withConditionExpressions(java.util.Collection<ConditionExpression> conditionExpressions) {
        setConditionExpressions(conditionExpressions);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getConditionExpressions() != null)
            sb.append("ConditionExpressions: ").append(getConditionExpressions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecipeStep == false)
            return false;
        RecipeStep other = (RecipeStep) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getConditionExpressions() == null ^ this.getConditionExpressions() == null)
            return false;
        if (other.getConditionExpressions() != null && other.getConditionExpressions().equals(this.getConditionExpressions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getConditionExpressions() == null) ? 0 : getConditionExpressions().hashCode());
        return hashCode;
    }

    @Override
    public RecipeStep clone() {
        try {
            return (RecipeStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RecipeStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
