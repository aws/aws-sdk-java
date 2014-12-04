/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest) RefreshTrustedAdvisorCheck operation}.
 * <p>
 * Requests a refresh of the Trusted Advisor check that has the specified
 * check ID. Check IDs can be obtained by calling
 * DescribeTrustedAdvisorChecks.
 * </p>
 * <p>
 * The response contains a TrustedAdvisorCheckRefreshStatus object, which
 * contains these fields:
 * </p>
 * 
 * <ul>
 * <li> <b>Status.</b> The refresh status of the check: "none",
 * "enqueued", "processing", "success", or "abandoned".</li>
 * <li> <b>MillisUntilNextRefreshable.</b> The amount of time, in
 * milliseconds, until the check is eligible for refresh.</li>
 * <li> <b>CheckId.</b> The unique identifier for the check.</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.support.AWSSupport#refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest)
 */
public class RefreshTrustedAdvisorCheckRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier for the Trusted Advisor check.
     */
    private String checkId;

    /**
     * The unique identifier for the Trusted Advisor check.
     *
     * @return The unique identifier for the Trusted Advisor check.
     */
    public String getCheckId() {
        return checkId;
    }
    
    /**
     * The unique identifier for the Trusted Advisor check.
     *
     * @param checkId The unique identifier for the Trusted Advisor check.
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
    
    /**
     * The unique identifier for the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkId The unique identifier for the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RefreshTrustedAdvisorCheckRequest withCheckId(String checkId) {
        this.checkId = checkId;
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
        if (getCheckId() != null) sb.append("CheckId: " + getCheckId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RefreshTrustedAdvisorCheckRequest == false) return false;
        RefreshTrustedAdvisorCheckRequest other = (RefreshTrustedAdvisorCheckRequest)obj;
        
        if (other.getCheckId() == null ^ this.getCheckId() == null) return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false) return false; 
        return true;
    }
    
}
    