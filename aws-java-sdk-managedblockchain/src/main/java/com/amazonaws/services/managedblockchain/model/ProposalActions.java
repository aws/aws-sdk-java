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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The actions to carry out if a proposal is <code>APPROVED</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/ProposalActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProposalActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member and join
     * the network.
     * </p>
     */
    private java.util.List<InviteAction> invitations;
    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which deletes
     * the member and all associated member resources from the network.
     * </p>
     */
    private java.util.List<RemoveAction> removals;

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member and join
     * the network.
     * </p>
     * 
     * @return The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member
     *         and join the network.
     */

    public java.util.List<InviteAction> getInvitations() {
        return invitations;
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member and join
     * the network.
     * </p>
     * 
     * @param invitations
     *        The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member
     *        and join the network.
     */

    public void setInvitations(java.util.Collection<InviteAction> invitations) {
        if (invitations == null) {
            this.invitations = null;
            return;
        }

        this.invitations = new java.util.ArrayList<InviteAction>(invitations);
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member and join
     * the network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvitations(java.util.Collection)} or {@link #withInvitations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param invitations
     *        The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member
     *        and join the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalActions withInvitations(InviteAction... invitations) {
        if (this.invitations == null) {
            setInvitations(new java.util.ArrayList<InviteAction>(invitations.length));
        }
        for (InviteAction ele : invitations) {
            this.invitations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member and join
     * the network.
     * </p>
     * 
     * @param invitations
     *        The actions to perform for an <code>APPROVED</code> proposal to invite an AWS account to create a member
     *        and join the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalActions withInvitations(java.util.Collection<InviteAction> invitations) {
        setInvitations(invitations);
        return this;
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which deletes
     * the member and all associated member resources from the network.
     * </p>
     * 
     * @return The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which
     *         deletes the member and all associated member resources from the network.
     */

    public java.util.List<RemoveAction> getRemovals() {
        return removals;
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which deletes
     * the member and all associated member resources from the network.
     * </p>
     * 
     * @param removals
     *        The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which
     *        deletes the member and all associated member resources from the network.
     */

    public void setRemovals(java.util.Collection<RemoveAction> removals) {
        if (removals == null) {
            this.removals = null;
            return;
        }

        this.removals = new java.util.ArrayList<RemoveAction>(removals);
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which deletes
     * the member and all associated member resources from the network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemovals(java.util.Collection)} or {@link #withRemovals(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param removals
     *        The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which
     *        deletes the member and all associated member resources from the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalActions withRemovals(RemoveAction... removals) {
        if (this.removals == null) {
            setRemovals(new java.util.ArrayList<RemoveAction>(removals.length));
        }
        for (RemoveAction ele : removals) {
            this.removals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which deletes
     * the member and all associated member resources from the network.
     * </p>
     * 
     * @param removals
     *        The actions to perform for an <code>APPROVED</code> proposal to remove a member from the network, which
     *        deletes the member and all associated member resources from the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposalActions withRemovals(java.util.Collection<RemoveAction> removals) {
        setRemovals(removals);
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
        if (getInvitations() != null)
            sb.append("Invitations: ").append(getInvitations()).append(",");
        if (getRemovals() != null)
            sb.append("Removals: ").append(getRemovals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProposalActions == false)
            return false;
        ProposalActions other = (ProposalActions) obj;
        if (other.getInvitations() == null ^ this.getInvitations() == null)
            return false;
        if (other.getInvitations() != null && other.getInvitations().equals(this.getInvitations()) == false)
            return false;
        if (other.getRemovals() == null ^ this.getRemovals() == null)
            return false;
        if (other.getRemovals() != null && other.getRemovals().equals(this.getRemovals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitations() == null) ? 0 : getInvitations().hashCode());
        hashCode = prime * hashCode + ((getRemovals() == null) ? 0 : getRemovals().hashCode());
        return hashCode;
    }

    @Override
    public ProposalActions clone() {
        try {
            return (ProposalActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.ProposalActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
