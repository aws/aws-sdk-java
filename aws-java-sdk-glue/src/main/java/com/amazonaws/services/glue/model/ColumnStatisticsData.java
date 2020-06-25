/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Defines a column statistics data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnStatisticsData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnStatisticsData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     */
    private BooleanColumnStatisticsData booleanColumnStatisticsData;
    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     */
    private DateColumnStatisticsData dateColumnStatisticsData;
    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     */
    private DecimalColumnStatisticsData decimalColumnStatisticsData;
    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     */
    private DoubleColumnStatisticsData doubleColumnStatisticsData;
    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     */
    private LongColumnStatisticsData longColumnStatisticsData;
    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     */
    private StringColumnStatisticsData stringColumnStatisticsData;
    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     */
    private BinaryColumnStatisticsData binaryColumnStatisticsData;

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param type
     *        The name of the column.
     * @see ColumnStatisticsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     * @see ColumnStatisticsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param type
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsType
     */

    public ColumnStatisticsData withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param type
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnStatisticsType
     */

    public ColumnStatisticsData withType(ColumnStatisticsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     * 
     * @param booleanColumnStatisticsData
     *        Boolean Column Statistics Data.
     */

    public void setBooleanColumnStatisticsData(BooleanColumnStatisticsData booleanColumnStatisticsData) {
        this.booleanColumnStatisticsData = booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     * 
     * @return Boolean Column Statistics Data.
     */

    public BooleanColumnStatisticsData getBooleanColumnStatisticsData() {
        return this.booleanColumnStatisticsData;
    }

    /**
     * <p>
     * Boolean Column Statistics Data.
     * </p>
     * 
     * @param booleanColumnStatisticsData
     *        Boolean Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withBooleanColumnStatisticsData(BooleanColumnStatisticsData booleanColumnStatisticsData) {
        setBooleanColumnStatisticsData(booleanColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     * 
     * @param dateColumnStatisticsData
     *        Date Column Statistics Data.
     */

    public void setDateColumnStatisticsData(DateColumnStatisticsData dateColumnStatisticsData) {
        this.dateColumnStatisticsData = dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     * 
     * @return Date Column Statistics Data.
     */

    public DateColumnStatisticsData getDateColumnStatisticsData() {
        return this.dateColumnStatisticsData;
    }

    /**
     * <p>
     * Date Column Statistics Data.
     * </p>
     * 
     * @param dateColumnStatisticsData
     *        Date Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDateColumnStatisticsData(DateColumnStatisticsData dateColumnStatisticsData) {
        setDateColumnStatisticsData(dateColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     * 
     * @param decimalColumnStatisticsData
     *        Decimal Column Statistics Data.
     */

    public void setDecimalColumnStatisticsData(DecimalColumnStatisticsData decimalColumnStatisticsData) {
        this.decimalColumnStatisticsData = decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     * 
     * @return Decimal Column Statistics Data.
     */

    public DecimalColumnStatisticsData getDecimalColumnStatisticsData() {
        return this.decimalColumnStatisticsData;
    }

    /**
     * <p>
     * Decimal Column Statistics Data.
     * </p>
     * 
     * @param decimalColumnStatisticsData
     *        Decimal Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDecimalColumnStatisticsData(DecimalColumnStatisticsData decimalColumnStatisticsData) {
        setDecimalColumnStatisticsData(decimalColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     * 
     * @param doubleColumnStatisticsData
     *        Double Column Statistics Data.
     */

    public void setDoubleColumnStatisticsData(DoubleColumnStatisticsData doubleColumnStatisticsData) {
        this.doubleColumnStatisticsData = doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     * 
     * @return Double Column Statistics Data.
     */

    public DoubleColumnStatisticsData getDoubleColumnStatisticsData() {
        return this.doubleColumnStatisticsData;
    }

    /**
     * <p>
     * Double Column Statistics Data.
     * </p>
     * 
     * @param doubleColumnStatisticsData
     *        Double Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withDoubleColumnStatisticsData(DoubleColumnStatisticsData doubleColumnStatisticsData) {
        setDoubleColumnStatisticsData(doubleColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     * 
     * @param longColumnStatisticsData
     *        Long Column Statistics Data.
     */

    public void setLongColumnStatisticsData(LongColumnStatisticsData longColumnStatisticsData) {
        this.longColumnStatisticsData = longColumnStatisticsData;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     * 
     * @return Long Column Statistics Data.
     */

    public LongColumnStatisticsData getLongColumnStatisticsData() {
        return this.longColumnStatisticsData;
    }

    /**
     * <p>
     * Long Column Statistics Data.
     * </p>
     * 
     * @param longColumnStatisticsData
     *        Long Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withLongColumnStatisticsData(LongColumnStatisticsData longColumnStatisticsData) {
        setLongColumnStatisticsData(longColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     * 
     * @param stringColumnStatisticsData
     *        String Column Statistics Data.
     */

    public void setStringColumnStatisticsData(StringColumnStatisticsData stringColumnStatisticsData) {
        this.stringColumnStatisticsData = stringColumnStatisticsData;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     * 
     * @return String Column Statistics Data.
     */

    public StringColumnStatisticsData getStringColumnStatisticsData() {
        return this.stringColumnStatisticsData;
    }

    /**
     * <p>
     * String Column Statistics Data.
     * </p>
     * 
     * @param stringColumnStatisticsData
     *        String Column Statistics Data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnStatisticsData withStringColumnStatisticsData(StringColumnStatisticsData stringColumnStatisticsData) {
        setStringColumnStatisticsData(stringColumnStatisticsData);
        return this;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     * 
     * @param binaryColumnStatisticsData
     *        Binary Column Statistics Data.
     */

    public void setBinaryColumnStatisticsData(BinaryColumnStatisticsData binaryColumnStatisticsData) {
        this.binaryColumnStatisticsData = binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     * 
     * @return Binary Column Statistics Data.
     */

    public BinaryColumnStatisticsData getBinaryColumnStatisticsData() {
        return this.binaryColumnStatisticsData;
    }

    /**
     * <p>
     * Binary Column Statistics Data.
     * </p>
     * 
     * @param binaryColumnStatisticsData
     *        Binary Column Statistics Data.
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
