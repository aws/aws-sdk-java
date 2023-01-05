/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The total of usage for an account ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UsageTotal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageTotal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID of the account that usage data was retrieved for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An object representing the total usage for an account.
     * </p>
     */
    private java.util.List<Usage> usage;

    /**
     * <p>
     * The account ID of the account that usage data was retrieved for.
     * </p>
     * 
     * @param accountId
     *        The account ID of the account that usage data was retrieved for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the account that usage data was retrieved for.
     * </p>
     * 
     * @return The account ID of the account that usage data was retrieved for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the account that usage data was retrieved for.
     * </p>
     * 
     * @param accountId
     *        The account ID of the account that usage data was retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTotal withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An object representing the total usage for an account.
     * </p>
     * 
     * @return An object representing the total usage for an account.
     */

    public java.util.List<Usage> getUsage() {
        return usage;
    }

    /**
     * <p>
     * An object representing the total usage for an account.
     * </p>
     * 
     * @param usage
     *        An object representing the total usage for an account.
     */

    public void setUsage(java.util.Collection<Usage> usage) {
        if (usage == null) {
            this.usage = null;
            return;
        }

        this.usage = new java.util.ArrayList<Usage>(usage);
    }

    /**
     * <p>
     * An object representing the total usage for an account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsage(java.util.Collection)} or {@link #withUsage(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param usage
     *        An object representing the total usage for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTotal withUsage(Usage... usage) {
        if (this.usage == null) {
            setUsage(new java.util.ArrayList<Usage>(usage.length));
        }
        for (Usage ele : usage) {
            this.usage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object representing the total usage for an account.
     * </p>
     * 
     * @param usage
     *        An object representing the total usage for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTotal withUsage(java.util.Collection<Usage> usage) {
        setUsage(usage);
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
        if (getUsage() != null)
            sb.append("Usage: ").append(getUsage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageTotal == false)
            return false;
        UsageTotal other = (UsageTotal) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUsage() == null ^ this.getUsage() == null)
            return false;
        if (other.getUsage() != null && other.getUsage().equals(this.getUsage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUsage() == null) ? 0 : getUsage().hashCode());
        return hashCode;
    }

    @Override
    public UsageTotal clone() {
        try {
            return (UsageTotal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.UsageTotalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
