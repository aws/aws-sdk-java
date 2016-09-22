/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetDomainSuggestionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String domainName;

    private Integer suggestionCount;

    private Boolean onlyAvailable;

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * @param suggestionCount
     */

    public void setSuggestionCount(Integer suggestionCount) {
        this.suggestionCount = suggestionCount;
    }

    /**
     * @return
     */

    public Integer getSuggestionCount() {
        return this.suggestionCount;
    }

    /**
     * @param suggestionCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withSuggestionCount(Integer suggestionCount) {
        setSuggestionCount(suggestionCount);
        return this;
    }

    /**
     * @param onlyAvailable
     */

    public void setOnlyAvailable(Boolean onlyAvailable) {
        this.onlyAvailable = onlyAvailable;
    }

    /**
     * @return
     */

    public Boolean getOnlyAvailable() {
        return this.onlyAvailable;
    }

    /**
     * @param onlyAvailable
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainSuggestionsRequest withOnlyAvailable(Boolean onlyAvailable) {
        setOnlyAvailable(onlyAvailable);
        return this;
    }

    /**
     * @return
     */

    public Boolean isOnlyAvailable() {
        return this.onlyAvailable;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getSuggestionCount() != null)
            sb.append("SuggestionCount: " + getSuggestionCount() + ",");
        if (getOnlyAvailable() != null)
            sb.append("OnlyAvailable: " + getOnlyAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDomainSuggestionsRequest == false)
            return false;
        GetDomainSuggestionsRequest other = (GetDomainSuggestionsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSuggestionCount() == null ^ this.getSuggestionCount() == null)
            return false;
        if (other.getSuggestionCount() != null && other.getSuggestionCount().equals(this.getSuggestionCount()) == false)
            return false;
        if (other.getOnlyAvailable() == null ^ this.getOnlyAvailable() == null)
            return false;
        if (other.getOnlyAvailable() != null && other.getOnlyAvailable().equals(this.getOnlyAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSuggestionCount() == null) ? 0 : getSuggestionCount().hashCode());
        hashCode = prime * hashCode + ((getOnlyAvailable() == null) ? 0 : getOnlyAvailable().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainSuggestionsRequest clone() {
        return (GetDomainSuggestionsRequest) super.clone();
    }
}
