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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/GetDomainSuggestions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainSuggestionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain
     * a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The number of suggested domain names that you want Amazon Route 53 to return.
     * </p>
     */
    private Integer suggestionCount;
    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are available.
     * If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the domain is available, you can call
     * <code>checkDomainAvailability</code> for each suggestion.
     * </p>
     */
    private Boolean onlyAvailable;

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain
     * a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param domainName
     *        A domain name that you want to use as the basis for a list of possible domain names. The domain name must
     *        contain a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain
     * a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return A domain name that you want to use as the basis for a list of possible domain names. The domain name must
     *         contain a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *         Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * A domain name that you want to use as the basis for a list of possible domain names. The domain name must contain
     * a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param domainName
     *        A domain name that you want to use as the basis for a list of possible domain names. The domain name must
     *        contain a top-level domain (TLD), such as .com, that Amazon Route 53 supports. For a list of TLDs, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Amazon Route 53 to return.
     * </p>
     * 
     * @param suggestionCount
     *        The number of suggested domain names that you want Amazon Route 53 to return.
     */

    public void setSuggestionCount(Integer suggestionCount) {
        this.suggestionCount = suggestionCount;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Amazon Route 53 to return.
     * </p>
     * 
     * @return The number of suggested domain names that you want Amazon Route 53 to return.
     */

    public Integer getSuggestionCount() {
        return this.suggestionCount;
    }

    /**
     * <p>
     * The number of suggested domain names that you want Amazon Route 53 to return.
     * </p>
     * 
     * @param suggestionCount
     *        The number of suggested domain names that you want Amazon Route 53 to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withSuggestionCount(Integer suggestionCount) {
        setSuggestionCount(suggestionCount);
        return this;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are available.
     * If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the domain is available, you can call
     * <code>checkDomainAvailability</code> for each suggestion.
     * </p>
     * 
     * @param onlyAvailable
     *        If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are
     *        available. If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names
     *        without checking whether they're available to be registered. To determine whether the domain is available,
     *        you can call <code>checkDomainAvailability</code> for each suggestion.
     */

    public void setOnlyAvailable(Boolean onlyAvailable) {
        this.onlyAvailable = onlyAvailable;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are available.
     * If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the domain is available, you can call
     * <code>checkDomainAvailability</code> for each suggestion.
     * </p>
     * 
     * @return If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are
     *         available. If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names
     *         without checking whether they're available to be registered. To determine whether the domain is
     *         available, you can call <code>checkDomainAvailability</code> for each suggestion.
     */

    public Boolean getOnlyAvailable() {
        return this.onlyAvailable;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are available.
     * If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the domain is available, you can call
     * <code>checkDomainAvailability</code> for each suggestion.
     * </p>
     * 
     * @param onlyAvailable
     *        If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are
     *        available. If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names
     *        without checking whether they're available to be registered. To determine whether the domain is available,
     *        you can call <code>checkDomainAvailability</code> for each suggestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withOnlyAvailable(Boolean onlyAvailable) {
        setOnlyAvailable(onlyAvailable);
        return this;
    }

    /**
     * <p>
     * If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are available.
     * If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names without checking
     * whether they're available to be registered. To determine whether the domain is available, you can call
     * <code>checkDomainAvailability</code> for each suggestion.
     * </p>
     * 
     * @return If <code>OnlyAvailable</code> is <code>true</code>, Amazon Route 53 returns only domain names that are
     *         available. If <code>OnlyAvailable</code> is <code>false</code>, Amazon Route 53 returns domain names
     *         without checking whether they're available to be registered. To determine whether the domain is
     *         available, you can call <code>checkDomainAvailability</code> for each suggestion.
     */

    public Boolean isOnlyAvailable() {
        return this.onlyAvailable;
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
        if (getSuggestionCount() != null)
            sb.append("SuggestionCount: ").append(getSuggestionCount()).append(",");
        if (getOnlyAvailable() != null)
            sb.append("OnlyAvailable: ").append(getOnlyAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainSuggestionsRequest == false)
            return false;
        GetDomainSuggestionsRequest other = (GetDomainSuggestionsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSuggestionCount() == null ^ this.getSuggestionCount() == null)
            return false;
        if (other.getSuggestionCount() != null && other.getSuggestionCount().equals(this.getSuggestionCount()) == false)
            return false;
        if (other.getOnlyAvailable() == null ^ this.getOnlyAvailable() == null)
            return false;
        if (other.getOnlyAvailable() != null && other.getOnlyAvailable().equals(this.getOnlyAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSuggestionCount() == null) ? 0 : getSuggestionCount().hashCode());
        hashCode = prime * hashCode + ((getOnlyAvailable() == null) ? 0 : getOnlyAvailable().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainSuggestionsRequest clone() {
        return (GetDomainSuggestionsRequest) super.clone();
    }

}
