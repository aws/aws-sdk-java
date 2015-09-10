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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful SimulatePrincipalPolicy or
 * SimulateCustomPolicy request.
 * </p>
 */
public class SimulatePrincipalPolicyResult implements Serializable, Cloneable {

    /**
     * The results of the simulation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult> evaluationResults;

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     */
    private Boolean isTruncated;

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * The results of the simulation.
     *
     * @return The results of the simulation.
     */
    public java.util.List<EvaluationResult> getEvaluationResults() {
        if (evaluationResults == null) {
              evaluationResults = new com.amazonaws.internal.ListWithAutoConstructFlag<EvaluationResult>();
              evaluationResults.setAutoConstruct(true);
        }
        return evaluationResults;
    }
    
    /**
     * The results of the simulation.
     *
     * @param evaluationResults The results of the simulation.
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
     * The results of the simulation.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEvaluationResults(java.util.Collection)} or
     * {@link #withEvaluationResults(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResults The results of the simulation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyResult withEvaluationResults(EvaluationResult... evaluationResults) {
        if (getEvaluationResults() == null) setEvaluationResults(new java.util.ArrayList<EvaluationResult>(evaluationResults.length));
        for (EvaluationResult value : evaluationResults) {
            getEvaluationResults().add(value);
        }
        return this;
    }
    
    /**
     * The results of the simulation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResults The results of the simulation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyResult withEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
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
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items. Note that IAM might return fewer than the <code>MaxItems</code>
     * number of results even when there are more results available. We
     * recommend that you check <code>IsTruncated</code> after every call to
     * ensure that you receive all of your results.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code>
     *         number of results even when there are more results available. We
     *         recommend that you check <code>IsTruncated</code> after every call to
     *         ensure that you receive all of your results.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SimulatePrincipalPolicyResult withMarker(String marker) {
        this.marker = marker;
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
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationResults() == null) ? 0 : getEvaluationResults().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SimulatePrincipalPolicyResult == false) return false;
        SimulatePrincipalPolicyResult other = (SimulatePrincipalPolicyResult)obj;
        
        if (other.getEvaluationResults() == null ^ this.getEvaluationResults() == null) return false;
        if (other.getEvaluationResults() != null && other.getEvaluationResults().equals(this.getEvaluationResults()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public SimulatePrincipalPolicyResult clone() {
        try {
            return (SimulatePrincipalPolicyResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    