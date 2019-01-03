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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InviteUsersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The invite details.
     * </p>
     */
    private java.util.List<Invite> invites;

    /**
     * <p>
     * The invite details.
     * </p>
     * 
     * @return The invite details.
     */

    public java.util.List<Invite> getInvites() {
        return invites;
    }

    /**
     * <p>
     * The invite details.
     * </p>
     * 
     * @param invites
     *        The invite details.
     */

    public void setInvites(java.util.Collection<Invite> invites) {
        if (invites == null) {
            this.invites = null;
            return;
        }

        this.invites = new java.util.ArrayList<Invite>(invites);
    }

    /**
     * <p>
     * The invite details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvites(java.util.Collection)} or {@link #withInvites(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param invites
     *        The invite details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteUsersResult withInvites(Invite... invites) {
        if (this.invites == null) {
            setInvites(new java.util.ArrayList<Invite>(invites.length));
        }
        for (Invite ele : invites) {
            this.invites.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The invite details.
     * </p>
     * 
     * @param invites
     *        The invite details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteUsersResult withInvites(java.util.Collection<Invite> invites) {
        setInvites(invites);
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
        if (getInvites() != null)
            sb.append("Invites: ").append(getInvites());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteUsersResult == false)
            return false;
        InviteUsersResult other = (InviteUsersResult) obj;
        if (other.getInvites() == null ^ this.getInvites() == null)
            return false;
        if (other.getInvites() != null && other.getInvites().equals(this.getInvites()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvites() == null) ? 0 : getInvites().hashCode());
        return hashCode;
    }

    @Override
    public InviteUsersResult clone() {
        try {
            return (InviteUsersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
