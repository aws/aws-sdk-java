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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for Update Share Invitation
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateShareInvitation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateShareInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     */
    private String shareInvitationId;

    private String shareInvitationAction;

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     */

    public void setShareInvitationId(String shareInvitationId) {
        this.shareInvitationId = shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @return The ID assigned to the share invitation.
     */

    public String getShareInvitationId() {
        return this.shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateShareInvitationRequest withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
        return this;
    }

    /**
     * @param shareInvitationAction
     * @see ShareInvitationAction
     */

    public void setShareInvitationAction(String shareInvitationAction) {
        this.shareInvitationAction = shareInvitationAction;
    }

    /**
     * @return
     * @see ShareInvitationAction
     */

    public String getShareInvitationAction() {
        return this.shareInvitationAction;
    }

    /**
     * @param shareInvitationAction
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareInvitationAction
     */

    public UpdateShareInvitationRequest withShareInvitationAction(String shareInvitationAction) {
        setShareInvitationAction(shareInvitationAction);
        return this;
    }

    /**
     * @param shareInvitationAction
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareInvitationAction
     */

    public UpdateShareInvitationRequest withShareInvitationAction(ShareInvitationAction shareInvitationAction) {
        this.shareInvitationAction = shareInvitationAction.toString();
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
        if (getShareInvitationId() != null)
            sb.append("ShareInvitationId: ").append(getShareInvitationId()).append(",");
        if (getShareInvitationAction() != null)
            sb.append("ShareInvitationAction: ").append(getShareInvitationAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateShareInvitationRequest == false)
            return false;
        UpdateShareInvitationRequest other = (UpdateShareInvitationRequest) obj;
        if (other.getShareInvitationId() == null ^ this.getShareInvitationId() == null)
            return false;
        if (other.getShareInvitationId() != null && other.getShareInvitationId().equals(this.getShareInvitationId()) == false)
            return false;
        if (other.getShareInvitationAction() == null ^ this.getShareInvitationAction() == null)
            return false;
        if (other.getShareInvitationAction() != null && other.getShareInvitationAction().equals(this.getShareInvitationAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        hashCode = prime * hashCode + ((getShareInvitationAction() == null) ? 0 : getShareInvitationAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateShareInvitationRequest clone() {
        return (UpdateShareInvitationRequest) super.clone();
    }

}
