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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error record for table operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Detail about the error.
     * </p>
     */
    private ErrorDetail errorDetail;

    /**
     * <p>
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        Name of the table. For Hive compatibility, this must be entirely lowercase.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @return Name of the table. For Hive compatibility, this must be entirely lowercase.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        Name of the table. For Hive compatibility, this must be entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableError withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Detail about the error.
     * </p>
     * 
     * @param errorDetail
     *        Detail about the error.
     */

    public void setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Detail about the error.
     * </p>
     * 
     * @return Detail about the error.
     */

    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * Detail about the error.
     * </p>
     * 
     * @param errorDetail
     *        Detail about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableError withErrorDetail(ErrorDetail errorDetail) {
        setErrorDetail(errorDetail);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableError == false)
            return false;
        TableError other = (TableError) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public TableError clone() {
        try {
            return (TableError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
