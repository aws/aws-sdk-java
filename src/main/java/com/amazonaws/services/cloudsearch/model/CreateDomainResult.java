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
 * A response message that contains the status of a newly created domain.
 * </p>
 */
public class CreateDomainResult implements Serializable {

    /**
     * The current status of the search domain.
     */
    private DomainStatus domainStatus;

    /**
     * The current status of the search domain.
     *
     * @return The current status of the search domain.
     */
    public DomainStatus getDomainStatus() {
        return domainStatus;
    }
    
    /**
     * The current status of the search domain.
     *
     * @param domainStatus The current status of the search domain.
     */
    public void setDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus;
    }
    
    /**
     * The current status of the search domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainStatus The current status of the search domain.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDomainResult withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus;
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
        if (getDomainStatus() != null) sb.append("DomainStatus: " + getDomainStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDomainResult == false) return false;
        CreateDomainResult other = (CreateDomainResult)obj;
        
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null) return false;
        if (other.getDomainStatus() != null && other.getDomainStatus().equals(this.getDomainStatus()) == false) return false; 
        return true;
    }
    
}
    