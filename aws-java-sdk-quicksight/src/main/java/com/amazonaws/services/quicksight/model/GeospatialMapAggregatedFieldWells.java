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
 * The aggregated field wells for a geospatial map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialMapAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialMapAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * </p>
     */
    private java.util.List<DimensionField> geospatial;
    /**
     * <p>
     * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * </p>
     */
    private java.util.List<MeasureField> values;
    /**
     * <p>
     * The color field wells of a geospatial map.
     * </p>
     */
    private java.util.List<DimensionField> colors;

    /**
     * <p>
     * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * </p>
     * 
     * @return The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     */

    public java.util.List<DimensionField> getGeospatial() {
        return geospatial;
    }

    /**
     * <p>
     * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * </p>
     * 
     * @param geospatial
     *        The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
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
     * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeospatial(java.util.Collection)} or {@link #withGeospatial(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geospatial
     *        The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withGeospatial(DimensionField... geospatial) {
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
     * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * </p>
     * 
     * @param geospatial
     *        The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withGeospatial(java.util.Collection<DimensionField> geospatial) {
        setGeospatial(geospatial);
        return this;
    }

    /**
     * <p>
     * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * </p>
     * 
     * @return The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * </p>
     * 
     * @param values
     *        The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
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
     * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withValues(MeasureField... values) {
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
     * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * </p>
     * 
     * @param values
     *        The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The color field wells of a geospatial map.
     * </p>
     * 
     * @return The color field wells of a geospatial map.
     */

    public java.util.List<DimensionField> getColors() {
        return colors;
    }

    /**
     * <p>
     * The color field wells of a geospatial map.
     * </p>
     * 
     * @param colors
     *        The color field wells of a geospatial map.
     */

    public void setColors(java.util.Collection<DimensionField> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<DimensionField>(colors);
    }

    /**
     * <p>
     * The color field wells of a geospatial map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The color field wells of a geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withColors(DimensionField... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<DimensionField>(colors.length));
        }
        for (DimensionField ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The color field wells of a geospatial map.
     * </p>
     * 
     * @param colors
     *        The color field wells of a geospatial map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialMapAggregatedFieldWells withColors(java.util.Collection<DimensionField> colors) {
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
        if (getGeospatial() != null)
            sb.append("Geospatial: ").append(getGeospatial()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
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

        if (obj instanceof GeospatialMapAggregatedFieldWells == false)
            return false;
        GeospatialMapAggregatedFieldWells other = (GeospatialMapAggregatedFieldWells) obj;
        if (other.getGeospatial() == null ^ this.getGeospatial() == null)
            return false;
        if (other.getGeospatial() != null && other.getGeospatial().equals(this.getGeospatial()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
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

        hashCode = prime * hashCode + ((getGeospatial() == null) ? 0 : getGeospatial().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialMapAggregatedFieldWells clone() {
        try {
            return (GeospatialMapAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialMapAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
