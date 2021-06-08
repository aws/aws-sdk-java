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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a source file's formatting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/FileFormatDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileFormatDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about how a source CSV data file should be analyzed.
     * </p>
     */
    private CsvFormatDescriptor csvFormatDescriptor;
    /**
     * <p>
     * Contains information about how a source JSON data file should be analyzed.
     * </p>
     */
    private JsonFormatDescriptor jsonFormatDescriptor;

    /**
     * <p>
     * Contains information about how a source CSV data file should be analyzed.
     * </p>
     * 
     * @param csvFormatDescriptor
     *        Contains information about how a source CSV data file should be analyzed.
     */

    public void setCsvFormatDescriptor(CsvFormatDescriptor csvFormatDescriptor) {
        this.csvFormatDescriptor = csvFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about how a source CSV data file should be analyzed.
     * </p>
     * 
     * @return Contains information about how a source CSV data file should be analyzed.
     */

    public CsvFormatDescriptor getCsvFormatDescriptor() {
        return this.csvFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about how a source CSV data file should be analyzed.
     * </p>
     * 
     * @param csvFormatDescriptor
     *        Contains information about how a source CSV data file should be analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormatDescriptor withCsvFormatDescriptor(CsvFormatDescriptor csvFormatDescriptor) {
        setCsvFormatDescriptor(csvFormatDescriptor);
        return this;
    }

    /**
     * <p>
     * Contains information about how a source JSON data file should be analyzed.
     * </p>
     * 
     * @param jsonFormatDescriptor
     *        Contains information about how a source JSON data file should be analyzed.
     */

    public void setJsonFormatDescriptor(JsonFormatDescriptor jsonFormatDescriptor) {
        this.jsonFormatDescriptor = jsonFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about how a source JSON data file should be analyzed.
     * </p>
     * 
     * @return Contains information about how a source JSON data file should be analyzed.
     */

    public JsonFormatDescriptor getJsonFormatDescriptor() {
        return this.jsonFormatDescriptor;
    }

    /**
     * <p>
     * Contains information about how a source JSON data file should be analyzed.
     * </p>
     * 
     * @param jsonFormatDescriptor
     *        Contains information about how a source JSON data file should be analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormatDescriptor withJsonFormatDescriptor(JsonFormatDescriptor jsonFormatDescriptor) {
        setJsonFormatDescriptor(jsonFormatDescriptor);
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
        if (getCsvFormatDescriptor() != null)
            sb.append("CsvFormatDescriptor: ").append(getCsvFormatDescriptor()).append(",");
        if (getJsonFormatDescriptor() != null)
            sb.append("JsonFormatDescriptor: ").append(getJsonFormatDescriptor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileFormatDescriptor == false)
            return false;
        FileFormatDescriptor other = (FileFormatDescriptor) obj;
        if (other.getCsvFormatDescriptor() == null ^ this.getCsvFormatDescriptor() == null)
            return false;
        if (other.getCsvFormatDescriptor() != null && other.getCsvFormatDescriptor().equals(this.getCsvFormatDescriptor()) == false)
            return false;
        if (other.getJsonFormatDescriptor() == null ^ this.getJsonFormatDescriptor() == null)
            return false;
        if (other.getJsonFormatDescriptor() != null && other.getJsonFormatDescriptor().equals(this.getJsonFormatDescriptor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsvFormatDescriptor() == null) ? 0 : getCsvFormatDescriptor().hashCode());
        hashCode = prime * hashCode + ((getJsonFormatDescriptor() == null) ? 0 : getJsonFormatDescriptor().hashCode());
        return hashCode;
    }

    @Override
    public FileFormatDescriptor clone() {
        try {
            return (FileFormatDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.FileFormatDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
