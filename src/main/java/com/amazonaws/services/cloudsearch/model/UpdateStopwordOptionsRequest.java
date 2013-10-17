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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateStopwordOptions(UpdateStopwordOptionsRequest) UpdateStopwordOptions operation}.
 * <p>
 * Configures stopwords for the search domain. Stopwords are used during indexing and when processing search requests. The maximum size of the stopwords
 * dictionary is 10 KB.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateStopwordOptions(UpdateStopwordOptionsRequest)
 */
public class UpdateStopwordOptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * Lists stopwords serialized as a JSON document. The document has a
     * single object with one property "stopwords" whose value is an array of
     * strings. The maximum size of a stopwords document is 10 KB. Example:
     * <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     */
    private String stopwords;

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateStopwordOptionsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Lists stopwords serialized as a JSON document. The document has a
     * single object with one property "stopwords" whose value is an array of
     * strings. The maximum size of a stopwords document is 10 KB. Example:
     * <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     *
     * @return Lists stopwords serialized as a JSON document. The document has a
     *         single object with one property "stopwords" whose value is an array of
     *         strings. The maximum size of a stopwords document is 10 KB. Example:
     *         <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     */
    public String getStopwords() {
        return stopwords;
    }
    
    /**
     * Lists stopwords serialized as a JSON document. The document has a
     * single object with one property "stopwords" whose value is an array of
     * strings. The maximum size of a stopwords document is 10 KB. Example:
     * <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     *
     * @param stopwords Lists stopwords serialized as a JSON document. The document has a
     *         single object with one property "stopwords" whose value is an array of
     *         strings. The maximum size of a stopwords document is 10 KB. Example:
     *         <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     */
    public void setStopwords(String stopwords) {
        this.stopwords = stopwords;
    }
    
    /**
     * Lists stopwords serialized as a JSON document. The document has a
     * single object with one property "stopwords" whose value is an array of
     * strings. The maximum size of a stopwords document is 10 KB. Example:
     * <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopwords Lists stopwords serialized as a JSON document. The document has a
     *         single object with one property "stopwords" whose value is an array of
     *         strings. The maximum size of a stopwords document is 10 KB. Example:
     *         <code>{ "stopwords": ["a", "an", "the", "of"] }</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateStopwordOptionsRequest withStopwords(String stopwords) {
        this.stopwords = stopwords;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getStopwords() != null) sb.append("Stopwords: " + getStopwords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getStopwords() == null) ? 0 : getStopwords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateStopwordOptionsRequest == false) return false;
        UpdateStopwordOptionsRequest other = (UpdateStopwordOptionsRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getStopwords() == null ^ this.getStopwords() == null) return false;
        if (other.getStopwords() != null && other.getStopwords().equals(this.getStopwords()) == false) return false; 
        return true;
    }
    
}
    