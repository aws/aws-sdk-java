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
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class ResolveCaseResult implements Serializable {

    /**
     * Status of the case when the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was sent.
     */
    private String initialCaseStatus;

    /**
     * Status of the case after the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was processed.
     */
    private String finalCaseStatus;

    /**
     * Status of the case when the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was sent.
     *
     * @return Status of the case when the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was sent.
     */
    public String getInitialCaseStatus() {
        return initialCaseStatus;
    }
    
    /**
     * Status of the case when the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was sent.
     *
     * @param initialCaseStatus Status of the case when the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was sent.
     */
    public void setInitialCaseStatus(String initialCaseStatus) {
        this.initialCaseStatus = initialCaseStatus;
    }
    
    /**
     * Status of the case when the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was sent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initialCaseStatus Status of the case when the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was sent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResolveCaseResult withInitialCaseStatus(String initialCaseStatus) {
        this.initialCaseStatus = initialCaseStatus;
        return this;
    }

    /**
     * Status of the case after the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was processed.
     *
     * @return Status of the case after the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was processed.
     */
    public String getFinalCaseStatus() {
        return finalCaseStatus;
    }
    
    /**
     * Status of the case after the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was processed.
     *
     * @param finalCaseStatus Status of the case after the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was processed.
     */
    public void setFinalCaseStatus(String finalCaseStatus) {
        this.finalCaseStatus = finalCaseStatus;
    }
    
    /**
     * Status of the case after the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     * title="ResolveCase">ResolveCase</a> request was processed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalCaseStatus Status of the case after the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"
     *         title="ResolveCase">ResolveCase</a> request was processed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResolveCaseResult withFinalCaseStatus(String finalCaseStatus) {
        this.finalCaseStatus = finalCaseStatus;
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
        if (getInitialCaseStatus() != null) sb.append("InitialCaseStatus: " + getInitialCaseStatus() + ",");
        if (getFinalCaseStatus() != null) sb.append("FinalCaseStatus: " + getFinalCaseStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInitialCaseStatus() == null) ? 0 : getInitialCaseStatus().hashCode()); 
        hashCode = prime * hashCode + ((getFinalCaseStatus() == null) ? 0 : getFinalCaseStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResolveCaseResult == false) return false;
        ResolveCaseResult other = (ResolveCaseResult)obj;
        
        if (other.getInitialCaseStatus() == null ^ this.getInitialCaseStatus() == null) return false;
        if (other.getInitialCaseStatus() != null && other.getInitialCaseStatus().equals(this.getInitialCaseStatus()) == false) return false; 
        if (other.getFinalCaseStatus() == null ^ this.getFinalCaseStatus() == null) return false;
        if (other.getFinalCaseStatus() != null && other.getFinalCaseStatus().equals(this.getFinalCaseStatus()) == false) return false; 
        return true;
    }
    
}
    