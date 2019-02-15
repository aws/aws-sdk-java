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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Chime account details. An AWS account can have multiple Amazon Chime accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Account" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Account implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Chime account type. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     */
    private String accountType;
    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     */
    private String defaultLicense;
    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     */
    private java.util.List<String> supportedLicenses;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     * 
     * @param name
     *        The Amazon Chime account name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     * 
     * @return The Amazon Chime account name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The Amazon Chime account name.
     * </p>
     * 
     * @param name
     *        The Amazon Chime account name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param accountType
     *        The Amazon Chime account type. For more information about different account types, see <a
     *        href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     *        Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * @see AccountType
     */

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @return The Amazon Chime account type. For more information about different account types, see <a
     *         href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     *         Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * @see AccountType
     */

    public String getAccountType() {
        return this.accountType;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param accountType
     *        The Amazon Chime account type. For more information about different account types, see <a
     *        href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     *        Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountType
     */

    public Account withAccountType(String accountType) {
        setAccountType(accountType);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account type. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param accountType
     *        The Amazon Chime account type. For more information about different account types, see <a
     *        href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     *        Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountType
     */

    public Account withAccountType(AccountType accountType) {
        this.accountType = accountType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime account creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The Amazon Chime account creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The Amazon Chime account creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The Amazon Chime account creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license for the Amazon Chime account.
     * @see License
     */

    public void setDefaultLicense(String defaultLicense) {
        this.defaultLicense = defaultLicense;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * 
     * @return The default license for the Amazon Chime account.
     * @see License
     */

    public String getDefaultLicense() {
        return this.defaultLicense;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license for the Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public Account withDefaultLicense(String defaultLicense) {
        setDefaultLicense(defaultLicense);
        return this;
    }

    /**
     * <p>
     * The default license for the Amazon Chime account.
     * </p>
     * 
     * @param defaultLicense
     *        The default license for the Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public Account withDefaultLicense(License defaultLicense) {
        this.defaultLicense = defaultLicense.toString();
        return this;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * 
     * @return Supported licenses for the Amazon Chime account.
     * @see License
     */

    public java.util.List<String> getSupportedLicenses() {
        return supportedLicenses;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * 
     * @param supportedLicenses
     *        Supported licenses for the Amazon Chime account.
     * @see License
     */

    public void setSupportedLicenses(java.util.Collection<String> supportedLicenses) {
        if (supportedLicenses == null) {
            this.supportedLicenses = null;
            return;
        }

        this.supportedLicenses = new java.util.ArrayList<String>(supportedLicenses);
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedLicenses(java.util.Collection)} or {@link #withSupportedLicenses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedLicenses
     *        Supported licenses for the Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public Account withSupportedLicenses(String... supportedLicenses) {
        if (this.supportedLicenses == null) {
            setSupportedLicenses(new java.util.ArrayList<String>(supportedLicenses.length));
        }
        for (String ele : supportedLicenses) {
            this.supportedLicenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * 
     * @param supportedLicenses
     *        Supported licenses for the Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public Account withSupportedLicenses(java.util.Collection<String> supportedLicenses) {
        setSupportedLicenses(supportedLicenses);
        return this;
    }

    /**
     * <p>
     * Supported licenses for the Amazon Chime account.
     * </p>
     * 
     * @param supportedLicenses
     *        Supported licenses for the Amazon Chime account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public Account withSupportedLicenses(License... supportedLicenses) {
        java.util.ArrayList<String> supportedLicensesCopy = new java.util.ArrayList<String>(supportedLicenses.length);
        for (License value : supportedLicenses) {
            supportedLicensesCopy.add(value.toString());
        }
        if (getSupportedLicenses() == null) {
            setSupportedLicenses(supportedLicensesCopy);
        } else {
            getSupportedLicenses().addAll(supportedLicensesCopy);
        }
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAccountType() != null)
            sb.append("AccountType: ").append(getAccountType()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getDefaultLicense() != null)
            sb.append("DefaultLicense: ").append(getDefaultLicense()).append(",");
        if (getSupportedLicenses() != null)
            sb.append("SupportedLicenses: ").append(getSupportedLicenses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountType() == null ^ this.getAccountType() == null)
            return false;
        if (other.getAccountType() != null && other.getAccountType().equals(this.getAccountType()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getDefaultLicense() == null ^ this.getDefaultLicense() == null)
            return false;
        if (other.getDefaultLicense() != null && other.getDefaultLicense().equals(this.getDefaultLicense()) == false)
            return false;
        if (other.getSupportedLicenses() == null ^ this.getSupportedLicenses() == null)
            return false;
        if (other.getSupportedLicenses() != null && other.getSupportedLicenses().equals(this.getSupportedLicenses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDefaultLicense() == null) ? 0 : getDefaultLicense().hashCode());
        hashCode = prime * hashCode + ((getSupportedLicenses() == null) ? 0 : getSupportedLicenses().hashCode());
        return hashCode;
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
