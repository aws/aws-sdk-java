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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest) GetIdentityVerificationAttributes operation}.
 * <p>
 * Given a list of identities (email addresses and/or domains), returns the verification status and (for domain identities) the verification token for
 * each identity.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#getIdentityVerificationAttributes(GetIdentityVerificationAttributesRequest)
 */
public class GetIdentityVerificationAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of identities.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> identities;

    /**
     * A list of identities.
     *
     * @return A list of identities.
     */
    public java.util.List<String> getIdentities() {
        if (identities == null) {
              identities = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              identities.setAutoConstruct(true);
        }
        return identities;
    }
    
    /**
     * A list of identities.
     *
     * @param identities A list of identities.
     */
    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(identities.size());
        identitiesCopy.addAll(identities);
        this.identities = identitiesCopy;
    }
    
    /**
     * A list of identities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities A list of identities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetIdentityVerificationAttributesRequest withIdentities(String... identities) {
        if (getIdentities() == null) setIdentities(new java.util.ArrayList<String>(identities.length));
        for (String value : identities) {
            getIdentities().add(value);
        }
        return this;
    }
    
    /**
     * A list of identities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identities A list of identities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetIdentityVerificationAttributesRequest withIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> identitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(identities.size());
            identitiesCopy.addAll(identities);
            this.identities = identitiesCopy;
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
        if (getIdentities() != null) sb.append("Identities: " + getIdentities() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityVerificationAttributesRequest == false) return false;
        GetIdentityVerificationAttributesRequest other = (GetIdentityVerificationAttributesRequest)obj;
        
        if (other.getIdentities() == null ^ this.getIdentities() == null) return false;
        if (other.getIdentities() != null && other.getIdentities().equals(this.getIdentities()) == false) return false; 
        return true;
    }
    
}
    