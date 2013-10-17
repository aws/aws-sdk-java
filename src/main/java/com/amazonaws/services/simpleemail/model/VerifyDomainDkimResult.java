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


/**
 * <p>
 * Represents the DNS records that must be published in the domain name's DNS to complete DKIM setup.
 * </p>
 */
public class VerifyDomainDkimResult implements Serializable {

    /**
     * A set of DNS records (tokens) that must be published in the domain
     * name's DNS for DKIM verification to complete, and which must remain
     * published in order for DKIM signing to succeed. The tokens are CNAME
     * DNS records pointing to DKIM public keys hosted by Amazon SES.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dkimTokens;

    /**
     * A set of DNS records (tokens) that must be published in the domain
     * name's DNS for DKIM verification to complete, and which must remain
     * published in order for DKIM signing to succeed. The tokens are CNAME
     * DNS records pointing to DKIM public keys hosted by Amazon SES.
     *
     * @return A set of DNS records (tokens) that must be published in the domain
     *         name's DNS for DKIM verification to complete, and which must remain
     *         published in order for DKIM signing to succeed. The tokens are CNAME
     *         DNS records pointing to DKIM public keys hosted by Amazon SES.
     */
    public java.util.List<String> getDkimTokens() {
        if (dkimTokens == null) {
              dkimTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dkimTokens.setAutoConstruct(true);
        }
        return dkimTokens;
    }
    
    /**
     * A set of DNS records (tokens) that must be published in the domain
     * name's DNS for DKIM verification to complete, and which must remain
     * published in order for DKIM signing to succeed. The tokens are CNAME
     * DNS records pointing to DKIM public keys hosted by Amazon SES.
     *
     * @param dkimTokens A set of DNS records (tokens) that must be published in the domain
     *         name's DNS for DKIM verification to complete, and which must remain
     *         published in order for DKIM signing to succeed. The tokens are CNAME
     *         DNS records pointing to DKIM public keys hosted by Amazon SES.
     */
    public void setDkimTokens(java.util.Collection<String> dkimTokens) {
        if (dkimTokens == null) {
            this.dkimTokens = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dkimTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dkimTokens.size());
        dkimTokensCopy.addAll(dkimTokens);
        this.dkimTokens = dkimTokensCopy;
    }
    
    /**
     * A set of DNS records (tokens) that must be published in the domain
     * name's DNS for DKIM verification to complete, and which must remain
     * published in order for DKIM signing to succeed. The tokens are CNAME
     * DNS records pointing to DKIM public keys hosted by Amazon SES.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dkimTokens A set of DNS records (tokens) that must be published in the domain
     *         name's DNS for DKIM verification to complete, and which must remain
     *         published in order for DKIM signing to succeed. The tokens are CNAME
     *         DNS records pointing to DKIM public keys hosted by Amazon SES.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VerifyDomainDkimResult withDkimTokens(String... dkimTokens) {
        if (getDkimTokens() == null) setDkimTokens(new java.util.ArrayList<String>(dkimTokens.length));
        for (String value : dkimTokens) {
            getDkimTokens().add(value);
        }
        return this;
    }
    
    /**
     * A set of DNS records (tokens) that must be published in the domain
     * name's DNS for DKIM verification to complete, and which must remain
     * published in order for DKIM signing to succeed. The tokens are CNAME
     * DNS records pointing to DKIM public keys hosted by Amazon SES.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dkimTokens A set of DNS records (tokens) that must be published in the domain
     *         name's DNS for DKIM verification to complete, and which must remain
     *         published in order for DKIM signing to succeed. The tokens are CNAME
     *         DNS records pointing to DKIM public keys hosted by Amazon SES.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VerifyDomainDkimResult withDkimTokens(java.util.Collection<String> dkimTokens) {
        if (dkimTokens == null) {
            this.dkimTokens = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dkimTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dkimTokens.size());
            dkimTokensCopy.addAll(dkimTokens);
            this.dkimTokens = dkimTokensCopy;
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
        if (getDkimTokens() != null) sb.append("DkimTokens: " + getDkimTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDkimTokens() == null) ? 0 : getDkimTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VerifyDomainDkimResult == false) return false;
        VerifyDomainDkimResult other = (VerifyDomainDkimResult)obj;
        
        if (other.getDkimTokens() == null ^ this.getDkimTokens() == null) return false;
        if (other.getDkimTokens() != null && other.getDkimTokens().equals(this.getDkimTokens()) == false) return false; 
        return true;
    }
    
}
    