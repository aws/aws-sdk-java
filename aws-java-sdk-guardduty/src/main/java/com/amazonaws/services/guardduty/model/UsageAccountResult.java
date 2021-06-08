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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the total of usage based on account IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageAccountResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageAccountResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Account ID that generated usage.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Represents the total of usage for the Account ID.
     * </p>
     */
    private Total total;

    /**
     * <p>
     * The Account ID that generated usage.
     * </p>
     * 
     * @param accountId
     *        The Account ID that generated usage.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Account ID that generated usage.
     * </p>
     * 
     * @return The Account ID that generated usage.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Account ID that generated usage.
     * </p>
     * 
     * @param accountId
     *        The Account ID that generated usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageAccountResult withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Represents the total of usage for the Account ID.
     * </p>
     * 
     * @param total
     *        Represents the total of usage for the Account ID.
     */

    public void setTotal(Total total) {
        this.total = total;
    }

    /**
     * <p>
     * Represents the total of usage for the Account ID.
     * </p>
     * 
     * @return Represents the total of usage for the Account ID.
     */

    public Total getTotal() {
        return this.total;
    }

    /**
     * <p>
     * Represents the total of usage for the Account ID.
     * </p>
     * 
     * @param total
     *        Represents the total of usage for the Account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageAccountResult withTotal(Total total) {
        setTotal(total);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageAccountResult == false)
            return false;
        UsageAccountResult other = (UsageAccountResult) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public UsageAccountResult clone() {
        try {
            return (UsageAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageAccountResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
