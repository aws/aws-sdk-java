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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Web Services account and entity that performed an action on an affected
 * resource. The action was performed using the credentials for an Amazon Web Services account other than your own
 * account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AwsAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAccount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The unique identifier for the entity that performed the action.
     * </p>
     */
    private String principalId;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAccount withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the entity that performed the action.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that performed the action.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that performed the action.
     * </p>
     * 
     * @return The unique identifier for the entity that performed the action.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that performed the action.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAccount withPrincipalId(String principalId) {
        setPrincipalId(principalId);
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
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAccount == false)
            return false;
        AwsAccount other = (AwsAccount) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        return hashCode;
    }

    @Override
    public AwsAccount clone() {
        try {
            return (AwsAccount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.AwsAccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
