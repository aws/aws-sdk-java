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
public class GetComplianceDetailsByResourceResult implements Serializable, Cloneable {

    /**
     * Indicates whether the specified AWS resource complies each AWS Config
     * rule.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult> evaluationResults;

    /**
     * The string that you use in a subsequent request to get the next page
     * of results in a paginated response.
     */
    private String nextToken;

    /**
     * Indicates whether the specified AWS resource complies each AWS Config
     * rule.
     *
     * @return Indicates whether the specified AWS resource complies each AWS Config
     *         rule.
     */
    public java.util.List<EvaluationResult> getEvaluationResults() {
        if (evaluationResults == null) {
              evaluationResults = new com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult>();
              evaluationResults.setAutoConstruct(true);
        }
        return evaluationResults;
    }
    
    /**
     * Indicates whether the specified AWS resource complies each AWS Config
     * rule.
     *
     * @param evaluationResults Indicates whether the specified AWS resource complies each AWS Config
     *         rule.
     */
    public void setEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        if (evaluationResults == null) {
            this.evaluationResults = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult> evaluationResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult>(evaluationResults.size());
        evaluationResultsCopy.addAll(evaluationResults);
        this.evaluationResults = evaluationResultsCopy;
    }
    
    /**
     * Indicates whether the specified AWS resource complies each AWS Config
     * rule.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEvaluationResults(java.util.Collection)} or
     * {@link #withEvaluationResults(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResults Indicates whether the specified AWS resource complies each AWS Config
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByResourceResult withEvaluationResults(EvaluationResult... evaluationResults) {
        if (getEvaluationResults() == null) setEvaluationResults(new java.util.ArrayList<EvaluationResult>(evaluationResults.length));
        for (EvaluationResult value : evaluationResults) {
            getEvaluationResults().add(value);
        }
        return this;
    }
    
    /**
     * Indicates whether the specified AWS resource complies each AWS Config
     * rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResults Indicates whether the specified AWS resource complies each AWS Config
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceDetailsByResourceResult withEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        if (evaluationResults == null) {
            this.evaluationResults = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult> evaluationResultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult>(evaluationResults.size());
            evaluationResultsCopy.addAll(evaluationResults);
            this.evaluationResults = evaluationResultsCopy;
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
    public GetComplianceDetailsByResourceResult withNextToken(String nextToken) {
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
        if (getEvaluationResults() != null) sb.append("EvaluationResults: " + getEvaluationResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationResults() == null) ? 0 : getEvaluationResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetComplianceDetailsByResourceResult == false) return false;
        GetComplianceDetailsByResourceResult other = (GetComplianceDetailsByResourceResult)obj;
        
        if (other.getEvaluationResults() == null ^ this.getEvaluationResults() == null) return false;
        if (other.getEvaluationResults() != null && other.getEvaluationResults().equals(this.getEvaluationResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public GetComplianceDetailsByResourceResult clone() {
        try {
            return (GetComplianceDetailsByResourceResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    