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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for a split charge method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategorySplitChargeRuleParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategorySplitChargeRuleParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The parameter values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @param type
     *        The parameter type.
     * @see CostCategorySplitChargeRuleParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @return The parameter type.
     * @see CostCategorySplitChargeRuleParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @param type
     *        The parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategorySplitChargeRuleParameterType
     */

    public CostCategorySplitChargeRuleParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @param type
     *        The parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategorySplitChargeRuleParameterType
     */

    public CostCategorySplitChargeRuleParameter withType(CostCategorySplitChargeRuleParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @return The parameter values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @param values
     *        The parameter values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRuleParameter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter values.
     * </p>
     * 
     * @param values
     *        The parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategorySplitChargeRuleParameter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategorySplitChargeRuleParameter == false)
            return false;
        CostCategorySplitChargeRuleParameter other = (CostCategorySplitChargeRuleParameter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public CostCategorySplitChargeRuleParameter clone() {
        try {
            return (CostCategorySplitChargeRuleParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategorySplitChargeRuleParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
