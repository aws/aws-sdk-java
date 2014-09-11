/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest) UpdateDomainContactPrivacy operation}.
 * <p>
 * This operation updates the specified domain contact's privacy setting.
 * When the privacy option is enabled, personal information such as
 * postal or email address is hidden from the results of a public WHOIS
 * query. The privacy services are provided by the AWS registrar, Gandi.
 * For more information, see the
 * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
 * .
 * </p>
 * <p>
 * This operation only affects the privacy of the specified contact type
 * (registrant, administrator, or tech). Successful acceptance returns an
 * operation ID that you can use with GetOperationDetail to track the
 * progress and completion of the action. If the request is not completed
 * successfully, the domain registrant will be notified by email.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#updateDomainContactPrivacy(UpdateDomainContactPrivacyRequest)
 */
public class UpdateDomainContactPrivacyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     */
    private Boolean adminPrivacy;

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     */
    private Boolean registrantPrivacy;

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     */
    private Boolean techPrivacy;

    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainContactPrivacyRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean isAdminPrivacy() {
        return adminPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @param adminPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public void setAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adminPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainContactPrivacyRequest withAdminPrivacy(Boolean adminPrivacy) {
        this.adminPrivacy = adminPrivacy;
        return this;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean getAdminPrivacy() {
        return adminPrivacy;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean isRegistrantPrivacy() {
        return registrantPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @param registrantPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public void setRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registrantPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainContactPrivacyRequest withRegistrantPrivacy(Boolean registrantPrivacy) {
        this.registrantPrivacy = registrantPrivacy;
        return this;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean getRegistrantPrivacy() {
        return registrantPrivacy;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean isTechPrivacy() {
        return techPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @param techPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public void setTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
    }
    
    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param techPrivacy Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainContactPrivacyRequest withTechPrivacy(Boolean techPrivacy) {
        this.techPrivacy = techPrivacy;
        return this;
    }

    /**
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     * values: <code>true</code> | <code>false</code> <p>Required: No
     *
     * @return Whether you want to conceal contact information from WHOIS queries. If
     *         you specify true, WHOIS ("who is") queries will return contact
     *         information for our registrar partner, Gandi, instead of the contact
     *         information that you enter. <p>Type: Boolean <p>Default: None <p>Valid
     *         values: <code>true</code> | <code>false</code> <p>Required: No
     */
    public Boolean getTechPrivacy() {
        return techPrivacy;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (isAdminPrivacy() != null) sb.append("AdminPrivacy: " + isAdminPrivacy() + ",");
        if (isRegistrantPrivacy() != null) sb.append("RegistrantPrivacy: " + isRegistrantPrivacy() + ",");
        if (isTechPrivacy() != null) sb.append("TechPrivacy: " + isTechPrivacy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((isAdminPrivacy() == null) ? 0 : isAdminPrivacy().hashCode()); 
        hashCode = prime * hashCode + ((isRegistrantPrivacy() == null) ? 0 : isRegistrantPrivacy().hashCode()); 
        hashCode = prime * hashCode + ((isTechPrivacy() == null) ? 0 : isTechPrivacy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDomainContactPrivacyRequest == false) return false;
        UpdateDomainContactPrivacyRequest other = (UpdateDomainContactPrivacyRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.isAdminPrivacy() == null ^ this.isAdminPrivacy() == null) return false;
        if (other.isAdminPrivacy() != null && other.isAdminPrivacy().equals(this.isAdminPrivacy()) == false) return false; 
        if (other.isRegistrantPrivacy() == null ^ this.isRegistrantPrivacy() == null) return false;
        if (other.isRegistrantPrivacy() != null && other.isRegistrantPrivacy().equals(this.isRegistrantPrivacy()) == false) return false; 
        if (other.isTechPrivacy() == null ^ this.isTechPrivacy() == null) return false;
        if (other.isTechPrivacy() != null && other.isTechPrivacy().equals(this.isTechPrivacy()) == false) return false; 
        return true;
    }
    
}
    