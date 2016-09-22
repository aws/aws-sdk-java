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
 * Describes the record format and relevant mapping information that should be applied to schematize the records on the
 * stream.
 * </p>
 */
public class RecordFormat implements Serializable, Cloneable {

    /**
     * <p>
     * The type of record format.
     * </p>
     */
    private String recordFormatType;

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
     * @see RecordFormatType
     */

    public void setRecordFormatType(RecordFormatType recordFormatType) {
        this.recordFormatType = recordFormatType.toString();
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
        setRecordFormatType(recordFormatType);
        return this;
    }

    /**
     * @param mappingParameters
     */

    public void setMappingParameters(MappingParameters mappingParameters) {
        this.mappingParameters = mappingParameters;
    }

    /**
     * @return
     */

    public MappingParameters getMappingParameters() {
        return this.mappingParameters;
    }

    /**
     * @param mappingParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordFormat withMappingParameters(MappingParameters mappingParameters) {
        setMappingParameters(mappingParameters);
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
            sb.append("RecordFormatType: " + getRecordFormatType() + ",");
        if (getMappingParameters() != null)
            sb.append("MappingParameters: " + getMappingParameters());
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
}
