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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The lookback window setup of an incremental refresh configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LookbackWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookbackWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the lookback window column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The lookback window column size.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The size unit that is used for the lookback window column. Valid values for this structure are <code>HOUR</code>,
     * <code>DAY</code>, and <code>WEEK</code>.
     * </p>
     */
    private String sizeUnit;

    /**
     * <p>
     * The name of the lookback window column.
     * </p>
     * 
     * @param columnName
     *        The name of the lookback window column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the lookback window column.
     * </p>
     * 
     * @return The name of the lookback window column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the lookback window column.
     * </p>
     * 
     * @param columnName
     *        The name of the lookback window column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookbackWindow withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The lookback window column size.
     * </p>
     * 
     * @param size
     *        The lookback window column size.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The lookback window column size.
     * </p>
     * 
     * @return The lookback window column size.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The lookback window column size.
     * </p>
     * 
     * @param size
     *        The lookback window column size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookbackWindow withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The size unit that is used for the lookback window column. Valid values for this structure are <code>HOUR</code>,
     * <code>DAY</code>, and <code>WEEK</code>.
     * </p>
     * 
     * @param sizeUnit
     *        The size unit that is used for the lookback window column. Valid values for this structure are
     *        <code>HOUR</code>, <code>DAY</code>, and <code>WEEK</code>.
     * @see LookbackWindowSizeUnit
     */

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    /**
     * <p>
     * The size unit that is used for the lookback window column. Valid values for this structure are <code>HOUR</code>,
     * <code>DAY</code>, and <code>WEEK</code>.
     * </p>
     * 
     * @return The size unit that is used for the lookback window column. Valid values for this structure are
     *         <code>HOUR</code>, <code>DAY</code>, and <code>WEEK</code>.
     * @see LookbackWindowSizeUnit
     */

    public String getSizeUnit() {
        return this.sizeUnit;
    }

    /**
     * <p>
     * The size unit that is used for the lookback window column. Valid values for this structure are <code>HOUR</code>,
     * <code>DAY</code>, and <code>WEEK</code>.
     * </p>
     * 
     * @param sizeUnit
     *        The size unit that is used for the lookback window column. Valid values for this structure are
     *        <code>HOUR</code>, <code>DAY</code>, and <code>WEEK</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackWindowSizeUnit
     */

    public LookbackWindow withSizeUnit(String sizeUnit) {
        setSizeUnit(sizeUnit);
        return this;
    }

    /**
     * <p>
     * The size unit that is used for the lookback window column. Valid values for this structure are <code>HOUR</code>,
     * <code>DAY</code>, and <code>WEEK</code>.
     * </p>
     * 
     * @param sizeUnit
     *        The size unit that is used for the lookback window column. Valid values for this structure are
     *        <code>HOUR</code>, <code>DAY</code>, and <code>WEEK</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LookbackWindowSizeUnit
     */

    public LookbackWindow withSizeUnit(LookbackWindowSizeUnit sizeUnit) {
        this.sizeUnit = sizeUnit.toString();
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSizeUnit() != null)
            sb.append("SizeUnit: ").append(getSizeUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LookbackWindow == false)
            return false;
        LookbackWindow other = (LookbackWindow) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSizeUnit() == null ^ this.getSizeUnit() == null)
            return false;
        if (other.getSizeUnit() != null && other.getSizeUnit().equals(this.getSizeUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSizeUnit() == null) ? 0 : getSizeUnit().hashCode());
        return hashCode;
    }

    @Override
    public LookbackWindow clone() {
        try {
            return (LookbackWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LookbackWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
