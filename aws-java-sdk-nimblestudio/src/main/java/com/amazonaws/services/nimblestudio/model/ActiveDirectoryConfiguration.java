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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ActiveDirectoryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveDirectoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     */
    private java.util.List<ActiveDirectoryComputerAttribute> computerAttributes;
    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     * </p>
     */
    private String organizationalUnitDistinguishedName;

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     * 
     * @return A collection of custom attributes for an Active Directory computer.
     */

    public java.util.List<ActiveDirectoryComputerAttribute> getComputerAttributes() {
        return computerAttributes;
    }

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     * 
     * @param computerAttributes
     *        A collection of custom attributes for an Active Directory computer.
     */

    public void setComputerAttributes(java.util.Collection<ActiveDirectoryComputerAttribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
            return;
        }

        this.computerAttributes = new java.util.ArrayList<ActiveDirectoryComputerAttribute>(computerAttributes);
    }

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputerAttributes(java.util.Collection)} or {@link #withComputerAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param computerAttributes
     *        A collection of custom attributes for an Active Directory computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryConfiguration withComputerAttributes(ActiveDirectoryComputerAttribute... computerAttributes) {
        if (this.computerAttributes == null) {
            setComputerAttributes(new java.util.ArrayList<ActiveDirectoryComputerAttribute>(computerAttributes.length));
        }
        for (ActiveDirectoryComputerAttribute ele : computerAttributes) {
            this.computerAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     * 
     * @param computerAttributes
     *        A collection of custom attributes for an Active Directory computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryConfiguration withComputerAttributes(java.util.Collection<ActiveDirectoryComputerAttribute> computerAttributes) {
        setComputerAttributes(computerAttributes);
        return this;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     * </p>
     * 
     * @return The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS Directory Service for Microsoft AD to access using this studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryConfiguration withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     * </p>
     * 
     * @return The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryConfiguration withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
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
        if (getComputerAttributes() != null)
            sb.append("ComputerAttributes: ").append(getComputerAttributes()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveDirectoryConfiguration == false)
            return false;
        ActiveDirectoryConfiguration other = (ActiveDirectoryConfiguration) obj;
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null)
            return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputerAttributes() == null) ? 0 : getComputerAttributes().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        return hashCode;
    }

    @Override
    public ActiveDirectoryConfiguration clone() {
        try {
            return (ActiveDirectoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.ActiveDirectoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
