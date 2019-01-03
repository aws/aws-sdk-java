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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The CheckDomainTransferability request contains the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainTransferability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDomainTransferabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to transfer to Amazon Route 53.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code
     * that you got from the current registrar for the domain.
     * </p>
     */
    private String authCode;

    /**
     * <p>
     * The name of the domain that you want to transfer to Amazon Route 53.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer to Amazon Route 53.</p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Amazon Route 53.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @return The name of the domain that you want to transfer to Amazon Route 53.</p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Internationalized Domain Names are not supported.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer to Amazon Route 53.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to transfer to Amazon Route 53.</p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDomainTransferabilityRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code
     * that you got from the current registrar for the domain.
     * </p>
     * 
     * @param authCode
     *        If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the
     *        code that you got from the current registrar for the domain.
     */

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code
     * that you got from the current registrar for the domain.
     * </p>
     * 
     * @return If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain,
     *         the code that you got from the current registrar for the domain.
     */

    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * <p>
     * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code
     * that you got from the current registrar for the domain.
     * </p>
     * 
     * @param authCode
     *        If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the
     *        code that you got from the current registrar for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDomainTransferabilityRequest withAuthCode(String authCode) {
        setAuthCode(authCode);
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
        if (getAuthCode() != null)
            sb.append("AuthCode: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainTransferabilityRequest == false)
            return false;
        CheckDomainTransferabilityRequest other = (CheckDomainTransferabilityRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        return hashCode;
    }

    @Override
    public CheckDomainTransferabilityRequest clone() {
        return (CheckDomainTransferabilityRequest) super.clone();
    }

}
