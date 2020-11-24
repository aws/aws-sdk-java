/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The value used for mapping a specified attribute to an identity source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AccessControlAttributeValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identity source to use when mapping a specified attribute to AWS SSO.
     * </p>
     */
    private java.util.List<String> source;

    /**
     * <p>
     * The identity source to use when mapping a specified attribute to AWS SSO.
     * </p>
     * 
     * @return The identity source to use when mapping a specified attribute to AWS SSO.
     */

    public java.util.List<String> getSource() {
        return source;
    }

    /**
     * <p>
     * The identity source to use when mapping a specified attribute to AWS SSO.
     * </p>
     * 
     * @param source
     *        The identity source to use when mapping a specified attribute to AWS SSO.
     */

    public void setSource(java.util.Collection<String> source) {
        if (source == null) {
            this.source = null;
            return;
        }

        this.source = new java.util.ArrayList<String>(source);
    }

    /**
     * <p>
     * The identity source to use when mapping a specified attribute to AWS SSO.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSource(java.util.Collection)} or {@link #withSource(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param source
     *        The identity source to use when mapping a specified attribute to AWS SSO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlAttributeValue withSource(String... source) {
        if (this.source == null) {
            setSource(new java.util.ArrayList<String>(source.length));
        }
        for (String ele : source) {
            this.source.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identity source to use when mapping a specified attribute to AWS SSO.
     * </p>
     * 
     * @param source
     *        The identity source to use when mapping a specified attribute to AWS SSO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlAttributeValue withSource(java.util.Collection<String> source) {
        setSource(source);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlAttributeValue == false)
            return false;
        AccessControlAttributeValue other = (AccessControlAttributeValue) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlAttributeValue clone() {
        try {
            return (AccessControlAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AccessControlAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
