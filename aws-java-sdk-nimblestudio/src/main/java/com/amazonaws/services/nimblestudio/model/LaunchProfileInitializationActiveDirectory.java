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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/LaunchProfileInitializationActiveDirectory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfileInitializationActiveDirectory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of custom attributes for an Active Directory computer.
     * </p>
     */
    private java.util.List<ActiveDirectoryComputerAttribute> computerAttributes;
    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The directory name.
     * </p>
     */
    private String directoryName;
    /**
     * <p>
     * The DNS IP address.
     * </p>
     */
    private java.util.List<String> dnsIpAddresses;
    /**
     * <p>
     * The name for the organizational unit distinguished name.
     * </p>
     */
    private String organizationalUnitDistinguishedName;
    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     */
    private String studioComponentId;
    /**
     * <p>
     * The name for the studio component.
     * </p>
     */
    private String studioComponentName;

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

    public LaunchProfileInitializationActiveDirectory withComputerAttributes(ActiveDirectoryComputerAttribute... computerAttributes) {
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

    public LaunchProfileInitializationActiveDirectory withComputerAttributes(java.util.Collection<ActiveDirectoryComputerAttribute> computerAttributes) {
        setComputerAttributes(computerAttributes);
        return this;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     * </p>
     * 
     * @return The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS Directory Service for Microsoft AD to access using this launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The directory name.
     * </p>
     * 
     * @param directoryName
     *        The directory name.
     */

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    /**
     * <p>
     * The directory name.
     * </p>
     * 
     * @return The directory name.
     */

    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * <p>
     * The directory name.
     * </p>
     * 
     * @param directoryName
     *        The directory name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withDirectoryName(String directoryName) {
        setDirectoryName(directoryName);
        return this;
    }

    /**
     * <p>
     * The DNS IP address.
     * </p>
     * 
     * @return The DNS IP address.
     */

    public java.util.List<String> getDnsIpAddresses() {
        return dnsIpAddresses;
    }

    /**
     * <p>
     * The DNS IP address.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The DNS IP address.
     */

    public void setDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        if (dnsIpAddresses == null) {
            this.dnsIpAddresses = null;
            return;
        }

        this.dnsIpAddresses = new java.util.ArrayList<String>(dnsIpAddresses);
    }

    /**
     * <p>
     * The DNS IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddresses(java.util.Collection)} or {@link #withDnsIpAddresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The DNS IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withDnsIpAddresses(String... dnsIpAddresses) {
        if (this.dnsIpAddresses == null) {
            setDnsIpAddresses(new java.util.ArrayList<String>(dnsIpAddresses.length));
        }
        for (String ele : dnsIpAddresses) {
            this.dnsIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DNS IP address.
     * </p>
     * 
     * @param dnsIpAddresses
     *        The DNS IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withDnsIpAddresses(java.util.Collection<String> dnsIpAddresses) {
        setDnsIpAddresses(dnsIpAddresses);
        return this;
    }

    /**
     * <p>
     * The name for the organizational unit distinguished name.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The name for the organizational unit distinguished name.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The name for the organizational unit distinguished name.
     * </p>
     * 
     * @return The name for the organizational unit distinguished name.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The name for the organizational unit distinguished name.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The name for the organizational unit distinguished name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     */

    public void setStudioComponentId(String studioComponentId) {
        this.studioComponentId = studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @return The unique identifier for a studio component resource.
     */

    public String getStudioComponentId() {
        return this.studioComponentId;
    }

    /**
     * <p>
     * The unique identifier for a studio component resource.
     * </p>
     * 
     * @param studioComponentId
     *        The unique identifier for a studio component resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withStudioComponentId(String studioComponentId) {
        setStudioComponentId(studioComponentId);
        return this;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param studioComponentName
     *        The name for the studio component.
     */

    public void setStudioComponentName(String studioComponentName) {
        this.studioComponentName = studioComponentName;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @return The name for the studio component.
     */

    public String getStudioComponentName() {
        return this.studioComponentName;
    }

    /**
     * <p>
     * The name for the studio component.
     * </p>
     * 
     * @param studioComponentName
     *        The name for the studio component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfileInitializationActiveDirectory withStudioComponentName(String studioComponentName) {
        setStudioComponentName(studioComponentName);
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
        if (getDirectoryName() != null)
            sb.append("DirectoryName: ").append(getDirectoryName()).append(",");
        if (getDnsIpAddresses() != null)
            sb.append("DnsIpAddresses: ").append(getDnsIpAddresses()).append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName()).append(",");
        if (getStudioComponentId() != null)
            sb.append("StudioComponentId: ").append(getStudioComponentId()).append(",");
        if (getStudioComponentName() != null)
            sb.append("StudioComponentName: ").append(getStudioComponentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchProfileInitializationActiveDirectory == false)
            return false;
        LaunchProfileInitializationActiveDirectory other = (LaunchProfileInitializationActiveDirectory) obj;
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null)
            return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDirectoryName() == null ^ this.getDirectoryName() == null)
            return false;
        if (other.getDirectoryName() != null && other.getDirectoryName().equals(this.getDirectoryName()) == false)
            return false;
        if (other.getDnsIpAddresses() == null ^ this.getDnsIpAddresses() == null)
            return false;
        if (other.getDnsIpAddresses() != null && other.getDnsIpAddresses().equals(this.getDnsIpAddresses()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        if (other.getStudioComponentId() == null ^ this.getStudioComponentId() == null)
            return false;
        if (other.getStudioComponentId() != null && other.getStudioComponentId().equals(this.getStudioComponentId()) == false)
            return false;
        if (other.getStudioComponentName() == null ^ this.getStudioComponentName() == null)
            return false;
        if (other.getStudioComponentName() != null && other.getStudioComponentName().equals(this.getStudioComponentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputerAttributes() == null) ? 0 : getComputerAttributes().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getDirectoryName() == null) ? 0 : getDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddresses() == null) ? 0 : getDnsIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentId() == null) ? 0 : getStudioComponentId().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentName() == null) ? 0 : getStudioComponentName().hashCode());
        return hashCode;
    }

    @Override
    public LaunchProfileInitializationActiveDirectory clone() {
        try {
            return (LaunchProfileInitializationActiveDirectory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.LaunchProfileInitializationActiveDirectoryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
