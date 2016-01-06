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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest) DescribeServiceAccessPolicies operation}.
 * <p>
 * Gets information about the access policies that control access to the
 * domain's document and search endpoints. By default, shows the
 * configuration with any pending changes. Set the <code>Deployed</code>
 * option to <code>true</code> to show the active configuration and
 * exclude pending changes. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest)
 */
public class DescribeServiceAccessPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the domain you want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

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
    public DescribeServiceAccessPoliciesRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
    public DescribeServiceAccessPoliciesRequest withDeployed(Boolean deployed) {
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
        if (isDeployed() != null) sb.append("Deployed: " + isDeployed() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((isDeployed() == null) ? 0 : isDeployed().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServiceAccessPoliciesRequest == false) return false;
        DescribeServiceAccessPoliciesRequest other = (DescribeServiceAccessPoliciesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.isDeployed() == null ^ this.isDeployed() == null) return false;
        if (other.isDeployed() != null && other.isDeployed().equals(this.isDeployed()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeServiceAccessPoliciesRequest clone() {
        
            return (DescribeServiceAccessPoliciesRequest) super.clone();
    }

}
    