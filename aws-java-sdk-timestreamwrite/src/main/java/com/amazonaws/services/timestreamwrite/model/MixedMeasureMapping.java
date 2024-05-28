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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/MixedMeasureMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MixedMeasureMapping implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String measureName;
    /** <p/> */
    private String sourceColumn;
    /** <p/> */
    private String targetMeasureName;
    /** <p/> */
    private String measureValueType;
    /** <p/> */
    private java.util.List<MultiMeasureAttributeMapping> multiMeasureAttributeMappings;

    /**
     * <p/>
     * 
     * @param measureName
     */

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getMeasureName() {
        return this.measureName;
    }

    /**
     * <p/>
     * 
     * @param measureName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedMeasureMapping withMeasureName(String measureName) {
        setMeasureName(measureName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param sourceColumn
     */

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getSourceColumn() {
        return this.sourceColumn;
    }

    /**
     * <p/>
     * 
     * @param sourceColumn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedMeasureMapping withSourceColumn(String sourceColumn) {
        setSourceColumn(sourceColumn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetMeasureName
     */

    public void setTargetMeasureName(String targetMeasureName) {
        this.targetMeasureName = targetMeasureName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetMeasureName() {
        return this.targetMeasureName;
    }

    /**
     * <p/>
     * 
     * @param targetMeasureName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedMeasureMapping withTargetMeasureName(String targetMeasureName) {
        setTargetMeasureName(targetMeasureName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @see MeasureValueType
     */

    public void setMeasureValueType(String measureValueType) {
        this.measureValueType = measureValueType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see MeasureValueType
     */

    public String getMeasureValueType() {
        return this.measureValueType;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public MixedMeasureMapping withMeasureValueType(String measureValueType) {
        setMeasureValueType(measureValueType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MeasureValueType
     */

    public MixedMeasureMapping withMeasureValueType(MeasureValueType measureValueType) {
        this.measureValueType = measureValueType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<MultiMeasureAttributeMapping> getMultiMeasureAttributeMappings() {
        return multiMeasureAttributeMappings;
    }

    /**
     * <p/>
     * 
     * @param multiMeasureAttributeMappings
     */

    public void setMultiMeasureAttributeMappings(java.util.Collection<MultiMeasureAttributeMapping> multiMeasureAttributeMappings) {
        if (multiMeasureAttributeMappings == null) {
            this.multiMeasureAttributeMappings = null;
            return;
        }

        this.multiMeasureAttributeMappings = new java.util.ArrayList<MultiMeasureAttributeMapping>(multiMeasureAttributeMappings);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMultiMeasureAttributeMappings(java.util.Collection)} or
     * {@link #withMultiMeasureAttributeMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param multiMeasureAttributeMappings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedMeasureMapping withMultiMeasureAttributeMappings(MultiMeasureAttributeMapping... multiMeasureAttributeMappings) {
        if (this.multiMeasureAttributeMappings == null) {
            setMultiMeasureAttributeMappings(new java.util.ArrayList<MultiMeasureAttributeMapping>(multiMeasureAttributeMappings.length));
        }
        for (MultiMeasureAttributeMapping ele : multiMeasureAttributeMappings) {
            this.multiMeasureAttributeMappings.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param multiMeasureAttributeMappings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MixedMeasureMapping withMultiMeasureAttributeMappings(java.util.Collection<MultiMeasureAttributeMapping> multiMeasureAttributeMappings) {
        setMultiMeasureAttributeMappings(multiMeasureAttributeMappings);
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
        if (getMeasureName() != null)
            sb.append("MeasureName: ").append(getMeasureName()).append(",");
        if (getSourceColumn() != null)
            sb.append("SourceColumn: ").append(getSourceColumn()).append(",");
        if (getTargetMeasureName() != null)
            sb.append("TargetMeasureName: ").append(getTargetMeasureName()).append(",");
        if (getMeasureValueType() != null)
            sb.append("MeasureValueType: ").append(getMeasureValueType()).append(",");
        if (getMultiMeasureAttributeMappings() != null)
            sb.append("MultiMeasureAttributeMappings: ").append(getMultiMeasureAttributeMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MixedMeasureMapping == false)
            return false;
        MixedMeasureMapping other = (MixedMeasureMapping) obj;
        if (other.getMeasureName() == null ^ this.getMeasureName() == null)
            return false;
        if (other.getMeasureName() != null && other.getMeasureName().equals(this.getMeasureName()) == false)
            return false;
        if (other.getSourceColumn() == null ^ this.getSourceColumn() == null)
            return false;
        if (other.getSourceColumn() != null && other.getSourceColumn().equals(this.getSourceColumn()) == false)
            return false;
        if (other.getTargetMeasureName() == null ^ this.getTargetMeasureName() == null)
            return false;
        if (other.getTargetMeasureName() != null && other.getTargetMeasureName().equals(this.getTargetMeasureName()) == false)
            return false;
        if (other.getMeasureValueType() == null ^ this.getMeasureValueType() == null)
            return false;
        if (other.getMeasureValueType() != null && other.getMeasureValueType().equals(this.getMeasureValueType()) == false)
            return false;
        if (other.getMultiMeasureAttributeMappings() == null ^ this.getMultiMeasureAttributeMappings() == null)
            return false;
        if (other.getMultiMeasureAttributeMappings() != null
                && other.getMultiMeasureAttributeMappings().equals(this.getMultiMeasureAttributeMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeasureName() == null) ? 0 : getMeasureName().hashCode());
        hashCode = prime * hashCode + ((getSourceColumn() == null) ? 0 : getSourceColumn().hashCode());
        hashCode = prime * hashCode + ((getTargetMeasureName() == null) ? 0 : getTargetMeasureName().hashCode());
        hashCode = prime * hashCode + ((getMeasureValueType() == null) ? 0 : getMeasureValueType().hashCode());
        hashCode = prime * hashCode + ((getMultiMeasureAttributeMappings() == null) ? 0 : getMultiMeasureAttributeMappings().hashCode());
        return hashCode;
    }

    @Override
    public MixedMeasureMapping clone() {
        try {
            return (MixedMeasureMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.MixedMeasureMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
