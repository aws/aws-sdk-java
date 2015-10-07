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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeComplianceByResourceResult implements Serializable, Cloneable {

    /**
     * Indicates whether the specified AWS resource complies with all of the
     * AWS Config rules that evaluate it.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource> complianceByResources;

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     */
    private String nextToken;

    /**
     * Indicates whether the specified AWS resource complies with all of the
     * AWS Config rules that evaluate it.
     *
     * @return Indicates whether the specified AWS resource complies with all of the
     *         AWS Config rules that evaluate it.
     */
    public java.util.List<ComplianceByResource> getComplianceByResources() {
        if (complianceByResources == null) {
              complianceByResources = new com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource>();
              complianceByResources.setAutoConstruct(true);
        }
        return complianceByResources;
    }
    
    /**
     * Indicates whether the specified AWS resource complies with all of the
     * AWS Config rules that evaluate it.
     *
     * @param complianceByResources Indicates whether the specified AWS resource complies with all of the
     *         AWS Config rules that evaluate it.
     */
    public void setComplianceByResources(java.util.Collection<ComplianceByResource> complianceByResources) {
        if (complianceByResources == null) {
            this.complianceByResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource> complianceByResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource>(complianceByResources.size());
        complianceByResourcesCopy.addAll(complianceByResources);
        this.complianceByResources = complianceByResourcesCopy;
    }
    
    /**
     * Indicates whether the specified AWS resource complies with all of the
     * AWS Config rules that evaluate it.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComplianceByResources(java.util.Collection)} or
     * {@link #withComplianceByResources(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complianceByResources Indicates whether the specified AWS resource complies with all of the
     *         AWS Config rules that evaluate it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceResult withComplianceByResources(ComplianceByResource... complianceByResources) {
        if (getComplianceByResources() == null) setComplianceByResources(new java.util.ArrayList<ComplianceByResource>(complianceByResources.length));
        for (ComplianceByResource value : complianceByResources) {
            getComplianceByResources().add(value);
        }
        return this;
    }
    
    /**
     * Indicates whether the specified AWS resource complies with all of the
     * AWS Config rules that evaluate it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complianceByResources Indicates whether the specified AWS resource complies with all of the
     *         AWS Config rules that evaluate it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceResult withComplianceByResources(java.util.Collection<ComplianceByResource> complianceByResources) {
        if (complianceByResources == null) {
            this.complianceByResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource> complianceByResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ComplianceByResource>(complianceByResources.size());
            complianceByResourcesCopy.addAll(complianceByResources);
            this.complianceByResources = complianceByResourcesCopy;
        }

        return this;
    }

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @return The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The string that you use in a subsequent request to get the next page
     *         of results in a paginated response.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeComplianceByResourceResult withNextToken(String nextToken) {
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
        if (getComplianceByResources() != null) sb.append("ComplianceByResources: " + getComplianceByResources() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComplianceByResources() == null) ? 0 : getComplianceByResources().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeComplianceByResourceResult == false) return false;
        DescribeComplianceByResourceResult other = (DescribeComplianceByResourceResult)obj;
        
        if (other.getComplianceByResources() == null ^ this.getComplianceByResources() == null) return false;
        if (other.getComplianceByResources() != null && other.getComplianceByResources().equals(this.getComplianceByResources()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeComplianceByResourceResult clone() {
        try {
            return (DescribeComplianceByResourceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    