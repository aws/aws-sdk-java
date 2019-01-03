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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides additional mapping information when the record format uses delimiters, such as CSV. For example, the
 * following sample records use CSV format, where the records use the <i>'\n'</i> as the row delimiter and a comma (",")
 * as the column delimiter:
 * </p>
 * <p>
 * <code>"name1", "address1"</code>
 * </p>
 * <p>
 * <code>"name2", "address2"</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/CSVMappingParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CSVMappingParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     * </p>
     */
    private String recordRowDelimiter;
    /**
     * <p>
     * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     * </p>
     */
    private String recordColumnDelimiter;

    /**
     * <p>
     * Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     * </p>
     * 
     * @param recordRowDelimiter
     *        Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     */

    public void setRecordRowDelimiter(String recordRowDelimiter) {
        this.recordRowDelimiter = recordRowDelimiter;
    }

    /**
     * <p>
     * Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     * </p>
     * 
     * @return Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     */

    public String getRecordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    /**
     * <p>
     * Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     * </p>
     * 
     * @param recordRowDelimiter
     *        Row delimiter. For example, in a CSV format, <i>'\n'</i> is the typical row delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVMappingParameters withRecordRowDelimiter(String recordRowDelimiter) {
        setRecordRowDelimiter(recordRowDelimiter);
        return this;
    }

    /**
     * <p>
     * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     * </p>
     * 
     * @param recordColumnDelimiter
     *        Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     */

    public void setRecordColumnDelimiter(String recordColumnDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
    }

    /**
     * <p>
     * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     * </p>
     * 
     * @return Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     */

    public String getRecordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * <p>
     * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     * </p>
     * 
     * @param recordColumnDelimiter
     *        Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CSVMappingParameters withRecordColumnDelimiter(String recordColumnDelimiter) {
        setRecordColumnDelimiter(recordColumnDelimiter);
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
        if (getRecordRowDelimiter() != null)
            sb.append("RecordRowDelimiter: ").append(getRecordRowDelimiter()).append(",");
        if (getRecordColumnDelimiter() != null)
            sb.append("RecordColumnDelimiter: ").append(getRecordColumnDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CSVMappingParameters == false)
            return false;
        CSVMappingParameters other = (CSVMappingParameters) obj;
        if (other.getRecordRowDelimiter() == null ^ this.getRecordRowDelimiter() == null)
            return false;
        if (other.getRecordRowDelimiter() != null && other.getRecordRowDelimiter().equals(this.getRecordRowDelimiter()) == false)
            return false;
        if (other.getRecordColumnDelimiter() == null ^ this.getRecordColumnDelimiter() == null)
            return false;
        if (other.getRecordColumnDelimiter() != null && other.getRecordColumnDelimiter().equals(this.getRecordColumnDelimiter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordRowDelimiter() == null) ? 0 : getRecordRowDelimiter().hashCode());
        hashCode = prime * hashCode + ((getRecordColumnDelimiter() == null) ? 0 : getRecordColumnDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public CSVMappingParameters clone() {
        try {
            return (CSVMappingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.CSVMappingParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
