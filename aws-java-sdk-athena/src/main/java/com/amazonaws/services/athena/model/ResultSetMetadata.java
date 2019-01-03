/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata that describes the column structure and data types of a table of query results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ResultSetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultSetMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     */
    private java.util.List<ColumnInfo> columnInfo;

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * 
     * @return Information about the columns returned in a query result metadata.
     */

    public java.util.List<ColumnInfo> getColumnInfo() {
        return columnInfo;
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * 
     * @param columnInfo
     *        Information about the columns returned in a query result metadata.
     */

    public void setColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        if (columnInfo == null) {
            this.columnInfo = null;
            return;
        }

        this.columnInfo = new java.util.ArrayList<ColumnInfo>(columnInfo);
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnInfo(java.util.Collection)} or {@link #withColumnInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnInfo
     *        Information about the columns returned in a query result metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSetMetadata withColumnInfo(ColumnInfo... columnInfo) {
        if (this.columnInfo == null) {
            setColumnInfo(new java.util.ArrayList<ColumnInfo>(columnInfo.length));
        }
        for (ColumnInfo ele : columnInfo) {
            this.columnInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the columns returned in a query result metadata.
     * </p>
     * 
     * @param columnInfo
     *        Information about the columns returned in a query result metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSetMetadata withColumnInfo(java.util.Collection<ColumnInfo> columnInfo) {
        setColumnInfo(columnInfo);
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
        if (getColumnInfo() != null)
            sb.append("ColumnInfo: ").append(getColumnInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSetMetadata == false)
            return false;
        ResultSetMetadata other = (ResultSetMetadata) obj;
        if (other.getColumnInfo() == null ^ this.getColumnInfo() == null)
            return false;
        if (other.getColumnInfo() != null && other.getColumnInfo().equals(this.getColumnInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnInfo() == null) ? 0 : getColumnInfo().hashCode());
        return hashCode;
    }

    @Override
    public ResultSetMetadata clone() {
        try {
            return (ResultSetMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ResultSetMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
