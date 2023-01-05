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
 * The sort configuration for a <code>PivotTableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field sort options for a pivot table sort configuration.
     * </p>
     */
    private java.util.List<PivotFieldSortOptions> fieldSortOptions;

    /**
     * <p>
     * The field sort options for a pivot table sort configuration.
     * </p>
     * 
     * @return The field sort options for a pivot table sort configuration.
     */

    public java.util.List<PivotFieldSortOptions> getFieldSortOptions() {
        return fieldSortOptions;
    }

    /**
     * <p>
     * The field sort options for a pivot table sort configuration.
     * </p>
     * 
     * @param fieldSortOptions
     *        The field sort options for a pivot table sort configuration.
     */

    public void setFieldSortOptions(java.util.Collection<PivotFieldSortOptions> fieldSortOptions) {
        if (fieldSortOptions == null) {
            this.fieldSortOptions = null;
            return;
        }

        this.fieldSortOptions = new java.util.ArrayList<PivotFieldSortOptions>(fieldSortOptions);
    }

    /**
     * <p>
     * The field sort options for a pivot table sort configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldSortOptions(java.util.Collection)} or {@link #withFieldSortOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fieldSortOptions
     *        The field sort options for a pivot table sort configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableSortConfiguration withFieldSortOptions(PivotFieldSortOptions... fieldSortOptions) {
        if (this.fieldSortOptions == null) {
            setFieldSortOptions(new java.util.ArrayList<PivotFieldSortOptions>(fieldSortOptions.length));
        }
        for (PivotFieldSortOptions ele : fieldSortOptions) {
            this.fieldSortOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field sort options for a pivot table sort configuration.
     * </p>
     * 
     * @param fieldSortOptions
     *        The field sort options for a pivot table sort configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableSortConfiguration withFieldSortOptions(java.util.Collection<PivotFieldSortOptions> fieldSortOptions) {
        setFieldSortOptions(fieldSortOptions);
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
        if (getFieldSortOptions() != null)
            sb.append("FieldSortOptions: ").append(getFieldSortOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableSortConfiguration == false)
            return false;
        PivotTableSortConfiguration other = (PivotTableSortConfiguration) obj;
        if (other.getFieldSortOptions() == null ^ this.getFieldSortOptions() == null)
            return false;
        if (other.getFieldSortOptions() != null && other.getFieldSortOptions().equals(this.getFieldSortOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldSortOptions() == null) ? 0 : getFieldSortOptions().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableSortConfiguration clone() {
        try {
            return (PivotTableSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
