/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Microsoft AD attributes of the Amazon FSx for Windows File Server file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ActiveDirectoryBackupAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveDirectoryBackupAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     * </p>
     */
    private String activeDirectoryId;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @return The fully qualified domain name of the self-managed AD directory.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryBackupAttributes withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     */

    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     * </p>
     * 
     * @return The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     */

    public String getActiveDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     * </p>
     * 
     * @param activeDirectoryId
     *        The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActiveDirectoryBackupAttributes withActiveDirectoryId(String activeDirectoryId) {
        setActiveDirectoryId(activeDirectoryId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getActiveDirectoryId() != null)
            sb.append("ActiveDirectoryId: ").append(getActiveDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveDirectoryBackupAttributes == false)
            return false;
        ActiveDirectoryBackupAttributes other = (ActiveDirectoryBackupAttributes) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveDirectoryId() == null ^ this.getActiveDirectoryId() == null)
            return false;
        if (other.getActiveDirectoryId() != null && other.getActiveDirectoryId().equals(this.getActiveDirectoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectoryId() == null) ? 0 : getActiveDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public ActiveDirectoryBackupAttributes clone() {
        try {
            return (ActiveDirectoryBackupAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.ActiveDirectoryBackupAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
