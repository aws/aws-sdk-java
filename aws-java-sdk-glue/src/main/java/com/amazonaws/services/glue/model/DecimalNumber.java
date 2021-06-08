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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a numeric value in decimal format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DecimalNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DecimalNumber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     */
    private java.nio.ByteBuffer unscaledValue;
    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled value.
     * </p>
     */
    private Integer scale;

    /**
     * <p>
     * The unscaled numeric value.
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
     * @param unscaledValue
     *        The unscaled numeric value.
     */

    public void setUnscaledValue(java.nio.ByteBuffer unscaledValue) {
        this.unscaledValue = unscaledValue;
    }

    /**
     * <p>
     * The unscaled numeric value.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The unscaled numeric value.
     */

    public java.nio.ByteBuffer getUnscaledValue() {
        return this.unscaledValue;
    }

    /**
     * <p>
     * The unscaled numeric value.
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
     * @param unscaledValue
     *        The unscaled numeric value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalNumber withUnscaledValue(java.nio.ByteBuffer unscaledValue) {
        setUnscaledValue(unscaledValue);
        return this;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled value.
     * </p>
     * 
     * @param scale
     *        The scale that determines where the decimal point falls in the unscaled value.
     */

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled value.
     * </p>
     * 
     * @return The scale that determines where the decimal point falls in the unscaled value.
     */

    public Integer getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale that determines where the decimal point falls in the unscaled value.
     * </p>
     * 
     * @param scale
     *        The scale that determines where the decimal point falls in the unscaled value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DecimalNumber withScale(Integer scale) {
        setScale(scale);
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
        if (getUnscaledValue() != null)
            sb.append("UnscaledValue: ").append(getUnscaledValue()).append(",");
        if (getScale() != null)
            sb.append("Scale: ").append(getScale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DecimalNumber == false)
            return false;
        DecimalNumber other = (DecimalNumber) obj;
        if (other.getUnscaledValue() == null ^ this.getUnscaledValue() == null)
            return false;
        if (other.getUnscaledValue() != null && other.getUnscaledValue().equals(this.getUnscaledValue()) == false)
            return false;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnscaledValue() == null) ? 0 : getUnscaledValue().hashCode());
        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        return hashCode;
    }

    @Override
    public DecimalNumber clone() {
        try {
            return (DecimalNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DecimalNumberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
