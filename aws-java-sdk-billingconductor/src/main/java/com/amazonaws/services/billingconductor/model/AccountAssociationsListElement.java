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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of a linked account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/AccountAssociationsListElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAssociationsListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The associating array of account IDs.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Billing Group Arn that the linked account is associated to.
     * </p>
     */
    private String billingGroupArn;
    /**
     * <p>
     * The Amazon Web Services account name.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The Amazon Web Services account email.
     * </p>
     */
    private String accountEmail;

    /**
     * <p>
     * The associating array of account IDs.
     * </p>
     * 
     * @param accountId
     *        The associating array of account IDs.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The associating array of account IDs.
     * </p>
     * 
     * @return The associating array of account IDs.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The associating array of account IDs.
     * </p>
     * 
     * @param accountId
     *        The associating array of account IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssociationsListElement withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Billing Group Arn that the linked account is associated to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Billing Group Arn that the linked account is associated to.
     */

    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The Billing Group Arn that the linked account is associated to.
     * </p>
     * 
     * @return The Billing Group Arn that the linked account is associated to.
     */

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    /**
     * <p>
     * The Billing Group Arn that the linked account is associated to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Billing Group Arn that the linked account is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssociationsListElement withBillingGroupArn(String billingGroupArn) {
        setBillingGroupArn(billingGroupArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account name.
     * </p>
     * 
     * @param accountName
     *        The Amazon Web Services account name.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The Amazon Web Services account name.
     * </p>
     * 
     * @return The Amazon Web Services account name.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The Amazon Web Services account name.
     * </p>
     * 
     * @param accountName
     *        The Amazon Web Services account name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssociationsListElement withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account email.
     * </p>
     * 
     * @param accountEmail
     *        The Amazon Web Services account email.
     */

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    /**
     * <p>
     * The Amazon Web Services account email.
     * </p>
     * 
     * @return The Amazon Web Services account email.
     */

    public String getAccountEmail() {
        return this.accountEmail;
    }

    /**
     * <p>
     * The Amazon Web Services account email.
     * </p>
     * 
     * @param accountEmail
     *        The Amazon Web Services account email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAssociationsListElement withAccountEmail(String accountEmail) {
        setAccountEmail(accountEmail);
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
        if (getBillingGroupArn() != null)
            sb.append("BillingGroupArn: ").append(getBillingGroupArn()).append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccountEmail() != null)
            sb.append("AccountEmail: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAssociationsListElement == false)
            return false;
        AccountAssociationsListElement other = (AccountAssociationsListElement) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getAccountEmail() == null ^ this.getAccountEmail() == null)
            return false;
        if (other.getAccountEmail() != null && other.getAccountEmail().equals(this.getAccountEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getAccountEmail() == null) ? 0 : getAccountEmail().hashCode());
        return hashCode;
    }

    @Override
    public AccountAssociationsListElement clone() {
        try {
            return (AccountAssociationsListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.AccountAssociationsListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
