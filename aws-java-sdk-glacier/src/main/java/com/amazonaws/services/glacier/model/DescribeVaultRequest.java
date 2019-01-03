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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for retrieving metadata for a specific vault in Amazon Glacier.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVaultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;

    /**
     * Default constructor for DescribeVaultRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DescribeVaultRequest() {
    }

    /**
     * Constructs a new DescribeVaultRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     */
    public DescribeVaultRequest(String vaultName) {
        setVaultName(vaultName);
    }

    /**
     * Constructs a new DescribeVaultRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     */
    public DescribeVaultRequest(String accountId, String vaultName) {
        setAccountId(accountId);
        setVaultName(vaultName);
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *         specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *         uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *         ID, do not include any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVaultRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     */

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @return The name of the vault.
     */

    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVaultRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
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
        if (getVaultName() != null)
            sb.append("VaultName: ").append(getVaultName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVaultRequest == false)
            return false;
        DescribeVaultRequest other = (DescribeVaultRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVaultRequest clone() {
        return (DescribeVaultRequest) super.clone();
    }

}
