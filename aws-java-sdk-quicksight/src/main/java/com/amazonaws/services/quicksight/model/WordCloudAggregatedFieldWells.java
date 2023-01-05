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
 * The aggregated field wells of a word cloud.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WordCloudAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WordCloudAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group by field well of a word cloud. Values are grouped by group by fields.
     * </p>
     */
    private java.util.List<DimensionField> groupBy;
    /**
     * <p>
     * The size field well of a word cloud. Values are aggregated based on group by fields.
     * </p>
     */
    private java.util.List<MeasureField> size;

    /**
     * <p>
     * The group by field well of a word cloud. Values are grouped by group by fields.
     * </p>
     * 
     * @return The group by field well of a word cloud. Values are grouped by group by fields.
     */

    public java.util.List<DimensionField> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * The group by field well of a word cloud. Values are grouped by group by fields.
     * </p>
     * 
     * @param groupBy
     *        The group by field well of a word cloud. Values are grouped by group by fields.
     */

    public void setGroupBy(java.util.Collection<DimensionField> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<DimensionField>(groupBy);
    }

    /**
     * <p>
     * The group by field well of a word cloud. Values are grouped by group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        The group by field well of a word cloud. Values are grouped by group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudAggregatedFieldWells withGroupBy(DimensionField... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<DimensionField>(groupBy.length));
        }
        for (DimensionField ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The group by field well of a word cloud. Values are grouped by group by fields.
     * </p>
     * 
     * @param groupBy
     *        The group by field well of a word cloud. Values are grouped by group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudAggregatedFieldWells withGroupBy(java.util.Collection<DimensionField> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The size field well of a word cloud. Values are aggregated based on group by fields.
     * </p>
     * 
     * @return The size field well of a word cloud. Values are aggregated based on group by fields.
     */

    public java.util.List<MeasureField> getSize() {
        return size;
    }

    /**
     * <p>
     * The size field well of a word cloud. Values are aggregated based on group by fields.
     * </p>
     * 
     * @param size
     *        The size field well of a word cloud. Values are aggregated based on group by fields.
     */

    public void setSize(java.util.Collection<MeasureField> size) {
        if (size == null) {
            this.size = null;
            return;
        }

        this.size = new java.util.ArrayList<MeasureField>(size);
    }

    /**
     * <p>
     * The size field well of a word cloud. Values are aggregated based on group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSize(java.util.Collection)} or {@link #withSize(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param size
     *        The size field well of a word cloud. Values are aggregated based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudAggregatedFieldWells withSize(MeasureField... size) {
        if (this.size == null) {
            setSize(new java.util.ArrayList<MeasureField>(size.length));
        }
        for (MeasureField ele : size) {
            this.size.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The size field well of a word cloud. Values are aggregated based on group by fields.
     * </p>
     * 
     * @param size
     *        The size field well of a word cloud. Values are aggregated based on group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudAggregatedFieldWells withSize(java.util.Collection<MeasureField> size) {
        setSize(size);
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
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WordCloudAggregatedFieldWells == false)
            return false;
        WordCloudAggregatedFieldWells other = (WordCloudAggregatedFieldWells) obj;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public WordCloudAggregatedFieldWells clone() {
        try {
            return (WordCloudAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WordCloudAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
