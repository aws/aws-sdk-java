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
 * The UpdateDomainContactPrivacy request includes the following elements.
 * </p>
 */
public class UpdateDomainContactPrivacyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean adminPrivacy;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean registrantPrivacy;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean techPrivacy;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Internationalized Domain Names are not supported.
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactPrivacyRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param adminPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getAdminPrivacy() {
        return this.adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param adminPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactPrivacyRequest withAdminPrivacy(Boolean adminPrivacy) {
        setAdminPrivacy(adminPrivacy);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isAdminPrivacy() {
        return this.adminPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param registrantPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getRegistrantPrivacy() {
        return this.registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param registrantPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactPrivacyRequest withRegistrantPrivacy(Boolean registrantPrivacy) {
        setRegistrantPrivacy(registrantPrivacy);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isRegistrantPrivacy() {
        return this.registrantPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param techPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getTechPrivacy() {
        return this.techPrivacy;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param techPrivacy
     *        Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *        queries will return contact information for our registrar partner, Gandi, instead of the contact
     *        information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainContactPrivacyRequest withTechPrivacy(Boolean techPrivacy) {
        setTechPrivacy(techPrivacy);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is") queries
     * will return contact information for our registrar partner, Gandi, instead of the contact information that you
     * enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS queries. If you specify true, WHOIS ("who is")
     *         queries will return contact information for our registrar partner, Gandi, instead of the contact
     *         information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isTechPrivacy() {
        return this.techPrivacy;
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
        if (getAdminPrivacy() != null)
            sb.append("AdminPrivacy: " + getAdminPrivacy() + ",");
        if (getRegistrantPrivacy() != null)
            sb.append("RegistrantPrivacy: " + getRegistrantPrivacy() + ",");
        if (getTechPrivacy() != null)
            sb.append("TechPrivacy: " + getTechPrivacy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainContactPrivacyRequest == false)
            return false;
        UpdateDomainContactPrivacyRequest other = (UpdateDomainContactPrivacyRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAdminPrivacy() == null ^ this.getAdminPrivacy() == null)
            return false;
        if (other.getAdminPrivacy() != null && other.getAdminPrivacy().equals(this.getAdminPrivacy()) == false)
            return false;
        if (other.getRegistrantPrivacy() == null ^ this.getRegistrantPrivacy() == null)
            return false;
        if (other.getRegistrantPrivacy() != null && other.getRegistrantPrivacy().equals(this.getRegistrantPrivacy()) == false)
            return false;
        if (other.getTechPrivacy() == null ^ this.getTechPrivacy() == null)
            return false;
        if (other.getTechPrivacy() != null && other.getTechPrivacy().equals(this.getTechPrivacy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAdminPrivacy() == null) ? 0 : getAdminPrivacy().hashCode());
        hashCode = prime * hashCode + ((getRegistrantPrivacy() == null) ? 0 : getRegistrantPrivacy().hashCode());
        hashCode = prime * hashCode + ((getTechPrivacy() == null) ? 0 : getTechPrivacy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainContactPrivacyRequest clone() {
        return (UpdateDomainContactPrivacyRequest) super.clone();
    }
}
