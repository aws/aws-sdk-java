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
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#checkDomainAvailability(CheckDomainAvailabilityRequest) CheckDomainAvailability operation}.
 * <p>
 * This operation checks the availability of one domain name. You can
 * access this API without authenticating. Note that if the availability
 * status of a domain is pending, you must submit another request to
 * determine the availability of the domain name.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#checkDomainAvailability(CheckDomainAvailabilityRequest)
 */
public class CheckDomainAvailabilityRequest extends AmazonWebServiceRequest implements Serializable {

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
     * Reserved for future use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     */
    private String idnLangCode;

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
    public CheckDomainAvailabilityRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Reserved for future use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return Reserved for future use.
     */
    public String getIdnLangCode() {
        return idnLangCode;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param idnLangCode Reserved for future use.
     */
    public void setIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param idnLangCode Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CheckDomainAvailabilityRequest withIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
        return this;
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
        if (getIdnLangCode() != null) sb.append("IdnLangCode: " + getIdnLangCode() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CheckDomainAvailabilityRequest == false) return false;
        CheckDomainAvailabilityRequest other = (CheckDomainAvailabilityRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getIdnLangCode() == null ^ this.getIdnLangCode() == null) return false;
        if (other.getIdnLangCode() != null && other.getIdnLangCode().equals(this.getIdnLangCode()) == false) return false; 
        return true;
    }
    
}
    