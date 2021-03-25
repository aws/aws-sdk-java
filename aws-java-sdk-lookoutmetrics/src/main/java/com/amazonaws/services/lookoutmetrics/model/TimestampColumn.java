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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the column used to track time in a source data file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TimestampColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestampColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the timestamp column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The format of the timestamp column.
     * </p>
     */
    private String columnFormat;

    /**
     * <p>
     * The name of the timestamp column.
     * </p>
     * 
     * @param columnName
     *        The name of the timestamp column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the timestamp column.
     * </p>
     * 
     * @return The name of the timestamp column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the timestamp column.
     * </p>
     * 
     * @param columnName
     *        The name of the timestamp column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampColumn withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The format of the timestamp column.
     * </p>
     * 
     * @param columnFormat
     *        The format of the timestamp column.
     */

    public void setColumnFormat(String columnFormat) {
        this.columnFormat = columnFormat;
    }

    /**
     * <p>
     * The format of the timestamp column.
     * </p>
     * 
     * @return The format of the timestamp column.
     */

    public String getColumnFormat() {
        return this.columnFormat;
    }

    /**
     * <p>
     * The format of the timestamp column.
     * </p>
     * 
     * @param columnFormat
     *        The format of the timestamp column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampColumn withColumnFormat(String columnFormat) {
        setColumnFormat(columnFormat);
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
        if (getColumnFormat() != null)
            sb.append("ColumnFormat: ").append(getColumnFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampColumn == false)
            return false;
        TimestampColumn other = (TimestampColumn) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnFormat() == null ^ this.getColumnFormat() == null)
            return false;
        if (other.getColumnFormat() != null && other.getColumnFormat().equals(this.getColumnFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnFormat() == null) ? 0 : getColumnFormat().hashCode());
        return hashCode;
    }

    @Override
    public TimestampColumn clone() {
        try {
            return (TimestampColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.TimestampColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
