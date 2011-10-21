/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

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
        java.util.List<Signer> signersCopy = new java.util.ArrayList<Signer>();
        if (signers != null) {
            signersCopy.addAll(signers);
        }
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
        if (getSigners() == null) setSigners(new java.util.ArrayList<Signer>());
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
        java.util.List<Signer> signersCopy = new java.util.ArrayList<Signer>();
        if (signers != null) {
            signersCopy.addAll(signers);
        }
        this.signers = signersCopy;

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
        sb.append("Signers: " + signers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    