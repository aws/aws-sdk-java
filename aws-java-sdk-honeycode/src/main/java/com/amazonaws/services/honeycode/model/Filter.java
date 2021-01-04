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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a filter formula along with the id of the context row under which the filter function needs
 * to evaluate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A formula representing a filter function that returns zero or more matching rows from a table. Valid formulas in
     * this field return a list of rows from a table. The most common ways of writing a formula to return a list of rows
     * are to use the FindRow() or Filter() functions. Any other formula that returns zero or more rows is also
     * acceptable. For example, you can use a formula that points to a cell that contains a filter function.
     * </p>
     */
    private String formula;
    /**
     * <p>
     * The optional contextRowId attribute can be used to specify the row id of the context row if the filter formula
     * contains unqualified references to table columns and needs a context row to evaluate them successfully.
     * </p>
     */
    private String contextRowId;

    /**
     * <p>
     * A formula representing a filter function that returns zero or more matching rows from a table. Valid formulas in
     * this field return a list of rows from a table. The most common ways of writing a formula to return a list of rows
     * are to use the FindRow() or Filter() functions. Any other formula that returns zero or more rows is also
     * acceptable. For example, you can use a formula that points to a cell that contains a filter function.
     * </p>
     * 
     * @param formula
     *        A formula representing a filter function that returns zero or more matching rows from a table. Valid
     *        formulas in this field return a list of rows from a table. The most common ways of writing a formula to
     *        return a list of rows are to use the FindRow() or Filter() functions. Any other formula that returns zero
     *        or more rows is also acceptable. For example, you can use a formula that points to a cell that contains a
     *        filter function.
     */

    public void setFormula(String formula) {
        this.formula = formula;
    }

    /**
     * <p>
     * A formula representing a filter function that returns zero or more matching rows from a table. Valid formulas in
     * this field return a list of rows from a table. The most common ways of writing a formula to return a list of rows
     * are to use the FindRow() or Filter() functions. Any other formula that returns zero or more rows is also
     * acceptable. For example, you can use a formula that points to a cell that contains a filter function.
     * </p>
     * 
     * @return A formula representing a filter function that returns zero or more matching rows from a table. Valid
     *         formulas in this field return a list of rows from a table. The most common ways of writing a formula to
     *         return a list of rows are to use the FindRow() or Filter() functions. Any other formula that returns zero
     *         or more rows is also acceptable. For example, you can use a formula that points to a cell that contains a
     *         filter function.
     */

    public String getFormula() {
        return this.formula;
    }

    /**
     * <p>
     * A formula representing a filter function that returns zero or more matching rows from a table. Valid formulas in
     * this field return a list of rows from a table. The most common ways of writing a formula to return a list of rows
     * are to use the FindRow() or Filter() functions. Any other formula that returns zero or more rows is also
     * acceptable. For example, you can use a formula that points to a cell that contains a filter function.
     * </p>
     * 
     * @param formula
     *        A formula representing a filter function that returns zero or more matching rows from a table. Valid
     *        formulas in this field return a list of rows from a table. The most common ways of writing a formula to
     *        return a list of rows are to use the FindRow() or Filter() functions. Any other formula that returns zero
     *        or more rows is also acceptable. For example, you can use a formula that points to a cell that contains a
     *        filter function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withFormula(String formula) {
        setFormula(formula);
        return this;
    }

    /**
     * <p>
     * The optional contextRowId attribute can be used to specify the row id of the context row if the filter formula
     * contains unqualified references to table columns and needs a context row to evaluate them successfully.
     * </p>
     * 
     * @param contextRowId
     *        The optional contextRowId attribute can be used to specify the row id of the context row if the filter
     *        formula contains unqualified references to table columns and needs a context row to evaluate them
     *        successfully.
     */

    public void setContextRowId(String contextRowId) {
        this.contextRowId = contextRowId;
    }

    /**
     * <p>
     * The optional contextRowId attribute can be used to specify the row id of the context row if the filter formula
     * contains unqualified references to table columns and needs a context row to evaluate them successfully.
     * </p>
     * 
     * @return The optional contextRowId attribute can be used to specify the row id of the context row if the filter
     *         formula contains unqualified references to table columns and needs a context row to evaluate them
     *         successfully.
     */

    public String getContextRowId() {
        return this.contextRowId;
    }

    /**
     * <p>
     * The optional contextRowId attribute can be used to specify the row id of the context row if the filter formula
     * contains unqualified references to table columns and needs a context row to evaluate them successfully.
     * </p>
     * 
     * @param contextRowId
     *        The optional contextRowId attribute can be used to specify the row id of the context row if the filter
     *        formula contains unqualified references to table columns and needs a context row to evaluate them
     *        successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withContextRowId(String contextRowId) {
        setContextRowId(contextRowId);
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
        if (getFormula() != null)
            sb.append("Formula: ").append("***Sensitive Data Redacted***").append(",");
        if (getContextRowId() != null)
            sb.append("ContextRowId: ").append(getContextRowId());
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
        if (other.getFormula() == null ^ this.getFormula() == null)
            return false;
        if (other.getFormula() != null && other.getFormula().equals(this.getFormula()) == false)
            return false;
        if (other.getContextRowId() == null ^ this.getContextRowId() == null)
            return false;
        if (other.getContextRowId() != null && other.getContextRowId().equals(this.getContextRowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormula() == null) ? 0 : getFormula().hashCode());
        hashCode = prime * hashCode + ((getContextRowId() == null) ? 0 : getContextRowId().hashCode());
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
        com.amazonaws.services.honeycode.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
