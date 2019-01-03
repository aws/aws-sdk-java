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
 * Describes the data format when records are written to the destination. For more information, see <a
 * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
 * Output</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DestinationSchema" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     */
    private String recordFormatType;

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     * 
     * @param recordFormatType
     *        Specifies the format of the records on the output stream.
     * @see RecordFormatType
     */

    public void setRecordFormatType(String recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     * 
     * @return Specifies the format of the records on the output stream.
     * @see RecordFormatType
     */

    public String getRecordFormatType() {
        return this.recordFormatType;
    }

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     * 
     * @param recordFormatType
     *        Specifies the format of the records on the output stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordFormatType
     */

    public DestinationSchema withRecordFormatType(String recordFormatType) {
        setRecordFormatType(recordFormatType);
        return this;
    }

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     * 
     * @param recordFormatType
     *        Specifies the format of the records on the output stream.
     * @see RecordFormatType
     */

    public void setRecordFormatType(RecordFormatType recordFormatType) {
        withRecordFormatType(recordFormatType);
    }

    /**
     * <p>
     * Specifies the format of the records on the output stream.
     * </p>
     * 
     * @param recordFormatType
     *        Specifies the format of the records on the output stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordFormatType
     */

    public DestinationSchema withRecordFormatType(RecordFormatType recordFormatType) {
        this.recordFormatType = recordFormatType.toString();
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
        if (getRecordFormatType() != null)
            sb.append("RecordFormatType: ").append(getRecordFormatType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationSchema == false)
            return false;
        DestinationSchema other = (DestinationSchema) obj;
        if (other.getRecordFormatType() == null ^ this.getRecordFormatType() == null)
            return false;
        if (other.getRecordFormatType() != null && other.getRecordFormatType().equals(this.getRecordFormatType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordFormatType() == null) ? 0 : getRecordFormatType().hashCode());
        return hashCode;
    }

    @Override
    public DestinationSchema clone() {
        try {
            return (DestinationSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.DestinationSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
