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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/AssociateDelegationSignerToDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDelegationSignerToDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The information about a key, including the algorithm, public key-value, and flags.
     * </p>
     */
    private DnssecSigningAttributes signingAttributes;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDelegationSignerToDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The information about a key, including the algorithm, public key-value, and flags.
     * </p>
     * 
     * @param signingAttributes
     *        The information about a key, including the algorithm, public key-value, and flags.
     */

    public void setSigningAttributes(DnssecSigningAttributes signingAttributes) {
        this.signingAttributes = signingAttributes;
    }

    /**
     * <p>
     * The information about a key, including the algorithm, public key-value, and flags.
     * </p>
     * 
     * @return The information about a key, including the algorithm, public key-value, and flags.
     */

    public DnssecSigningAttributes getSigningAttributes() {
        return this.signingAttributes;
    }

    /**
     * <p>
     * The information about a key, including the algorithm, public key-value, and flags.
     * </p>
     * 
     * @param signingAttributes
     *        The information about a key, including the algorithm, public key-value, and flags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDelegationSignerToDomainRequest withSigningAttributes(DnssecSigningAttributes signingAttributes) {
        setSigningAttributes(signingAttributes);
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
        if (getSigningAttributes() != null)
            sb.append("SigningAttributes: ").append(getSigningAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDelegationSignerToDomainRequest == false)
            return false;
        AssociateDelegationSignerToDomainRequest other = (AssociateDelegationSignerToDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSigningAttributes() == null ^ this.getSigningAttributes() == null)
            return false;
        if (other.getSigningAttributes() != null && other.getSigningAttributes().equals(this.getSigningAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSigningAttributes() == null) ? 0 : getSigningAttributes().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDelegationSignerToDomainRequest clone() {
        return (AssociateDelegationSignerToDomainRequest) super.clone();
    }

}
