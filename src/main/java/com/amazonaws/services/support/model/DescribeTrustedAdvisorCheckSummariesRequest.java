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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest) DescribeTrustedAdvisorCheckSummaries operation}.
 * <p>
 * This action enables you to get the latest summaries for Trusted Advisor checks that you specify in your request. You submit the list of Trusted
 * Advisor checks for which you want summaries. You obtain these <i>CheckIds</i> by submitting a DescribeTrustedAdvisorChecks request.
 * </p>
 * <p>
 * The response body contains an array of TrustedAdvisorCheckSummary objects.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest)
 */
public class DescribeTrustedAdvisorCheckSummariesRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * Unique identifier for a Trusted Advisor check.
     */
    private java.util.List<String> checkIds;

    /**
     * Unique identifier for a Trusted Advisor check.
     *
     * @return Unique identifier for a Trusted Advisor check.
     */
    public java.util.List<String> getCheckIds() {
        
        if (checkIds == null) {
            checkIds = new java.util.ArrayList<String>();
        }
        return checkIds;
    }
    
    /**
     * Unique identifier for a Trusted Advisor check.
     *
     * @param checkIds Unique identifier for a Trusted Advisor check.
     */
    public void setCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
            return;
        }

        java.util.List<String> checkIdsCopy = new java.util.ArrayList<String>(checkIds.size());
        checkIdsCopy.addAll(checkIds);
        this.checkIds = checkIdsCopy;
    }
    
    /**
     * Unique identifier for a Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkIds Unique identifier for a Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTrustedAdvisorCheckSummariesRequest withCheckIds(String... checkIds) {
        if (getCheckIds() == null) setCheckIds(new java.util.ArrayList<String>(checkIds.length));
        for (String value : checkIds) {
            getCheckIds().add(value);
        }
        return this;
    }
    
    /**
     * Unique identifier for a Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkIds Unique identifier for a Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTrustedAdvisorCheckSummariesRequest withCheckIds(java.util.Collection<String> checkIds) {
        if (checkIds == null) {
            this.checkIds = null;
        } else {
            java.util.List<String> checkIdsCopy = new java.util.ArrayList<String>(checkIds.size());
            checkIdsCopy.addAll(checkIds);
            this.checkIds = checkIdsCopy;
        }

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
        if (getCheckIds() != null) sb.append("CheckIds: " + getCheckIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckIds() == null) ? 0 : getCheckIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckSummariesRequest == false) return false;
        DescribeTrustedAdvisorCheckSummariesRequest other = (DescribeTrustedAdvisorCheckSummariesRequest)obj;
        
        if (other.getCheckIds() == null ^ this.getCheckIds() == null) return false;
        if (other.getCheckIds() != null && other.getCheckIds().equals(this.getCheckIds()) == false) return false; 
        return true;
    }
    
}
    