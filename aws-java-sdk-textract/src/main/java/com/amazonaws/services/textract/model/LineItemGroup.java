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
 * A grouping of tables which contain LineItems, with each table identified by the table's
 * <code>LineItemGroupIndex</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LineItemGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineItemGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number used to identify a specific table in a document. The first table encountered will have a
     * LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     */
    private Integer lineItemGroupIndex;
    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     */
    private java.util.List<LineItemFields> lineItems;

    /**
     * <p>
     * The number used to identify a specific table in a document. The first table encountered will have a
     * LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * 
     * @param lineItemGroupIndex
     *        The number used to identify a specific table in a document. The first table encountered will have a
     *        LineItemGroupIndex of 1, the second 2, etc.
     */

    public void setLineItemGroupIndex(Integer lineItemGroupIndex) {
        this.lineItemGroupIndex = lineItemGroupIndex;
    }

    /**
     * <p>
     * The number used to identify a specific table in a document. The first table encountered will have a
     * LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * 
     * @return The number used to identify a specific table in a document. The first table encountered will have a
     *         LineItemGroupIndex of 1, the second 2, etc.
     */

    public Integer getLineItemGroupIndex() {
        return this.lineItemGroupIndex;
    }

    /**
     * <p>
     * The number used to identify a specific table in a document. The first table encountered will have a
     * LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * 
     * @param lineItemGroupIndex
     *        The number used to identify a specific table in a document. The first table encountered will have a
     *        LineItemGroupIndex of 1, the second 2, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemGroup withLineItemGroupIndex(Integer lineItemGroupIndex) {
        setLineItemGroupIndex(lineItemGroupIndex);
        return this;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * 
     * @return The breakdown of information on a particular line of a table.
     */

    public java.util.List<LineItemFields> getLineItems() {
        return lineItems;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * 
     * @param lineItems
     *        The breakdown of information on a particular line of a table.
     */

    public void setLineItems(java.util.Collection<LineItemFields> lineItems) {
        if (lineItems == null) {
            this.lineItems = null;
            return;
        }

        this.lineItems = new java.util.ArrayList<LineItemFields>(lineItems);
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineItems(java.util.Collection)} or {@link #withLineItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineItems
     *        The breakdown of information on a particular line of a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemGroup withLineItems(LineItemFields... lineItems) {
        if (this.lineItems == null) {
            setLineItems(new java.util.ArrayList<LineItemFields>(lineItems.length));
        }
        for (LineItemFields ele : lineItems) {
            this.lineItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * 
     * @param lineItems
     *        The breakdown of information on a particular line of a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItemGroup withLineItems(java.util.Collection<LineItemFields> lineItems) {
        setLineItems(lineItems);
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
        if (getLineItemGroupIndex() != null)
            sb.append("LineItemGroupIndex: ").append(getLineItemGroupIndex()).append(",");
        if (getLineItems() != null)
            sb.append("LineItems: ").append(getLineItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemGroup == false)
            return false;
        LineItemGroup other = (LineItemGroup) obj;
        if (other.getLineItemGroupIndex() == null ^ this.getLineItemGroupIndex() == null)
            return false;
        if (other.getLineItemGroupIndex() != null && other.getLineItemGroupIndex().equals(this.getLineItemGroupIndex()) == false)
            return false;
        if (other.getLineItems() == null ^ this.getLineItems() == null)
            return false;
        if (other.getLineItems() != null && other.getLineItems().equals(this.getLineItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineItemGroupIndex() == null) ? 0 : getLineItemGroupIndex().hashCode());
        hashCode = prime * hashCode + ((getLineItems() == null) ? 0 : getLineItems().hashCode());
        return hashCode;
    }

    @Override
    public LineItemGroup clone() {
        try {
            return (LineItemGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LineItemGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
