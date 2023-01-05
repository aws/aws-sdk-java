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
 * Aggregated field wells of a tree map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TreeMapAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreeMapAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group by field well of a tree map. Values are grouped based on group by fields.
     * </p>
     */
    private java.util.List<DimensionField> groups;
    /**
     * <p>
     * The size field well of a tree map. Values are aggregated based on group by fields.
     * </p>
     */
    private java.util.List<MeasureField> sizes;
    /**
     * <p>
     * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * </p>
     */
    private java.util.List<MeasureField> colors;

    /**
     * <p>
     * The group by field well of a tree map. Values are grouped based on group by fields.
     * </p>
     * 
     * @return The group by field well of a tree map. Values are grouped based on group by fields.
     */

    public java.util.List<DimensionField> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The group by field well of a tree map. Values are grouped based on group by fields.
     * </p>
     * 
     * @param groups
     *        The group by field well of a tree map. Values are grouped based on group by fields.
     */

    public void setGroups(java.util.Collection<DimensionField> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<DimensionField>(groups);
    }

    /**
     * <p>
     * The group by field well of a tree map. Values are grouped based on group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The group by field well of a tree map. Values are grouped based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withGroups(DimensionField... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<DimensionField>(groups.length));
        }
        for (DimensionField ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The group by field well of a tree map. Values are grouped based on group by fields.
     * </p>
     * 
     * @param groups
     *        The group by field well of a tree map. Values are grouped based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withGroups(java.util.Collection<DimensionField> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The size field well of a tree map. Values are aggregated based on group by fields.
     * </p>
     * 
     * @return The size field well of a tree map. Values are aggregated based on group by fields.
     */

    public java.util.List<MeasureField> getSizes() {
        return sizes;
    }

    /**
     * <p>
     * The size field well of a tree map. Values are aggregated based on group by fields.
     * </p>
     * 
     * @param sizes
     *        The size field well of a tree map. Values are aggregated based on group by fields.
     */

    public void setSizes(java.util.Collection<MeasureField> sizes) {
        if (sizes == null) {
            this.sizes = null;
            return;
        }

        this.sizes = new java.util.ArrayList<MeasureField>(sizes);
    }

    /**
     * <p>
     * The size field well of a tree map. Values are aggregated based on group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSizes(java.util.Collection)} or {@link #withSizes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sizes
     *        The size field well of a tree map. Values are aggregated based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withSizes(MeasureField... sizes) {
        if (this.sizes == null) {
            setSizes(new java.util.ArrayList<MeasureField>(sizes.length));
        }
        for (MeasureField ele : sizes) {
            this.sizes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The size field well of a tree map. Values are aggregated based on group by fields.
     * </p>
     * 
     * @param sizes
     *        The size field well of a tree map. Values are aggregated based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withSizes(java.util.Collection<MeasureField> sizes) {
        setSizes(sizes);
        return this;
    }

    /**
     * <p>
     * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * </p>
     * 
     * @return The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     */

    public java.util.List<MeasureField> getColors() {
        return colors;
    }

    /**
     * <p>
     * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * </p>
     * 
     * @param colors
     *        The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     */

    public void setColors(java.util.Collection<MeasureField> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<MeasureField>(colors);
    }

    /**
     * <p>
     * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withColors(MeasureField... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<MeasureField>(colors.length));
        }
        for (MeasureField ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * </p>
     * 
     * @param colors
     *        The color field well of a tree map. Values are grouped by aggregations based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapAggregatedFieldWells withColors(java.util.Collection<MeasureField> colors) {
        setColors(colors);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getSizes() != null)
            sb.append("Sizes: ").append(getSizes()).append(",");
        if (getColors() != null)
            sb.append("Colors: ").append(getColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TreeMapAggregatedFieldWells == false)
            return false;
        TreeMapAggregatedFieldWells other = (TreeMapAggregatedFieldWells) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getSizes() == null ^ this.getSizes() == null)
            return false;
        if (other.getSizes() != null && other.getSizes().equals(this.getSizes()) == false)
            return false;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getSizes() == null) ? 0 : getSizes().hashCode());
        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        return hashCode;
    }

    @Override
    public TreeMapAggregatedFieldWells clone() {
        try {
            return (TreeMapAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TreeMapAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
