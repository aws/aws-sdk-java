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
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * Returns an array of <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"> CaseDetails </a> objects and a
 * <i>NextToken</i> that defines a point for pagination in the result set.
 * </p>
 */
public class DescribeCasesResult implements Serializable {

    /**
     * Array of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * title="CaseDetails">CaseDetails</a> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails> cases;

    /**
     * Defines a resumption point for pagination.
     */
    private String nextToken;

    /**
     * Array of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * title="CaseDetails">CaseDetails</a> objects.
     *
     * @return Array of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     *         title="CaseDetails">CaseDetails</a> objects.
     */
    public java.util.List<CaseDetails> getCases() {
        if (cases == null) {
              cases = new com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails>();
              cases.setAutoConstruct(true);
        }
        return cases;
    }
    
    /**
     * Array of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * title="CaseDetails">CaseDetails</a> objects.
     *
     * @param cases Array of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     *         title="CaseDetails">CaseDetails</a> objects.
     */
    public void setCases(java.util.Collection<CaseDetails> cases) {
        if (cases == null) {
            this.cases = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails> casesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails>(cases.size());
        casesCopy.addAll(cases);
        this.cases = casesCopy;
    }
    
    /**
     * Array of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * title="CaseDetails">CaseDetails</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cases Array of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     *         title="CaseDetails">CaseDetails</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesResult withCases(CaseDetails... cases) {
        if (getCases() == null) setCases(new java.util.ArrayList<CaseDetails>(cases.length));
        for (CaseDetails value : cases) {
            getCases().add(value);
        }
        return this;
    }
    
    /**
     * Array of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     * title="CaseDetails">CaseDetails</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cases Array of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html"
     *         title="CaseDetails">CaseDetails</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesResult withCases(java.util.Collection<CaseDetails> cases) {
        if (cases == null) {
            this.cases = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails> casesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaseDetails>(cases.size());
            casesCopy.addAll(cases);
            this.cases = casesCopy;
        }

        return this;
    }

    /**
     * Defines a resumption point for pagination.
     *
     * @return Defines a resumption point for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     *
     * @param nextToken Defines a resumption point for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Defines a resumption point for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCasesResult withNextToken(String nextToken) {
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
        if (getCases() != null) sb.append("Cases: " + getCases() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCases() == null) ? 0 : getCases().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCasesResult == false) return false;
        DescribeCasesResult other = (DescribeCasesResult)obj;
        
        if (other.getCases() == null ^ this.getCases() == null) return false;
        if (other.getCases() != null && other.getCases().equals(this.getCases()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    