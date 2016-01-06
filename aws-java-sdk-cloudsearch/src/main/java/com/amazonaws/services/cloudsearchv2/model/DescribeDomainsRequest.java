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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeDomains(DescribeDomainsRequest) DescribeDomains operation}.
 * <p>
 * Gets information about the search domains owned by this account. Can
 * be limited to specific domains. Shows all domains by default. To get
 * the number of searchable documents in a domain, use the console or
 * submit a <code>matchall</code> request to your domain's search
 * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
 * more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeDomains(DescribeDomainsRequest)
 */
public class DescribeDomainsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The names of the domains you want to include in the response.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNames;

    /**
     * The names of the domains you want to include in the response.
     *
     * @return The names of the domains you want to include in the response.
     */
    public java.util.List<String> getDomainNames() {
        if (domainNames == null) {
              domainNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              domainNames.setAutoConstruct(true);
        }
        return domainNames;
    }
    
    /**
     * The names of the domains you want to include in the response.
     *
     * @param domainNames The names of the domains you want to include in the response.
     */
    public void setDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domainNames.size());
        domainNamesCopy.addAll(domainNames);
        this.domainNames = domainNamesCopy;
    }
    
    /**
     * The names of the domains you want to include in the response.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDomainNames(java.util.Collection)} or {@link
     * #withDomainNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames The names of the domains you want to include in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDomainsRequest withDomainNames(String... domainNames) {
        if (getDomainNames() == null) setDomainNames(new java.util.ArrayList<String>(domainNames.length));
        for (String value : domainNames) {
            getDomainNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the domains you want to include in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames The names of the domains you want to include in the response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDomainsRequest withDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domainNames.size());
            domainNamesCopy.addAll(domainNames);
            this.domainNames = domainNamesCopy;
        }

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
        if (getDomainNames() != null) sb.append("DomainNames: " + getDomainNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDomainsRequest == false) return false;
        DescribeDomainsRequest other = (DescribeDomainsRequest)obj;
        
        if (other.getDomainNames() == null ^ this.getDomainNames() == null) return false;
        if (other.getDomainNames() != null && other.getDomainNames().equals(this.getDomainNames()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDomainsRequest clone() {
        
            return (DescribeDomainsRequest) super.clone();
    }

}
    