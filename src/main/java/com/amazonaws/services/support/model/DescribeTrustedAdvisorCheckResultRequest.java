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
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest) DescribeTrustedAdvisorCheckResult operation}.
 * <p>
 * Returns the results of the Trusted Advisor check that has the
 * specified check ID. Check IDs can be obtained by calling
 * DescribeTrustedAdvisorChecks.
 * </p>
 * <p>
 * The response contains a TrustedAdvisorCheckResult object, which
 * contains these three objects:
 * </p>
 * 
 * <ul>
 * <li> TrustedAdvisorCategorySpecificSummary </li>
 * <li> TrustedAdvisorResourceDetail </li>
 * <li> TrustedAdvisorResourcesSummary </li>
 * 
 * </ul>
 * <p>
 * In addition, the response contains these fields:
 * </p>
 * 
 * <ul>
 * <li> <b>Status.</b> The alert status of the check: "ok" (green),
 * "warning" (yellow), "error" (red), or "not_available".</li>
 * <li> <b>Timestamp.</b> The time of the last refresh of the
 * check.</li>
 * <li> <b>CheckId.</b> The unique identifier for the check.</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest)
 */
public class DescribeTrustedAdvisorCheckResultRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier for the Trusted Advisor check.
     */
    private String checkId;

    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     */
    private String language;

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
    public DescribeTrustedAdvisorCheckResultRequest withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     *
     * @return The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     *
     * @param language The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTrustedAdvisorCheckResultRequest withLanguage(String language) {
        this.language = language;
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
        if (getCheckId() != null) sb.append("CheckId: " + getCheckId() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckResultRequest == false) return false;
        DescribeTrustedAdvisorCheckResultRequest other = (DescribeTrustedAdvisorCheckResultRequest)obj;
        
        if (other.getCheckId() == null ^ this.getCheckId() == null) return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    