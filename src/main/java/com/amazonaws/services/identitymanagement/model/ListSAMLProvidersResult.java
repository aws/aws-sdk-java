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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the ListSAMLProviders action.
 * </p>
 */
public class ListSAMLProvidersResult implements Serializable {

    /**
     * The list of SAML providers for this account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry> sAMLProviderList;

    /**
     * The list of SAML providers for this account.
     *
     * @return The list of SAML providers for this account.
     */
    public java.util.List<SAMLProviderListEntry> getSAMLProviderList() {
        if (sAMLProviderList == null) {
              sAMLProviderList = new com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry>();
              sAMLProviderList.setAutoConstruct(true);
        }
        return sAMLProviderList;
    }
    
    /**
     * The list of SAML providers for this account.
     *
     * @param sAMLProviderList The list of SAML providers for this account.
     */
    public void setSAMLProviderList(java.util.Collection<SAMLProviderListEntry> sAMLProviderList) {
        if (sAMLProviderList == null) {
            this.sAMLProviderList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry> sAMLProviderListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry>(sAMLProviderList.size());
        sAMLProviderListCopy.addAll(sAMLProviderList);
        this.sAMLProviderList = sAMLProviderListCopy;
    }
    
    /**
     * The list of SAML providers for this account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sAMLProviderList The list of SAML providers for this account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSAMLProvidersResult withSAMLProviderList(SAMLProviderListEntry... sAMLProviderList) {
        if (getSAMLProviderList() == null) setSAMLProviderList(new java.util.ArrayList<SAMLProviderListEntry>(sAMLProviderList.length));
        for (SAMLProviderListEntry value : sAMLProviderList) {
            getSAMLProviderList().add(value);
        }
        return this;
    }
    
    /**
     * The list of SAML providers for this account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sAMLProviderList The list of SAML providers for this account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSAMLProvidersResult withSAMLProviderList(java.util.Collection<SAMLProviderListEntry> sAMLProviderList) {
        if (sAMLProviderList == null) {
            this.sAMLProviderList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry> sAMLProviderListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SAMLProviderListEntry>(sAMLProviderList.size());
            sAMLProviderListCopy.addAll(sAMLProviderList);
            this.sAMLProviderList = sAMLProviderListCopy;
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
        if (getSAMLProviderList() != null) sb.append("SAMLProviderList: " + getSAMLProviderList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSAMLProviderList() == null) ? 0 : getSAMLProviderList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSAMLProvidersResult == false) return false;
        ListSAMLProvidersResult other = (ListSAMLProvidersResult)obj;
        
        if (other.getSAMLProviderList() == null ^ this.getSAMLProviderList() == null) return false;
        if (other.getSAMLProviderList() != null && other.getSAMLProviderList().equals(this.getSAMLProviderList()) == false) return false; 
        return true;
    }
    
}
    