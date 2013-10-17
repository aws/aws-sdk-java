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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateSynonymOptions(UpdateSynonymOptionsRequest) UpdateSynonymOptions operation}.
 * <p>
 * Configures a synonym dictionary for the search domain. The synonym dictionary is used during indexing to configure mappings for terms that occur in
 * text fields. The maximum size of the synonym dictionary is 100 KB.
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateSynonymOptions(UpdateSynonymOptionsRequest)
 */
public class UpdateSynonymOptionsRequest extends AmazonWebServiceRequest implements Serializable {

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
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     */
    private String synonyms;

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
    public UpdateSynonymOptionsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     *
     * @return Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     */
    public String getSynonyms() {
        return synonyms;
    }
    
    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     *
     * @param synonyms Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     */
    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }
    
    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param synonyms Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100 KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateSynonymOptionsRequest withSynonyms(String synonyms) {
        this.synonyms = synonyms;
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
        if (getSynonyms() != null) sb.append("Synonyms: " + getSynonyms() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSynonymOptionsRequest == false) return false;
        UpdateSynonymOptionsRequest other = (UpdateSynonymOptionsRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getSynonyms() == null ^ this.getSynonyms() == null) return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false) return false; 
        return true;
    }
    
}
    