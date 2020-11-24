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
 * Specifies the attributes to add to your attribute-based access control (ABAC) configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/InstanceAccessControlAttributeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAccessControlAttributeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * </p>
     */
    private java.util.List<AccessControlAttribute> accessControlAttributes;

    /**
     * <p>
     * Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * </p>
     * 
     * @return Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     */

    public java.util.List<AccessControlAttribute> getAccessControlAttributes() {
        return accessControlAttributes;
    }

    /**
     * <p>
     * Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * </p>
     * 
     * @param accessControlAttributes
     *        Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     */

    public void setAccessControlAttributes(java.util.Collection<AccessControlAttribute> accessControlAttributes) {
        if (accessControlAttributes == null) {
            this.accessControlAttributes = null;
            return;
        }

        this.accessControlAttributes = new java.util.ArrayList<AccessControlAttribute>(accessControlAttributes);
    }

    /**
     * <p>
     * Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessControlAttributes(java.util.Collection)} or
     * {@link #withAccessControlAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accessControlAttributes
     *        Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessControlAttributeConfiguration withAccessControlAttributes(AccessControlAttribute... accessControlAttributes) {
        if (this.accessControlAttributes == null) {
            setAccessControlAttributes(new java.util.ArrayList<AccessControlAttribute>(accessControlAttributes.length));
        }
        for (AccessControlAttribute ele : accessControlAttributes) {
            this.accessControlAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * </p>
     * 
     * @param accessControlAttributes
     *        Lists the attributes that are configured for ABAC in the specified AWS SSO instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessControlAttributeConfiguration withAccessControlAttributes(java.util.Collection<AccessControlAttribute> accessControlAttributes) {
        setAccessControlAttributes(accessControlAttributes);
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
        if (getAccessControlAttributes() != null)
            sb.append("AccessControlAttributes: ").append(getAccessControlAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAccessControlAttributeConfiguration == false)
            return false;
        InstanceAccessControlAttributeConfiguration other = (InstanceAccessControlAttributeConfiguration) obj;
        if (other.getAccessControlAttributes() == null ^ this.getAccessControlAttributes() == null)
            return false;
        if (other.getAccessControlAttributes() != null && other.getAccessControlAttributes().equals(this.getAccessControlAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessControlAttributes() == null) ? 0 : getAccessControlAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAccessControlAttributeConfiguration clone() {
        try {
            return (InstanceAccessControlAttributeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.InstanceAccessControlAttributeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
