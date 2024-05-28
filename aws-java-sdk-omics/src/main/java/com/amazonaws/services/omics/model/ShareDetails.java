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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ShareDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     */
    private String shareId;
    /**
     * <p>
     * The Arn of the shared resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The ID of the shared resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The principal subscriber is the account that is sharing the resource.
     * </p>
     */
    private String principalSubscriber;
    /**
     * <p>
     * The account ID for the data owner. The owner creates the resource share.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The status of the share.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for a resource share. It provides additional details about the share status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String shareName;
    /**
     * <p>
     * The timestamp of when the resource share was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of the resource share update.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource share.
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @return The ID of the resource share.
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareId(String shareId) {
        setShareId(shareId);
        return this;
    }

    /**
     * <p>
     * The Arn of the shared resource.
     * </p>
     * 
     * @param resourceArn
     *        The Arn of the shared resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Arn of the shared resource.
     * </p>
     * 
     * @return The Arn of the shared resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Arn of the shared resource.
     * </p>
     * 
     * @param resourceArn
     *        The Arn of the shared resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the shared resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the shared resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the shared resource.
     * </p>
     * 
     * @return The ID of the shared resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the shared resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the shared resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The principal subscriber is the account that is sharing the resource.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account that is sharing the resource.
     */

    public void setPrincipalSubscriber(String principalSubscriber) {
        this.principalSubscriber = principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account that is sharing the resource.
     * </p>
     * 
     * @return The principal subscriber is the account that is sharing the resource.
     */

    public String getPrincipalSubscriber() {
        return this.principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account that is sharing the resource.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account that is sharing the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withPrincipalSubscriber(String principalSubscriber) {
        setPrincipalSubscriber(principalSubscriber);
        return this;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the resource share.
     * </p>
     * 
     * @param ownerId
     *        The account ID for the data owner. The owner creates the resource share.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the resource share.
     * </p>
     * 
     * @return The account ID for the data owner. The owner creates the resource share.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the resource share.
     * </p>
     * 
     * @param ownerId
     *        The account ID for the data owner. The owner creates the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @return The status of the share.
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ShareDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the share.
     * </p>
     * 
     * @param status
     *        The status of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ShareDetails withStatus(ShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for a resource share. It provides additional details about the share status.
     * </p>
     * 
     * @param statusMessage
     *        The status message for a resource share. It provides additional details about the share status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for a resource share. It provides additional details about the share status.
     * </p>
     * 
     * @return The status message for a resource share. It provides additional details about the share status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for a resource share. It provides additional details about the share status.
     * </p>
     * 
     * @param statusMessage
     *        The status message for a resource share. It provides additional details about the share status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param shareName
     *        The name of the resource share.
     */

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getShareName() {
        return this.shareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param shareName
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareName(String shareName) {
        setShareName(shareName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the resource share was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the resource share was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp of when the resource share was created.
     * </p>
     * 
     * @return The timestamp of when the resource share was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp of when the resource share was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp of when the resource share was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the resource share update.
     * </p>
     * 
     * @param updateTime
     *        The timestamp of the resource share update.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp of the resource share update.
     * </p>
     * 
     * @return The timestamp of the resource share update.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp of the resource share update.
     * </p>
     * 
     * @param updateTime
     *        The timestamp of the resource share update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getPrincipalSubscriber() != null)
            sb.append("PrincipalSubscriber: ").append(getPrincipalSubscriber()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getShareName() != null)
            sb.append("ShareName: ").append(getShareName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareDetails == false)
            return false;
        ShareDetails other = (ShareDetails) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getPrincipalSubscriber() == null ^ this.getPrincipalSubscriber() == null)
            return false;
        if (other.getPrincipalSubscriber() != null && other.getPrincipalSubscriber().equals(this.getPrincipalSubscriber()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getShareName() == null ^ this.getShareName() == null)
            return false;
        if (other.getShareName() != null && other.getShareName().equals(this.getShareName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalSubscriber() == null) ? 0 : getPrincipalSubscriber().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getShareName() == null) ? 0 : getShareName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ShareDetails clone() {
        try {
            return (ShareDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ShareDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
