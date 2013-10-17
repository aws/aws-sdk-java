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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest) DescribeTrustedAdvisorCheckResult operation}.
 * <p>
 * This action responds with the results of a Trusted Advisor check. Once you have obtained the list of available Trusted Advisor checks by calling <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"> DescribeTrustedAdvisorChecks </a> , you
 * specify the <i>CheckId</i> for the check you want to retrieve from AWS Support.
 * </p>
 * <p>
 * The response for this action contains a JSON-formatted <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckResultResult.html"> TrustedAdvisorCheckResult </a>
 * object
 * </p>
 * <p>
 * , which is a container for the following three objects:
 * </p>
 * <p>
 * </p>
 * <ol> <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
 * TrustedAdvisorCategorySpecificSummary </a> </li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html"> TrustedAdvisorResourceDetail </a>
 * </li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html"> TrustedAdvisorResourcesSummary </a>
 * </li>
 * </ol> <p>
 * In addition, the response contains the following fields:
 * </p>
 * <ol> <li> <b>Status</b> . Overall status of the check.</li>
 * <li> <b>Timestamp</b> . Time at which Trusted Advisor last ran the check. </li>
 * <li> <b>CheckId</b> . Unique identifier for the specific check returned by the request.</li>
 * </ol>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest)
 */
public class DescribeTrustedAdvisorCheckResultRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * 
     */
    private String checkId;

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     */
    private String language;

    /**
     * 
     *
     * @return 
     */
    public String getCheckId() {
        return checkId;
    }
    
    /**
     * 
     *
     * @param checkId 
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckResultRequest withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @return Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
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
    