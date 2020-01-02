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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetMailboxDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMailboxDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     */
    private Integer mailboxQuota;
    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     */
    private Double mailboxSize;

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxQuota
     *        The maximum allowed mailbox size, in MB, for the specified user.
     */

    public void setMailboxQuota(Integer mailboxQuota) {
        this.mailboxQuota = mailboxQuota;
    }

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @return The maximum allowed mailbox size, in MB, for the specified user.
     */

    public Integer getMailboxQuota() {
        return this.mailboxQuota;
    }

    /**
     * <p>
     * The maximum allowed mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxQuota
     *        The maximum allowed mailbox size, in MB, for the specified user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailboxDetailsResult withMailboxQuota(Integer mailboxQuota) {
        setMailboxQuota(mailboxQuota);
        return this;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxSize
     *        The current mailbox size, in MB, for the specified user.
     */

    public void setMailboxSize(Double mailboxSize) {
        this.mailboxSize = mailboxSize;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @return The current mailbox size, in MB, for the specified user.
     */

    public Double getMailboxSize() {
        return this.mailboxSize;
    }

    /**
     * <p>
     * The current mailbox size, in MB, for the specified user.
     * </p>
     * 
     * @param mailboxSize
     *        The current mailbox size, in MB, for the specified user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMailboxDetailsResult withMailboxSize(Double mailboxSize) {
        setMailboxSize(mailboxSize);
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
        if (getMailboxQuota() != null)
            sb.append("MailboxQuota: ").append(getMailboxQuota()).append(",");
        if (getMailboxSize() != null)
            sb.append("MailboxSize: ").append(getMailboxSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMailboxDetailsResult == false)
            return false;
        GetMailboxDetailsResult other = (GetMailboxDetailsResult) obj;
        if (other.getMailboxQuota() == null ^ this.getMailboxQuota() == null)
            return false;
        if (other.getMailboxQuota() != null && other.getMailboxQuota().equals(this.getMailboxQuota()) == false)
            return false;
        if (other.getMailboxSize() == null ^ this.getMailboxSize() == null)
            return false;
        if (other.getMailboxSize() != null && other.getMailboxSize().equals(this.getMailboxSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMailboxQuota() == null) ? 0 : getMailboxQuota().hashCode());
        hashCode = prime * hashCode + ((getMailboxSize() == null) ? 0 : getMailboxSize().hashCode());
        return hashCode;
    }

    @Override
    public GetMailboxDetailsResult clone() {
        try {
            return (GetMailboxDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
