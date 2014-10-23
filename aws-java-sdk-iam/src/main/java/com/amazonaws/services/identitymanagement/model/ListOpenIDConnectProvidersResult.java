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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * ListOpenIDConnectProviders action.
 * </p>
 */
public class ListOpenIDConnectProvidersResult implements Serializable {

    /**
     * The list of IAM OpenID Connect providers in the AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry> openIDConnectProviderList;

    /**
     * The list of IAM OpenID Connect providers in the AWS account.
     *
     * @return The list of IAM OpenID Connect providers in the AWS account.
     */
    public java.util.List<OpenIDConnectProviderListEntry> getOpenIDConnectProviderList() {
        if (openIDConnectProviderList == null) {
              openIDConnectProviderList = new com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry>();
              openIDConnectProviderList.setAutoConstruct(true);
        }
        return openIDConnectProviderList;
    }
    
    /**
     * The list of IAM OpenID Connect providers in the AWS account.
     *
     * @param openIDConnectProviderList The list of IAM OpenID Connect providers in the AWS account.
     */
    public void setOpenIDConnectProviderList(java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        if (openIDConnectProviderList == null) {
            this.openIDConnectProviderList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry> openIDConnectProviderListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry>(openIDConnectProviderList.size());
        openIDConnectProviderListCopy.addAll(openIDConnectProviderList);
        this.openIDConnectProviderList = openIDConnectProviderListCopy;
    }
    
    /**
     * The list of IAM OpenID Connect providers in the AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIDConnectProviderList The list of IAM OpenID Connect providers in the AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(OpenIDConnectProviderListEntry... openIDConnectProviderList) {
        if (getOpenIDConnectProviderList() == null) setOpenIDConnectProviderList(new java.util.ArrayList<OpenIDConnectProviderListEntry>(openIDConnectProviderList.length));
        for (OpenIDConnectProviderListEntry value : openIDConnectProviderList) {
            getOpenIDConnectProviderList().add(value);
        }
        return this;
    }
    
    /**
     * The list of IAM OpenID Connect providers in the AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param openIDConnectProviderList The list of IAM OpenID Connect providers in the AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        if (openIDConnectProviderList == null) {
            this.openIDConnectProviderList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry> openIDConnectProviderListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OpenIDConnectProviderListEntry>(openIDConnectProviderList.size());
            openIDConnectProviderListCopy.addAll(openIDConnectProviderList);
            this.openIDConnectProviderList = openIDConnectProviderListCopy;
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
        if (getOpenIDConnectProviderList() != null) sb.append("OpenIDConnectProviderList: " + getOpenIDConnectProviderList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOpenIDConnectProviderList() == null) ? 0 : getOpenIDConnectProviderList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListOpenIDConnectProvidersResult == false) return false;
        ListOpenIDConnectProvidersResult other = (ListOpenIDConnectProvidersResult)obj;
        
        if (other.getOpenIDConnectProviderList() == null ^ this.getOpenIDConnectProviderList() == null) return false;
        if (other.getOpenIDConnectProviderList() != null && other.getOpenIDConnectProviderList().equals(this.getOpenIDConnectProviderList()) == false) return false; 
        return true;
    }
    
}
    