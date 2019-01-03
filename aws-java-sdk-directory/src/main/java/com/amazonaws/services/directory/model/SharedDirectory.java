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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the shared directory in the directory owner account for which the share request in the directory
 * consumer account has been accepted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/SharedDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharedDirectory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the directory owner account, which contains the directory that has been shared to the consumer
     * account.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * Identifier of the directory in the directory owner account.
     * </p>
     */
    private String ownerDirectoryId;
    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory request (
     * <code>HANDSHAKE</code>).
     * </p>
     */
    private String shareMethod;
    /**
     * <p>
     * Identifier of the directory consumer account that has access to the shared directory (
     * <code>OwnerDirectoryId</code>) in the directory owner account.
     * </p>
     */
    private String sharedAccountId;
    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account. This identifier is different for each
     * directory owner account.
     * </p>
     */
    private String sharedDirectoryId;
    /**
     * <p>
     * Current directory status of the shared AWS Managed Microsoft AD directory.
     * </p>
     */
    private String shareStatus;
    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     */
    private String shareNotes;
    /**
     * <p>
     * The date and time that the shared directory was created.
     * </p>
     */
    private java.util.Date createdDateTime;
    /**
     * <p>
     * The date and time that the shared directory was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * Identifier of the directory owner account, which contains the directory that has been shared to the consumer
     * account.
     * </p>
     * 
     * @param ownerAccountId
     *        Identifier of the directory owner account, which contains the directory that has been shared to the
     *        consumer account.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * Identifier of the directory owner account, which contains the directory that has been shared to the consumer
     * account.
     * </p>
     * 
     * @return Identifier of the directory owner account, which contains the directory that has been shared to the
     *         consumer account.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * Identifier of the directory owner account, which contains the directory that has been shared to the consumer
     * account.
     * </p>
     * 
     * @param ownerAccountId
     *        Identifier of the directory owner account, which contains the directory that has been shared to the
     *        consumer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * Identifier of the directory in the directory owner account.
     * </p>
     * 
     * @param ownerDirectoryId
     *        Identifier of the directory in the directory owner account.
     */

    public void setOwnerDirectoryId(String ownerDirectoryId) {
        this.ownerDirectoryId = ownerDirectoryId;
    }

    /**
     * <p>
     * Identifier of the directory in the directory owner account.
     * </p>
     * 
     * @return Identifier of the directory in the directory owner account.
     */

    public String getOwnerDirectoryId() {
        return this.ownerDirectoryId;
    }

    /**
     * <p>
     * Identifier of the directory in the directory owner account.
     * </p>
     * 
     * @param ownerDirectoryId
     *        Identifier of the directory in the directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withOwnerDirectoryId(String ownerDirectoryId) {
        setOwnerDirectoryId(ownerDirectoryId);
        return this;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory
     *        request (<code>HANDSHAKE</code>).
     * @see ShareMethod
     */

    public void setShareMethod(String shareMethod) {
        this.shareMethod = shareMethod;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @return The method used when sharing a directory to determine whether the directory should be shared within your
     *         AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory
     *         request (<code>HANDSHAKE</code>).
     * @see ShareMethod
     */

    public String getShareMethod() {
        return this.shareMethod;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory
     *        request (<code>HANDSHAKE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareMethod
     */

    public SharedDirectory withShareMethod(String shareMethod) {
        setShareMethod(shareMethod);
        return this;
    }

    /**
     * <p>
     * The method used when sharing a directory to determine whether the directory should be shared within your AWS
     * organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory request (
     * <code>HANDSHAKE</code>).
     * </p>
     * 
     * @param shareMethod
     *        The method used when sharing a directory to determine whether the directory should be shared within your
     *        AWS organization (<code>ORGANIZATIONS</code>) or with any AWS account by sending a shared directory
     *        request (<code>HANDSHAKE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareMethod
     */

    public SharedDirectory withShareMethod(ShareMethod shareMethod) {
        this.shareMethod = shareMethod.toString();
        return this;
    }

    /**
     * <p>
     * Identifier of the directory consumer account that has access to the shared directory (
     * <code>OwnerDirectoryId</code>) in the directory owner account.
     * </p>
     * 
     * @param sharedAccountId
     *        Identifier of the directory consumer account that has access to the shared directory (
     *        <code>OwnerDirectoryId</code>) in the directory owner account.
     */

    public void setSharedAccountId(String sharedAccountId) {
        this.sharedAccountId = sharedAccountId;
    }

    /**
     * <p>
     * Identifier of the directory consumer account that has access to the shared directory (
     * <code>OwnerDirectoryId</code>) in the directory owner account.
     * </p>
     * 
     * @return Identifier of the directory consumer account that has access to the shared directory (
     *         <code>OwnerDirectoryId</code>) in the directory owner account.
     */

    public String getSharedAccountId() {
        return this.sharedAccountId;
    }

    /**
     * <p>
     * Identifier of the directory consumer account that has access to the shared directory (
     * <code>OwnerDirectoryId</code>) in the directory owner account.
     * </p>
     * 
     * @param sharedAccountId
     *        Identifier of the directory consumer account that has access to the shared directory (
     *        <code>OwnerDirectoryId</code>) in the directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withSharedAccountId(String sharedAccountId) {
        setSharedAccountId(sharedAccountId);
        return this;
    }

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account. This identifier is different for each
     * directory owner account.
     * </p>
     * 
     * @param sharedDirectoryId
     *        Identifier of the shared directory in the directory consumer account. This identifier is different for
     *        each directory owner account.
     */

    public void setSharedDirectoryId(String sharedDirectoryId) {
        this.sharedDirectoryId = sharedDirectoryId;
    }

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account. This identifier is different for each
     * directory owner account.
     * </p>
     * 
     * @return Identifier of the shared directory in the directory consumer account. This identifier is different for
     *         each directory owner account.
     */

    public String getSharedDirectoryId() {
        return this.sharedDirectoryId;
    }

    /**
     * <p>
     * Identifier of the shared directory in the directory consumer account. This identifier is different for each
     * directory owner account.
     * </p>
     * 
     * @param sharedDirectoryId
     *        Identifier of the shared directory in the directory consumer account. This identifier is different for
     *        each directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withSharedDirectoryId(String sharedDirectoryId) {
        setSharedDirectoryId(sharedDirectoryId);
        return this;
    }

    /**
     * <p>
     * Current directory status of the shared AWS Managed Microsoft AD directory.
     * </p>
     * 
     * @param shareStatus
     *        Current directory status of the shared AWS Managed Microsoft AD directory.
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * Current directory status of the shared AWS Managed Microsoft AD directory.
     * </p>
     * 
     * @return Current directory status of the shared AWS Managed Microsoft AD directory.
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * Current directory status of the shared AWS Managed Microsoft AD directory.
     * </p>
     * 
     * @param shareStatus
     *        Current directory status of the shared AWS Managed Microsoft AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public SharedDirectory withShareStatus(String shareStatus) {
        setShareStatus(shareStatus);
        return this;
    }

    /**
     * <p>
     * Current directory status of the shared AWS Managed Microsoft AD directory.
     * </p>
     * 
     * @param shareStatus
     *        Current directory status of the shared AWS Managed Microsoft AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public SharedDirectory withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
        return this;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @param shareNotes
     *        A directory share request that is sent by the directory owner to the directory consumer. The request
     *        includes a typed message to help the directory consumer administrator determine whether to approve or
     *        reject the share invitation.
     */

    public void setShareNotes(String shareNotes) {
        this.shareNotes = shareNotes;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @return A directory share request that is sent by the directory owner to the directory consumer. The request
     *         includes a typed message to help the directory consumer administrator determine whether to approve or
     *         reject the share invitation.
     */

    public String getShareNotes() {
        return this.shareNotes;
    }

    /**
     * <p>
     * A directory share request that is sent by the directory owner to the directory consumer. The request includes a
     * typed message to help the directory consumer administrator determine whether to approve or reject the share
     * invitation.
     * </p>
     * 
     * @param shareNotes
     *        A directory share request that is sent by the directory owner to the directory consumer. The request
     *        includes a typed message to help the directory consumer administrator determine whether to approve or
     *        reject the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withShareNotes(String shareNotes) {
        setShareNotes(shareNotes);
        return this;
    }

    /**
     * <p>
     * The date and time that the shared directory was created.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time that the shared directory was created.
     */

    public void setCreatedDateTime(java.util.Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * <p>
     * The date and time that the shared directory was created.
     * </p>
     * 
     * @return The date and time that the shared directory was created.
     */

    public java.util.Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * <p>
     * The date and time that the shared directory was created.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time that the shared directory was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withCreatedDateTime(java.util.Date createdDateTime) {
        setCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the shared directory was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the shared directory was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the shared directory was last updated.
     * </p>
     * 
     * @return The date and time that the shared directory was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the shared directory was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the shared directory was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedDirectory withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getOwnerDirectoryId() != null)
            sb.append("OwnerDirectoryId: ").append(getOwnerDirectoryId()).append(",");
        if (getShareMethod() != null)
            sb.append("ShareMethod: ").append(getShareMethod()).append(",");
        if (getSharedAccountId() != null)
            sb.append("SharedAccountId: ").append(getSharedAccountId()).append(",");
        if (getSharedDirectoryId() != null)
            sb.append("SharedDirectoryId: ").append(getSharedDirectoryId()).append(",");
        if (getShareStatus() != null)
            sb.append("ShareStatus: ").append(getShareStatus()).append(",");
        if (getShareNotes() != null)
            sb.append("ShareNotes: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedDateTime() != null)
            sb.append("CreatedDateTime: ").append(getCreatedDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharedDirectory == false)
            return false;
        SharedDirectory other = (SharedDirectory) obj;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getOwnerDirectoryId() == null ^ this.getOwnerDirectoryId() == null)
            return false;
        if (other.getOwnerDirectoryId() != null && other.getOwnerDirectoryId().equals(this.getOwnerDirectoryId()) == false)
            return false;
        if (other.getShareMethod() == null ^ this.getShareMethod() == null)
            return false;
        if (other.getShareMethod() != null && other.getShareMethod().equals(this.getShareMethod()) == false)
            return false;
        if (other.getSharedAccountId() == null ^ this.getSharedAccountId() == null)
            return false;
        if (other.getSharedAccountId() != null && other.getSharedAccountId().equals(this.getSharedAccountId()) == false)
            return false;
        if (other.getSharedDirectoryId() == null ^ this.getSharedDirectoryId() == null)
            return false;
        if (other.getSharedDirectoryId() != null && other.getSharedDirectoryId().equals(this.getSharedDirectoryId()) == false)
            return false;
        if (other.getShareStatus() == null ^ this.getShareStatus() == null)
            return false;
        if (other.getShareStatus() != null && other.getShareStatus().equals(this.getShareStatus()) == false)
            return false;
        if (other.getShareNotes() == null ^ this.getShareNotes() == null)
            return false;
        if (other.getShareNotes() != null && other.getShareNotes().equals(this.getShareNotes()) == false)
            return false;
        if (other.getCreatedDateTime() == null ^ this.getCreatedDateTime() == null)
            return false;
        if (other.getCreatedDateTime() != null && other.getCreatedDateTime().equals(this.getCreatedDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getOwnerDirectoryId() == null) ? 0 : getOwnerDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getShareMethod() == null) ? 0 : getShareMethod().hashCode());
        hashCode = prime * hashCode + ((getSharedAccountId() == null) ? 0 : getSharedAccountId().hashCode());
        hashCode = prime * hashCode + ((getSharedDirectoryId() == null) ? 0 : getSharedDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        hashCode = prime * hashCode + ((getShareNotes() == null) ? 0 : getShareNotes().hashCode());
        hashCode = prime * hashCode + ((getCreatedDateTime() == null) ? 0 : getCreatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SharedDirectory clone() {
        try {
            return (SharedDirectory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.SharedDirectoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
