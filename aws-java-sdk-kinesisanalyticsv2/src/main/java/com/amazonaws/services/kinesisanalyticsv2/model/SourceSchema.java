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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For an SQL-based Amazon Kinesis Data Analytics application, describes the format of the data in the streaming source,
 * and how each data element maps to corresponding columns created in the in-application stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SourceSchema" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     */
    private RecordFormat recordFormat;
    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     */
    private String recordEncoding;
    /**
     * <p>
     * A list of <code>RecordColumn</code> objects.
     * </p>
     */
    private java.util.List<RecordColumn> recordColumns;

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @param recordFormat
     *        Specifies the format of the records on the streaming source.
     */

    public void setRecordFormat(RecordFormat recordFormat) {
        this.recordFormat = recordFormat;
    }

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @return Specifies the format of the records on the streaming source.
     */

    public RecordFormat getRecordFormat() {
        return this.recordFormat;
    }

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @param recordFormat
     *        Specifies the format of the records on the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSchema withRecordFormat(RecordFormat recordFormat) {
        setRecordFormat(recordFormat);
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @param recordEncoding
     *        Specifies the encoding of the records in the streaming source. For example, UTF-8.
     */

    public void setRecordEncoding(String recordEncoding) {
        this.recordEncoding = recordEncoding;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @return Specifies the encoding of the records in the streaming source. For example, UTF-8.
     */

    public String getRecordEncoding() {
        return this.recordEncoding;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @param recordEncoding
     *        Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSchema withRecordEncoding(String recordEncoding) {
        setRecordEncoding(recordEncoding);
        return this;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects.
     * </p>
     * 
     * @return A list of <code>RecordColumn</code> objects.
     */

    public java.util.List<RecordColumn> getRecordColumns() {
        return recordColumns;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects.
     * </p>
     * 
     * @param recordColumns
     *        A list of <code>RecordColumn</code> objects.
     */

    public void setRecordColumns(java.util.Collection<RecordColumn> recordColumns) {
        if (recordColumns == null) {
            this.recordColumns = null;
            return;
        }

        this.recordColumns = new java.util.ArrayList<RecordColumn>(recordColumns);
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordColumns(java.util.Collection)} or {@link #withRecordColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recordColumns
     *        A list of <code>RecordColumn</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSchema withRecordColumns(RecordColumn... recordColumns) {
        if (this.recordColumns == null) {
            setRecordColumns(new java.util.ArrayList<RecordColumn>(recordColumns.length));
        }
        for (RecordColumn ele : recordColumns) {
            this.recordColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects.
     * </p>
     * 
     * @param recordColumns
     *        A list of <code>RecordColumn</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceSchema withRecordColumns(java.util.Collection<RecordColumn> recordColumns) {
        setRecordColumns(recordColumns);
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
        if (getRecordFormat() != null)
            sb.append("RecordFormat: ").append(getRecordFormat()).append(",");
        if (getRecordEncoding() != null)
            sb.append("RecordEncoding: ").append(getRecordEncoding()).append(",");
        if (getRecordColumns() != null)
            sb.append("RecordColumns: ").append(getRecordColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceSchema == false)
            return false;
        SourceSchema other = (SourceSchema) obj;
        if (other.getRecordFormat() == null ^ this.getRecordFormat() == null)
            return false;
        if (other.getRecordFormat() != null && other.getRecordFormat().equals(this.getRecordFormat()) == false)
            return false;
        if (other.getRecordEncoding() == null ^ this.getRecordEncoding() == null)
            return false;
        if (other.getRecordEncoding() != null && other.getRecordEncoding().equals(this.getRecordEncoding()) == false)
            return false;
        if (other.getRecordColumns() == null ^ this.getRecordColumns() == null)
            return false;
        if (other.getRecordColumns() != null && other.getRecordColumns().equals(this.getRecordColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordFormat() == null) ? 0 : getRecordFormat().hashCode());
        hashCode = prime * hashCode + ((getRecordEncoding() == null) ? 0 : getRecordEncoding().hashCode());
        hashCode = prime * hashCode + ((getRecordColumns() == null) ? 0 : getRecordColumns().hashCode());
        return hashCode;
    }

    @Override
    public SourceSchema clone() {
        try {
            return (SourceSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SourceSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
