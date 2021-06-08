/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An occurrence of sensitive data in an Apache Avro object container or an Apache Parquet file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path, as a JSONPath expression, to the field in the record that contains the data. If the field name is
     * longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     * </p>
     */
    private String jsonPath;
    /**
     * <p>
     * The record index, starting from 0, for the record that contains the data.
     * </p>
     */
    private Long recordIndex;

    /**
     * <p>
     * The path, as a JSONPath expression, to the field in the record that contains the data. If the field name is
     * longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     * </p>
     * 
     * @param jsonPath
     *        The path, as a JSONPath expression, to the field in the record that contains the data. If the field name
     *        is longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     */

    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * The path, as a JSONPath expression, to the field in the record that contains the data. If the field name is
     * longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     * </p>
     * 
     * @return The path, as a JSONPath expression, to the field in the record that contains the data. If the field name
     *         is longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is
     *         truncated.
     */

    public String getJsonPath() {
        return this.jsonPath;
    }

    /**
     * <p>
     * The path, as a JSONPath expression, to the field in the record that contains the data. If the field name is
     * longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     * </p>
     * 
     * @param jsonPath
     *        The path, as a JSONPath expression, to the field in the record that contains the data. If the field name
     *        is longer than 20 characters, it is truncated. If the path is longer than 250 characters, it is truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withJsonPath(String jsonPath) {
        setJsonPath(jsonPath);
        return this;
    }

    /**
     * <p>
     * The record index, starting from 0, for the record that contains the data.
     * </p>
     * 
     * @param recordIndex
     *        The record index, starting from 0, for the record that contains the data.
     */

    public void setRecordIndex(Long recordIndex) {
        this.recordIndex = recordIndex;
    }

    /**
     * <p>
     * The record index, starting from 0, for the record that contains the data.
     * </p>
     * 
     * @return The record index, starting from 0, for the record that contains the data.
     */

    public Long getRecordIndex() {
        return this.recordIndex;
    }

    /**
     * <p>
     * The record index, starting from 0, for the record that contains the data.
     * </p>
     * 
     * @param recordIndex
     *        The record index, starting from 0, for the record that contains the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withRecordIndex(Long recordIndex) {
        setRecordIndex(recordIndex);
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
        if (getJsonPath() != null)
            sb.append("JsonPath: ").append(getJsonPath()).append(",");
        if (getRecordIndex() != null)
            sb.append("RecordIndex: ").append(getRecordIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        if (other.getRecordIndex() == null ^ this.getRecordIndex() == null)
            return false;
        if (other.getRecordIndex() != null && other.getRecordIndex().equals(this.getRecordIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        hashCode = prime * hashCode + ((getRecordIndex() == null) ? 0 : getRecordIndex().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
