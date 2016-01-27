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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#describeAvailabilityOptions(DescribeAvailabilityOptionsRequest) DescribeAvailabilityOptions operation}.
 * <p>
 * Gets the availability options configured for a domain. By default,
 * shows the configuration with any pending changes. Set the
 * <code>Deployed</code> option to <code>true</code> to show the active
 * configuration and exclude pending changes. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#describeAvailabilityOptions(DescribeAvailabilityOptionsRequest)
 * @deprecated Use {@link com.amazonaws.services.cloudsearchv2.model.DescribeAvailabilityOptionsRequest} instead.
 */
@Deprecated
public class DescribeAvailabilityOptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain you want to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

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
    public DescribeAvailabilityOptionsRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAvailabilityOptionsRequest == false) return false;
        DescribeAvailabilityOptionsRequest other = (DescribeAvailabilityOptionsRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        return true;
    }
    
}
    