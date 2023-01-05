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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the remote Amazon Web Services account that made the API call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RemoteAccountDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteAccountDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the remote API caller.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     * environment. If this value is <code>True</code> the API caller is affiliated to your account in some way. If it
     * is <code>False</code> the API caller is from outside your environment.
     * </p>
     */
    private Boolean affiliated;

    /**
     * <p>
     * The Amazon Web Services account ID of the remote API caller.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the remote API caller.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the remote API caller.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the remote API caller.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the remote API caller.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the remote API caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccountDetails withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     * environment. If this value is <code>True</code> the API caller is affiliated to your account in some way. If it
     * is <code>False</code> the API caller is from outside your environment.
     * </p>
     * 
     * @param affiliated
     *        Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     *        environment. If this value is <code>True</code> the API caller is affiliated to your account in some way.
     *        If it is <code>False</code> the API caller is from outside your environment.
     */

    public void setAffiliated(Boolean affiliated) {
        this.affiliated = affiliated;
    }

    /**
     * <p>
     * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     * environment. If this value is <code>True</code> the API caller is affiliated to your account in some way. If it
     * is <code>False</code> the API caller is from outside your environment.
     * </p>
     * 
     * @return Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     *         environment. If this value is <code>True</code> the API caller is affiliated to your account in some way.
     *         If it is <code>False</code> the API caller is from outside your environment.
     */

    public Boolean getAffiliated() {
        return this.affiliated;
    }

    /**
     * <p>
     * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     * environment. If this value is <code>True</code> the API caller is affiliated to your account in some way. If it
     * is <code>False</code> the API caller is from outside your environment.
     * </p>
     * 
     * @param affiliated
     *        Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     *        environment. If this value is <code>True</code> the API caller is affiliated to your account in some way.
     *        If it is <code>False</code> the API caller is from outside your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccountDetails withAffiliated(Boolean affiliated) {
        setAffiliated(affiliated);
        return this;
    }

    /**
     * <p>
     * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     * environment. If this value is <code>True</code> the API caller is affiliated to your account in some way. If it
     * is <code>False</code> the API caller is from outside your environment.
     * </p>
     * 
     * @return Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty
     *         environment. If this value is <code>True</code> the API caller is affiliated to your account in some way.
     *         If it is <code>False</code> the API caller is from outside your environment.
     */

    public Boolean isAffiliated() {
        return this.affiliated;
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
        if (getAffiliated() != null)
            sb.append("Affiliated: ").append(getAffiliated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteAccountDetails == false)
            return false;
        RemoteAccountDetails other = (RemoteAccountDetails) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAffiliated() == null ^ this.getAffiliated() == null)
            return false;
        if (other.getAffiliated() != null && other.getAffiliated().equals(this.getAffiliated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAffiliated() == null) ? 0 : getAffiliated().hashCode());
        return hashCode;
    }

    @Override
    public RemoteAccountDetails clone() {
        try {
            return (RemoteAccountDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RemoteAccountDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
