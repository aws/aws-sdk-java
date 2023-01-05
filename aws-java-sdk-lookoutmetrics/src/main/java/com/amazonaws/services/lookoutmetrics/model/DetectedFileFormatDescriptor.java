/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Properties of an inferred data format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectedFileFormatDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedFileFormatDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about a CSV format.
     * </p>
     */
    private DetectedCsvFormatDescriptor csvFormatDescriptor;
    /**
     * <p>
     * Details about a JSON format.
     * </p>
     */
    private DetectedJsonFormatDescriptor jsonFormatDescriptor;

    /**
     * <p>
     * Details about a CSV format.
     * </p>
     * 
     * @param csvFormatDescriptor
     *        Details about a CSV format.
     */

    public void setCsvFormatDescriptor(DetectedCsvFormatDescriptor csvFormatDescriptor) {
        this.csvFormatDescriptor = csvFormatDescriptor;
    }

    /**
     * <p>
     * Details about a CSV format.
     * </p>
     * 
     * @return Details about a CSV format.
     */

    public DetectedCsvFormatDescriptor getCsvFormatDescriptor() {
        return this.csvFormatDescriptor;
    }

    /**
     * <p>
     * Details about a CSV format.
     * </p>
     * 
     * @param csvFormatDescriptor
     *        Details about a CSV format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedFileFormatDescriptor withCsvFormatDescriptor(DetectedCsvFormatDescriptor csvFormatDescriptor) {
        setCsvFormatDescriptor(csvFormatDescriptor);
        return this;
    }

    /**
     * <p>
     * Details about a JSON format.
     * </p>
     * 
     * @param jsonFormatDescriptor
     *        Details about a JSON format.
     */

    public void setJsonFormatDescriptor(DetectedJsonFormatDescriptor jsonFormatDescriptor) {
        this.jsonFormatDescriptor = jsonFormatDescriptor;
    }

    /**
     * <p>
     * Details about a JSON format.
     * </p>
     * 
     * @return Details about a JSON format.
     */

    public DetectedJsonFormatDescriptor getJsonFormatDescriptor() {
        return this.jsonFormatDescriptor;
    }

    /**
     * <p>
     * Details about a JSON format.
     * </p>
     * 
     * @param jsonFormatDescriptor
     *        Details about a JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedFileFormatDescriptor withJsonFormatDescriptor(DetectedJsonFormatDescriptor jsonFormatDescriptor) {
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

        if (obj instanceof DetectedFileFormatDescriptor == false)
            return false;
        DetectedFileFormatDescriptor other = (DetectedFileFormatDescriptor) obj;
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
    public DetectedFileFormatDescriptor clone() {
        try {
            return (DetectedFileFormatDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DetectedFileFormatDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
