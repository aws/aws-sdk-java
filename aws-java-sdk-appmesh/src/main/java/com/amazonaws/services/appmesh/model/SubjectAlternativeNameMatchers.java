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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the methods by which a subject alternative name on a peer Transport Layer Security (TLS)
 * certificate can be matched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/SubjectAlternativeNameMatchers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectAlternativeNameMatchers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values sent must match the specified values exactly.
     * </p>
     */
    private java.util.List<String> exact;

    /**
     * <p>
     * The values sent must match the specified values exactly.
     * </p>
     * 
     * @return The values sent must match the specified values exactly.
     */

    public java.util.List<String> getExact() {
        return exact;
    }

    /**
     * <p>
     * The values sent must match the specified values exactly.
     * </p>
     * 
     * @param exact
     *        The values sent must match the specified values exactly.
     */

    public void setExact(java.util.Collection<String> exact) {
        if (exact == null) {
            this.exact = null;
            return;
        }

        this.exact = new java.util.ArrayList<String>(exact);
    }

    /**
     * <p>
     * The values sent must match the specified values exactly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExact(java.util.Collection)} or {@link #withExact(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param exact
     *        The values sent must match the specified values exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectAlternativeNameMatchers withExact(String... exact) {
        if (this.exact == null) {
            setExact(new java.util.ArrayList<String>(exact.length));
        }
        for (String ele : exact) {
            this.exact.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values sent must match the specified values exactly.
     * </p>
     * 
     * @param exact
     *        The values sent must match the specified values exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectAlternativeNameMatchers withExact(java.util.Collection<String> exact) {
        setExact(exact);
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
        if (getExact() != null)
            sb.append("Exact: ").append(getExact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubjectAlternativeNameMatchers == false)
            return false;
        SubjectAlternativeNameMatchers other = (SubjectAlternativeNameMatchers) obj;
        if (other.getExact() == null ^ this.getExact() == null)
            return false;
        if (other.getExact() != null && other.getExact().equals(this.getExact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        return hashCode;
    }

    @Override
    public SubjectAlternativeNameMatchers clone() {
        try {
            return (SubjectAlternativeNameMatchers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.SubjectAlternativeNameMatchersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
