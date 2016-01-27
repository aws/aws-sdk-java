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

/**
 * <p>
 * The result of a <code>DescribeDomains</code> request. Contains the
 * status of the domains specified in the request or all domains owned by
 * the account.
 * </p>
 */
public class DescribeDomainsResult implements Serializable, Cloneable {

    /**
     * A list that contains the status of each requested domain.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus> domainStatusList;

    /**
     * A list that contains the status of each requested domain.
     *
     * @return A list that contains the status of each requested domain.
     */
    public java.util.List<DomainStatus> getDomainStatusList() {
        if (domainStatusList == null) {
              domainStatusList = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus>();
              domainStatusList.setAutoConstruct(true);
        }
        return domainStatusList;
    }
    
    /**
     * A list that contains the status of each requested domain.
     *
     * @param domainStatusList A list that contains the status of each requested domain.
     */
    public void setDomainStatusList(java.util.Collection<DomainStatus> domainStatusList) {
        if (domainStatusList == null) {
            this.domainStatusList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus> domainStatusListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus>(domainStatusList.size());
        domainStatusListCopy.addAll(domainStatusList);
        this.domainStatusList = domainStatusListCopy;
    }
    
    /**
     * A list that contains the status of each requested domain.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDomainStatusList(java.util.Collection)} or {@link
     * #withDomainStatusList(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainStatusList A list that contains the status of each requested domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDomainsResult withDomainStatusList(DomainStatus... domainStatusList) {
        if (getDomainStatusList() == null) setDomainStatusList(new java.util.ArrayList<DomainStatus>(domainStatusList.length));
        for (DomainStatus value : domainStatusList) {
            getDomainStatusList().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains the status of each requested domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainStatusList A list that contains the status of each requested domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDomainsResult withDomainStatusList(java.util.Collection<DomainStatus> domainStatusList) {
        if (domainStatusList == null) {
            this.domainStatusList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus> domainStatusListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus>(domainStatusList.size());
            domainStatusListCopy.addAll(domainStatusList);
            this.domainStatusList = domainStatusListCopy;
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
        if (getDomainStatusList() != null) sb.append("DomainStatusList: " + getDomainStatusList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainStatusList() == null) ? 0 : getDomainStatusList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDomainsResult == false) return false;
        DescribeDomainsResult other = (DescribeDomainsResult)obj;
        
        if (other.getDomainStatusList() == null ^ this.getDomainStatusList() == null) return false;
        if (other.getDomainStatusList() != null && other.getDomainStatusList().equals(this.getDomainStatusList()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDomainsResult clone() {
        try {
            return (DescribeDomainsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    