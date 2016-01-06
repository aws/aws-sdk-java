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
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#updateScalingParameters(UpdateScalingParametersRequest) UpdateScalingParameters operation}.
 * <p>
 * Configures scaling parameters for a domain. A domain's scaling
 * parameters specify the desired search instance type and replication
 * count. Amazon CloudSearch will still automatically scale your domain
 * based on the volume of data and traffic, but not below the desired
 * instance type and replication count. If the Multi-AZ option is
 * enabled, these values control the resources used per Availability
 * Zone. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchv2.AmazonCloudSearch#updateScalingParameters(UpdateScalingParametersRequest)
 */
public class UpdateScalingParametersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The desired instance type and desired number of replicas of each index
     * partition.
     */
    private ScalingParameters scalingParameters;

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
    public UpdateScalingParametersRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     *
     * @return The desired instance type and desired number of replicas of each index
     *         partition.
     */
    public ScalingParameters getScalingParameters() {
        return scalingParameters;
    }
    
    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     *
     * @param scalingParameters The desired instance type and desired number of replicas of each index
     *         partition.
     */
    public void setScalingParameters(ScalingParameters scalingParameters) {
        this.scalingParameters = scalingParameters;
    }
    
    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingParameters The desired instance type and desired number of replicas of each index
     *         partition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateScalingParametersRequest withScalingParameters(ScalingParameters scalingParameters) {
        this.scalingParameters = scalingParameters;
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
        if (getScalingParameters() != null) sb.append("ScalingParameters: " + getScalingParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getScalingParameters() == null) ? 0 : getScalingParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateScalingParametersRequest == false) return false;
        UpdateScalingParametersRequest other = (UpdateScalingParametersRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getScalingParameters() == null ^ this.getScalingParameters() == null) return false;
        if (other.getScalingParameters() != null && other.getScalingParameters().equals(this.getScalingParameters()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateScalingParametersRequest clone() {
        
            return (UpdateScalingParametersRequest) super.clone();
    }

}
    