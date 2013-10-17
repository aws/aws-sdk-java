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
public class DescribeTrustedAdvisorCheckResultResult implements Serializable {

    /**
     * Returns a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     * title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     * object.
     */
    private TrustedAdvisorCheckResult result;

    /**
     * Returns a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     * title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     * object.
     *
     * @return Returns a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     *         title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     *         object.
     */
    public TrustedAdvisorCheckResult getResult() {
        return result;
    }
    
    /**
     * Returns a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     * title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     * object.
     *
     * @param result Returns a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     *         title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     *         object.
     */
    public void setResult(TrustedAdvisorCheckResult result) {
        this.result = result;
    }
    
    /**
     * Returns a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     * title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param result Returns a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckResult.html"
     *         title="TrustedAdvisorCheckResult">TrustedAdvisorCheckResult</a>
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckResultResult withResult(TrustedAdvisorCheckResult result) {
        this.result = result;
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
        if (getResult() != null) sb.append("Result: " + getResult() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckResultResult == false) return false;
        DescribeTrustedAdvisorCheckResultResult other = (DescribeTrustedAdvisorCheckResultResult)obj;
        
        if (other.getResult() == null ^ this.getResult() == null) return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false) return false; 
        return true;
    }
    
}
    