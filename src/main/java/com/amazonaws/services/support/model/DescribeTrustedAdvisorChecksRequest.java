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
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest) DescribeTrustedAdvisorChecks operation}.
 * <p>
 * Returns information about all available Trusted Advisor checks,
 * including name, ID, category, description, and metadata. You must
 * specify a language code; English ("en") and Japanese ("ja") are
 * currently supported. The response contains a
 * TrustedAdvisorCheckDescription for each check.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest)
 */
public class DescribeTrustedAdvisorChecksRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     */
    private String language;

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
    public DescribeTrustedAdvisorChecksRequest withLanguage(String language) {
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
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorChecksRequest == false) return false;
        DescribeTrustedAdvisorChecksRequest other = (DescribeTrustedAdvisorChecksRequest)obj;
        
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    