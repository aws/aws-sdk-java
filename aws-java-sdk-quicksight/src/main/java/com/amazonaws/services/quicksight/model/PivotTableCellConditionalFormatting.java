/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cell conditional formatting option for a pivot table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableCellConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableCellConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID of the cell for conditional formatting.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The text format of the cell for conditional formatting.
     * </p>
     */
    private TextConditionalFormat textFormat;
    /**
     * <p>
     * The scope of the cell for conditional formatting.
     * </p>
     */
    private PivotTableConditionalFormattingScope scope;
    /**
     * <p>
     * A list of cell scopes for conditional formatting.
     * </p>
     */
    private java.util.List<PivotTableConditionalFormattingScope> scopes;

    /**
     * <p>
     * The field ID of the cell for conditional formatting.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the cell for conditional formatting.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID of the cell for conditional formatting.
     * </p>
     * 
     * @return The field ID of the cell for conditional formatting.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID of the cell for conditional formatting.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the cell for conditional formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableCellConditionalFormatting withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The text format of the cell for conditional formatting.
     * </p>
     * 
     * @param textFormat
     *        The text format of the cell for conditional formatting.
     */

    public void setTextFormat(TextConditionalFormat textFormat) {
        this.textFormat = textFormat;
    }

    /**
     * <p>
     * The text format of the cell for conditional formatting.
     * </p>
     * 
     * @return The text format of the cell for conditional formatting.
     */

    public TextConditionalFormat getTextFormat() {
        return this.textFormat;
    }

    /**
     * <p>
     * The text format of the cell for conditional formatting.
     * </p>
     * 
     * @param textFormat
     *        The text format of the cell for conditional formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableCellConditionalFormatting withTextFormat(TextConditionalFormat textFormat) {
        setTextFormat(textFormat);
        return this;
    }

    /**
     * <p>
     * The scope of the cell for conditional formatting.
     * </p>
     * 
     * @param scope
     *        The scope of the cell for conditional formatting.
     */

    public void setScope(PivotTableConditionalFormattingScope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the cell for conditional formatting.
     * </p>
     * 
     * @return The scope of the cell for conditional formatting.
     */

    public PivotTableConditionalFormattingScope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the cell for conditional formatting.
     * </p>
     * 
     * @param scope
     *        The scope of the cell for conditional formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableCellConditionalFormatting withScope(PivotTableConditionalFormattingScope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * A list of cell scopes for conditional formatting.
     * </p>
     * 
     * @return A list of cell scopes for conditional formatting.
     */

    public java.util.List<PivotTableConditionalFormattingScope> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * A list of cell scopes for conditional formatting.
     * </p>
     * 
     * @param scopes
     *        A list of cell scopes for conditional formatting.
     */

    public void setScopes(java.util.Collection<PivotTableConditionalFormattingScope> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<PivotTableConditionalFormattingScope>(scopes);
    }

    /**
     * <p>
     * A list of cell scopes for conditional formatting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        A list of cell scopes for conditional formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableCellConditionalFormatting withScopes(PivotTableConditionalFormattingScope... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<PivotTableConditionalFormattingScope>(scopes.length));
        }
        for (PivotTableConditionalFormattingScope ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cell scopes for conditional formatting.
     * </p>
     * 
     * @param scopes
     *        A list of cell scopes for conditional formatting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableCellConditionalFormatting withScopes(java.util.Collection<PivotTableConditionalFormattingScope> scopes) {
        setScopes(scopes);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getTextFormat() != null)
            sb.append("TextFormat: ").append(getTextFormat()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableCellConditionalFormatting == false)
            return false;
        PivotTableCellConditionalFormatting other = (PivotTableCellConditionalFormatting) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getTextFormat() == null ^ this.getTextFormat() == null)
            return false;
        if (other.getTextFormat() != null && other.getTextFormat().equals(this.getTextFormat()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getTextFormat() == null) ? 0 : getTextFormat().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableCellConditionalFormatting clone() {
        try {
            return (PivotTableCellConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableCellConditionalFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
