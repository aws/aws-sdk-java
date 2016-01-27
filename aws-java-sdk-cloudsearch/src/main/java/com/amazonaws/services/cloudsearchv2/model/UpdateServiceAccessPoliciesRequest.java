/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest) UpdateServiceAccessPolicies operation}.
 * <p>
 * Configures the access rules that control access to the domain's
 * document and search endpoints. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest)
 */
public class UpdateServiceAccessPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * The access rules you want to configure. These rules replace any
     * existing rules.
     */
    private String accessPolicies;

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceAccessPoliciesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The access rules you want to configure. These rules replace any
     * existing rules.
     *
     * @return The access rules you want to configure. These rules replace any
     *         existing rules.
     */
    public String getAccessPolicies() {
        return accessPolicies;
    }
    
    /**
     * The access rules you want to configure. These rules replace any
     * existing rules.
     *
     * @param accessPolicies The access rules you want to configure. These rules replace any
     *         existing rules.
     */
    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }
    
    /**
     * The access rules you want to configure. These rules replace any
     * existing rules.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessPolicies The access rules you want to configure. These rules replace any
     *         existing rules.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateServiceAccessPoliciesRequest withAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
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
        if (getAccessPolicies() != null) sb.append("AccessPolicies: " + getAccessPolicies() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateServiceAccessPoliciesRequest == false) return false;
        UpdateServiceAccessPoliciesRequest other = (UpdateServiceAccessPoliciesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null) return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateServiceAccessPoliciesRequest clone() {
        
            return (UpdateServiceAccessPoliciesRequest) super.clone();
    }

}
    