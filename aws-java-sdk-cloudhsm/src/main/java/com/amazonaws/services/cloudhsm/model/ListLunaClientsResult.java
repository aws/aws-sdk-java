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

/**
 * 
 */
public class ListLunaClientsResult implements Serializable {

    /**
     * The list of clients.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clientList;

    /**
     * If not null, more results are available. Pass this to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     */
    private String nextToken;

    /**
     * The list of clients.
     *
     * @return The list of clients.
     */
    public java.util.List<String> getClientList() {
        if (clientList == null) {
              clientList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clientList.setAutoConstruct(true);
        }
        return clientList;
    }
    
    /**
     * The list of clients.
     *
     * @param clientList The list of clients.
     */
    public void setClientList(java.util.Collection<String> clientList) {
        if (clientList == null) {
            this.clientList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clientListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientList.size());
        clientListCopy.addAll(clientList);
        this.clientList = clientListCopy;
    }
    
    /**
     * The list of clients.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientList The list of clients.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListLunaClientsResult withClientList(String... clientList) {
        if (getClientList() == null) setClientList(new java.util.ArrayList<String>(clientList.length));
        for (String value : clientList) {
            getClientList().add(value);
        }
        return this;
    }
    
    /**
     * The list of clients.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientList The list of clients.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListLunaClientsResult withClientList(java.util.Collection<String> clientList) {
        if (clientList == null) {
            this.clientList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clientListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clientList.size());
            clientListCopy.addAll(clientList);
            this.clientList = clientListCopy;
        }

        return this;
    }

    /**
     * If not null, more results are available. Pass this to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @return If not null, more results are available. Pass this to
     *         <a>ListLunaClients</a> to retrieve the next set of items.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this to
     *         <a>ListLunaClients</a> to retrieve the next set of items.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]*<br/>
     *
     * @param nextToken If not null, more results are available. Pass this to
     *         <a>ListLunaClients</a> to retrieve the next set of items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListLunaClientsResult withNextToken(String nextToken) {
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
        if (getClientList() != null) sb.append("ClientList: " + getClientList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListLunaClientsResult == false) return false;
        ListLunaClientsResult other = (ListLunaClientsResult)obj;
        
        if (other.getClientList() == null ^ this.getClientList() == null) return false;
        if (other.getClientList() != null && other.getClientList().equals(this.getClientList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    