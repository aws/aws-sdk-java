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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Contains a paginated collection of DomainInfo structures.
 * </p>
 */
public class DomainInfos implements Serializable {

    /**
     * A list of DomainInfo structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo> domainInfos;

    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * A list of DomainInfo structures.
     *
     * @return A list of DomainInfo structures.
     */
    public java.util.List<DomainInfo> getDomainInfos() {
        if (domainInfos == null) {
              domainInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo>();
              domainInfos.setAutoConstruct(true);
        }
        return domainInfos;
    }
    
    /**
     * A list of DomainInfo structures.
     *
     * @param domainInfos A list of DomainInfo structures.
     */
    public void setDomainInfos(java.util.Collection<DomainInfo> domainInfos) {
        if (domainInfos == null) {
            this.domainInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo> domainInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo>(domainInfos.size());
        domainInfosCopy.addAll(domainInfos);
        this.domainInfos = domainInfosCopy;
    }
    
    /**
     * A list of DomainInfo structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainInfos A list of DomainInfo structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainInfos withDomainInfos(DomainInfo... domainInfos) {
        if (getDomainInfos() == null) setDomainInfos(new java.util.ArrayList<DomainInfo>(domainInfos.length));
        for (DomainInfo value : domainInfos) {
            getDomainInfos().add(value);
        }
        return this;
    }
    
    /**
     * A list of DomainInfo structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainInfos A list of DomainInfo structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainInfos withDomainInfos(java.util.Collection<DomainInfo> domainInfos) {
        if (domainInfos == null) {
            this.domainInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo> domainInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainInfo>(domainInfos.size());
            domainInfosCopy.addAll(domainInfos);
            this.domainInfos = domainInfosCopy;
        }

        return this;
    }

    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * Returns a value if the results are paginated. To get the next page of
     * results, repeat the request specifying this token and all other
     * arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken Returns a value if the results are paginated. To get the next page of
     *         results, repeat the request specifying this token and all other
     *         arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DomainInfos withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getDomainInfos() != null) sb.append("DomainInfos: " + getDomainInfos() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainInfos() == null) ? 0 : getDomainInfos().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DomainInfos == false) return false;
        DomainInfos other = (DomainInfos)obj;
        
        if (other.getDomainInfos() == null ^ this.getDomainInfos() == null) return false;
        if (other.getDomainInfos() != null && other.getDomainInfos().equals(this.getDomainInfos()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    