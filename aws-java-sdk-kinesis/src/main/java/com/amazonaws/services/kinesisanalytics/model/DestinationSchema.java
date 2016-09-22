/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the data format when records are written to the destination. For more information, see <a
 * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
 * Output</a>.
 * </p>
 */
public class DestinationSchema implements Serializable, Cloneable {

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
        this.recordFormatType = recordFormatType.toString();
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
        setRecordFormatType(recordFormatType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RecordFormatType: " + getRecordFormatType());
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
}
