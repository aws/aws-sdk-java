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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * These are AWS SSO identity store attributes that you can configure for use in attributes-based access control (ABAC).
 * You can create permission policies that determine who can access your AWS resources based upon the configured
 * attribute value(s). When you enable ABAC and specify AccessControlAttributes, AWS SSO passes the attribute(s) value
 * of the authenticated user into IAM for use in policy evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AccessControlAttribute" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessControlAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute associated with your identities in your identity source. This is used to map a
     * specified attribute in your identity source with an attribute in AWS SSO.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value used for mapping a specified attribute to an identity source.
     * </p>
     */
    private AccessControlAttributeValue value;

    /**
     * <p>
     * The name of the attribute associated with your identities in your identity source. This is used to map a
     * specified attribute in your identity source with an attribute in AWS SSO.
     * </p>
     * 
     * @param key
     *        The name of the attribute associated with your identities in your identity source. This is used to map a
     *        specified attribute in your identity source with an attribute in AWS SSO.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute associated with your identities in your identity source. This is used to map a
     * specified attribute in your identity source with an attribute in AWS SSO.
     * </p>
     * 
     * @return The name of the attribute associated with your identities in your identity source. This is used to map a
     *         specified attribute in your identity source with an attribute in AWS SSO.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the attribute associated with your identities in your identity source. This is used to map a
     * specified attribute in your identity source with an attribute in AWS SSO.
     * </p>
     * 
     * @param key
     *        The name of the attribute associated with your identities in your identity source. This is used to map a
     *        specified attribute in your identity source with an attribute in AWS SSO.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value used for mapping a specified attribute to an identity source.
     * </p>
     * 
     * @param value
     *        The value used for mapping a specified attribute to an identity source.
     */

    public void setValue(AccessControlAttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value used for mapping a specified attribute to an identity source.
     * </p>
     * 
     * @return The value used for mapping a specified attribute to an identity source.
     */

    public AccessControlAttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value used for mapping a specified attribute to an identity source.
     * </p>
     * 
     * @param value
     *        The value used for mapping a specified attribute to an identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessControlAttribute withValue(AccessControlAttributeValue value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlAttribute == false)
            return false;
        AccessControlAttribute other = (AccessControlAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlAttribute clone() {
        try {
            return (AccessControlAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.AccessControlAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
