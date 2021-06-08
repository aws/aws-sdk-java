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
 * The AcceptDomainTransferFromAnotherAwsAccount request includes the following elements.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/AcceptDomainTransferFromAnotherAwsAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptDomainTransferFromAnotherAwsAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that was specified when another AWS account submitted a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The password that was returned by the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The name of the domain that was specified when another AWS account submitted a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that was specified when another AWS account submitted a <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *        >TransferDomainToAnotherAwsAccount</a> request.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that was specified when another AWS account submitted a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @return The name of the domain that was specified when another AWS account submitted a <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *         >TransferDomainToAnotherAwsAccount</a> request.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that was specified when another AWS account submitted a <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that was specified when another AWS account submitted a <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *        >TransferDomainToAnotherAwsAccount</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDomainTransferFromAnotherAwsAccountRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The password that was returned by the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @param password
     *        The password that was returned by the <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *        >TransferDomainToAnotherAwsAccount</a> request.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password that was returned by the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @return The password that was returned by the <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *         >TransferDomainToAnotherAwsAccount</a> request.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password that was returned by the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     * >TransferDomainToAnotherAwsAccount</a> request.
     * </p>
     * 
     * @param password
     *        The password that was returned by the <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
     *        >TransferDomainToAnotherAwsAccount</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptDomainTransferFromAnotherAwsAccountRequest withPassword(String password) {
        setPassword(password);
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
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptDomainTransferFromAnotherAwsAccountRequest == false)
            return false;
        AcceptDomainTransferFromAnotherAwsAccountRequest other = (AcceptDomainTransferFromAnotherAwsAccountRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public AcceptDomainTransferFromAnotherAwsAccountRequest clone() {
        return (AcceptDomainTransferFromAnotherAwsAccountRequest) super.clone();
    }

}
