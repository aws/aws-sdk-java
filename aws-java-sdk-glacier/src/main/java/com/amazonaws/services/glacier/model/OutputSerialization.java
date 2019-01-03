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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes how the select output is serialized.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSerialization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the serialization of CSV-encoded query results.
     * </p>
     */
    private CSVOutput csv;

    /**
     * <p>
     * Describes the serialization of CSV-encoded query results.
     * </p>
     * 
     * @param csv
     *        Describes the serialization of CSV-encoded query results.
     */

    public void setCsv(CSVOutput csv) {
        this.csv = csv;
    }

    /**
     * <p>
     * Describes the serialization of CSV-encoded query results.
     * </p>
     * 
     * @return Describes the serialization of CSV-encoded query results.
     */

    public CSVOutput getCsv() {
        return this.csv;
    }

    /**
     * <p>
     * Describes the serialization of CSV-encoded query results.
     * </p>
     * 
     * @param csv
     *        Describes the serialization of CSV-encoded query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSerialization withCsv(CSVOutput csv) {
        setCsv(csv);
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
        if (getCsv() != null)
            sb.append("Csv: ").append(getCsv());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSerialization == false)
            return false;
        OutputSerialization other = (OutputSerialization) obj;
        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && other.getCsv().equals(this.getCsv()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        return hashCode;
    }

    @Override
    public OutputSerialization clone() {
        try {
            return (OutputSerialization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.OutputSerializationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
