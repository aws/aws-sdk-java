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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an invitation to join a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceShareInvitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceShareInvitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     */
    private String resourceShareInvitationArn;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String resourceShareName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     */
    private String senderAccountId;
    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     */
    private String receiverAccountId;
    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     */
    private java.util.Date invitationTimestamp;
    /**
     * <p>
     * The status of the invitation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The resources associated with the resource share.
     * </p>
     */
    private java.util.List<ResourceShareAssociation> resourceShareAssociations;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        The Amazon Resource Name (ARN) of the invitation.
     */

    public void setResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the invitation.
     */

    public String getResourceShareInvitationArn() {
        return this.resourceShareInvitationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        The Amazon Resource Name (ARN) of the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withResourceShareInvitationArn(String resourceShareInvitationArn) {
        setResourceShareInvitationArn(resourceShareInvitationArn);
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     */

    public void setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getResourceShareName() {
        return this.resourceShareName;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param resourceShareName
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withResourceShareName(String resourceShareName) {
        setResourceShareName(resourceShareName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource share.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     * 
     * @param senderAccountId
     *        The ID of the AWS account that sent the invitation.
     */

    public void setSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     * 
     * @return The ID of the AWS account that sent the invitation.
     */

    public String getSenderAccountId() {
        return this.senderAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that sent the invitation.
     * </p>
     * 
     * @param senderAccountId
     *        The ID of the AWS account that sent the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withSenderAccountId(String senderAccountId) {
        setSenderAccountId(senderAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     * 
     * @param receiverAccountId
     *        The ID of the AWS account that received the invitation.
     */

    public void setReceiverAccountId(String receiverAccountId) {
        this.receiverAccountId = receiverAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     * 
     * @return The ID of the AWS account that received the invitation.
     */

    public String getReceiverAccountId() {
        return this.receiverAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that received the invitation.
     * </p>
     * 
     * @param receiverAccountId
     *        The ID of the AWS account that received the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withReceiverAccountId(String receiverAccountId) {
        setReceiverAccountId(receiverAccountId);
        return this;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     * 
     * @param invitationTimestamp
     *        The date and time when the invitation was sent.
     */

    public void setInvitationTimestamp(java.util.Date invitationTimestamp) {
        this.invitationTimestamp = invitationTimestamp;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     * 
     * @return The date and time when the invitation was sent.
     */

    public java.util.Date getInvitationTimestamp() {
        return this.invitationTimestamp;
    }

    /**
     * <p>
     * The date and time when the invitation was sent.
     * </p>
     * 
     * @param invitationTimestamp
     *        The date and time when the invitation was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withInvitationTimestamp(java.util.Date invitationTimestamp) {
        setInvitationTimestamp(invitationTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * 
     * @param status
     *        The status of the invitation.
     * @see ResourceShareInvitationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * 
     * @return The status of the invitation.
     * @see ResourceShareInvitationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * 
     * @param status
     *        The status of the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareInvitationStatus
     */

    public ResourceShareInvitation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the invitation.
     * </p>
     * 
     * @param status
     *        The status of the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareInvitationStatus
     */

    public ResourceShareInvitation withStatus(ResourceShareInvitationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The resources associated with the resource share.
     * </p>
     * 
     * @return The resources associated with the resource share.
     */

    public java.util.List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    /**
     * <p>
     * The resources associated with the resource share.
     * </p>
     * 
     * @param resourceShareAssociations
     *        The resources associated with the resource share.
     */

    public void setResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        if (resourceShareAssociations == null) {
            this.resourceShareAssociations = null;
            return;
        }

        this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations);
    }

    /**
     * <p>
     * The resources associated with the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareAssociations(java.util.Collection)} or
     * {@link #withResourceShareAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceShareAssociations
     *        The resources associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withResourceShareAssociations(ResourceShareAssociation... resourceShareAssociations) {
        if (this.resourceShareAssociations == null) {
            setResourceShareAssociations(new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations.length));
        }
        for (ResourceShareAssociation ele : resourceShareAssociations) {
            this.resourceShareAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources associated with the resource share.
     * </p>
     * 
     * @param resourceShareAssociations
     *        The resources associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceShareInvitation withResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        setResourceShareAssociations(resourceShareAssociations);
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
        if (getResourceShareInvitationArn() != null)
            sb.append("ResourceShareInvitationArn: ").append(getResourceShareInvitationArn()).append(",");
        if (getResourceShareName() != null)
            sb.append("ResourceShareName: ").append(getResourceShareName()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getSenderAccountId() != null)
            sb.append("SenderAccountId: ").append(getSenderAccountId()).append(",");
        if (getReceiverAccountId() != null)
            sb.append("ReceiverAccountId: ").append(getReceiverAccountId()).append(",");
        if (getInvitationTimestamp() != null)
            sb.append("InvitationTimestamp: ").append(getInvitationTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResourceShareAssociations() != null)
            sb.append("ResourceShareAssociations: ").append(getResourceShareAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceShareInvitation == false)
            return false;
        ResourceShareInvitation other = (ResourceShareInvitation) obj;
        if (other.getResourceShareInvitationArn() == null ^ this.getResourceShareInvitationArn() == null)
            return false;
        if (other.getResourceShareInvitationArn() != null && other.getResourceShareInvitationArn().equals(this.getResourceShareInvitationArn()) == false)
            return false;
        if (other.getResourceShareName() == null ^ this.getResourceShareName() == null)
            return false;
        if (other.getResourceShareName() != null && other.getResourceShareName().equals(this.getResourceShareName()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getSenderAccountId() == null ^ this.getSenderAccountId() == null)
            return false;
        if (other.getSenderAccountId() != null && other.getSenderAccountId().equals(this.getSenderAccountId()) == false)
            return false;
        if (other.getReceiverAccountId() == null ^ this.getReceiverAccountId() == null)
            return false;
        if (other.getReceiverAccountId() != null && other.getReceiverAccountId().equals(this.getReceiverAccountId()) == false)
            return false;
        if (other.getInvitationTimestamp() == null ^ this.getInvitationTimestamp() == null)
            return false;
        if (other.getInvitationTimestamp() != null && other.getInvitationTimestamp().equals(this.getInvitationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResourceShareAssociations() == null ^ this.getResourceShareAssociations() == null)
            return false;
        if (other.getResourceShareAssociations() != null && other.getResourceShareAssociations().equals(this.getResourceShareAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareInvitationArn() == null) ? 0 : getResourceShareInvitationArn().hashCode());
        hashCode = prime * hashCode + ((getResourceShareName() == null) ? 0 : getResourceShareName().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getSenderAccountId() == null) ? 0 : getSenderAccountId().hashCode());
        hashCode = prime * hashCode + ((getReceiverAccountId() == null) ? 0 : getReceiverAccountId().hashCode());
        hashCode = prime * hashCode + ((getInvitationTimestamp() == null) ? 0 : getInvitationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceShareAssociations() == null) ? 0 : getResourceShareAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ResourceShareInvitation clone() {
        try {
            return (ResourceShareInvitation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ResourceShareInvitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
