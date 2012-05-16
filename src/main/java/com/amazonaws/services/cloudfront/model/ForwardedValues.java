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
package com.amazonaws.services.cloudfront.model;

/**
 * <p>
 * A complex type that specifies how CloudFront handles query strings.
 * </p>
 */
public class ForwardedValues {

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify
     * true; if not, specify false.
     */
    private Boolean queryString;

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify
     * true; if not, specify false.
     *
     * @return Indicates whether you want CloudFront to forward query strings to the
     *         origin that is associated with this cache behavior. If so, specify
     *         true; if not, specify false.
     */
    public Boolean isQueryString() {
        return queryString;
    }
    
    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify
     * true; if not, specify false.
     *
     * @param queryString Indicates whether you want CloudFront to forward query strings to the
     *         origin that is associated with this cache behavior. If so, specify
     *         true; if not, specify false.
     */
    public void setQueryString(Boolean queryString) {
        this.queryString = queryString;
    }
    
    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify
     * true; if not, specify false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param queryString Indicates whether you want CloudFront to forward query strings to the
     *         origin that is associated with this cache behavior. If so, specify
     *         true; if not, specify false.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ForwardedValues withQueryString(Boolean queryString) {
        this.queryString = queryString;
        return this;
    }
    
    
    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify
     * true; if not, specify false.
     *
     * @return Indicates whether you want CloudFront to forward query strings to the
     *         origin that is associated with this cache behavior. If so, specify
     *         true; if not, specify false.
     */
    public Boolean getQueryString() {
        return queryString;
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
        if (queryString != null) sb.append("QueryString: " + queryString + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isQueryString() == null) ? 0 : isQueryString().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ForwardedValues == false) return false;
        ForwardedValues other = (ForwardedValues)obj;
        
        if (other.isQueryString() == null ^ this.isQueryString() == null) return false;
        if (other.isQueryString() != null && other.isQueryString().equals(this.isQueryString()) == false) return false; 
        return true;
    }
    
}
    