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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptAdministratorInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID of the Security Hub administrator account that sent the invitation.
     * </p>
     */
    private String administratorId;
    /**
     * <p>
     * The identifier of the invitation sent from the Security Hub administrator account.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The account ID of the Security Hub administrator account that sent the invitation.
     * </p>
     * 
     * @param administratorId
     *        The account ID of the Security Hub administrator account that sent the invitation.
     */

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * <p>
     * The account ID of the Security Hub administrator account that sent the invitation.
     * </p>
     * 
     * @return The account ID of the Security Hub administrator account that sent the invitation.
     */

    public String getAdministratorId() {
        return this.administratorId;
    }

    /**
     * <p>
     * The account ID of the Security Hub administrator account that sent the invitation.
     * </p>
     * 
     * @param administratorId
     *        The account ID of the Security Hub administrator account that sent the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptAdministratorInvitationRequest withAdministratorId(String administratorId) {
        setAdministratorId(administratorId);
        return this;
    }

    /**
     * <p>
     * The identifier of the invitation sent from the Security Hub administrator account.
     * </p>
     * 
     * @param invitationId
     *        The identifier of the invitation sent from the Security Hub administrator account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The identifier of the invitation sent from the Security Hub administrator account.
     * </p>
     * 
     * @return The identifier of the invitation sent from the Security Hub administrator account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The identifier of the invitation sent from the Security Hub administrator account.
     * </p>
     * 
     * @param invitationId
     *        The identifier of the invitation sent from the Security Hub administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptAdministratorInvitationRequest withInvitationId(String invitationId) {
        setInvitationId(invitationId);
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
        if (getAdministratorId() != null)
            sb.append("AdministratorId: ").append(getAdministratorId()).append(",");
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptAdministratorInvitationRequest == false)
            return false;
        AcceptAdministratorInvitationRequest other = (AcceptAdministratorInvitationRequest) obj;
        if (other.getAdministratorId() == null ^ this.getAdministratorId() == null)
            return false;
        if (other.getAdministratorId() != null && other.getAdministratorId().equals(this.getAdministratorId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdministratorId() == null) ? 0 : getAdministratorId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptAdministratorInvitationRequest clone() {
        return (AcceptAdministratorInvitationRequest) super.clone();
    }

}
