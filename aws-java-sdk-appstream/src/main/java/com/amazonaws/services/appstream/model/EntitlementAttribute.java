/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An attribute associated with an entitlement. Application entitlements work by matching a supported SAML 2.0 attribute
 * name to a value when a user identity federates to an Amazon AppStream 2.0 SAML application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/EntitlementAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntitlementAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when a user
     * identity federates into an Amazon AppStream 2.0 SAML application.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * roles
     * </p>
     * </li>
     * <li>
     * <p>
     * department
     * </p>
     * </li>
     * <li>
     * <p>
     * organization
     * </p>
     * </li>
     * <li>
     * <p>
     * groups
     * </p>
     * </li>
     * <li>
     * <p>
     * title
     * </p>
     * </li>
     * <li>
     * <p>
     * costCenter
     * </p>
     * </li>
     * <li>
     * <p>
     * userType
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     */
    private String name;
    /**
     * <p>
     * A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     * AppStream 2.0 SAML application.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when a user
     * identity federates into an Amazon AppStream 2.0 SAML application.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * roles
     * </p>
     * </li>
     * <li>
     * <p>
     * department
     * </p>
     * </li>
     * <li>
     * <p>
     * organization
     * </p>
     * </li>
     * <li>
     * <p>
     * groups
     * </p>
     * </li>
     * <li>
     * <p>
     * title
     * </p>
     * </li>
     * <li>
     * <p>
     * costCenter
     * </p>
     * </li>
     * <li>
     * <p>
     * userType
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param name
     *        A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when
     *        a user identity federates into an Amazon AppStream 2.0 SAML application.</p>
     *        <p>
     *        The following are valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        roles
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        department
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        organization
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        groups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        title
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        costCenter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        userType
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when a user
     * identity federates into an Amazon AppStream 2.0 SAML application.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * roles
     * </p>
     * </li>
     * <li>
     * <p>
     * department
     * </p>
     * </li>
     * <li>
     * <p>
     * organization
     * </p>
     * </li>
     * <li>
     * <p>
     * groups
     * </p>
     * </li>
     * <li>
     * <p>
     * title
     * </p>
     * </li>
     * <li>
     * <p>
     * costCenter
     * </p>
     * </li>
     * <li>
     * <p>
     * userType
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @return A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when
     *         a user identity federates into an Amazon AppStream 2.0 SAML application.</p>
     *         <p>
     *         The following are valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         roles
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         department
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         organization
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         groups
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         title
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         costCenter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         userType
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when a user
     * identity federates into an Amazon AppStream 2.0 SAML application.
     * </p>
     * <p>
     * The following are valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * roles
     * </p>
     * </li>
     * <li>
     * <p>
     * department
     * </p>
     * </li>
     * <li>
     * <p>
     * organization
     * </p>
     * </li>
     * <li>
     * <p>
     * groups
     * </p>
     * </li>
     * <li>
     * <p>
     * title
     * </p>
     * </li>
     * <li>
     * <p>
     * costCenter
     * </p>
     * </li>
     * <li>
     * <p>
     * userType
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param name
     *        A supported AWS IAM SAML <code>PrincipalTag</code> attribute that is matched to the associated value when
     *        a user identity federates into an Amazon AppStream 2.0 SAML application.</p>
     *        <p>
     *        The following are valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        roles
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        department
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        organization
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        groups
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        title
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        costCenter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        userType
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementAttribute withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     * AppStream 2.0 SAML application.
     * </p>
     * 
     * @param value
     *        A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     *        AppStream 2.0 SAML application.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     * AppStream 2.0 SAML application.
     * </p>
     * 
     * @return A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     *         AppStream 2.0 SAML application.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     * AppStream 2.0 SAML application.
     * </p>
     * 
     * @param value
     *        A value that is matched to a supported SAML attribute name when a user identity federates into an Amazon
     *        AppStream 2.0 SAML application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntitlementAttribute withValue(String value) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof EntitlementAttribute == false)
            return false;
        EntitlementAttribute other = (EntitlementAttribute) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EntitlementAttribute clone() {
        try {
            return (EntitlementAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.EntitlementAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
