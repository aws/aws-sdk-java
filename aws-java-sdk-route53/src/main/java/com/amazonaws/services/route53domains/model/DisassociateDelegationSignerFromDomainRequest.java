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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/DisassociateDelegationSignerFromDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDelegationSignerFromDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An internal identification number assigned to each DS record after it’s created. You can retrieve it as part of
     * DNSSEC information returned by <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     * >GetDomainDetail</a>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @return Name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain.
     * </p>
     * 
     * @param domainName
     *        Name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDelegationSignerFromDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An internal identification number assigned to each DS record after it’s created. You can retrieve it as part of
     * DNSSEC information returned by <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     * >GetDomainDetail</a>.
     * </p>
     * 
     * @param id
     *        An internal identification number assigned to each DS record after it’s created. You can retrieve it as
     *        part of DNSSEC information returned by <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     *        >GetDomainDetail</a>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An internal identification number assigned to each DS record after it’s created. You can retrieve it as part of
     * DNSSEC information returned by <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     * >GetDomainDetail</a>.
     * </p>
     * 
     * @return An internal identification number assigned to each DS record after it’s created. You can retrieve it as
     *         part of DNSSEC information returned by <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     *         >GetDomainDetail</a>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * An internal identification number assigned to each DS record after it’s created. You can retrieve it as part of
     * DNSSEC information returned by <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     * >GetDomainDetail</a>.
     * </p>
     * 
     * @param id
     *        An internal identification number assigned to each DS record after it’s created. You can retrieve it as
     *        part of DNSSEC information returned by <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetDomainDetail.html"
     *        >GetDomainDetail</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateDelegationSignerFromDomainRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateDelegationSignerFromDomainRequest == false)
            return false;
        DisassociateDelegationSignerFromDomainRequest other = (DisassociateDelegationSignerFromDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateDelegationSignerFromDomainRequest clone() {
        return (DisassociateDelegationSignerFromDomainRequest) super.clone();
    }

}
