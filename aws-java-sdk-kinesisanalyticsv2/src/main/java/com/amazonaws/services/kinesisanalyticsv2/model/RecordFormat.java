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
 * For an SQL-based Amazon Kinesis Data Analytics application, describes the record format and relevant mapping
 * information that should be applied to schematize the records on the stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/RecordFormat" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of record format.
     * </p>
     */
    private String recordFormatType;
    /**
     * <p>
     * When you configure application input at the time of creating or updating an application, provides additional
     * mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some
     * delimiter) on the streaming source.
     * </p>
     */
    private MappingParameters mappingParameters;

    /**
     * <p>
     * The type of record format.
     * </p>
     * 
     * @param recordFormatType
     *        The type of record format.
     * @see RecordFormatType
     */

    public void setRecordFormatType(String recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    /**
     * <p>
     * The type of record format.
     * </p>
     * 
     * @return The type of record format.
     * @see RecordFormatType
     */

    public String getRecordFormatType() {
        return this.recordFormatType;
    }

    /**
     * <p>
     * The type of record format.
     * </p>
     * 
     * @param recordFormatType
     *        The type of record format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordFormatType
     */

    public RecordFormat withRecordFormatType(String recordFormatType) {
        setRecordFormatType(recordFormatType);
        return this;
    }

    /**
     * <p>
     * The type of record format.
     * </p>
     * 
     * @param recordFormatType
     *        The type of record format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordFormatType
     */

    public RecordFormat withRecordFormatType(RecordFormatType recordFormatType) {
        this.recordFormatType = recordFormatType.toString();
        return this;
    }

    /**
     * <p>
     * When you configure application input at the time of creating or updating an application, provides additional
     * mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some
     * delimiter) on the streaming source.
     * </p>
     * 
     * @param mappingParameters
     *        When you configure application input at the time of creating or updating an application, provides
     *        additional mapping information specific to the record format (such as JSON, CSV, or record fields
     *        delimited by some delimiter) on the streaming source.
     */

    public void setMappingParameters(MappingParameters mappingParameters) {
        this.mappingParameters = mappingParameters;
    }

    /**
     * <p>
     * When you configure application input at the time of creating or updating an application, provides additional
     * mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some
     * delimiter) on the streaming source.
     * </p>
     * 
     * @return When you configure application input at the time of creating or updating an application, provides
     *         additional mapping information specific to the record format (such as JSON, CSV, or record fields
     *         delimited by some delimiter) on the streaming source.
     */

    public MappingParameters getMappingParameters() {
        return this.mappingParameters;
    }

    /**
     * <p>
     * When you configure application input at the time of creating or updating an application, provides additional
     * mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some
     * delimiter) on the streaming source.
     * </p>
     * 
     * @param mappingParameters
     *        When you configure application input at the time of creating or updating an application, provides
     *        additional mapping information specific to the record format (such as JSON, CSV, or record fields
     *        delimited by some delimiter) on the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordFormat withMappingParameters(MappingParameters mappingParameters) {
        setMappingParameters(mappingParameters);
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
            sb.append("RecordFormatType: ").append(getRecordFormatType()).append(",");
        if (getMappingParameters() != null)
            sb.append("MappingParameters: ").append(getMappingParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordFormat == false)
            return false;
        RecordFormat other = (RecordFormat) obj;
        if (other.getRecordFormatType() == null ^ this.getRecordFormatType() == null)
            return false;
        if (other.getRecordFormatType() != null && other.getRecordFormatType().equals(this.getRecordFormatType()) == false)
            return false;
        if (other.getMappingParameters() == null ^ this.getMappingParameters() == null)
            return false;
        if (other.getMappingParameters() != null && other.getMappingParameters().equals(this.getMappingParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordFormatType() == null) ? 0 : getRecordFormatType().hashCode());
        hashCode = prime * hashCode + ((getMappingParameters() == null) ? 0 : getMappingParameters().hashCode());
        return hashCode;
    }

    @Override
    public RecordFormat clone() {
        try {
            return (RecordFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.RecordFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
