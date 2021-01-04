/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the individual types of column statistics data. Only one data object should be set and indicated by the
 * <code>Type</code> attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnStatisticsData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of column statistics data.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Boolean column statistics data.
     * </p>
     */
    private BooleanColumnStatisticsData booleanColumnStatisticsData;
    /**
     * <p>
     * Date column statistics data.
     * </p>
     */
    private DateColumnStatisticsData dateColumnStatisticsData;
    /**
     * <p>
     * Decimal column statistics data.
     * </p>
     */
    private DecimalColumnStatisticsData decimalColumnStatisticsData;
    /**
     * <p>
     * Double column statistics data.
     * </p>
     */
    private DoubleColumnStatisticsData doubleColumnStatisticsData;
    /**
     * <p>
     * Long column statistics data.
     * </p>
     */
    private LongColumnStatisticsData longColumnStatisticsData;
    /**
     * <p>
     * String column statistics data.
     * </p>
     */
    private StringColumnStatisticsData stringColumnStatisticsData;
    /**
     * <p>
     * Binary column statistics data.
     * </p>
     */
    private BinaryColumnStatisticsData binaryColumnStatisticsData;

    /**
     * <p>
     * The type of column statistics data.
     * </p>
     * 
     * @param type
     *        The type of column statistics data.
     * @see ColumnStatisticsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of column statistics data.
     * </p>
     * 
     * @return The type of column statistics data.
     * @see ColumnStatisticsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of column statistics data.
     * </p>
     * 
     * @param type
     *        The type of column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsType
     */

    public ColumnStatisticsData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of column statistics data.
     * </p>
     * 
     * @param type
     *        The type of column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsType
     */

    public ColumnStatisticsData withType(ColumnStatisticsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Boolean column statistics data.
     * </p>
     * 
     * @param booleanColumnStatisticsData
     *        Boolean column statistics data.
     */

    public void setBooleanColumnStatisticsData(BooleanColumnStatisticsData booleanColumnStatisticsData) {
        this.booleanColumnStatisticsData = booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean column statistics data.
     * </p>
     * 
     * @return Boolean column statistics data.
     */

    public BooleanColumnStatisticsData getBooleanColumnStatisticsData() {
        return this.booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean column statistics data.
     * </p>
     * 
     * @param booleanColumnStatisticsData
     *        Boolean column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withBooleanColumnStatisticsData(BooleanColumnStatisticsData booleanColumnStatisticsData) {
        setBooleanColumnStatisticsData(booleanColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Date column statistics data.
     * </p>
     * 
     * @param dateColumnStatisticsData
     *        Date column statistics data.
     */

    public void setDateColumnStatisticsData(DateColumnStatisticsData dateColumnStatisticsData) {
        this.dateColumnStatisticsData = dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date column statistics data.
     * </p>
     * 
     * @return Date column statistics data.
     */

    public DateColumnStatisticsData getDateColumnStatisticsData() {
        return this.dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date column statistics data.
     * </p>
     * 
     * @param dateColumnStatisticsData
     *        Date column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDateColumnStatisticsData(DateColumnStatisticsData dateColumnStatisticsData) {
        setDateColumnStatisticsData(dateColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Decimal column statistics data.
     * </p>
     * 
     * @param decimalColumnStatisticsData
     *        Decimal column statistics data.
     */

    public void setDecimalColumnStatisticsData(DecimalColumnStatisticsData decimalColumnStatisticsData) {
        this.decimalColumnStatisticsData = decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal column statistics data.
     * </p>
     * 
     * @return Decimal column statistics data.
     */

    public DecimalColumnStatisticsData getDecimalColumnStatisticsData() {
        return this.decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal column statistics data.
     * </p>
     * 
     * @param decimalColumnStatisticsData
     *        Decimal column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDecimalColumnStatisticsData(DecimalColumnStatisticsData decimalColumnStatisticsData) {
        setDecimalColumnStatisticsData(decimalColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Double column statistics data.
     * </p>
     * 
     * @param doubleColumnStatisticsData
     *        Double column statistics data.
     */

    public void setDoubleColumnStatisticsData(DoubleColumnStatisticsData doubleColumnStatisticsData) {
        this.doubleColumnStatisticsData = doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double column statistics data.
     * </p>
     * 
     * @return Double column statistics data.
     */

    public DoubleColumnStatisticsData getDoubleColumnStatisticsData() {
        return this.doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double column statistics data.
     * </p>
     * 
     * @param doubleColumnStatisticsData
     *        Double column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDoubleColumnStatisticsData(DoubleColumnStatisticsData doubleColumnStatisticsData) {
        setDoubleColumnStatisticsData(doubleColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Long column statistics data.
     * </p>
     * 
     * @param longColumnStatisticsData
     *        Long column statistics data.
     */

    public void setLongColumnStatisticsData(LongColumnStatisticsData longColumnStatisticsData) {
        this.longColumnStatisticsData = longColumnStatisticsData;
    }

    /**
     * <p>
     * Long column statistics data.
     * </p>
     * 
     * @return Long column statistics data.
     */

    public LongColumnStatisticsData getLongColumnStatisticsData() {
        return this.longColumnStatisticsData;
    }

    /**
     * <p>
     * Long column statistics data.
     * </p>
     * 
     * @param longColumnStatisticsData
     *        Long column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withLongColumnStatisticsData(LongColumnStatisticsData longColumnStatisticsData) {
        setLongColumnStatisticsData(longColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * String column statistics data.
     * </p>
     * 
     * @param stringColumnStatisticsData
     *        String column statistics data.
     */

    public void setStringColumnStatisticsData(StringColumnStatisticsData stringColumnStatisticsData) {
        this.stringColumnStatisticsData = stringColumnStatisticsData;
    }

    /**
     * <p>
     * String column statistics data.
     * </p>
     * 
     * @return String column statistics data.
     */

    public StringColumnStatisticsData getStringColumnStatisticsData() {
        return this.stringColumnStatisticsData;
    }

    /**
     * <p>
     * String column statistics data.
     * </p>
     * 
     * @param stringColumnStatisticsData
     *        String column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withStringColumnStatisticsData(StringColumnStatisticsData stringColumnStatisticsData) {
        setStringColumnStatisticsData(stringColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Binary column statistics data.
     * </p>
     * 
     * @param binaryColumnStatisticsData
     *        Binary column statistics data.
     */

    public void setBinaryColumnStatisticsData(BinaryColumnStatisticsData binaryColumnStatisticsData) {
        this.binaryColumnStatisticsData = binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary column statistics data.
     * </p>
     * 
     * @return Binary column statistics data.
     */

    public BinaryColumnStatisticsData getBinaryColumnStatisticsData() {
        return this.binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary column statistics data.
     * </p>
     * 
     * @param binaryColumnStatisticsData
     *        Binary column statistics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withBinaryColumnStatisticsData(BinaryColumnStatisticsData binaryColumnStatisticsData) {
        setBinaryColumnStatisticsData(binaryColumnStatisticsData);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBooleanColumnStatisticsData() != null)
            sb.append("BooleanColumnStatisticsData: ").append(getBooleanColumnStatisticsData()).append(",");
        if (getDateColumnStatisticsData() != null)
            sb.append("DateColumnStatisticsData: ").append(getDateColumnStatisticsData()).append(",");
        if (getDecimalColumnStatisticsData() != null)
            sb.append("DecimalColumnStatisticsData: ").append(getDecimalColumnStatisticsData()).append(",");
        if (getDoubleColumnStatisticsData() != null)
            sb.append("DoubleColumnStatisticsData: ").append(getDoubleColumnStatisticsData()).append(",");
        if (getLongColumnStatisticsData() != null)
            sb.append("LongColumnStatisticsData: ").append(getLongColumnStatisticsData()).append(",");
        if (getStringColumnStatisticsData() != null)
            sb.append("StringColumnStatisticsData: ").append(getStringColumnStatisticsData()).append(",");
        if (getBinaryColumnStatisticsData() != null)
            sb.append("BinaryColumnStatisticsData: ").append(getBinaryColumnStatisticsData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnStatisticsData == false)
            return false;
        ColumnStatisticsData other = (ColumnStatisticsData) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBooleanColumnStatisticsData() == null ^ this.getBooleanColumnStatisticsData() == null)
            return false;
        if (other.getBooleanColumnStatisticsData() != null && other.getBooleanColumnStatisticsData().equals(this.getBooleanColumnStatisticsData()) == false)
            return false;
        if (other.getDateColumnStatisticsData() == null ^ this.getDateColumnStatisticsData() == null)
            return false;
        if (other.getDateColumnStatisticsData() != null && other.getDateColumnStatisticsData().equals(this.getDateColumnStatisticsData()) == false)
            return false;
        if (other.getDecimalColumnStatisticsData() == null ^ this.getDecimalColumnStatisticsData() == null)
            return false;
        if (other.getDecimalColumnStatisticsData() != null && other.getDecimalColumnStatisticsData().equals(this.getDecimalColumnStatisticsData()) == false)
            return false;
        if (other.getDoubleColumnStatisticsData() == null ^ this.getDoubleColumnStatisticsData() == null)
            return false;
        if (other.getDoubleColumnStatisticsData() != null && other.getDoubleColumnStatisticsData().equals(this.getDoubleColumnStatisticsData()) == false)
            return false;
        if (other.getLongColumnStatisticsData() == null ^ this.getLongColumnStatisticsData() == null)
            return false;
        if (other.getLongColumnStatisticsData() != null && other.getLongColumnStatisticsData().equals(this.getLongColumnStatisticsData()) == false)
            return false;
        if (other.getStringColumnStatisticsData() == null ^ this.getStringColumnStatisticsData() == null)
            return false;
        if (other.getStringColumnStatisticsData() != null && other.getStringColumnStatisticsData().equals(this.getStringColumnStatisticsData()) == false)
            return false;
        if (other.getBinaryColumnStatisticsData() == null ^ this.getBinaryColumnStatisticsData() == null)
            return false;
        if (other.getBinaryColumnStatisticsData() != null && other.getBinaryColumnStatisticsData().equals(this.getBinaryColumnStatisticsData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBooleanColumnStatisticsData() == null) ? 0 : getBooleanColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getDateColumnStatisticsData() == null) ? 0 : getDateColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getDecimalColumnStatisticsData() == null) ? 0 : getDecimalColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getDoubleColumnStatisticsData() == null) ? 0 : getDoubleColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getLongColumnStatisticsData() == null) ? 0 : getLongColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getStringColumnStatisticsData() == null) ? 0 : getStringColumnStatisticsData().hashCode());
        hashCode = prime * hashCode + ((getBinaryColumnStatisticsData() == null) ? 0 : getBinaryColumnStatisticsData().hashCode());
        return hashCode;
    }

    @Override
    public ColumnStatisticsData clone() {
        try {
            return (ColumnStatisticsData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnStatisticsDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
