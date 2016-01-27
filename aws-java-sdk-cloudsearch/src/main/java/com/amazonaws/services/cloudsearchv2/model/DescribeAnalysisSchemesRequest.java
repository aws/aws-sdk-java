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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeAnalysisSchemes(DescribeAnalysisSchemesRequest) DescribeAnalysisSchemes operation}.
 * <p>
 * Gets the analysis schemes configured for a domain. An analysis scheme
 * defines language-specific text processing options for a
 * <code>text</code> field. Can be limited to specific analysis schemes
 * by name. By default, shows all analysis schemes and includes any
 * pending changes to the configuration. Set the <code>Deployed</code>
 * option to <code>true</code> to show the active configuration and
 * exclude pending changes. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeAnalysisSchemes(DescribeAnalysisSchemesRequest)
 */
public class DescribeAnalysisSchemesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the domain you want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * The analysis schemes you want to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> analysisSchemeNames;

    /**
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     */
    private Boolean deployed;

    /**
     * The name of the domain you want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return The name of the domain you want to describe.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain you want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName The name of the domain you want to describe.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain you want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName The name of the domain you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The analysis schemes you want to describe.
     *
     * @return The analysis schemes you want to describe.
     */
    public java.util.List<String> getAnalysisSchemeNames() {
        if (analysisSchemeNames == null) {
              analysisSchemeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              analysisSchemeNames.setAutoConstruct(true);
        }
        return analysisSchemeNames;
    }
    
    /**
     * The analysis schemes you want to describe.
     *
     * @param analysisSchemeNames The analysis schemes you want to describe.
     */
    public void setAnalysisSchemeNames(java.util.Collection<String> analysisSchemeNames) {
        if (analysisSchemeNames == null) {
            this.analysisSchemeNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> analysisSchemeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(analysisSchemeNames.size());
        analysisSchemeNamesCopy.addAll(analysisSchemeNames);
        this.analysisSchemeNames = analysisSchemeNamesCopy;
    }
    
    /**
     * The analysis schemes you want to describe.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAnalysisSchemeNames(java.util.Collection)} or
     * {@link #withAnalysisSchemeNames(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisSchemeNames The analysis schemes you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesRequest withAnalysisSchemeNames(String... analysisSchemeNames) {
        if (getAnalysisSchemeNames() == null) setAnalysisSchemeNames(new java.util.ArrayList<String>(analysisSchemeNames.length));
        for (String value : analysisSchemeNames) {
            getAnalysisSchemeNames().add(value);
        }
        return this;
    }
    
    /**
     * The analysis schemes you want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param analysisSchemeNames The analysis schemes you want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesRequest withAnalysisSchemeNames(java.util.Collection<String> analysisSchemeNames) {
        if (analysisSchemeNames == null) {
            this.analysisSchemeNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> analysisSchemeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(analysisSchemeNames.size());
            analysisSchemeNamesCopy.addAll(analysisSchemeNames);
            this.analysisSchemeNames = analysisSchemeNamesCopy;
        }

        return this;
    }

    /**
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     *
     * @return Whether to display the deployed configuration (<code>true</code>) or
     *         include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     */
    public Boolean isDeployed() {
        return deployed;
    }
    
    /**
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     *
     * @param deployed Whether to display the deployed configuration (<code>true</code>) or
     *         include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     */
    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }
    
    /**
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployed Whether to display the deployed configuration (<code>true</code>) or
     *         include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAnalysisSchemesRequest withDeployed(Boolean deployed) {
        this.deployed = deployed;
        return this;
    }

    /**
     * Whether to display the deployed configuration (<code>true</code>) or
     * include any pending changes (<code>false</code>). Defaults to
     * <code>false</code>.
     *
     * @return Whether to display the deployed configuration (<code>true</code>) or
     *         include any pending changes (<code>false</code>). Defaults to
     *         <code>false</code>.
     */
    public Boolean getDeployed() {
        return deployed;
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
        if (getAnalysisSchemeNames() != null) sb.append("AnalysisSchemeNames: " + getAnalysisSchemeNames() + ",");
        if (isDeployed() != null) sb.append("Deployed: " + isDeployed() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getAnalysisSchemeNames() == null) ? 0 : getAnalysisSchemeNames().hashCode()); 
        hashCode = prime * hashCode + ((isDeployed() == null) ? 0 : isDeployed().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAnalysisSchemesRequest == false) return false;
        DescribeAnalysisSchemesRequest other = (DescribeAnalysisSchemesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getAnalysisSchemeNames() == null ^ this.getAnalysisSchemeNames() == null) return false;
        if (other.getAnalysisSchemeNames() != null && other.getAnalysisSchemeNames().equals(this.getAnalysisSchemeNames()) == false) return false; 
        if (other.isDeployed() == null ^ this.isDeployed() == null) return false;
        if (other.isDeployed() != null && other.isDeployed().equals(this.isDeployed()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAnalysisSchemesRequest clone() {
        
            return (DescribeAnalysisSchemesRequest) super.clone();
    }

}
    