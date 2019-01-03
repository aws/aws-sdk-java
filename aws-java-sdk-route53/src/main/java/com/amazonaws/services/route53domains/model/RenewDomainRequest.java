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
 * A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration
 * year.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/RenewDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenewDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer durationInYears;
    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     */
    private Integer currentExpiryYear;

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to renew.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * 
     * @return The name of the domain that you want to renew.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to renew.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you want to renew.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to renew the domain for. The maximum number of years depends on the
     *        top-level domain. For the range of valid values for your domain, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Default: 1
     */

    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The number of years that you want to renew the domain for. The maximum number of years depends on the
     *         top-level domain. For the range of valid values for your domain, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *         Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *         <p>
     *         Default: 1
     */

    public Integer getDurationInYears() {
        return this.durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You Can
     * Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to renew the domain for. The maximum number of years depends on the
     *        top-level domain. For the range of valid values for your domain, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/registrar-tld-list.html">Domains that You
     *        Can Register with Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.</p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewDomainRequest withDurationInYears(Integer durationInYears) {
        setDurationInYears(durationInYears);
        return this;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * 
     * @param currentExpiryYear
     *        The year when the registration for the domain is set to expire. This value must match the current
     *        expiration date for the domain.
     */

    public void setCurrentExpiryYear(Integer currentExpiryYear) {
        this.currentExpiryYear = currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * 
     * @return The year when the registration for the domain is set to expire. This value must match the current
     *         expiration date for the domain.
     */

    public Integer getCurrentExpiryYear() {
        return this.currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * 
     * @param currentExpiryYear
     *        The year when the registration for the domain is set to expire. This value must match the current
     *        expiration date for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewDomainRequest withCurrentExpiryYear(Integer currentExpiryYear) {
        setCurrentExpiryYear(currentExpiryYear);
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
        if (getDurationInYears() != null)
            sb.append("DurationInYears: ").append(getDurationInYears()).append(",");
        if (getCurrentExpiryYear() != null)
            sb.append("CurrentExpiryYear: ").append(getCurrentExpiryYear());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenewDomainRequest == false)
            return false;
        RenewDomainRequest other = (RenewDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDurationInYears() == null ^ this.getDurationInYears() == null)
            return false;
        if (other.getDurationInYears() != null && other.getDurationInYears().equals(this.getDurationInYears()) == false)
            return false;
        if (other.getCurrentExpiryYear() == null ^ this.getCurrentExpiryYear() == null)
            return false;
        if (other.getCurrentExpiryYear() != null && other.getCurrentExpiryYear().equals(this.getCurrentExpiryYear()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDurationInYears() == null) ? 0 : getDurationInYears().hashCode());
        hashCode = prime * hashCode + ((getCurrentExpiryYear() == null) ? 0 : getCurrentExpiryYear().hashCode());
        return hashCode;
    }

    @Override
    public RenewDomainRequest clone() {
        return (RenewDomainRequest) super.clone();
    }

}
