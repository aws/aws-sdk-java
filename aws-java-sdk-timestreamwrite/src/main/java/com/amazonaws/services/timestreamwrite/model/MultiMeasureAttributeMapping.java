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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/MultiMeasureAttributeMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiMeasureAttributeMapping implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String sourceColumn;
    /** <p/> */
    private String targetMultiMeasureAttributeName;
    /** <p/> */
    private String measureValueType;

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

    public MultiMeasureAttributeMapping withSourceColumn(String sourceColumn) {
        setSourceColumn(sourceColumn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetMultiMeasureAttributeName
     */

    public void setTargetMultiMeasureAttributeName(String targetMultiMeasureAttributeName) {
        this.targetMultiMeasureAttributeName = targetMultiMeasureAttributeName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetMultiMeasureAttributeName() {
        return this.targetMultiMeasureAttributeName;
    }

    /**
     * <p/>
     * 
     * @param targetMultiMeasureAttributeName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiMeasureAttributeMapping withTargetMultiMeasureAttributeName(String targetMultiMeasureAttributeName) {
        setTargetMultiMeasureAttributeName(targetMultiMeasureAttributeName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @see ScalarMeasureValueType
     */

    public void setMeasureValueType(String measureValueType) {
        this.measureValueType = measureValueType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ScalarMeasureValueType
     */

    public String getMeasureValueType() {
        return this.measureValueType;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarMeasureValueType
     */

    public MultiMeasureAttributeMapping withMeasureValueType(String measureValueType) {
        setMeasureValueType(measureValueType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param measureValueType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalarMeasureValueType
     */

    public MultiMeasureAttributeMapping withMeasureValueType(ScalarMeasureValueType measureValueType) {
        this.measureValueType = measureValueType.toString();
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
        if (getSourceColumn() != null)
            sb.append("SourceColumn: ").append(getSourceColumn()).append(",");
        if (getTargetMultiMeasureAttributeName() != null)
            sb.append("TargetMultiMeasureAttributeName: ").append(getTargetMultiMeasureAttributeName()).append(",");
        if (getMeasureValueType() != null)
            sb.append("MeasureValueType: ").append(getMeasureValueType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiMeasureAttributeMapping == false)
            return false;
        MultiMeasureAttributeMapping other = (MultiMeasureAttributeMapping) obj;
        if (other.getSourceColumn() == null ^ this.getSourceColumn() == null)
            return false;
        if (other.getSourceColumn() != null && other.getSourceColumn().equals(this.getSourceColumn()) == false)
            return false;
        if (other.getTargetMultiMeasureAttributeName() == null ^ this.getTargetMultiMeasureAttributeName() == null)
            return false;
        if (other.getTargetMultiMeasureAttributeName() != null
                && other.getTargetMultiMeasureAttributeName().equals(this.getTargetMultiMeasureAttributeName()) == false)
            return false;
        if (other.getMeasureValueType() == null ^ this.getMeasureValueType() == null)
            return false;
        if (other.getMeasureValueType() != null && other.getMeasureValueType().equals(this.getMeasureValueType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceColumn() == null) ? 0 : getSourceColumn().hashCode());
        hashCode = prime * hashCode + ((getTargetMultiMeasureAttributeName() == null) ? 0 : getTargetMultiMeasureAttributeName().hashCode());
        hashCode = prime * hashCode + ((getMeasureValueType() == null) ? 0 : getMeasureValueType().hashCode());
        return hashCode;
    }

    @Override
    public MultiMeasureAttributeMapping clone() {
        try {
            return (MultiMeasureAttributeMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.MultiMeasureAttributeMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
