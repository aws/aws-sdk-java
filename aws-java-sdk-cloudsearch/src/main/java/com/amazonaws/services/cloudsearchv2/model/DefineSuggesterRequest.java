/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineSuggester(DefineSuggesterRequest) DefineSuggester operation}.
 * <p>
 * Configures a suggester for a domain. A suggester enables you to
 * display possible matches before users finish typing their queries.
 * When you configure a suggester, you must specify the name of the text
 * field you want to search for possible matches and a unique name for
 * the suggester. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineSuggester(DefineSuggesterRequest)
 */
public class DefineSuggesterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * Configuration information for a search suggester. Each suggester has a
     * unique name and specifies the text field you want to use for
     * suggestions. The following options can be configured for a suggester:
     * <code>FuzzyMatching</code>, <code>SortExpression</code>.
     */
    private Suggester suggester;

    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names are unique
     * across the domains owned by an account within an AWS region. Domain
     * names start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names are unique
     *         across the domains owned by an account within an AWS region. Domain
     *         names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefineSuggesterRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Configuration information for a search suggester. Each suggester has a
     * unique name and specifies the text field you want to use for
     * suggestions. The following options can be configured for a suggester:
     * <code>FuzzyMatching</code>, <code>SortExpression</code>.
     *
     * @return Configuration information for a search suggester. Each suggester has a
     *         unique name and specifies the text field you want to use for
     *         suggestions. The following options can be configured for a suggester:
     *         <code>FuzzyMatching</code>, <code>SortExpression</code>.
     */
    public Suggester getSuggester() {
        return suggester;
    }
    
    /**
     * Configuration information for a search suggester. Each suggester has a
     * unique name and specifies the text field you want to use for
     * suggestions. The following options can be configured for a suggester:
     * <code>FuzzyMatching</code>, <code>SortExpression</code>.
     *
     * @param suggester Configuration information for a search suggester. Each suggester has a
     *         unique name and specifies the text field you want to use for
     *         suggestions. The following options can be configured for a suggester:
     *         <code>FuzzyMatching</code>, <code>SortExpression</code>.
     */
    public void setSuggester(Suggester suggester) {
        this.suggester = suggester;
    }
    
    /**
     * Configuration information for a search suggester. Each suggester has a
     * unique name and specifies the text field you want to use for
     * suggestions. The following options can be configured for a suggester:
     * <code>FuzzyMatching</code>, <code>SortExpression</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggester Configuration information for a search suggester. Each suggester has a
     *         unique name and specifies the text field you want to use for
     *         suggestions. The following options can be configured for a suggester:
     *         <code>FuzzyMatching</code>, <code>SortExpression</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefineSuggesterRequest withSuggester(Suggester suggester) {
        this.suggester = suggester;
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
        if (getSuggester() != null) sb.append("Suggester: " + getSuggester() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getSuggester() == null) ? 0 : getSuggester().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefineSuggesterRequest == false) return false;
        DefineSuggesterRequest other = (DefineSuggesterRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getSuggester() == null ^ this.getSuggester() == null) return false;
        if (other.getSuggester() != null && other.getSuggester().equals(this.getSuggester()) == false) return false; 
        return true;
    }
    
    @Override
    public DefineSuggesterRequest clone() {
        
            return (DefineSuggesterRequest) super.clone();
    }

}
    