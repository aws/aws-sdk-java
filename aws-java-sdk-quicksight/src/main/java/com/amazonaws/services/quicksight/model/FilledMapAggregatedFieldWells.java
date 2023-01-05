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
 * The aggregated field well of the filled map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilledMapAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilledMapAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated location field well of the filled map. Values are grouped by location fields.
     * </p>
     */
    private java.util.List<DimensionField> geospatial;
    /**
     * <p>
     * The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * </p>
     */
    private java.util.List<MeasureField> values;

    /**
     * <p>
     * The aggregated location field well of the filled map. Values are grouped by location fields.
     * </p>
     * 
     * @return The aggregated location field well of the filled map. Values are grouped by location fields.
     */

    public java.util.List<DimensionField> getGeospatial() {
        return geospatial;
    }

    /**
     * <p>
     * The aggregated location field well of the filled map. Values are grouped by location fields.
     * </p>
     * 
     * @param geospatial
     *        The aggregated location field well of the filled map. Values are grouped by location fields.
     */

    public void setGeospatial(java.util.Collection<DimensionField> geospatial) {
        if (geospatial == null) {
            this.geospatial = null;
            return;
        }

        this.geospatial = new java.util.ArrayList<DimensionField>(geospatial);
    }

    /**
     * <p>
     * The aggregated location field well of the filled map. Values are grouped by location fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeospatial(java.util.Collection)} or {@link #withGeospatial(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geospatial
     *        The aggregated location field well of the filled map. Values are grouped by location fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapAggregatedFieldWells withGeospatial(DimensionField... geospatial) {
        if (this.geospatial == null) {
            setGeospatial(new java.util.ArrayList<DimensionField>(geospatial.length));
        }
        for (DimensionField ele : geospatial) {
            this.geospatial.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregated location field well of the filled map. Values are grouped by location fields.
     * </p>
     * 
     * @param geospatial
     *        The aggregated location field well of the filled map. Values are grouped by location fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapAggregatedFieldWells withGeospatial(java.util.Collection<DimensionField> geospatial) {
        setGeospatial(geospatial);
        return this;
    }

    /**
     * <p>
     * The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * </p>
     * 
     * @return The aggregated color field well of a filled map. Values are aggregated based on location fields.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * </p>
     * 
     * @param values
     *        The aggregated color field well of a filled map. Values are aggregated based on location fields.
     */

    public void setValues(java.util.Collection<MeasureField> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<MeasureField>(values);
    }

    /**
     * <p>
     * The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapAggregatedFieldWells withValues(MeasureField... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<MeasureField>(values.length));
        }
        for (MeasureField ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * </p>
     * 
     * @param values
     *        The aggregated color field well of a filled map. Values are aggregated based on location fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilledMapAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
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
        if (getGeospatial() != null)
            sb.append("Geospatial: ").append(getGeospatial()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilledMapAggregatedFieldWells == false)
            return false;
        FilledMapAggregatedFieldWells other = (FilledMapAggregatedFieldWells) obj;
        if (other.getGeospatial() == null ^ this.getGeospatial() == null)
            return false;
        if (other.getGeospatial() != null && other.getGeospatial().equals(this.getGeospatial()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeospatial() == null) ? 0 : getGeospatial().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public FilledMapAggregatedFieldWells clone() {
        try {
            return (FilledMapAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilledMapAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
