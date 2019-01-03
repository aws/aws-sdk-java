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
 * The CheckDomainAvailability request contains the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/CheckDomainAvailability"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDomainAvailabilityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to get availability for.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String idnLangCode;

    /**
     * <p>
     * The name of the domain that you want to get availability for.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to get availability for.</p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to get availability for.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @return The name of the domain that you want to get availability for.</p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Internationalized Domain Names are not supported.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to get availability for.
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to get availability for.</p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDomainAvailabilityRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     */

    public void setIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getIdnLangCode() {
        return this.idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDomainAvailabilityRequest withIdnLangCode(String idnLangCode) {
        setIdnLangCode(idnLangCode);
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
        if (getIdnLangCode() != null)
            sb.append("IdnLangCode: ").append(getIdnLangCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckDomainAvailabilityRequest == false)
            return false;
        CheckDomainAvailabilityRequest other = (CheckDomainAvailabilityRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getIdnLangCode() == null ^ this.getIdnLangCode() == null)
            return false;
        if (other.getIdnLangCode() != null && other.getIdnLangCode().equals(this.getIdnLangCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getIdnLangCode() == null) ? 0 : getIdnLangCode().hashCode());
        return hashCode;
    }

    @Override
    public CheckDomainAvailabilityRequest clone() {
        return (CheckDomainAvailabilityRequest) super.clone();
    }

}
