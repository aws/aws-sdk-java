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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The conditional formatting of a table row.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableRowConditionalFormatting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRowConditionalFormatting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the background for a table row.
     * </p>
     */
    private ConditionalFormattingColor backgroundColor;
    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the text for a table row.
     * </p>
     */
    private ConditionalFormattingColor textColor;

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the background for a table row.
     * </p>
     * 
     * @param backgroundColor
     *        The conditional formatting color (solid, gradient) of the background for a table row.
     */

    public void setBackgroundColor(ConditionalFormattingColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the background for a table row.
     * </p>
     * 
     * @return The conditional formatting color (solid, gradient) of the background for a table row.
     */

    public ConditionalFormattingColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the background for a table row.
     * </p>
     * 
     * @param backgroundColor
     *        The conditional formatting color (solid, gradient) of the background for a table row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRowConditionalFormatting withBackgroundColor(ConditionalFormattingColor backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the text for a table row.
     * </p>
     * 
     * @param textColor
     *        The conditional formatting color (solid, gradient) of the text for a table row.
     */

    public void setTextColor(ConditionalFormattingColor textColor) {
        this.textColor = textColor;
    }

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the text for a table row.
     * </p>
     * 
     * @return The conditional formatting color (solid, gradient) of the text for a table row.
     */

    public ConditionalFormattingColor getTextColor() {
        return this.textColor;
    }

    /**
     * <p>
     * The conditional formatting color (solid, gradient) of the text for a table row.
     * </p>
     * 
     * @param textColor
     *        The conditional formatting color (solid, gradient) of the text for a table row.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableRowConditionalFormatting withTextColor(ConditionalFormattingColor textColor) {
        setTextColor(textColor);
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
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor()).append(",");
        if (getTextColor() != null)
            sb.append("TextColor: ").append(getTextColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableRowConditionalFormatting == false)
            return false;
        TableRowConditionalFormatting other = (TableRowConditionalFormatting) obj;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getTextColor() == null ^ this.getTextColor() == null)
            return false;
        if (other.getTextColor() != null && other.getTextColor().equals(this.getTextColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getTextColor() == null) ? 0 : getTextColor().hashCode());
        return hashCode;
    }

    @Override
    public TableRowConditionalFormatting clone() {
        try {
            return (TableRowConditionalFormatting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableRowConditionalFormattingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
