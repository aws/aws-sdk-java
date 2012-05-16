/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * <p>
 * CloudFront automatically adds this element to the response only if
 * you've set up the distribution to serve private content with signed
 * URLs. The element lists the key pair IDs that CloudFront is aware of
 * for each trusted signer.
 * </p>
 */
public class ActiveTrustedSigners {

    /**
     * Each active trusted signer.
     */
    private java.util.List<Signer> signers;

    /**
     * Default constructor for a new ActiveTrustedSigners object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ActiveTrustedSigners() {}
    
    /**
     * Constructs a new ActiveTrustedSigners object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param signers Each active trusted signer.
     */
    public ActiveTrustedSigners(java.util.List<Signer> signers) {
        this.signers = signers;
    }

    
    
    /**
     * Each active trusted signer.
     *
     * @return Each active trusted signer.
     */
    public java.util.List<Signer> getSigners() {
        
        if (signers == null) {
            signers = new java.util.ArrayList<Signer>();
        }
        return signers;
    }
    
    /**
     * Each active trusted signer.
     *
     * @param signers Each active trusted signer.
     */
    public void setSigners(java.util.Collection<Signer> signers) {
        if (signers == null) {
            this.signers = null;
            return;
        }

        java.util.List<Signer> signersCopy = new java.util.ArrayList<Signer>(signers.size());
        signersCopy.addAll(signers);
        this.signers = signersCopy;
    }
    
    /**
     * Each active trusted signer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signers Each active trusted signer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ActiveTrustedSigners withSigners(Signer... signers) {
        if (getSigners() == null) setSigners(new java.util.ArrayList<Signer>(signers.length));
        for (Signer value : signers) {
            getSigners().add(value);
        }
        return this;
    }
    
    /**
     * Each active trusted signer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signers Each active trusted signer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ActiveTrustedSigners withSigners(java.util.Collection<Signer> signers) {
        if (signers == null) {
            this.signers = null;
        } else {
            java.util.List<Signer> signersCopy = new java.util.ArrayList<Signer>(signers.size());
            signersCopy.addAll(signers);
            this.signers = signersCopy;
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
        if (signers != null) sb.append("Signers: " + signers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSigners() == null) ? 0 : getSigners().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ActiveTrustedSigners == false) return false;
        ActiveTrustedSigners other = (ActiveTrustedSigners)obj;
        
        if (other.getSigners() == null ^ this.getSigners() == null) return false;
        if (other.getSigners() != null && other.getSigners().equals(this.getSigners()) == false) return false; 
        return true;
    }
    
}
    
