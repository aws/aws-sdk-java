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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptInvitationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * </p>
     */
    private String masterId;
    /**
     * <p>
     * The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     * </p>
     */
    private String invitationId;

    /**
     * <p>
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * </p>
     * 
     * @param masterId
     *        The account ID of the master Security Hub account whose invitation you're accepting.
     */

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * </p>
     * 
     * @return The account ID of the master Security Hub account whose invitation you're accepting.
     */

    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * </p>
     * 
     * @param masterId
     *        The account ID of the master Security Hub account whose invitation you're accepting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     * </p>
     * 
     * @param invitationId
     *        The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     */

    public void setInvitationId(String invitationId) {
        this.invitationId = invitationId;
    }

    /**
     * <p>
     * The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     * </p>
     * 
     * @return The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     */

    public String getInvitationId() {
        return this.invitationId;
    }

    /**
     * <p>
     * The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     * </p>
     * 
     * @param invitationId
     *        The ID of the invitation that is sent to the AWS account by the Security Hub master account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInvitationRequest withInvitationId(String invitationId) {
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
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
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

        if (obj instanceof AcceptInvitationRequest == false)
            return false;
        AcceptInvitationRequest other = (AcceptInvitationRequest) obj;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
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

        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getInvitationId() == null) ? 0 : getInvitationId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptInvitationRequest clone() {
        return (AcceptInvitationRequest) super.clone();
    }

}
