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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The union type representing the allowed types for the left hand side of a TLS condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressTlsProtocolToEvaluate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressTlsProtocolToEvaluate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The enum type representing the allowed attribute types for the TLS condition.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * The enum type representing the allowed attribute types for the TLS condition.
     * </p>
     * 
     * @param attribute
     *        The enum type representing the allowed attribute types for the TLS condition.
     * @see IngressTlsAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The enum type representing the allowed attribute types for the TLS condition.
     * </p>
     * 
     * @return The enum type representing the allowed attribute types for the TLS condition.
     * @see IngressTlsAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The enum type representing the allowed attribute types for the TLS condition.
     * </p>
     * 
     * @param attribute
     *        The enum type representing the allowed attribute types for the TLS condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsAttribute
     */

    public IngressTlsProtocolToEvaluate withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The enum type representing the allowed attribute types for the TLS condition.
     * </p>
     * 
     * @param attribute
     *        The enum type representing the allowed attribute types for the TLS condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsAttribute
     */

    public IngressTlsProtocolToEvaluate withAttribute(IngressTlsAttribute attribute) {
        this.attribute = attribute.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressTlsProtocolToEvaluate == false)
            return false;
        IngressTlsProtocolToEvaluate other = (IngressTlsProtocolToEvaluate) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public IngressTlsProtocolToEvaluate clone() {
        try {
            return (IngressTlsProtocolToEvaluate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressTlsProtocolToEvaluateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
