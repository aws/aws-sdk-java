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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata for column in the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ColumnMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The format of the column.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param name
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The format of the column.
     * </p>
     * 
     * @param format
     *        The format of the column.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the column.
     * </p>
     * 
     * @return The format of the column.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the column.
     * </p>
     * 
     * @param format
     *        The format of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ColumnMetadata withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the column.
     * </p>
     * 
     * @param format
     *        The format of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public ColumnMetadata withFormat(Format format) {
        this.format = format.toString();
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnMetadata == false)
            return false;
        ColumnMetadata other = (ColumnMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public ColumnMetadata clone() {
        try {
            return (ColumnMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.ColumnMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
