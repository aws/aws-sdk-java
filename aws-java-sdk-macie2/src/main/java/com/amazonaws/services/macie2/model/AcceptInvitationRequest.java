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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AcceptInvitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     */
    private String administratorAccountId;
    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     */
    private String invitationId;
    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property has been
     * replaced by the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     */
    private String masterAccount;

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @param administratorAccountId
     *        The Amazon Web Services account ID for the account that sent the invitation.
     */

    public void setAdministratorAccountId(String administratorAccountId) {
        this.administratorAccountId = administratorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the account that sent the invitation.
     */

    public String getAdministratorAccountId() {
        return this.administratorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account that sent the invitation.
     * </p>
     * 
     * @param administratorAccountId
     *        The Amazon Web Services account ID for the account that sent the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withAdministratorAccountId(String administratorAccountId) {
        setAdministratorAccountId(administratorAccountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation to accept.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     * 
     * @return The unique identifier for the invitation to accept.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The unique identifier for the invitation to accept.
     * </p>
     * 
     * @param invitationId
     *        The unique identifier for the invitation to accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withInvitationId(String invitationId) {
        setInvitationId(invitationId);
        return this;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property has been
     * replaced by the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @param masterAccount
     *        (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property
     *        has been replaced by the administratorAccountId property and is retained only for backward compatibility.
     */

    public void setMasterAccount(String masterAccount) {
        this.masterAccount = masterAccount;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property has been
     * replaced by the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @return (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property
     *         has been replaced by the administratorAccountId property and is retained only for backward compatibility.
     */

    public String getMasterAccount() {
        return this.masterAccount;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property has been
     * replaced by the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @param masterAccount
     *        (Deprecated) The Amazon Web Services account ID for the account that sent the invitation. This property
     *        has been replaced by the administratorAccountId property and is retained only for backward compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withMasterAccount(String masterAccount) {
        setMasterAccount(masterAccount);
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
        if (getAdministratorAccountId() != null)
            sb.append("AdministratorAccountId: ").append(getAdministratorAccountId()).append(",");
        if (getInvitationId() != null)
            sb.append("InvitationId: ").append(getInvitationId()).append(",");
        if (getMasterAccount() != null)
            sb.append("MasterAccount: ").append(getMasterAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInvitationRequest == false)
            return false;
        AcceptInvitationRequest other = (AcceptInvitationRequest) obj;
        if (other.getAdministratorAccountId() == null ^ this.getAdministratorAccountId() == null)
            return false;
        if (other.getAdministratorAccountId() != null && other.getAdministratorAccountId().equals(this.getAdministratorAccountId()) == false)
            return false;
        if (other.getInvitationId() == null ^ this.getInvitationId() == null)
            return false;
        if (other.getInvitationId() != null && other.getInvitationId().equals(this.getInvitationId()) == false)
            return false;
        if (other.getMasterAccount() == null ^ this.getMasterAccount() == null)
            return false;
        if (other.getMasterAccount() != null && other.getMasterAccount().equals(this.getMasterAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdministratorAccountId() == null) ? 0 : getAdministratorAccountId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        hashCode = prime * hashCode + ((getMasterAccount() == null) ? 0 : getMasterAccount().hashCode());
        return hashCode;
    }

    @Override
    public AcceptInvitationRequest clone() {
        return (AcceptInvitationRequest) super.clone();
    }

}
