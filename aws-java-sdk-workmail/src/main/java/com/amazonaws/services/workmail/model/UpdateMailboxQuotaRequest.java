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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateMailboxQuota" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMailboxQuotaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization that contains the user for whom to update the mailbox quota.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifer for the user for whom to update the mailbox quota.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The updated mailbox quota, in MB, for the specified user.
     * </p>
     */
    private Integer mailboxQuota;

    /**
     * <p>
     * The identifier for the organization that contains the user for whom to update the mailbox quota.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization that contains the user for whom to update the mailbox quota.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization that contains the user for whom to update the mailbox quota.
     * </p>
     * 
     * @return The identifier for the organization that contains the user for whom to update the mailbox quota.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization that contains the user for whom to update the mailbox quota.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization that contains the user for whom to update the mailbox quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMailboxQuotaRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifer for the user for whom to update the mailbox quota.
     * </p>
     * 
     * @param userId
     *        The identifer for the user for whom to update the mailbox quota.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifer for the user for whom to update the mailbox quota.
     * </p>
     * 
     * @return The identifer for the user for whom to update the mailbox quota.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifer for the user for whom to update the mailbox quota.
     * </p>
     * 
     * @param userId
     *        The identifer for the user for whom to update the mailbox quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMailboxQuotaRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The updated mailbox quota, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxQuota
     *        The updated mailbox quota, in MB, for the specified user.
     */

    public void setMailboxQuota(Integer mailboxQuota) {
        this.mailboxQuota = mailboxQuota;
    }

    /**
     * <p>
     * The updated mailbox quota, in MB, for the specified user.
     * </p>
     * 
     * @return The updated mailbox quota, in MB, for the specified user.
     */

    public Integer getMailboxQuota() {
        return this.mailboxQuota;
    }

    /**
     * <p>
     * The updated mailbox quota, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxQuota
     *        The updated mailbox quota, in MB, for the specified user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMailboxQuotaRequest withMailboxQuota(Integer mailboxQuota) {
        setMailboxQuota(mailboxQuota);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getMailboxQuota() != null)
            sb.append("MailboxQuota: ").append(getMailboxQuota());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMailboxQuotaRequest == false)
            return false;
        UpdateMailboxQuotaRequest other = (UpdateMailboxQuotaRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getMailboxQuota() == null ^ this.getMailboxQuota() == null)
            return false;
        if (other.getMailboxQuota() != null && other.getMailboxQuota().equals(this.getMailboxQuota()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getMailboxQuota() == null) ? 0 : getMailboxQuota().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMailboxQuotaRequest clone() {
        return (UpdateMailboxQuotaRequest) super.clone();
    }

}
