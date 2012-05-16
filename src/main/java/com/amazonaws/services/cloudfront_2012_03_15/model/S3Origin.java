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
 * Your S3 origin bucket.
 * </p>
 */
public class S3Origin {

    /**
     * The DNS name of the S3 origin.
     */
    private String dNSName;

    /**
     * Your S3 origin's origin access identity.
     */
    private String originAccessIdentity;

    /**
     * Default constructor for a new S3Origin object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public S3Origin() {}
    
    /**
     * Constructs a new S3Origin object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dNSName The DNS name of the S3 origin.
     */
    public S3Origin(String dNSName) {
        this.dNSName = dNSName;
    }

    
    
    /**
     * Constructs a new S3Origin object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dNSName The DNS name of the S3 origin.
     * @param originAccessIdentity Your S3 origin's origin access identity.
     */
    public S3Origin(String dNSName, String originAccessIdentity) {
        this.dNSName = dNSName;
        this.originAccessIdentity = originAccessIdentity;
    }

    
    
    /**
     * The DNS name of the S3 origin.
     *
     * @return The DNS name of the S3 origin.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * The DNS name of the S3 origin.
     *
     * @param dNSName The DNS name of the S3 origin.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * The DNS name of the S3 origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName The DNS name of the S3 origin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public S3Origin withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }
    
    
    /**
     * Your S3 origin's origin access identity.
     *
     * @return Your S3 origin's origin access identity.
     */
    public String getOriginAccessIdentity() {
        return originAccessIdentity;
    }
    
    /**
     * Your S3 origin's origin access identity.
     *
     * @param originAccessIdentity Your S3 origin's origin access identity.
     */
    public void setOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }
    
    /**
     * Your S3 origin's origin access identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param originAccessIdentity Your S3 origin's origin access identity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public S3Origin withOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
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
        if (dNSName != null) sb.append("DNSName: " + dNSName + ", ");
        if (originAccessIdentity != null) sb.append("OriginAccessIdentity: " + originAccessIdentity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode()); 
        hashCode = prime * hashCode + ((getOriginAccessIdentity() == null) ? 0 : getOriginAccessIdentity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof S3Origin == false) return false;
        S3Origin other = (S3Origin)obj;
        
        if (other.getDNSName() == null ^ this.getDNSName() == null) return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false) return false; 
        if (other.getOriginAccessIdentity() == null ^ this.getOriginAccessIdentity() == null) return false;
        if (other.getOriginAccessIdentity() != null && other.getOriginAccessIdentity().equals(this.getOriginAccessIdentity()) == false) return false; 
        return true;
    }
    
}
    
