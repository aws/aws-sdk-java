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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that holds information about the different lines found in a document's tables.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LineItemFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineItemFields implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     */
    private java.util.List<ExpenseField> lineItemExpenseFields;

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * 
     * @return ExpenseFields used to show information from detected lines on a table.
     */

    public java.util.List<ExpenseField> getLineItemExpenseFields() {
        return lineItemExpenseFields;
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * 
     * @param lineItemExpenseFields
     *        ExpenseFields used to show information from detected lines on a table.
     */

    public void setLineItemExpenseFields(java.util.Collection<ExpenseField> lineItemExpenseFields) {
        if (lineItemExpenseFields == null) {
            this.lineItemExpenseFields = null;
            return;
        }

        this.lineItemExpenseFields = new java.util.ArrayList<ExpenseField>(lineItemExpenseFields);
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItemExpenseFields(java.util.Collection)} or
     * {@link #withLineItemExpenseFields(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lineItemExpenseFields
     *        ExpenseFields used to show information from detected lines on a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemFields withLineItemExpenseFields(ExpenseField... lineItemExpenseFields) {
        if (this.lineItemExpenseFields == null) {
            setLineItemExpenseFields(new java.util.ArrayList<ExpenseField>(lineItemExpenseFields.length));
        }
        for (ExpenseField ele : lineItemExpenseFields) {
            this.lineItemExpenseFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * ExpenseFields used to show information from detected lines on a table.
     * </p>
     * 
     * @param lineItemExpenseFields
     *        ExpenseFields used to show information from detected lines on a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemFields withLineItemExpenseFields(java.util.Collection<ExpenseField> lineItemExpenseFields) {
        setLineItemExpenseFields(lineItemExpenseFields);
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
        if (getLineItemExpenseFields() != null)
            sb.append("LineItemExpenseFields: ").append(getLineItemExpenseFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemFields == false)
            return false;
        LineItemFields other = (LineItemFields) obj;
        if (other.getLineItemExpenseFields() == null ^ this.getLineItemExpenseFields() == null)
            return false;
        if (other.getLineItemExpenseFields() != null && other.getLineItemExpenseFields().equals(this.getLineItemExpenseFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineItemExpenseFields() == null) ? 0 : getLineItemExpenseFields().hashCode());
        return hashCode;
    }

    @Override
    public LineItemFields clone() {
        try {
            return (LineItemFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LineItemFieldsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
