/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#listLunaClients(ListLunaClientsRequest) ListLunaClients operation}.
 * <p>
 * Lists all of the clients.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <i>NextToken</i> member. If more results are available, the
 * <i>NextToken</i> member of the response contains a token that you pass
 * in the next call to ListLunaClients to retrieve the next set of items.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#listLunaClients(ListLunaClientsRequest)
 */
public class ListLunaClientsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The <i>NextToken</i> value from a previous call to
     * <a>ListLunaClients</a>. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     */
    private String nextToken;

    /**
     * The <i>NextToken</i> value from a previous call to
     * <a>ListLunaClients</a>. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @return The <i>NextToken</i> value from a previous call to
     *         <a>ListLunaClients</a>. Pass null if this is the first call.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <i>NextToken</i> value from a previous call to
     * <a>ListLunaClients</a>. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken The <i>NextToken</i> value from a previous call to
     *         <a>ListLunaClients</a>. Pass null if this is the first call.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <i>NextToken</i> value from a previous call to
     * <a>ListLunaClients</a>. Pass null if this is the first call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken The <i>NextToken</i> value from a previous call to
     *         <a>ListLunaClients</a>. Pass null if this is the first call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListLunaClientsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListLunaClientsRequest == false) return false;
        ListLunaClientsRequest other = (ListLunaClientsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListLunaClientsRequest clone() {
        
            return (ListLunaClientsRequest) super.clone();
    }

}
    