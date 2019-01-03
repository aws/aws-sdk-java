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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Result Frame
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ResultFrame" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultFrame implements Serializable, Cloneable, StructuredPojo {

    /** ResultSet Metadata. */
    private java.util.List<Record> records;
    /** ResultSet Metadata. */
    private ResultSetMetadata resultSetMetadata;

    /**
     * ResultSet Metadata.
     * 
     * @return ResultSet Metadata.
     */

    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * ResultSet Metadata.
     * 
     * @param records
     *        ResultSet Metadata.
     */

    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<Record>(records);
    }

    /**
     * ResultSet Metadata.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        ResultSet Metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultFrame withRecords(Record... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<Record>(records.length));
        }
        for (Record ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * ResultSet Metadata.
     * 
     * @param records
     *        ResultSet Metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultFrame withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * ResultSet Metadata.
     * 
     * @param resultSetMetadata
     *        ResultSet Metadata.
     */

    public void setResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        this.resultSetMetadata = resultSetMetadata;
    }

    /**
     * ResultSet Metadata.
     * 
     * @return ResultSet Metadata.
     */

    public ResultSetMetadata getResultSetMetadata() {
        return this.resultSetMetadata;
    }

    /**
     * ResultSet Metadata.
     * 
     * @param resultSetMetadata
     *        ResultSet Metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultFrame withResultSetMetadata(ResultSetMetadata resultSetMetadata) {
        setResultSetMetadata(resultSetMetadata);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getResultSetMetadata() != null)
            sb.append("ResultSetMetadata: ").append(getResultSetMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultFrame == false)
            return false;
        ResultFrame other = (ResultFrame) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getResultSetMetadata() == null ^ this.getResultSetMetadata() == null)
            return false;
        if (other.getResultSetMetadata() != null && other.getResultSetMetadata().equals(this.getResultSetMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getResultSetMetadata() == null) ? 0 : getResultSetMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ResultFrame clone() {
        try {
            return (ResultFrame) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ResultFrameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
