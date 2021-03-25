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
 * Contains information about how a source JSON data file should be analyzed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/JsonFormatDescriptor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonFormatDescriptor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     */
    private String fileCompression;
    /**
     * <p>
     * The character set in which the source JSON file is written.
     * </p>
     */
    private String charset;

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @see JsonFileCompression
     */

    public void setFileCompression(String fileCompression) {
        this.fileCompression = fileCompression;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @return The level of compression of the source CSV file.
     * @see JsonFileCompression
     */

    public String getFileCompression() {
        return this.fileCompression;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JsonFileCompression
     */

    public JsonFormatDescriptor withFileCompression(String fileCompression) {
        setFileCompression(fileCompression);
        return this;
    }

    /**
     * <p>
     * The level of compression of the source CSV file.
     * </p>
     * 
     * @param fileCompression
     *        The level of compression of the source CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JsonFileCompression
     */

    public JsonFormatDescriptor withFileCompression(JsonFileCompression fileCompression) {
        this.fileCompression = fileCompression.toString();
        return this;
    }

    /**
     * <p>
     * The character set in which the source JSON file is written.
     * </p>
     * 
     * @param charset
     *        The character set in which the source JSON file is written.
     */

    public void setCharset(String charset) {
        this.charset = charset;
    }

    /**
     * <p>
     * The character set in which the source JSON file is written.
     * </p>
     * 
     * @return The character set in which the source JSON file is written.
     */

    public String getCharset() {
        return this.charset;
    }

    /**
     * <p>
     * The character set in which the source JSON file is written.
     * </p>
     * 
     * @param charset
     *        The character set in which the source JSON file is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonFormatDescriptor withCharset(String charset) {
        setCharset(charset);
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
        if (getFileCompression() != null)
            sb.append("FileCompression: ").append(getFileCompression()).append(",");
        if (getCharset() != null)
            sb.append("Charset: ").append(getCharset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonFormatDescriptor == false)
            return false;
        JsonFormatDescriptor other = (JsonFormatDescriptor) obj;
        if (other.getFileCompression() == null ^ this.getFileCompression() == null)
            return false;
        if (other.getFileCompression() != null && other.getFileCompression().equals(this.getFileCompression()) == false)
            return false;
        if (other.getCharset() == null ^ this.getCharset() == null)
            return false;
        if (other.getCharset() != null && other.getCharset().equals(this.getCharset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileCompression() == null) ? 0 : getFileCompression().hashCode());
        hashCode = prime * hashCode + ((getCharset() == null) ? 0 : getCharset().hashCode());
        return hashCode;
    }

    @Override
    public JsonFormatDescriptor clone() {
        try {
            return (JsonFormatDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.JsonFormatDescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
