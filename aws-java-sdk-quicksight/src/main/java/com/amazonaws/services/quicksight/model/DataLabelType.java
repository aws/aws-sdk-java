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
 * The option that determines the data label type.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataLabelType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLabelType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the label configuration for the entire field.
     * </p>
     */
    private FieldLabelType fieldLabelType;
    /**
     * <p>
     * The option that specifies individual data values for labels.
     * </p>
     */
    private DataPathLabelType dataPathLabelType;
    /**
     * <p>
     * Determines the label configuration for range end value in a visual.
     * </p>
     */
    private RangeEndsLabelType rangeEndsLabelType;
    /**
     * <p>
     * Determines the label configuration for the minimum value in a visual.
     * </p>
     */
    private MinimumLabelType minimumLabelType;
    /**
     * <p>
     * Determines the label configuration for the maximum value in a visual.
     * </p>
     */
    private MaximumLabelType maximumLabelType;

    /**
     * <p>
     * Determines the label configuration for the entire field.
     * </p>
     * 
     * @param fieldLabelType
     *        Determines the label configuration for the entire field.
     */

    public void setFieldLabelType(FieldLabelType fieldLabelType) {
        this.fieldLabelType = fieldLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the entire field.
     * </p>
     * 
     * @return Determines the label configuration for the entire field.
     */

    public FieldLabelType getFieldLabelType() {
        return this.fieldLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the entire field.
     * </p>
     * 
     * @param fieldLabelType
     *        Determines the label configuration for the entire field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelType withFieldLabelType(FieldLabelType fieldLabelType) {
        setFieldLabelType(fieldLabelType);
        return this;
    }

    /**
     * <p>
     * The option that specifies individual data values for labels.
     * </p>
     * 
     * @param dataPathLabelType
     *        The option that specifies individual data values for labels.
     */

    public void setDataPathLabelType(DataPathLabelType dataPathLabelType) {
        this.dataPathLabelType = dataPathLabelType;
    }

    /**
     * <p>
     * The option that specifies individual data values for labels.
     * </p>
     * 
     * @return The option that specifies individual data values for labels.
     */

    public DataPathLabelType getDataPathLabelType() {
        return this.dataPathLabelType;
    }

    /**
     * <p>
     * The option that specifies individual data values for labels.
     * </p>
     * 
     * @param dataPathLabelType
     *        The option that specifies individual data values for labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelType withDataPathLabelType(DataPathLabelType dataPathLabelType) {
        setDataPathLabelType(dataPathLabelType);
        return this;
    }

    /**
     * <p>
     * Determines the label configuration for range end value in a visual.
     * </p>
     * 
     * @param rangeEndsLabelType
     *        Determines the label configuration for range end value in a visual.
     */

    public void setRangeEndsLabelType(RangeEndsLabelType rangeEndsLabelType) {
        this.rangeEndsLabelType = rangeEndsLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for range end value in a visual.
     * </p>
     * 
     * @return Determines the label configuration for range end value in a visual.
     */

    public RangeEndsLabelType getRangeEndsLabelType() {
        return this.rangeEndsLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for range end value in a visual.
     * </p>
     * 
     * @param rangeEndsLabelType
     *        Determines the label configuration for range end value in a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelType withRangeEndsLabelType(RangeEndsLabelType rangeEndsLabelType) {
        setRangeEndsLabelType(rangeEndsLabelType);
        return this;
    }

    /**
     * <p>
     * Determines the label configuration for the minimum value in a visual.
     * </p>
     * 
     * @param minimumLabelType
     *        Determines the label configuration for the minimum value in a visual.
     */

    public void setMinimumLabelType(MinimumLabelType minimumLabelType) {
        this.minimumLabelType = minimumLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the minimum value in a visual.
     * </p>
     * 
     * @return Determines the label configuration for the minimum value in a visual.
     */

    public MinimumLabelType getMinimumLabelType() {
        return this.minimumLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the minimum value in a visual.
     * </p>
     * 
     * @param minimumLabelType
     *        Determines the label configuration for the minimum value in a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelType withMinimumLabelType(MinimumLabelType minimumLabelType) {
        setMinimumLabelType(minimumLabelType);
        return this;
    }

    /**
     * <p>
     * Determines the label configuration for the maximum value in a visual.
     * </p>
     * 
     * @param maximumLabelType
     *        Determines the label configuration for the maximum value in a visual.
     */

    public void setMaximumLabelType(MaximumLabelType maximumLabelType) {
        this.maximumLabelType = maximumLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the maximum value in a visual.
     * </p>
     * 
     * @return Determines the label configuration for the maximum value in a visual.
     */

    public MaximumLabelType getMaximumLabelType() {
        return this.maximumLabelType;
    }

    /**
     * <p>
     * Determines the label configuration for the maximum value in a visual.
     * </p>
     * 
     * @param maximumLabelType
     *        Determines the label configuration for the maximum value in a visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLabelType withMaximumLabelType(MaximumLabelType maximumLabelType) {
        setMaximumLabelType(maximumLabelType);
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
        if (getFieldLabelType() != null)
            sb.append("FieldLabelType: ").append(getFieldLabelType()).append(",");
        if (getDataPathLabelType() != null)
            sb.append("DataPathLabelType: ").append(getDataPathLabelType()).append(",");
        if (getRangeEndsLabelType() != null)
            sb.append("RangeEndsLabelType: ").append(getRangeEndsLabelType()).append(",");
        if (getMinimumLabelType() != null)
            sb.append("MinimumLabelType: ").append(getMinimumLabelType()).append(",");
        if (getMaximumLabelType() != null)
            sb.append("MaximumLabelType: ").append(getMaximumLabelType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLabelType == false)
            return false;
        DataLabelType other = (DataLabelType) obj;
        if (other.getFieldLabelType() == null ^ this.getFieldLabelType() == null)
            return false;
        if (other.getFieldLabelType() != null && other.getFieldLabelType().equals(this.getFieldLabelType()) == false)
            return false;
        if (other.getDataPathLabelType() == null ^ this.getDataPathLabelType() == null)
            return false;
        if (other.getDataPathLabelType() != null && other.getDataPathLabelType().equals(this.getDataPathLabelType()) == false)
            return false;
        if (other.getRangeEndsLabelType() == null ^ this.getRangeEndsLabelType() == null)
            return false;
        if (other.getRangeEndsLabelType() != null && other.getRangeEndsLabelType().equals(this.getRangeEndsLabelType()) == false)
            return false;
        if (other.getMinimumLabelType() == null ^ this.getMinimumLabelType() == null)
            return false;
        if (other.getMinimumLabelType() != null && other.getMinimumLabelType().equals(this.getMinimumLabelType()) == false)
            return false;
        if (other.getMaximumLabelType() == null ^ this.getMaximumLabelType() == null)
            return false;
        if (other.getMaximumLabelType() != null && other.getMaximumLabelType().equals(this.getMaximumLabelType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldLabelType() == null) ? 0 : getFieldLabelType().hashCode());
        hashCode = prime * hashCode + ((getDataPathLabelType() == null) ? 0 : getDataPathLabelType().hashCode());
        hashCode = prime * hashCode + ((getRangeEndsLabelType() == null) ? 0 : getRangeEndsLabelType().hashCode());
        hashCode = prime * hashCode + ((getMinimumLabelType() == null) ? 0 : getMinimumLabelType().hashCode());
        hashCode = prime * hashCode + ((getMaximumLabelType() == null) ? 0 : getMaximumLabelType().hashCode());
        return hashCode;
    }

    @Override
    public DataLabelType clone() {
        try {
            return (DataLabelType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataLabelTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
