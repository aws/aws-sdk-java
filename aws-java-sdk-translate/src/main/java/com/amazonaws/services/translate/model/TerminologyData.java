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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data associated with the custom terminology.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/TerminologyData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminologyData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     */
    private java.nio.ByteBuffer file;
    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param file
     *        The file containing the custom terminology data.
     */

    public void setFile(java.nio.ByteBuffer file) {
        this.file = file;
    }

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The file containing the custom terminology data.
     */

    public java.nio.ByteBuffer getFile() {
        return this.file;
    }

    /**
     * <p>
     * The file containing the custom terminology data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param file
     *        The file containing the custom terminology data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminologyData withFile(java.nio.ByteBuffer file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology. Either CSV or TMX.
     * @see TerminologyDataFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * 
     * @return The data format of the custom terminology. Either CSV or TMX.
     * @see TerminologyDataFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology. Either CSV or TMX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public TerminologyData withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The data format of the custom terminology. Either CSV or TMX.
     * </p>
     * 
     * @param format
     *        The data format of the custom terminology. Either CSV or TMX.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TerminologyDataFormat
     */

    public TerminologyData withFormat(TerminologyDataFormat format) {
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
        if (getFile() != null)
            sb.append("File: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof TerminologyData == false)
            return false;
        TerminologyData other = (TerminologyData) obj;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
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

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public TerminologyData clone() {
        try {
            return (TerminologyData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.TerminologyDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
