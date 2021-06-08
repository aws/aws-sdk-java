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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     */
    private String kmsKey;
    /**
     * <p>
     * The delegated administrator account for AWS Audit Manager.
     * </p>
     */
    private String delegatedAdminAccount;

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @param kmsKey
     *        The AWS KMS key details.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @return The AWS KMS key details.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The AWS KMS key details.
     * </p>
     * 
     * @param kmsKey
     *        The AWS KMS key details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountRequest withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * The delegated administrator account for AWS Audit Manager.
     * </p>
     * 
     * @param delegatedAdminAccount
     *        The delegated administrator account for AWS Audit Manager.
     */

    public void setDelegatedAdminAccount(String delegatedAdminAccount) {
        this.delegatedAdminAccount = delegatedAdminAccount;
    }

    /**
     * <p>
     * The delegated administrator account for AWS Audit Manager.
     * </p>
     * 
     * @return The delegated administrator account for AWS Audit Manager.
     */

    public String getDelegatedAdminAccount() {
        return this.delegatedAdminAccount;
    }

    /**
     * <p>
     * The delegated administrator account for AWS Audit Manager.
     * </p>
     * 
     * @param delegatedAdminAccount
     *        The delegated administrator account for AWS Audit Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAccountRequest withDelegatedAdminAccount(String delegatedAdminAccount) {
        setDelegatedAdminAccount(delegatedAdminAccount);
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
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getDelegatedAdminAccount() != null)
            sb.append("DelegatedAdminAccount: ").append(getDelegatedAdminAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAccountRequest == false)
            return false;
        RegisterAccountRequest other = (RegisterAccountRequest) obj;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getDelegatedAdminAccount() == null ^ this.getDelegatedAdminAccount() == null)
            return false;
        if (other.getDelegatedAdminAccount() != null && other.getDelegatedAdminAccount().equals(this.getDelegatedAdminAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getDelegatedAdminAccount() == null) ? 0 : getDelegatedAdminAccount().hashCode());
        return hashCode;
    }

    @Override
    public RegisterAccountRequest clone() {
        return (RegisterAccountRequest) super.clone();
    }

}
