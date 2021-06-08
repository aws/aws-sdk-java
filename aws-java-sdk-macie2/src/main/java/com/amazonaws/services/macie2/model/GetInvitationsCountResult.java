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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetInvitationsCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInvitationsCountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The total number of invitations that were received by the account, not including the currently accepted
     * invitation.
     * </p>
     */
    private Long invitationsCount;

    /**
     * <p>
     * The total number of invitations that were received by the account, not including the currently accepted
     * invitation.
     * </p>
     * 
     * @param invitationsCount
     *        The total number of invitations that were received by the account, not including the currently accepted
     *        invitation.
     */

    public void setInvitationsCount(Long invitationsCount) {
        this.invitationsCount = invitationsCount;
    }

    /**
     * <p>
     * The total number of invitations that were received by the account, not including the currently accepted
     * invitation.
     * </p>
     * 
     * @return The total number of invitations that were received by the account, not including the currently accepted
     *         invitation.
     */

    public Long getInvitationsCount() {
        return this.invitationsCount;
    }

    /**
     * <p>
     * The total number of invitations that were received by the account, not including the currently accepted
     * invitation.
     * </p>
     * 
     * @param invitationsCount
     *        The total number of invitations that were received by the account, not including the currently accepted
     *        invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInvitationsCountResult withInvitationsCount(Long invitationsCount) {
        setInvitationsCount(invitationsCount);
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
        if (getInvitationsCount() != null)
            sb.append("InvitationsCount: ").append(getInvitationsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInvitationsCountResult == false)
            return false;
        GetInvitationsCountResult other = (GetInvitationsCountResult) obj;
        if (other.getInvitationsCount() == null ^ this.getInvitationsCount() == null)
            return false;
        if (other.getInvitationsCount() != null && other.getInvitationsCount().equals(this.getInvitationsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvitationsCount() == null) ? 0 : getInvitationsCount().hashCode());
        return hashCode;
    }

    @Override
    public GetInvitationsCountResult clone() {
        try {
            return (GetInvitationsCountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
