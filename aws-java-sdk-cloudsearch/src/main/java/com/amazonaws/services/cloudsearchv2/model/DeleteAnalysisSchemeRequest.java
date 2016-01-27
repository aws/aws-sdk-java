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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#deleteAnalysisScheme(DeleteAnalysisSchemeRequest) DeleteAnalysisScheme operation}.
 * <p>
 * Deletes an analysis scheme. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#deleteAnalysisScheme(DeleteAnalysisSchemeRequest)
 */
public class DeleteAnalysisSchemeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of the analysis scheme you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     */
    private String analysisSchemeName;

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
    public DeleteAnalysisSchemeRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The name of the analysis scheme you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @return The name of the analysis scheme you want to delete.
     */
    public String getAnalysisSchemeName() {
        return analysisSchemeName;
    }
    
    /**
     * The name of the analysis scheme you want to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param analysisSchemeName The name of the analysis scheme you want to delete.
     */
    public void setAnalysisSchemeName(String analysisSchemeName) {
        this.analysisSchemeName = analysisSchemeName;
    }
    
    /**
     * The name of the analysis scheme you want to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-z][a-z0-9_]*<br/>
     *
     * @param analysisSchemeName The name of the analysis scheme you want to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteAnalysisSchemeRequest withAnalysisSchemeName(String analysisSchemeName) {
        this.analysisSchemeName = analysisSchemeName;
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
        if (getAnalysisSchemeName() != null) sb.append("AnalysisSchemeName: " + getAnalysisSchemeName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisSchemeName() == null) ? 0 : getAnalysisSchemeName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteAnalysisSchemeRequest == false) return false;
        DeleteAnalysisSchemeRequest other = (DeleteAnalysisSchemeRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getAnalysisSchemeName() == null ^ this.getAnalysisSchemeName() == null) return false;
        if (other.getAnalysisSchemeName() != null && other.getAnalysisSchemeName().equals(this.getAnalysisSchemeName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteAnalysisSchemeRequest clone() {
        
            return (DeleteAnalysisSchemeRequest) super.clone();
    }

}
    