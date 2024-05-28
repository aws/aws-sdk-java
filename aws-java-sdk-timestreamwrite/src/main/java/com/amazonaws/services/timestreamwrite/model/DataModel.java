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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data model for a batch load task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DataModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source column to be mapped to time.
     * </p>
     */
    private String timeColumn;
    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds,
     * or other supported values. Default is <code>MILLISECONDS</code>.
     * </p>
     */
    private String timeUnit;
    /**
     * <p>
     * Source to target mappings for dimensions.
     * </p>
     */
    private java.util.List<DimensionMapping> dimensionMappings;
    /**
     * <p>
     * Source to target mappings for multi-measure records.
     * </p>
     */
    private MultiMeasureMappings multiMeasureMappings;
    /**
     * <p>
     * Source to target mappings for measures.
     * </p>
     */
    private java.util.List<MixedMeasureMapping> mixedMeasureMappings;
    /** <p/> */
    private String measureNameColumn;

    /**
     * <p>
     * Source column to be mapped to time.
     * </p>
     * 
     * @param timeColumn
     *        Source column to be mapped to time.
     */

    public void setTimeColumn(String timeColumn) {
        this.timeColumn = timeColumn;
    }

    /**
     * <p>
     * Source column to be mapped to time.
     * </p>
     * 
     * @return Source column to be mapped to time.
     */

    public String getTimeColumn() {
        return this.timeColumn;
    }

    /**
     * <p>
     * Source column to be mapped to time.
     * </p>
     * 
     * @param timeColumn
     *        Source column to be mapped to time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withTimeColumn(String timeColumn) {
        setTimeColumn(timeColumn);
        return this;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds,
     * or other supported values. Default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds, or other supported values. Default is <code>MILLISECONDS</code>.
     * @see TimeUnit
     */

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds,
     * or other supported values. Default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @return The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *         nanoseconds, or other supported values. Default is <code>MILLISECONDS</code>.
     * @see TimeUnit
     */

    public String getTimeUnit() {
        return this.timeUnit;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds,
     * or other supported values. Default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds, or other supported values. Default is <code>MILLISECONDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public DataModel withTimeUnit(String timeUnit) {
        setTimeUnit(timeUnit);
        return this;
    }

    /**
     * <p>
     * The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds,
     * or other supported values. Default is <code>MILLISECONDS</code>.
     * </p>
     * 
     * @param timeUnit
     *        The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds,
     *        nanoseconds, or other supported values. Default is <code>MILLISECONDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeUnit
     */

    public DataModel withTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit.toString();
        return this;
    }

    /**
     * <p>
     * Source to target mappings for dimensions.
     * </p>
     * 
     * @return Source to target mappings for dimensions.
     */

    public java.util.List<DimensionMapping> getDimensionMappings() {
        return dimensionMappings;
    }

    /**
     * <p>
     * Source to target mappings for dimensions.
     * </p>
     * 
     * @param dimensionMappings
     *        Source to target mappings for dimensions.
     */

    public void setDimensionMappings(java.util.Collection<DimensionMapping> dimensionMappings) {
        if (dimensionMappings == null) {
            this.dimensionMappings = null;
            return;
        }

        this.dimensionMappings = new java.util.ArrayList<DimensionMapping>(dimensionMappings);
    }

    /**
     * <p>
     * Source to target mappings for dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionMappings(java.util.Collection)} or {@link #withDimensionMappings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dimensionMappings
     *        Source to target mappings for dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withDimensionMappings(DimensionMapping... dimensionMappings) {
        if (this.dimensionMappings == null) {
            setDimensionMappings(new java.util.ArrayList<DimensionMapping>(dimensionMappings.length));
        }
        for (DimensionMapping ele : dimensionMappings) {
            this.dimensionMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source to target mappings for dimensions.
     * </p>
     * 
     * @param dimensionMappings
     *        Source to target mappings for dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withDimensionMappings(java.util.Collection<DimensionMapping> dimensionMappings) {
        setDimensionMappings(dimensionMappings);
        return this;
    }

    /**
     * <p>
     * Source to target mappings for multi-measure records.
     * </p>
     * 
     * @param multiMeasureMappings
     *        Source to target mappings for multi-measure records.
     */

    public void setMultiMeasureMappings(MultiMeasureMappings multiMeasureMappings) {
        this.multiMeasureMappings = multiMeasureMappings;
    }

    /**
     * <p>
     * Source to target mappings for multi-measure records.
     * </p>
     * 
     * @return Source to target mappings for multi-measure records.
     */

    public MultiMeasureMappings getMultiMeasureMappings() {
        return this.multiMeasureMappings;
    }

    /**
     * <p>
     * Source to target mappings for multi-measure records.
     * </p>
     * 
     * @param multiMeasureMappings
     *        Source to target mappings for multi-measure records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withMultiMeasureMappings(MultiMeasureMappings multiMeasureMappings) {
        setMultiMeasureMappings(multiMeasureMappings);
        return this;
    }

    /**
     * <p>
     * Source to target mappings for measures.
     * </p>
     * 
     * @return Source to target mappings for measures.
     */

    public java.util.List<MixedMeasureMapping> getMixedMeasureMappings() {
        return mixedMeasureMappings;
    }

    /**
     * <p>
     * Source to target mappings for measures.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Source to target mappings for measures.
     */

    public void setMixedMeasureMappings(java.util.Collection<MixedMeasureMapping> mixedMeasureMappings) {
        if (mixedMeasureMappings == null) {
            this.mixedMeasureMappings = null;
            return;
        }

        this.mixedMeasureMappings = new java.util.ArrayList<MixedMeasureMapping>(mixedMeasureMappings);
    }

    /**
     * <p>
     * Source to target mappings for measures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMixedMeasureMappings(java.util.Collection)} or {@link #withMixedMeasureMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Source to target mappings for measures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withMixedMeasureMappings(MixedMeasureMapping... mixedMeasureMappings) {
        if (this.mixedMeasureMappings == null) {
            setMixedMeasureMappings(new java.util.ArrayList<MixedMeasureMapping>(mixedMeasureMappings.length));
        }
        for (MixedMeasureMapping ele : mixedMeasureMappings) {
            this.mixedMeasureMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source to target mappings for measures.
     * </p>
     * 
     * @param mixedMeasureMappings
     *        Source to target mappings for measures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withMixedMeasureMappings(java.util.Collection<MixedMeasureMapping> mixedMeasureMappings) {
        setMixedMeasureMappings(mixedMeasureMappings);
        return this;
    }

    /**
     * <p/>
     * 
     * @param measureNameColumn
     */

    public void setMeasureNameColumn(String measureNameColumn) {
        this.measureNameColumn = measureNameColumn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getMeasureNameColumn() {
        return this.measureNameColumn;
    }

    /**
     * <p/>
     * 
     * @param measureNameColumn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModel withMeasureNameColumn(String measureNameColumn) {
        setMeasureNameColumn(measureNameColumn);
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
        if (getTimeColumn() != null)
            sb.append("TimeColumn: ").append(getTimeColumn()).append(",");
        if (getTimeUnit() != null)
            sb.append("TimeUnit: ").append(getTimeUnit()).append(",");
        if (getDimensionMappings() != null)
            sb.append("DimensionMappings: ").append(getDimensionMappings()).append(",");
        if (getMultiMeasureMappings() != null)
            sb.append("MultiMeasureMappings: ").append(getMultiMeasureMappings()).append(",");
        if (getMixedMeasureMappings() != null)
            sb.append("MixedMeasureMappings: ").append(getMixedMeasureMappings()).append(",");
        if (getMeasureNameColumn() != null)
            sb.append("MeasureNameColumn: ").append(getMeasureNameColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataModel == false)
            return false;
        DataModel other = (DataModel) obj;
        if (other.getTimeColumn() == null ^ this.getTimeColumn() == null)
            return false;
        if (other.getTimeColumn() != null && other.getTimeColumn().equals(this.getTimeColumn()) == false)
            return false;
        if (other.getTimeUnit() == null ^ this.getTimeUnit() == null)
            return false;
        if (other.getTimeUnit() != null && other.getTimeUnit().equals(this.getTimeUnit()) == false)
            return false;
        if (other.getDimensionMappings() == null ^ this.getDimensionMappings() == null)
            return false;
        if (other.getDimensionMappings() != null && other.getDimensionMappings().equals(this.getDimensionMappings()) == false)
            return false;
        if (other.getMultiMeasureMappings() == null ^ this.getMultiMeasureMappings() == null)
            return false;
        if (other.getMultiMeasureMappings() != null && other.getMultiMeasureMappings().equals(this.getMultiMeasureMappings()) == false)
            return false;
        if (other.getMixedMeasureMappings() == null ^ this.getMixedMeasureMappings() == null)
            return false;
        if (other.getMixedMeasureMappings() != null && other.getMixedMeasureMappings().equals(this.getMixedMeasureMappings()) == false)
            return false;
        if (other.getMeasureNameColumn() == null ^ this.getMeasureNameColumn() == null)
            return false;
        if (other.getMeasureNameColumn() != null && other.getMeasureNameColumn().equals(this.getMeasureNameColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeColumn() == null) ? 0 : getTimeColumn().hashCode());
        hashCode = prime * hashCode + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        hashCode = prime * hashCode + ((getDimensionMappings() == null) ? 0 : getDimensionMappings().hashCode());
        hashCode = prime * hashCode + ((getMultiMeasureMappings() == null) ? 0 : getMultiMeasureMappings().hashCode());
        hashCode = prime * hashCode + ((getMixedMeasureMappings() == null) ? 0 : getMixedMeasureMappings().hashCode());
        hashCode = prime * hashCode + ((getMeasureNameColumn() == null) ? 0 : getMeasureNameColumn().hashCode());
        return hashCode;
    }

    @Override
    public DataModel clone() {
        try {
            return (DataModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DataModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
