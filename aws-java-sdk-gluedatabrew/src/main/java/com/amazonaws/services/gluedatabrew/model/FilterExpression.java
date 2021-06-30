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
 * Represents a structure for defining parameter conditions. Supported conditions are described here: <a
 * href="https://docs-aws.amazon.com/databrew/latest/dg/datasets.multiple-files.html#conditions.for.dynamic.datasets"
 * >Supported conditions for dynamic datasets</a> in the <i>Glue DataBrew Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/FilterExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression which includes condition names followed by substitution variables, possibly grouped and combined
     * with other conditions. For example,
     * "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)". Substitution
     * variables should start with ':' symbol.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The map of substitution variable names to their values used in this filter expression.
     * </p>
     */
    private java.util.Map<String, String> valuesMap;

    /**
     * <p>
     * The expression which includes condition names followed by substitution variables, possibly grouped and combined
     * with other conditions. For example,
     * "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)". Substitution
     * variables should start with ':' symbol.
     * </p>
     * 
     * @param expression
     *        The expression which includes condition names followed by substitution variables, possibly grouped and
     *        combined with other conditions. For example,
     *        "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)".
     *        Substitution variables should start with ':' symbol.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression which includes condition names followed by substitution variables, possibly grouped and combined
     * with other conditions. For example,
     * "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)". Substitution
     * variables should start with ':' symbol.
     * </p>
     * 
     * @return The expression which includes condition names followed by substitution variables, possibly grouped and
     *         combined with other conditions. For example,
     *         "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)".
     *         Substitution variables should start with ':' symbol.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression which includes condition names followed by substitution variables, possibly grouped and combined
     * with other conditions. For example,
     * "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)". Substitution
     * variables should start with ':' symbol.
     * </p>
     * 
     * @param expression
     *        The expression which includes condition names followed by substitution variables, possibly grouped and
     *        combined with other conditions. For example,
     *        "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)".
     *        Substitution variables should start with ':' symbol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in this filter expression.
     * </p>
     * 
     * @return The map of substitution variable names to their values used in this filter expression.
     */

    public java.util.Map<String, String> getValuesMap() {
        return valuesMap;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in this filter expression.
     * </p>
     * 
     * @param valuesMap
     *        The map of substitution variable names to their values used in this filter expression.
     */

    public void setValuesMap(java.util.Map<String, String> valuesMap) {
        this.valuesMap = valuesMap;
    }

    /**
     * <p>
     * The map of substitution variable names to their values used in this filter expression.
     * </p>
     * 
     * @param valuesMap
     *        The map of substitution variable names to their values used in this filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression withValuesMap(java.util.Map<String, String> valuesMap) {
        setValuesMap(valuesMap);
        return this;
    }

    /**
     * Add a single ValuesMap entry
     *
     * @see FilterExpression#withValuesMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression addValuesMapEntry(String key, String value) {
        if (null == this.valuesMap) {
            this.valuesMap = new java.util.HashMap<String, String>();
        }
        if (this.valuesMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.valuesMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ValuesMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterExpression clearValuesMapEntries() {
        this.valuesMap = null;
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getValuesMap() != null)
            sb.append("ValuesMap: ").append(getValuesMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterExpression == false)
            return false;
        FilterExpression other = (FilterExpression) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getValuesMap() == null ^ this.getValuesMap() == null)
            return false;
        if (other.getValuesMap() != null && other.getValuesMap().equals(this.getValuesMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getValuesMap() == null) ? 0 : getValuesMap().hashCode());
        return hashCode;
    }

    @Override
    public FilterExpression clone() {
        try {
            return (FilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.FilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
