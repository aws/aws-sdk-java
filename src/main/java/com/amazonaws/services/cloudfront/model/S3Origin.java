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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
 * </p>
 */
public class S3Origin implements Serializable {

    /**
     * The DNS name of the S3 origin.
     */
    private String domainName;

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
     * @param domainName The DNS name of the S3 origin.
     */
    public S3Origin(String domainName) {
        setDomainName(domainName);
    }

    /**
     * Constructs a new S3Origin object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The DNS name of the S3 origin.
     * @param originAccessIdentity Your S3 origin's origin access identity.
     */
    public S3Origin(String domainName, String originAccessIdentity) {
        setDomainName(domainName);
        setOriginAccessIdentity(originAccessIdentity);
    }

    /**
     * The DNS name of the S3 origin.
     *
     * @return The DNS name of the S3 origin.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The DNS name of the S3 origin.
     *
     * @param domainName The DNS name of the S3 origin.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The DNS name of the S3 origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The DNS name of the S3 origin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public S3Origin withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getOriginAccessIdentity() != null) sb.append("OriginAccessIdentity: " + getOriginAccessIdentity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getOriginAccessIdentity() == null) ? 0 : getOriginAccessIdentity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Origin == false) return false;
        S3Origin other = (S3Origin)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getOriginAccessIdentity() == null ^ this.getOriginAccessIdentity() == null) return false;
        if (other.getOriginAccessIdentity() != null && other.getOriginAccessIdentity().equals(this.getOriginAccessIdentity()) == false) return false; 
        return true;
    }
    
}
    