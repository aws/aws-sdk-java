/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A <code>RenewDomain</code> request includes the number of years that you want to renew for and the current expiration
 * year.
 * </p>
 */
public class RenewDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;
    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with Amazon Route
     * 53</a> in the Amazon Route 53 documentation.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Integer durationInYears;
    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Integer
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private Integer currentExpiryYear;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
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
     * href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with Amazon Route
     * 53</a> in the Amazon Route 53 documentation.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to renew the domain for. The maximum number of years depends on the
     *        top-level domain. For the range of valid values for your domain, see <a
     *        href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with
     *        Amazon Route 53</a> in the Amazon Route 53 documentation.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: Integer from 1 to 10
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with Amazon Route
     * 53</a> in the Amazon Route 53 documentation.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return The number of years that you want to renew the domain for. The maximum number of years depends on the
     *         top-level domain. For the range of valid values for your domain, see <a
     *         href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with
     *         Amazon Route 53</a> in the Amazon Route 53 documentation.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid values: Integer from 1 to 10
     *         </p>
     *         <p>
     *         Required: No
     */

    public Integer getDurationInYears() {
        return this.durationInYears;
    }

    /**
     * <p>
     * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level
     * domain. For the range of valid values for your domain, see <a
     * href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with Amazon Route
     * 53</a> in the Amazon Route 53 documentation.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param durationInYears
     *        The number of years that you want to renew the domain for. The maximum number of years depends on the
     *        top-level domain. For the range of valid values for your domain, see <a
     *        href="http://docs.aws.amazon.com/console/route53/domain-tld-list">Domains that You Can Register with
     *        Amazon Route 53</a> in the Amazon Route 53 documentation.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: Integer from 1 to 10
     *        </p>
     *        <p>
     *        Required: No
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
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Integer
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param currentExpiryYear
     *        The year when the registration for the domain is set to expire. This value must match the current
     *        expiration date for the domain.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Integer
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setCurrentExpiryYear(Integer currentExpiryYear) {
        this.currentExpiryYear = currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Integer
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The year when the registration for the domain is set to expire. This value must match the current
     *         expiration date for the domain.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: Integer
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public Integer getCurrentExpiryYear() {
        return this.currentExpiryYear;
    }

    /**
     * <p>
     * The year when the registration for the domain is set to expire. This value must match the current expiration date
     * for the domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: Integer
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param currentExpiryYear
     *        The year when the registration for the domain is set to expire. This value must match the current
     *        expiration date for the domain.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: Integer
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RenewDomainRequest withCurrentExpiryYear(Integer currentExpiryYear) {
        setCurrentExpiryYear(currentExpiryYear);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDurationInYears() != null)
            sb.append("DurationInYears: " + getDurationInYears() + ",");
        if (getCurrentExpiryYear() != null)
            sb.append("CurrentExpiryYear: " + getCurrentExpiryYear());
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
