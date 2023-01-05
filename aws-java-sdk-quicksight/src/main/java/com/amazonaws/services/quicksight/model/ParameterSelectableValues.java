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
 * A list of selectable values that are used in a control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterSelectableValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterSelectableValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values that are used in <code>ParameterSelectableValues</code>.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The column identifier that fetches values from the data set.
     * </p>
     */
    private ColumnIdentifier linkToDataSetColumn;

    /**
     * <p>
     * The values that are used in <code>ParameterSelectableValues</code>.
     * </p>
     * 
     * @return The values that are used in <code>ParameterSelectableValues</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that are used in <code>ParameterSelectableValues</code>.
     * </p>
     * 
     * @param values
     *        The values that are used in <code>ParameterSelectableValues</code>.
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
     * The values that are used in <code>ParameterSelectableValues</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values that are used in <code>ParameterSelectableValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSelectableValues withValues(String... values) {
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
     * The values that are used in <code>ParameterSelectableValues</code>.
     * </p>
     * 
     * @param values
     *        The values that are used in <code>ParameterSelectableValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSelectableValues withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The column identifier that fetches values from the data set.
     * </p>
     * 
     * @param linkToDataSetColumn
     *        The column identifier that fetches values from the data set.
     */

    public void setLinkToDataSetColumn(ColumnIdentifier linkToDataSetColumn) {
        this.linkToDataSetColumn = linkToDataSetColumn;
    }

    /**
     * <p>
     * The column identifier that fetches values from the data set.
     * </p>
     * 
     * @return The column identifier that fetches values from the data set.
     */

    public ColumnIdentifier getLinkToDataSetColumn() {
        return this.linkToDataSetColumn;
    }

    /**
     * <p>
     * The column identifier that fetches values from the data set.
     * </p>
     * 
     * @param linkToDataSetColumn
     *        The column identifier that fetches values from the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterSelectableValues withLinkToDataSetColumn(ColumnIdentifier linkToDataSetColumn) {
        setLinkToDataSetColumn(linkToDataSetColumn);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getLinkToDataSetColumn() != null)
            sb.append("LinkToDataSetColumn: ").append(getLinkToDataSetColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterSelectableValues == false)
            return false;
        ParameterSelectableValues other = (ParameterSelectableValues) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getLinkToDataSetColumn() == null ^ this.getLinkToDataSetColumn() == null)
            return false;
        if (other.getLinkToDataSetColumn() != null && other.getLinkToDataSetColumn().equals(this.getLinkToDataSetColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getLinkToDataSetColumn() == null) ? 0 : getLinkToDataSetColumn().hashCode());
        return hashCode;
    }

    @Override
    public ParameterSelectableValues clone() {
        try {
            return (ParameterSelectableValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterSelectableValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
