/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A response message that contains the status of one or more domains.
 * </p>
 */
public class DescribeDomainsResult implements Serializable {

    /**
     * The current status of all of your search domains.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus> domainStatusList;

    /**
     * The current status of all of your search domains.
     *
     * @return The current status of all of your search domains.
     */
    public java.util.List<DomainStatus> getDomainStatusList() {
        if (domainStatusList == null) {
              domainStatusList = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainStatus>();
              domainStatusList.setAutoConstruct(true);
        }
        return domainStatusList;
    }
    
    /**
     * The current status of all of your search domains.
     *
     * @param domainStatusList The current status of all of your search domains.
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
     * The current status of all of your search domains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainStatusList The current status of all of your search domains.
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
     * The current status of all of your search domains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainStatusList The current status of all of your search domains.
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
    
}
    