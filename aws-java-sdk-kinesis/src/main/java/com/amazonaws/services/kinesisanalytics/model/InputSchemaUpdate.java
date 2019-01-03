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
 * Describes updates for the application's input schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/InputSchemaUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSchemaUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     */
    private RecordFormat recordFormatUpdate;
    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     */
    private String recordEncodingUpdate;
    /**
     * <p>
     * A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source element to
     * the corresponding column in the in-application stream.
     * </p>
     */
    private java.util.List<RecordColumn> recordColumnUpdates;

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @param recordFormatUpdate
     *        Specifies the format of the records on the streaming source.
     */

    public void setRecordFormatUpdate(RecordFormat recordFormatUpdate) {
        this.recordFormatUpdate = recordFormatUpdate;
    }

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @return Specifies the format of the records on the streaming source.
     */

    public RecordFormat getRecordFormatUpdate() {
        return this.recordFormatUpdate;
    }

    /**
     * <p>
     * Specifies the format of the records on the streaming source.
     * </p>
     * 
     * @param recordFormatUpdate
     *        Specifies the format of the records on the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSchemaUpdate withRecordFormatUpdate(RecordFormat recordFormatUpdate) {
        setRecordFormatUpdate(recordFormatUpdate);
        return this;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @param recordEncodingUpdate
     *        Specifies the encoding of the records in the streaming source. For example, UTF-8.
     */

    public void setRecordEncodingUpdate(String recordEncodingUpdate) {
        this.recordEncodingUpdate = recordEncodingUpdate;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @return Specifies the encoding of the records in the streaming source. For example, UTF-8.
     */

    public String getRecordEncodingUpdate() {
        return this.recordEncodingUpdate;
    }

    /**
     * <p>
     * Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * </p>
     * 
     * @param recordEncodingUpdate
     *        Specifies the encoding of the records in the streaming source. For example, UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSchemaUpdate withRecordEncodingUpdate(String recordEncodingUpdate) {
        setRecordEncodingUpdate(recordEncodingUpdate);
        return this;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source element to
     * the corresponding column in the in-application stream.
     * </p>
     * 
     * @return A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source
     *         element to the corresponding column in the in-application stream.
     */

    public java.util.List<RecordColumn> getRecordColumnUpdates() {
        return recordColumnUpdates;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source element to
     * the corresponding column in the in-application stream.
     * </p>
     * 
     * @param recordColumnUpdates
     *        A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source
     *        element to the corresponding column in the in-application stream.
     */

    public void setRecordColumnUpdates(java.util.Collection<RecordColumn> recordColumnUpdates) {
        if (recordColumnUpdates == null) {
            this.recordColumnUpdates = null;
            return;
        }

        this.recordColumnUpdates = new java.util.ArrayList<RecordColumn>(recordColumnUpdates);
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source element to
     * the corresponding column in the in-application stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordColumnUpdates(java.util.Collection)} or {@link #withRecordColumnUpdates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recordColumnUpdates
     *        A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source
     *        element to the corresponding column in the in-application stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSchemaUpdate withRecordColumnUpdates(RecordColumn... recordColumnUpdates) {
        if (this.recordColumnUpdates == null) {
            setRecordColumnUpdates(new java.util.ArrayList<RecordColumn>(recordColumnUpdates.length));
        }
        for (RecordColumn ele : recordColumnUpdates) {
            this.recordColumnUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source element to
     * the corresponding column in the in-application stream.
     * </p>
     * 
     * @param recordColumnUpdates
     *        A list of <code>RecordColumn</code> objects. Each object describes the mapping of the streaming source
     *        element to the corresponding column in the in-application stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputSchemaUpdate withRecordColumnUpdates(java.util.Collection<RecordColumn> recordColumnUpdates) {
        setRecordColumnUpdates(recordColumnUpdates);
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
        if (getRecordFormatUpdate() != null)
            sb.append("RecordFormatUpdate: ").append(getRecordFormatUpdate()).append(",");
        if (getRecordEncodingUpdate() != null)
            sb.append("RecordEncodingUpdate: ").append(getRecordEncodingUpdate()).append(",");
        if (getRecordColumnUpdates() != null)
            sb.append("RecordColumnUpdates: ").append(getRecordColumnUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSchemaUpdate == false)
            return false;
        InputSchemaUpdate other = (InputSchemaUpdate) obj;
        if (other.getRecordFormatUpdate() == null ^ this.getRecordFormatUpdate() == null)
            return false;
        if (other.getRecordFormatUpdate() != null && other.getRecordFormatUpdate().equals(this.getRecordFormatUpdate()) == false)
            return false;
        if (other.getRecordEncodingUpdate() == null ^ this.getRecordEncodingUpdate() == null)
            return false;
        if (other.getRecordEncodingUpdate() != null && other.getRecordEncodingUpdate().equals(this.getRecordEncodingUpdate()) == false)
            return false;
        if (other.getRecordColumnUpdates() == null ^ this.getRecordColumnUpdates() == null)
            return false;
        if (other.getRecordColumnUpdates() != null && other.getRecordColumnUpdates().equals(this.getRecordColumnUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordFormatUpdate() == null) ? 0 : getRecordFormatUpdate().hashCode());
        hashCode = prime * hashCode + ((getRecordEncodingUpdate() == null) ? 0 : getRecordEncodingUpdate().hashCode());
        hashCode = prime * hashCode + ((getRecordColumnUpdates() == null) ? 0 : getRecordColumnUpdates().hashCode());
        return hashCode;
    }

    @Override
    public InputSchemaUpdate clone() {
        try {
            return (InputSchemaUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.InputSchemaUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
