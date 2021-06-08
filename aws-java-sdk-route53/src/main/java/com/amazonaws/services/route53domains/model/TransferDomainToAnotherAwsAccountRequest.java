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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The TransferDomainToAnotherAwsAccount request includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/TransferDomainToAnotherAwsAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferDomainToAnotherAwsAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS account to another account.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain to, for example, <code>111122223333</code>
     * .
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS account to another account.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer from the current AWS account to another account.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS account to another account.
     * </p>
     * 
     * @return The name of the domain that you want to transfer from the current AWS account to another account.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS account to another account.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer from the current AWS account to another account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainToAnotherAwsAccountRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain to, for example, <code>111122223333</code>
     * .
     * </p>
     * 
     * @param accountId
     *        The account ID of the AWS account that you want to transfer the domain to, for example,
     *        <code>111122223333</code>.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain to, for example, <code>111122223333</code>
     * .
     * </p>
     * 
     * @return The account ID of the AWS account that you want to transfer the domain to, for example,
     *         <code>111122223333</code>.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain to, for example, <code>111122223333</code>
     * .
     * </p>
     * 
     * @param accountId
     *        The account ID of the AWS account that you want to transfer the domain to, for example,
     *        <code>111122223333</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferDomainToAnotherAwsAccountRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainToAnotherAwsAccountRequest == false)
            return false;
        TransferDomainToAnotherAwsAccountRequest other = (TransferDomainToAnotherAwsAccountRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public TransferDomainToAnotherAwsAccountRequest clone() {
        return (TransferDomainToAnotherAwsAccountRequest) super.clone();
    }

}
