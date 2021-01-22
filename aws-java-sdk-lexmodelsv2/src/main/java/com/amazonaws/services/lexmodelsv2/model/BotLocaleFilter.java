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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters responses returned by the <code>ListBotLocales</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotLocaleFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotLocaleFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the field to filter the list of bots.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value to use for filtering the list of bots.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation should
     * return only aliases that equal the specified value. Specify <code>CO</code> when the <code>ListBotLocales</code>
     * operation should return aliases that contain the specified value.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The name of the field to filter the list of bots.
     * </p>
     * 
     * @param name
     *        The name of the field to filter the list of bots.
     * @see BotLocaleFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the field to filter the list of bots.
     * </p>
     * 
     * @return The name of the field to filter the list of bots.
     * @see BotLocaleFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the field to filter the list of bots.
     * </p>
     * 
     * @param name
     *        The name of the field to filter the list of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleFilterName
     */

    public BotLocaleFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the field to filter the list of bots.
     * </p>
     * 
     * @param name
     *        The name of the field to filter the list of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleFilterName
     */

    public BotLocaleFilter withName(BotLocaleFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value to use for filtering the list of bots.
     * </p>
     * 
     * @return The value to use for filtering the list of bots.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value to use for filtering the list of bots.
     * </p>
     * 
     * @param values
     *        The value to use for filtering the list of bots.
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
     * The value to use for filtering the list of bots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value to use for filtering the list of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleFilter withValues(String... values) {
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
     * The value to use for filtering the list of bots.
     * </p>
     * 
     * @param values
     *        The value to use for filtering the list of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation should
     * return only aliases that equal the specified value. Specify <code>CO</code> when the <code>ListBotLocales</code>
     * operation should return aliases that contain the specified value.
     * </p>
     * 
     * @param operator
     *        The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation
     *        should return only aliases that equal the specified value. Specify <code>CO</code> when the
     *        <code>ListBotLocales</code> operation should return aliases that contain the specified value.
     * @see BotLocaleFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation should
     * return only aliases that equal the specified value. Specify <code>CO</code> when the <code>ListBotLocales</code>
     * operation should return aliases that contain the specified value.
     * </p>
     * 
     * @return The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code>
     *         operation should return only aliases that equal the specified value. Specify <code>CO</code> when the
     *         <code>ListBotLocales</code> operation should return aliases that contain the specified value.
     * @see BotLocaleFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation should
     * return only aliases that equal the specified value. Specify <code>CO</code> when the <code>ListBotLocales</code>
     * operation should return aliases that contain the specified value.
     * </p>
     * 
     * @param operator
     *        The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation
     *        should return only aliases that equal the specified value. Specify <code>CO</code> when the
     *        <code>ListBotLocales</code> operation should return aliases that contain the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleFilterOperator
     */

    public BotLocaleFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation should
     * return only aliases that equal the specified value. Specify <code>CO</code> when the <code>ListBotLocales</code>
     * operation should return aliases that contain the specified value.
     * </p>
     * 
     * @param operator
     *        The operator to use for the filter. Specify <code>EQ</code> when the <code>ListBotLocales</code> operation
     *        should return only aliases that equal the specified value. Specify <code>CO</code> when the
     *        <code>ListBotLocales</code> operation should return aliases that contain the specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleFilterOperator
     */

    public BotLocaleFilter withOperator(BotLocaleFilterOperator operator) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
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

        if (obj instanceof BotLocaleFilter == false)
            return false;
        BotLocaleFilter other = (BotLocaleFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public BotLocaleFilter clone() {
        try {
            return (BotLocaleFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotLocaleFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
