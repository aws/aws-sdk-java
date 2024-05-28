/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A value for a segment attribute. This is structured as a map where the key is <code>valueString</code> and the value
 * is a string.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SegmentAttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     */
    private String valueString;

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * 
     * @param valueString
     *        The value of a segment attribute.
     */

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * 
     * @return The value of a segment attribute.
     */

    public String getValueString() {
        return this.valueString;
    }

    /**
     * <p>
     * The value of a segment attribute.
     * </p>
     * 
     * @param valueString
     *        The value of a segment attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentAttributeValue withValueString(String valueString) {
        setValueString(valueString);
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
        if (getValueString() != null)
            sb.append("ValueString: ").append(getValueString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentAttributeValue == false)
            return false;
        SegmentAttributeValue other = (SegmentAttributeValue) obj;
        if (other.getValueString() == null ^ this.getValueString() == null)
            return false;
        if (other.getValueString() != null && other.getValueString().equals(this.getValueString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValueString() == null) ? 0 : getValueString().hashCode());
        return hashCode;
    }

    @Override
    public SegmentAttributeValue clone() {
        try {
            return (SegmentAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SegmentAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
