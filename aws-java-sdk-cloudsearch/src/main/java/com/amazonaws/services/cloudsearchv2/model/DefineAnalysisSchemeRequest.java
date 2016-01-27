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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineAnalysisScheme(DefineAnalysisSchemeRequest) DefineAnalysisScheme operation}.
 * <p>
 * Configures an analysis scheme that can be applied to a
 * <code>text</code> or <code>text-array</code> field to define
 * language-specific text processing options. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#defineAnalysisScheme(DefineAnalysisSchemeRequest)
 */
public class DefineAnalysisSchemeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Configuration information for an analysis scheme. Each analysis scheme
     * has a unique name and specifies the language of the text to be
     * processed. The following options can be configured for an analysis
     * scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     * <code>StemmingDictionary</code>,
     * <code>JapaneseTokenizationDictionary</code> and
     * <code>AlgorithmicStemming</code>.
     */
    private AnalysisScheme analysisScheme;

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
    public DefineAnalysisSchemeRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Configuration information for an analysis scheme. Each analysis scheme
     * has a unique name and specifies the language of the text to be
     * processed. The following options can be configured for an analysis
     * scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     * <code>StemmingDictionary</code>,
     * <code>JapaneseTokenizationDictionary</code> and
     * <code>AlgorithmicStemming</code>.
     *
     * @return Configuration information for an analysis scheme. Each analysis scheme
     *         has a unique name and specifies the language of the text to be
     *         processed. The following options can be configured for an analysis
     *         scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     *         <code>StemmingDictionary</code>,
     *         <code>JapaneseTokenizationDictionary</code> and
     *         <code>AlgorithmicStemming</code>.
     */
    public AnalysisScheme getAnalysisScheme() {
        return analysisScheme;
    }
    
    /**
     * Configuration information for an analysis scheme. Each analysis scheme
     * has a unique name and specifies the language of the text to be
     * processed. The following options can be configured for an analysis
     * scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     * <code>StemmingDictionary</code>,
     * <code>JapaneseTokenizationDictionary</code> and
     * <code>AlgorithmicStemming</code>.
     *
     * @param analysisScheme Configuration information for an analysis scheme. Each analysis scheme
     *         has a unique name and specifies the language of the text to be
     *         processed. The following options can be configured for an analysis
     *         scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     *         <code>StemmingDictionary</code>,
     *         <code>JapaneseTokenizationDictionary</code> and
     *         <code>AlgorithmicStemming</code>.
     */
    public void setAnalysisScheme(AnalysisScheme analysisScheme) {
        this.analysisScheme = analysisScheme;
    }
    
    /**
     * Configuration information for an analysis scheme. Each analysis scheme
     * has a unique name and specifies the language of the text to be
     * processed. The following options can be configured for an analysis
     * scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     * <code>StemmingDictionary</code>,
     * <code>JapaneseTokenizationDictionary</code> and
     * <code>AlgorithmicStemming</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisScheme Configuration information for an analysis scheme. Each analysis scheme
     *         has a unique name and specifies the language of the text to be
     *         processed. The following options can be configured for an analysis
     *         scheme: <code>Synonyms</code>, <code>Stopwords</code>,
     *         <code>StemmingDictionary</code>,
     *         <code>JapaneseTokenizationDictionary</code> and
     *         <code>AlgorithmicStemming</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DefineAnalysisSchemeRequest withAnalysisScheme(AnalysisScheme analysisScheme) {
        this.analysisScheme = analysisScheme;
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
        if (getAnalysisScheme() != null) sb.append("AnalysisScheme: " + getAnalysisScheme() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisScheme() == null) ? 0 : getAnalysisScheme().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefineAnalysisSchemeRequest == false) return false;
        DefineAnalysisSchemeRequest other = (DefineAnalysisSchemeRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getAnalysisScheme() == null ^ this.getAnalysisScheme() == null) return false;
        if (other.getAnalysisScheme() != null && other.getAnalysisScheme().equals(this.getAnalysisScheme()) == false) return false; 
        return true;
    }
    
    @Override
    public DefineAnalysisSchemeRequest clone() {
        
            return (DefineAnalysisSchemeRequest) super.clone();
    }

}
    